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
import mx.wire4.model.MessageCEP;
import mx.wire4.model.MessageInstitution;
/**
 * Es el objeto del mensaje que se envía mediante webhook con la información de una transferencia de entrada recibida.
 */
@Schema(description = "Es el objeto del mensaje que se envía mediante webhook con la información de una transferencia de entrada recibida.")


public class MessageDepositReceived {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("beneficiary_rfc")
  private String beneficiaryRfc = null;

  @SerializedName("cep")
  private MessageCEP cep = null;

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

  @SerializedName("depositant_alias")
  private String depositantAlias = null;

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

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("return_id_instruction")
  private Integer returnIdInstruction = null;

  @SerializedName("sender_account")
  private String senderAccount = null;

  @SerializedName("sender_bank")
  private MessageInstitution senderBank = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  public MessageDepositReceived amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto de la transferencia.
   * @return amount
  **/
  @Schema(description = "Es el monto de la transferencia.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MessageDepositReceived beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Es la cuenta del beneficiario.
   * @return beneficiaryAccount
  **/
  @Schema(description = "Es la cuenta del beneficiario.")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public MessageDepositReceived beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Es el nombre del beneficiario.
   * @return beneficiaryName
  **/
  @Schema(description = "Es el nombre del beneficiario.")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public MessageDepositReceived beneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
    return this;
  }

   /**
   * Es el Registro Federal de Contribuyentes (RFC) del beneficiario.
   * @return beneficiaryRfc
  **/
  @Schema(description = "Es el Registro Federal de Contribuyentes (RFC) del beneficiario.")
  public String getBeneficiaryRfc() {
    return beneficiaryRfc;
  }

