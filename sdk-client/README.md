# sdk-client

Wire4RestAPI
- API version: 1.0.0

 # Referencia de API La API de Wire4 está organizada en torno a REST. Nuestra API tiene URLs predecibles orientadas a los recursos, acepta peticiones en formato JSON, y las respuestas devueltas son formato JSON y utiliza códigos de respuesta HTTP, autenticación y verbos estándares.  Puede usar la API de Wire4 en nuestro entorno de prueba, que no afecta sus productivos ni interactúa con la red bancaria. La URL de conexión que se usa para invocar los servicios determina si la solicitud es en modo en de prueba o en modo producción.    # Autenticación La API de Wire4 utiliza el protocolo OAuth 2.0 para autenticación y autorización.   Para comenzar, es necesario que registre una cuenta en nuestro ambiente de pruebas en [registro](https://app-sndbx.wire4.mx/#/register) y obtenga las credenciales de cliente OAuth 2.0 desde la [consola de administración](https://app-sndbx.wire4.mx/#/dashboard/api-keys).   Esta página ofrece una descripción general de los escenarios de autorización de OAuth 2.0 que admite Wire4.   Después de crear su aplicación con Wire4, asegúrese de tener a la mano su `client_id` y `client_secret`. El siguiente paso es descubrir qué flujo de OAuth2 es el adecuado para sus propósitos.   ## URLS La siguiente tabla muestra las urls de los recursos de autenticación para el ambiente de pruebas.  URL                  | Descripción ------------------------------------ | ------------- https://sandbox-api.wire4.mx/token   | Obtener token de autorización llaves de API (*client_id*, *client_secret*), datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) o (*refresh_token*) https://sandbox-api.wire4.mx/revoke  | Revocación de token  **Nota:** De acuerdo con el RFC 6749, la URL del token sólo acepta el tipo de contenido x-www-form-urlencoded. El contenido JSON no está permitido y devolverá un error.  ## Scopes Los `scopes` limitan el acceso de una aplicación a los recursos de Wire4. Se ofrecen los siguientes scopes:   Scope                    | Descripción ------------------------------------ | ------------- general                              | Permite llamar a operaciones que no requieren a un cliente Monex suscrito en Wire4, los recursos que se pueden consumir con este scope son: consulta de Instituciones, CEP y generación de una presuscripción. spei_admin                           | Permite llamar a operaciones que requieren de un cliente Monex suscrito en Wire4, ya que se proporciona información de saldos, administración de transacciones, cuentas de beneficiarios y cuentas de depositantes. spid_admin                           | Permite llamar sólo a operaciones SPID, se requiere de un cliente Monex suscrito en Wire4. codi_admin                           | Permite llamar sólo a operaciones CoDi. codi_report                          | Permite generar reportes de operaciones CoDi.  ## Tipos de autenticación   Wire4 cuenta con dos tipos de autenticación: Autenticación de Aplicación (OAuth 2.0  Client Credentials Grant)  y Autenticación de Usuario de Aplicación (OAuth 2.0 Password Grant).  ### Autenticación de Aplicación  Esta autenticación se obtiene proporcionando únicamente las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) de la consola de administración.  La autenticación de aplicación sólo permite acceso a los recursos que no requieren una suscripción activa de un cliente Monex en Wire4.  Para este tipo de autenticación se sigue el flujo OAuth 2.0 Client Credentials Grant, que se describe más adelante en **Obtener el token de acceso de aplicación**, con este token se tiene acceso a los siguientes recursos:   * [/subscriptions/pre-subscription](link) * [/institutions](link>) * [/ceps](<link>)   ### Autenticación de Usuario de Aplicación  Esta autenticación se obtiene proporcionando las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) más el ***user_key*** y ***user_secret*** que se proporcionan al momento de crear una suscripción, para más información puedes consultar la guía [creación de suscripción](https://www.wire4.mx/#/guides/subscriptions).  Con este tipo de autenticación se puede acceder a los recursos que proporcionan información de una cuenta Monex como saldos y administración de transacciones, cuentas de beneficiarios y cuentas de depositantes.    ## Obtener token de acceso Antes de que su aplicación pueda acceder a los datos mediante la API de Wire4, debe obtener un token de acceso ***(access_token)*** que le otorgue acceso a la API. En las siguientes secciones se muestra como obtener un token para cada una de las autenticaciones.     ### Obtener el token de acceso para autenticación de aplicación  El primer paso es crear la solicitud de token de acceso (*access_token*), con los parámetros que identifican su aplicación, el siguiente código muestra cómo obtener un `token`.  ``` curl -k -d \"grant_type= client_credentials&scope=general\"  -u \"<client id>:<client secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo:**   ``` curl -k -d \"grant_type=client_credentials&scope=general\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ``` Obtendrá una respuesta como la que se muestra  a continuación, donde se debe obtener el *access_token* para realizar llamadas posteriores a la API.   ``` {     \"access_token\":\"eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w\",    \"scope\":\"am_application_scope general\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 }  ```  Es posible generar tokens con mas de un scope, en caso que sea necesario utilizar dicho token para hacer mas de una operación. Para generarlo basta con agregarlo a la petición separado por un espacio.     ``` curl -k -d \"grant_type=client_credentials&scope=codi_general codi_report\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ```  ### Obtener el token de acceso para autenticación usuario de aplicación   Antes de que su aplicación pueda acceder a los datos de una cuenta Monex mediante la API de Wire4, debe obtener un token de acceso  (*access_token*) que le otorgue acceso a la API y contar con el  *user_key* y *user_secret* que se proporcionan al momento de crear  una suscripción para más información puedes consultar [creación de suscripción](https://wire4.mx/#/guides/subscriptions) .   El primer paso es crear la solicitud de token de acceso con los parámetros que identifican su aplicación y la suscripción y con `scope` `spei_admin`  ```   curl -k -d \"grant_type=password&scope=spei_admin&username=<user_key>&password=<user_secret>\"  -u \"<client_id>:<client_secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo**  ``` curl -k -d \"grant_type=password&scope=spei_admin&username=6 nbC5e99tTO@sandbox.wire4com&password= Nz7IqJGe9h\" -u \" zgMlQbqmOr:plkMJoPXCI\" https://sandbox-api.wire4.mx /token  ```  ``` {     \"access_token\":\"eyJ4NXQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJraWQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMzE0ODRlZTdjZDRkYWU5MzRmMjY2Zjc5YmY1YWFAZGV2LWllc2NhbWlsbGEuc3BlaW9rLmNvbSIsImF1ZCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJuYmYiOjE1NzEzNDk4ODMsImF6cCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJzY29wZSI6InNwZWlfYWRtaW4iLCJpc3MiOiJhcGltLWlkcCIsImV4cCI6MTU3MTM1MzQ4MywiaWF0IjoxNTcxMzQ5ODgzLCJqdGkiOiJiOWQ1M2Q0MC0xN2MwLTQxOTItYjUwNy0wZWFhN2ZkNDA1MGYifQ.hLTk8AFoIce1GpLcgch-U5aLLgiiFTo49wfBErD8D6VF-H9sG13ZyfAx9T-vQkk2m1zPapYVQjwibz3GRAJMN0Vczs6flV1mUJwFDQbEE-AELPdRcaRFOMBCfF6H9TVLfhFsGb9U2pVR9TLJcKqR57DyO_dIcc9I6d0tIkxqn2VcqypLVi5YQf36WzBbPeG-iPHYpMA-bhr4rwfjKA-O6jm1NSSxNHF4sHS0YHDPoO_x6cCc677MQEe0_CozfnQhoEWNfG8tcWUqhPtmcfjqon1p7PdQoXxriq_R85d06pVO9Se7Q6ok0V8Qgz0MOJ6z3ku6mtZSuba7niMAOt2TyA\",    \"refresh_token\":\"f962d5c6-0d99-3809-8275-11c7aa0aa020\",    \"scope\":\"spei_admin\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 } ```  **Nota:** Los ejemplos anteriores se presentan considerando que se realiza una implementación desde cero,  esto se puede simplificar a sólo configurar sus llaves (*client_id*, *client_secret*),  datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) si utiliza nuestros sdks.      ## Caducidad del token El token de acceso es válido durante 60 minutos (una hora), después de transcurrido este tiempo se debe solicitar un nuevo token,  cuando el token caduca se obtendrá un error ***401 Unauthorized*** con mensaje ***“Invalid Credentials”.***   El nuevo token se puede solicitar  utilizando el último token de actualización (***refresh_token***) que se devolvió en la solicitud del token,   esto sólo aplica para el token de tipo password (Autenticación de Usuario de Aplicación). El siguiente ejemplo muestra cómo obtener un toke con el token de actualización.  ``` curl -k -d \"grant_type=refresh_token&refresh_token=<refresh_token>\" -u \" Client_Id:Client_Secret\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/oauth2/token ```  **Ejemplo:**  ``` curl -k -d \"grant_type=refresh_token&refresh_token=f932d5c6-0d39-3809-8275-11c7ax0aa020\" -u \"zgMlQbqmOr:plkMJoPXCI\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/token ```  El token de actualización (***refresh_token***) tiene una duración de hasta 23 horas. Si en este periodo no se utiliza, se tienen que solicitar un nuevo token.  Un token de acceso podría dejar de funcionar por uno de estos motivos:  * El usuario ha revocado el acceso a su aplicación, si un usuario ha solicitado la baja de su aplicación de WIre4. * El token de acceso ha caducado: si el token de acceso ha pasado de una hora, recibirá un error ***401 Unauthorized*** mientras realiza una llamada a la API de Wire4. Cuando esto sucede, debe solicitar un nuevo token utilizando el token de actualización que recibió por última al solicitar un token, sólo aplica si el token en cuestión es de autenticación de usuario de aplicación, en caso contrario solicitar un nuevo token.   ## Revocar token Su aplicación puede revocar mediante programación el token de acceso, una vez revocado el token no podrá hacer uso de él para acceder a la API. El siguiente código muestra un ejemplo de cómo revocar el token:    ```  curl -X POST --basic -u \"<client id>:<client secret>\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=<token to revoke>&token_type_hint=access_token\" https://sandbox-api.wire4.mx/revoke ```      **Ejemplo:**  ```   curl -X POST --basic -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w&token_type_hint=access_token\"  https://sandbox-api.wire4.mx/revoke ```  # Ambientes  Wire4 cuentas con dos ambientes Pruebas (Sandbox) y Producción, son dos ambientes separados los cuales se pueden utilizar simultáneamente. Los usuarios que han sido creados en cada uno de los ambientes no son intercambiables.   Las ligas de acceso a la `api` para cada uno de los ambientes son:  * Pruebas  https://sandbox-api.wire4.mx * Producción https://api.wire4.mx     # Eventos  Los eventos son nuestra forma de informarle cuando algo  sucede en su cuenta. Cuando ocurre un evento se crea un objeto  [Evento](#tag/Webhook-Message). Por ejemplo, cuando se recibe un depósito, se crea un evento TRANSACTION.INCOMING.UPDATED.   Los eventos ocurren cuando cambia el estado de un recurso. El recurso se encuentra dentro del objeto [Evento](#tag/Webhook-Message) en el campo data.  Por ejemplo, un evento TRANSACTION.INCOMING.UPDATED contendrá un depósito y un evento ACCOUNT.CREATED contendrá una cuenta.   Wire4 puede agregar más campos en un futuro, o agregar nuevos valores a campos existentes, por lo que es recomendado que tu endpoint pueda manejar datos adicionales desconocidos. En esta [liga](#tag/Webhook-Message) se encuentra  la definición del objeto [Evento](#tag/Webhook-Message).  ## Tipos de Eventos  Wire4 cuenta con los siguientes tipos de eventos*   | Evento                     | Tipo                               | Objeto                                        | | -------------------------- |----------------------------------- | --------------------------------------------- | | Suscripción                | ENROLLMENT.CREATED                 | [suscription](#tag/subscription)              | | Cuenta de beneficiario     | ACCOUNT.CREATED                    | [beneficiary](#tag/BeneficiaryAccount)        | | Depósito recibido          | TRANSACTION.INCOMING.UPDATED       | [spei_incoming](#tag/deposit)                 | | Transferencia realizada    | TRANSACTION.OUTGOING.RECEIVED      | [spei_outgoing](#tag/transfer)                | | Transferencia SPID enviada | TRANSACTION.OUTGOING.SPID.RECEIVED | [spid_outgoing](#tag/transfer)                | | Transferencias Autorizadas | REQUEST.OUTGOING.CHANGED           | [request_outgoing](#tag/requestOutMsg)        | | Punto de venta CoDi        | SALE.POINT.CREATED                 |


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>mx.wire4.sdk</groupId>
  <artifactId>sdk-client</artifactId>
  <version>0.0.5-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "mx.wire4.sdk:sdk-client:0.0.5-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sdk-client-0.0.5-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import mx.wire4.*;
