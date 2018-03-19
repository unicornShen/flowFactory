package shen.flow.process.helper;

import shen.flow.model.FlowInfo;
import shen.flow.process.IProcess;

/**
 * <pre>
 * Class說明。
 * </pre>
 *
 * @since 2018年3月19日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月19日,Unicorn,new
 *          </ul>
 */
public class ProcessCreateHelper {

    private IProcess process;
    
    /**
     * Constructor.
     * @param process Create flow implement.
     */
    public ProcessCreateHelper(IProcess process) {
        super();
        this.process = process;
    }

    /** 建立流程(申請). */
    public FlowInfo create(final FlowInfo flowInfo) {

        System.out.println(this.process.getClass().getName());
        flowInfo.setClassName(this.process.getClass().getName());

        // 1. Save PF history to data base.
        flowInfo.setSeq("1");

        // 2. Write flow log.

        // 3. Do some thing after create flow success.
        this.process.create(flowInfo);

        // 4. Return data SEQ.???
        return flowInfo;
    }

}
