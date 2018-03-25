package shen.flow.process.impl;

import java.util.List;

import shen.flow.dictionary.ProcessingStatusEnum;
import shen.flow.model.FlowInfo;
import shen.flow.model.HistoryVo;
import shen.flow.process.IProcess;
import shen.flow.process.IProcessHandler;
import shen.flow.process.service.impl.SimpleProcess;

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
public class ProcessHandler implements IProcessHandler {

    /**
     * 建立流程.
     * 
     * @param flowInfo 流程資訊相關物件.
     * @param hsList 歷史檔.
     */
    public void newProcess(FlowInfo flowInfo, List<HistoryVo> hsList) {

        // 1. Save PF history to data base.
        flowInfo.setSeq("1");

        // 2. Write flow log.

        // 3. Do some thing after create flow success.
        final IProcess process = this.newInstance(flowInfo.getClassName());
        process.create(flowInfo);

        // 4. Return data SEQ.???
    }

    /**
     * 退回.
     * @param seq 流程資訊物件 SEQ.
     */
    public void reject(final String seq) {
        // 回壓狀態.
        ProcessingStatusEnum.REJECT.getCode();
    }

    /**
     * 核准.
     * @param seq 流程資訊物件 SEQ.
     */
    public void accept(final String seq) {
        // 回壓狀態.
        ProcessingStatusEnum.ACCEPT.getCode();

        try {
            IProcess process = (IProcess) Class.forName("shen.flow.test.TestA1Process").newInstance();
            process.accept(new FlowInfo());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 抄寫 History to main table.
    }

    private IProcess newInstance(final String clsName) {
        IProcess process = new SimpleProcess();
        try {
            process = (IProcess) Class.forName(clsName).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return process;
    }

}
