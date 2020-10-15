/*
 * Wire4RestAPI
 *  # Referencia de API La API de Wire4 está organizada en torno a REST. Nuestra API tiene URLs predecibles orientadas a los recursos, acepta peticiones en formato JSON, y las respuestas devueltas son formato JSON y utiliza códigos de respuesta HTTP, autenticación y verbos estándares.  Puede usar la API de Wire4 en nuestro entorno de prueba, que no afecta sus productivos ni interactúa con la red bancaria. La URL de conexión que se usa para invocar los servicios determina si la solicitud es en modo en de prueba o en modo producción.    # Autenticación La API de Wire4 utiliza el protocolo OAuth 2.0 para autenticación y autorización.   Para comenzar, es necesario que registre una cuenta en nuestro ambiente de pruebas en [registro](https://app-sndbx.wire4.mx/#/register) y obtenga las credenciales de cliente OAuth 2.0 desde la [consola de administración](https://app-sndbx.wire4.mx/#/dashboard/api-keys).   Esta página ofrece una descripción general de los escenarios de autorización de OAuth 2.0 que admite Wire4.   Después de crear su aplicación con Wire4, asegúrese de tener a la mano su `client_id` y `client_secret`. El siguiente paso es descubrir qué flujo de OAuth2 es el adecuado para sus propósitos.   ## URLS La siguiente tabla muestra las urls de los recursos de autenticación para el ambiente de pruebas.  URL                  | Descripción ------------------------------------ | ------------- https://sandbox-api.wire4.mx/token   | Obtener token de autorización llaves de API (*client_id*, *client_secret*), datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) o (*refresh_token*) https://sandbox-api.wire4.mx/revoke  | Revocación de token  **Nota:** De acuerdo con el RFC 6749, la URL del token sólo acepta el tipo de contenido x-www-form-urlencoded. El contenido JSON no está permitido y devolverá un error.  ## Scopes Los `scopes` limitan el acceso de una aplicación a los recursos de Wire4. Se ofrecen los siguientes scopes de acuerdo al producto:  Producto                             |Scope                      | Descripción -------------------------------------|------------------------------------ | ------------- SPEI-SPID                            |general                              | Permite llamar a operaciones que no requieren a un cliente Monex suscrito en Wire4, los recursos que se pueden consumir con este scope son: consulta de Instituciones, CEP y generación de una presuscripción. SPEI-SPID                            |spei_admin                           | Permite llamar a operaciones que requieren de un cliente Monex suscrito en Wire4, ya que se proporciona información de saldos, administración de transacciones, cuentas de beneficiarios y cuentas de depositantes. SPEI-SPID                            |spid_admin                           | Permite llamar sólo a operaciones SPID, se requiere de un cliente Monex suscrito en Wire4. CODI                                 |codi_general                         | Permite llamar a operaciones de administración sobre el producto CoDi, como creación y listado de empresas  CODI                                 |codi_admin                           | Permite llamar sólo a operaciones CoDi dentro de un punto de venta, las operaciones incluyen creación, consulta, listado, etc de peticiones de pago CODI                                 |codi_report                          | Permite generar reportes de operaciones CoDi. TODOS                                |device_[dispositivo]                 | Se debe especificar cuando se gestionan token's desde distintos dispositivos.  ## Tipos de autenticación   Wire4 cuenta con dos tipos de autenticación: Autenticación de Aplicación (OAuth 2.0  Client Credentials Grant)  y Autenticación de Usuario de Aplicación (OAuth 2.0 Password Grant).  ### Autenticación de Aplicación  Esta autenticación se obtiene proporcionando únicamente las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) de la consola de administración.  La autenticación de aplicación permite accesso a recursos generales y de administración que dependeran del scope.  Para este tipo de autenticación se sigue el flujo OAuth 2.0 Client Credentials Grant, que se describe más adelante en **Obtener el token de acceso de aplicación**, algunos de los recursos que requieren este tipo de autenticación son:   * [/subscriptions/pre-subscription](link) * [/institutions](link>) * [/ceps](<link>) * [/codi/compaies](<link>)  ### Autenticación de Usuario de Aplicación  Esta autenticación se obtiene proporcionando las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) más el ***user_key*** y ***user_secret*** que se proporcionan al momento de crear una suscripción o un punto de venta, para más información puedes consultar las guías [creación de suscripción](https://www.wire4.mx/#/guides/subscriptions), [creación de punto de venta](https://www.wire4.mx/#/guides/salespoint).  Con este tipo de autenticación se puede acceder a los recursos especificos que requieren configuraciones y acceso mas puntual como información de una cuentas, saldos y administración de transacciones SPEID-SPID o CODI.    ## Obtener token de acceso Antes de que su aplicación pueda acceder a los datos mediante la API de Wire4, debe obtener un token de acceso ***(access_token)*** que le otorgue acceso a la API. En las siguientes secciones se muestra como obtener un token para cada una de las autenticaciones.     ### Obtener el token de acceso para autenticación de aplicación  El primer paso es crear la solicitud de token de acceso (*access_token*), con los parámetros que identifican su aplicación, el siguiente código muestra cómo obtener un `token`.  ``` curl -k -d \"grant_type= client_credentials&scope=general\"  -u \"<client id>:<client secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo:**   ``` curl -k -d \"grant_type=client_credentials&scope=general\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ``` Obtendrá una respuesta como la que se muestra  a continuación, donde se debe obtener el *access_token* para realizar llamadas posteriores a la API.   ``` {     \"access_token\":\"eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w\",    \"scope\":\"am_application_scope general\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 }  ```  Es posible generar tokens con mas de un scope, en caso que sea necesario utilizar dicho token para hacer mas de una operación. Para generarlo basta con agregarlo a la petición separado por un espacio.     ``` curl -k -d \"grant_type=client_credentials&scope=codi_general codi_report\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ```  ### Obtener el token de acceso para autenticación usuario de aplicación   Antes de que su aplicación pueda acceder a los datos de una cuenta Monex mediante la API de Wire4, debe obtener un token de acceso  (*access_token*) que le otorgue acceso a la API y contar con el  *user_key* y *user_secret* que se proporcionan al momento de crear  una suscripción para más información puedes consultar [creación de suscripción](https://wire4.mx/#/guides/subscriptions) .   El primer paso es crear la solicitud de token de acceso con los parámetros que identifican su aplicación y la suscripción y con `scope` `spei_admin`  ```   curl -k -d \"grant_type=password&scope=spei_admin&username=<user_key>&password=<user_secret>\"  -u \"<client_id>:<client_secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo**  ``` curl -k -d \"grant_type=password&scope=spei_admin&username=6 nbC5e99tTO@sandbox.wire4com&password= Nz7IqJGe9h\" -u \" zgMlQbqmOr:plkMJoPXCI\" https://sandbox-api.wire4.mx /token  ```  ``` {     \"access_token\":\"eyJ4NXQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJraWQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMzE0ODRlZTdjZDRkYWU5MzRmMjY2Zjc5YmY1YWFAZGV2LWllc2NhbWlsbGEuc3BlaW9rLmNvbSIsImF1ZCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJuYmYiOjE1NzEzNDk4ODMsImF6cCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJzY29wZSI6InNwZWlfYWRtaW4iLCJpc3MiOiJhcGltLWlkcCIsImV4cCI6MTU3MTM1MzQ4MywiaWF0IjoxNTcxMzQ5ODgzLCJqdGkiOiJiOWQ1M2Q0MC0xN2MwLTQxOTItYjUwNy0wZWFhN2ZkNDA1MGYifQ.hLTk8AFoIce1GpLcgch-U5aLLgiiFTo49wfBErD8D6VF-H9sG13ZyfAx9T-vQkk2m1zPapYVQjwibz3GRAJMN0Vczs6flV1mUJwFDQbEE-AELPdRcaRFOMBCfF6H9TVLfhFsGb9U2pVR9TLJcKqR57DyO_dIcc9I6d0tIkxqn2VcqypLVi5YQf36WzBbPeG-iPHYpMA-bhr4rwfjKA-O6jm1NSSxNHF4sHS0YHDPoO_x6cCc677MQEe0_CozfnQhoEWNfG8tcWUqhPtmcfjqon1p7PdQoXxriq_R85d06pVO9Se7Q6ok0V8Qgz0MOJ6z3ku6mtZSuba7niMAOt2TyA\",    \"refresh_token\":\"f962d5c6-0d99-3809-8275-11c7aa0aa020\",    \"scope\":\"spei_admin\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 } ```  **Nota:** Los ejemplos anteriores se presentan considerando que se realiza una implementación desde cero,  esto se puede simplificar a sólo configurar sus llaves (*client_id*, *client_secret*),  datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) si utiliza nuestros sdks.      **Consideraci&oacute;n:** Si la aplicaci&oacute;n en la que implementar&aacute; Wire4 estar&aacute; desplegada en mas de una instancia o servidor en cada solicitud de token debe especificar un scope adicional. La forma de hacer esto es que cuando se solicita un token se debe especificar un scope adicional con el prefijo \"device_\" +  el dispositivo, por ejemplo:                                                                                                                                                                                                                     device_server1<br> device_server2  en consecuencia cada instancia debe operar con el token gestionado. ***Si se opera con el mismo token en instancias diferentes encontrará problemas de Credenciales Inv&aacute;lidas.***  **Ejemplo de solicitud de token para instancias diferentes:**  ``` curl -k -d \"grant_type=password&username=0883b97333046abb76367698b57d9e@sandbox.wire4.mx&password=9e0d81f95705079b9fe1e129315c25&scope=device_server1 codi_admin\" -H \"Authorization: Basic dmZSeURpTHdFbVZqd2VIclp0OWRMbXFmb3YwYTpJQJBuamBac3V6SllLWlJHUkJEYUZrN1BhRmNh\" https://sandbox-api.wire4.mx/token  curl -k -d \"grant_type=password&username=0883b97333046abb76367698b57d9e@sandbox.wire4.mx&password=9e0d81f95705079b9fe1e129315c25&scope=device_server2 codi_admin\" -H \"Authorization: Basic dmZSeURpTHdFbVZqd2VIclp0OWRMbXFmb3YwYTpJQJBuamBac3V6SllLWlJHUkJEYUZrN1BhRmNh\" https://sandbox-api.wire4.mx/token ```  ## Caducidad del token El token de acceso es válido durante 60 minutos (una hora), después de transcurrido este tiempo se debe solicitar un nuevo token,  cuando el token caduca se obtendrá un error ***401 Unauthorized*** con mensaje ***“Invalid Credentials”.***   El nuevo token se puede solicitar  utilizando el último token de actualización (***refresh_token***) que se devolvió en la solicitud del token,   esto sólo aplica para el token de tipo password (Autenticación de Usuario de Aplicación). El siguiente ejemplo muestra cómo obtener un toke con el token de actualización.  ``` curl -k -d \"grant_type=refresh_token&refresh_token=<refresh_token>\" -u \" Client_Id:Client_Secret\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/oauth2/token ```  **Ejemplo:**  ``` curl -k -d \"grant_type=refresh_token&refresh_token=f932d5c6-0d39-3809-8275-11c7ax0aa020\" -u \"zgMlQbqmOr:plkMJoPXCI\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/token ```  El token de actualización (***refresh_token***) tiene una duración de hasta 23 horas. Si en este periodo no se utiliza, se tienen que solicitar un nuevo token.  Un token de acceso podría dejar de funcionar por uno de estos motivos:  * El usuario ha revocado el acceso a su aplicación, si un usuario ha solicitado la baja de su aplicación de WIre4. * El token de acceso ha caducado: si el token de acceso ha pasado de una hora, recibirá un error ***401 Unauthorized*** mientras realiza una llamada a la API de Wire4. Cuando esto sucede, debe solicitar un nuevo token utilizando el token de actualización que recibió por última al solicitar un token, sólo aplica si el token en cuestión es de autenticación de usuario de aplicación, en caso contrario solicitar un nuevo token.   ## Revocar token Su aplicación puede revocar mediante programación el token de acceso, una vez revocado el token no podrá hacer uso de él para acceder a la API. El siguiente código muestra un ejemplo de cómo revocar el token:    ```  curl -X POST --basic -u \"<client id>:<client secret>\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=<token to revoke>&token_type_hint=access_token\" https://sandbox-api.wire4.mx/revoke ```      **Ejemplo:**  ```   curl -X POST --basic -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w&token_type_hint=access_token\"  https://sandbox-api.wire4.mx/revoke ```  # Ambientes  Wire4 cuentas con dos ambientes Pruebas (Sandbox) y Producción, son dos ambientes separados los cuales se pueden utilizar simultáneamente. Los usuarios que han sido creados en cada uno de los ambientes no son intercambiables.   Las ligas de acceso a la `api` para cada uno de los ambientes son:  * Pruebas  https://sandbox-api.wire4.mx * Producción https://api.wire4.mx     # Eventos  Los eventos son nuestra forma de informarle cuando algo  sucede en su cuenta. Cuando ocurre un evento se crea un objeto  [Evento](#tag/Webhook-Message). Por ejemplo, cuando se recibe un depósito, se crea un evento TRANSACTION.INCOMING.UPDATED.   Los eventos ocurren cuando cambia el estado de un recurso. El recurso se encuentra dentro del objeto [Evento](#tag/Webhook-Message) en el campo data.  Por ejemplo, un evento TRANSACTION.INCOMING.UPDATED contendrá un depósito y un evento ACCOUNT.CREATED contendrá una cuenta.   Wire4 puede agregar más campos en un futuro, o agregar nuevos valores a campos existentes, por lo que es recomendado que tu endpoint pueda manejar datos adicionales desconocidos. En esta [liga](#tag/Webhook-Message) se encuentra  la definición del objeto [Evento](#tag/Webhook-Message).  ## Tipos de Eventos  Wire4 cuenta con los siguientes tipos de eventos*   | Evento                     | Tipo                               | Objeto                                        | | -------------------------- |----------------------------------- | --------------------------------------------- | | Suscripción                | ENROLLMENT.CREATED                 | [suscription](#tag/subscription)              | | Cuenta de beneficiario     | ACCOUNT.CREATED                    | [beneficiary](#tag/BeneficiaryAccount)           | | Depósito recibido          | TRANSACTION.INCOMING.UPDATED       | [spei_incoming](#tag/deposit)                 | | Transferencia realizada    | TRANSACTION.OUTGOING.RECEIVED      | [spei_outgoing](#tag/transfer)                | | Transferencia SPID enviada | TRANSACTION.OUTGOING.SPID.RECEIVED | [spid_outgoing](#tag/transfer)                | | Transferencias Autorizadas | REQUEST.OUTGOING.CHANGED           | [request_outgoing](#tag/requestOutMsg)        | | Operación CoDi             | CODI.ACTIONS                       |[codi_actions](#tag/codiActions)               | | Punto de venta CoDi        | SALE.POINT.CREATED                 |[codi_sales_point](#tag/codiSalesPoint)        | 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package mx.wire4.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
/**
 * El CEP emitido por Banxico de la transferencia. Solo cuando esté disponible, en otro caso se podrá usar la Consulta de CEP que esta misma API ofrece
 */
