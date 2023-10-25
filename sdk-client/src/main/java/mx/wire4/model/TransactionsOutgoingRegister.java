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
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.TransactionOutgoing;
/**
 * Objeto que contiene la información de las transferencias SPEI de salida.
 */
@Schema(description = "Objeto que contiene la información de las transferencias SPEI de salida.")


public class TransactionsOutgoingRegister {
  @SerializedName("cancel_return_url")
  private String cancelReturnUrl = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  @SerializedName("transactions")
  private List<TransactionOutgoing> transactions = new ArrayList<>();

  public TransactionsOutgoingRegister cancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
    return this;
  }

   /**
   * Es la dirección URL a la que se redirigirá en caso de que el usuario cancele.
   * @return cancelReturnUrl
  **/
  @Schema(required = true, description = "Es la dirección URL a la que se redirigirá en caso de que el usuario cancele.")
  public String getCancelReturnUrl() {
    return cancelReturnUrl;
  }

  public void setCancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
  }

  public TransactionsOutgoingRegister returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Es la dirección URL a la que se redirigirá en caso de éxito.
   * @return returnUrl
  **/
  @Schema(required = true, description = "Es la dirección URL a la que se redirigirá en caso de éxito.")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public TransactionsOutgoingRegister transactions(List<TransactionOutgoing> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionsOutgoingRegister addTransactionsItem(TransactionOutgoing transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Lista de transferencias de salida que se enviarán a Monex.
   * @return transactions
  **/
  @Schema(required = true, description = "Lista de transferencias de salida que se enviarán a Monex.")
  public List<TransactionOutgoing> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionOutgoing> transactions) {
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
    TransactionsOutgoingRegister transactionsOutgoingRegister = (TransactionsOutgoingRegister) o;
    return Objects.equals(this.cancelReturnUrl, transactionsOutgoingRegister.cancelReturnUrl) &&
        Objects.equals(this.returnUrl, transactionsOutgoingRegister.returnUrl) &&
        Objects.equals(this.transactions, transactionsOutgoingRegister.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReturnUrl, returnUrl, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsOutgoingRegister {\n");
    
    sb.append("    cancelReturnUrl: ").append(toIndentedString(cancelReturnUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
