package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zbc uses external variables
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
public final class zbww {
    public static final zbww zba;
    public static final zbww zbb;
    public static final zbww zbc;
    public static final zbww zbd;
    public static final zbww zbe;
    public static final zbww zbf;
    public static final zbww zbg;
    public static final zbww zbh;
    public static final zbww zbi;
    public static final zbww zbj;
    public static final zbww zbk;
    public static final zbww zbl;
    public static final zbww zbm;
    public static final zbww zbn;
    public static final zbww zbo;
    public static final zbww zbp;
    public static final zbww zbq;
    public static final zbww zbr;
    private static final /* synthetic */ zbww[] zbs;
    private final zbwx zbt;
    private final int zbu;

    static {
        zbww zbwwVar = new zbww("DOUBLE", 0, zbwx.DOUBLE, 1);
        zba = zbwwVar;
        zbww zbwwVar2 = new zbww("FLOAT", 1, zbwx.FLOAT, 5);
        zbb = zbwwVar2;
        zbwx zbwxVar = zbwx.LONG;
        zbww zbwwVar3 = new zbww("INT64", 2, zbwxVar, 0);
        zbc = zbwwVar3;
        zbww zbwwVar4 = new zbww("UINT64", 3, zbwxVar, 0);
        zbd = zbwwVar4;
        zbwx zbwxVar2 = zbwx.INT;
        zbww zbwwVar5 = new zbww("INT32", 4, zbwxVar2, 0);
        zbe = zbwwVar5;
        zbww zbwwVar6 = new zbww("FIXED64", 5, zbwxVar, 1);
        zbf = zbwwVar6;
        zbww zbwwVar7 = new zbww("FIXED32", 6, zbwxVar2, 5);
        zbg = zbwwVar7;
        zbww zbwwVar8 = new zbww("BOOL", 7, zbwx.BOOLEAN, 0);
        zbh = zbwwVar8;
        zbww zbwwVar9 = new zbww("STRING", 8, zbwx.STRING, 2);
        zbi = zbwwVar9;
        zbwx zbwxVar3 = zbwx.MESSAGE;
        zbww zbwwVar10 = new zbww("GROUP", 9, zbwxVar3, 3);
        zbj = zbwwVar10;
        zbww zbwwVar11 = new zbww("MESSAGE", 10, zbwxVar3, 2);
        zbk = zbwwVar11;
        zbww zbwwVar12 = new zbww("BYTES", 11, zbwx.BYTE_STRING, 2);
        zbl = zbwwVar12;
        zbww zbwwVar13 = new zbww("UINT32", 12, zbwxVar2, 0);
        zbm = zbwwVar13;
        zbww zbwwVar14 = new zbww("ENUM", 13, zbwx.ENUM, 0);
        zbn = zbwwVar14;
        zbww zbwwVar15 = new zbww("SFIXED32", 14, zbwxVar2, 5);
        zbo = zbwwVar15;
        zbww zbwwVar16 = new zbww("SFIXED64", 15, zbwxVar, 1);
        zbp = zbwwVar16;
        zbww zbwwVar17 = new zbww("SINT32", 16, zbwxVar2, 0);
        zbq = zbwwVar17;
        zbww zbwwVar18 = new zbww("SINT64", 17, zbwxVar, 0);
        zbr = zbwwVar18;
        zbs = new zbww[]{zbwwVar, zbwwVar2, zbwwVar3, zbwwVar4, zbwwVar5, zbwwVar6, zbwwVar7, zbwwVar8, zbwwVar9, zbwwVar10, zbwwVar11, zbwwVar12, zbwwVar13, zbwwVar14, zbwwVar15, zbwwVar16, zbwwVar17, zbwwVar18};
    }

    private zbww(String str, int i, zbwx zbwxVar, int i2) {
        this.zbt = zbwxVar;
        this.zbu = i2;
    }

    public static zbww[] values() {
        return (zbww[]) zbs.clone();
    }

    public final int zba() {
        return this.zbu;
    }

    public final zbwx zbb() {
        return this.zbt;
    }
}
