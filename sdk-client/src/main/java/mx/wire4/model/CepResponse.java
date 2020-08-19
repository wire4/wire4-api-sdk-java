/*
 * Wire4RestAPI
 *  # Referencia de API La API de Wire4 está organizada en torno a REST. Nuestra API tiene URLs predecibles orientadas a los recursos, acepta peticiones en formato JSON, y las respuestas devueltas son formato JSON y utiliza códigos de respuesta HTTP, autenticación y verbos estándares.  Puede usar la API de Wire4 en nuestro entorno de prueba, que no afecta sus productivos ni interactúa con la red bancaria. La URL de conexión que se usa para invocar los servicios determina si la solicitud es en modo en de prueba o en modo producción.    # Autenticación La API de Wire4 utiliza el protocolo OAuth 2.0 para autenticación y autorización.   Para comenzar, es necesario que registre una cuenta en nuestro ambiente de pruebas en [registro](https://app-sndbx.wire4.mx/#/register) y obtenga las credenciales de cliente OAuth 2.0 desde la [consola de administración](https://app-sndbx.wire4.mx/#/dashboard/api-keys).   Esta página ofrece una descripción general de los escenarios de autorización de OAuth 2.0 que admite Wire4.   Después de crear su aplicación con Wire4, asegúrese de tener a la mano su `client_id` y `client_secret`. El siguiente paso es descubrir qué flujo de OAuth2 es el adecuado para sus propósitos.   ## URLS La siguiente tabla muestra las urls de los recursos de autenticación para el ambiente de pruebas.  URL                  | Descripción ------------------------------------ | ------------- https://sandbox-api.wire4.mx/token   | Obtener token de autorización llaves de API (*client_id*, *client_secret*), datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) o (*refresh_token*) https://sandbox-api.wire4.mx/revoke  | Revocación de token  **Nota:** De acuerdo con el RFC 6749, la URL del token sólo acepta el tipo de contenido x-www-form-urlencoded. El contenido JSON no está permitido y devolverá un error.  ## Scopes Los `scopes` limitan el acceso de una aplicación a los recursos de Wire4. Se ofrecen los siguientes scopes:   Scope                    | Descripción ------------------------------------ | ------------- general                              | Permite llamar a operaciones que no requieren a un cliente Monex suscrito en Wire4, los recursos que se pueden consumir con este scope son: consulta de Instituciones, CEP y generación de una presuscripción. spei_admin                           | Permite llamar a operaciones que requieren de un cliente Monex suscrito en Wire4, ya que se proporciona información de saldos, administración de transacciones, cuentas de beneficiarios y cuentas de depositantes. spid_admin                           | Permite llamar sólo a operaciones SPID, se requiere de un cliente Monex suscrito en Wire4. codi_admin                           | Permite llamar sólo a operaciones CoDi. codi_report                          | Permite generar reportes de operaciones CoDi.  ## Tipos de autenticación   Wire4 cuenta con dos tipos de autenticación: Autenticación de Aplicación (OAuth 2.0  Client Credentials Grant)  y Autenticación de Usuario de Aplicación (OAuth 2.0 Password Grant).  ### Autenticación de Aplicación  Esta autenticación se obtiene proporcionando únicamente las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) de la consola de administración.  La autenticación de aplicación sólo permite acceso a los recursos que no requieren una suscripción activa de un cliente Monex en Wire4.  Para este tipo de autenticación se sigue el flujo OAuth 2.0 Client Credentials Grant, que se describe más adelante en **Obtener el token de acceso de aplicación**, con este token se tiene acceso a los siguientes recursos:   * [/subscriptions/pre-subscription](link) * [/institutions](link>) * [/ceps](<link>)   ### Autenticación de Usuario de Aplicación  Esta autenticación se obtiene proporcionando las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) más el ***user_key*** y ***user_secret*** que se proporcionan al momento de crear una suscripción, para más información puedes consultar la guía [creación de suscripción](https://www.wire4.mx/#/guides/subscriptions).  Con este tipo de autenticación se puede acceder a los recursos que proporcionan información de una cuenta Monex como saldos y administración de transacciones, cuentas de beneficiarios y cuentas de depositantes.    ## Obtener token de acceso Antes de que su aplicación pueda acceder a los datos mediante la API de Wire4, debe obtener un token de acceso ***(access_token)*** que le otorgue acceso a la API. En las siguientes secciones se muestra como obtener un token para cada una de las autenticaciones.     ### Obtener el token de acceso para autenticación de aplicación  El primer paso es crear la solicitud de token de acceso (*access_token*), con los parámetros que identifican su aplicación, el siguiente código muestra cómo obtener un `token`.  ``` curl -k -d \"grant_type= client_credentials&scope=general\"  -u \"<client id>:<client secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo:**   ``` curl -k -d \"grant_type=client_credentials&scope=general\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ``` Obtendrá una respuesta como la que se muestra  a continuación, donde se debe obtener el *access_token* para realizar llamadas posteriores a la API.   ``` {     \"access_token\":\"eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w\",    \"scope\":\"am_application_scope general\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 }  ```  Es posible generar tokens con mas de un scope, en caso que sea necesario utilizar dicho token para hacer mas de una operación. Para generarlo basta con agregarlo a la petición separado por un espacio.     ``` curl -k -d \"grant_type=client_credentials&scope=codi_general codi_report\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ```  ### Obtener el token de acceso para autenticación usuario de aplicación   Antes de que su aplicación pueda acceder a los datos de una cuenta Monex mediante la API de Wire4, debe obtener un token de acceso  (*access_token*) que le otorgue acceso a la API y contar con el  *user_key* y *user_secret* que se proporcionan al momento de crear  una suscripción para más información puedes consultar [creación de suscripción](https://wire4.mx/#/guides/subscriptions) .   El primer paso es crear la solicitud de token de acceso con los parámetros que identifican su aplicación y la suscripción y con `scope` `spei_admin`  ```   curl -k -d \"grant_type=password&scope=spei_admin&username=<user_key>&password=<user_secret>\"  -u \"<client_id>:<client_secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo**  ``` curl -k -d \"grant_type=password&scope=spei_admin&username=6 nbC5e99tTO@sandbox.wire4com&password= Nz7IqJGe9h\" -u \" zgMlQbqmOr:plkMJoPXCI\" https://sandbox-api.wire4.mx /token  ```  ``` {     \"access_token\":\"eyJ4NXQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJraWQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMzE0ODRlZTdjZDRkYWU5MzRmMjY2Zjc5YmY1YWFAZGV2LWllc2NhbWlsbGEuc3BlaW9rLmNvbSIsImF1ZCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJuYmYiOjE1NzEzNDk4ODMsImF6cCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJzY29wZSI6InNwZWlfYWRtaW4iLCJpc3MiOiJhcGltLWlkcCIsImV4cCI6MTU3MTM1MzQ4MywiaWF0IjoxNTcxMzQ5ODgzLCJqdGkiOiJiOWQ1M2Q0MC0xN2MwLTQxOTItYjUwNy0wZWFhN2ZkNDA1MGYifQ.hLTk8AFoIce1GpLcgch-U5aLLgiiFTo49wfBErD8D6VF-H9sG13ZyfAx9T-vQkk2m1zPapYVQjwibz3GRAJMN0Vczs6flV1mUJwFDQbEE-AELPdRcaRFOMBCfF6H9TVLfhFsGb9U2pVR9TLJcKqR57DyO_dIcc9I6d0tIkxqn2VcqypLVi5YQf36WzBbPeG-iPHYpMA-bhr4rwfjKA-O6jm1NSSxNHF4sHS0YHDPoO_x6cCc677MQEe0_CozfnQhoEWNfG8tcWUqhPtmcfjqon1p7PdQoXxriq_R85d06pVO9Se7Q6ok0V8Qgz0MOJ6z3ku6mtZSuba7niMAOt2TyA\",    \"refresh_token\":\"f962d5c6-0d99-3809-8275-11c7aa0aa020\",    \"scope\":\"spei_admin\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 } ```  **Nota:** Los ejemplos anteriores se presentan considerando que se realiza una implementación desde cero,  esto se puede simplificar a sólo configurar sus llaves (*client_id*, *client_secret*),  datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) si utiliza nuestros sdks.      ## Caducidad del token El token de acceso es válido durante 60 minutos (una hora), después de transcurrido este tiempo se debe solicitar un nuevo token,  cuando el token caduca se obtendrá un error ***401 Unauthorized*** con mensaje ***“Invalid Credentials”.***   El nuevo token se puede solicitar  utilizando el último token de actualización (***refresh_token***) que se devolvió en la solicitud del token,   esto sólo aplica para el token de tipo password (Autenticación de Usuario de Aplicación). El siguiente ejemplo muestra cómo obtener un toke con el token de actualización.  ``` curl -k -d \"grant_type=refresh_token&refresh_token=<refresh_token>\" -u \" Client_Id:Client_Secret\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/oauth2/token ```  **Ejemplo:**  ``` curl -k -d \"grant_type=refresh_token&refresh_token=f932d5c6-0d39-3809-8275-11c7ax0aa020\" -u \"zgMlQbqmOr:plkMJoPXCI\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/token ```  El token de actualización (***refresh_token***) tiene una duración de hasta 23 horas. Si en este periodo no se utiliza, se tienen que solicitar un nuevo token.  Un token de acceso podría dejar de funcionar por uno de estos motivos:  * El usuario ha revocado el acceso a su aplicación, si un usuario ha solicitado la baja de su aplicación de WIre4. * El token de acceso ha caducado: si el token de acceso ha pasado de una hora, recibirá un error ***401 Unauthorized*** mientras realiza una llamada a la API de Wire4. Cuando esto sucede, debe solicitar un nuevo token utilizando el token de actualización que recibió por última al solicitar un token, sólo aplica si el token en cuestión es de autenticación de usuario de aplicación, en caso contrario solicitar un nuevo token.   ## Revocar token Su aplicación puede revocar mediante programación el token de acceso, una vez revocado el token no podrá hacer uso de él para acceder a la API. El siguiente código muestra un ejemplo de cómo revocar el token:    ```  curl -X POST --basic -u \"<client id>:<client secret>\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=<token to revoke>&token_type_hint=access_token\" https://sandbox-api.wire4.mx/revoke ```      **Ejemplo:**  ```   curl -X POST --basic -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w&token_type_hint=access_token\"  https://sandbox-api.wire4.mx/revoke ```  # Ambientes  Wire4 cuentas con dos ambientes Pruebas (Sandbox) y Producción, son dos ambientes separados los cuales se pueden utilizar simultáneamente. Los usuarios que han sido creados en cada uno de los ambientes no son intercambiables.   Las ligas de acceso a la `api` para cada uno de los ambientes son:  * Pruebas  https://sandbox-api.wire4.mx * Producción https://api.wire4.mx     # Eventos  Los eventos son nuestra forma de informarle cuando algo  sucede en su cuenta. Cuando ocurre un evento se crea un objeto  [Evento](#tag/Webhook-Message). Por ejemplo, cuando se recibe un depósito, se crea un evento TRANSACTION.INCOMING.UPDATED.   Los eventos ocurren cuando cambia el estado de un recurso. El recurso se encuentra dentro del objeto [Evento](#tag/Webhook-Message) en el campo data.  Por ejemplo, un evento TRANSACTION.INCOMING.UPDATED contendrá un depósito y un evento ACCOUNT.CREATED contendrá una cuenta.   Wire4 puede agregar más campos en un futuro, o agregar nuevos valores a campos existentes, por lo que es recomendado que tu endpoint pueda manejar datos adicionales desconocidos. En esta [liga](#tag/Webhook-Message) se encuentra  la definición del objeto [Evento](#tag/Webhook-Message).  ## Tipos de Eventos  Wire4 cuenta con los siguientes tipos de eventos*   | Evento                     | Tipo                               | Objeto                                        | | -------------------------- |----------------------------------- | --------------------------------------------- | | Suscripción                | ENROLLMENT.CREATED                 | [suscription](#tag/subscription)              | | Cuenta de beneficiario     | ACCOUNT.CREATED                    | [beneficiary](#tag/BeneficiaryAccount)        | | Depósito recibido          | TRANSACTION.INCOMING.UPDATED       | [spei_incoming](#tag/deposit)                 | | Transferencia realizada    | TRANSACTION.OUTGOING.RECEIVED      | [spei_outgoing](#tag/transfer)                | | Transferencia SPID enviada | TRANSACTION.OUTGOING.SPID.RECEIVED | [spid_outgoing](#tag/transfer)                | | Transferencias Autorizadas | REQUEST.OUTGOING.CHANGED           | [request_outgoing](#tag/requestOutMsg)        | | Punto de venta CoDi        | SALE.POINT.CREATED                 |
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
 * CepResponse
 */


