package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: se4  reason: default package */
/* loaded from: classes.dex */
public enum se4 {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);
    
    private static final SparseArray<se4> valueMap;
    private final int value;

    static {
        se4 se4Var = MOBILE;
        se4 se4Var2 = WIFI;
        se4 se4Var3 = MOBILE_MMS;
        se4 se4Var4 = MOBILE_SUPL;
        se4 se4Var5 = MOBILE_DUN;
        se4 se4Var6 = MOBILE_HIPRI;
        se4 se4Var7 = WIMAX;
        se4 se4Var8 = BLUETOOTH;
        se4 se4Var9 = DUMMY;
        se4 se4Var10 = ETHERNET;
        se4 se4Var11 = MOBILE_FOTA;
        se4 se4Var12 = MOBILE_IMS;
        se4 se4Var13 = MOBILE_CBS;
        se4 se4Var14 = WIFI_P2P;
        se4 se4Var15 = MOBILE_IA;
        se4 se4Var16 = MOBILE_EMERGENCY;
        se4 se4Var17 = PROXY;
        se4 se4Var18 = VPN;
        se4 se4Var19 = NONE;
        SparseArray<se4> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, se4Var);
        sparseArray.put(1, se4Var2);
        sparseArray.put(2, se4Var3);
        sparseArray.put(3, se4Var4);
        sparseArray.put(4, se4Var5);
        sparseArray.put(5, se4Var6);
        sparseArray.put(6, se4Var7);
        sparseArray.put(7, se4Var8);
        sparseArray.put(8, se4Var9);
        sparseArray.put(9, se4Var10);
        sparseArray.put(10, se4Var11);
        sparseArray.put(11, se4Var12);
        sparseArray.put(12, se4Var13);
        sparseArray.put(13, se4Var14);
        sparseArray.put(14, se4Var15);
        sparseArray.put(15, se4Var16);
        sparseArray.put(16, se4Var17);
        sparseArray.put(17, se4Var18);
        sparseArray.put(-1, se4Var19);
    }

    se4(int i) {
        this.value = i;
    }

    public static se4 forNumber(int i) {
        return valueMap.get(i);
    }

    public int getValue() {
        return this.value;
    }
}
