package com.peekay.mw_provider_demo.bean;

import androidx.annotation.Keep;

import java.io.Serializable;

@Keep
//技能详情
public class MovesInfo implements Serializable {
    private int ID;
    private String Name;//技能名称
    private int Category;//类型,1物攻2特攻4属性
    private int Type;//属性
    private int Power;//威力
    private int MaxPP;//PP
    private int Accuracy;//命中率
    private String SideEffect;//效果ID
    private String SideEffectArg;//效果参数
    private String Url;//估计是属性图片
    private int CD;
    private int CritRate;//暴击率
    private int Priority;//先制
    private Boolean MustHit;//必中
    private int AtkType;//攻击类型,3为属性，0物理1特殊，2物理和特殊,好像有错误不是代表这个
    private String info;//技能描述，对战的时候，比如【XXX】使用了[XXX技能]，对方开始有异常了
    private int LearnLV = -1;//学习等级
    private int tag = 0;
    private int rec = 0;
    private int CritAtkFirst = 0;//先出手时必定暴击
    private int CritAtkSecond = 0;//后出手时必定暴击
    private int DmgBindHpDv = 0;//造成的伤害等于自身剩余体力÷2+个体值
    private int DmgBindLv = 0;//使对方受到的伤害值等于等级
    private int PwrBindDv = 0;//本能一击、异界幻象是个体×5，剧蚀之触是个体×5×等级÷100(威力取决于最大体力÷3+个体值）
    private int PwrDouble = 0;//攻击时，若对方处于异常状态，则威力翻倍
    private int CritSelfHalfHp = 0;//自身体力低于一半时必定暴击
    private int CritFoeHalfHp = 0;//对方体力低于一半时必定暴击;
    private String info_temp = "";

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getLearnLV() {
        return LearnLV;
    }

