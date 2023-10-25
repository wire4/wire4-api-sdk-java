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
import java.time.LocalDate;
import mx.wire4.model.Customer;
/**
 * Objeto request para solicitud de pago
 */
@Schema(description = "Objeto request para solicitud de pago")


public class PaymentRequestReq {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("cancel_return_url")
  private String cancelReturnUrl = null;

  @SerializedName("customer")
  private Customer customer = null;

  @SerializedName("depositant_account")
  private String depositantAccount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("due_date")
  private LocalDate dueDate = null;

  @SerializedName("from_date")
  private LocalDate fromDate = null;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    @SerializedName("CARD")
    CARD("CARD"),
    @SerializedName("CASH")
    CASH("CASH"),
    @SerializedName("SPEI")
    SPEI("SPEI");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MethodEnum fromValue(String input) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("method")
  private MethodEnum method = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  /**
   * Tipo de pago por paycash
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("RECURRENT")
    RECURRENT("RECURRENT"),
    @SerializedName("ONE_OCCASION")
    ONE_OCCASION("ONE_OCCASION");

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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public PaymentRequestReq amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto de la solicitud de pago
   * minimum: 0
   * maximum: 100000
   * @return amount
  **/
  @Schema(required = true, description = "Es el monto de la solicitud de pago")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentRequestReq cancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
    return this;
  }

   /**
   * Es la dirección URL a la que se redirigirá en caso de que el usuario cancele.
   * @return cancelReturnUrl
  **/
  @Schema(description = "Es la dirección URL a la que se redirigirá en caso de que el usuario cancele.")
  public String getCancelReturnUrl() {
    return cancelReturnUrl;
  }

  public void setCancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
  }

  public PaymentRequestReq customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public PaymentRequestReq depositantAccount(String depositantAccount) {
    this.depositantAccount = depositantAccount;
    return this;
  }

   /**
   * Es el número de cuenta CLABE donde se realizará el deposito.
   * @return depositantAccount
  **/
  @Schema(description = "Es el número de cuenta CLABE donde se realizará el deposito.")
  public String getDepositantAccount() {
    return depositantAccount;
  }

  public void setDepositantAccount(String depositantAccount) {
    this.depositantAccount = depositantAccount;
  }

  public PaymentRequestReq description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Es la descripción de la solicitud de pago.
   * @return description
  **/
  @Schema(description = "Es la descripción de la solicitud de pago.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentRequestReq dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Es la fecha de operación de la solicitud de pago.
   * @return dueDate
  **/
  @Schema(description = "Es la fecha de operación de la solicitud de pago.")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public PaymentRequestReq fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Es la fecha de inicio de la solicitud de pago. 
   * @return fromDate
  **/
  @Schema(description = "Es la fecha de inicio de la solicitud de pago. ")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public PaymentRequestReq method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(required = true, description = "")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public PaymentRequestReq orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Número de orden asignado por el cliente de Wire4
   * @return orderId
  **/
  @Schema(required = true, description = "Número de orden asignado por el cliente de Wire4")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentRequestReq returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Es la dirección URL a la que se redirigirá en caso de éxito.
   * @return returnUrl
  **/
  @Schema(description = "Es la dirección URL a la que se redirigirá en caso de éxito.")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public PaymentRequestReq type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Tipo de pago por paycash
   * @return type
  **/
  @Schema(description = "Tipo de pago por paycash")
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
    PaymentRequestReq paymentRequestReq = (PaymentRequestReq) o;
    return Objects.equals(this.amount, paymentRequestReq.amount) &&
        Objects.equals(this.cancelReturnUrl, paymentRequestReq.cancelReturnUrl) &&
        Objects.equals(this.customer, paymentRequestReq.customer) &&
        Objects.equals(this.depositantAccount, paymentRequestReq.depositantAccount) &&
        Objects.equals(this.description, paymentRequestReq.description) &&
        Objects.equals(this.dueDate, paymentRequestReq.dueDate) &&
        Objects.equals(this.fromDate, paymentRequestReq.fromDate) &&
        Objects.equals(this.method, paymentRequestReq.method) &&
        Objects.equals(this.orderId, paymentRequestReq.orderId) &&
        Objects.equals(this.returnUrl, paymentRequestReq.returnUrl) &&
        Objects.equals(this.type, paymentRequestReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cancelReturnUrl, customer, depositantAccount, description, dueDate, fromDate, method, orderId, returnUrl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestReq {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cancelReturnUrl: ").append(toIndentedString(cancelReturnUrl)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    depositantAccount: ").append(toIndentedString(depositantAccount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
