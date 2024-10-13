package me.sishelpdesk.SisHelpDesk.service;

import java.io.Serializable;

public class ObjectNotFoundException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
