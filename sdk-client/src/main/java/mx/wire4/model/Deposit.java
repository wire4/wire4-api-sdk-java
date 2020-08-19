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
import mx.wire4.model.MessageCEP;
import mx.wire4.model.MessageInstitution;
/**
 * Deposit
 */


public class Deposit {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("beneficiary_rfc")
  private String beneficiaryRfc = null;

  @SerializedName("cep")
  private MessageCEP cep = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("confirm_date")
  private OffsetDateTime confirmDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("deposit_date")
  private OffsetDateTime depositDate = null;

  @SerializedName("depositant")
  private String depositant = null;

  @SerializedName("depositant_clabe")
  private String depositantClabe = null;

  @SerializedName("depositant_email")
  private String depositantEmail = null;

  @SerializedName("depositant_rfc")
  private String depositantRfc = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("monex_description")
  private String monexDescription = null;

  @SerializedName("monex_transaction_id")
  private String monexTransactionId = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sender_account")
  private String senderAccount = null;

  @SerializedName("sender_bank")
  private MessageInstitution senderBank = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  public Deposit amount(BigDecimal amount) {
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

  public Deposit beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * La cuenta del beneficiario
   * @return beneficiaryAccount
  **/
  @Schema(description = "La cuenta del beneficiario")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public Deposit beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * El nombre del beneficiario
   * @return beneficiaryName
  **/
  @Schema(description = "El nombre del beneficiario")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public Deposit beneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
    return this;
  }

   /**
   * El RFC del beneficiario
   * @return beneficiaryRfc
  **/
  @Schema(description = "El RFC del beneficiario")
  public String getBeneficiaryRfc() {
    return beneficiaryRfc;
  }

