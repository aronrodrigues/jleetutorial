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
   * Says Hello to someone
   * @param someone Someone's name
   * @return A string greeting someone
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