public class CepResponse {
  @SerializedName("account_beneficiary")
  private String accountBeneficiary = null;

  @SerializedName("account_sender")
  private String accountSender = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("beneficiary_bank_key")
  private String beneficiaryBankKey = null;

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

  @SerializedName("sender_bank_key")
  private String senderBankKey = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("url_zip")
  private String urlZip = null;

  public CepResponse accountBeneficiary(String accountBeneficiary) {
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

  public CepResponse accountSender(String accountSender) {
    this.accountSender = accountSender;
    return this;
  }

   /**
   * Cuenta del ordenante
   * @return accountSender
  **/
  @Schema(description = "Cuenta del ordenante")
  public String getAccountSender() {
    return accountSender;
  }

  public void setAccountSender(String accountSender) {
    this.accountSender = accountSender;
  }

  public CepResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la transferencia
   * @return amount
  **/
  @Schema(description = "Monto de la transferencia")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CepResponse available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Indica si o no el CEP se encuentra disponible
   * @return available
  **/
  @Schema(description = "Indica si o no el CEP se encuentra disponible")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public CepResponse beneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
    return this;
  }

   /**
   * Clave del banco beneficiario
   * @return beneficiaryBankKey
  **/
  @Schema(description = "Clave del banco beneficiario")
  public String getBeneficiaryBankKey() {
    return beneficiaryBankKey;
  }

