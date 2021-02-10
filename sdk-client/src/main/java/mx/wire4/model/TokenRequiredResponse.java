/*
 * Wire4RestAPI
 * Referencia de API. La API de Wire4 está organizada en torno a REST
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
 * Respuesta con una dirección URL para el centro de autorización y se que requiere una autorización mediante un token.
 */
@Schema(description = "Respuesta con una dirección URL para el centro de autorización y se que requiere una autorización mediante un token.")

public class TokenRequiredResponse {
  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("url")
  private String url = null;

  public TokenRequiredResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Es el identificador público generado para la petición (solicitud).
   * @return requestId
  **/
  @Schema(description = "Es el identificador público generado para la petición (solicitud).")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public TokenRequiredResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Es la dirección URL generada para confirmación de la operación. Es para ingresar al centro de autorización.
   * @return url
  **/
  @Schema(description = "Es la dirección URL generada para confirmación de la operación. Es para ingresar al centro de autorización.")
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
    TokenRequiredResponse tokenRequiredResponse = (TokenRequiredResponse) o;
    return Objects.equals(this.requestId, tokenRequiredResponse.requestId) &&
        Objects.equals(this.url, tokenRequiredResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequiredResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
