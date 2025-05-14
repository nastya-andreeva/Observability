package com.misis.archapp.user.service.publisher;

import com.misis.archapp.contract.dto.UserCreatedEvent; // 💡 Добавь этот импорт
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {
    public void publishUserEvent(UserCreatedEvent event) {
        // Реализация
    }
}
