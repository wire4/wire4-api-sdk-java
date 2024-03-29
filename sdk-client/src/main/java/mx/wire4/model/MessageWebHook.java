/*
 * Wire4RestAPI
 * Referencia de la API de Wire4
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
import java.time.OffsetDateTime;
/**
 * El objeto que se envía mediante un mensaje WebHook.
 */
@Schema(description = "El objeto que se envía mediante un mensaje WebHook.")


public class MessageWebHook {
  @SerializedName("api_version")
  private String apiVersion = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("data")
  private Object data = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("livemode")
  private Boolean livemode = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("pending_webhooks")
  private Integer pendingWebhooks = null;

  @SerializedName("request")
  private String request = null;

  @SerializedName("type")
  private String type = null;

  public MessageWebHook apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Es la versión de esta API.
   * @return apiVersion
  **/
  @Schema(description = "Es la versión de esta API.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public MessageWebHook created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Fecha de creación del mensaje.
   * @return created
  **/
  @Schema(description = "Fecha de creación del mensaje.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public MessageWebHook data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Es el objeto que contiene la información del evento.
   * @return data
  **/
  @Schema(description = "Es el objeto que contiene la información del evento.")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public MessageWebHook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Es el identificador del mensaje.
   * @return id
  **/
  @Schema(description = "Es el identificador del mensaje.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageWebHook livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indica si proviene de un entorno productivo.
   * @return livemode
  **/
  @Schema(description = "Indica si proviene de un entorno productivo.")
  public Boolean isLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public MessageWebHook object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Tipo de objeto  que contiene el mensaje en el atributo &#x27;data&#x27;. Los posibles valores son:  &lt;ul&gt;&lt;li&gt;subscription&lt;/li&gt;, &lt;li&gt;beneficiary&lt;/li&gt;, &lt;li&gt;spei_outgoing&lt;/li&gt;, &lt;li&gt;spei_incoming&lt;/li&gt;, &lt;li&gt;spid_outgoing&lt;/li&gt;, &lt;li&gt;request_outgoing&lt;/li&gt;&lt;ul&gt; 
   * @return object
  **/
  @Schema(description = "Tipo de objeto  que contiene el mensaje en el atributo 'data'. Los posibles valores son:  <ul><li>subscription</li>, <li>beneficiary</li>, <li>spei_outgoing</li>, <li>spei_incoming</li>, <li>spid_outgoing</li>, <li>request_outgoing</li><ul> ")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public MessageWebHook pendingWebhooks(Integer pendingWebhooks) {
    this.pendingWebhooks = pendingWebhooks;
    return this;
  }

   /**
   * Es el número de mensajes pendientes de enviar.
   * @return pendingWebhooks
  **/
  @Schema(description = "Es el número de mensajes pendientes de enviar.")
  public Integer getPendingWebhooks() {
    return pendingWebhooks;
  }

  public void setPendingWebhooks(Integer pendingWebhooks) {
    this.pendingWebhooks = pendingWebhooks;
  }

  public MessageWebHook request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Es el identificador del recurso relacionado.
   * @return request
  **/
  @Schema(description = "Es el identificador del recurso relacionado.")
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public MessageWebHook type(String type) {
    this.type = type;
    return this;
  }

   /**
   * El tipo evento que se está enviando en la notificación.
   * @return type
  **/
  @Schema(description = "El tipo evento que se está enviando en la notificación.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageWebHook messageWebHook = (MessageWebHook) o;
    return Objects.equals(this.apiVersion, messageWebHook.apiVersion) &&
        Objects.equals(this.created, messageWebHook.created) &&
        Objects.equals(this.data, messageWebHook.data) &&
        Objects.equals(this.id, messageWebHook.id) &&
        Objects.equals(this.livemode, messageWebHook.livemode) &&
        Objects.equals(this.object, messageWebHook.object) &&
        Objects.equals(this.pendingWebhooks, messageWebHook.pendingWebhooks) &&
        Objects.equals(this.request, messageWebHook.request) &&
        Objects.equals(this.type, messageWebHook.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, created, data, id, livemode, object, pendingWebhooks, request, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageWebHook {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pendingWebhooks: ").append(toIndentedString(pendingWebhooks)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
