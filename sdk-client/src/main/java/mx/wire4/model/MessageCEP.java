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
 * El CEP emitido por Banxico de la transferencia. Solo cuando este disponible, en otro caso se podrá usar la Consulta de CEP que esta misma API ofrece
 */
@Schema(description = "El CEP emitido por Banxico de la transferencia. Solo cuando este disponible, en otro caso se podrá usar la Consulta de CEP que esta misma API ofrece")

public class MessageCEP {
  @SerializedName("account_beneficiary")
  private String accountBeneficiary = null;

  @SerializedName("account_sender")
  private String accountSender = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("bank_beneficiary")
  private String bankBeneficiary = null;

  @SerializedName("bank_sender")
  private String bankSender = null;

  @SerializedName("beneficiary_name")
  private String beneficiaryName = null;

  @SerializedName("beneficiary_rfc")
  private String beneficiaryRfc = null;

  @SerializedName("cadena_original")
  private String cadenaOriginal = null;

  @SerializedName("capture_date")
  private OffsetDateTime captureDate = null;

  @SerializedName("certificate_serial_number")
  private String certificateSerialNumber = null;

  @SerializedName("clave_rastreo")
  private String claveRastreo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("iva")
  private BigDecimal iva = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  @SerializedName("operation_date_cep")
  private OffsetDateTime operationDateCep = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("url_zip")
  private String urlZip = null;

  public MessageCEP accountBeneficiary(String accountBeneficiary) {
    this.accountBeneficiary = accountBeneficiary;
    return this;
  }

   /**
   * Cuenta del beneficiario
   * @return accountBeneficiary
  **/
  @Schema(description = "Cuenta del beneficiario")
  public String getAccountBeneficiary() {
    return accountBeneficiary;
  }

  public void setAccountBeneficiary(String accountBeneficiary) {
    this.accountBeneficiary = accountBeneficiary;
  }

  public MessageCEP accountSender(String accountSender) {
    this.accountSender = accountSender;
    return this;
  }

   /**
   * Cuenta que envia la operación
   * @return accountSender
  **/
  @Schema(description = "Cuenta que envia la operación")
  public String getAccountSender() {
    return accountSender;
  }

  public void setAccountSender(String accountSender) {
    this.accountSender = accountSender;
  }

