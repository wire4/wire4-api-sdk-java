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
import mx.wire4.model.Payment;
/**
 * PaymentsRequestId
 */



public class PaymentsRequestId {
  @SerializedName("authorization_date")
  private OffsetDateTime authorizationDate = null;

  @SerializedName("request_date")
  private OffsetDateTime requestDate = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("total_amount")
  private BigDecimal totalAmount = null;

  @SerializedName("total_transactions")
  private Integer totalTransactions = null;

  @SerializedName("transactions")
  private List<Payment> transactions = null;

  public PaymentsRequestId authorizationDate(OffsetDateTime authorizationDate) {
    this.authorizationDate = authorizationDate;
    return this;
  }

   /**
   * Fecha en que el usuario propietario del token emitió la autorización
   * @return authorizationDate
  **/
  @Schema(description = "Fecha en que el usuario propietario del token emitió la autorización")
  public OffsetDateTime getAuthorizationDate() {
    return authorizationDate;
  }

  public void setAuthorizationDate(OffsetDateTime authorizationDate) {
    this.authorizationDate = authorizationDate;
  }

  public PaymentsRequestId requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

   /**
   * Fecha en que se realizó la petición de registro de transacciones
   * @return requestDate
  **/
  @Schema(description = "Fecha en que se realizó la petición de registro de transacciones")
  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  public PaymentsRequestId requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identificador de la petición del registro de transacciones
   * @return requestId
  **/
  @Schema(description = "Identificador de la petición del registro de transacciones")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public PaymentsRequestId totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Monto total de las transacciones registradas
   * @return totalAmount
  **/
  @Schema(description = "Monto total de las transacciones registradas")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PaymentsRequestId totalTransactions(Integer totalTransactions) {
    this.totalTransactions = totalTransactions;
    return this;
  }

   /**
   * Total de transacciones en la petición
   * @return totalTransactions
  **/
  @Schema(description = "Total de transacciones en la petición")
  public Integer getTotalTransactions() {
    return totalTransactions;
  }

  public void setTotalTransactions(Integer totalTransactions) {
    this.totalTransactions = totalTransactions;
  }

  public PaymentsRequestId transactions(List<Payment> transactions) {
    this.transactions = transactions;
    return this;
  }

  public PaymentsRequestId addTransactionsItem(Payment transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Lista de las transacciones registradas
   * @return transactions
  **/
  @Schema(description = "Lista de las transacciones registradas")
  public List<Payment> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Payment> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequestId paymentsRequestId = (PaymentsRequestId) o;
    return Objects.equals(this.authorizationDate, paymentsRequestId.authorizationDate) &&
        Objects.equals(this.requestDate, paymentsRequestId.requestDate) &&
        Objects.equals(this.requestId, paymentsRequestId.requestId) &&
        Objects.equals(this.totalAmount, paymentsRequestId.totalAmount) &&
        Objects.equals(this.totalTransactions, paymentsRequestId.totalTransactions) &&
        Objects.equals(this.transactions, paymentsRequestId.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDate, requestDate, requestId, totalAmount, totalTransactions, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestId {\n");
    
    sb.append("    authorizationDate: ").append(toIndentedString(authorizationDate)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalTransactions: ").append(toIndentedString(totalTransactions)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
