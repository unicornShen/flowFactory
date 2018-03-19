package shen.flow.process.service;

import shen.flow.model.FlowInfo;

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
public interface CommonProcessService {

    /**
     * 申請(建立新流程).
     * @param flowInfo 流程資訊物件.
     */
    public String create(FlowInfo flowInfo);

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
