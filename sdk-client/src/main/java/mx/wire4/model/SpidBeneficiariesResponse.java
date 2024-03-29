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
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.SpidBeneficiaryResponse;
/**
 * SpidBeneficiariesResponse
 */



public class SpidBeneficiariesResponse {
  @SerializedName("beneficiaries")
  private List<SpidBeneficiaryResponse> beneficiaries = null;

  public SpidBeneficiariesResponse beneficiaries(List<SpidBeneficiaryResponse> beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  public SpidBeneficiariesResponse addBeneficiariesItem(SpidBeneficiaryResponse beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * Es una lista de beneficiarios obtenidos.
   * @return beneficiaries
  **/
  @Schema(description = "Es una lista de beneficiarios obtenidos.")
  public List<SpidBeneficiaryResponse> getBeneficiaries() {
    return beneficiaries;
  }

  public void setBeneficiaries(List<SpidBeneficiaryResponse> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpidBeneficiariesResponse spidBeneficiariesResponse = (SpidBeneficiariesResponse) o;
    return Objects.equals(this.beneficiaries, spidBeneficiariesResponse.beneficiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpidBeneficiariesResponse {\n");
    
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
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
