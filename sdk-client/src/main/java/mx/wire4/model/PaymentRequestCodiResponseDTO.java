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
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.CodiOperationResponseDTO;
/**
 * Objeto que contiene la información de solicitud de pago por CODI®.
 */
@Schema(description = "Objeto que contiene la información de solicitud de pago por CODI®.")

public class PaymentRequestCodiResponseDTO {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("barcode_base64")
  private String barcodeBase64 = null;

  @SerializedName("barcode_url")
  private String barcodeUrl = null;

  @SerializedName("concept")
  private String concept = null;

  @SerializedName("creation_date")
  private OffsetDateTime creationDate = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("operations")
  private List<CodiOperationResponseDTO> operations = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public PaymentRequestCodiResponseDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto del pago.
   * @return amount
  **/
  @Schema(description = "Monto del pago.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentRequestCodiResponseDTO barcodeBase64(String barcodeBase64) {
    this.barcodeBase64 = barcodeBase64;
    return this;
  }

   /**
   * Imagen QR en formato Base64 para el CODI®.
   * @return barcodeBase64
  **/
  @Schema(description = "Imagen QR en formato Base64 para el CODI®.")
  public String getBarcodeBase64() {
    return barcodeBase64;
  }

  public void setBarcodeBase64(String barcodeBase64) {
    this.barcodeBase64 = barcodeBase64;
  }

  public PaymentRequestCodiResponseDTO barcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
    return this;
  }

   /**
   * URL de la imagen QR para el CODI®.
   * @return barcodeUrl
  **/
  @Schema(description = "URL de la imagen QR para el CODI®.")
  public String getBarcodeUrl() {
    return barcodeUrl;
  }

  public void setBarcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
  }

  public PaymentRequestCodiResponseDTO concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Concepto de pago.
   * @return concept
  **/
  @Schema(description = "Concepto de pago.")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public PaymentRequestCodiResponseDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Fecha de creación.
   * @return creationDate
  **/
  @Schema(description = "Fecha de creación.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PaymentRequestCodiResponseDTO dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Fecha de vencimiento.
   * @return dueDate
  **/
  @Schema(description = "Fecha de vencimiento.")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public PaymentRequestCodiResponseDTO operations(List<CodiOperationResponseDTO> operations) {
    this.operations = operations;
    return this;
  }

  public PaymentRequestCodiResponseDTO addOperationsItem(CodiOperationResponseDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Listado de pagos realizados sobre la petición.
   * @return operations
  **/
  @Schema(description = "Listado de pagos realizados sobre la petición.")
  public List<CodiOperationResponseDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<CodiOperationResponseDTO> operations) {
    this.operations = operations;
  }

  public PaymentRequestCodiResponseDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * OrderId asignada a la solicitud.
   * @return orderId
  **/
  @Schema(description = "OrderId asignada a la solicitud.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentRequestCodiResponseDTO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Numero de teléfono.
   * @return phoneNumber
  **/
  @Schema(description = "Numero de teléfono.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PaymentRequestCodiResponseDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Estatus de la orden de pago.
   * @return status
  **/
  @Schema(description = "Estatus de la orden de pago.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentRequestCodiResponseDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Tipo de petición.
   * @return type
  **/
  @Schema(description = "Tipo de petición.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestCodiResponseDTO paymentRequestCodiResponseDTO = (PaymentRequestCodiResponseDTO) o;
    return Objects.equals(this.amount, paymentRequestCodiResponseDTO.amount) &&
        Objects.equals(this.barcodeBase64, paymentRequestCodiResponseDTO.barcodeBase64) &&
        Objects.equals(this.barcodeUrl, paymentRequestCodiResponseDTO.barcodeUrl) &&
        Objects.equals(this.concept, paymentRequestCodiResponseDTO.concept) &&
        Objects.equals(this.creationDate, paymentRequestCodiResponseDTO.creationDate) &&
        Objects.equals(this.dueDate, paymentRequestCodiResponseDTO.dueDate) &&
        Objects.equals(this.operations, paymentRequestCodiResponseDTO.operations) &&
        Objects.equals(this.orderId, paymentRequestCodiResponseDTO.orderId) &&
        Objects.equals(this.phoneNumber, paymentRequestCodiResponseDTO.phoneNumber) &&
        Objects.equals(this.status, paymentRequestCodiResponseDTO.status) &&
        Objects.equals(this.type, paymentRequestCodiResponseDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, barcodeBase64, barcodeUrl, concept, creationDate, dueDate, operations, orderId, phoneNumber, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestCodiResponseDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    barcodeBase64: ").append(toIndentedString(barcodeBase64)).append("\n");
    sb.append("    barcodeUrl: ").append(toIndentedString(barcodeUrl)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
