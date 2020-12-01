/*
 * Wire4RestAPI
 * Referencia de API. La API de Wire4 está organizada en torno a REST.
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
import java.util.ArrayList;
import java.util.List;
/**
 * Objeto que contiene la información de un webhook.
 */
@Schema(description = "Objeto que contiene la información de un webhook.")

public class WebhookRequest {
  @SerializedName("events")
  private List<String> events = new ArrayList<>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public WebhookRequest events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookRequest addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Tipos de eventos de los cuales Wire4 te enviará información, para mas referencia sobre los tipos de eventos soportados, revise la siguiente liga: https://developers.wire4.mx/#section/Eventos .
   * @return events
  **/
  @Schema(required = true, description = "Tipos de eventos de los cuales Wire4 te enviará información, para mas referencia sobre los tipos de eventos soportados, revise la siguiente liga: https://developers.wire4.mx/#section/Eventos .")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public WebhookRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nombre del webhook.
   * @return name
  **/
  @Schema(required = true, description = "Nombre del webhook.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhookRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL a la cual Wire4 enviará las notificaciones cuando un evento ocurra.
   * @return url
  **/
  @Schema(required = true, description = "URL a la cual Wire4 enviará las notificaciones cuando un evento ocurra.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return Objects.equals(this.events, webhookRequest.events) &&
        Objects.equals(this.name, webhookRequest.name) &&
        Objects.equals(this.url, webhookRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
