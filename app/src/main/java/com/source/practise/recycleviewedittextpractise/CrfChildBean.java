package com.source.practise.recycleviewedittextpractise;

import com.google.gson.Gson;

import java.util.List;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.CrfChildBean</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:33.
 */
public class CrfChildBean {
    /**
     * criteriaDataType : NUMBER
     * moduleDefineType : LEAF
     * moduleDefineOrder : 3
     * moduleDefineUsingScore : 0
     * moduleItem : 446
     * moduleDefineCommentFlag : 0
     * children : []
     * moduleDefineFreezeColumns : 0
     * usingCondAssign : 0
     * projectDefineId : 20717
     * datas : false
     * id : 95770
     * open : false
     * moduleDefineVirtual : INDICATOR_232_444T + INDICATOR_232_445T
     * moduleDefineIsIntrinsic : 0
     * moduleDefineIsVirtual : 1
     * name : BMI
     * value : INDICATOR_232_446T
     * iconSkin : LEAF
     * directive : {"calculateScore":null,"calculate":"INDICATOR_232_444T + INDICATOR_232_445T","reference":[{"dataType":"NUMBER","isInSameGroup":1,"name":"体重","value":"INDICATOR_232_445T"},{"dataType":"NUMBER","isInSameGroup":1,"name":"身高","value":"INDICATOR_232_444T"}]}
     * nodeType : NodeType_LEAF
     * mouduleDefineIsDisplay : 1
     * moduleDefineDescribe :
     * moduleDefineIsDisplayGlobalCrf : 1
     * projectDefineName : BMI
     * moduleDefineUsingGlobalCrf : 0
     * moduleDefineIsRequired : 0
     * moduleId : 232
     * projectDefine : {"projectDefineType":"LEAF","projectDefineName":"BMI","projectDefineOrder":3,"projectDefineDataFormatId":2,"projectDefineParentId":20713,"criteriaDefineId":330,"unitDefineTemp":{"createTime":null,"status":null,"unitDefineValue":null,"unitDefineId":23,"modifyTime":null},"projectItemId":197,"children":[],"projectDefineIsPopup":"0","projectDefineIsIntrinsic":"0","projectId":65,"unitDefineId":23,"treeNodeOrder":3,"treeNodeId":20717,"projectDefineId":20717,"projectDefineWebType":"INPUT","projectDefineDateFormatTemp":{"projectDefineDataFormatId":2,"projectDefineDataType":null,"projectDefineDataFormatValue":null,"projectDefineDataFormatComment":null},"projectDefineSearchFlag":"1","treeParentNodeId":20713,"projectDefineConstraints":[{"projectDefineConstraintId":null,"projectDefineConstraintComment":null,"projectDefineConstraintValue":null,"projectDefineConstraintItem":null,"projectDefineConstraintType":null,"projectDefineId":20717}],"allowAddTimes":1}
     * criteriaDefineId : 330
     * moduleDefineUsingDefaultValue : 0
     * moduleDefineIsDatas : 0
     * isParent : false
     * number : true
     * moduleDefineIsGlobalCrf : 0
     * treeNodeOrder : 3
     * treeNodeId : 95770
     * moduleDefineIsFieldHorizontal : 0
     * criteriaDefineDescrible :
     * moduleDefineName : BMI
     * moduleDefineUploadFile : 0
     * moduleDefineId : 95770
     * projectDefineDataFormat : {"projectDefineDataFormatId":2,"projectDefineDataType":"NUMBER","projectDefineDataFormatValue":"9999.99","projectDefineDataFormatComment":null}
     * unitDefine : {"createTime":"2017-05-06 10:53:47","status":"ACTIVE","unitDefineValue":"kg/m2","unitDefineId":23,"modifyTime":null}
     * moduleDefineIsForm : 0
     * moduleDefineParentId : 95767
     * treeParentNodeId : 95767
     * moduleDefineCode : INDICATOR_232_446T
     */

