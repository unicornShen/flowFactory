package shen.flow.process.impl;

import shen.flow.model.FlowInfo;
import shen.flow.process.IProcess;

/**
 * <pre>
 * 流成建立 Service.
 * </pre>
 *
 * @since 2018年3月19日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月19日,Unicorn,new
 *          </ul>
 */
public class ProcessCreator {

    /**
     * 建立流程.
     * 
     * @param process 流程實作類別.
     * @param flowInfo 流程資訊相關物件.
     */
    public void newProcess(final IProcess process, final FlowInfo flowInfo) {

        System.out.println(process.getClass().getName());
        flowInfo.setClassName(process.getClass().getName());
        
        // Process create.
        this.create(process, flowInfo);
    }

    /** 建立流程(申請). */
    private FlowInfo create(final IProcess process, final FlowInfo flowInfo) {

        // 1. Save PF history to data base.
        flowInfo.setSeq("1");

        // 2. Write flow log.

        // 3. Do some thing after create flow success.
        process.create(flowInfo);

        // 4. Return data SEQ.???
        return flowInfo;
    }

}
