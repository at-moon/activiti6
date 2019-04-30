package com.eshore.activiti6.service;

import com.eshore.activiti6.entity.FcsActReProcess;
import org.activiti.engine.repository.ProcessDefinition;

public interface FcsActReProcessService {

    /**
     * 根据ProcessDefinition保存流程信息
     * @param processDefinition
     * @return
     */
    FcsActReProcess save(ProcessDefinition processDefinition);

}
