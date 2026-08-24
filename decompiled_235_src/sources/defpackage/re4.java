package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re4  reason: default package */
/* loaded from: classes.dex */
public enum re4 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);
    
    private static final SparseArray<re4> valueMap;
    private final int value;

    static {
        re4 re4Var = UNKNOWN_MOBILE_SUBTYPE;
        re4 re4Var2 = GPRS;
        re4 re4Var3 = EDGE;
        re4 re4Var4 = UMTS;
        re4 re4Var5 = CDMA;
        re4 re4Var6 = EVDO_0;
        re4 re4Var7 = EVDO_A;
        re4 re4Var8 = RTT;
        re4 re4Var9 = HSDPA;
        re4 re4Var10 = HSUPA;
        re4 re4Var11 = HSPA;
        re4 re4Var12 = IDEN;
        re4 re4Var13 = EVDO_B;
        re4 re4Var14 = LTE;
        re4 re4Var15 = EHRPD;
        re4 re4Var16 = HSPAP;
        re4 re4Var17 = GSM;
        re4 re4Var18 = TD_SCDMA;
        re4 re4Var19 = IWLAN;
        re4 re4Var20 = LTE_CA;
        SparseArray<re4> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, re4Var);
        sparseArray.put(1, re4Var2);
        sparseArray.put(2, re4Var3);
        sparseArray.put(3, re4Var4);
        sparseArray.put(4, re4Var5);
        sparseArray.put(5, re4Var6);
        sparseArray.put(6, re4Var7);
        sparseArray.put(7, re4Var8);
        sparseArray.put(8, re4Var9);
        sparseArray.put(9, re4Var10);
        sparseArray.put(10, re4Var11);
        sparseArray.put(11, re4Var12);
        sparseArray.put(12, re4Var13);
        sparseArray.put(13, re4Var14);
        sparseArray.put(14, re4Var15);
        sparseArray.put(15, re4Var16);
        sparseArray.put(16, re4Var17);
        sparseArray.put(17, re4Var18);
        sparseArray.put(18, re4Var19);
        sparseArray.put(19, re4Var20);
    }

    re4(int i) {
        this.value = i;
    }

    public static re4 forNumber(int i) {
        return valueMap.get(i);
    }

    public int getValue() {
        return this.value;
    }
}
