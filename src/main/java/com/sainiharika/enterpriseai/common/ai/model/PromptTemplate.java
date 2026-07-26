package com.sainiharika.enterpriseai.common.ai.model;

import lombok.Getter;

@Getter
public enum PromptTemplate {

    WORK_FROM_HOME("work-from-home"),
    LEAVE_REQUEST("leave-request"),
    APPRECIATION("appreciation");

    private final String templateName;

    PromptTemplate(String templateName) {
        this.templateName = templateName;
    }

}
