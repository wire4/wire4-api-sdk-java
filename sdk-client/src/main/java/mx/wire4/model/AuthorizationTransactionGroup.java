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
import mx.wire4.model.UrlsRedirect;
/**
 * Contiene la información para agrupar transacciones existentes y autorizarlas de forma conjunta
 */
@Schema(description = "Contiene la información para agrupar transacciones existentes y autorizarlas de forma conjunta")


public class AuthorizationTransactionGroup {
  @SerializedName("redirect_urls")
  private UrlsRedirect redirectUrls = null;

  @SerializedName("transactions")
  private List<String> transactions = new ArrayList<>();

  public AuthorizationTransactionGroup redirectUrls(UrlsRedirect redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

   /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  @Schema(required = true, description = "")
  public UrlsRedirect getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(UrlsRedirect redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public AuthorizationTransactionGroup transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }

  public AuthorizationTransactionGroup addTransactionsItem(String transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Listado de order_id de las transacciones a agrupar.
   * @return transactions
  **/
  @Schema(required = true, description = "Listado de order_id de las transacciones a agrupar.")
  public List<String> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<String> transactions) {
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
    AuthorizationTransactionGroup authorizationTransactionGroup = (AuthorizationTransactionGroup) o;
    return Objects.equals(this.redirectUrls, authorizationTransactionGroup.redirectUrls) &&
        Objects.equals(this.transactions, authorizationTransactionGroup.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrls, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationTransactionGroup {\n");
    
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
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
