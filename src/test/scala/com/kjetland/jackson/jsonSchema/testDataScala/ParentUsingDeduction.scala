package com.kjetland.jackson.jsonSchema.testDataScala

import com.fasterxml.jackson.annotation.{JsonProperty, JsonSubTypes, JsonTypeInfo}

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes(
  Array(
    new JsonSubTypes.Type(value = classOf[Child1UsingDeduction]),
    new JsonSubTypes.Type(value = classOf[Child2UsingDeduction])
  )
)
trait ParentUsingDeduction

case class Child1UsingDeduction
(
  parentString: String,
  child1String: String,

  @JsonProperty("_child1String2")
  child1String2: String,

  @JsonProperty(value = "_child1String3", required = true)
  child1String3: String
) extends ParentUsingDeduction

case class Child2UsingDeduction
(
  parentString: String,
  child2int: Int
) extends ParentUsingDeduction