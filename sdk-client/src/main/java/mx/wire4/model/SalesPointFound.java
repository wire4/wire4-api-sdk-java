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
import java.time.OffsetDateTime;
/**
 * Objeto que contiene la información del punto de venta encontrada.
 */
@Schema(description = "Objeto que contiene la información del punto de venta encontrada.")


public class SalesPointFound {
  @SerializedName("access_ip")
  private String accessIp = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("public_id")
  private String publicId = null;

  /**
   * Es el estado (estatus) del punto de venta. Puede ser \&quot;ACTIVE\&quot; o \&quot;INACTIVO\&quot;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE");

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
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public SalesPointFound accessIp(String accessIp) {
    this.accessIp = accessIp;
    return this;
  }

   /**
   * Es la dirección IP desde la que accede el punto de venta a wire4 y a la que se devuelven las notificaciones.
   * @return accessIp
  **/
  @Schema(description = "Es la dirección IP desde la que accede el punto de venta a wire4 y a la que se devuelven las notificaciones.")
  public String getAccessIp() {
    return accessIp;
  }

  public void setAccessIp(String accessIp) {
    this.accessIp = accessIp;
  }

  public SalesPointFound account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Es la cuenta registra para el punto de venta.
   * @return account
  **/
  @Schema(description = "Es la cuenta registra para el punto de venta.")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public SalesPointFound createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Es la fecha en la que se creó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;.
   * @return createdAt
  **/
  @Schema(description = "Es la fecha en la que se creó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: <strong>2020-10-27T11:03:15.000-06:00</strong>.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SalesPointFound name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Es el nombre del punto de venta.
   * @return name
  **/
  @Schema(description = "Es el nombre del punto de venta.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SalesPointFound publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Es el identificador del punto de venta.
   * @return publicId
  **/
  @Schema(description = "Es el identificador del punto de venta.")
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SalesPointFound status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Es el estado (estatus) del punto de venta. Puede ser \&quot;ACTIVE\&quot; o \&quot;INACTIVO\&quot;.
   * @return status
  **/
  @Schema(description = "Es el estado (estatus) del punto de venta. Puede ser \"ACTIVE\" o \"INACTIVO\".")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SalesPointFound updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Es la fecha en la que se actualizó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;.
   * @return updatedAt
  **/
  @Schema(description = "Es la fecha en la que se actualizó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: <strong>2020-10-27T11:03:15.000-06:00</strong>.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesPointFound salesPointFound = (SalesPointFound) o;
    return Objects.equals(this.accessIp, salesPointFound.accessIp) &&
        Objects.equals(this.account, salesPointFound.account) &&
        Objects.equals(this.createdAt, salesPointFound.createdAt) &&
        Objects.equals(this.name, salesPointFound.name) &&
        Objects.equals(this.publicId, salesPointFound.publicId) &&
        Objects.equals(this.status, salesPointFound.status) &&
        Objects.equals(this.updatedAt, salesPointFound.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessIp, account, createdAt, name, publicId, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesPointFound {\n");
    
    sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
