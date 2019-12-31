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
import java.math.BigDecimal;
/**
 * Objeto que contiene la información del previo y nuevo monto límite
 */
@Schema(description = "Objeto que contiene la información del previo y nuevo monto límite")

public class AmountRequest {
  @SerializedName("amount_limit")
  private BigDecimal amountLimit = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("previous_amount_limit")
  private BigDecimal previousAmountLimit = null;

  public AmountRequest amountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Nuevo monto límite que reemplazará al actual, un monto de 0.0 implica que no hay límite
   * minimum: 0
   * @return amountLimit
  **/
  @Schema(required = true, description = "Nuevo monto límite que reemplazará al actual, un monto de 0.0 implica que no hay límite")
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }

  public AmountRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Código de moneda de la cuenta
   * @return currencyCode
  **/
  @Schema(required = true, description = "Código de moneda de la cuenta")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AmountRequest previousAmountLimit(BigDecimal previousAmountLimit) {
    this.previousAmountLimit = previousAmountLimit;
    return this;
  }

   /**
   * Monto límite registrado actualmente, un monto de 0.0 implica que no hay límite
   * minimum: 0
   * @return previousAmountLimit
  **/
  @Schema(required = true, description = "Monto límite registrado actualmente, un monto de 0.0 implica que no hay límite")
  public BigDecimal getPreviousAmountLimit() {
    return previousAmountLimit;
  }

  public void setPreviousAmountLimit(BigDecimal previousAmountLimit) {
    this.previousAmountLimit = previousAmountLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountRequest amountRequest = (AmountRequest) o;
    return Objects.equals(this.amountLimit, amountRequest.amountLimit) &&
        Objects.equals(this.currencyCode, amountRequest.currencyCode) &&
        Objects.equals(this.previousAmountLimit, amountRequest.previousAmountLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountLimit, currencyCode, previousAmountLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountRequest {\n");
    
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    previousAmountLimit: ").append(toIndentedString(previousAmountLimit)).append("\n");
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