package shen.flow.process;

import java.util.List;

import shen.flow.model.FlowInfo;
import shen.flow.model.HistoryVo;

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
public interface IProcessHandler {

    /**
     * 建立流程.
     * 
     * @param flowInfo 流程資訊相關物件.
     * @param hsList 歷史檔.
     */
    public void newProcess(FlowInfo flowInfo, List<HistoryVo> hsList);

    /**
     * 退回.
     * @param seq 流程資訊物件 SEQ.
     */
    public void reject(String seq);

    /**
     * 核准.
     * @param seq 流程資訊物件 SEQ.
     */
    public void accept(String seq);
}
