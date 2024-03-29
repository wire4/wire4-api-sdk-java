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
import java.util.ArrayList;
import java.util.List;
/**
 * Objeto que contiene la información de una transferencia SPID® de salida.
 */
@Schema(description = "Objeto que contiene la información de una transferencia SPID® de salida.")


public class TransactionOutgoingSpid {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("cancel_return_url")
  private String cancelReturnUrl = null;

  @SerializedName("classification_id")
  private String classificationId = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("email")
  private List<String> email = null;

  @SerializedName("numeric_reference_spid")
  private Integer numericReferenceSpid = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("payment_concept_spid")
  private String paymentConceptSpid = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  public TransactionOutgoingSpid amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Es el monto de la transferencia. Se valida que sean máximo 20 dígitos y 2 decimales. Ejemplo 1000.00
   * minimum: 0
   * @return amount
  **/
  @Schema(required = true, description = "Es el monto de la transferencia. Se valida que sean máximo 20 dígitos y 2 decimales. Ejemplo 1000.00")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionOutgoingSpid beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Cuenta del beneficiario, podría ser un número celular (10dígitos), tarjeta de débito (TDD) o Cuenta CLABE interbancaria (18 dígitos). 
   * @return beneficiaryAccount
  **/
  @Schema(example = "cellphone: 5525072600, TDD: 4323 1234 5678 9123, clabe: 032180000118359719", required = true, description = "Cuenta del beneficiario, podría ser un número celular (10dígitos), tarjeta de débito (TDD) o Cuenta CLABE interbancaria (18 dígitos). ")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public TransactionOutgoingSpid cancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
    return this;
  }

   /**
   * Es la dirección URL a la que se redirigirá en caso de que el usario cancele el registro.
   * @return cancelReturnUrl
  **/
  @Schema(required = true, description = "Es la dirección URL a la que se redirigirá en caso de que el usario cancele el registro.")
  public String getCancelReturnUrl() {
    return cancelReturnUrl;
  }

  public void setCancelReturnUrl(String cancelReturnUrl) {
    this.cancelReturnUrl = cancelReturnUrl;
  }

  public TransactionOutgoingSpid classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

   /**
   * Es el identificador de la clasificación de la transferencia SPID.
   * @return classificationId
  **/
  @Schema(required = true, description = "Es el identificador de la clasificación de la transferencia SPID.")
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }

  public TransactionOutgoingSpid currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Código de moneda en la que opera la cuenta.
   * @return currencyCode
  **/
  @Schema(required = true, description = "Código de moneda en la que opera la cuenta.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TransactionOutgoingSpid email(List<String> email) {
    this.email = email;
    return this;
  }

  public TransactionOutgoingSpid addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Lista de correo electrónico (email) del beneficiario. Este campo es opcional.
   * @return email
  **/
  @Schema(description = "Lista de correo electrónico (email) del beneficiario. Este campo es opcional.")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }

  public TransactionOutgoingSpid numericReferenceSpid(Integer numericReferenceSpid) {
    this.numericReferenceSpid = numericReferenceSpid;
    return this;
  }

   /**
   * Es la referencia numérica de la transferencia.
   * minimum: 0
   * maximum: 9999999
   * @return numericReferenceSpid
  **/
  @Schema(required = true, description = "Es la referencia numérica de la transferencia.")
  public Integer getNumericReferenceSpid() {
    return numericReferenceSpid;
  }

  public void setNumericReferenceSpid(Integer numericReferenceSpid) {
    this.numericReferenceSpid = numericReferenceSpid;
  }

  public TransactionOutgoingSpid orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Es la referencia de la transferencia asignada por el cliente. Ejemplo: dae9c6ae-8c7a-42e8-99f4-ebe90566efae
   * @return orderId
  **/
  @Schema(example = "dae9c6ae-8c7a-42e8-99f4-ebe90566efae", required = true, description = "Es la referencia de la transferencia asignada por el cliente. Ejemplo: dae9c6ae-8c7a-42e8-99f4-ebe90566efae")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TransactionOutgoingSpid paymentConceptSpid(String paymentConceptSpid) {
    this.paymentConceptSpid = paymentConceptSpid;
    return this;
  }

   /**
   * Es el concepto de la transferencia.
   * @return paymentConceptSpid
  **/
  @Schema(required = true, description = "Es el concepto de la transferencia.")
  public String getPaymentConceptSpid() {
    return paymentConceptSpid;
  }

  public void setPaymentConceptSpid(String paymentConceptSpid) {
    this.paymentConceptSpid = paymentConceptSpid;
  }

  public TransactionOutgoingSpid returnUrl(String returnUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionOutgoingSpid transactionOutgoingSpid = (TransactionOutgoingSpid) o;
    return Objects.equals(this.amount, transactionOutgoingSpid.amount) &&
        Objects.equals(this.beneficiaryAccount, transactionOutgoingSpid.beneficiaryAccount) &&
        Objects.equals(this.cancelReturnUrl, transactionOutgoingSpid.cancelReturnUrl) &&
        Objects.equals(this.classificationId, transactionOutgoingSpid.classificationId) &&
        Objects.equals(this.currencyCode, transactionOutgoingSpid.currencyCode) &&
        Objects.equals(this.email, transactionOutgoingSpid.email) &&
        Objects.equals(this.numericReferenceSpid, transactionOutgoingSpid.numericReferenceSpid) &&
        Objects.equals(this.orderId, transactionOutgoingSpid.orderId) &&
        Objects.equals(this.paymentConceptSpid, transactionOutgoingSpid.paymentConceptSpid) &&
        Objects.equals(this.returnUrl, transactionOutgoingSpid.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryAccount, cancelReturnUrl, classificationId, currencyCode, email, numericReferenceSpid, orderId, paymentConceptSpid, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionOutgoingSpid {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    cancelReturnUrl: ").append(toIndentedString(cancelReturnUrl)).append("\n");
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    numericReferenceSpid: ").append(toIndentedString(numericReferenceSpid)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentConceptSpid: ").append(toIndentedString(paymentConceptSpid)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
