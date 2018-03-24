package shen.flow.process;

import shen.flow.model.FlowInfo;

/**
 * <pre>
 * Process interface.
 * </pre>
 *
 * @since 2018年3月18日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月18日,Unicorn,new
 *          </ul>
 */
public interface IProcess {

    /**
     * 申請(建立新流程).
     * @param flowInfo 流程資訊物件.
     */
    public void create(FlowInfo flowInfo);

    /**
     * 退回.
     * @param flowInfo 流程資訊物件.
     */
    public void reject(FlowInfo flowInfo);

    /**
     * 核准.
     * @param flowInfo 流程資訊物件.
     */
    public void accept(FlowInfo flowInfo);

}
