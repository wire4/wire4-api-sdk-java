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
/**
 * Recibe las urls para redirigir en caso de exito o de error
 */
@Schema(description = "Recibe las urls para redirigir en caso de exito o de error")

public class UrlsRedirect {
  @SerializedName("cancel_return_url")
  private String cancelReturnUrl = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  public UrlsRedirect cancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
    return this;
  }

   /**
   * Url a la que se redirigira en caso de que el cliente cancele el registro
   * @return cancelReturnUrl
  **/
  @Schema(required = true, description = "Url a la que se redirigira en caso de que el cliente cancele el registro")
  public String getCancelReturnUrl() {
    return cancelReturnUrl;
  }

  public void setCancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
  }

  public UrlsRedirect returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Url a la que se redireccionara en caso exitoso
   * @return returnUrl
  **/
  @Schema(required = true, description = "Url a la que se redireccionara en caso exitoso")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlsRedirect urlsRedirect = (UrlsRedirect) o;
    return Objects.equals(this.cancelReturnUrl, urlsRedirect.cancelReturnUrl) &&
        Objects.equals(this.returnUrl, urlsRedirect.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReturnUrl, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlsRedirect {\n");
    
    sb.append("    cancelReturnUrl: ").append(toIndentedString(cancelReturnUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
