package com.poc.calculator.recipe.authenticator.infrastructure.event;

import com.poc.calculator.recipe.authenticator.application.port.NotificationPort;
import com.poc.calculator.recipe.notification.application.dto.NotificationDto;
import com.poc.calculator.recipe.notification.domain.model.NotificationType;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventNotificationAdapter implements NotificationPort {

  private final ApplicationEventPublisher events;

  public EventNotificationAdapter(ApplicationEventPublisher events) {
    this.events = events;
  }

  @Override
  public void sendNotification(String text) {
    events.publishEvent(new NotificationDto(NotificationType.EMAIL, "test"));
  }
}
