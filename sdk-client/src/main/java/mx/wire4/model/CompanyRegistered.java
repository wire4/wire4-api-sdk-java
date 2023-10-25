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
/**
 * Contiene la información de una empresa registrada
 */
@Schema(description = "Contiene la información de una empresa registrada")


public class CompanyRegistered {
  @SerializedName("business_name")
  private String businessName = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("comercial_name")
  private String comercialName = null;

  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("rfc")
  private String rfc = null;

  @SerializedName("status")
  private String status = null;

  public CompanyRegistered businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Es el nombre de la empresa registrada.
   * @return businessName
  **/
  @Schema(description = "Es el nombre de la empresa registrada.")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public CompanyRegistered certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Es la información del certificado.
   * @return certificate
  **/
  @Schema(description = "Es la información del certificado.")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public CompanyRegistered comercialName(String comercialName) {
    this.comercialName = comercialName;
    return this;
  }

   /**
   * Es el nombre comercial de la empresa registrada.
   * @return comercialName
  **/
  @Schema(description = "Es el nombre comercial de la empresa registrada.")
  public String getComercialName() {
    return comercialName;
  }

  public void setComercialName(String comercialName) {
    this.comercialName = comercialName;
  }

  public CompanyRegistered companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Es el identificador de la empresa.
   * @return companyId
  **/
  @Schema(description = "Es el identificador de la empresa.")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CompanyRegistered rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }

   /**
   * Es el Registro Federal de Constituyentes (RFC) de la empresa registrada.
   * @return rfc
  **/
  @Schema(description = "Es el Registro Federal de Constituyentes (RFC) de la empresa registrada.")
  public String getRfc() {
    return rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public CompanyRegistered status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Es el estado (estatus) de la compañía. Puede ser \&quot;ACTIVE\&quot; o \&quot;INACTIVE\&quot;.
   * @return status
  **/
  @Schema(description = "Es el estado (estatus) de la compañía. Puede ser \"ACTIVE\" o \"INACTIVE\".")
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
    CompanyRegistered companyRegistered = (CompanyRegistered) o;
    return Objects.equals(this.businessName, companyRegistered.businessName) &&
        Objects.equals(this.certificate, companyRegistered.certificate) &&
        Objects.equals(this.comercialName, companyRegistered.comercialName) &&
        Objects.equals(this.companyId, companyRegistered.companyId) &&
        Objects.equals(this.rfc, companyRegistered.rfc) &&
        Objects.equals(this.status, companyRegistered.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, certificate, comercialName, companyId, rfc, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyRegistered {\n");
    
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    comercialName: ").append(toIndentedString(comercialName)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
