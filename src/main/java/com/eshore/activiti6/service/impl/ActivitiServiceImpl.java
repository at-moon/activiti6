package com.eshore.activiti6.service.impl;

import com.eshore.activiti6.service.ActivitiService;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class ActivitiServiceImpl implements ActivitiService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private RepositoryService repositoryService;


    @Override
    public void test() {
        BpmnModel bpmnModel = repositoryService.getBpmnModel("myProcess_1:1:2504");
        Collection<FlowElement> flowElements = bpmnModel.getMainProcess().getFlowElements();
        for(FlowElement e : flowElements) {
            System.out.println("flowelement id:" + e.getId() + "  name:" + e.getName() + "   class:" + e.getClass().toString());
        }
    }
}
