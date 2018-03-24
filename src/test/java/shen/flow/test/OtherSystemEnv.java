package shen.flow.test;

import shen.flow.model.FlowInfo;
import shen.flow.process.impl.ProcessCreator;
import shen.flow.process.service.ProcessService;
import shen.flow.process.service.impl.ProcessServiceImpl;

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
        final ProcessCreator process = new ProcessCreator();
        
        // Test new process.
        final FlowInfo flowInfo = new FlowInfo();
        process.newProcess(new TestA1Process(), flowInfo);
        
        // Test accept.
        final ProcessService service = new ProcessServiceImpl();
        service.accept("1");
    }

}
