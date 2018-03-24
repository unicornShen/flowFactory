package shen.flow.process.service.impl;

import shen.flow.dictionary.ProcessingStatusEnum;
import shen.flow.model.FlowInfo;
import shen.flow.process.IProcess;
import shen.flow.process.service.ProcessService;

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
public class ProcessServiceImpl implements ProcessService {

    /**
     * 申請(建立新流程).
     * @param flowInfo 流程資訊物件.
     */
    public String create(final FlowInfo flowInfo) {
        // 壓狀態.
        ProcessingStatusEnum.CREATE.getCode();

        return "1";
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

}
