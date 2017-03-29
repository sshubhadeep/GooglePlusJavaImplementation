package com.sshubhadeep.plus;
import com.google.api.services.plus.model.Activity;
import com.google.api.services.plus.model.Person;

/**
 * Utility methods to print to the command line.
 * 
 * @author Shubhadeep Sarkar
 */
public class View {

  static void header1(String name) {
    System.out.println();
    System.out.println("================== " + name + " ==================");
    System.out.println();
  }

  static void header2(String name) {
    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~ " + name + " ~~~~~~~~~~~~~~~~~~");
    System.out.println();
  }

  static void show(Person person) {
    System.out.println("id: " + person.getId());
    System.out.println("name: " + person.getDisplayName());
    System.out.println("image url: " + person.getImage().getUrl());
    System.out.println("profile url: " + person.getUrl());
  }

  static void show(Activity activity) {
    System.out.println("id: " + activity.getId());
    System.out.println("url: " + activity.getUrl());
    System.out.println("content: " + activity.getObject().getContent());
  }

  static void separator() {
    System.out.println();
    System.out.println("------------------------------------------------------");
    System.out.println();
  }
}
