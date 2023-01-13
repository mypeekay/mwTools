package com.peekay.mw_provider_demo.bean;

import androidx.annotation.Keep;

@Keep
//刻印
public class MintMark {
    private int ID;
    private int Type;
    private int Quality;
    private int Effect;
    private String Arg;
    private int Level;
    private int Max;
    private int MonsterID;
    private int MintmarkLevel;
    private int Grade;
    private int BaseHoleNum;
    private String BaseAttriValue;
    private String MaxAttriValue;
    private String ExtraAttriValue;
    private String Des;
    private String EffectDes;
    private int MintmarkClass;//刻印系列
    private int moveId;//有move id就表示是技能刻印

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public MintMark(int ID, int type, int quality, int effect, String arg, int level,
                    int max, int monsterID, int mintmarkLevel, int grade, int baseHoleNum,
                    String baseAttriValue, String maxAttriValue, String extraAttriValue,
                    String des, String effectDes, int mintmarkClass, int moveId) {
        this.ID = ID;
        Type = type;
        Quality = quality;
        Effect = effect;
        Arg = arg;
        Level = level;
        Max = max;
        MonsterID = monsterID;
        MintmarkLevel = mintmarkLevel;
        Grade = grade;
        BaseHoleNum = baseHoleNum;
        BaseAttriValue = baseAttriValue;
        MaxAttriValue = maxAttriValue;
        ExtraAttriValue = extraAttriValue;
        Des = des;
        EffectDes = effectDes;
        MintmarkClass = mintmarkClass;
        this.moveId = moveId;
    }

    public int getMintmarkClass() {
        return MintmarkClass;
    }

    public void setMintmarkClass(int mintmarkClass) {
        MintmarkClass = mintmarkClass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public int getEffect() {
        return Effect;
    }

    public void setEffect(int effect) {
        Effect = effect;
    }

    public String getArg() {
        return Arg;
    }

    public void setArg(String arg) {
        Arg = arg;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getMonsterID() {
        return MonsterID;
    }

    public void setMonsterID(int monsterID) {
        MonsterID = monsterID;
    }

    public int getMintmarkLevel() {
        return MintmarkLevel;
    }

    public void setMintmarkLevel(int mintmarkLevel) {
        MintmarkLevel = mintmarkLevel;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getBaseHoleNum() {
        return BaseHoleNum;
    }

    public void setBaseHoleNum(int baseHoleNum) {
        BaseHoleNum = baseHoleNum;
    }

    public String getBaseAttriValue() {
        return BaseAttriValue;
    }

    public void setBaseAttriValue(String baseAttriValue) {
        BaseAttriValue = baseAttriValue;
    }

    public String getMaxAttriValue() {
        return MaxAttriValue;
    }

    public void setMaxAttriValue(String maxAttriValue) {
        MaxAttriValue = maxAttriValue;
    }

    public String getExtraAttriValue() {
        return ExtraAttriValue;
    }

    public void setExtraAttriValue(String extraAttriValue) {
        ExtraAttriValue = extraAttriValue;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public String getEffectDes() {
        return EffectDes;
    }

    public void setEffectDes(String effectDes) {
        EffectDes = effectDes;
    }

    public MintMark(int ID, int type, int quality, int effect, String arg, int level, int max, int monsterID, int mintmarkLevel,
                    int grade, int baseHoleNum, String baseAttriValue, String maxAttriValue, String extraAttriValue,
                    String des, String effectDes, int mintmarkClass) {
        this.ID = ID;
        Type = type;
        Quality = quality;
        Effect = effect;
        Arg = arg;
        Level = level;
        Max = max;
        MonsterID = monsterID;
        MintmarkLevel = mintmarkLevel;
        Grade = grade;
        BaseHoleNum = baseHoleNum;
        BaseAttriValue = baseAttriValue;
        MaxAttriValue = maxAttriValue;
        ExtraAttriValue = extraAttriValue;
        Des = des;
        EffectDes = effectDes;
        MintmarkClass = mintmarkClass;
        moveId = 0;
    }

    /**
     * 获取刻印数值
     *
     * @return
     */
    public int getMintmarkNum() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length == 0) return 0;
        return Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3])
                + Integer.parseInt(s[4]) + Integer.parseInt(s[5]);
    }

