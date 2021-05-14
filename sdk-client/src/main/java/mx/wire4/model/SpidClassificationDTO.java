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
 * La información acerca de la clasificación de la operación.
 */
@Schema(description = "La información acerca de la clasificación de la operación.")

public class SpidClassificationDTO {
  @SerializedName("classification_id")
  private String classificationId = null;

  @SerializedName("description")
  private String description = null;

  public SpidClassificationDTO classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

   /**
   * Es el identificador de la clasificación.
   * @return classificationId
  **/
  @Schema(description = "Es el identificador de la clasificación.")
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }

  public SpidClassificationDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Es la descripción de la clasificación de la operación.
   * @return description
  **/
  @Schema(description = "Es la descripción de la clasificación de la operación.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpidClassificationDTO spidClassificationDTO = (SpidClassificationDTO) o;
    return Objects.equals(this.classificationId, spidClassificationDTO.classificationId) &&
        Objects.equals(this.description, spidClassificationDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationId, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpidClassificationDTO {\n");
    
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
