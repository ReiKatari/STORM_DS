package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import androidx.recyclerview.widget.RecyclerView;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zbb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbur {
    public static final zbur zba;
    public static final zbur zbb;
    public static final zbur zbc;
    public static final zbur zbd;
    public static final zbur zbe;
    public static final zbur zbf;
    public static final zbur zbg;
    public static final zbur zbh;
    public static final zbur zbi;
    public static final zbur zbj;
    private static final /* synthetic */ zbur[] zbk;
    private final Class zbl;

    static {
        zbur zburVar = new zbur("VOID", 0, Void.class, Void.class, null);
        zba = zburVar;
        Class cls = Integer.TYPE;
        zbur zburVar2 = new zbur("INT", 1, cls, Integer.class, 0);
        zbb = zburVar2;
        zbur zburVar3 = new zbur("LONG", 2, Long.TYPE, Long.class, 0L);
        zbc = zburVar3;
        zbur zburVar4 = new zbur("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) RecyclerView.B1));
        zbd = zburVar4;
        zbur zburVar5 = new zbur("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zbe = zburVar5;
        zbur zburVar6 = new zbur("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zbf = zburVar6;
        zbur zburVar7 = new zbur("STRING", 6, String.class, String.class, "");
        zbg = zburVar7;
        zbur zburVar8 = new zbur("BYTE_STRING", 7, zbtc.class, zbtc.class, zbtc.zbb);
        zbh = zburVar8;
        zbur zburVar9 = new zbur("ENUM", 8, cls, Integer.class, null);
        zbi = zburVar9;
        zbur zburVar10 = new zbur("MESSAGE", 9, Object.class, Object.class, null);
        zbj = zburVar10;
        zbk = new zbur[]{zburVar, zburVar2, zburVar3, zburVar4, zburVar5, zburVar6, zburVar7, zburVar8, zburVar9, zburVar10};
    }

    private zbur(String str, int i, Class cls, Class cls2, Object obj) {
        this.zbl = cls2;
    }

    public static zbur[] values() {
        return (zbur[]) zbk.clone();
    }

    public final Class zba() {
        return this.zbl;
    }
}
