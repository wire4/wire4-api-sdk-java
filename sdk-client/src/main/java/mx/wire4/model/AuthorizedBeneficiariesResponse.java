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
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.AccountReassigned;
/**
 * AuthorizedBeneficiariesResponse
 */


public class AuthorizedBeneficiariesResponse {
  @SerializedName("accounts")
  private List<AccountReassigned> accounts = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("url")
  private String url = null;

  public AuthorizedBeneficiariesResponse accounts(List<AccountReassigned> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AuthorizedBeneficiariesResponse addAccountsItem(AccountReassigned accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Lista de cuentas obtenidas
   * @return accounts
  **/
  @Schema(description = "Lista de cuentas obtenidas")
  public List<AccountReassigned> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountReassigned> accounts) {
    this.accounts = accounts;
  }

  public AuthorizedBeneficiariesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identificador público generado para la petición
   * @return requestId
  **/
  @Schema(description = "Identificador público generado para la petición")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public AuthorizedBeneficiariesResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * La url generada para confirmación de la operación
   * @return url
  **/
  @Schema(description = "La url generada para confirmación de la operación")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedBeneficiariesResponse authorizedBeneficiariesResponse = (AuthorizedBeneficiariesResponse) o;
    return Objects.equals(this.accounts, authorizedBeneficiariesResponse.accounts) &&
        Objects.equals(this.requestId, authorizedBeneficiariesResponse.requestId) &&
        Objects.equals(this.url, authorizedBeneficiariesResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, requestId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedBeneficiariesResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
