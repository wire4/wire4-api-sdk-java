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
import mx.wire4.model.TransactionErrorCode;
/**
 * DetailedErrorResponse
 */


public class DetailedErrorResponse {
  @SerializedName("errors")
  private List<TransactionErrorCode> errors = null;

  @SerializedName("http_status")
  private Integer httpStatus = null;

  @SerializedName("message")
  private String message = null;

  public DetailedErrorResponse errors(List<TransactionErrorCode> errors) {
    this.errors = errors;
    return this;
  }

  public DetailedErrorResponse addErrorsItem(TransactionErrorCode errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<TransactionErrorCode> getErrors() {
    return errors;
  }

  public void setErrors(List<TransactionErrorCode> errors) {
    this.errors = errors;
  }

  public DetailedErrorResponse httpStatus(Integer httpStatus) {
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

  public DetailedErrorResponse message(String message) {
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
    DetailedErrorResponse detailedErrorResponse = (DetailedErrorResponse) o;
    return Objects.equals(this.errors, detailedErrorResponse.errors) &&
        Objects.equals(this.httpStatus, detailedErrorResponse.httpStatus) &&
        Objects.equals(this.message, detailedErrorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, httpStatus, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedErrorResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
