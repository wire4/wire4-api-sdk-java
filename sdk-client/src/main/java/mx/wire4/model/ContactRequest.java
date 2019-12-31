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
 * Objeto que contiene información básica de un posible cliente
 */
@Schema(description = "Objeto que contiene información básica de un posible cliente")

public class ContactRequest {
  @SerializedName("address")
  private String address = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("contact_person")
  private String contactPerson = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  public ContactRequest address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Dirección del contacto
   * @return address
  **/
  @Schema(description = "Dirección del contacto")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ContactRequest company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Nombre de la empresa
   * @return company
  **/
  @Schema(description = "Nombre de la empresa")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ContactRequest contactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Nombre de la persona quién será contactada
   * @return contactPerson
  **/
  @Schema(description = "Nombre de la persona quién será contactada")
  public String getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  public ContactRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email de la persona
   * @return email
  **/
  @Schema(required = true, description = "Email de la persona")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Número de teléfono de la persona
   * @return phoneNumber
  **/
  @Schema(required = true, description = "Número de teléfono de la persona")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequest contactRequest = (ContactRequest) o;
    return Objects.equals(this.address, contactRequest.address) &&
        Objects.equals(this.company, contactRequest.company) &&
        Objects.equals(this.contactPerson, contactRequest.contactPerson) &&
        Objects.equals(this.email, contactRequest.email) &&
        Objects.equals(this.phoneNumber, contactRequest.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, company, contactPerson, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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