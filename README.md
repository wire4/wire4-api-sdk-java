# wire4_sdk

Wire4SDK - paquetes de Java para el API Rest de Wire4

Referencia del SDK para el consumo del API de Wire4

Este SDK es hecho y distrubuido por Wire4:

- Versión del API de Wire4: 1.1.1
- Versión de los paquetes SDK: 1.1.1

## Requerimientos.

La compilación de la librería SDK requiere:

1. Java 1.7+
2. Maven/Gradle

## <a name="installation"></a>Instalación y Uso
### Instalación

Después de clonar el repositorio Git. Para instalar la librería SDK de Wire4 en tu repositorio local Maven, simplemente ejecuta:

```sh
cd wire4-api-sdk
mvn clean install
```

Para desplegarlo a un repositorio Maven remoto, configura los valores del repositorio y ejecuta:
```sh
cd wire4-api-sdk
mvn clean deploy
```

Para mayor información consulta [OSSRH Guía](http://central.sonatype.org/pages/ossrh-guide.html).

### Usuarios Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>mx.wire4.sdk</groupId>
  <artifactId>wire4-api-sdk</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Usuarios Gradle

Agregar está dependencia al tu archivo de compilación `build` de tu proyecto:

```groovy
compile "mx.wire4.sdk:wire4-api-sdk:1.1.0"
```

### Manualmente

Primero se generan los archivos `JAR` ejecutando:

```shell
cd wire4-api-sdk
mvn clean package
```

Después manualmente hay que instalar los `JARs` en tu proyecto:

* `target/wire4-api-sdk-1.1.0.jar`
* `target/lib/*.jar`

## Change log

* Se corrigió error en el manejo de tokens por el ApiClient al usarse en ambiente multi hilos

## Para comenzar a usar

Primero debes seguir la guía de [instalación](#installation) y ejecutar el siguiente código de ejemplo:
```java
        // Create the api component
        final ComprobanteElectrnicoDePagoCepApi api = new ComprobanteElectrnicoDePagoCepApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET,
                                            mx.wire4.core.EnvironmentEnum.SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final CepSearchBanxico body = new CepSearchBanxico()
                .amount(new BigDecimal("8963.25"))
                .beneficiaryAccount("072680004657656853")
                .beneficiaryBankKey("40072")
                .claveRastreo("58735618")
                .operationDate("05-12-2018")
                .reference("1122334")
                .senderAccount("112680000156896531")
                .senderBankKey("40112");

        try {

            // Obtain the response
            final CepResponse response = api.obtainTransactionCepUsingPOST( body, bearer);

            System.out.println("CEP:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

```

### Ejemplo de deserialización de mensaje WebHook de Wire4

Nota adicional, para usar las clases que provee el SDK de Wire4 para la deserialización de los mensajes que manda por WebHook Wire4 a su aplicación, lo más sencillo es usar las clases, recursos y métodos que provee el SDK de Wire4, como se muestra en el siguiente ejemplo, aunque siempre es posible crear sus propias implementaciones extras a este SDK.
```java
    @PostMapping(value = "webhook-listener",
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE,
                 headers = "Accept=" + MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> receiveNotificationFromWire4(@RequestBody String body) {

        final java.lang.reflect.Type localVarReturnType = new com.google.gson.reflect.TypeToken<mx.wire4.model.MessageWebHook>(){}.getType();
        final mx.wire4.model.MessageWebHook notification = new mx.wire4.JSON().deserialize(body, localVarReturnType);

        log.info("Notification: {}", notification);
        notification.setData(this.rebuildDataObjectFromMsg(notification.getData(), notification.getObject()));

        log.info("Notification.getData().getClass(): {}", notification.getData().getClass());

        validateMonexNotification(notification);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Validación de la deserialización de los objetos JSON recibidos como parámetros.
     *
     * @param notification
     *      el objeto DTO que se espera recibir para el evento.
     * @param <T>
     *      El tipo del DTO que se espera recibir.
     */
    private <T> void validateMonexNotification(final T notification) {

        final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        final Validator validator = factory.getValidator();

        final Set<ConstraintViolation<T>> violations = validator.validate(notification);
        if (!violations.isEmpty()) {

            throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
        }
    }

    /**
     * Convierte la data en el mensaje al objeto original. Para el envío correcto en los reintentos.
     *
     * @param dataOrigin
     *      el objeto origen, generalmente un LinkedMap.
     * @param objectDescMsg
     *      la descripción del tipo de mensaje WebHook.
     *
     * @return
     *      el objeto correspondiente al tipo de mensaje WebHook.
     */
    public Object rebuildDataObjectFromMsg(final Object dataOrigin, final String objectDescMsg) {

        final mx.wire4.JSON wire4ObjectMapper = new mx.wire4.JSON();
        Object resultData = dataOrigin;
        final String dataStr =  wire4ObjectMapper.serialize(dataOrigin);
        if (dataStr != null) {

            if (StringUtils.equals(objectDescMsg, "spei_incoming")) {

                final java.lang.reflect.Type localVarReturnType = new com.google.gson.reflect.TypeToken<mx.wire4.model.MessageDepositReceived>(){}.getType();
                resultData = wire4ObjectMapper.deserialize(dataStr, localVarReturnType);
            } else if (StringUtils.equals(objectDescMsg, "spei_outgoing") ||
                    StringUtils.equals(objectDescMsg, "spid_outgoing")) {

                final java.lang.reflect.Type localVarReturnType = new com.google.gson.reflect.TypeToken<mx.wire4.model.MessagePayment>(){}.getType();
                resultData = wire4ObjectMapper.deserialize(dataStr, localVarReturnType);
            } else if (StringUtils.equals(objectDescMsg, "beneficiary")) {

                final java.lang.reflect.Type localVarReturnType = new com.google.gson.reflect.TypeToken<mx.wire4.model.MessageAccountBeneficiary>(){}.getType();
                resultData = wire4ObjectMapper.deserialize(dataStr, localVarReturnType);
            } else if (StringUtils.equals(objectDescMsg, "subscription")) {

                final java.lang.reflect.Type localVarReturnType = new com.google.gson.reflect.TypeToken<mx.wire4.model.MessageSubscription>(){}.getType();
                resultData = wire4ObjectMapper.deserialize(dataStr, localVarReturnType);
            }
        }

        return resultData;
    }
```
