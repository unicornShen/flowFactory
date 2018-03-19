package shen.flow.model;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * 流程資訊物件.
 * </pre>
 *
 * @since 2018年3月19日
 * @author Unicorn
 * @version <ul>
 *            <li>2018年3月19日,Unicorn,new
 *          </ul>
 */
public class FlowInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String className;

    private List<HistoryVo> hisVoList;

    /** UUID. */
    private String seq;

    /** 參數ID. */
    private String paramId;

    /** 變更狀態1新增 2修改 3刪除. */
    private String changeStatus;

    /** 簽核狀態(0 簽核中 1通過 2退回). */
    private String approvalStatus;

    /** 變更說明. */
    private String changeSpec;

    /** 變更執行. */
    private String changeData;

    /** 變更時間. */
    private String changeTime;

    /** 變更人員ID. */
    private String changeId;

    /** 變更人員姓名. */
    private String changeName;

    /** 簽核時間. */
    private String approvalTime;

    /** 簽核人員ID. */
    private String approvalId;

    /** 簽核人員姓名. */
    private String approvalName;

    /** 建立人員. */
    private String createId;

    /** 建立時間. */
    private String createTime;

    /** 異動人員. */
    private String updateId;

    /** 異動時間. */
    private String updateTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<HistoryVo> getHisVoList() {
        return hisVoList;
    }

    public void setHisVoList(List<HistoryVo> hisVoList) {
        this.hisVoList = hisVoList;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getChangeSpec() {
        return changeSpec;
    }

    public void setChangeSpec(String changeSpec) {
        this.changeSpec = changeSpec;
    }

    public String getChangeData() {
        return changeData;
    }

    public void setChangeData(String changeData) {
        this.changeData = changeData;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    //    type.setSeq(rs.getString("seq")); // UUID
    //    type.setParamId(rs.getString("paramId")); // 參數ID
    //    type.setChangeStatus(rs.getString("changeStatus")); // 變更狀態1新增 2修改 3刪除
    //    type.setApprovalStatus(rs.getString("approvalStatus")); // 簽核狀態(0 簽核中 1通過 2退回)
    //    type.setChangeSpec(rs.getString("changeSpec")); // 變更說明(JSON)
    //    type.setChangeData(rs.getString("changeData")); // 變更執行(JSON)
    //    type.setChangeTime(rs.getString("changeTime")); // 變更時間
    //    type.setChangeId(rs.getString("changeId")); // 變更人員ID
    //    type.setChangeName(rs.getString("changeName")); // 變更人員姓名
    //    type.setApprovalTime(rs.getString("approvalTime")); // 簽核時間
    //    type.setApprovalId(rs.getString("approvalId")); // 簽核人員ID
    //    type.setApprovalName(rs.getString("approvalName")); // 簽核人員姓名
    //    type.setCreateId(rs.getString("createId")); // 建立人員
    //    type.setCreateTime(rs.getString("createTime")); // 建立時間
    //    type.setUpdateId(rs.getString("updateId")); // 異動人員
    //    type.setUpdateTime(rs.getString("updateTime")); // 異動時間
    //    seq
    //    paramId
    //    changeStatus
    //    approvalStatus
    //    changeSpec
    //    changeData
    //    changeTime
    //    changeId
    //    changeName
    //    approvalTime
    //    approvalId
    //    approvalName
    //    createId
    //    createTime
    //    updateId
    //    updateTime

}
