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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.BeneficiaryInstitution;
import mx.wire4.model.Institution;
import mx.wire4.model.Person;
/**
 * Objeto que contiene información de las cuenta SPEI/SPID reasignadas bajo un nuevo identificador de solicitud.
 */
@Schema(description = "Objeto que contiene información de las cuenta SPEI/SPID reasignadas bajo un nuevo identificador de solicitud.")

public class AccountReassigned {
  @SerializedName("amount_limit")
  private BigDecimal amountLimit = null;

  @SerializedName("bank")
  private Institution bank = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

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

  @SerializedName("register_date")
  private OffsetDateTime registerDate = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("rfc")
  private String rfc = null;

  @SerializedName("status")
  private String status = null;

  public AccountReassigned amountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Es el monto límite permitido que se registra para la cuenta. Por ejemplo 1000.00.
   * @return amountLimit
  **/
  @Schema(example = "10000.0", required = true, description = "Es el monto límite permitido que se registra para la cuenta. Por ejemplo 1000.00.")
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }

  public AccountReassigned bank(Institution bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @Schema(description = "")
  public Institution getBank() {
    return bank;
  }

  public void setBank(Institution bank) {
    this.bank = bank;
  }

  public AccountReassigned beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Es la cuenta del beneficiario, podría ser teléfono celular (se valida que sea de 10 dígitos), Tarjeta de débito (TDD, se valida que sea de 16 dígitos) o cuenta CLABE (se valida que sea de 18 dígitos). &lt;br/&gt;&lt;br/&gt;Por ejemplo Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719.
   * @return beneficiaryAccount
  **/
  @Schema(example = "Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719", required = true, description = "Es la cuenta del beneficiario, podría ser teléfono celular (se valida que sea de 10 dígitos), Tarjeta de débito (TDD, se valida que sea de 16 dígitos) o cuenta CLABE (se valida que sea de 18 dígitos). <br/><br/>Por ejemplo Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719.")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public AccountReassigned currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Es el código de divisa. Es en el formato estándar de 3 dígitos, por ejemplo para el peso mexicano: &lt;b&gt;MXP&lt;/b&gt;, para el dólar estadounidense: &lt;b&gt;USD&lt;/b&gt;.&lt;br/&gt;&lt;br/&gt;Este dato es opcional, al registrar una cuenta si no se cuenta con este valor se asignará &lt;b&gt;MXP&lt;/b&gt;
   * @return currencyCode
  **/
  @Schema(description = "Es el código de divisa. Es en el formato estándar de 3 dígitos, por ejemplo para el peso mexicano: <b>MXP</b>, para el dólar estadounidense: <b>USD</b>.<br/><br/>Este dato es opcional, al registrar una cuenta si no se cuenta con este valor se asignará <b>MXP</b>")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AccountReassigned email(List<String> email) {
    this.email = email;
    return this;
  }

  public AccountReassigned addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Es una lista de correos electrónicos (emails). Se valida el formato de email. Este campo es opcional.
   * @return email
  **/
  @Schema(description = "Es una lista de correos electrónicos (emails). Se valida el formato de email. Este campo es opcional.")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }

  public AccountReassigned institution(BeneficiaryInstitution institution) {
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

  public AccountReassigned kindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
    return this;
  }

   /**
   * Es el tipo de relación que se tiene con el propietario de la cuenta. Para registrar una cuenta, este valor se debe obtener del recurso &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;relationships.&lt;/a&gt; &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Nota:&lt;/b&gt; &lt;em&gt;Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.&lt;/em&gt;
   * @return kindOfRelationship
  **/
  @Schema(required = true, description = "Es el tipo de relación que se tiene con el propietario de la cuenta. Para registrar una cuenta, este valor se debe obtener del recurso <a href=\"#operation/getAvailableRelationshipsMonexUsingGET\">relationships.</a> <br /><br /><b>Nota:</b> <em>Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.</em>")
  public String getKindOfRelationship() {
    return kindOfRelationship;
  }

  public void setKindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
  }

  public AccountReassigned numericReferenceSpei(String numericReferenceSpei) {
    this.numericReferenceSpei = numericReferenceSpei;
    return this;
  }

   /**
   * Es la referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia.
   * @return numericReferenceSpei
  **/
  @Schema(description = "Es la referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia.")
  public String getNumericReferenceSpei() {
    return numericReferenceSpei;
  }

  public void setNumericReferenceSpei(String numericReferenceSpei) {
    this.numericReferenceSpei = numericReferenceSpei;
  }

  public AccountReassigned paymentConceptSpei(String paymentConceptSpei) {
    this.paymentConceptSpei = paymentConceptSpei;
    return this;
  }

   /**
   * Es el concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto
   * @return paymentConceptSpei
  **/
  @Schema(description = "Es el concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto")
  public String getPaymentConceptSpei() {
    return paymentConceptSpei;
  }

  public void setPaymentConceptSpei(String paymentConceptSpei) {
    this.paymentConceptSpei = paymentConceptSpei;
  }

  public AccountReassigned person(Person person) {
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

  public AccountReassigned registerDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
    return this;
  }

   /**
   * Es la fecha en la que se registró el beneficiario. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;.
   * @return registerDate
  **/
  @Schema(description = "Es la fecha en la que se registró el beneficiario. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: <strong>2020-10-27T11:03:15.000-06:00</strong>.")
  public OffsetDateTime getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
  }

  public AccountReassigned relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Es la relación con el propietario de la cuenta, para registrar este valor se debe obtener del recurso &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;relationships.&lt;/a&gt; &lt;br/&gt; &lt;br/&gt; &lt;b&gt;Nota:&lt;/b&gt; Si en la respuesta de Monex, sta propiedad es nula, tampoco estará presente en esta respuesta.
   * @return relationship
  **/
  @Schema(required = true, description = "Es la relación con el propietario de la cuenta, para registrar este valor se debe obtener del recurso <a href=\"#operation/getAvailableRelationshipsMonexUsingGET\">relationships.</a> <br/> <br/> <b>Nota:</b> Si en la respuesta de Monex, sta propiedad es nula, tampoco estará presente en esta respuesta.")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public AccountReassigned rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

   /**
   * Es el Registro Federal de Contribuyentes (RFC) de la persona o institución propietaria dela cuenta. &lt;br/&gt; &lt;br/&gt;&lt;b&gt;Nota:&lt;/b&gt; Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.
   * @return rfc
  **/
  @Schema(required = true, description = "Es el Registro Federal de Contribuyentes (RFC) de la persona o institución propietaria dela cuenta. <br/> <br/><b>Nota:</b> Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.")
  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public AccountReassigned status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Es el estado en el que se encuentra el registo del beneficiario.&lt;br&gt;Los valores pueden ser:&lt;ul style&#x3D;\&quot;font-size: 12px; font-weight: 600;\&quot;&gt;&lt;li&gt;RECEIVED&lt;/li&gt;&lt;li&gt;DELETED&lt;/li&gt;&lt;li&gt;REQUEST_ERROR_BY_MONEX&lt;/li&gt;&lt;li&gt;REQUESTED_TO_MONEX&lt;/li&gt;&lt;li&gt;NOTIFIED_BY_MONEX&lt;/li&gt;&lt;li&gt;NOTIFIED_BY_SPEIOK&lt;li&gt;&lt;/li&gt;NOTIFIED_WITH_ERROR_BY_SPEIOK&lt;/li&gt;&lt;li&gt;PENDING&lt;/li&gt;&lt;/ul&gt;
   * @return status
  **/
  @Schema(description = "Es el estado en el que se encuentra el registo del beneficiario.<br>Los valores pueden ser:<ul style=\"font-size: 12px; font-weight: 600;\"><li>RECEIVED</li><li>DELETED</li><li>REQUEST_ERROR_BY_MONEX</li><li>REQUESTED_TO_MONEX</li><li>NOTIFIED_BY_MONEX</li><li>NOTIFIED_BY_SPEIOK<li></li>NOTIFIED_WITH_ERROR_BY_SPEIOK</li><li>PENDING</li></ul>")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountReassigned accountReassigned = (AccountReassigned) o;
    return Objects.equals(this.amountLimit, accountReassigned.amountLimit) &&
        Objects.equals(this.bank, accountReassigned.bank) &&
        Objects.equals(this.beneficiaryAccount, accountReassigned.beneficiaryAccount) &&
        Objects.equals(this.currencyCode, accountReassigned.currencyCode) &&
        Objects.equals(this.email, accountReassigned.email) &&
        Objects.equals(this.institution, accountReassigned.institution) &&
        Objects.equals(this.kindOfRelationship, accountReassigned.kindOfRelationship) &&
        Objects.equals(this.numericReferenceSpei, accountReassigned.numericReferenceSpei) &&
        Objects.equals(this.paymentConceptSpei, accountReassigned.paymentConceptSpei) &&
        Objects.equals(this.person, accountReassigned.person) &&
        Objects.equals(this.registerDate, accountReassigned.registerDate) &&
        Objects.equals(this.relationship, accountReassigned.relationship) &&
        Objects.equals(this.rfc, accountReassigned.rfc) &&
        Objects.equals(this.status, accountReassigned.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountLimit, bank, beneficiaryAccount, currencyCode, email, institution, kindOfRelationship, numericReferenceSpei, paymentConceptSpei, person, registerDate, relationship, rfc, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReassigned {\n");
    
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    kindOfRelationship: ").append(toIndentedString(kindOfRelationship)).append("\n");
    sb.append("    numericReferenceSpei: ").append(toIndentedString(numericReferenceSpei)).append("\n");
    sb.append("    paymentConceptSpei: ").append(toIndentedString(paymentConceptSpei)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
