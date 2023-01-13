package com.peekay.mw_tools;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

import com.peekay.mw_tools.entity.MintMark;
import com.peekay.mw_tools.entity.MonsterBean;
import com.peekay.mw_tools.entity.MovesInfo;

import java.util.ArrayList;
import java.util.List;

public class MwTools {
    /**
     * 查询精灵
     *
     * @param selection where语句
     * @param param     where参数
     */
    public MonsterBean queryMonster(String selection, String[] param) {
        Uri uri = Uri.parse("content://com.peekay.mw_manual.provider/monster");
        ContentResolver resolve = getContentResolver();
        Cursor cursor = resolve.query(uri, null, selection, param, null);
        MonsterBean monsterBean = null;
        while (cursor != null && cursor.moveToNext()) {
            monsterBean = new MonsterBean(
                    cursor.getInt(cursor.getColumnIndex("ID")),
                    cursor.getInt(cursor.getColumnIndex("hasSound")) == 1,
                    cursor.getString(cursor.getColumnIndex("DefName")),
                    cursor.getString(cursor.getColumnIndex("Type")),
                    cursor.getInt(cursor.getColumnIndex("TypeID")),
                    cursor.getDouble(cursor.getColumnIndex("Weight")),
                    cursor.getDouble(cursor.getColumnIndex("Height")),
                    cursor.getString(cursor.getColumnIndex("Foundin")),
                    cursor.getString(cursor.getColumnIndex("Food")),
                    cursor.getString(cursor.getColumnIndex("Features")),
                    cursor.getInt(cursor.getColumnIndex("mapID")),
                    cursor.getInt(cursor.getColumnIndex("HP")),
                    cursor.getInt(cursor.getColumnIndex("Atk")),
                    cursor.getInt(cursor.getColumnIndex("Def")),
                    cursor.getInt(cursor.getColumnIndex("SpAtk")),
                    cursor.getInt(cursor.getColumnIndex("SpDef")),
                    cursor.getInt(cursor.getColumnIndex("Spd")),
                    cursor.getInt(cursor.getColumnIndex("Gender")),
                    cursor.getInt(cursor.getColumnIndex("CharacterAttrParam")),
                    cursor.getInt(cursor.getColumnIndex("FreeForbidden")),
                    cursor.getInt(cursor.getColumnIndex("RealId")),
                    cursor.getInt(cursor.getColumnIndex("IsRareMon")),
                    cursor.getInt(cursor.getColumnIndex("IsDark")),
                    cursor.getInt(cursor.getColumnIndex("isRidePet")),
                    cursor.getInt(cursor.getColumnIndex("isFlyPet")),
                    cursor.getInt(cursor.getColumnIndex("VipBtlAdj")),
                    cursor.getInt(cursor.getColumnIndex("IsAbilityMon")),
                    cursor.getInt(cursor.getColumnIndex("VariationID")),
                    cursor.getInt(cursor.getColumnIndex("breedingmon")),
                    cursor.getInt(cursor.getColumnIndex("supermon")),
                    false);
        }
        if (cursor != null) cursor.close();
        return monsterBean;
    }

