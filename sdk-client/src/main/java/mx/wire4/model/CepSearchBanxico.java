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
/**
 * CepSearchBanxico
 */


public class CepSearchBanxico {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("beneficiary_bank_key")
  private String beneficiaryBankKey = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("operation_date")
  private String operationDate = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sender_account")
  private String senderAccount = null;

  @SerializedName("sender_bank_key")
  private String senderBankKey = null;

  public CepSearchBanxico amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto de la transferencia. Ejemplo 1000.00
   * @return amount
  **/
  @Schema(required = true, description = "Es el monto de la transferencia. Ejemplo 1000.00")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CepSearchBanxico beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Es la cuenta de beneficiario.
   * @return beneficiaryAccount
  **/
  @Schema(required = true, description = "Es la cuenta de beneficiario.")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public CepSearchBanxico beneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
    return this;
  }

   /**
   * Clave del banco beneficiario. Éste valor no esta presente si obtiene de la cuenta del beneficiario, en caso de que sea un número celular éste campo es requerido. se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt;
   * @return beneficiaryBankKey
  **/
  @Schema(description = "Clave del banco beneficiario. Éste valor no esta presente si obtiene de la cuenta del beneficiario, en caso de que sea un número celular éste campo es requerido. se puede obtener del recurso de las <a href=\"#operation/getAllInstitutionsUsingGET\">instituciones.</a>")
  public String getBeneficiaryBankKey() {
    return beneficiaryBankKey;
  }

  public void setBeneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
  }

  public CepSearchBanxico claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Es la clave de rastreo de la transferencia.
   * @return claveRastreo
  **/
  @Schema(required = true, description = "Es la clave de rastreo de la transferencia.")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public CepSearchBanxico operationDate(String operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Es la fecha de operación de la transferencia, formato: dd-MM-yyyy.
   * @return operationDate
  **/
  @Schema(required = true, description = "Es la fecha de operación de la transferencia, formato: dd-MM-yyyy.")
  public String getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(String operationDate) {
    this.operationDate = operationDate;
  }

  public CepSearchBanxico reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Es la referencia numérica de la transferencia. Se valida hasta 7 dígitos.
   * @return reference
  **/
  @Schema(description = "Es la referencia numérica de la transferencia. Se valida hasta 7 dígitos.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CepSearchBanxico senderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * Es la cuenta ordenante, es requerida cuando se no se envía la clave del banco ordenante.
   * @return senderAccount
  **/
  @Schema(description = "Es la cuenta ordenante, es requerida cuando se no se envía la clave del banco ordenante.")
  public String getSenderAccount() {
    return senderAccount;
  }

  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }

  public CepSearchBanxico senderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
    return this;
  }

   /**
   * Es la clave del banco ordenante, es requerida cuando no se envía la cuenta ordenante.  Se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt;
   * @return senderBankKey
  **/
  @Schema(description = "Es la clave del banco ordenante, es requerida cuando no se envía la cuenta ordenante.  Se puede obtener del recurso de las <a href=\"#operation/getAllInstitutionsUsingGET\">instituciones.</a>")
  public String getSenderBankKey() {
    return senderBankKey;
  }

  public void setSenderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CepSearchBanxico cepSearchBanxico = (CepSearchBanxico) o;
    return Objects.equals(this.amount, cepSearchBanxico.amount) &&
        Objects.equals(this.beneficiaryAccount, cepSearchBanxico.beneficiaryAccount) &&
        Objects.equals(this.beneficiaryBankKey, cepSearchBanxico.beneficiaryBankKey) &&
        Objects.equals(this.claveRastreo, cepSearchBanxico.claveRastreo) &&
        Objects.equals(this.operationDate, cepSearchBanxico.operationDate) &&
        Objects.equals(this.reference, cepSearchBanxico.reference) &&
        Objects.equals(this.senderAccount, cepSearchBanxico.senderAccount) &&
        Objects.equals(this.senderBankKey, cepSearchBanxico.senderBankKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryAccount, beneficiaryBankKey, claveRastreo, operationDate, reference, senderAccount, senderBankKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CepSearchBanxico {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    beneficiaryBankKey: ").append(toIndentedString(beneficiaryBankKey)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    senderAccount: ").append(toIndentedString(senderAccount)).append("\n");
    sb.append("    senderBankKey: ").append(toIndentedString(senderBankKey)).append("\n");
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
