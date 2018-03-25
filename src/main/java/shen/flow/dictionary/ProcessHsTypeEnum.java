package shen.flow.dictionary;

/**
 * <pre>
 * 歷史檔總類.
 * </pre>
 *
 * @since 2018年3月25日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月25日,Unicorn,new
 *          </ul>
 */
public enum ProcessHsTypeEnum {

    /** 原始檔. */
    SRC("src"), //

    /** 歷史檔. */
    HS("hs"), //
    ;

    /** 代號. */
    final String code;

    /**
     * @param code 代號.
     */
    private ProcessHsTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
