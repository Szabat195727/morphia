package org.mongodb.morphia.query.validation;

import org.mongodb.morphia.query.FilterOperator;

import java.util.List;

public final class SizeOperationValidator implements OperationValidator {
    private SizeOperationValidator() { }

    public static boolean validate(final Class<?> type, final FilterOperator operator, final Object value) {
        return operator.equals(FilterOperator.SIZE)
               && (List.class.isAssignableFrom(type) || type.isArray()) 
               && value instanceof Integer;
    }
}
