package com.expediagroup.graphql.generated.differentselectionsetquery

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import com.fasterxml.jackson.`annotation`.JsonTypeInfo.As.PROPERTY
import com.fasterxml.jackson.`annotation`.JsonTypeInfo.Id.NAME
import kotlin.Float
import kotlin.Int
import kotlin.String

/**
 * Very basic interface
 */
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename"
)
@JsonSubTypes(value = [com.fasterxml.jackson.annotation.JsonSubTypes.Type(value =
    FirstInterfaceImplementation2::class,
    name="FirstInterfaceImplementation"),com.fasterxml.jackson.annotation.JsonSubTypes.Type(value =
    SecondInterfaceImplementation2::class, name="SecondInterfaceImplementation")])
public interface BasicInterface2 {
  /**
   * Name field
   */
  public abstract val name: String
}

/**
 * Example interface implementation where value is an integer
 */
public data class FirstInterfaceImplementation2(
  /**
   * Name of the first implementation
   */
  public override val name: String,
  /**
   * Custom field integer value
   */
  public val intValue: Int
) : BasicInterface2

/**
 * Example interface implementation where value is a float
 */
public data class SecondInterfaceImplementation2(
  /**
   * Name of the second implementation
   */
  public override val name: String,
  /**
   * Custom field float value
   */
  public val floatValue: Float
) : BasicInterface2
