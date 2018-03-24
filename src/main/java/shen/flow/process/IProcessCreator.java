package shen.flow.process;

import shen.flow.model.FlowInfo;

/**
 * <pre>
 * Process creator interface.
 * </pre>
 *
 * @since 2018年3月19日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月19日,Unicorn,new
 *          </ul>
 */
public interface IProcessCreator {

    /**
     * 建立流程.
     * 
     * @param process 流程實作類別.
     * @param flowInfo 流程資訊相關物件.
     */
    public void newProcess(IProcess process, FlowInfo flowInfo);

}
