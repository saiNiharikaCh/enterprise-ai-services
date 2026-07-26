package com.sainiharika.enterpriseai.common.ai.model;

import lombok.Getter;

@Getter
public enum UserPromptTemplate implements PromptTemplate {

    WORK_FROM_HOME("work-from-home"),
    LEAVE_REQUEST("leave-request"),
    APPRECIATION("appreciation");

    private final String templateName;

    UserPromptTemplate(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public String getFileName() {
        return "/prompts/userPrompts/" + getTemplateName() + ".st";
    }
}