@Schema(description = "El CEP emitido por Banxico de la transferencia. Solo cuando esté disponible, en otro caso se podrá usar la Consulta de CEP que esta misma API ofrece")

public class MessageCEP {
  @SerializedName("account_beneficiary")
  private String accountBeneficiary = null;

  @SerializedName("account_sender")
  private String accountSender = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("bank_beneficiary")
  private String bankBeneficiary = null;

  @SerializedName("bank_sender")
  private String bankSender = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("beneficiary_rfc")
  private String beneficiaryRfc = null;

  @SerializedName("cadena_original")
  private String cadenaOriginal = null;

  @SerializedName("capture_date")
  private OffsetDateTime captureDate = null;

  @SerializedName("certificate_serial_number")
  private String certificateSerialNumber = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("iva")
  private BigDecimal iva = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  @SerializedName("operation_date_cep")
  private OffsetDateTime operationDateCep = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("url_zip")
  private String urlZip = null;

  public MessageCEP accountBeneficiary(String accountBeneficiary) {
    this.accountBeneficiary = accountBeneficiary;
    return this;
  }

   /**
   * Cuenta del beneficiario
   * @return accountBeneficiary
  **/
  @Schema(description = "Cuenta del beneficiario")
  public String getAccountBeneficiary() {
    return accountBeneficiary;
  }