    private String criteriaDataType;
    private String moduleDefineType;
    private int moduleDefineOrder;
    private String moduleDefineUsingScore;
    private int moduleItem;
    private String moduleDefineCommentFlag;
    private int moduleDefineFreezeColumns;
    private String usingCondAssign;
    private int projectDefineId;
    private boolean datas;
    private String id;
    private String open;
    private String moduleDefineVirtual;
    private String moduleDefineIsIntrinsic;
    private String moduleDefineIsVirtual;
    private String name;
    private String value;
    private String iconSkin;
    private DirectiveBean directive;
    private String nodeType;
    private String mouduleDefineIsDisplay;
    private String moduleDefineDescribe;
    private String moduleDefineIsDisplayGlobalCrf;
    private String projectDefineName;
    private String moduleDefineUsingGlobalCrf;
    private String moduleDefineIsRequired;
    private int moduleId;
    private ProjectDefineBean projectDefine;
    private int criteriaDefineId;
    private String moduleDefineUsingDefaultValue;
    private String moduleDefineIsDatas;
    private String isParent;
    private boolean number;
    private String moduleDefineIsGlobalCrf;
    private int treeNodeOrder;
    private int treeNodeId;
    private String moduleDefineIsFieldHorizontal;
    private String criteriaDefineDescrible;
    private String moduleDefineName;
    private String moduleDefineUploadFile;
    private int moduleDefineId;
    private ProjectDefineDataFormatBean projectDefineDataFormat;
    private UnitDefineBean unitDefine;
    private String moduleDefineIsForm;
    private int moduleDefineParentId;
    private int treeParentNodeId;
    private String moduleDefineCode;


    public static CrfChildBean objectFromData(String str) {

        return new Gson().fromJson(str, CrfChildBean.class);
    }

    public String getCriteriaDataType() {
        return criteriaDataType;
    }

    public void setCriteriaDataType(String criteriaDataType) {
        this.criteriaDataType = criteriaDataType;
    }

    public String getModuleDefineType() {
        return moduleDefineType;
    }

    public void setModuleDefineType(String moduleDefineType) {
        this.moduleDefineType = moduleDefineType;
    }

    public int getModuleDefineOrder() {
        return moduleDefineOrder;
    }

    public void setModuleDefineOrder(int moduleDefineOrder) {
        this.moduleDefineOrder = moduleDefineOrder;
    }

    public String getModuleDefineUsingScore() {
        return moduleDefineUsingScore;
    }

    public void setModuleDefineUsingScore(String moduleDefineUsingScore) {
        this.moduleDefineUsingScore = moduleDefineUsingScore;
    }

    public int getModuleItem() {
        return moduleItem;
    }

    public void setModuleItem(int moduleItem) {
        this.moduleItem = moduleItem;
    }

    public String getModuleDefineCommentFlag() {
        return moduleDefineCommentFlag;
    }

    public void setModuleDefineCommentFlag(String moduleDefineCommentFlag) {
        this.moduleDefineCommentFlag = moduleDefineCommentFlag;
    }

    public int getModuleDefineFreezeColumns() {
        return moduleDefineFreezeColumns;
    }

    public void setModuleDefineFreezeColumns(int moduleDefineFreezeColumns) {
        this.moduleDefineFreezeColumns = moduleDefineFreezeColumns;
    }

    public String getUsingCondAssign() {
        return usingCondAssign;
    }

    public void setUsingCondAssign(String usingCondAssign) {
        this.usingCondAssign = usingCondAssign;
    }

    public int getProjectDefineId() {
        return projectDefineId;
    }

    public void setProjectDefineId(int projectDefineId) {
        this.projectDefineId = projectDefineId;
    }

    public boolean isDatas() {
        return datas;
    }

