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
 * CepResponse
 */


public class CepResponse {
  @SerializedName("account_beneficiary")
  private String accountBeneficiary = null;

  @SerializedName("account_sender")
  private String accountSender = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("beneficiary_bank_key")
  private String beneficiaryBankKey = null;

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

  @SerializedName("sender_bank_key")
  private String senderBankKey = null;

  @SerializedName("sender_name")
  private String senderName = null;

  @SerializedName("sender_rfc")
  private String senderRfc = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("url_zip")
  private String urlZip = null;

  public CepResponse accountBeneficiary(String accountBeneficiary) {
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

  public CepResponse accountSender(String accountSender) {
    this.accountSender = accountSender;
    return this;
  }

   /**
   * Cuenta del ordenante
   * @return accountSender
  **/
  @Schema(description = "Cuenta del ordenante")
  public String getAccountSender() {
    return accountSender;
  }

  public void setAccountSender(String accountSender) {
    this.accountSender = accountSender;
  }

  public CepResponse amount(BigDecimal amount) {
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

  public CepResponse available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Indica si o no el CEP se encuentra disponible
   * @return available
  **/
  @Schema(description = "Indica si o no el CEP se encuentra disponible")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public CepResponse beneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
    return this;
  }

   /**
   * Clave del banco beneficiario
   * @return beneficiaryBankKey
  **/
  @Schema(description = "Clave del banco beneficiario")
  public String getBeneficiaryBankKey() {
    return beneficiaryBankKey;
  }

  public void setBeneficiaryBankKey(String beneficiaryBankKey) {
    this.beneficiaryBankKey = beneficiaryBankKey;
  }

  public CepResponse beneficiaryName(String beneficiaryName) {
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

  public CepResponse beneficiaryRfc(String beneficiaryRfc) {
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

  public CepResponse cadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
    return this;
  }

   /**
   * Cadena original del CEP
   * @return cadenaOriginal
  **/
  @Schema(description = "Cadena original del CEP")
  public String getCadenaOriginal() {
    return cadenaOriginal;
  }

  public void setCadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
  }

  public CepResponse captureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * Fecha de captura de la transferencia
   * @return captureDate
  **/
  @Schema(description = "Fecha de captura de la transferencia")
  public OffsetDateTime getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
  }

