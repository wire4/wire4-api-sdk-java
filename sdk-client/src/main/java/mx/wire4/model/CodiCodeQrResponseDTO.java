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
 * CodiCodeQrResponseDTO
 */


public class CodiCodeQrResponseDTO {
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

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  /**
   * El estado del código QR para pago CODI®.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    RECEIVED("RECEIVED"),
    COMPLETED("COMPLETED"),
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Es el tipo de código QR para pago con CODI®.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PUSH_NOTIFICATION("PUSH_NOTIFICATION"),
    QR_CODE("QR_CODE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public CodiCodeQrResponseDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto del pago CODI®.
   * @return amount
  **/
  @Schema(description = "Es el monto del pago CODI®.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CodiCodeQrResponseDTO barcodeBase64(String barcodeBase64) {
    this.barcodeBase64 = barcodeBase64;
    return this;
  }

   /**
   * El código QR en su represantación base 64.
   * @return barcodeBase64
  **/
  @Schema(description = "El código QR en su represantación base 64.")
  public String getBarcodeBase64() {
    return barcodeBase64;
  }

  public void setBarcodeBase64(String barcodeBase64) {
    this.barcodeBase64 = barcodeBase64;
  }

  public CodiCodeQrResponseDTO barcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
    return this;
  }

   /**
   * Es la dirección URL del código QR.
   * @return barcodeUrl
  **/
  @Schema(description = "Es la dirección URL del código QR.")
  public String getBarcodeUrl() {
    return barcodeUrl;
  }

  public void setBarcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
  }

  public CodiCodeQrResponseDTO concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Es la descripción del pago CODI®.
   * @return concept
  **/
  @Schema(description = "Es la descripción del pago CODI®.")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public CodiCodeQrResponseDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Es la fecha de creación del código QR para pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;.
   * @return creationDate
  **/
  @Schema(description = "Es la fecha de creación del código QR para pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: <strong>2020-10-27T11:03:15.000-06:00</strong>.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public CodiCodeQrResponseDTO dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Es la fecha de operación del pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;.
   * @return dueDate
  **/
  @Schema(description = "Es la fecha de operación del pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: <strong>2020-10-27T11:03:15.000-06:00</strong>.")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CodiCodeQrResponseDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Es la referencia de la transferencia asignada por el cliente.
   * @return orderId
  **/
  @Schema(description = "Es la referencia de la transferencia asignada por el cliente.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CodiCodeQrResponseDTO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Es el Número de teléfono móvil en caso de ser un pago CODI® usando \&quot;PUSH_NOTIFICATION\&quot;.
   * @return phoneNumber
  **/
  @Schema(description = "Es el Número de teléfono móvil en caso de ser un pago CODI® usando \"PUSH_NOTIFICATION\".")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CodiCodeQrResponseDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * El estado del código QR para pago CODI®.
   * @return status
  **/
  @Schema(description = "El estado del código QR para pago CODI®.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CodiCodeQrResponseDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Es el tipo de código QR para pago con CODI®.
   * @return type
  **/
  @Schema(description = "Es el tipo de código QR para pago con CODI®.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    CodiCodeQrResponseDTO codiCodeQrResponseDTO = (CodiCodeQrResponseDTO) o;
    return Objects.equals(this.amount, codiCodeQrResponseDTO.amount) &&
        Objects.equals(this.barcodeBase64, codiCodeQrResponseDTO.barcodeBase64) &&
        Objects.equals(this.barcodeUrl, codiCodeQrResponseDTO.barcodeUrl) &&
        Objects.equals(this.concept, codiCodeQrResponseDTO.concept) &&
        Objects.equals(this.creationDate, codiCodeQrResponseDTO.creationDate) &&
        Objects.equals(this.dueDate, codiCodeQrResponseDTO.dueDate) &&
        Objects.equals(this.orderId, codiCodeQrResponseDTO.orderId) &&
        Objects.equals(this.phoneNumber, codiCodeQrResponseDTO.phoneNumber) &&
        Objects.equals(this.status, codiCodeQrResponseDTO.status) &&
        Objects.equals(this.type, codiCodeQrResponseDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, barcodeBase64, barcodeUrl, concept, creationDate, dueDate, orderId, phoneNumber, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodiCodeQrResponseDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    barcodeBase64: ").append(toIndentedString(barcodeBase64)).append("\n");
    sb.append("    barcodeUrl: ").append(toIndentedString(barcodeUrl)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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