  public void setBeneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
  }

  public Deposit cep(MessageCEP cep) {
    this.cep = cep;
    return this;
  }

   /**
   * Get cep
   * @return cep
  **/
  @Schema(description = "")
  public MessageCEP getCep() {
    return cep;
  }

  public void setCep(MessageCEP cep) {
    this.cep = cep;
  }

  public Deposit claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * La clave de rastreo de la transferencia
   * @return claveRastreo
  **/
  @Schema(description = "La clave de rastreo de la transferencia")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public Deposit confirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
    return this;
  }

   /**
   * Fecha de confirmación del deposito
   * @return confirmDate
  **/
  @Schema(description = "Fecha de confirmación del deposito")
  public OffsetDateTime getConfirmDate() {
    return confirmDate;
  }

  public void setConfirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
  }

  public Deposit currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Código de moneda de la transferencia
   * @return currencyCode
  **/
  @Schema(description = "Código de moneda de la transferencia")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Deposit depositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
    return this;
  }

   /**
   * Fecha del deposito
   * @return depositDate
  **/
  @Schema(description = "Fecha del deposito")
  public OffsetDateTime getDepositDate() {
    return depositDate;
  }

  public void setDepositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
  }

  public Deposit depositant(String depositant) {
    this.depositant = depositant;
    return this;
  }

   /**
   * Depositante
   * @return depositant
  **/
  @Schema(description = "Depositante")
  public String getDepositant() {
    return depositant;
  }

  public void setDepositant(String depositant) {
    this.depositant = depositant;
  }

  public Deposit depositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
    return this;
  }

   /**
   * Cuenta CLABE interbancaria del depositante
   * @return depositantClabe
  **/
  @Schema(description = "Cuenta CLABE interbancaria del depositante")
  public String getDepositantClabe() {
    return depositantClabe;
  }

  public void setDepositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
  }

  public Deposit depositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
    return this;
  }

   /**
   * Email del depositante
   * @return depositantEmail
  **/
  @Schema(description = "Email del depositante")
  public String getDepositantEmail() {
    return depositantEmail;
  }

  public void setDepositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
  }

  public Deposit depositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
    return this;
  }

   /**
   * RFC del depositante
   * @return depositantRfc
  **/
  @Schema(description = "RFC del depositante")
  public String getDepositantRfc() {
    return depositantRfc;
  }

  public void setDepositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
  }

  public Deposit description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descripción del traspaso
   * @return description
  **/
  @Schema(description = "Descripción del traspaso")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Deposit monexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
    return this;
  }

   /**
   * Descripción directa de Monex
   * @return monexDescription
  **/
  @Schema(description = "Descripción directa de Monex")
  public String getMonexDescription() {
    return monexDescription;
  }

  public void setMonexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
  }

  public Deposit monexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
    return this;
  }

   /**
   * Identificador de la transferencia en Monex
   * @return monexTransactionId
  **/
  @Schema(description = "Identificador de la transferencia en Monex")
  public String getMonexTransactionId() {
    return monexTransactionId;
  }

  public void setMonexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
  }

  public Deposit reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * La referencia del depósito
   * @return reference
  **/
  @Schema(description = "La referencia del depósito")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Deposit senderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * La cuenta del ordenante
   * @return senderAccount
  **/
  @Schema(description = "La cuenta del ordenante")
  public String getSenderAccount() {
    return senderAccount;
  }

  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }

  public Deposit senderBank(MessageInstitution senderBank) {
    this.senderBank = senderBank;
    return this;
  }

   /**
   * Get senderBank
   * @return senderBank
  **/
  @Schema(description = "")
  public MessageInstitution getSenderBank() {
    return senderBank;
  }

  public void setSenderBank(MessageInstitution senderBank) {
    this.senderBank = senderBank;
  }

  public Deposit senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * El nombre del ordenante
   * @return senderName
  **/
  @Schema(description = "El nombre del ordenante")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public Deposit senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * El RFC del ordenante
   * @return senderRfc
  **/
  @Schema(description = "El RFC del ordenante")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deposit deposit = (Deposit) o;
    return Objects.equals(this.amount, deposit.amount) &&
        Objects.equals(this.beneficiaryAccount, deposit.beneficiaryAccount) &&
        Objects.equals(this.beneficiaryName, deposit.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, deposit.beneficiaryRfc) &&
        Objects.equals(this.cep, deposit.cep) &&
        Objects.equals(this.claveRastreo, deposit.claveRastreo) &&
        Objects.equals(this.confirmDate, deposit.confirmDate) &&
        Objects.equals(this.currencyCode, deposit.currencyCode) &&
        Objects.equals(this.depositDate, deposit.depositDate) &&
        Objects.equals(this.depositant, deposit.depositant) &&
        Objects.equals(this.depositantClabe, deposit.depositantClabe) &&
        Objects.equals(this.depositantEmail, deposit.depositantEmail) &&
        Objects.equals(this.depositantRfc, deposit.depositantRfc) &&
        Objects.equals(this.description, deposit.description) &&
        Objects.equals(this.monexDescription, deposit.monexDescription) &&
        Objects.equals(this.monexTransactionId, deposit.monexTransactionId) &&
        Objects.equals(this.reference, deposit.reference) &&
        Objects.equals(this.senderAccount, deposit.senderAccount) &&
        Objects.equals(this.senderBank, deposit.senderBank) &&
        Objects.equals(this.senderName, deposit.senderName) &&
        Objects.equals(this.senderRfc, deposit.senderRfc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryAccount, beneficiaryName, beneficiaryRfc, cep, claveRastreo, confirmDate, currencyCode, depositDate, depositant, depositantClabe, depositantEmail, depositantRfc, description, monexDescription, monexTransactionId, reference, senderAccount, senderBank, senderName, senderRfc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deposit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    depositDate: ").append(toIndentedString(depositDate)).append("\n");
    sb.append("    depositant: ").append(toIndentedString(depositant)).append("\n");
    sb.append("    depositantClabe: ").append(toIndentedString(depositantClabe)).append("\n");
    sb.append("    depositantEmail: ").append(toIndentedString(depositantEmail)).append("\n");
    sb.append("    depositantRfc: ").append(toIndentedString(depositantRfc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monexDescription: ").append(toIndentedString(monexDescription)).append("\n");
    sb.append("    monexTransactionId: ").append(toIndentedString(monexTransactionId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    senderAccount: ").append(toIndentedString(senderAccount)).append("\n");
    sb.append("    senderBank: ").append(toIndentedString(senderBank)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderRfc: ").append(toIndentedString(senderRfc)).append("\n");
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
