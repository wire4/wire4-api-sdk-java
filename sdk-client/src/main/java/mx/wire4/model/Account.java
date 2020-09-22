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
import mx.wire4.model.BeneficiaryInstitution;
import mx.wire4.model.Person;
/**
 * Objeto que contiene información de la cuenta
 */
@Schema(description = "Objeto que contiene información de la cuenta")

public class Account {
  @SerializedName("amount_limit")
  private BigDecimal amountLimit = null;

  @SerializedName("bank_key")
  private String bankKey = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("email")
  private List<String> email = null;

  @SerializedName("institution")
  private BeneficiaryInstitution institution = null;

  @SerializedName("kind_of_relationship")
  private String kindOfRelationship = null;

  @SerializedName("numeric_reference_spei")
  private String numericReferenceSpei = null;

  @SerializedName("payment_concept_spei")
  private String paymentConceptSpei = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("rfc")
  private String rfc = null;

  public Account amountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Monto límite permitido registrado para la cuenta
   * @return amountLimit
  **/
  @Schema(example = "10000.0", required = true, description = "Monto límite permitido registrado para la cuenta")
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }

  public Account bankKey(String bankKey) {
    this.bankKey = bankKey;
    return this;
  }

   /**
   * Clave del banco, es requerido en caso de que la cuenta del beneficiario sea un número de celular
   * @return bankKey
  **/
  @Schema(description = "Clave del banco, es requerido en caso de que la cuenta del beneficiario sea un número de celular")
  public String getBankKey() {
    return bankKey;
  }

  public void setBankKey(String bankKey) {
    this.bankKey = bankKey;
  }

  public Account beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Cuenta del beneficiario, podría ser teléfono celular, TDD o cuenta CLABE
   * @return beneficiaryAccount
  **/
  @Schema(example = "Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719", required = true, description = "Cuenta del beneficiario, podría ser teléfono celular, TDD o cuenta CLABE")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public Account email(List<String> email) {
    this.email = email;
    return this;
  }

  public Account addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Lista de email&#x27;s, este dato es opcional
   * @return email
  **/
  @Schema(description = "Lista de email's, este dato es opcional")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }

  public Account institution(BeneficiaryInstitution institution) {
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @Schema(description = "")
  public BeneficiaryInstitution getInstitution() {
    return institution;
  }

  public void setInstitution(BeneficiaryInstitution institution) {
    this.institution = institution;
  }

  public Account kindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
    return this;
  }

   /**
   * Tipo de relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.
   * @return kindOfRelationship
  **/
  @Schema(required = true, description = "Tipo de relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. <br> Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.")
  public String getKindOfRelationship() {
    return kindOfRelationship;
  }

  public void setKindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
  }

  public Account numericReferenceSpei(String numericReferenceSpei) {
    this.numericReferenceSpei = numericReferenceSpei;
    return this;
  }

   /**
   * Referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia
   * @return numericReferenceSpei
  **/
  @Schema(description = "Referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia")
  public String getNumericReferenceSpei() {
    return numericReferenceSpei;
  }

  public void setNumericReferenceSpei(String numericReferenceSpei) {
    this.numericReferenceSpei = numericReferenceSpei;
  }

  public Account paymentConceptSpei(String paymentConceptSpei) {
    this.paymentConceptSpei = paymentConceptSpei;
    return this;
  }

   /**
   * Concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto
   * @return paymentConceptSpei
  **/
  @Schema(description = "Concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto")
  public String getPaymentConceptSpei() {
    return paymentConceptSpei;
  }

  public void setPaymentConceptSpei(String paymentConceptSpei) {
    this.paymentConceptSpei = paymentConceptSpei;
  }

  public Account person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @Schema(description = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Account relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.
   * @return relationship
  **/
  @Schema(required = true, description = "Relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. <br> Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public Account rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

   /**
   * Registro federal de contribuyentes de la persona o institución propietaria de la cuenta. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.
   * @return rfc
  **/
  @Schema(required = true, description = "Registro federal de contribuyentes de la persona o institución propietaria de la cuenta. <br> Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.")
  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.amountLimit, account.amountLimit) &&
        Objects.equals(this.bankKey, account.bankKey) &&
        Objects.equals(this.beneficiaryAccount, account.beneficiaryAccount) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.institution, account.institution) &&
        Objects.equals(this.kindOfRelationship, account.kindOfRelationship) &&
        Objects.equals(this.numericReferenceSpei, account.numericReferenceSpei) &&
        Objects.equals(this.paymentConceptSpei, account.paymentConceptSpei) &&
        Objects.equals(this.person, account.person) &&
        Objects.equals(this.relationship, account.relationship) &&
        Objects.equals(this.rfc, account.rfc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountLimit, bankKey, beneficiaryAccount, email, institution, kindOfRelationship, numericReferenceSpei, paymentConceptSpei, person, relationship, rfc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    bankKey: ").append(toIndentedString(bankKey)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    kindOfRelationship: ").append(toIndentedString(kindOfRelationship)).append("\n");
    sb.append("    numericReferenceSpei: ").append(toIndentedString(numericReferenceSpei)).append("\n");
    sb.append("    paymentConceptSpei: ").append(toIndentedString(paymentConceptSpei)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
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
