/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * CronWorkflowStatus
 */
@javax.annotation.Generated(value = "io.argoproj.workflow.codegen.ArgoprojJavaClientOpenapiCodeGenerator", date = "2020-01-30T23:33:15.337Z[GMT]")
public class CronWorkflowStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULED_TIME = "lastScheduledTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULED_TIME)
  private DateTime lastScheduledTime = null;


  public CronWorkflowStatus active(List<V1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public CronWorkflowStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active is a list of active workflows stemming from this CronWorkflow
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active is a list of active workflows stemming from this CronWorkflow")

  public List<V1ObjectReference> getActive() {
    return active;
  }


  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }


  public CronWorkflowStatus lastScheduledTime(DateTime lastScheduledTime) {
    
    this.lastScheduledTime = lastScheduledTime;
    return this;
  }

   /**
   * Get lastScheduledTime
   * @return lastScheduledTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTime getLastScheduledTime() {
    return lastScheduledTime;
  }


  public void setLastScheduledTime(DateTime lastScheduledTime) {
    this.lastScheduledTime = lastScheduledTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronWorkflowStatus ioArgoprojWorkflowV1alpha1CronWorkflowStatus = (CronWorkflowStatus) o;
    return Objects.equals(this.active, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.active) &&
        Objects.equals(this.lastScheduledTime, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.lastScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduledTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronWorkflowStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
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
