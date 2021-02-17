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
/**
 * Objeto que contiene información de la cuenta de beneficiario SPID
 */
@Schema(description = "Objeto que contiene información de la cuenta de beneficiario SPID")

public class SpidBeneficiaryResponse {
  @SerializedName("amount_limit")
  private BigDecimal amountLimit = null;

  @SerializedName("bank")
  private Institution bank = null;

  @SerializedName("beneficiary_account")
  private String beneficiaryAccount = null;

  @SerializedName("email")
  private List<String> email = null;

  @SerializedName("institution")
  private BeneficiaryInstitution institution = null;

  @SerializedName("kind_of_relationship")
  private String kindOfRelationship = null;

  @SerializedName("numeric_reference_spid")
  private String numericReferenceSpid = null;

  @SerializedName("payment_concept_spid")
  private String paymentConceptSpid = null;

  @SerializedName("register_date")
  private OffsetDateTime registerDate = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("rfc")
  private String rfc = null;

  @SerializedName("status")
  private String status = null;

  public SpidBeneficiaryResponse amountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Monto límite permitido para la cuenta. Ejemplo: 1000.00
   * @return amountLimit
  **/
  @Schema(required = true, description = "Monto límite permitido para la cuenta. Ejemplo: 1000.00")
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }

  public SpidBeneficiaryResponse bank(Institution bank) {
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

  public SpidBeneficiaryResponse beneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

   /**
   * Cuenta del beneficiario debe ser una cuenta CLABE. Ejemplo: 032180000118359719.
   * @return beneficiaryAccount
  **/
  @Schema(example = "CLABE: 032180000118359719", required = true, description = "Cuenta del beneficiario debe ser una cuenta CLABE. Ejemplo: 032180000118359719.")
  public String getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(String beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public SpidBeneficiaryResponse email(List<String> email) {
    this.email = email;
    return this;
  }

  public SpidBeneficiaryResponse addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Lista de correos electrónicos (emails), este dato es opcional.
   * @return email
  **/
  @Schema(description = "Lista de correos electrónicos (emails), este dato es opcional.")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }

  public SpidBeneficiaryResponse institution(BeneficiaryInstitution institution) {
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @Schema(required = true, description = "")
  public BeneficiaryInstitution getInstitution() {
    return institution;
  }

  public void setInstitution(BeneficiaryInstitution institution) {
    this.institution = institution;
  }

  public SpidBeneficiaryResponse kindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
    return this;
  }

   /**
   * Es el tipo de relación que se tiene con el propietario de la cuenta. Para registrar una cuenta, este valor se debe obtener del recurso &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt; relationships.&lt;/a&gt; &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Nota:&lt;/b&gt; &lt;em&gt;Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.&lt;/em&gt;
   * @return kindOfRelationship
  **/
  @Schema(required = true, description = "Es el tipo de relación que se tiene con el propietario de la cuenta. Para registrar una cuenta, este valor se debe obtener del recurso <a href=\"#operation/getAvailableRelationshipsMonexUsingGET\"> relationships.</a> <br /><br /><b>Nota:</b> <em>Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta.</em>")
  public String getKindOfRelationship() {
    return kindOfRelationship;
  }

  public void setKindOfRelationship(String kindOfRelationship) {
    this.kindOfRelationship = kindOfRelationship;
  }

  public SpidBeneficiaryResponse numericReferenceSpid(String numericReferenceSpid) {
    this.numericReferenceSpid = numericReferenceSpid;
    return this;
  }

   /**
   * Referencia numérica.
   * @return numericReferenceSpid
  **/
  @Schema(description = "Referencia numérica.")
  public String getNumericReferenceSpid() {
    return numericReferenceSpid;
  }

  public void setNumericReferenceSpid(String numericReferenceSpid) {
    this.numericReferenceSpid = numericReferenceSpid;
  }

  public SpidBeneficiaryResponse paymentConceptSpid(String paymentConceptSpid) {
    this.paymentConceptSpid = paymentConceptSpid;
    return this;
  }

   /**
   * Concepto de pago.
   * @return paymentConceptSpid
  **/
  @Schema(description = "Concepto de pago.")
  public String getPaymentConceptSpid() {
    return paymentConceptSpid;
  }

  public void setPaymentConceptSpid(String paymentConceptSpid) {
    this.paymentConceptSpid = paymentConceptSpid;
  }

  public SpidBeneficiaryResponse registerDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
    return this;
  }

   /**
   * La fecha en la que se registro el beneficiario.
   * @return registerDate
  **/
  @Schema(description = "La fecha en la que se registro el beneficiario.")
  public OffsetDateTime getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
  }

  public SpidBeneficiaryResponse relationship(String relationship) {
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

  public SpidBeneficiaryResponse rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

   /**
   * Es el Registro federal de contribuyentes (RFC) de la persona o institución propietaria de la cuenta. &lt;br/&gt; &lt;br/&gt;&lt;b&gt;Nota:&lt;/b&gt; Se valida el formato de RFC.
   * @return rfc
  **/
  @Schema(description = "Es el Registro federal de contribuyentes (RFC) de la persona o institución propietaria de la cuenta. <br/> <br/><b>Nota:</b> Se valida el formato de RFC.")
  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public SpidBeneficiaryResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * El estado en el que se encuentra el registo del beneficiario.&lt;br&gt;&lt;br&gt; Los valores pueden ser: &lt;b&gt;\&quot;RECEIVED\&quot;, \&quot;DELETED\&quot;, \&quot;REQUEST_ERROR_BY_MONEX\&quot;, \&quot;REQUESTED_TO_MONEX\&quot;, \&quot;NOTIFIED_BY_MONEX\&quot;, \&quot;NOTIFIED_BY_SPEIOK\&quot;, \&quot;NOTIFIED_WITH_ERROR_BY_SPEIOK\&quot; y \&quot;PENDING\&quot;&lt;/b&gt;
   * @return status
  **/
  @Schema(description = "El estado en el que se encuentra el registo del beneficiario.<br><br> Los valores pueden ser: <b>\"RECEIVED\", \"DELETED\", \"REQUEST_ERROR_BY_MONEX\", \"REQUESTED_TO_MONEX\", \"NOTIFIED_BY_MONEX\", \"NOTIFIED_BY_SPEIOK\", \"NOTIFIED_WITH_ERROR_BY_SPEIOK\" y \"PENDING\"</b>")
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
    SpidBeneficiaryResponse spidBeneficiaryResponse = (SpidBeneficiaryResponse) o;
    return Objects.equals(this.amountLimit, spidBeneficiaryResponse.amountLimit) &&
        Objects.equals(this.bank, spidBeneficiaryResponse.bank) &&
        Objects.equals(this.beneficiaryAccount, spidBeneficiaryResponse.beneficiaryAccount) &&
        Objects.equals(this.email, spidBeneficiaryResponse.email) &&
        Objects.equals(this.institution, spidBeneficiaryResponse.institution) &&
        Objects.equals(this.kindOfRelationship, spidBeneficiaryResponse.kindOfRelationship) &&
        Objects.equals(this.numericReferenceSpid, spidBeneficiaryResponse.numericReferenceSpid) &&
        Objects.equals(this.paymentConceptSpid, spidBeneficiaryResponse.paymentConceptSpid) &&
        Objects.equals(this.registerDate, spidBeneficiaryResponse.registerDate) &&
        Objects.equals(this.relationship, spidBeneficiaryResponse.relationship) &&
        Objects.equals(this.rfc, spidBeneficiaryResponse.rfc) &&
        Objects.equals(this.status, spidBeneficiaryResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountLimit, bank, beneficiaryAccount, email, institution, kindOfRelationship, numericReferenceSpid, paymentConceptSpid, registerDate, relationship, rfc, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpidBeneficiaryResponse {\n");
    
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    kindOfRelationship: ").append(toIndentedString(kindOfRelationship)).append("\n");
    sb.append("    numericReferenceSpid: ").append(toIndentedString(numericReferenceSpid)).append("\n");
    sb.append("    paymentConceptSpid: ").append(toIndentedString(paymentConceptSpid)).append("\n");
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
