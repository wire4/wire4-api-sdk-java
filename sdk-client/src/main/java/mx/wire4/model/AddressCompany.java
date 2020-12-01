/*
 * Wire4RestAPI
 * Referencia de API. La API de Wire4 está organizada en torno a REST.
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
 * La dirección de la companía
 */
@Schema(description = "La dirección de la companía")

public class AddressCompany {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("exterior_number")
  private String exteriorNumber = null;

  @SerializedName("interior_number")
  private String interiorNumber = null;

  @SerializedName("municipality")
  private String municipality = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("settlement")
  private String settlement = null;

  @SerializedName("settlement_name")
  private String settlementName = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("street_address")
  private String streetAddress = null;

  public AddressCompany city(String city) {
    this.city = city;
    return this;
  }

   /**
   * La ciudad
   * @return city
  **/
  @Schema(description = "La ciudad")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressCompany countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * La clabe del país
   * @return countryCode
  **/
  @Schema(description = "La clabe del país")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressCompany exteriorNumber(String exteriorNumber) {
    this.exteriorNumber = exteriorNumber;
    return this;
  }

   /**
   * Número exterior
   * @return exteriorNumber
  **/
  @Schema(description = "Número exterior")
  public String getExteriorNumber() {
    return exteriorNumber;
  }

  public void setExteriorNumber(String exteriorNumber) {
    this.exteriorNumber = exteriorNumber;
  }

  public AddressCompany interiorNumber(String interiorNumber) {
    this.interiorNumber = interiorNumber;
    return this;
  }

   /**
   * Número interior
   * @return interiorNumber
  **/
  @Schema(description = "Número interior")
  public String getInteriorNumber() {
    return interiorNumber;
  }

  public void setInteriorNumber(String interiorNumber) {
    this.interiorNumber = interiorNumber;
  }

  public AddressCompany municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * El municipio
   * @return municipality
  **/
  @Schema(description = "El municipio")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public AddressCompany postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Código postal
   * @return postalCode
  **/
  @Schema(description = "Código postal")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressCompany settlement(String settlement) {
    this.settlement = settlement;
    return this;
  }

   /**
   * El asentamiento
   * @return settlement
  **/
  @Schema(description = "El asentamiento")
  public String getSettlement() {
    return settlement;
  }

  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }

  public AddressCompany settlementName(String settlementName) {
    this.settlementName = settlementName;
    return this;
  }

   /**
   * El nombre del asentamiento
   * @return settlementName
  **/
  @Schema(description = "El nombre del asentamiento")
  public String getSettlementName() {
    return settlementName;
  }

  public void setSettlementName(String settlementName) {
    this.settlementName = settlementName;
  }

  public AddressCompany state(String state) {
    this.state = state;
    return this;
  }

   /**
   * El estado
   * @return state
  **/
  @Schema(description = "El estado")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressCompany streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * La calle
   * @return streetAddress
  **/
  @Schema(description = "La calle")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCompany addressCompany = (AddressCompany) o;
    return Objects.equals(this.city, addressCompany.city) &&
        Objects.equals(this.countryCode, addressCompany.countryCode) &&
        Objects.equals(this.exteriorNumber, addressCompany.exteriorNumber) &&
        Objects.equals(this.interiorNumber, addressCompany.interiorNumber) &&
        Objects.equals(this.municipality, addressCompany.municipality) &&
        Objects.equals(this.postalCode, addressCompany.postalCode) &&
        Objects.equals(this.settlement, addressCompany.settlement) &&
        Objects.equals(this.settlementName, addressCompany.settlementName) &&
        Objects.equals(this.state, addressCompany.state) &&
        Objects.equals(this.streetAddress, addressCompany.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCode, exteriorNumber, interiorNumber, municipality, postalCode, settlement, settlementName, state, streetAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCompany {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    exteriorNumber: ").append(toIndentedString(exteriorNumber)).append("\n");
    sb.append("    interiorNumber: ").append(toIndentedString(interiorNumber)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    settlementName: ").append(toIndentedString(settlementName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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
