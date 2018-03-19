package shen.flow.test;

import shen.flow.model.FlowInfo;
import shen.flow.process.IProcess;

/**
 * <pre>
 * 各流程實作.
 * </pre>
 *
 * @since 2018年3月19日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月19日,Unicorn,new
 *          </ul>
 */
public class TestA1Process implements IProcess {

    /**
     * 申請(建立新流程).
     * @param flowInfo 流程資訊物件.
     */
    public void create(final FlowInfo flowInfo) {
        System.out.println("TestA1Process.create()");
    }

    /**
     * 退回.
     */
    public void reject(final FlowInfo flowInfo) {
        System.out.println("TestA1Process.reject()");
    }

    /**
     * 核准.
     */
    public void accept(final FlowInfo flowInfo) {
        System.out.println("TestA1Process.accept()");
    }

}