import mx.wire4.auth.*;
import mx.wire4.model.*;
import mx.wire4.api.ComprobanteElectrnicoDePagoCepApi;

import java.io.File;
import java.util.*;

public class ComprobanteElectrnicoDePagoCepApiExample {

    public static void main(String[] args) {
        
        ComprobanteElectrnicoDePagoCepApi apiInstance = new ComprobanteElectrnicoDePagoCepApi();
        CepSearchBanxico body = new CepSearchBanxico(); // CepSearchBanxico | Información para buscar un CEP
        String authorization = "authorization_example"; // String | Header para token
        try {
            CepResponse result = apiInstance.obtainTransactionCepUsingPOST(body, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComprobanteElectrnicoDePagoCepApi#obtainTransactionCepUsingPOST");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ComprobanteElectrnicoDePagoCepApi* | [**obtainTransactionCepUsingPOST**](docs/ComprobanteElectrnicoDePagoCepApi.md#obtainTransactionCepUsingPOST) | **POST** /ceps | Consulta de CEP
*ContactoApi* | [**sendContactUsingPOST**](docs/ContactoApi.md#sendContactUsingPOST) | **POST** /contact | Solicitud de contacto
*ContractsDetailsApi* | [**createAuthorization**](docs/ContractsDetailsApi.md#createAuthorization) | **POST** /onboarding/accounts/authorize | Devuelve la URL para autorización del usuario Monex
*ContractsDetailsApi* | [**obtainAuthorizedUsers**](docs/ContractsDetailsApi.md#obtainAuthorizedUsers) | **GET** /onboarding/accounts/{requestId}/authorized-users | Obtiene los usuarios autorizados
*ContractsDetailsApi* | [**obtainContractDetails**](docs/ContractsDetailsApi.md#obtainContractDetails) | **POST** /onboarding/accounts/details | Obtiene los detalles de la empresa del contrato
*CuentasDeBeneficiariosSpeiApi* | [**authorizeAccountsPendingPUT**](docs/CuentasDeBeneficiariosSpeiApi.md#authorizeAccountsPendingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/pending | Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas
*CuentasDeBeneficiariosSpeiApi* | [**deleteAccountUsingDELETE**](docs/CuentasDeBeneficiariosSpeiApi.md#deleteAccountUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/{account} | Elimina la cuenta del beneficiario
*CuentasDeBeneficiariosSpeiApi* | [**getAvailableRelationshipsMonexUsingGET**](docs/CuentasDeBeneficiariosSpeiApi.md#getAvailableRelationshipsMonexUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/relationships | Consulta de relaciones
*CuentasDeBeneficiariosSpeiApi* | [**getBeneficiariesByRequestId**](docs/CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesByRequestId) | **GET** /subscriptions/{subscription}/beneficiaries/spei/{requestId} | Consulta los beneficiarios por el identificador de la petición de registro
*CuentasDeBeneficiariosSpeiApi* | [**getBeneficiariesForAccountUsingGET**](docs/CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesForAccountUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spei | Consulta los beneficiarios registrados
*CuentasDeBeneficiariosSpeiApi* | [**preRegisterAccountsUsingPOST**](docs/CuentasDeBeneficiariosSpeiApi.md#preRegisterAccountsUsingPOST) | **POST** /subscriptions/{subscription}/beneficiaries/spei | Pre-registro de cuentas de beneficiarios.
*CuentasDeBeneficiariosSpeiApi* | [**removeBeneficiariesPendingUsingDELETE**](docs/CuentasDeBeneficiariosSpeiApi.md#removeBeneficiariesPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/request/{requestId} | Eliminación de beneficiarios SPEI® sin confirmar
*CuentasDeBeneficiariosSpeiApi* | [**updateAmountLimitAccountUsingPUT**](docs/CuentasDeBeneficiariosSpeiApi.md#updateAmountLimitAccountUsingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/spei/{account} | Actualiza el monto límite
*CuentasDeBeneficiariosSpidApi* | [**getSpidBeneficiariesForAccount**](docs/CuentasDeBeneficiariosSpidApi.md#getSpidBeneficiariesForAccount) | **GET** /subscriptions/{subscription}/beneficiaries/spid | Consulta los beneficiarios SPID registrados
*CuentasDeBeneficiariosSpidApi* | [**preRegisterAccountsUsingPOST1**](docs/CuentasDeBeneficiariosSpidApi.md#preRegisterAccountsUsingPOST1) | **POST** /subscriptions/{subscription}/beneficiaries/spid | Pre-registro de cuentas de beneficiarios SPID
*DepositantesApi* | [**getDepositantsUsingGET**](docs/DepositantesApi.md#getDepositantsUsingGET) | **GET** /subscriptions/{subscription}/depositants | Consulta de cuentas de depositantes
*DepositantesApi* | [**registerDepositantsUsingPOST**](docs/DepositantesApi.md#registerDepositantsUsingPOST) | **POST** /subscriptions/{subscription}/depositants | Registra un nuevo depositante
*EmpresasCoDiApi* | [**obtainCompanies**](docs/EmpresasCoDiApi.md#obtainCompanies) | **GET** /codi/companies | Consulta de empresas CODI
*EmpresasCoDiApi* | [**registerCompanyUsingPOST**](docs/EmpresasCoDiApi.md#registerCompanyUsingPOST) | **POST** /codi/companies | Registro de empresas CODI
*FacturasApi* | [**billingsReportByIdUsingGET**](docs/FacturasApi.md#billingsReportByIdUsingGET) | **GET** /billings/{id} | Consulta de facturas por identificador
*FacturasApi* | [**billingsReportUsingGET**](docs/FacturasApi.md#billingsReportUsingGET) | **GET** /billings | Consulta de facturas
*InstitucionesApi* | [**getAllInstitutionsUsingGET**](docs/InstitucionesApi.md#getAllInstitutionsUsingGET) | **GET** /institutions | Información de instituciones bancarias.
*OperacionesCoDiApi* | [**consultCodiOperations**](docs/OperacionesCoDiApi.md#consultCodiOperations) | **POST** /codi/charges | Obtiene las operaciones generadas a partir de peticiones de pago CoDi® de forma paginada, pudiendo aplicar filtros
*PeticionesDePagoPorCoDiApi* | [**consultCodiRequestByOrderId**](docs/PeticionesDePagoPorCoDiApi.md#consultCodiRequestByOrderId) | **GET** /codi/sales-point/{sales_point_id}/charges/{order_id} | Obtiene la información de una petición de pago CODI® por orderId para un punto de venta
*PeticionesDePagoPorCoDiApi* | [**generateCodiCodeQR**](docs/PeticionesDePagoPorCoDiApi.md#generateCodiCodeQR) | **POST** /codi/sales-point/{salesPointId}/charges | Genera un código QR para un pago mediante CODI®
*PuntosDeVentaCoDiApi* | [**createSalesPoint**](docs/PuntosDeVentaCoDiApi.md#createSalesPoint) | **POST** /codi/companies/{company_id}/salespoint | Registra un punto de venta asociado a una empresa
*PuntosDeVentaCoDiApi* | [**obtainSalePoints**](docs/PuntosDeVentaCoDiApi.md#obtainSalePoints) | **GET** /codi/companies/{company_id}/salespoint | Obtiene los puntos de venta asociados a una empresa
*SaldoApi* | [**getBalanceUsingGET**](docs/SaldoApi.md#getBalanceUsingGET) | **GET** /subscriptions/{subscription}/balance | Consulta los saldo de una cuenta
*SuscripcionesApi* | [**preEnrollmentMonexUserUsingPOST**](docs/SuscripcionesApi.md#preEnrollmentMonexUserUsingPOST) | **POST** /subscriptions/pre-subscription | Registra una pre-suscripción
*SuscripcionesApi* | [**removeEnrollmentUserUsingDELETE**](docs/SuscripcionesApi.md#removeEnrollmentUserUsingDELETE) | **DELETE** /subscriptions/{subscription} | Elimina una suscripción por el identificador de la suscripción
*SuscripcionesApi* | [**removeSubscriptionPendingStatusUsingDELETE**](docs/SuscripcionesApi.md#removeSubscriptionPendingStatusUsingDELETE) | **DELETE** /subscriptions/pre-subscription/{subscription} | Elimina una pre-suscripción
*TransferenciasSpeiApi* | [**createAuthorizationTransactionsGroup**](docs/TransferenciasSpeiApi.md#createAuthorizationTransactionsGroup) | **POST** /subscriptions/{subscription}/transactions/group | Agrupa un conjunto de transacciones bajo un mismo request_id para autorizar
*TransferenciasSpeiApi* | [**dropTransactionsPendingUsingDELETE**](docs/TransferenciasSpeiApi.md#dropTransactionsPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/transactions/outcoming/spei/request/{requestId} | Eliminación de transferencias SPEI® pendientes
*TransferenciasSpeiApi* | [**incomingSpeiTransactionsReportUsingGET**](docs/TransferenciasSpeiApi.md#incomingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/incoming/spei | Consulta de transferencias recibidas
*TransferenciasSpeiApi* | [**outCommingSpeiRequestIdTransactionsReportUsingGET**](docs/TransferenciasSpeiApi.md#outCommingSpeiRequestIdTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei/{requestId} | Consulta de transferencias de salida por identificador de petición
*TransferenciasSpeiApi* | [**outgoingSpeiTransactionsReportUsingGET**](docs/TransferenciasSpeiApi.md#outgoingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei | Consulta de transferencias realizadas
*TransferenciasSpeiApi* | [**registerOutgoingSpeiTransactionUsingPOST**](docs/TransferenciasSpeiApi.md#registerOutgoingSpeiTransactionUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming/spei | Registro de transferencias
*TransferenciasSpidApi* | [**getSpidClassificationsUsingGET**](docs/TransferenciasSpidApi.md#getSpidClassificationsUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spid/classifications | Consulta las clasificaciones para operaciones con SPID
*TransferenciasSpidApi* | [**registerOutgoingSpidTransactionUsingPOST**](docs/TransferenciasSpidApi.md#registerOutgoingSpidTransactionUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming/spid | Registro de transferencias SPID
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{id} | Consulta de Webhook
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Consulta de Webhooks
*WebhooksApi* | [**registerWebhook**](docs/WebhooksApi.md#registerWebhook) | **POST** /webhooks | Alta de Webhook

## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountDetail](docs/AccountDetail.md)
 - [AccountReassigned](docs/AccountReassigned.md)
 - [AccountRequest](docs/AccountRequest.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountSpid](docs/AccountSpid.md)
 - [AddressCompany](docs/AddressCompany.md)
 - [AmountRequest](docs/AmountRequest.md)
 - [AuthorizationTransactionGroup](docs/AuthorizationTransactionGroup.md)
 - [AuthorizedBeneficiariesResponse](docs/AuthorizedBeneficiariesResponse.md)
 - [AuthorizedUsers](docs/AuthorizedUsers.md)
 - [Balance](docs/Balance.md)
 - [BalanceListResponse](docs/BalanceListResponse.md)
 - [BeneficiariesQueryRegisterStatus](docs/BeneficiariesQueryRegisterStatus.md)
 - [BeneficiariesResponse](docs/BeneficiariesResponse.md)
 - [BeneficiaryInstitution](docs/BeneficiaryInstitution.md)
 - [Billing](docs/Billing.md)
 - [BillingTransaction](docs/BillingTransaction.md)
 - [CepResponse](docs/CepResponse.md)
 - [CepSearchBanxico](docs/CepSearchBanxico.md)
 - [CertificateRequest](docs/CertificateRequest.md)
 - [CodiCodeQrResponseDTO](docs/CodiCodeQrResponseDTO.md)
 - [CodiCodeRequestDTO](docs/CodiCodeRequestDTO.md)
 - [CodiOperationsFiltersRequestDTO](docs/CodiOperationsFiltersRequestDTO.md)
 - [CompanyRegistered](docs/CompanyRegistered.md)
 - [CompanyRequested](docs/CompanyRequested.md)
 - [Compay](docs/Compay.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContractDetailRequest](docs/ContractDetailRequest.md)
 - [ContractDetailResponse](docs/ContractDetailResponse.md)
 - [Deposit](docs/Deposit.md)
 - [Depositant](docs/Depositant.md)
 - [DepositantsRegister](docs/DepositantsRegister.md)
 - [DepositantsResponse](docs/DepositantsResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GetDepositants](docs/GetDepositants.md)
 - [Institution](docs/Institution.md)
 - [InstitutionsList](docs/InstitutionsList.md)
 - [MessageAccountBeneficiary](docs/MessageAccountBeneficiary.md)
 - [MessageCEP](docs/MessageCEP.md)
 - [MessageDepositReceived](docs/MessageDepositReceived.md)
 - [MessageInstitution](docs/MessageInstitution.md)
 - [MessagePayment](docs/MessagePayment.md)
 - [MessagePaymentStatePending](docs/MessagePaymentStatePending.md)
 - [MessageRequestChanged](docs/MessageRequestChanged.md)
 - [MessageSubscription](docs/MessageSubscription.md)
 - [MessageWebHook](docs/MessageWebHook.md)
 - [Operations](docs/Operations.md)
 - [PagerResponseDto](docs/PagerResponseDto.md)
 - [Payment](docs/Payment.md)
 - [PaymentRequestCodiResponseDTO](docs/PaymentRequestCodiResponseDTO.md)
 - [PaymentsRequestId](docs/PaymentsRequestId.md)
 - [Person](docs/Person.md)
 - [PreEnrollmentData](docs/PreEnrollmentData.md)
 - [PreEnrollmentResponse](docs/PreEnrollmentResponse.md)
 - [PreMonexAuthorization](docs/PreMonexAuthorization.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipsResponse](docs/RelationshipsResponse.md)
 - [SalesPoint](docs/SalesPoint.md)
 - [SalesPointFound](docs/SalesPointFound.md)
 - [SalesPointRequest](docs/SalesPointRequest.md)
 - [SalesPointRespose](docs/SalesPointRespose.md)
 - [SpidBeneficiariesResponse](docs/SpidBeneficiariesResponse.md)
 - [SpidBeneficiaryResponse](docs/SpidBeneficiaryResponse.md)
 - [SpidClassificationDTO](docs/SpidClassificationDTO.md)
 - [SpidClassificationsResponseDTO](docs/SpidClassificationsResponseDTO.md)
 - [TokenRequiredResponse](docs/TokenRequiredResponse.md)
 - [TransactionOutgoing](docs/TransactionOutgoing.md)
 - [TransactionOutgoingSpid](docs/TransactionOutgoingSpid.md)
 - [TransactionsOutgoingRegister](docs/TransactionsOutgoingRegister.md)
 - [UrlsRedirect](docs/UrlsRedirect.md)
 - [UserCompany](docs/UserCompany.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhooksList](docs/WebhooksList.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


