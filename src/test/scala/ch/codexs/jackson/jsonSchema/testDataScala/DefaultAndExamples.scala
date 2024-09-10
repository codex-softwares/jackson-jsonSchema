package ch.codexs.jackson.jsonSchema.testDataScala

import ch.codexs.jackson.jsonSchema.annotations.{JsonSchemaDefault, JsonSchemaExamples}
import com.fasterxml.jackson.annotation.JsonProperty

case class DefaultAndExamples
(
  @JsonSchemaExamples(Array("user@example.com"))
  emailValue:String,
  @JsonSchemaDefault("12")
  @JsonSchemaExamples(Array("10", "14", "18"))
  fontSize:Int,

  @JsonProperty( defaultValue = "ds")
  defaultStringViaJsonValue:String,
  @JsonProperty( defaultValue = "1")
  defaultIntViaJsonValue:Int,
  @JsonProperty( defaultValue = "true")
  defaultBoolViaJsonValue:Boolean
)
