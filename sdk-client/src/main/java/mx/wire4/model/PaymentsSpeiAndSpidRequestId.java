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
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.Payment;
/**
 * Contiene el conjunto de transacciones SPEI y SPID registradas bajo una misma petición
 */
@Schema(description = "Contiene el conjunto de transacciones SPEI y SPID registradas bajo una misma petición")


public class PaymentsSpeiAndSpidRequestId {
  @SerializedName("authorization_date")
  private OffsetDateTime authorizationDate = null;

  @SerializedName("request_date")
  private OffsetDateTime requestDate = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("spei")
  private List<Payment> spei = null;

  @SerializedName("spid")
  private List<Payment> spid = null;

  public PaymentsSpeiAndSpidRequestId authorizationDate(OffsetDateTime authorizationDate) {
    this.authorizationDate = authorizationDate;
    return this;
  }

   /**
   * Fecha en que el usuario propietario del token emitió la autorización
   * @return authorizationDate
  **/
  @Schema(description = "Fecha en que el usuario propietario del token emitió la autorización")
  public OffsetDateTime getAuthorizationDate() {
    return authorizationDate;
  }

  public void setAuthorizationDate(OffsetDateTime authorizationDate) {
    this.authorizationDate = authorizationDate;
  }

  public PaymentsSpeiAndSpidRequestId requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

   /**
   * Fecha en que se realizó la petición de registro de transacciones
   * @return requestDate
  **/
  @Schema(description = "Fecha en que se realizó la petición de registro de transacciones")
  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  public PaymentsSpeiAndSpidRequestId requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identificador de la petición del registro de transacciones
   * @return requestId
  **/
  @Schema(description = "Identificador de la petición del registro de transacciones")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public PaymentsSpeiAndSpidRequestId spei(List<Payment> spei) {
    this.spei = spei;
    return this;
  }

  public PaymentsSpeiAndSpidRequestId addSpeiItem(Payment speiItem) {
    if (this.spei == null) {
      this.spei = new ArrayList<>();
    }
    this.spei.add(speiItem);
    return this;
  }

   /**
   * Lista de las transacciones spei registradas
   * @return spei
  **/
  @Schema(description = "Lista de las transacciones spei registradas")
  public List<Payment> getSpei() {
    return spei;
  }

  public void setSpei(List<Payment> spei) {
    this.spei = spei;
  }

  public PaymentsSpeiAndSpidRequestId spid(List<Payment> spid) {
    this.spid = spid;
    return this;
  }

  public PaymentsSpeiAndSpidRequestId addSpidItem(Payment spidItem) {
    if (this.spid == null) {
      this.spid = new ArrayList<>();
    }
    this.spid.add(spidItem);
    return this;
  }

   /**
   * Lista de las transacciones spid registradas
   * @return spid
  **/
  @Schema(description = "Lista de las transacciones spid registradas")
  public List<Payment> getSpid() {
    return spid;
  }

  public void setSpid(List<Payment> spid) {
    this.spid = spid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSpeiAndSpidRequestId paymentsSpeiAndSpidRequestId = (PaymentsSpeiAndSpidRequestId) o;
    return Objects.equals(this.authorizationDate, paymentsSpeiAndSpidRequestId.authorizationDate) &&
        Objects.equals(this.requestDate, paymentsSpeiAndSpidRequestId.requestDate) &&
        Objects.equals(this.requestId, paymentsSpeiAndSpidRequestId.requestId) &&
        Objects.equals(this.spei, paymentsSpeiAndSpidRequestId.spei) &&
        Objects.equals(this.spid, paymentsSpeiAndSpidRequestId.spid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDate, requestDate, requestId, spei, spid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSpeiAndSpidRequestId {\n");
    
    sb.append("    authorizationDate: ").append(toIndentedString(authorizationDate)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    spei: ").append(toIndentedString(spei)).append("\n");
    sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
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