  public void setBeneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
  }

  public MessageDepositReceived cep(MessageCEP cep) {
    this.cep = cep;
    return this;
  }

   /**
   * Get cep
   * @return cep
  **/
  @Schema(description = "")
  public MessageCEP getCep() {
    return cep;
  }

  public void setCep(MessageCEP cep) {
    this.cep = cep;
  }

  public MessageDepositReceived claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Es la clave de rastreo de la transferencia.
   * @return claveRastreo
  **/
  @Schema(description = "Es la clave de rastreo de la transferencia.")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public MessageDepositReceived confirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
    return this;
  }

   /**
   * Es la Fecha de confirmación de la transferencia.
   * @return confirmDate
  **/
  @Schema(description = "Es la Fecha de confirmación de la transferencia.")
  public OffsetDateTime getConfirmDate() {
    return confirmDate;
  }

  public void setConfirmDate(OffsetDateTime confirmDate) {
    this.confirmDate = confirmDate;
  }

  public MessageDepositReceived currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Es el código de divisa de la transferencia. Es en el formato estándar ISO 4217 y es de 3 dígitos. Puede ser \&quot;MXN\&quot; o \&quot;USD\&quot;.
   * @return currencyCode
  **/
  @Schema(description = "Es el código de divisa de la transferencia. Es en el formato estándar ISO 4217 y es de 3 dígitos. Puede ser \"MXN\" o \"USD\".")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MessageDepositReceived depositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
    return this;
  }

   /**
   * Es la fecha de recepción de la transferencia.
   * @return depositDate
  **/
  @Schema(description = "Es la fecha de recepción de la transferencia.")
  public OffsetDateTime getDepositDate() {
    return depositDate;
  }

  public void setDepositDate(OffsetDateTime depositDate) {
    this.depositDate = depositDate;
  }

  public MessageDepositReceived depositant(String depositant) {
    this.depositant = depositant;
    return this;
  }

   /**
   * Es el nombre del depositante en caso de que la transferencia se reciba en una cuenta de depositante.
   * @return depositant
  **/
  @Schema(description = "Es el nombre del depositante en caso de que la transferencia se reciba en una cuenta de depositante.")
  public String getDepositant() {
    return depositant;
  }

  public void setDepositant(String depositant) {
    this.depositant = depositant;
  }

  public MessageDepositReceived depositantAlias(String depositantAlias) {
    this.depositantAlias = depositantAlias;
    return this;
  }

   /**
   * Es el alias de la cuenta CLABE del depositante en caso que la transferencia se reciba de una cuenta de depositante
   * @return depositantAlias
  **/
  @Schema(description = "Es el alias de la cuenta CLABE del depositante en caso que la transferencia se reciba de una cuenta de depositante")
  public String getDepositantAlias() {
    return depositantAlias;
  }

  public void setDepositantAlias(String depositantAlias) {
    this.depositantAlias = depositantAlias;
  }

  public MessageDepositReceived depositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
    return this;
  }

   /**
   * Es la cuenta CLABE del depositante en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositantClabe
  **/
  @Schema(description = "Es la cuenta CLABE del depositante en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositantClabe() {
    return depositantClabe;
  }

  public void setDepositantClabe(String depositantClabe) {
    this.depositantClabe = depositantClabe;
  }

  public MessageDepositReceived depositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
    return this;
  }

   /**
   * Es el Correo electrónico (email) del depositante en caso que la transferencia se reciba en una cuenta de depositante
   * @return depositantEmail
  **/
  @Schema(description = "Es el Correo electrónico (email) del depositante en caso que la transferencia se reciba en una cuenta de depositante")
  public String getDepositantEmail() {
    return depositantEmail;
  }

  public void setDepositantEmail(String depositantEmail) {
    this.depositantEmail = depositantEmail;
  }

  public MessageDepositReceived depositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
    return this;
  }

   /**
   * Es el Registro Federal de Contribuyentes (RFC) del depositante, en caso que la transferencia se reciba en una cuenta de depositante.
   * @return depositantRfc
  **/
  @Schema(description = "Es el Registro Federal de Contribuyentes (RFC) del depositante, en caso que la transferencia se reciba en una cuenta de depositante.")
  public String getDepositantRfc() {
    return depositantRfc;
  }

  public void setDepositantRfc(String depositantRfc) {
    this.depositantRfc = depositantRfc;
  }

  public MessageDepositReceived description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Es el concepto de la transferencia.
   * @return description
  **/
  @Schema(description = "Es el concepto de la transferencia.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MessageDepositReceived monexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
    return this;
  }

   /**
   * Es la descripción de Monex para la transferencia.
   * @return monexDescription
  **/
  @Schema(description = "Es la descripción de Monex para la transferencia.")
  public String getMonexDescription() {
    return monexDescription;
  }

  public void setMonexDescription(String monexDescription) {
    this.monexDescription = monexDescription;
  }

  public MessageDepositReceived monexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
    return this;
  }

   /**
   * Es el identificador asignado por Monex a la transferencia.
   * @return monexTransactionId
  **/
  @Schema(description = "Es el identificador asignado por Monex a la transferencia.")
  public String getMonexTransactionId() {
    return monexTransactionId;
  }

  public void setMonexTransactionId(String monexTransactionId) {
    this.monexTransactionId = monexTransactionId;
  }

  public MessageDepositReceived orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Número de orden asignado por el cliente de Wire4
   * @return orderId
  **/
  @Schema(description = "Número de orden asignado por el cliente de Wire4")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public MessageDepositReceived reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Es la referecia de la transferencia.
   * @return reference
  **/
  @Schema(description = "Es la referecia de la transferencia.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MessageDepositReceived requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Es el identificador de la solicitud de cobro establecido por la aplicación.
   * @return requestId
  **/
  @Schema(description = "Es el identificador de la solicitud de cobro establecido por la aplicación.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public MessageDepositReceived returnIdInstruction(Integer returnIdInstruction) {
    this.returnIdInstruction = returnIdInstruction;
    return this;
  }

   /**
   * Es el id de devolucion de la transaccion.
   * @return returnIdInstruction
  **/
  @Schema(description = "Es el id de devolucion de la transaccion.")
  public Integer getReturnIdInstruction() {
    return returnIdInstruction;
  }

  public void setReturnIdInstruction(Integer returnIdInstruction) {
    this.returnIdInstruction = returnIdInstruction;
  }

  public MessageDepositReceived senderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * Es la cuenta del ordenante que podría ser un número celular (10 dígitos), una tarjeta de débito (TDD, de 16 dígitos) o Cuenta CLABE interbancaria (18 dígitos).
   * @return senderAccount
  **/
  @Schema(description = "Es la cuenta del ordenante que podría ser un número celular (10 dígitos), una tarjeta de débito (TDD, de 16 dígitos) o Cuenta CLABE interbancaria (18 dígitos).")
  public String getSenderAccount() {
    return senderAccount;
  }

  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }

  public MessageDepositReceived senderBank(MessageInstitution senderBank) {
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

  public MessageDepositReceived senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Es el nombre del ordenante.
   * @return senderName
  **/
  @Schema(description = "Es el nombre del ordenante.")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public MessageDepositReceived senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * Es el Registro Federal de Contribuyente (RFC) del ordenante.
   * @return senderRfc
  **/
  @Schema(description = "Es el Registro Federal de Contribuyente (RFC) del ordenante.")
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
    MessageDepositReceived messageDepositReceived = (MessageDepositReceived) o;
    return Objects.equals(this.amount, messageDepositReceived.amount) &&
        Objects.equals(this.beneficiaryAccount, messageDepositReceived.beneficiaryAccount) &&
        Objects.equals(this.beneficiaryName, messageDepositReceived.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, messageDepositReceived.beneficiaryRfc) &&
        Objects.equals(this.cep, messageDepositReceived.cep) &&
        Objects.equals(this.claveRastreo, messageDepositReceived.claveRastreo) &&
        Objects.equals(this.confirmDate, messageDepositReceived.confirmDate) &&
        Objects.equals(this.currencyCode, messageDepositReceived.currencyCode) &&
        Objects.equals(this.depositDate, messageDepositReceived.depositDate) &&
        Objects.equals(this.depositant, messageDepositReceived.depositant) &&
        Objects.equals(this.depositantAlias, messageDepositReceived.depositantAlias) &&
        Objects.equals(this.depositantClabe, messageDepositReceived.depositantClabe) &&
        Objects.equals(this.depositantEmail, messageDepositReceived.depositantEmail) &&
        Objects.equals(this.depositantRfc, messageDepositReceived.depositantRfc) &&
        Objects.equals(this.description, messageDepositReceived.description) &&
        Objects.equals(this.monexDescription, messageDepositReceived.monexDescription) &&
        Objects.equals(this.monexTransactionId, messageDepositReceived.monexTransactionId) &&
        Objects.equals(this.orderId, messageDepositReceived.orderId) &&
        Objects.equals(this.reference, messageDepositReceived.reference) &&
        Objects.equals(this.requestId, messageDepositReceived.requestId) &&
        Objects.equals(this.returnIdInstruction, messageDepositReceived.returnIdInstruction) &&
        Objects.equals(this.senderAccount, messageDepositReceived.senderAccount) &&
        Objects.equals(this.senderBank, messageDepositReceived.senderBank) &&
        Objects.equals(this.senderName, messageDepositReceived.senderName) &&
        Objects.equals(this.senderRfc, messageDepositReceived.senderRfc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryAccount, beneficiaryName, beneficiaryRfc, cep, claveRastreo, confirmDate, currencyCode, depositDate, depositant, depositantAlias, depositantClabe, depositantEmail, depositantRfc, description, monexDescription, monexTransactionId, orderId, reference, requestId, returnIdInstruction, senderAccount, senderBank, senderName, senderRfc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDepositReceived {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    confirmDate: ").append(toIndentedString(confirmDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    depositDate: ").append(toIndentedString(depositDate)).append("\n");
    sb.append("    depositant: ").append(toIndentedString(depositant)).append("\n");
    sb.append("    depositantAlias: ").append(toIndentedString(depositantAlias)).append("\n");
    sb.append("    depositantClabe: ").append(toIndentedString(depositantClabe)).append("\n");
    sb.append("    depositantEmail: ").append(toIndentedString(depositantEmail)).append("\n");
    sb.append("    depositantRfc: ").append(toIndentedString(depositantRfc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    monexDescription: ").append(toIndentedString(monexDescription)).append("\n");
    sb.append("    monexTransactionId: ").append(toIndentedString(monexTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    returnIdInstruction: ").append(toIndentedString(returnIdInstruction)).append("\n");
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
