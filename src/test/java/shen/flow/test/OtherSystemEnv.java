package shen.flow.test;

import java.util.ArrayList;
import java.util.List;

import shen.flow.model.FlowInfo;
import shen.flow.model.HistoryVo;
import shen.flow.process.impl.ProcessHandler;

/**
 * <pre>
 * Class說明。
 * </pre>
 *
 * @since 2018年3月18日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月18日,Unicorn,new
 *          </ul>
 */
public class OtherSystemEnv {

    public static void main(String[] args) {

        // Test new process.
        final FlowInfo flowInfo = new FlowInfo();
        flowInfo.setClassName(TestA1Process.class.getName());
        
        final List<HistoryVo> hsList = new ArrayList<>();
        
        final ProcessHandler process = new ProcessHandler();
        process.newProcess(flowInfo, hsList);

        // Test accept.
        process.accept("1");
    }

}
