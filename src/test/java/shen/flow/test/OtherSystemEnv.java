package shen.flow.test;

import shen.flow.model.FlowInfo;
import shen.flow.process.helper.ProcessCreateHelper;

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
        final ProcessCreateHelper process = new ProcessCreateHelper(new TestA1Process());
        process.create(new FlowInfo());
    }

}
