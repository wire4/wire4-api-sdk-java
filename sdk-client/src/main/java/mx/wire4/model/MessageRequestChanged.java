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
 * Es el objeto del mensaje que se envía mediante webhook con la información acerca de algún cambio en el procesamiento o estado de la petición a esta a esta API.
 */
@Schema(description = "Es el objeto del mensaje que se envía mediante webhook con la información acerca de algún cambio en el procesamiento o estado de la petición a esta a esta API.")

public class MessageRequestChanged {
  @SerializedName("request_id")
  private String requestId = null;

  /**
   * Es el cambio a informar en el procesamiento/estado de la petición.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORIZED("AUTHORIZED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  public MessageRequestChanged requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Es el identificador de la petición realizada a esta API.
   * @return requestId
  **/
  @Schema(description = "Es el identificador de la petición realizada a esta API.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public MessageRequestChanged status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Es el cambio a informar en el procesamiento/estado de la petición.
   * @return status
  **/
  @Schema(description = "Es el cambio a informar en el procesamiento/estado de la petición.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    MessageRequestChanged messageRequestChanged = (MessageRequestChanged) o;
    return Objects.equals(this.requestId, messageRequestChanged.requestId) &&
        Objects.equals(this.status, messageRequestChanged.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequestChanged {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