  public void setAccountBeneficiary(String accountBeneficiary) {
    this.accountBeneficiary = accountBeneficiary;
  }

  public MessageCEP accountSender(String accountSender) {
    this.accountSender = accountSender;
    return this;
  }

   /**
   * Cuenta que envia la operación
   * @return accountSender
  **/
  @Schema(description = "Cuenta que envia la operación")
  public String getAccountSender() {
    return accountSender;
  }

  public void setAccountSender(String accountSender) {
    this.accountSender = accountSender;
  }

  public MessageCEP amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la operación
   * @return amount
  **/
  @Schema(description = "Monto de la operación")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MessageCEP available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Indica sí el CEP está disponible
   * @return available
  **/
  @Schema(description = "Indica sí el CEP está disponible")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public MessageCEP bankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
    return this;
  }

   /**
   * Clave del banco beneficiario
   * @return bankBeneficiary
  **/
  @Schema(description = "Clave del banco beneficiario")
  public String getBankBeneficiary() {
    return bankBeneficiary;
  }

  public void setBankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
  }

  public MessageCEP bankSender(String bankSender) {
    this.bankSender = bankSender;
    return this;
  }

   /**
   * Clave del banco que envía la operación
   * @return bankSender
  **/
  @Schema(description = "Clave del banco que envía la operación")
  public String getBankSender() {
    return bankSender;
  }

  public void setBankSender(String bankSender) {
    this.bankSender = bankSender;
  }

  public MessageCEP beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Nombre del beneficiario
   * @return beneficiaryName
  **/
  @Schema(description = "Nombre del beneficiario")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public MessageCEP beneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
    return this;
  }

   /**
   * RFC del beneficiario
   * @return beneficiaryRfc
  **/
  @Schema(description = "RFC del beneficiario")
  public String getBeneficiaryRfc() {
    return beneficiaryRfc;
  }

  public void setBeneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
  }

  public MessageCEP cadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
    return this;
  }

   /**
   * Cadena original emita por el SAT
   * @return cadenaOriginal
  **/
  @Schema(description = "Cadena original emita por el SAT")
  public String getCadenaOriginal() {
    return cadenaOriginal;
  }

  public void setCadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
  }

  public MessageCEP captureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * Fecha de captura
   * @return captureDate
  **/
  @Schema(description = "Fecha de captura")
  public OffsetDateTime getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
  }

  public MessageCEP certificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
    return this;
  }

   /**
   * Número de serie emitido por el SAT
   * @return certificateSerialNumber
  **/
  @Schema(description = "Número de serie emitido por el SAT")
  public String getCertificateSerialNumber() {
    return certificateSerialNumber;
  }

  public void setCertificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
  }

  public MessageCEP claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo de la operación
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo de la operación")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public MessageCEP description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descripción de la operación
   * @return description
  **/
  @Schema(description = "Descripción de la operación")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MessageCEP iva(BigDecimal iva) {
    this.iva = iva;
    return this;
  }

   /**
   * IVA de la operación
   * @return iva
  **/
  @Schema(description = "IVA de la operación")
  public BigDecimal getIva() {
    return iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }

  public MessageCEP operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha en la que se realizó la operación
   * @return operationDate
  **/
  @Schema(description = "Fecha en la que se realizó la operación")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public MessageCEP operationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
    return this;
  }

   /**
   * Fecha en la que genera el CEP
   * @return operationDateCep
  **/
  @Schema(description = "Fecha en la que genera el CEP")
  public OffsetDateTime getOperationDateCep() {
    return operationDateCep;
  }

  public void setOperationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
  }

  public MessageCEP reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referencia de la operación
   * @return reference
  **/
  @Schema(description = "Referencia de la operación")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MessageCEP senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Nombre de quién envía la operación
   * @return senderName
  **/
  @Schema(description = "Nombre de quién envía la operación")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public MessageCEP senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * RFC de quién envía la operación
   * @return senderRfc
  **/
  @Schema(description = "RFC de quién envía la operación")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }

  public MessageCEP signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Firma del CEP
   * @return signature
  **/
  @Schema(description = "Firma del CEP")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public MessageCEP urlZip(String urlZip) {
    this.urlZip = urlZip;
    return this;
  }

   /**
   * Dirección URL de descarga del archivo ZIP que contiene el PDF y XML del CEP proporcionado por BANXICO
   * @return urlZip
  **/
  @Schema(description = "Dirección URL de descarga del archivo ZIP que contiene el PDF y XML del CEP proporcionado por BANXICO")
  public String getUrlZip() {
    return urlZip;
  }

  public void setUrlZip(String urlZip) {
    this.urlZip = urlZip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageCEP messageCEP = (MessageCEP) o;
    return Objects.equals(this.accountBeneficiary, messageCEP.accountBeneficiary) &&
        Objects.equals(this.accountSender, messageCEP.accountSender) &&
        Objects.equals(this.amount, messageCEP.amount) &&
        Objects.equals(this.available, messageCEP.available) &&
        Objects.equals(this.bankBeneficiary, messageCEP.bankBeneficiary) &&
        Objects.equals(this.bankSender, messageCEP.bankSender) &&
        Objects.equals(this.beneficiaryName, messageCEP.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, messageCEP.beneficiaryRfc) &&
        Objects.equals(this.cadenaOriginal, messageCEP.cadenaOriginal) &&
        Objects.equals(this.captureDate, messageCEP.captureDate) &&
        Objects.equals(this.certificateSerialNumber, messageCEP.certificateSerialNumber) &&
        Objects.equals(this.claveRastreo, messageCEP.claveRastreo) &&
        Objects.equals(this.description, messageCEP.description) &&
        Objects.equals(this.iva, messageCEP.iva) &&
        Objects.equals(this.operationDate, messageCEP.operationDate) &&
        Objects.equals(this.operationDateCep, messageCEP.operationDateCep) &&
        Objects.equals(this.reference, messageCEP.reference) &&
        Objects.equals(this.senderName, messageCEP.senderName) &&
        Objects.equals(this.senderRfc, messageCEP.senderRfc) &&
        Objects.equals(this.signature, messageCEP.signature) &&
        Objects.equals(this.urlZip, messageCEP.urlZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBeneficiary, accountSender, amount, available, bankBeneficiary, bankSender, beneficiaryName, beneficiaryRfc, cadenaOriginal, captureDate, certificateSerialNumber, claveRastreo, description, iva, operationDate, operationDateCep, reference, senderName, senderRfc, signature, urlZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCEP {\n");
    
    sb.append("    accountBeneficiary: ").append(toIndentedString(accountBeneficiary)).append("\n");
    sb.append("    accountSender: ").append(toIndentedString(accountSender)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    bankBeneficiary: ").append(toIndentedString(bankBeneficiary)).append("\n");
    sb.append("    bankSender: ").append(toIndentedString(bankSender)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    cadenaOriginal: ").append(toIndentedString(cadenaOriginal)).append("\n");
    sb.append("    captureDate: ").append(toIndentedString(captureDate)).append("\n");
    sb.append("    certificateSerialNumber: ").append(toIndentedString(certificateSerialNumber)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationDateCep: ").append(toIndentedString(operationDateCep)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderRfc: ").append(toIndentedString(senderRfc)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    urlZip: ").append(toIndentedString(urlZip)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
