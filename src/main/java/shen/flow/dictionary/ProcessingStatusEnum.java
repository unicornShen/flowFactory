package shen.flow.dictionary;

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
public enum ProcessingStatusEnum {

    /** 申請. */
    CREATE("create", "申請"),

    /** 退回. */
    REJECT("reject", "退回"),

    /** 核准. */
    ACCEPT("accept", "核准"),;

    /** 代號. */
    final String code;

    /** 名稱. */
    final String name;

    /**
     * @param code 代號.
     * @param name 名稱.
     */
    private ProcessingStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