  public MessageCEP amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto de la operación
   * @return amount
  **/
  @Schema(description = "Monto de la operación")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MessageCEP available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Bander para saber si el cep esta disponible
   * @return available
  **/
  @Schema(description = "Bander para saber si el cep esta disponible")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public MessageCEP bankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
    return this;
  }

   /**
   * Clave del banco beneficiario
   * @return bankBeneficiary
  **/
  @Schema(description = "Clave del banco beneficiario")
  public String getBankBeneficiary() {
    return bankBeneficiary;
  }

  public void setBankBeneficiary(String bankBeneficiary) {
    this.bankBeneficiary = bankBeneficiary;
  }

  public MessageCEP bankSender(String bankSender) {
    this.bankSender = bankSender;
    return this;
  }

   /**
   * Clave del banco que envia la operación
   * @return bankSender
  **/
  @Schema(description = "Clave del banco que envia la operación")
  public String getBankSender() {
    return bankSender;
  }

  public void setBankSender(String bankSender) {
    this.bankSender = bankSender;
  }

  public MessageCEP beneficiaryName(String beneficiaryName) {
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

  public MessageCEP beneficiaryRfc(String beneficiaryRfc) {
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

  public MessageCEP cadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
    return this;
  }

   /**
   * Cadena original emita por el SAT
   * @return cadenaOriginal
  **/
  @Schema(description = "Cadena original emita por el SAT")
  public String getCadenaOriginal() {
    return cadenaOriginal;
  }

  public void setCadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
  }

  public MessageCEP captureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * Fecha de captura
   * @return captureDate
  **/
  @Schema(description = "Fecha de captura")
  public OffsetDateTime getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
  }

  public MessageCEP certificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
    return this;
  }

   /**
   * Numero de serie emitido por el SAT
   * @return certificateSerialNumber
  **/
  @Schema(description = "Numero de serie emitido por el SAT")
  public String getCertificateSerialNumber() {
    return certificateSerialNumber;
  }

  public void setCertificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
  }

  public MessageCEP claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo de la operación
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo de la operación")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public MessageCEP description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descripción de la operación
   * @return description
  **/
  @Schema(description = "Descripción de la operación")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MessageCEP iva(BigDecimal iva) {
    this.iva = iva;
    return this;
  }

   /**
   * Iva de la operación
   * @return iva
  **/
  @Schema(description = "Iva de la operación")
  public BigDecimal getIva() {
    return iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }

  public MessageCEP operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha en la que se realizó la operación
   * @return operationDate
  **/
  @Schema(description = "Fecha en la que se realizó la operación")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public MessageCEP operationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
    return this;
  }

   /**
   * Fecha en la que genera el cep
   * @return operationDateCep
  **/
  @Schema(description = "Fecha en la que genera el cep")
  public OffsetDateTime getOperationDateCep() {
    return operationDateCep;
  }

  public void setOperationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
  }

  public MessageCEP reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referencia de la operación
   * @return reference
  **/
  @Schema(description = "Referencia de la operación")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MessageCEP senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Nombre de quien envia la operación
   * @return senderName
  **/
  @Schema(description = "Nombre de quien envia la operación")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public MessageCEP senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * RFC de quien envia la operación
   * @return senderRfc
  **/
  @Schema(description = "RFC de quien envia la operación")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }

  public MessageCEP signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Firma del Cep
   * @return signature
  **/
  @Schema(description = "Firma del Cep")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public MessageCEP urlZip(String urlZip) {
    this.urlZip = urlZip;
    return this;
  }

   /**
   * Url que contiene el PDF y XML del CEP proporcionado por banxico
   * @return urlZip
  **/
  @Schema(description = "Url que contiene el PDF y XML del CEP proporcionado por banxico")
  public String getUrlZip() {
    return urlZip;
  }

  public void setUrlZip(String urlZip) {
    this.urlZip = urlZip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageCEP messageCEP = (MessageCEP) o;
    return Objects.equals(this.accountBeneficiary, messageCEP.accountBeneficiary) &&
        Objects.equals(this.accountSender, messageCEP.accountSender) &&
        Objects.equals(this.amount, messageCEP.amount) &&
        Objects.equals(this.available, messageCEP.available) &&
        Objects.equals(this.bankBeneficiary, messageCEP.bankBeneficiary) &&
        Objects.equals(this.bankSender, messageCEP.bankSender) &&
        Objects.equals(this.beneficiaryName, messageCEP.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, messageCEP.beneficiaryRfc) &&
        Objects.equals(this.cadenaOriginal, messageCEP.cadenaOriginal) &&
        Objects.equals(this.captureDate, messageCEP.captureDate) &&
        Objects.equals(this.certificateSerialNumber, messageCEP.certificateSerialNumber) &&
        Objects.equals(this.claveRastreo, messageCEP.claveRastreo) &&
        Objects.equals(this.description, messageCEP.description) &&
        Objects.equals(this.iva, messageCEP.iva) &&
        Objects.equals(this.operationDate, messageCEP.operationDate) &&
        Objects.equals(this.operationDateCep, messageCEP.operationDateCep) &&
        Objects.equals(this.reference, messageCEP.reference) &&
        Objects.equals(this.senderName, messageCEP.senderName) &&
        Objects.equals(this.senderRfc, messageCEP.senderRfc) &&
        Objects.equals(this.signature, messageCEP.signature) &&
        Objects.equals(this.urlZip, messageCEP.urlZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBeneficiary, accountSender, amount, available, bankBeneficiary, bankSender, beneficiaryName, beneficiaryRfc, cadenaOriginal, captureDate, certificateSerialNumber, claveRastreo, description, iva, operationDate, operationDateCep, reference, senderName, senderRfc, signature, urlZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCEP {\n");
    
    sb.append("    accountBeneficiary: ").append(toIndentedString(accountBeneficiary)).append("\n");
    sb.append("    accountSender: ").append(toIndentedString(accountSender)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    bankBeneficiary: ").append(toIndentedString(bankBeneficiary)).append("\n");
    sb.append("    bankSender: ").append(toIndentedString(bankSender)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    cadenaOriginal: ").append(toIndentedString(cadenaOriginal)).append("\n");
    sb.append("    captureDate: ").append(toIndentedString(captureDate)).append("\n");
    sb.append("    certificateSerialNumber: ").append(toIndentedString(certificateSerialNumber)).append("\n");
    sb.append("    claveRastreo: ").append(toIndentedString(claveRastreo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    operationDateCep: ").append(toIndentedString(operationDateCep)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderRfc: ").append(toIndentedString(senderRfc)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    urlZip: ").append(toIndentedString(urlZip)).append("\n");
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