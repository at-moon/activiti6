package com.eshore.activiti6.resource;

import org.activiti.app.model.common.ResultListDataRepresentation;
import org.activiti.app.rest.runtime.AbstractAppDefinitionsResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IdmResource extends AbstractAppDefinitionsResource {

    @RequestMapping("/app/rest/authenticate")
    public String authenticate() {
        return "{\"login\":\"admin\"}";
    }


    @RequestMapping("/app/authentication")
    public void authentication() {
    }


    @RequestMapping("/app/rest/account")
    public String account() {
        return "{\"id\":\"admin\",\"firstName\":null,\"lastName\":\"Administrator\",\"email\":\"admin\",\"fullName\":\" Administrator\",\"groups\":[{\"id\":\"ROLE_ADMIN\",\"name\":\"Superusers\",\"type\":\"security-role\"}]}";
    }


    @RequestMapping(value = "/app/rest/runtime/app-definitions", method = RequestMethod.GET)
    public ResultListDataRepresentation getAppDefinitions() {
        return super.getAppDefinitions();
    }
}