  public CepResponse certificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
    return this;
  }

   /**
   * Número de serie del certificado
   * @return certificateSerialNumber
  **/
  @Schema(description = "Número de serie del certificado")
  public String getCertificateSerialNumber() {
    return certificateSerialNumber;
  }

  public void setCertificateSerialNumber(String certificateSerialNumber) {
    this.certificateSerialNumber = certificateSerialNumber;
  }

  public CepResponse claveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
    return this;
  }

   /**
   * Clave de rastreo
   * @return claveRastreo
  **/
  @Schema(description = "Clave de rastreo")
  public String getClaveRastreo() {
    return claveRastreo;
  }

  public void setClaveRastreo(String claveRastreo) {
    this.claveRastreo = claveRastreo;
  }

  public CepResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descripción de la transferencia
   * @return description
  **/
  @Schema(description = "Descripción de la transferencia")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CepResponse iva(BigDecimal iva) {
    this.iva = iva;
    return this;
  }

   /**
   * IVA de la transferencia
   * @return iva
  **/
  @Schema(description = "IVA de la transferencia")
  public BigDecimal getIva() {
    return iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }

  public CepResponse operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Fecha de operación de la transferencia
   * @return operationDate
  **/
  @Schema(description = "Fecha de operación de la transferencia")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }

  public CepResponse operationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
    return this;
  }

   /**
   * Fecha de abono registrada en el CEP
   * @return operationDateCep
  **/
  @Schema(description = "Fecha de abono registrada en el CEP")
  public OffsetDateTime getOperationDateCep() {
    return operationDateCep;
  }

  public void setOperationDateCep(OffsetDateTime operationDateCep) {
    this.operationDateCep = operationDateCep;
  }

  public CepResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referencia numérica de la transferencia
   * @return reference
  **/
  @Schema(description = "Referencia numérica de la transferencia")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CepResponse senderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
    return this;
  }

   /**
   * Clave del banco emisor
   * @return senderBankKey
  **/
  @Schema(description = "Clave del banco emisor")
  public String getSenderBankKey() {
    return senderBankKey;
  }

  public void setSenderBankKey(String senderBankKey) {
    this.senderBankKey = senderBankKey;
  }

  public CepResponse senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Nombre del emisor
   * @return senderName
  **/
  @Schema(description = "Nombre del emisor")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public CepResponse senderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
    return this;
  }

   /**
   * RFC del emisor
   * @return senderRfc
  **/
  @Schema(description = "RFC del emisor")
  public String getSenderRfc() {
    return senderRfc;
  }

  public void setSenderRfc(String senderRfc) {
    this.senderRfc = senderRfc;
  }

  public CepResponse signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Firma del CEP
   * @return signature
  **/
  @Schema(description = "Firma del CEP")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public CepResponse urlZip(String urlZip) {
    this.urlZip = urlZip;
    return this;
  }

   /**
   * La url al archivo zip del CEP, el cual contiene el xml y pdf
   * @return urlZip
  **/
  @Schema(description = "La url al archivo zip del CEP, el cual contiene el xml y pdf")
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
    CepResponse cepResponse = (CepResponse) o;
    return Objects.equals(this.accountBeneficiary, cepResponse.accountBeneficiary) &&
        Objects.equals(this.accountSender, cepResponse.accountSender) &&
        Objects.equals(this.amount, cepResponse.amount) &&
        Objects.equals(this.available, cepResponse.available) &&
        Objects.equals(this.beneficiaryBankKey, cepResponse.beneficiaryBankKey) &&
        Objects.equals(this.beneficiaryName, cepResponse.beneficiaryName) &&
        Objects.equals(this.beneficiaryRfc, cepResponse.beneficiaryRfc) &&
        Objects.equals(this.cadenaOriginal, cepResponse.cadenaOriginal) &&
        Objects.equals(this.captureDate, cepResponse.captureDate) &&
        Objects.equals(this.certificateSerialNumber, cepResponse.certificateSerialNumber) &&
        Objects.equals(this.claveRastreo, cepResponse.claveRastreo) &&
        Objects.equals(this.description, cepResponse.description) &&
        Objects.equals(this.iva, cepResponse.iva) &&
        Objects.equals(this.operationDate, cepResponse.operationDate) &&
        Objects.equals(this.operationDateCep, cepResponse.operationDateCep) &&
        Objects.equals(this.reference, cepResponse.reference) &&
        Objects.equals(this.senderBankKey, cepResponse.senderBankKey) &&
        Objects.equals(this.senderName, cepResponse.senderName) &&
        Objects.equals(this.senderRfc, cepResponse.senderRfc) &&
        Objects.equals(this.signature, cepResponse.signature) &&
        Objects.equals(this.urlZip, cepResponse.urlZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBeneficiary, accountSender, amount, available, beneficiaryBankKey, beneficiaryName, beneficiaryRfc, cadenaOriginal, captureDate, certificateSerialNumber, claveRastreo, description, iva, operationDate, operationDateCep, reference, senderBankKey, senderName, senderRfc, signature, urlZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CepResponse {\n");
    
    sb.append("    accountBeneficiary: ").append(toIndentedString(accountBeneficiary)).append("\n");
    sb.append("    accountSender: ").append(toIndentedString(accountSender)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    beneficiaryBankKey: ").append(toIndentedString(beneficiaryBankKey)).append("\n");
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
    sb.append("    senderBankKey: ").append(toIndentedString(senderBankKey)).append("\n");
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