    public void setDatas(boolean datas) {
        this.datas = datas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getModuleDefineVirtual() {
        return moduleDefineVirtual;
    }

    public void setModuleDefineVirtual(String moduleDefineVirtual) {
        this.moduleDefineVirtual = moduleDefineVirtual;
    }

    public String getModuleDefineIsIntrinsic() {
        return moduleDefineIsIntrinsic;
    }

    public void setModuleDefineIsIntrinsic(String moduleDefineIsIntrinsic) {
        this.moduleDefineIsIntrinsic = moduleDefineIsIntrinsic;
    }

    public String getModuleDefineIsVirtual() {
        return moduleDefineIsVirtual;
    }

    public void setModuleDefineIsVirtual(String moduleDefineIsVirtual) {
        this.moduleDefineIsVirtual = moduleDefineIsVirtual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIconSkin() {
        return iconSkin;
    }

    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public DirectiveBean getDirective() {
        return directive;
    }

    public void setDirective(DirectiveBean directive) {
        this.directive = directive;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getMouduleDefineIsDisplay() {
        return mouduleDefineIsDisplay;
    }

    public void setMouduleDefineIsDisplay(String mouduleDefineIsDisplay) {
        this.mouduleDefineIsDisplay = mouduleDefineIsDisplay;
    }

    public String getModuleDefineDescribe() {
        return moduleDefineDescribe;
    }

    public void setModuleDefineDescribe(String moduleDefineDescribe) {
        this.moduleDefineDescribe = moduleDefineDescribe;
    }

    public String getModuleDefineIsDisplayGlobalCrf() {
        return moduleDefineIsDisplayGlobalCrf;
    }

    public void setModuleDefineIsDisplayGlobalCrf(String moduleDefineIsDisplayGlobalCrf) {
        this.moduleDefineIsDisplayGlobalCrf = moduleDefineIsDisplayGlobalCrf;
    }

    public String getProjectDefineName() {
        return projectDefineName;
    }

    public void setProjectDefineName(String projectDefineName) {
        this.projectDefineName = projectDefineName;
    }

    public String getModuleDefineUsingGlobalCrf() {
        return moduleDefineUsingGlobalCrf;
    }

    public void setModuleDefineUsingGlobalCrf(String moduleDefineUsingGlobalCrf) {
        this.moduleDefineUsingGlobalCrf = moduleDefineUsingGlobalCrf;
    }

    public String getModuleDefineIsRequired() {
        return moduleDefineIsRequired;
    }

    public void setModuleDefineIsRequired(String moduleDefineIsRequired) {
        this.moduleDefineIsRequired = moduleDefineIsRequired;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public ProjectDefineBean getProjectDefine() {
        return projectDefine;
    }

    public void setProjectDefine(ProjectDefineBean projectDefine) {
        this.projectDefine = projectDefine;
    }

    public int getCriteriaDefineId() {
        return criteriaDefineId;
    }

    public void setCriteriaDefineId(int criteriaDefineId) {
        this.criteriaDefineId = criteriaDefineId;
    }

    public String getModuleDefineUsingDefaultValue() {
        return moduleDefineUsingDefaultValue;
    }

    public void setModuleDefineUsingDefaultValue(String moduleDefineUsingDefaultValue) {
        this.moduleDefineUsingDefaultValue = moduleDefineUsingDefaultValue;
    }

    public String getModuleDefineIsDatas() {
        return moduleDefineIsDatas;
    }

    public void setModuleDefineIsDatas(String moduleDefineIsDatas) {
        this.moduleDefineIsDatas = moduleDefineIsDatas;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public boolean isNumber() {
        return number;
    }

    public void setNumber(boolean number) {
        this.number = number;
    }

    public String getModuleDefineIsGlobalCrf() {
        return moduleDefineIsGlobalCrf;
    }

    public void setModuleDefineIsGlobalCrf(String moduleDefineIsGlobalCrf) {
        this.moduleDefineIsGlobalCrf = moduleDefineIsGlobalCrf;
    }

    public int getTreeNodeOrder() {
        return treeNodeOrder;
    }

    public void setTreeNodeOrder(int treeNodeOrder) {
        this.treeNodeOrder = treeNodeOrder;
    }

    public int getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(int treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getModuleDefineIsFieldHorizontal() {
        return moduleDefineIsFieldHorizontal;
    }

    public void setModuleDefineIsFieldHorizontal(String moduleDefineIsFieldHorizontal) {
        this.moduleDefineIsFieldHorizontal = moduleDefineIsFieldHorizontal;
    }

    public String getCriteriaDefineDescrible() {
        return criteriaDefineDescrible;
    }

    public void setCriteriaDefineDescrible(String criteriaDefineDescrible) {
        this.criteriaDefineDescrible = criteriaDefineDescrible;
    }

    public String getModuleDefineName() {
        return moduleDefineName;
    }

    public void setModuleDefineName(String moduleDefineName) {
        this.moduleDefineName = moduleDefineName;
    }

    public String getModuleDefineUploadFile() {
        return moduleDefineUploadFile;
    }

    public void setModuleDefineUploadFile(String moduleDefineUploadFile) {
        this.moduleDefineUploadFile = moduleDefineUploadFile;
    }

    public int getModuleDefineId() {
        return moduleDefineId;
    }

    public void setModuleDefineId(int moduleDefineId) {
        this.moduleDefineId = moduleDefineId;
    }

    public ProjectDefineDataFormatBean getProjectDefineDataFormat() {
        return projectDefineDataFormat;
    }

    public void setProjectDefineDataFormat(ProjectDefineDataFormatBean projectDefineDataFormat) {
        this.projectDefineDataFormat = projectDefineDataFormat;
    }

    public UnitDefineBean getUnitDefine() {
        return unitDefine;
    }

    public void setUnitDefine(UnitDefineBean unitDefine) {
        this.unitDefine = unitDefine;
    }

    public String getModuleDefineIsForm() {
        return moduleDefineIsForm;
    }

    public void setModuleDefineIsForm(String moduleDefineIsForm) {
        this.moduleDefineIsForm = moduleDefineIsForm;
    }

    public int getModuleDefineParentId() {
        return moduleDefineParentId;
    }

    public void setModuleDefineParentId(int moduleDefineParentId) {
        this.moduleDefineParentId = moduleDefineParentId;
    }

    public int getTreeParentNodeId() {
        return treeParentNodeId;
    }

    public void setTreeParentNodeId(int treeParentNodeId) {
        this.treeParentNodeId = treeParentNodeId;
    }

    public String getModuleDefineCode() {
        return moduleDefineCode;
    }

    public void setModuleDefineCode(String moduleDefineCode) {
        this.moduleDefineCode = moduleDefineCode;
    }





    public static class ProjectDefineBean {
        /**
         * projectDefineType : LEAF
         * projectDefineName : BMI
         * projectDefineOrder : 3
         * projectDefineDataFormatId : 2
         * projectDefineParentId : 20713
         * criteriaDefineId : 330
         * unitDefineTemp : {"createTime":null,"status":null,"unitDefineValue":null,"unitDefineId":23,"modifyTime":null}
         * projectItemId : 197
         * children : []
         * projectDefineIsPopup : 0
         * projectDefineIsIntrinsic : 0
         * projectId : 65
         * unitDefineId : 23
         * treeNodeOrder : 3
         * treeNodeId : 20717
         * projectDefineId : 20717
         * projectDefineWebType : INPUT
         * projectDefineDateFormatTemp : {"projectDefineDataFormatId":2,"projectDefineDataType":null,"projectDefineDataFormatValue":null,"projectDefineDataFormatComment":null}
         * projectDefineSearchFlag : 1
         * treeParentNodeId : 20713
         * projectDefineConstraints : [{"projectDefineConstraintId":null,"projectDefineConstraintComment":null,"projectDefineConstraintValue":null,"projectDefineConstraintItem":null,"projectDefineConstraintType":null,"projectDefineId":20717}]
         * allowAddTimes : 1
         */

        private String projectDefineType;
        private String projectDefineName;
        private int projectDefineOrder;
        private int projectDefineDataFormatId;
        private int projectDefineParentId;
        private int criteriaDefineId;
        private UnitDefineTempBean unitDefineTemp;
        private int projectItemId;
        private String projectDefineIsPopup;
        private String projectDefineIsIntrinsic;
        private int projectId;
        private int unitDefineId;
        private int treeNodeOrder;
        private int treeNodeId;
        private int projectDefineId;
        private String projectDefineWebType;
        private ProjectDefineDateFormatTempBean projectDefineDateFormatTemp;
        private String projectDefineSearchFlag;
        private int treeParentNodeId;
        private int allowAddTimes;
        private List<?> children;
        private List<ProjectDefineConstraintsBean> projectDefineConstraints;

        public static ProjectDefineBean objectFromData(String str) {

            return new Gson().fromJson(str, ProjectDefineBean.class);
        }

        public String getProjectDefineType() {
            return projectDefineType;
        }

        public void setProjectDefineType(String projectDefineType) {
            this.projectDefineType = projectDefineType;
        }

        public String getProjectDefineName() {
            return projectDefineName;
        }

        public void setProjectDefineName(String projectDefineName) {
            this.projectDefineName = projectDefineName;
        }

        public int getProjectDefineOrder() {
            return projectDefineOrder;
        }

        public void setProjectDefineOrder(int projectDefineOrder) {
            this.projectDefineOrder = projectDefineOrder;
        }

        public int getProjectDefineDataFormatId() {
            return projectDefineDataFormatId;
        }

        public void setProjectDefineDataFormatId(int projectDefineDataFormatId) {
            this.projectDefineDataFormatId = projectDefineDataFormatId;
        }

        public int getProjectDefineParentId() {
            return projectDefineParentId;
        }

        public void setProjectDefineParentId(int projectDefineParentId) {
            this.projectDefineParentId = projectDefineParentId;
        }

        public int getCriteriaDefineId() {
            return criteriaDefineId;
        }

        public void setCriteriaDefineId(int criteriaDefineId) {
            this.criteriaDefineId = criteriaDefineId;
        }

        public UnitDefineTempBean getUnitDefineTemp() {
            return unitDefineTemp;
        }

        public void setUnitDefineTemp(UnitDefineTempBean unitDefineTemp) {
            this.unitDefineTemp = unitDefineTemp;
        }

        public int getProjectItemId() {
            return projectItemId;
        }

        public void setProjectItemId(int projectItemId) {
            this.projectItemId = projectItemId;
        }

        public String getProjectDefineIsPopup() {
            return projectDefineIsPopup;
        }

        public void setProjectDefineIsPopup(String projectDefineIsPopup) {
            this.projectDefineIsPopup = projectDefineIsPopup;
        }

        public String getProjectDefineIsIntrinsic() {
            return projectDefineIsIntrinsic;
        }

        public void setProjectDefineIsIntrinsic(String projectDefineIsIntrinsic) {
            this.projectDefineIsIntrinsic = projectDefineIsIntrinsic;
        }

        public int getProjectId() {
            return projectId;
        }

        public void setProjectId(int projectId) {
            this.projectId = projectId;
        }

        public int getUnitDefineId() {
            return unitDefineId;
        }

        public void setUnitDefineId(int unitDefineId) {
            this.unitDefineId = unitDefineId;
        }

        public int getTreeNodeOrder() {
            return treeNodeOrder;
        }

        public void setTreeNodeOrder(int treeNodeOrder) {
            this.treeNodeOrder = treeNodeOrder;
        }

        public int getTreeNodeId() {
            return treeNodeId;
        }

        public void setTreeNodeId(int treeNodeId) {
            this.treeNodeId = treeNodeId;
        }

        public int getProjectDefineId() {
            return projectDefineId;
        }

        public void setProjectDefineId(int projectDefineId) {
            this.projectDefineId = projectDefineId;
        }

        public String getProjectDefineWebType() {
            return projectDefineWebType;
        }

        public void setProjectDefineWebType(String projectDefineWebType) {
            this.projectDefineWebType = projectDefineWebType;
        }

        public ProjectDefineDateFormatTempBean getProjectDefineDateFormatTemp() {
            return projectDefineDateFormatTemp;
        }

        public void setProjectDefineDateFormatTemp(ProjectDefineDateFormatTempBean projectDefineDateFormatTemp) {
            this.projectDefineDateFormatTemp = projectDefineDateFormatTemp;
        }

        public String getProjectDefineSearchFlag() {
            return projectDefineSearchFlag;
        }

        public void setProjectDefineSearchFlag(String projectDefineSearchFlag) {
            this.projectDefineSearchFlag = projectDefineSearchFlag;
        }

        public int getTreeParentNodeId() {
            return treeParentNodeId;
        }

        public void setTreeParentNodeId(int treeParentNodeId) {
            this.treeParentNodeId = treeParentNodeId;
        }

        public int getAllowAddTimes() {
            return allowAddTimes;
        }

        public void setAllowAddTimes(int allowAddTimes) {
            this.allowAddTimes = allowAddTimes;
        }

        public List<?> getChildren() {
            return children;
        }

        public void setChildren(List<?> children) {
            this.children = children;
        }

        public List<ProjectDefineConstraintsBean> getProjectDefineConstraints() {
            return projectDefineConstraints;
        }

        public void setProjectDefineConstraints(List<ProjectDefineConstraintsBean> projectDefineConstraints) {
            this.projectDefineConstraints = projectDefineConstraints;
        }

        public static class UnitDefineTempBean {
            /**
             * createTime : null
             * status : null
             * unitDefineValue : null
             * unitDefineId : 23
             * modifyTime : null
             */

            private Object createTime;
            private Object status;
            private Object unitDefineValue;
            private int unitDefineId;
            private Object modifyTime;

            public static UnitDefineTempBean objectFromData(String str) {

                return new Gson().fromJson(str, UnitDefineTempBean.class);
            }

            public Object getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Object createTime) {
                this.createTime = createTime;
            }

            public Object getStatus() {
                return status;
            }

            public void setStatus(Object status) {
                this.status = status;
            }

            public Object getUnitDefineValue() {
                return unitDefineValue;
            }

            public void setUnitDefineValue(Object unitDefineValue) {
                this.unitDefineValue = unitDefineValue;
            }

            public int getUnitDefineId() {
                return unitDefineId;
            }

            public void setUnitDefineId(int unitDefineId) {
                this.unitDefineId = unitDefineId;
            }

            public Object getModifyTime() {
                return modifyTime;
            }

            public void setModifyTime(Object modifyTime) {
                this.modifyTime = modifyTime;
            }
        }

        public static class ProjectDefineDateFormatTempBean {
            /**
             * projectDefineDataFormatId : 2
             * projectDefineDataType : null
             * projectDefineDataFormatValue : null
             * projectDefineDataFormatComment : null
             */

            private int projectDefineDataFormatId;
            private Object projectDefineDataType;
            private Object projectDefineDataFormatValue;
            private Object projectDefineDataFormatComment;

            public static ProjectDefineDateFormatTempBean objectFromData(String str) {

                return new Gson().fromJson(str, ProjectDefineDateFormatTempBean.class);
            }

            public int getProjectDefineDataFormatId() {
                return projectDefineDataFormatId;
            }

            public void setProjectDefineDataFormatId(int projectDefineDataFormatId) {
                this.projectDefineDataFormatId = projectDefineDataFormatId;
            }

            public Object getProjectDefineDataType() {
                return projectDefineDataType;
            }

            public void setProjectDefineDataType(Object projectDefineDataType) {
                this.projectDefineDataType = projectDefineDataType;
            }

            public Object getProjectDefineDataFormatValue() {
                return projectDefineDataFormatValue;
            }

            public void setProjectDefineDataFormatValue(Object projectDefineDataFormatValue) {
                this.projectDefineDataFormatValue = projectDefineDataFormatValue;
            }

            public Object getProjectDefineDataFormatComment() {
                return projectDefineDataFormatComment;
            }

            public void setProjectDefineDataFormatComment(Object projectDefineDataFormatComment) {
                this.projectDefineDataFormatComment = projectDefineDataFormatComment;
            }
        }

        public static class ProjectDefineConstraintsBean {
            /**
             * projectDefineConstraintId : null
             * projectDefineConstraintComment : null
             * projectDefineConstraintValue : null
             * projectDefineConstraintItem : null
             * projectDefineConstraintType : null
             * projectDefineId : 20717
             */

            private Object projectDefineConstraintId;
            private Object projectDefineConstraintComment;
            private Object projectDefineConstraintValue;
            private Object projectDefineConstraintItem;
            private Object projectDefineConstraintType;
            private int projectDefineId;

            public static ProjectDefineConstraintsBean objectFromData(String str) {

                return new Gson().fromJson(str, ProjectDefineConstraintsBean.class);
            }

            public Object getProjectDefineConstraintId() {
                return projectDefineConstraintId;
            }

            public void setProjectDefineConstraintId(Object projectDefineConstraintId) {
                this.projectDefineConstraintId = projectDefineConstraintId;
            }

            public Object getProjectDefineConstraintComment() {
                return projectDefineConstraintComment;
            }

            public void setProjectDefineConstraintComment(Object projectDefineConstraintComment) {
                this.projectDefineConstraintComment = projectDefineConstraintComment;
            }

            public Object getProjectDefineConstraintValue() {
                return projectDefineConstraintValue;
            }

            public void setProjectDefineConstraintValue(Object projectDefineConstraintValue) {
                this.projectDefineConstraintValue = projectDefineConstraintValue;
            }

            public Object getProjectDefineConstraintItem() {
                return projectDefineConstraintItem;
            }

            public void setProjectDefineConstraintItem(Object projectDefineConstraintItem) {
                this.projectDefineConstraintItem = projectDefineConstraintItem;
            }

            public Object getProjectDefineConstraintType() {
                return projectDefineConstraintType;
            }

            public void setProjectDefineConstraintType(Object projectDefineConstraintType) {
                this.projectDefineConstraintType = projectDefineConstraintType;
            }

            public int getProjectDefineId() {
                return projectDefineId;
            }

            public void setProjectDefineId(int projectDefineId) {
                this.projectDefineId = projectDefineId;
            }
        }
    }

    public static class ProjectDefineDataFormatBean {
        /**
         * projectDefineDataFormatId : 2
         * projectDefineDataType : NUMBER
         * projectDefineDataFormatValue : 9999.99
         * projectDefineDataFormatComment : null
         */

        private int projectDefineDataFormatId;
        private String projectDefineDataType;
        private String projectDefineDataFormatValue;
        private Object projectDefineDataFormatComment;

        public static ProjectDefineDataFormatBean objectFromData(String str) {

            return new Gson().fromJson(str, ProjectDefineDataFormatBean.class);
        }

        public int getProjectDefineDataFormatId() {
            return projectDefineDataFormatId;
        }

        public void setProjectDefineDataFormatId(int projectDefineDataFormatId) {
            this.projectDefineDataFormatId = projectDefineDataFormatId;
        }

        public String getProjectDefineDataType() {
            return projectDefineDataType;
        }

        public void setProjectDefineDataType(String projectDefineDataType) {
            this.projectDefineDataType = projectDefineDataType;
        }

        public String getProjectDefineDataFormatValue() {
            return projectDefineDataFormatValue;
        }

        public void setProjectDefineDataFormatValue(String projectDefineDataFormatValue) {
            this.projectDefineDataFormatValue = projectDefineDataFormatValue;
        }

        public Object getProjectDefineDataFormatComment() {
            return projectDefineDataFormatComment;
        }

        public void setProjectDefineDataFormatComment(Object projectDefineDataFormatComment) {
            this.projectDefineDataFormatComment = projectDefineDataFormatComment;
        }
    }

    public static class UnitDefineBean {
        /**
         * createTime : 2017-05-06 10:53:47
         * status : ACTIVE
         * unitDefineValue : kg/m2
         * unitDefineId : 23
         * modifyTime : null
         */

        private String createTime;
        private String status;
        private String unitDefineValue;
        private int unitDefineId;
        private Object modifyTime;

        public static UnitDefineBean objectFromData(String str) {

            return new Gson().fromJson(str, UnitDefineBean.class);
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUnitDefineValue() {
            return unitDefineValue;
        }

        public void setUnitDefineValue(String unitDefineValue) {
            this.unitDefineValue = unitDefineValue;
        }

        public int getUnitDefineId() {
            return unitDefineId;
        }

        public void setUnitDefineId(int unitDefineId) {
            this.unitDefineId = unitDefineId;
        }

        public Object getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Object modifyTime) {
            this.modifyTime = modifyTime;
        }
    }
}
