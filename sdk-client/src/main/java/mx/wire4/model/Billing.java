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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import mx.wire4.model.BillingTransaction;
/**
 * Contiene la información de la factura
 */
@Schema(description = "Contiene la información de la factura")


public class Billing {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("emission_at")
  private OffsetDateTime emissionAt = null;

  @SerializedName("end_date")
  private OffsetDateTime endDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  /**
   * Estatus de la factura
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("PAID")
    PAID("PAID"),
    @SerializedName("OMMITED")
    OMMITED("OMMITED"),
    @SerializedName("WAITING_PAYMENT")
    WAITING_PAYMENT("WAITING_PAYMENT"),
    @SerializedName("EMISSION_PENDING")
    EMISSION_PENDING("EMISSION_PENDING");

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

  @SerializedName("transactions")
  private List<BillingTransaction> transactions = null;

  @SerializedName("url_pdf")
  private String urlPdf = null;

  @SerializedName("url_xml")
  private String urlXml = null;

  public Billing amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Monto total de la factura
   * @return amount
  **/
  @Schema(description = "Monto total de la factura")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Billing emissionAt(OffsetDateTime emissionAt) {
    this.emissionAt = emissionAt;
    return this;
  }

   /**
   * Fecha y hora en que se emitió de la factura
   * @return emissionAt
  **/
  @Schema(description = "Fecha y hora en que se emitió de la factura")
  public OffsetDateTime getEmissionAt() {
    return emissionAt;
  }

  public void setEmissionAt(OffsetDateTime emissionAt) {
    this.emissionAt = emissionAt;
  }

  public Billing endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Fecha en que finaliza el periodo que se factura
   * @return endDate
  **/
  @Schema(description = "Fecha en que finaliza el periodo que se factura")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Billing id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador de la factura
   * @return id
  **/
  @Schema(description = "Identificador de la factura")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Billing startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Fecha de inicio del periodo que se factura
   * @return startDate
  **/
  @Schema(description = "Fecha de inicio del periodo que se factura")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Billing status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Estatus de la factura
   * @return status
  **/
  @Schema(description = "Estatus de la factura")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Billing transactions(List<BillingTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Billing addTransactionsItem(BillingTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @Schema(description = "")
  public List<BillingTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<BillingTransaction> transactions) {
    this.transactions = transactions;
  }

  public Billing urlPdf(String urlPdf) {
    this.urlPdf = urlPdf;
    return this;
  }

   /**
   * Url de la representación impresa en pdf de la factura
   * @return urlPdf
  **/
  @Schema(description = "Url de la representación impresa en pdf de la factura")
  public String getUrlPdf() {
    return urlPdf;
  }

  public void setUrlPdf(String urlPdf) {
    this.urlPdf = urlPdf;
  }

  public Billing urlXml(String urlXml) {
    this.urlXml = urlXml;
    return this;
  }

   /**
   * Url del archivo xml de la factura
   * @return urlXml
  **/
  @Schema(description = "Url del archivo xml de la factura")
  public String getUrlXml() {
    return urlXml;
  }

  public void setUrlXml(String urlXml) {
    this.urlXml = urlXml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billing billing = (Billing) o;
    return Objects.equals(this.amount, billing.amount) &&
        Objects.equals(this.emissionAt, billing.emissionAt) &&
        Objects.equals(this.endDate, billing.endDate) &&
        Objects.equals(this.id, billing.id) &&
        Objects.equals(this.startDate, billing.startDate) &&
        Objects.equals(this.status, billing.status) &&
        Objects.equals(this.transactions, billing.transactions) &&
        Objects.equals(this.urlPdf, billing.urlPdf) &&
        Objects.equals(this.urlXml, billing.urlXml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, emissionAt, endDate, id, startDate, status, transactions, urlPdf, urlXml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billing {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    emissionAt: ").append(toIndentedString(emissionAt)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    urlPdf: ").append(toIndentedString(urlPdf)).append("\n");
    sb.append("    urlXml: ").append(toIndentedString(urlXml)).append("\n");
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
