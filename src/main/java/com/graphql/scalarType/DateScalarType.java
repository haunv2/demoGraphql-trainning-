package com.graphql.scalarType;

import graphql.schema.*;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

//@Component
public class DateScalarType extends GraphQLScalarType {

    public DateScalarType() {

        super("datetime", "type for datetime", new Coercing() {
            @Override
            public Object serialize(Object dataFetcherResult) throws CoercingSerializeException {
                return dataFetcherResult.toString();
            }

            @Override
            public Object parseValue(Object input) throws CoercingParseValueException {
                return input.toString();
            }

            @Override
            public Object parseLiteral(Object input) throws CoercingParseLiteralException {
                if (input==null){
                    return new Timestamp(Calendar.getInstance().getTimeInMillis());
                }
                return new Timestamp(Long.valueOf(input.toString()));
            }
        });
        System.out.println("timestampScalar init");
    }
}
