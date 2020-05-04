package com.example.heteoasrestapi.events;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;

@Component
public class EventValidator {

    public void validate(EventDto eventDto, Errors errors) {
        if (eventDto.getBasePrice() > eventDto.getMaxPrice() && eventDto.getMaxPrice() != 0) {
            errors.rejectValue("basePrice", "WrongValue", "BasePrice is wrong.");
            errors.rejectValue("maxPrice", "WrongValue", "MaxPrice is wrong."); // field error
            errors.reject("WrongPrices", "Values for prices are wrong."); // global error
        }

        LocalDateTime endEventDateTime = eventDto.getEndEventDateTime();
        if (endEventDateTime.isBefore(eventDto.getBeginEventDateTime())
        || endEventDateTime.isBefore(eventDto.getCloseEnrollmentDateTime())
        || endEventDateTime.isBefore(eventDto.getBeginEnrollmentDateTime())) {
            errors.rejectValue("endEventDateTime", "WrongValue", "EndEventDateTime is wrong.");
        }
    }
}
