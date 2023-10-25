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
/**
 * Contiene la información de un WebHook para autorización de depósitos.
 */
@Schema(description = "Contiene la información de un WebHook para autorización de depósitos.")


public class WebHookDepositAuthorizationRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public WebHookDepositAuthorizationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Es el nombre del webhook.
   * @return name
  **/
  @Schema(description = "Es el nombre del webhook.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebHookDepositAuthorizationRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Es la dirección URL a la cuál Wire4 enviará las notificaciones cuando un evento ocurra.
   * @return url
  **/
  @Schema(description = "Es la dirección URL a la cuál Wire4 enviará las notificaciones cuando un evento ocurra.")
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
    WebHookDepositAuthorizationRequest webHookDepositAuthorizationRequest = (WebHookDepositAuthorizationRequest) o;
    return Objects.equals(this.name, webHookDepositAuthorizationRequest.name) &&
        Objects.equals(this.url, webHookDepositAuthorizationRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookDepositAuthorizationRequest {\n");
    
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
