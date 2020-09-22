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
import java.time.OffsetDateTime;
/**
 * Objeto que contiene la información de solicitud de pago por CODI®.
 */
@Schema(description = "Objeto que contiene la información de solicitud de pago por CODI®.")

public class CodiOperationResponseDTO {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("concept")
  private String concept = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  @SerializedName("payment_type")
  private String paymentType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  public CodiOperationResponseDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la operacion.
   * @return amount
  **/
  @Schema(description = "Monto de la operacion.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CodiOperationResponseDTO concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Concepto del pago.
   * @return concept
  **/
  @Schema(description = "Concepto del pago.")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public CodiOperationResponseDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador de la operacion.
   * @return id
  **/
  @Schema(description = "Identificador de la operacion.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CodiOperationResponseDTO operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha de la operacion.
   * @return operationDate
  **/
  @Schema(description = "Fecha de la operacion.")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public CodiOperationResponseDTO paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Tipo de pago.
   * @return paymentType
  **/
  @Schema(description = "Tipo de pago.")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public CodiOperationResponseDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Estatus.
   * @return status
  **/
  @Schema(description = "Estatus.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CodiOperationResponseDTO transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identificador de la transacción.
   * @return transactionId
  **/
  @Schema(description = "Identificador de la transacción.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
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
    CodiOperationResponseDTO codiOperationResponseDTO = (CodiOperationResponseDTO) o;
    return Objects.equals(this.amount, codiOperationResponseDTO.amount) &&
        Objects.equals(this.concept, codiOperationResponseDTO.concept) &&
        Objects.equals(this.id, codiOperationResponseDTO.id) &&
        Objects.equals(this.operationDate, codiOperationResponseDTO.operationDate) &&
        Objects.equals(this.paymentType, codiOperationResponseDTO.paymentType) &&
        Objects.equals(this.status, codiOperationResponseDTO.status) &&
        Objects.equals(this.transactionId, codiOperationResponseDTO.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, concept, id, operationDate, paymentType, status, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodiOperationResponseDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
