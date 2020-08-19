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
 * PreEnrollmentData
 */


public class PreEnrollmentData {
  @SerializedName("cancel_return_url")
  private String cancelReturnUrl = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  public PreEnrollmentData cancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
    return this;
  }

   /**
   * Url a la que se redirigirá en caso de un error
   * @return cancelReturnUrl
  **/
  @Schema(example = "http://mysite.com/return", required = true, description = "Url a la que se redirigirá en caso de un error")
  public String getCancelReturnUrl() {
    return cancelReturnUrl;
  }

  public void setCancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
  }

  public PreEnrollmentData returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Url a la que se redirigirá en caso de exito
   * @return returnUrl
  **/
  @Schema(example = "http://mysite.com/cancel", required = true, description = "Url a la que se redirigirá en caso de exito")
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
    PreEnrollmentData preEnrollmentData = (PreEnrollmentData) o;
    return Objects.equals(this.cancelReturnUrl, preEnrollmentData.cancelReturnUrl) &&
        Objects.equals(this.returnUrl, preEnrollmentData.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReturnUrl, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreEnrollmentData {\n");
    
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