    /**
     * 查询多个精灵
     *
     * @param selection where语句
     * @param param     where参数
     */
    public List<MonsterBean> queryMonsters(String selection, String[] param) {
        Uri uri = Uri.parse("content://com.peekay.mw_manual.provider/monster");
        ContentResolver resolve = getContentResolver();
        Cursor cursor = resolve.query(uri, null, selection, param, null);
        List<MonsterBean> monsterBean = new ArrayList<>();
        while (cursor != null && cursor.moveToNext()) {
            monsterBean.add(new MonsterBean(
                    cursor.getInt(cursor.getColumnIndex("ID")),
                    cursor.getInt(cursor.getColumnIndex("hasSound")) == 1,
                    cursor.getString(cursor.getColumnIndex("DefName")),
                    cursor.getString(cursor.getColumnIndex("Type")),
                    cursor.getInt(cursor.getColumnIndex("TypeID")),
                    cursor.getDouble(cursor.getColumnIndex("Weight")),
                    cursor.getDouble(cursor.getColumnIndex("Height")),
                    cursor.getString(cursor.getColumnIndex("Foundin")),
                    cursor.getString(cursor.getColumnIndex("Food")),
                    cursor.getString(cursor.getColumnIndex("Features")),
                    cursor.getInt(cursor.getColumnIndex("mapID")),
                    cursor.getInt(cursor.getColumnIndex("HP")),
                    cursor.getInt(cursor.getColumnIndex("Atk")),
                    cursor.getInt(cursor.getColumnIndex("Def")),
                    cursor.getInt(cursor.getColumnIndex("SpAtk")),
                    cursor.getInt(cursor.getColumnIndex("SpDef")),
                    cursor.getInt(cursor.getColumnIndex("Spd")),
                    cursor.getInt(cursor.getColumnIndex("Gender")),
                    cursor.getInt(cursor.getColumnIndex("CharacterAttrParam")),
                    cursor.getInt(cursor.getColumnIndex("FreeForbidden")),
                    cursor.getInt(cursor.getColumnIndex("RealId")),
                    cursor.getInt(cursor.getColumnIndex("IsRareMon")),
                    cursor.getInt(cursor.getColumnIndex("IsDark")),
                    cursor.getInt(cursor.getColumnIndex("isRidePet")),
                    cursor.getInt(cursor.getColumnIndex("isFlyPet")),
                    cursor.getInt(cursor.getColumnIndex("VipBtlAdj")),
                    cursor.getInt(cursor.getColumnIndex("IsAbilityMon")),
                    cursor.getInt(cursor.getColumnIndex("VariationID")),
                    cursor.getInt(cursor.getColumnIndex("breedingmon")),
                    cursor.getInt(cursor.getColumnIndex("supermon")),
                    false));
        }
        if (cursor != null) cursor.close();
        return monsterBean;
    }

    /**
     * 查询刻印
     *
     * @param selection
     * @param param
     * @return
     */
    public List<MintMark> queryMintmarks(String selection, String[] param) {
        Uri uri = Uri.parse("content://com.peekay.mw_manual.provider/mintmark");
        ContentResolver resolve = getContentResolver();
        Cursor cursor = resolve.query(uri, null, selection, param, null);
        List<MintMark> mintMarks = new ArrayList<>();
        while (cursor != null && cursor.moveToNext()) {
            mintMarks.add(new MintMark(
                    cursor.getInt(cursor.getColumnIndex("ID")),
                    cursor.getInt(cursor.getColumnIndex("TYPE")),
                    cursor.getInt(cursor.getColumnIndex("QUALITY")),
                    cursor.getInt(cursor.getColumnIndex("EFFECT")),
                    cursor.getString(cursor.getColumnIndex("ARG")),
                    cursor.getInt(cursor.getColumnIndex("LEVEL")),
                    cursor.getInt(cursor.getColumnIndex("MAX")),
                    cursor.getInt(cursor.getColumnIndex("MONSTERID")),
                    cursor.getInt(cursor.getColumnIndex("MINTMARKLEVEL")),
                    cursor.getInt(cursor.getColumnIndex("GRADE")),
                    cursor.getInt(cursor.getColumnIndex("BASEHOLENUM")),
                    cursor.getString(cursor.getColumnIndex("BASEATTRIVALUE")),
                    cursor.getString(cursor.getColumnIndex("MAXATTRIVALUE")),
                    cursor.getString(cursor.getColumnIndex("EXTRAATTRIVALUE")),
                    cursor.getString(cursor.getColumnIndex("DES")),
                    cursor.getString(cursor.getColumnIndex("EFFECTDES")),
                    cursor.getInt(cursor.getColumnIndex("MINTMARKCLASS")),
                    cursor.getInt(cursor.getColumnIndex("MoveID"))
            ));
        }
        if (cursor != null) cursor.close();
        return mintMarks;
    }

