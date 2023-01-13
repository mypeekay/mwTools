package com.peekay.mw_provider_demo.bean;

import androidx.annotation.Keep;

import java.io.Serializable;

@Keep
//精灵
public class MonsterBean implements Serializable {
    private Integer ID;
    private Boolean hasSound;
    private String DefName;
    private String Type;
    private Integer TypeID;
    private Double Weight;
    private Double Height;
    private String Foundin;
    private String Food;
    private String Features;
    private Integer mapID, HP, Atk, Def, SpAtk, SpDef, Spd;
    private Integer gender;//1雄，2雌，其他无性别
    private Integer characterAttrParam;//性格属性系数，0-6代表：攻速型、血攻型、血防型、双防型、特攻速型、特血攻型、血特防型
    private Integer freeForbidden;// 精灵是否可以放生，0表示可以放生，1表示不能放生，默认为0
    private Integer RealId;// 真实的精灵ID 该字段可选  当增加假精灵时需要配置原精灵的id 用来进行资源加载
    private Integer IsRareMon;//是否是稀有精灵
    private Integer IsDark;//是否是暗黑精灵
    private Integer isRidePet;//是否可以作为地面坐骑。还需配scale/nameY/speed三个字段。如果是飞行坐骑，改用isFlyPet
    private Integer isFlyPet;//是否可以作为飞行坐骑。还需配scale/nameY/speed三个字段。如果是地面坐骑，改用isRidePet
    private Integer VipBtlAdj;//是否具有vip战斗加成效果:0:没有,非0:有(1闪光，2暗黑);默认:0
    private Integer IsAbilityMon;//是否异能精灵.1:是        0:不是 默认为0
    private Integer VariationID;//是否能变异.非0可以，0不能 默认为0
    private Integer breedingmon;//1:融合精灵
    private Integer supermon;//1:超进化精灵
    private Boolean bg = false;

    public Integer getTypeID() {
        return TypeID;
    }

    public void setTypeID(Integer typeID) {
        TypeID = typeID;
    }

    public String getFoundin() {
        return Foundin;
    }

    public void setFoundin(String foundin) {
        Foundin = foundin;
    }

    public Integer getMapID() {
        return mapID;
    }

