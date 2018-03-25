package shen.flow.dictionary;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 流程變更狀態.
 * </pre>
 *
 * @since 2018年3月25日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月25日,Unicorn,new
 *          </ul>
 */
public enum ProcessChangeEnum {

    /** 新增. */
    NEW("new", "新增"), //

    /** 修改. */
    MODIFY("modify", "修改"), //

    /** 刪除. */
    DELETE("delete", "刪除"), //
    ;

    /** 代號. */
    final String code;

    /** 名稱. */
    final String name;

    /**
     * @param code 代號.
     * @param name 名稱.
     */
    private ProcessChangeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private final static Map<String, ProcessChangeEnum> ITEM_MAP;
    static {
        final Map<String, ProcessChangeEnum> map = new HashMap<>();
        for (ProcessChangeEnum type : ProcessChangeEnum.values()) {
            map.put(type.getCode(), type);
        }

        ITEM_MAP = Collections.unmodifiableMap(map);
    }

    /**
     * Lookup name.
     * 
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
