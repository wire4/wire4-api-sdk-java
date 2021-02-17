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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
/**
 * Es el objeto del mensaje que se envía con la información del punto de venta registrado.
 */
@Schema(description = "Es el objeto del mensaje que se envía con la información del punto de venta registrado.")

public class MessageCodiAction {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("concept")
  private String concept = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("payment_type")
  private String paymentType = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sales_point_id")
  private String salesPointId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  public MessageCodiAction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto de la operación de pago.
   * @return amount
  **/
  @Schema(description = "Es el monto de la operación de pago.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MessageCodiAction concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Es el concepto de la transacción.
   * @return concept
  **/
  @Schema(description = "Es el concepto de la transacción.")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public MessageCodiAction dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Es la fecha de expiración de la operación.
   * @return dueDate
  **/
  @Schema(description = "Es la fecha de expiración de la operación.")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public MessageCodiAction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Es el UUID de la operación.
   * @return id
  **/
  @Schema(description = "Es el UUID de la operación.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageCodiAction metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Es el campo Metadata asociado a la petición de pago. Es información que indica guardar la petición.
   * @return metadata
  **/
  @Schema(description = "Es el campo Metadata asociado a la petición de pago. Es información que indica guardar la petición.")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public MessageCodiAction operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Es la fecha de la operación.
   * @return operationDate
  **/
  @Schema(description = "Es la fecha de la operación.")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public MessageCodiAction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Es el identificador de la petición.
   * @return orderId
  **/
  @Schema(description = "Es el identificador de la petición.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public MessageCodiAction paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Es el tipo de pago.
   * @return paymentType
  **/
  @Schema(description = "Es el tipo de pago.")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public MessageCodiAction reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Es el número de referencia.
   * @return reference
  **/
  @Schema(description = "Es el número de referencia.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MessageCodiAction salesPointId(String salesPointId) {
    this.salesPointId = salesPointId;
    return this;
  }

   /**
   * Identidicador del punto de venta a la que pertenece la petición de pago.
   * @return salesPointId
  **/
  @Schema(description = "Identidicador del punto de venta a la que pertenece la petición de pago.")
  public String getSalesPointId() {
    return salesPointId;
  }

  public void setSalesPointId(String salesPointId) {
    this.salesPointId = salesPointId;
  }

  public MessageCodiAction status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Es el estado (estatus) de la operación de pago.
   * @return status
  **/
  @Schema(description = "Es el estado (estatus) de la operación de pago.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MessageCodiAction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Es el identificador de la transacción.
   * @return transactionId
  **/
  @Schema(description = "Es el identificador de la transacción.")
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
    MessageCodiAction messageCodiAction = (MessageCodiAction) o;
    return Objects.equals(this.amount, messageCodiAction.amount) &&
        Objects.equals(this.concept, messageCodiAction.concept) &&
        Objects.equals(this.dueDate, messageCodiAction.dueDate) &&
        Objects.equals(this.id, messageCodiAction.id) &&
        Objects.equals(this.metadata, messageCodiAction.metadata) &&
        Objects.equals(this.operationDate, messageCodiAction.operationDate) &&
        Objects.equals(this.orderId, messageCodiAction.orderId) &&
        Objects.equals(this.paymentType, messageCodiAction.paymentType) &&
        Objects.equals(this.reference, messageCodiAction.reference) &&
        Objects.equals(this.salesPointId, messageCodiAction.salesPointId) &&
        Objects.equals(this.status, messageCodiAction.status) &&
        Objects.equals(this.transactionId, messageCodiAction.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, concept, dueDate, id, metadata, operationDate, orderId, paymentType, reference, salesPointId, status, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCodiAction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    salesPointId: ").append(toIndentedString(salesPointId)).append("\n");
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
