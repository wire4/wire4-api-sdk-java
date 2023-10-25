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
 * ErrorResponse
 */



public class ErrorResponse {
  @SerializedName("http_status")
  private Integer httpStatus = null;

  @SerializedName("message")
  private String message = null;

  public ErrorResponse httpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @Schema(description = "")
  public Integer getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }

  public ErrorResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.httpStatus, errorResponse.httpStatus) &&
        Objects.equals(this.message, errorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatus, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
