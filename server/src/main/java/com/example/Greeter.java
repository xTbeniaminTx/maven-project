package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *
   * @param someone string
   * @return string
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