    /**
     * 查询技能
     *
     * @param selection
     * @param param
     * @return
     */
    public List<MovesInfo> queryMoves(String selection, String[] param) {
        Uri uri = Uri.parse("content://com.peekay.mw_manual.provider/moves");
        ContentResolver resolve = getContentResolver();
        List<MovesInfo> movesInfos = new ArrayList<>();
        Cursor cursor = resolve.query(uri, null, selection, param, null);
        while (cursor != null && cursor.moveToNext()) {
            String info = getContentResolver().getType(Uri.parse("content://com.peekay.mw_manual.provider/move_des?"
                    + cursor.getString(cursor.getColumnIndex("SideEffect"))
                    + "&" + cursor.getString(cursor.getColumnIndex("SideEffectArg"))));
            movesInfos.add(new MovesInfo(
                    cursor.getInt(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("Name")),
                    cursor.getInt(cursor.getColumnIndex("Category")),
                    cursor.getInt(cursor.getColumnIndex("Type")),
                    cursor.getInt(cursor.getColumnIndex("Power")),
                    cursor.getInt(cursor.getColumnIndex("MaxPP")),
                    cursor.getInt(cursor.getColumnIndex("Accuracy")),
                    cursor.getString(cursor.getColumnIndex("SideEffect")),
                    cursor.getString(cursor.getColumnIndex("SideEffectArg")),
                    cursor.getString(cursor.getColumnIndex("Url")),
                    cursor.getInt(cursor.getColumnIndex("CD")),
                    cursor.getInt(cursor.getColumnIndex("CritRate")),
                    cursor.getInt(cursor.getColumnIndex("Priority")),
                    cursor.getInt(cursor.getColumnIndex("MustHit")) > 0,
                    cursor.getInt(cursor.getColumnIndex("AtkType")), info,
                    cursor.getInt(cursor.getColumnIndex("CritAtkFirst")),
                    cursor.getInt(cursor.getColumnIndex("CritAtkSecond")),
                    cursor.getInt(cursor.getColumnIndex("DmgBindHpDv")),
                    cursor.getInt(cursor.getColumnIndex("DmgBindLv")),
                    cursor.getInt(cursor.getColumnIndex("PwrBindDv")),
                    cursor.getInt(cursor.getColumnIndex("PwrDouble")),
                    cursor.getInt(cursor.getColumnIndex("CritSelfHalfHp")),
                    cursor.getInt(cursor.getColumnIndex("CritFoeHalfHp"))));
        }
        if (cursor != null) cursor.close();
        return movesInfos;
    }

    public void openPackageName(Context context, String packageName) {
        Context pkgContext = getPackageContext(context, packageName);
        Intent intent = getAppOpenIntentByPackageName(context, packageName);
        if (pkgContext != null && intent != null) {
            pkgContext.startActivity(intent);
        }
    }

    public static Context getPackageContext(Context context, String packageName) {
        Context pkgContext = null;
        if (context.getPackageName().equals(packageName)) {
            pkgContext = context;
        } else {
            // 创建第三方应用的上下文环境
            try {
                pkgContext = context.createPackageContext(packageName,
                        Context.CONTEXT_IGNORE_SECURITY
                                | Context.CONTEXT_INCLUDE_CODE);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return pkgContext;
    }

    public static Intent getAppOpenIntentByPackageName(Context context, String packageName) {
        // MainActivity完整名
        String mainAct = null;
        // 根据包名寻找MainActivity
        PackageManager pkgMag = context.getPackageManager();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | Intent.FLAG_ACTIVITY_NEW_TASK);
        @SuppressLint("WrongConstant") List<ResolveInfo> list = pkgMag.queryIntentActivities(intent, PackageManager.GET_ACTIVITIES);
        for (int i = 0; i < list.size(); i++) {
            ResolveInfo info = list.get(i);
            if (info.activityInfo.packageName.equals(packageName)) {
                mainAct = info.activityInfo.name;
                break;
            }
        }
        if (TextUtils.isEmpty(mainAct)) {
            return null;
        }
        intent.setComponent(new ComponentName(packageName, mainAct));
        return intent;
    }
}