    public void setLearnLV(int learnLV) {
        LearnLV = learnLV;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getMaxPP() {
        return MaxPP;
    }

    public void setMaxPP(int maxPP) {
        MaxPP = maxPP;
    }

    public int getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(int accuracy) {
        Accuracy = accuracy;
    }

    public String getSideEffect() {
        return SideEffect;
    }

    public void setSideEffect(String sideEffect) {
        SideEffect = sideEffect;
    }

    public String getSideEffectArg() {
        return SideEffectArg;
    }

    public void setSideEffectArg(String sideEffectArg) {
        SideEffectArg = sideEffectArg;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getCD() {
        return CD;
    }

    public int getCritAtkFirst() {
        return CritAtkFirst;
    }

    public void setCritAtkFirst(int critAtkFirst) {
        CritAtkFirst = critAtkFirst;
    }

    public int getCritAtkSecond() {
        return CritAtkSecond;
    }

    public void setCritAtkSecond(int critAtkSecond) {
        CritAtkSecond = critAtkSecond;
    }

    public int getDmgBindHpDv() {
        return DmgBindHpDv;
    }

    public void setDmgBindHpDv(int dmgBindHpDv) {
        DmgBindHpDv = dmgBindHpDv;
    }

    public int getDmgBindLv() {
        return DmgBindLv;
    }

    public void setDmgBindLv(int dmgBindLv) {
        DmgBindLv = dmgBindLv;
    }

    public int getPwrBindDv() {
        return PwrBindDv;
    }

    public void setPwrBindDv(int pwrBindDv) {
        PwrBindDv = pwrBindDv;
    }

    public int getPwrDouble() {
        return PwrDouble;
    }

    public void setPwrDouble(int pwrDouble) {
        PwrDouble = pwrDouble;
    }

    public int getCritSelfHalfHp() {
        return CritSelfHalfHp;
    }

    public void setCritSelfHalfHp(int critSelfHalfHp) {
        CritSelfHalfHp = critSelfHalfHp;
    }

    public int getCritFoeHalfHp() {
        return CritFoeHalfHp;
    }

    public void setCritFoeHalfHp(int critFoeHalfHp) {
        CritFoeHalfHp = critFoeHalfHp;
    }

    //获取攻击类型
    public String getTypeAttack() {
        String s = "";
        switch (Category) {
            case 1:
                s = "物理攻击";
                break;
            case 2:
                s = "特殊攻击";
                break;
            case 4:
                s = "属性技能";
                break;
        }
        return s;
    }

    public void setCD(int CD) {
        this.CD = CD;
    }

    public int getCritRate() {
        return CritRate;
    }

    public void setCritRate(int critRate) {
        CritRate = critRate;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public Boolean getMustHit() {
        return MustHit;
    }

    public void setMustHit(Boolean mustHit) {
        MustHit = mustHit;
    }

    public int getAtkType() {
        return AtkType;
    }

    public void setAtkType(int atkType) {
        AtkType = atkType;
    }

    public String getInfo() {
        return info;
    }

    public String getInfoNoEmpty() {
        return info.isEmpty() ? "暂无描述" : info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public MovesInfo(int ID, String name, int category, int type, int power, int maxPP, int accuracy,
                     String sideEffect, String sideEffectArg, String url, int CD, int critRate, int priority, Boolean mustHit, int atkType, String info) {
        this.ID = ID;
        this.Name = name;
        this.Category = category;
        this.Type = type;
        this.Power = power;
        this.MaxPP = maxPP;
        this.Accuracy = accuracy;
        this.SideEffect = sideEffect;
        this.SideEffectArg = sideEffectArg;
        this.Url = url;
        this.CD = CD;
        this.CritRate = critRate;
        this.Priority = priority;
        this.MustHit = mustHit;
        this.AtkType = atkType;
        this.info = info;
    }

    public MovesInfo(int ID, String name, int category, int type, int power, int maxPP, int accuracy,
                     String sideEffect, String sideEffectArg, String url, int CD, int critRate, int priority,
                     Boolean mustHit, int atkType, String info, int critAtkFirst,
                     int critAtkSecond, int dmgBindHpDv, int dmgBindLv, int pwrBindDv, int pwrDouble,
                     int CritSelfHalfHp, int CritFoeHalfHp) {
        this.ID = ID;
        Name = name;
        Category = category;
        Type = type;
        Power = power;
        MaxPP = maxPP;
        Accuracy = accuracy;
        SideEffect = sideEffect;
        SideEffectArg = sideEffectArg;
        Url = url;
        this.CD = CD;
        CritRate = critRate;
        Priority = priority;
        MustHit = mustHit;
        AtkType = atkType;
        this.info = info;
        CritAtkFirst = critAtkFirst;
        CritAtkSecond = critAtkSecond;
        DmgBindHpDv = dmgBindHpDv;
        DmgBindLv = dmgBindLv;
        PwrBindDv = pwrBindDv;
        PwrDouble = pwrDouble;
        this.CritSelfHalfHp = CritSelfHalfHp;
        this.CritFoeHalfHp = CritFoeHalfHp;
    }

    //diy精灵技能添加tag标签,rec推荐=1
    public MovesInfo(int ID, String name, int category, int type, int power, int maxPP, int accuracy, String sideEffect, String sideEffectArg,
                     String url, int CD, int critRate, int priority, Boolean mustHit, int atkType, String info, int tag, int rec) {
        this.ID = ID;
        this.Name = name;
        this.Category = category;
        this.Type = type;
        this.Power = power;
        this.MaxPP = maxPP;
        this.Accuracy = accuracy;
        this.SideEffect = sideEffect;
        this.SideEffectArg = sideEffectArg;
        this.Url = url;
        this.CD = CD;
        this.CritRate = critRate;
        this.Priority = priority;
        this.MustHit = mustHit;
        this.AtkType = atkType;
        this.info = info;
        this.tag = tag;
        this.rec = rec;
    }

    public int getRec() {
        return rec;
    }

    public void setRec(int rec) {
        this.rec = rec;
    }

    /**
     * 是否有隐藏效果
     *
     * @return
     */
    public boolean isHadHideEffect() {
        return CritAtkFirst == 1 || CritAtkSecond == 1 || DmgBindHpDv == 1 || DmgBindLv == 1 || PwrBindDv == 1 || PwrDouble == 1;
    }

    /**
     * 获取隐藏效果名称
     *
     * @return
     */
    public String getHideEffectName() {
        if (CritAtkFirst == 1) return "CritAtkFirst";
        if (CritAtkSecond == 1) return "CritAtkSecond";
        if (DmgBindHpDv == 1) return "DmgBindHpDv";
        if (DmgBindLv == 1) return "DmgBindLv";
        if (PwrBindDv == 1) return "PwrBindDv";
        if (PwrDouble == 1) return "PwrDouble";
        if (CritSelfHalfHp == 1) return "CritSelfHalfHp";
        if (CritFoeHalfHp == 1) return "CritFoeHalfHp";
        return "未知的效果";
    }

    public String getInfo_temp() {
        return info_temp;
    }

    public void setInfo_temp(String info_temp) {
        this.info_temp = info_temp;
    }

    /**
     * 获取隐藏效果描述
     *
     * @return
     */
    public String getHideEffectDes(String hide_name) {
        switch (hide_name) {
            case "CritAtkFirst":
                return "先出手时必定暴击";
            case "CritAtkSecond":
                return "后出手时必定暴击";
            case "DmgBindHpDv":
                return "造成的伤害等于自身剩余体力÷2+个体值";
            case "DmgBindLv":
                return "使对方受到的伤害值等于等级";
            case "PwrBindDv":
                return "本能一击、异界幻象是个体×5，剧蚀之触是个体×5×等级÷100(威力取决于最大体力÷3+个体值）";
            case "PwrDouble":
                return "攻击时，若对方处于异常状态，则威力翻倍";
            case "CritSelfHalfHp":
                return "自身体力低于一半时必定暴击";
            case "CritFoeHalfHp":
                return "对方体力低于一半时必定暴击";
        }
        return "null";
    }

    @Override
    public String toString() {
        return "MovesInfo{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Category=" + Category +
                ", Type=" + Type +
                ", Power=" + Power +
                ", MaxPP=" + MaxPP +
                ", Accuracy=" + Accuracy +
                ", SideEffect='" + SideEffect + '\'' +
                ", SideEffectArg='" + SideEffectArg + '\'' +
                ", Url='" + Url + '\'' +
                ", CD=" + CD +
                ", CritRate=" + CritRate +
                ", Priority=" + Priority +
                ", MustHit=" + MustHit +
                ", AtkType=" + AtkType +
                ", info='" + info + '\'' +
                ", LearnLV=" + LearnLV +
                ", tag=" + tag +
                ", rec=" + rec +
                ", CritAtkFirst=" + CritAtkFirst +
                ", CritAtkSecond=" + CritAtkSecond +
                ", DmgBindHpDv=" + DmgBindHpDv +
                ", DmgBindLv=" + DmgBindLv +
                ", PwrBindDv=" + PwrBindDv +
                ", PwrDouble=" + PwrDouble +
                ", CritSelfHalfHp=" + CritSelfHalfHp +
                ", CritFoeHalfHp=" + CritFoeHalfHp +
                ", info_temp='" + info_temp + '\'' +
                '}';
    }
}