    public void setMapID(Integer mapID) {
        this.mapID = mapID;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getAtk() {
        return Atk;
    }

    public void setAtk(Integer atk) {
        Atk = atk;
    }

    public Integer getDef() {
        return Def;
    }

    public void setDef(Integer def) {
        Def = def;
    }

    public Integer getSpAtk() {
        return SpAtk;
    }

    public void setSpAtk(Integer spAtk) {
        SpAtk = spAtk;
    }

    public Integer getSpDef() {
        return SpDef;
    }

    public void setSpDef(Integer spDef) {
        SpDef = spDef;
    }

    public Integer getSpd() {
        return Spd;
    }

    public void setSpd(Integer spd) {
        Spd = spd;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public Boolean getBg() {
        return bg;
    }

    public void setBg(Boolean bg) {
        this.bg = bg;
    }

    public String getIDandName() {
        return ID + "/" + DefName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDefName() {
        return DefName;
    }

    public void setDefName(String defName) {
        DefName = defName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        Features = features;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public MonsterBean() {
    }

    public MonsterBean(Integer ID, String defName, String type, Double weight, Double Height, String food, String features, Boolean hasSound) {
        this.ID = ID;
        DefName = defName;
        Type = type;
        Weight = weight;
        this.Height = Height;
        Food = food;
        Features = features;
        this.hasSound = hasSound;
    }

    public MonsterBean(Integer ID, String defName, Integer HP, Integer atk, Integer def, Integer spAtk, Integer spDef, Integer spd) {
        this.ID = ID;
        DefName = defName;
        Atk = atk;
        Def = def;
        SpAtk = spAtk;
        SpDef = spDef;
        Spd = spd;
        this.HP = HP;
    }

    public MonsterBean(Integer ID, Boolean hasSound, String defName, String type, Integer typeID, Double weight,
                       Double height, String foundin, String food, String features, Integer mapID, Integer HP,
                       Integer atk, Integer def, Integer spAtk, Integer spDef, Integer spd, Integer gender,
                       Integer characterAttrParam, Integer freeForbidden, Boolean bg) {
        this.ID = ID;
        this.hasSound = hasSound;
        DefName = defName;
        Type = type;
        TypeID = typeID;
        Weight = weight;
        Height = height;
        Foundin = foundin;
        Food = food;
        Features = features;
        this.mapID = mapID;
        this.HP = HP;
        Atk = atk;
        Def = def;
        SpAtk = spAtk;
        SpDef = spDef;
        Spd = spd;
        this.gender = gender;
        this.characterAttrParam = characterAttrParam;
        this.freeForbidden = freeForbidden;
        this.bg = bg;
    }

    public MonsterBean(Integer ID, Boolean hasSound, String defName, String type, Integer typeID, Double weight, Double height,
                       String foundin, String food, String features, Integer mapID, Integer HP, Integer atk, Integer def, Integer spAtk,
                       Integer spDef, Integer spd, Integer gender, Integer characterAttrParam, Integer freeForbidden, Integer realId,
                       Integer isRareMon, Integer isDark, Integer isRidePet, Integer isFlyPet, Integer vipBtlAdj, Integer isAbilityMon,
                       Integer variationID, Integer breedingmon, Integer supermon, Boolean bg) {
        this.ID = ID;
        this.hasSound = hasSound;
        DefName = defName;
        Type = type;
        TypeID = typeID;
        Weight = weight;
        Height = height;
        Foundin = foundin;
        Food = food;
        Features = features;
        this.mapID = mapID;
        this.HP = HP;
        Atk = atk;
        Def = def;
        SpAtk = spAtk;
        SpDef = spDef;
        Spd = spd;
        this.gender = gender;
        this.characterAttrParam = characterAttrParam;
        this.freeForbidden = freeForbidden;
        RealId = realId;
        IsRareMon = isRareMon;
        IsDark = isDark;
        this.isRidePet = isRidePet;
        this.isFlyPet = isFlyPet;
        VipBtlAdj = vipBtlAdj;
        IsAbilityMon = isAbilityMon;
        VariationID = variationID;
        this.breedingmon = breedingmon;
        this.supermon = supermon;
        this.bg = bg;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCharacterAttrParam() {
        return characterAttrParam;
    }

    public void setCharacterAttrParam(Integer characterAttrParam) {
        this.characterAttrParam = characterAttrParam;
    }

    public Integer getFreeForbidden() {
        return freeForbidden;
    }

    public void setFreeForbidden(Integer freeForbidden) {
        this.freeForbidden = freeForbidden;
    }

    public Integer getRealId() {
        return RealId;
    }

    public void setRealId(Integer realId) {
        RealId = realId;
    }

    public Integer getIsRareMon() {
        return IsRareMon;
    }

    public void setIsRareMon(Integer isRareMon) {
        IsRareMon = isRareMon;
    }

    public Integer getIsDark() {
        return IsDark;
    }

    public void setIsDark(Integer isDark) {
        IsDark = isDark;
    }

    public Integer getIsRidePet() {
        return isRidePet;
    }

    public void setIsRidePet(Integer isRidePet) {
        this.isRidePet = isRidePet;
    }

    public Integer getIsFlyPet() {
        return isFlyPet;
    }

    public void setIsFlyPet(Integer isFlyPet) {
        this.isFlyPet = isFlyPet;
    }

    public Integer getVipBtlAdj() {
        return VipBtlAdj;
    }

    public void setVipBtlAdj(Integer vipBtlAdj) {
        VipBtlAdj = vipBtlAdj;
    }

    public Integer getIsAbilityMon() {
        return IsAbilityMon;
    }

    public void setIsAbilityMon(Integer isAbilityMon) {
        IsAbilityMon = isAbilityMon;
    }

    public Integer getVariationID() {
        return VariationID;
    }

    public void setVariationID(Integer variationID) {
        VariationID = variationID;
    }

    public Integer getBreedingmon() {
        return breedingmon;
    }

    public void setBreedingmon(Integer breedingmon) {
        this.breedingmon = breedingmon;
    }

    public Integer getSupermon() {
        return supermon;
    }

    public void setSupermon(Integer supermon) {
        this.supermon = supermon;
    }

    /**
     * 获取种族值总和
     */
    public int getAllValue() {
        return Atk + SpAtk + Def + SpDef + Spd + HP;
    }

    /**
     * 获取性别
     *
     * @return
     */
    public String getSex() {
        switch (gender) {
            case 1:
                return "雄性";
            case 2:
                return "雌性";
            default:
                return "无性别";
        }
    }

    @Override
    public String toString() {
        return "MonsterBean{" +
                "ID=" + ID +
                ", hasSound=" + hasSound +
                ", DefName='" + DefName + '\'' +
                ", Type='" + Type + '\'' +
                ", TypeID=" + TypeID +
                ", Weight=" + Weight +
                ", Height=" + Height +
                ", Foundin='" + Foundin + '\'' +
                ", Food='" + Food + '\'' +
                ", Features='" + Features + '\'' +
                ", mapID=" + mapID +
                ", HP=" + HP +
                ", Atk=" + Atk +
                ", Def=" + Def +
                ", SpAtk=" + SpAtk +
                ", SpDef=" + SpDef +
                ", Spd=" + Spd +
                ", gender=" + gender +
                ", characterAttrParam=" + characterAttrParam +
                ", freeForbidden=" + freeForbidden +
                ", RealId=" + RealId +
                ", IsRareMon=" + IsRareMon +
                ", IsDark=" + IsDark +
                ", isRidePet=" + isRidePet +
                ", isFlyPet=" + isFlyPet +
                ", VipBtlAdj=" + VipBtlAdj +
                ", IsAbilityMon=" + IsAbilityMon +
                ", VariationID=" + VariationID +
                ", breedingmon=" + breedingmon +
                ", supermon=" + supermon +
                ", bg=" + bg +
                '}';
    }
}
