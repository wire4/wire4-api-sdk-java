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
 * FailedChargesDataDTO
 */



public class FailedChargesDataDTO {
  @SerializedName("brand")
  private String brand = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("error_code")
  private String errorCode = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("holder_name")
  private String holderName = null;

  public FailedChargesDataDTO brand(String brand) {
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

  public FailedChargesDataDTO cardNumber(String cardNumber) {
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

  public FailedChargesDataDTO date(String date) {
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

  public FailedChargesDataDTO errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public FailedChargesDataDTO errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public FailedChargesDataDTO holderName(String holderName) {
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
    FailedChargesDataDTO failedChargesDataDTO = (FailedChargesDataDTO) o;
    return Objects.equals(this.brand, failedChargesDataDTO.brand) &&
        Objects.equals(this.cardNumber, failedChargesDataDTO.cardNumber) &&
        Objects.equals(this.date, failedChargesDataDTO.date) &&
        Objects.equals(this.errorCode, failedChargesDataDTO.errorCode) &&
        Objects.equals(this.errorMessage, failedChargesDataDTO.errorMessage) &&
        Objects.equals(this.holderName, failedChargesDataDTO.holderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, cardNumber, date, errorCode, errorMessage, holderName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedChargesDataDTO {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
