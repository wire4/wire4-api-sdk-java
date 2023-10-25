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
 * SuccessChargesDataDTO
 */



public class SuccessChargesDataDTO {
  @SerializedName("authorization")
  private String authorization = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("holder_name")
  private String holderName = null;

  public SuccessChargesDataDTO authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @Schema(description = "")
  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  public SuccessChargesDataDTO brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @Schema(description = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public SuccessChargesDataDTO cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @Schema(description = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public SuccessChargesDataDTO date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public SuccessChargesDataDTO holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * Get holderName
   * @return holderName
  **/
  @Schema(description = "")
  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessChargesDataDTO successChargesDataDTO = (SuccessChargesDataDTO) o;
    return Objects.equals(this.authorization, successChargesDataDTO.authorization) &&
        Objects.equals(this.brand, successChargesDataDTO.brand) &&
        Objects.equals(this.cardNumber, successChargesDataDTO.cardNumber) &&
        Objects.equals(this.date, successChargesDataDTO.date) &&
        Objects.equals(this.holderName, successChargesDataDTO.holderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, brand, cardNumber, date, holderName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessChargesDataDTO {\n");
    
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
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