    /**
     * 获取刻印数值（包含隐藏数值）
     *
     * @return
     */
    public int getMintmarkNumAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3])
                    + Integer.parseInt(s[4]) + Integer.parseInt(s[5]);
        }
        return Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3])
                + Integer.parseInt(s[4]) + Integer.parseInt(s[5]) + Integer.parseInt(s1[0]) + Integer.parseInt(s1[1])
                + Integer.parseInt(s1[2]) + Integer.parseInt(s1[3])
                + Integer.parseInt(s1[4]) + Integer.parseInt(s1[5]);
    }

    /**
     * 获取刻印攻击
     *
     * @return
     */
    public int getMintmarkAtk() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[0]);
    }

    /**
     * 获取刻印攻击(包括隐藏)
     *
     * @return
     */
    public int getMintmarkAtkAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[0]);
        }
        return Integer.parseInt(s[0]) + Integer.parseInt(s1[0]);
    }

    /**
     * 获取刻印特攻
     *
     * @return
     */
    public int getMintmarkSAtk() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[2]);
    }

    /**
     * 获取刻印特攻(包括隐藏)
     *
     * @return
     */
    public int getMintmarkSAtkAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[2]);
        }
        return Integer.parseInt(s[2]) + Integer.parseInt(s1[2]);
    }

    /**
     * 获取刻印防御
     *
     * @return
     */
    public int getMintmarkDef() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[1]);
    }

    /**
     * 获取刻印防御(包括隐藏)
     *
     * @return
     */
    public int getMintmarkDefAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[1]);
        }
        return Integer.parseInt(s[1]) + Integer.parseInt(s1[1]);
    }

    /**
     * 获取刻印特防
     *
     * @return
     */
    public int getMintmarkSDef() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[3]);
    }

    /**
     * 获取刻印特防(包括隐藏)
     *
     * @return
     */
    public int getMintmarkSDefAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[3]);
        }
        return Integer.parseInt(s[3]) + Integer.parseInt(s1[3]);
    }

    /**
     * 获取刻印速度
     *
     * @return
     */
    public int getMintmarkSpd() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[4]);
    }

    /**
     * 获取刻印速度(包括隐藏)
     *
     * @return
     */
    public int getMintmarkSpdAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[4]);
        }
        return Integer.parseInt(s[4]) + Integer.parseInt(s1[4]);
    }

    /**
     * 获取刻印体力
     *
     * @return
     */
    public int getMintmarkHp() {
        String[] s = MaxAttriValue.split(" ");
        if (s.length != 6) return 0;
        return Integer.parseInt(s[5]);
    }

    /**
     * 获取刻印体力(包括隐藏)
     *
     * @return
     */
    public int getMintmarkHpAndHidden() {
        String[] s = MaxAttriValue.split(" ");
        String[] s1 = ExtraAttriValue.split(" ");
        if (s.length != 6) return 0;
        if (s1.length != 6) {
            return Integer.parseInt(s[5]);
        }
        return Integer.parseInt(s[5]) + Integer.parseInt(s1[5]);
    }

    /**
     * 获取隐藏数值
     *
     * @return
     */
    public int getExtraNum() {
        String[] s1 = ExtraAttriValue.split(" ");
        if (s1.length != 6) {
            return Integer.parseInt(s1[0]) + Integer.parseInt(s1[1])
                    + Integer.parseInt(s1[2]) + Integer.parseInt(s1[3])
                    + Integer.parseInt(s1[4]) + Integer.parseInt(s1[5]);
        }
        return 0;
    }

    public String getMintmarkClassName() {
        switch (MintmarkClass) {
            case 1:
                return "睿智系列";
            case 2:
                return "辉耀之印系列";
            case 3:
                return "星系列";
            case 4:
                return "神耀系列";
            case 5:
                return "特级全能系列";
            case 6:
                return "探险家&典狱长系列";
            case 7:
                return "月系列";
            case 8:
                return "阳系列";
            case 9:
                return "雷神崛起";
            case 10:
                return "庆系列";
            case 11:
                return "强化庆系列";
            case 12:
                return "精灵王系列";
            case 13:
                return "五帝系列";
            case 14:
                return "征战系列";
            case 15:
                return "王·战联、大暗黑天系列";
            case 16:
                return "谱尼圣能系列";
            case 17:
                return "泰坦系列";
            case 18:
                return "神兽大战索伦森系列";
            case 19:
                return "年费相关系列";
            case 20:
                return "八部太玄系列";
            case 21:
                return "衡山路系列";
            case 22:
                return "圣灵系列";
            case 23:
                return "混沌系列";
            case 24:
                return "偃月系列";
            case 25:
                return "V8系列";
            case 26:
                return "军团之令系列";
            case 27:
                return "炫彩系列";
            case 28:
                return "星系守护系列";
            case 29:
                return "星球系列";
            case 30:
                return "清系列（清明节等春日主题）";
            case 31:
                return "星系战争印记系列";
            case 32:
                return "童心系列（61节主题刻印）";
            case 33:
                return "九周年系列";
            case 34:
                return "巅峰圣战系列";
            case 35:
                return "功勋、图鉴等系统系列";
            case 36:
                return "最终决战系列";
            case 37:
                return "秩序之战系列";
            case 38:
                return "暗黑战联系列";
            case 39:
                return "十周年系列";
            case 40:
                return "天蛇系列";
            case 41:
                return "魔界系列";
            case 42:
                return "界神系列";
            case 43:
                return "凶兽系列";
            case 44:
                return "夏系列（仲夏节等夏日主题）";
            case 45:
                return "时系列";
            case 46:
                return "永恒记忆系列";
            case 47:
                return "命世系列";
            case 48:
                return "寒系列（冰雪节等冬日主题）";
            case 49:
                return "四九系列";
            case 50:
                return "青系列（踏青节等春日主题）";
            case 51:
                return "龙族英魂系列";
            case 52:
                return "元宵系列（元宵节主题）";
            case 53:
                return "异空系列";
            case 54:
                return "星愿系列（11周年主题）";
            case 55:
                return "露姆仙境系列";
            case 56:
                return "晓月系列（约瑟联动）";
            case 57:
                return "神牛系列（21年春节主题）";
            case 58:
                return "浮云系列";
            case 59:
                return "飓风系列（21年国庆节主题）";
            case 60:
                return "焰火系列（22年春节主题）";
            case 61:
                return "英雄之证系列（单独个体精灵冠名）";
            case 62:
                return "大暗黑天系列";
            case 63:
                return "新春系列";
            case 64:
                return "莱达神谕系列";
            case 65:
                return "精灵王誓约";
            case 66:
                return "星璨/灵籁系列";
            case 67:
                return "K13系列";
            case 68:
                return "月光月影系列";
            case 69:
                return "珍宝系列";
            case 70:
                return "淘乐节系列";
            default:
                if (MonsterID != 0) return "专属";
                return "无系列或新系列数据未更新";
        }
    }

    @Override
    public String toString() {
        return "MintMark{" +
                "ID=" + ID +
                ", Type=" + Type +
                ", Quality=" + Quality +
                ", Effect=" + Effect +
                ", Arg='" + Arg + '\'' +
                ", Level=" + Level +
                ", Max=" + Max +
                ", MonsterID=" + MonsterID +
                ", MintmarkLevel=" + MintmarkLevel +
                ", Grade=" + Grade +
                ", BaseHoleNum=" + BaseHoleNum +
                ", BaseAttriValue='" + BaseAttriValue + '\'' +
                ", MaxAttriValue='" + MaxAttriValue + '\'' +
                ", ExtraAttriValue='" + ExtraAttriValue + '\'' +
                ", Des='" + Des + '\'' +
                ", EffectDes='" + EffectDes + '\'' +
                ", MintmarkClass=" + MintmarkClass +
                ", moveId=" + moveId +
                '}';
    }
}
