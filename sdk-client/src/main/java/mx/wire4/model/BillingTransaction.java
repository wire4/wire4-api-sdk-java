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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
/**
 * Contiene información de las transacciones que se facturan
 */
@Schema(description = "Contiene información de las transacciones que se facturan")

public class BillingTransaction {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("monex_id")
  private Integer monexId = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("payment_order_id")
  private String paymentOrderId = null;

  @SerializedName("transaction_id")
  private Integer transactionId = null;

  /**
   * Tipo de transaccion IN | OUT
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IN("IN"),
    OUT("OUT");

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

  public BillingTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la transacción
   * @return amount
  **/
  @Schema(description = "Monto de la transacción")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BillingTransaction claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo que se asignó a la transacción
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo que se asignó a la transacción")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public BillingTransaction monexId(Integer monexId) {
    this.monexId = monexId;
    return this;
  }

   /**
   * Identificador de transaccion en banco monex
   * @return monexId
  **/
  @Schema(description = "Identificador de transaccion en banco monex")
  public Integer getMonexId() {
    return monexId;
  }

  public void setMonexId(Integer monexId) {
    this.monexId = monexId;
  }

  public BillingTransaction operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha y hora de la transacción
   * @return operationDate
  **/
  @Schema(description = "Fecha y hora de la transacción")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public BillingTransaction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Identificador de la orden
   * @return orderId
  **/
  @Schema(description = "Identificador de la orden")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public BillingTransaction paymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
    return this;
  }

   /**
   * Identificador de la orden de pago
   * @return paymentOrderId
  **/
  @Schema(description = "Identificador de la orden de pago")
  public String getPaymentOrderId() {
    return paymentOrderId;
  }

  public void setPaymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
  }

  public BillingTransaction transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identificador de la transacción
   * @return transactionId
  **/
  @Schema(description = "Identificador de la transacción")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public BillingTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Tipo de transaccion IN | OUT
   * @return type
  **/
  @Schema(description = "Tipo de transaccion IN | OUT")
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
    BillingTransaction billingTransaction = (BillingTransaction) o;
    return Objects.equals(this.amount, billingTransaction.amount) &&
        Objects.equals(this.claveRastreo, billingTransaction.claveRastreo) &&
        Objects.equals(this.monexId, billingTransaction.monexId) &&
        Objects.equals(this.operationDate, billingTransaction.operationDate) &&
        Objects.equals(this.orderId, billingTransaction.orderId) &&
        Objects.equals(this.paymentOrderId, billingTransaction.paymentOrderId) &&
        Objects.equals(this.transactionId, billingTransaction.transactionId) &&
        Objects.equals(this.type, billingTransaction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, claveRastreo, monexId, operationDate, orderId, paymentOrderId, transactionId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    monexId: ").append(toIndentedString(monexId)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
