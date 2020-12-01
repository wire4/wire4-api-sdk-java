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
import mx.wire4.model.MessageInstitution;
/**
 * El mensaje que se envía mediante (webHook) con la información de un deposito que necesita ser autorizado
 */
@Schema(description = "El mensaje que se envía mediante (webHook) con la información de un deposito que necesita ser autorizado")

public class MessageDepositAuthorizationRequest {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("beneficiary_rfc")
  private String beneficiaryRfc = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("confirm_date")
  private OffsetDateTime confirmDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("deposit_date")
  private OffsetDateTime depositDate = null;

  @SerializedName("depositant")
  private String depositant = null;

  @SerializedName("depositant_clabe")
  private String depositantClabe = null;

  @SerializedName("depositant_email")
  private String depositantEmail = null;

  @SerializedName("depositant_rfc")
  private String depositantRfc = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("monex_description")
  private String monexDescription = null;

  @SerializedName("monex_transaction_id")
  private String monexTransactionId = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sender_account")
  private String senderAccount = null;

  @SerializedName("sender_bank")
  private MessageInstitution senderBank = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  public MessageDepositAuthorizationRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la transferencia
   * @return amount
  **/
  @Schema(description = "Monto de la transferencia")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MessageDepositAuthorizationRequest beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Cuenta del beneficiario
   * @return beneficiaryAccount
  **/
  @Schema(description = "Cuenta del beneficiario")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public MessageDepositAuthorizationRequest beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Nombre del beneficiario
   * @return beneficiaryName
  **/
  @Schema(description = "Nombre del beneficiario")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public MessageDepositAuthorizationRequest beneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
    return this;
  }

   /**
   * RFC del beneficiario
   * @return beneficiaryRfc
  **/
  @Schema(description = "RFC del beneficiario")
  public String getBeneficiaryRfc() {
    return beneficiaryRfc;
  }

  public void setBeneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
  }

  public MessageDepositAuthorizationRequest claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo de la transferencia
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo de la transferencia")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public MessageDepositAuthorizationRequest confirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
    return this;
  }

   /**
   * Fecha de confirmación de la transferencia
   * @return confirmDate
  **/
  @Schema(description = "Fecha de confirmación de la transferencia")
  public OffsetDateTime getConfirmDate() {
    return confirmDate;
  }

  public void setConfirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
  }

  public MessageDepositAuthorizationRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Código de moneda de la transferencia, puede ser MXP, USD
   * @return currencyCode
  **/
  @Schema(description = "Código de moneda de la transferencia, puede ser MXP, USD")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MessageDepositAuthorizationRequest depositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
    return this;
  }

   /**
   * Fecha de recepción de la transferencia
   * @return depositDate
  **/
  @Schema(description = "Fecha de recepción de la transferencia")
  public OffsetDateTime getDepositDate() {
    return depositDate;
  }

  public void setDepositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
  }

  public MessageDepositAuthorizationRequest depositant(String depositant) {
    this.depositant = depositant;
    return this;
  }

   /**
   * Nombre del depositante, en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositant
  **/
  @Schema(description = "Nombre del depositante, en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositant() {
    return depositant;
  }

  public void setDepositant(String depositant) {
    this.depositant = depositant;
  }

  public MessageDepositAuthorizationRequest depositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
    return this;
  }

   /**
   * CLABE del depositante, en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositantClabe
  **/
  @Schema(description = "CLABE del depositante, en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositantClabe() {
    return depositantClabe;
  }

  public void setDepositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
  }

  public MessageDepositAuthorizationRequest depositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
    return this;
  }

   /**
   * Correo electrónico del depositante, en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositantEmail
  **/
  @Schema(description = "Correo electrónico del depositante, en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositantEmail() {
    return depositantEmail;
  }

  public void setDepositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
  }

  public MessageDepositAuthorizationRequest depositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
    return this;
  }

   /**
   * RFC del depositante, en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositantRfc
  **/
  @Schema(description = "RFC del depositante, en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositantRfc() {
    return depositantRfc;
  }

  public void setDepositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
  }

  public MessageDepositAuthorizationRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Concepto de la transferencia
   * @return description
  **/
  @Schema(description = "Concepto de la transferencia")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MessageDepositAuthorizationRequest monexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
    return this;
  }

   /**
   * Descripción de Monex para la transferencia
   * @return monexDescription
  **/
  @Schema(description = "Descripción de Monex para la transferencia")
  public String getMonexDescription() {
    return monexDescription;
  }

  public void setMonexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
  }

  public MessageDepositAuthorizationRequest monexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
    return this;
  }

   /**
   * Identificador asignado por Monex a la transferencia
   * @return monexTransactionId
  **/
  @Schema(description = "Identificador asignado por Monex a la transferencia")
  public String getMonexTransactionId() {
    return monexTransactionId;
  }

  public void setMonexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
  }

  public MessageDepositAuthorizationRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referecia de la transferencia
   * @return reference
  **/
  @Schema(description = "Referecia de la transferencia")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MessageDepositAuthorizationRequest senderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * Cuenta del ordenante, podría ser un número celular, TDD o Cuenta CLABE interbancaria
   * @return senderAccount
  **/
  @Schema(description = "Cuenta del ordenante, podría ser un número celular, TDD o Cuenta CLABE interbancaria")
  public String getSenderAccount() {
    return senderAccount;
  }

  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }

  public MessageDepositAuthorizationRequest senderBank(MessageInstitution senderBank) {
    this.senderBank = senderBank;
    return this;
  }

   /**
   * Get senderBank
   * @return senderBank
  **/
  @Schema(description = "")
  public MessageInstitution getSenderBank() {
    return senderBank;
  }

  public void setSenderBank(MessageInstitution senderBank) {
    this.senderBank = senderBank;
  }

  public MessageDepositAuthorizationRequest senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Nombre del ordenante
   * @return senderName
  **/
  @Schema(description = "Nombre del ordenante")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public MessageDepositAuthorizationRequest senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * RFC del ordenante
   * @return senderRfc
  **/
  @Schema(description = "RFC del ordenante")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDepositAuthorizationRequest messageDepositAuthorizationRequest = (MessageDepositAuthorizationRequest) o;
    return Objects.equals(this.amount, messageDepositAuthorizationRequest.amount) &&
        Objects.equals(this.beneficiaryAccount, messageDepositAuthorizationRequest.beneficiaryAccount) &&
        Objects.equals(this.beneficiaryName, messageDepositAuthorizationRequest.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, messageDepositAuthorizationRequest.beneficiaryRfc) &&
        Objects.equals(this.claveRastreo, messageDepositAuthorizationRequest.claveRastreo) &&
        Objects.equals(this.confirmDate, messageDepositAuthorizationRequest.confirmDate) &&
        Objects.equals(this.currencyCode, messageDepositAuthorizationRequest.currencyCode) &&
        Objects.equals(this.depositDate, messageDepositAuthorizationRequest.depositDate) &&
        Objects.equals(this.depositant, messageDepositAuthorizationRequest.depositant) &&
        Objects.equals(this.depositantClabe, messageDepositAuthorizationRequest.depositantClabe) &&
        Objects.equals(this.depositantEmail, messageDepositAuthorizationRequest.depositantEmail) &&
        Objects.equals(this.depositantRfc, messageDepositAuthorizationRequest.depositantRfc) &&
        Objects.equals(this.description, messageDepositAuthorizationRequest.description) &&
        Objects.equals(this.monexDescription, messageDepositAuthorizationRequest.monexDescription) &&
        Objects.equals(this.monexTransactionId, messageDepositAuthorizationRequest.monexTransactionId) &&
        Objects.equals(this.reference, messageDepositAuthorizationRequest.reference) &&
        Objects.equals(this.senderAccount, messageDepositAuthorizationRequest.senderAccount) &&
        Objects.equals(this.senderBank, messageDepositAuthorizationRequest.senderBank) &&
        Objects.equals(this.senderName, messageDepositAuthorizationRequest.senderName) &&
        Objects.equals(this.senderRfc, messageDepositAuthorizationRequest.senderRfc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryAccount, beneficiaryName, beneficiaryRfc, claveRastreo, confirmDate, currencyCode, depositDate, depositant, depositantClabe, depositantEmail, depositantRfc, description, monexDescription, monexTransactionId, reference, senderAccount, senderBank, senderName, senderRfc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDepositAuthorizationRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    depositDate: ").append(toIndentedString(depositDate)).append("\n");
    sb.append("    depositant: ").append(toIndentedString(depositant)).append("\n");
    sb.append("    depositantClabe: ").append(toIndentedString(depositantClabe)).append("\n");
    sb.append("    depositantEmail: ").append(toIndentedString(depositantEmail)).append("\n");
    sb.append("    depositantRfc: ").append(toIndentedString(depositantRfc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monexDescription: ").append(toIndentedString(monexDescription)).append("\n");
    sb.append("    monexTransactionId: ").append(toIndentedString(monexTransactionId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    senderAccount: ").append(toIndentedString(senderAccount)).append("\n");
    sb.append("    senderBank: ").append(toIndentedString(senderBank)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderRfc: ").append(toIndentedString(senderRfc)).append("\n");
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
