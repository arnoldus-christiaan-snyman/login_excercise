package com.poc.calculator.recipe.notification.interact.event;

import org.springframework.modulith.events.ApplicationModuleListener;

public class NotificationEventListener {

  @ApplicationModuleListener
  public void onEvent(Object event) {
    // Handle the event and send notification
  }

}
