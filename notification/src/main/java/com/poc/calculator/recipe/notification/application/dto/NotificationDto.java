package com.poc.calculator.recipe.notification.application.dto;

import com.poc.calculator.recipe.notification.domain.model.NotificationType;

public record NotificationDto(NotificationType type, String jteTemplate) { }