  public void setBeneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
  }

  public CepResponse beneficiaryName(String beneficiaryName) {
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

  public CepResponse beneficiaryRfc(String beneficiaryRfc) {
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

  public CepResponse cadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
    return this;
  }

   /**
   * Cadena original del CEP
   * @return cadenaOriginal
  **/
  @Schema(description = "Cadena original del CEP")
  public String getCadenaOriginal() {
    return cadenaOriginal;
  }

  public void setCadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
  }

  public CepResponse captureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * Fecha de captura de la transferencia
   * @return captureDate
  **/
  @Schema(description = "Fecha de captura de la transferencia")
  public OffsetDateTime getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
  }

  public CepResponse certificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
    return this;
  }

   /**
   * Número de serie del certificado
   * @return certificateSerialNumber
  **/
  @Schema(description = "Número de serie del certificado")
  public String getCertificateSerialNumber() {
    return certificateSerialNumber;
  }

  public void setCertificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
  }

  public CepResponse claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public CepResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descripción de la transferencia
   * @return description
  **/
  @Schema(description = "Descripción de la transferencia")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CepResponse iva(BigDecimal iva) {
    this.iva = iva;
    return this;
  }

   /**
   * IVA de la transferencia
   * @return iva
  **/
  @Schema(description = "IVA de la transferencia")
  public BigDecimal getIva() {
    return iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }

  public CepResponse operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha de operación de la transferencia
   * @return operationDate
  **/
  @Schema(description = "Fecha de operación de la transferencia")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public CepResponse operationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
    return this;
  }

   /**
   * Fecha de abono registrada en el CEP
   * @return operationDateCep
  **/
  @Schema(description = "Fecha de abono registrada en el CEP")
  public OffsetDateTime getOperationDateCep() {
    return operationDateCep;
  }

  public void setOperationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
  }

  public CepResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referencia numérica de la transferencia
   * @return reference
  **/
  @Schema(description = "Referencia numérica de la transferencia")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CepResponse senderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
    return this;
  }

   /**
   * Clave del banco emisor
   * @return senderBankKey
  **/
  @Schema(description = "Clave del banco emisor")
  public String getSenderBankKey() {
    return senderBankKey;
  }

  public void setSenderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
  }

  public CepResponse senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Nombre del emisor
   * @return senderName
  **/
  @Schema(description = "Nombre del emisor")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public CepResponse senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * RFC del emisor
   * @return senderRfc
  **/
  @Schema(description = "RFC del emisor")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }

  public CepResponse signature(String signature) {
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

  public CepResponse urlZip(String urlZip) {
    this.urlZip = urlZip;
    return this;
  }

   /**
   * La url al archivo zip del CEP, el cual contiene el xml y pdf
   * @return urlZip
  **/
  @Schema(description = "La url al archivo zip del CEP, el cual contiene el xml y pdf")
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
    CepResponse cepResponse = (CepResponse) o;
    return Objects.equals(this.accountBeneficiary, cepResponse.accountBeneficiary) &&
        Objects.equals(this.accountSender, cepResponse.accountSender) &&
        Objects.equals(this.amount, cepResponse.amount) &&
        Objects.equals(this.available, cepResponse.available) &&
        Objects.equals(this.beneficiaryBankKey, cepResponse.beneficiaryBankKey) &&
        Objects.equals(this.beneficiaryName, cepResponse.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, cepResponse.beneficiaryRfc) &&
        Objects.equals(this.cadenaOriginal, cepResponse.cadenaOriginal) &&
        Objects.equals(this.captureDate, cepResponse.captureDate) &&
        Objects.equals(this.certificateSerialNumber, cepResponse.certificateSerialNumber) &&
        Objects.equals(this.claveRastreo, cepResponse.claveRastreo) &&
        Objects.equals(this.description, cepResponse.description) &&
        Objects.equals(this.iva, cepResponse.iva) &&
        Objects.equals(this.operationDate, cepResponse.operationDate) &&
        Objects.equals(this.operationDateCep, cepResponse.operationDateCep) &&
        Objects.equals(this.reference, cepResponse.reference) &&
        Objects.equals(this.senderBankKey, cepResponse.senderBankKey) &&
        Objects.equals(this.senderName, cepResponse.senderName) &&
        Objects.equals(this.senderRfc, cepResponse.senderRfc) &&
        Objects.equals(this.signature, cepResponse.signature) &&
        Objects.equals(this.urlZip, cepResponse.urlZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBeneficiary, accountSender, amount, available, beneficiaryBankKey, beneficiaryName, beneficiaryRfc, cadenaOriginal, captureDate, certificateSerialNumber, claveRastreo, description, iva, operationDate, operationDateCep, reference, senderBankKey, senderName, senderRfc, signature, urlZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CepResponse {\n");
    
    sb.append("    accountBeneficiary: ").append(toIndentedString(accountBeneficiary)).append("\n");
    sb.append("    accountSender: ").append(toIndentedString(accountSender)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    beneficiaryBankKey: ").append(toIndentedString(beneficiaryBankKey)).append("\n");
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
    sb.append("    senderBankKey: ").append(toIndentedString(senderBankKey)).append("\n");
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
