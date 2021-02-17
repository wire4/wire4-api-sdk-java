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
 * Es el objeto del mensaje que se envía mediante webhook con la información del registro de la cuenta del beneficiario.
 */
@Schema(description = "Es el objeto del mensaje que se envía mediante webhook con la información del registro de la cuenta del beneficiario.")

public class MessageAccountBeneficiary {
  @SerializedName("account")
  private String account = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("request_id")
  private String requestId = null;

  public MessageAccountBeneficiary account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Es la cuenta del beneficiario registrado.
   * @return account
  **/
  @Schema(description = "Es la cuenta del beneficiario registrado.")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public MessageAccountBeneficiary errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Es el mensaje de error que se informa en caso de existir uno.
   * @return errorMessage
  **/
  @Schema(description = "Es el mensaje de error que se informa en caso de existir uno.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public MessageAccountBeneficiary requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Es el identificador en esta API de la petición de registro de la cuenta del beneficiario.
   * @return requestId
  **/
  @Schema(description = "Es el identificador en esta API de la petición de registro de la cuenta del beneficiario.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAccountBeneficiary messageAccountBeneficiary = (MessageAccountBeneficiary) o;
    return Objects.equals(this.account, messageAccountBeneficiary.account) &&
        Objects.equals(this.errorMessage, messageAccountBeneficiary.errorMessage) &&
        Objects.equals(this.requestId, messageAccountBeneficiary.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, errorMessage, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAccountBeneficiary {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
