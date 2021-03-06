package com.eshore.activiti6.service.impl;

import com.eshore.activiti6.entity.FcsActReFlow;
import com.eshore.activiti6.entity.FcsActReTask;
import com.eshore.activiti6.repository.FcsActReProcessRepository;
import com.eshore.activiti6.service.ActivitiService;
import com.eshore.activiti6.service.FcsActReProcessService;
import org.activiti.bpmn.model.*;
import org.activiti.bpmn.model.Process;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
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

    @Autowired
    private FcsActReProcessService fcsActReProcessService;

    @Override
    public void test() {
//        BpmnModel bpmnModel = repositoryService.getBpmnModel("myProcess_1:1:2504");
        BpmnModel bpmnModel = repositoryService.getBpmnModel("test_01:1:2504");
        Process process = bpmnModel.getMainProcess();
        ProcessDefinition definition = getProcessDefinitionByKey(process.getId());
        // 保存流程信息
        fcsActReProcessService.save(definition);
        Collection<FlowElement> flowElements = process.getFlowElements();
        for(FlowElement e : flowElements) {
            System.out.println("flowelement id:" + e.getId() + "  name:" + e.getName() + "   class:" + e.getClass().toString());
            if (e instanceof UserTask) {
                UserTask userTask = (UserTask)e;
                FcsActReTask fcsActReTask = new FcsActReTask();
                fcsActReTask.setId(userTask.getId());
                fcsActReTask.setName(userTask.getName());
                fcsActReTask.setProcessId(definition.getId());
                fcsActReTask.setId(userTask.getExtensionId());
            }
            if (e instanceof SequenceFlow) {
                SequenceFlow sequenceFlow = (SequenceFlow)e;
                FcsActReFlow fcsActReFlow = new FcsActReFlow();
                fcsActReFlow.setId(sequenceFlow.getId());
                fcsActReFlow.setName(sequenceFlow.getName());
                fcsActReFlow.setProcessId(definition.getId());
                fcsActReFlow.setSourceTaskId(sequenceFlow.getSourceRef());
                fcsActReFlow.setTargetTaskId(sequenceFlow.getTargetRef());
                fcsActReFlow.setRule(sequenceFlow.getConditionExpression());
            }


        }
    }

    /**
     * 获取流程定义信息
     * @param key
     * @return
     */
    private ProcessDefinition getProcessDefinitionByKey(String key){
        // 开启流程之前先寻找最新版本的请假流程定义
        ProcessDefinitionQuery query = repositoryService.createProcessDefinitionQuery();
        // 添加查询条件，KEY
        query.processDefinitionKey(key);
        // 最新版本过滤
        query.latestVersion();
        // 查询
        return query.singleResult();
    }
}
