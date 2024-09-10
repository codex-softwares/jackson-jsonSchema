package ch.codexs.jackson.jsonSchema.testDataScala

import ch.codexs.jackson.jsonSchema.annotations.JsonSchemaDefault

case class PojoWithParentScala
(
  pojoValue:Boolean,
  child:ParentScala,

  @JsonSchemaDefault("x")
  stringWithDefault:String,
  @JsonSchemaDefault("12")
  intWithDefault:Int,
  @JsonSchemaDefault("true")
  booleanWithDefault:Boolean
)
