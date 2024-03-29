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
import java.util.ArrayList;
import java.util.List;
/**
 * El usuario que corresponde al contrato
 */
@Schema(description = "El usuario que corresponde al contrato")


public class UserCompany {
  @SerializedName("emails")
  private List<String> emails = null;

  @SerializedName("legal_representative")
  private Boolean legalRepresentative = null;

  @SerializedName("masked_name")
  private String maskedName = null;

  @SerializedName("masked_user_name")
  private String maskedUserName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone_numbers")
  private List<String> phoneNumbers = null;

  @SerializedName("surname_father")
  private String surnameFather = null;

  @SerializedName("surname_mother")
  private String surnameMother = null;

  @SerializedName("user_name")
  private String userName = null;

  public UserCompany emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public UserCompany addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Una lista de los correos del usuario
   * @return emails
  **/
  @Schema(description = "Una lista de los correos del usuario")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public UserCompany legalRepresentative(Boolean legalRepresentative) {
    this.legalRepresentative = legalRepresentative;
    return this;
  }

   /**
   * Indica sí es representate legal
   * @return legalRepresentative
  **/
  @Schema(description = "Indica sí es representate legal")
  public Boolean isLegalRepresentative() {
    return legalRepresentative;
  }

  public void setLegalRepresentative(Boolean legalRepresentative) {
    this.legalRepresentative = legalRepresentative;
  }

  public UserCompany maskedName(String maskedName) {
    this.maskedName = maskedName;
    return this;
  }

   /**
   * El nombre del usuario enmascarado
   * @return maskedName
  **/
  @Schema(description = "El nombre del usuario enmascarado")
  public String getMaskedName() {
    return maskedName;
  }

  public void setMaskedName(String maskedName) {
    this.maskedName = maskedName;
  }

  public UserCompany maskedUserName(String maskedUserName) {
    this.maskedUserName = maskedUserName;
    return this;
  }

   /**
   * El nombre del usuario de acceso enmascarado
   * @return maskedUserName
  **/
  @Schema(description = "El nombre del usuario de acceso enmascarado")
  public String getMaskedUserName() {
    return maskedUserName;
  }

  public void setMaskedUserName(String maskedUserName) {
    this.maskedUserName = maskedUserName;
  }

  public UserCompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * El nombre del usuario
   * @return name
  **/
  @Schema(description = "El nombre del usuario")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserCompany phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public UserCompany addPhoneNumbersItem(String phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Una lista de los teléfonos del usuario
   * @return phoneNumbers
  **/
  @Schema(description = "Una lista de los teléfonos del usuario")
  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public UserCompany surnameFather(String surnameFather) {
    this.surnameFather = surnameFather;
    return this;
  }

   /**
   * El apellido paterno del usuario
   * @return surnameFather
  **/
  @Schema(description = "El apellido paterno del usuario")
  public String getSurnameFather() {
    return surnameFather;
  }

  public void setSurnameFather(String surnameFather) {
    this.surnameFather = surnameFather;
  }

  public UserCompany surnameMother(String surnameMother) {
    this.surnameMother = surnameMother;
    return this;
  }

   /**
   * El apellido materno del usuario
   * @return surnameMother
  **/
  @Schema(description = "El apellido materno del usuario")
  public String getSurnameMother() {
    return surnameMother;
  }

  public void setSurnameMother(String surnameMother) {
    this.surnameMother = surnameMother;
  }

  public UserCompany userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * El nombre del usuario de acceso
   * @return userName
  **/
  @Schema(description = "El nombre del usuario de acceso")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCompany userCompany = (UserCompany) o;
    return Objects.equals(this.emails, userCompany.emails) &&
        Objects.equals(this.legalRepresentative, userCompany.legalRepresentative) &&
        Objects.equals(this.maskedName, userCompany.maskedName) &&
        Objects.equals(this.maskedUserName, userCompany.maskedUserName) &&
        Objects.equals(this.name, userCompany.name) &&
        Objects.equals(this.phoneNumbers, userCompany.phoneNumbers) &&
        Objects.equals(this.surnameFather, userCompany.surnameFather) &&
        Objects.equals(this.surnameMother, userCompany.surnameMother) &&
        Objects.equals(this.userName, userCompany.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, legalRepresentative, maskedName, maskedUserName, name, phoneNumbers, surnameFather, surnameMother, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompany {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    legalRepresentative: ").append(toIndentedString(legalRepresentative)).append("\n");
    sb.append("    maskedName: ").append(toIndentedString(maskedName)).append("\n");
    sb.append("    maskedUserName: ").append(toIndentedString(maskedUserName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    surnameFather: ").append(toIndentedString(surnameFather)).append("\n");
    sb.append("    surnameMother: ").append(toIndentedString(surnameMother)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
