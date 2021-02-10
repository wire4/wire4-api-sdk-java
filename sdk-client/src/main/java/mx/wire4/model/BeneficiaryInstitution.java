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
/**
 * Objeto que contiene el nombre de la institución, este campo se debe llenar si el dueño de la cuenta es una persona moral
 */
@Schema(description = "Objeto que contiene el nombre de la institución, este campo se debe llenar si el dueño de la cuenta es una persona moral")

public class BeneficiaryInstitution {
  @SerializedName("name")
  private String name = null;

  public BeneficiaryInstitution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nombre de la institución / empresa (persona moral) propietaria la cuenta bancaria
   * @return name
  **/
  @Schema(description = "Nombre de la institución / empresa (persona moral) propietaria la cuenta bancaria")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficiaryInstitution beneficiaryInstitution = (BeneficiaryInstitution) o;
    return Objects.equals(this.name, beneficiaryInstitution.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiaryInstitution {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
