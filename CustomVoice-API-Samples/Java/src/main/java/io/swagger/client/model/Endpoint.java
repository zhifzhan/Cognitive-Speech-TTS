/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Endpoint
 */
public class Endpoint {
  @SerializedName("concurrentRecognitions")
  private Integer concurrentRecognitions = null;

  @SerializedName("id")
  private UUID id = null;

  /**
   * The kind of this endpoint (e.g. custom speech, custom voice ...)
   */
  @JsonAdapter(EndpointKindEnum.Adapter.class)
  public enum EndpointKindEnum {
    NONE("None"),
    
    SPEECHRECOGNITION("SpeechRecognition"),
    
    CUSTOMVOICE("CustomVoice"),
    
    LANGUAGEGENERATION("LanguageGeneration"),
    
    LANGUAGEIDENTIFICATION("LanguageIdentification");

    private String value;

    EndpointKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EndpointKindEnum fromValue(String text) {
      for (EndpointKindEnum b : EndpointKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EndpointKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndpointKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EndpointKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EndpointKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("endpointKind")
  private EndpointKindEnum endpointKind = null;

  @SerializedName("endpointUrls")
  private Map<String, String> endpointUrls = new HashMap<String, String>();

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("Succeeded"),
    
    NOTSTARTED("NotStarted"),
    
    RUNNING("Running"),
    
    FAILED("Failed");

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

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("models")
  private List<Model> models = new ArrayList<Model>();

  @SerializedName("contentLoggingEnabled")
  private Boolean contentLoggingEnabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("locale")
  private String locale = null;

  public Endpoint concurrentRecognitions(Integer concurrentRecognitions) {
    this.concurrentRecognitions = concurrentRecognitions;
    return this;
  }

   /**
   * The number of concurrent recognitions the endpoint supports
   * @return concurrentRecognitions
  **/
  @ApiModelProperty(value = "The number of concurrent recognitions the endpoint supports")
  public Integer getConcurrentRecognitions() {
    return concurrentRecognitions;
  }

  public void setConcurrentRecognitions(Integer concurrentRecognitions) {
    this.concurrentRecognitions = concurrentRecognitions;
  }

  public Endpoint id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of this entity
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The identifier of this entity")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Endpoint endpointKind(EndpointKindEnum endpointKind) {
    this.endpointKind = endpointKind;
    return this;
  }

   /**
   * The kind of this endpoint (e.g. custom speech, custom voice ...)
   * @return endpointKind
  **/
  @ApiModelProperty(required = true, value = "The kind of this endpoint (e.g. custom speech, custom voice ...)")
  public EndpointKindEnum getEndpointKind() {
    return endpointKind;
  }

  public void setEndpointKind(EndpointKindEnum endpointKind) {
    this.endpointKind = endpointKind;
  }

  public Endpoint endpointUrls(Map<String, String> endpointUrls) {
    this.endpointUrls = endpointUrls;
    return this;
  }

  public Endpoint putEndpointUrlsItem(String key, String endpointUrlsItem) {
    this.endpointUrls.put(key, endpointUrlsItem);
    return this;
  }

   /**
   * The list of endpoint urls
   * @return endpointUrls
  **/
  @ApiModelProperty(required = true, value = "The list of endpoint urls")
  public Map<String, String> getEndpointUrls() {
    return endpointUrls;
  }

  public void setEndpointUrls(Map<String, String> endpointUrls) {
    this.endpointUrls = endpointUrls;
  }

  public Endpoint createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * The time-stamp when the object was created
   * @return createdDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the object was created")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Endpoint lastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
    return this;
  }

   /**
   * The time-stamp when the current status was entered
   * @return lastActionDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the current status was entered")
  public OffsetDateTime getLastActionDateTime() {
    return lastActionDateTime;
  }

  public void setLastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
  }

  public Endpoint status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the object
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the object")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Endpoint models(List<Model> models) {
    this.models = models;
    return this;
  }

  public Endpoint addModelsItem(Model modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Information about the deployed models
   * @return models
  **/
  @ApiModelProperty(required = true, value = "Information about the deployed models")
  public List<Model> getModels() {
    return models;
  }

  public void setModels(List<Model> models) {
    this.models = models;
  }

  public Endpoint contentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
    return this;
  }

   /**
   * A value indicating whether content logging (audio &amp;amp; transcriptions) is being used for a deployment.  Suppressing content logging will result in a higher cost for the deployment.  Free subscriptions can only deploy true
   * @return contentLoggingEnabled
  **/
  @ApiModelProperty(value = "A value indicating whether content logging (audio &amp; transcriptions) is being used for a deployment.  Suppressing content logging will result in a higher cost for the deployment.  Free subscriptions can only deploy true")
  public Boolean isContentLoggingEnabled() {
    return contentLoggingEnabled;
  }

  public void setContentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
  }

  public Endpoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Endpoint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Endpoint properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Endpoint putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity
   * @return properties
  **/
  @ApiModelProperty(value = "The custom properties of this entity")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Endpoint locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale of the contained data
   * @return locale
  **/
  @ApiModelProperty(value = "The locale of the contained data")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.concurrentRecognitions, endpoint.concurrentRecognitions) &&
        Objects.equals(this.id, endpoint.id) &&
        Objects.equals(this.endpointKind, endpoint.endpointKind) &&
        Objects.equals(this.endpointUrls, endpoint.endpointUrls) &&
        Objects.equals(this.createdDateTime, endpoint.createdDateTime) &&
        Objects.equals(this.lastActionDateTime, endpoint.lastActionDateTime) &&
        Objects.equals(this.status, endpoint.status) &&
        Objects.equals(this.models, endpoint.models) &&
        Objects.equals(this.contentLoggingEnabled, endpoint.contentLoggingEnabled) &&
        Objects.equals(this.name, endpoint.name) &&
        Objects.equals(this.description, endpoint.description) &&
        Objects.equals(this.properties, endpoint.properties) &&
        Objects.equals(this.locale, endpoint.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrentRecognitions, id, endpointKind, endpointUrls, createdDateTime, lastActionDateTime, status, models, contentLoggingEnabled, name, description, properties, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    concurrentRecognitions: ").append(toIndentedString(concurrentRecognitions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endpointKind: ").append(toIndentedString(endpointKind)).append("\n");
    sb.append("    endpointUrls: ").append(toIndentedString(endpointUrls)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    contentLoggingEnabled: ").append(toIndentedString(contentLoggingEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

