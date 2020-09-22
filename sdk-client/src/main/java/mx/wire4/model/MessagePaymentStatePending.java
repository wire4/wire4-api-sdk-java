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
import java.math.BigDecimal;
import mx.wire4.model.MessageInstitution;
/**
 * El mensaje que se envía mediante (webHook) con la información de una transferencia que esta pendiente de ser completada
 */
@Schema(description = "El mensaje que se envía mediante (webHook) con la información de una transferencia que esta pendiente de ser completada")

public class MessagePaymentStatePending {
  @SerializedName("account")
  private String account = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("beneficiary_bank")
  private MessageInstitution beneficiaryBank = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("concept")
  private String concept = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("detention_message")
  private String detentionMessage = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("payment_order_id")
  private Integer paymentOrderId = null;

  @SerializedName("pending_reason")
  private String pendingReason = null;

  @SerializedName("reference")
  private Integer reference = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("status_code")
  private String statusCode = null;

  @SerializedName("transaction_id")
  private Integer transactionId = null;

  public MessagePaymentStatePending account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Cuenta del ordenante
   * @return account
  **/
  @Schema(description = "Cuenta del ordenante")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public MessagePaymentStatePending amount(BigDecimal amount) {
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

  public MessagePaymentStatePending beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Cuenta del beneficiario
   * @return beneficiaryAccount
  **/
  @Schema(description = "Cuenta del beneficiario")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public MessagePaymentStatePending beneficiaryBank(MessageInstitution beneficiaryBank) {
    this.beneficiaryBank = beneficiaryBank;
    return this;
  }

   /**
   * Get beneficiaryBank
   * @return beneficiaryBank
  **/
  @Schema(description = "")
  public MessageInstitution getBeneficiaryBank() {
    return beneficiaryBank;
  }

  public void setBeneficiaryBank(MessageInstitution beneficiaryBank) {
    this.beneficiaryBank = beneficiaryBank;
  }

  public MessagePaymentStatePending beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Nombre del beneficiario
   * @return beneficiaryName
  **/
  @Schema(description = "Nombre del beneficiario")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public MessagePaymentStatePending concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Concepto de la transferencia de salida
   * @return concept
  **/
  @Schema(description = "Concepto de la transferencia de salida")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public MessagePaymentStatePending currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Código de la moneda de la transferencia de salida
   * @return currencyCode
  **/
  @Schema(description = "Código de la moneda de la transferencia de salida")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MessagePaymentStatePending detentionMessage(String detentionMessage) {
    this.detentionMessage = detentionMessage;
    return this;
  }

   /**
   * Mensaje de detención de Monex, indica la causa por la cuál esta detenida la operación en Monex
   * @return detentionMessage
  **/
  @Schema(description = "Mensaje de detención de Monex, indica la causa por la cuál esta detenida la operación en Monex")
  public String getDetentionMessage() {
    return detentionMessage;
  }

  public void setDetentionMessage(String detentionMessage) {
    this.detentionMessage = detentionMessage;
  }

  public MessagePaymentStatePending errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Mensaje de error
   * @return errorMessage
  **/
  @Schema(description = "Mensaje de error")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public MessagePaymentStatePending orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * El identificador de la transferencia de salida
   * @return orderId
  **/
  @Schema(description = "El identificador de la transferencia de salida")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public MessagePaymentStatePending paymentOrderId(Integer paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
    return this;
  }

   /**
   * El identificador de la orden de pago de Monex de la transferencia de salida
   * @return paymentOrderId
  **/
  @Schema(description = "El identificador de la orden de pago de Monex de la transferencia de salida")
  public Integer getPaymentOrderId() {
    return paymentOrderId;
  }

  public void setPaymentOrderId(Integer paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
  }

  public MessagePaymentStatePending pendingReason(String pendingReason) {
    this.pendingReason = pendingReason;
    return this;
  }

   /**
   * Estatus que identifica la causa por la que la transferencia esta en pendiente, los posibles estatus son: FI&#x3D;Fondos Insuficientes | FM&#x3D;Firma mancomunada, en espera de ingreso de segundo token de autorización | DP&#x3D;Se detecto una transferencia duplicada que esta en espera de confirmación o de eliminación
   * @return pendingReason
  **/
  @Schema(description = "Estatus que identifica la causa por la que la transferencia esta en pendiente, los posibles estatus son: FI=Fondos Insuficientes | FM=Firma mancomunada, en espera de ingreso de segundo token de autorización | DP=Se detecto una transferencia duplicada que esta en espera de confirmación o de eliminación")
  public String getPendingReason() {
    return pendingReason;
  }

  public void setPendingReason(String pendingReason) {
    this.pendingReason = pendingReason;
  }

  public MessagePaymentStatePending reference(Integer reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referecia de la transferencia
   * @return reference
  **/
  @Schema(description = "Referecia de la transferencia")
  public Integer getReference() {
    return reference;
  }

  public void setReference(Integer reference) {
    this.reference = reference;
  }

  public MessagePaymentStatePending requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * El identificador, en esta API, de la petición de envío de la transferencia de salida
   * @return requestId
  **/
  @Schema(description = "El identificador, en esta API, de la petición de envío de la transferencia de salida")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public MessagePaymentStatePending statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * El estado de la transferencia de salida, deberá ser PENDING
   * @return statusCode
  **/
  @Schema(description = "El estado de la transferencia de salida, deberá ser PENDING")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public MessagePaymentStatePending transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * El identificador de Monex de la transferencia de salida, podría no estar presente por lo que Usted debería hacer referencias mediate el paymentOrderID
   * @return transactionId
  **/
  @Schema(description = "El identificador de Monex de la transferencia de salida, podría no estar presente por lo que Usted debería hacer referencias mediate el paymentOrderID")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePaymentStatePending messagePaymentStatePending = (MessagePaymentStatePending) o;
    return Objects.equals(this.account, messagePaymentStatePending.account) &&
        Objects.equals(this.amount, messagePaymentStatePending.amount) &&
        Objects.equals(this.beneficiaryAccount, messagePaymentStatePending.beneficiaryAccount) &&
        Objects.equals(this.beneficiaryBank, messagePaymentStatePending.beneficiaryBank) &&
        Objects.equals(this.beneficiaryName, messagePaymentStatePending.beneficiaryName) &&
        Objects.equals(this.concept, messagePaymentStatePending.concept) &&
        Objects.equals(this.currencyCode, messagePaymentStatePending.currencyCode) &&
        Objects.equals(this.detentionMessage, messagePaymentStatePending.detentionMessage) &&
        Objects.equals(this.errorMessage, messagePaymentStatePending.errorMessage) &&
        Objects.equals(this.orderId, messagePaymentStatePending.orderId) &&
        Objects.equals(this.paymentOrderId, messagePaymentStatePending.paymentOrderId) &&
        Objects.equals(this.pendingReason, messagePaymentStatePending.pendingReason) &&
        Objects.equals(this.reference, messagePaymentStatePending.reference) &&
        Objects.equals(this.requestId, messagePaymentStatePending.requestId) &&
        Objects.equals(this.statusCode, messagePaymentStatePending.statusCode) &&
        Objects.equals(this.transactionId, messagePaymentStatePending.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, beneficiaryAccount, beneficiaryBank, beneficiaryName, concept, currencyCode, detentionMessage, errorMessage, orderId, paymentOrderId, pendingReason, reference, requestId, statusCode, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePaymentStatePending {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    beneficiaryBank: ").append(toIndentedString(beneficiaryBank)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    detentionMessage: ").append(toIndentedString(detentionMessage)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("    pendingReason: ").append(toIndentedString(pendingReason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
