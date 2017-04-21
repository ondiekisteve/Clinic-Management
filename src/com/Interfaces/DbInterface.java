package com.Interfaces;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD, PARAMETER, METHOD, TYPE})
public @interface DbInterface {
        public enum Type {
            ORACLE,
            MYSQL,
            MONGODB,
            POSTGRESQL,
        }

        Type value();
    }