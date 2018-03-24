package shen.flow.dictionary;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Processing status.
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

    private final static Map<String, ProcessingStatusEnum> ITEM_MAP;
    static {
        final Map<String, ProcessingStatusEnum> map = new HashMap<>();
        for (ProcessingStatusEnum type : ProcessingStatusEnum.values()) {
            map.put(type.getCode(), type);
        }

        ITEM_MAP = Collections.unmodifiableMap(map);
    }

    /**
     * Lookup name.
     * @param code Type code.
     */
    public static String lookupName(final String code) {
        if (ITEM_MAP.containsKey(code)) {
            return ITEM_MAP.get(code).getName();
        } else {
            return "";
        }
    }

}
