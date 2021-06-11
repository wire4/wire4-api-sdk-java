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
 * Cada Item especifica el valor configurado para límite de monto permitido o número de operaciones permitidas. Debe especificar un item por cada configuración
 */
@Schema(description = "Cada Item especifica el valor configurado para límite de monto permitido o número de operaciones permitidas. Debe especificar un item por cada configuración")

public class Item {
  @SerializedName("key")
  private String key = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  public Item key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Debe ser BY_AMOUNT para indicar la configuración por monto o BY_OPERATION para indicar la configuración por número de operaciones. Si se quiere configurar el horario de operaciones entonces se debe usar START_OPERATIONS_TIME para la hora de inicio de operaciones y END_OPERATIONS_TIME para la hora de fin de operaciones.
   * @return key
  **/
  @Schema(description = "Debe ser BY_AMOUNT para indicar la configuración por monto o BY_OPERATION para indicar la configuración por número de operaciones. Si se quiere configurar el horario de operaciones entonces se debe usar START_OPERATIONS_TIME para la hora de inicio de operaciones y END_OPERATIONS_TIME para la hora de fin de operaciones.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Item type(String type) {
    this.type = type;
    return this;
  }

   /**
   * El tipo de dato del grupo de configuraciones. Puede ser: &lt;ul&gt;&lt;li&gt;DECIMAL&lt;/li&gt;&lt;li&gt;INT&lt;/li&gt;&lt;li&gt;BOOLEAN&lt;/li&gt;&lt;li&gt;TIME&lt;/li&gt;
   * @return type
  **/
  @Schema(description = "El tipo de dato del grupo de configuraciones. Puede ser: <ul><li>DECIMAL</li><li>INT</li><li>BOOLEAN</li><li>TIME</li>")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Item value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Valor configurado
   * @return value
  **/
  @Schema(description = "Valor configurado")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.key, item.key) &&
        Objects.equals(this.type, item.type) &&
        Objects.equals(this.value, item.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
