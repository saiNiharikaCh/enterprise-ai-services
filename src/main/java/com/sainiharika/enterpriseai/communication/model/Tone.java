package com.sainiharika.enterpriseai.communication.model;

import lombok.Getter;

@Getter
public enum Tone {

    PROFESSIONAL("Professional"),
    FRIENDLY("Friendly"),
    FORMAL("Formal"),
    CASUAL("Casual");

    private final String displayName;

    Tone(String displayName) {
        this.displayName = displayName;
    }

}
