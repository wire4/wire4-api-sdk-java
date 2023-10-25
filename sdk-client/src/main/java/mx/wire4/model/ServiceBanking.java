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
import mx.wire4.model.UseServiceBanking;
/**
 * Servicio con el que se transacciona en la subscripción
 */
@Schema(description = "Servicio con el que se transacciona en la subscripción")


public class ServiceBanking {
  @SerializedName("spei")
  private UseServiceBanking spei = null;

  @SerializedName("spid")
  private UseServiceBanking spid = null;

  public ServiceBanking spei(UseServiceBanking spei) {
    this.spei = spei;
    return this;
  }

   /**
   * Get spei
   * @return spei
  **/
  @Schema(description = "")
  public UseServiceBanking getSpei() {
    return spei;
  }

  public void setSpei(UseServiceBanking spei) {
    this.spei = spei;
  }

  public ServiceBanking spid(UseServiceBanking spid) {
    this.spid = spid;
    return this;
  }

   /**
   * Get spid
   * @return spid
  **/
  @Schema(description = "")
  public UseServiceBanking getSpid() {
    return spid;
  }

  public void setSpid(UseServiceBanking spid) {
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
    ServiceBanking serviceBanking = (ServiceBanking) o;
    return Objects.equals(this.spei, serviceBanking.spei) &&
        Objects.equals(this.spid, serviceBanking.spid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spei, spid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBanking {\n");
    
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
