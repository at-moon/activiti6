package com.eshore.activiti6.service.impl;

import com.eshore.activiti6.entity.FcsActReProcess;
import com.eshore.activiti6.service.FcsActReProcessService;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.stereotype.Service;

@Service
public class FcsActReProcessServiceImpl implements FcsActReProcessService {

    @Override
    public FcsActReProcess save(ProcessDefinition processDefinition){
        FcsActReProcess fcsActReProcess = new FcsActReProcess();
        fcsActReProcess.setId(processDefinition.getId());
        fcsActReProcess.setName(processDefinition.getName());
        fcsActReProcess.setKey(processDefinition.getKey());
        fcsActReProcess.setVersion((long)processDefinition.getVersion());
        fcsActReProcess.setDeploymentId(processDefinition.getDeploymentId());
        // >
        fcsActReProcess.setType("app");
        fcsActReProcess.setState("1");
        return fcsActReProcess;
    }
}
