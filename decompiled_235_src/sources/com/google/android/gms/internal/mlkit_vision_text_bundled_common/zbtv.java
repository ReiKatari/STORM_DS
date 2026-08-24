package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zba uses external variables
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
public final class zbtv {
    public static final zbtv zbA;
    public static final zbtv zbB;
    public static final zbtv zbC;
    public static final zbtv zbD;
    public static final zbtv zbE;
    public static final zbtv zbF;
    public static final zbtv zbG;
    public static final zbtv zbH;
    public static final zbtv zbI;
    public static final zbtv zbJ;
    public static final zbtv zbK;
    public static final zbtv zbL;
    public static final zbtv zbM;
    public static final zbtv zbN;
    public static final zbtv zbO;
    public static final zbtv zbP;
    public static final zbtv zbQ;
    public static final zbtv zbR;
    public static final zbtv zbS;
    public static final zbtv zbT;
    public static final zbtv zbU;
    public static final zbtv zbV;
    public static final zbtv zbW;
    public static final zbtv zbX;
    public static final zbtv zbY;
    private static final zbtv[] zbZ;
    public static final zbtv zba;
    private static final /* synthetic */ zbtv[] zbaa;
    public static final zbtv zbb;
    public static final zbtv zbc;
    public static final zbtv zbd;
    public static final zbtv zbe;
    public static final zbtv zbf;
    public static final zbtv zbg;
    public static final zbtv zbh;
    public static final zbtv zbi;
    public static final zbtv zbj;
    public static final zbtv zbk;
    public static final zbtv zbl;
    public static final zbtv zbm;
    public static final zbtv zbn;
    public static final zbtv zbo;
    public static final zbtv zbp;
    public static final zbtv zbq;
    public static final zbtv zbr;
    public static final zbtv zbs;
    public static final zbtv zbt;
    public static final zbtv zbu;
    public static final zbtv zbv;
    public static final zbtv zbw;
    public static final zbtv zbx;
    public static final zbtv zby;
    public static final zbtv zbz;
    private final int zbab;

    static {
        zbur zburVar = zbur.zbe;
        zbtv zbtvVar = new zbtv("DOUBLE", 0, 0, 1, zburVar);
        zba = zbtvVar;
        zbur zburVar2 = zbur.zbd;
        zbtv zbtvVar2 = new zbtv("FLOAT", 1, 1, 1, zburVar2);
        zbb = zbtvVar2;
        zbur zburVar3 = zbur.zbc;
        zbtv zbtvVar3 = new zbtv("INT64", 2, 2, 1, zburVar3);
        zbc = zbtvVar3;
        zbtv zbtvVar4 = new zbtv("UINT64", 3, 3, 1, zburVar3);
        zbd = zbtvVar4;
        zbur zburVar4 = zbur.zbb;
        zbtv zbtvVar5 = new zbtv("INT32", 4, 4, 1, zburVar4);
        zbe = zbtvVar5;
        zbtv zbtvVar6 = new zbtv("FIXED64", 5, 5, 1, zburVar3);
        zbf = zbtvVar6;
        zbtv zbtvVar7 = new zbtv("FIXED32", 6, 6, 1, zburVar4);
        zbg = zbtvVar7;
        zbur zburVar5 = zbur.zbf;
        zbtv zbtvVar8 = new zbtv("BOOL", 7, 7, 1, zburVar5);
        zbh = zbtvVar8;
        zbur zburVar6 = zbur.zbg;
        zbtv zbtvVar9 = new zbtv("STRING", 8, 8, 1, zburVar6);
        zbi = zbtvVar9;
        zbur zburVar7 = zbur.zbj;
        zbtv zbtvVar10 = new zbtv("MESSAGE", 9, 9, 1, zburVar7);
        zbj = zbtvVar10;
        zbur zburVar8 = zbur.zbh;
        zbtv zbtvVar11 = new zbtv("BYTES", 10, 10, 1, zburVar8);
        zbk = zbtvVar11;
        zbtv zbtvVar12 = new zbtv("UINT32", 11, 11, 1, zburVar4);
        zbl = zbtvVar12;
        zbur zburVar9 = zbur.zbi;
        zbtv zbtvVar13 = new zbtv("ENUM", 12, 12, 1, zburVar9);
        zbm = zbtvVar13;
        zbtv zbtvVar14 = new zbtv("SFIXED32", 13, 13, 1, zburVar4);
        zbn = zbtvVar14;
        zbtv zbtvVar15 = new zbtv("SFIXED64", 14, 14, 1, zburVar3);
        zbo = zbtvVar15;
        zbtv zbtvVar16 = new zbtv("SINT32", 15, 15, 1, zburVar4);
        zbp = zbtvVar16;
        zbtv zbtvVar17 = new zbtv("SINT64", 16, 16, 1, zburVar3);
        zbq = zbtvVar17;
        zbtv zbtvVar18 = new zbtv("GROUP", 17, 17, 1, zburVar7);
        zbr = zbtvVar18;
        zbtv zbtvVar19 = new zbtv("DOUBLE_LIST", 18, 18, 2, zburVar);
        zbs = zbtvVar19;
        zbtv zbtvVar20 = new zbtv("FLOAT_LIST", 19, 19, 2, zburVar2);
        zbt = zbtvVar20;
        zbtv zbtvVar21 = new zbtv("INT64_LIST", 20, 20, 2, zburVar3);
        zbu = zbtvVar21;
        zbtv zbtvVar22 = new zbtv("UINT64_LIST", 21, 21, 2, zburVar3);
        zbv = zbtvVar22;
        zbtv zbtvVar23 = new zbtv("INT32_LIST", 22, 22, 2, zburVar4);
        zbw = zbtvVar23;
        zbtv zbtvVar24 = new zbtv("FIXED64_LIST", 23, 23, 2, zburVar3);
        zbx = zbtvVar24;
        zbtv zbtvVar25 = new zbtv("FIXED32_LIST", 24, 24, 2, zburVar4);
        zby = zbtvVar25;
        zbtv zbtvVar26 = new zbtv("BOOL_LIST", 25, 25, 2, zburVar5);
        zbz = zbtvVar26;
        zbtv zbtvVar27 = new zbtv("STRING_LIST", 26, 26, 2, zburVar6);
        zbA = zbtvVar27;
        zbtv zbtvVar28 = new zbtv("MESSAGE_LIST", 27, 27, 2, zburVar7);
        zbB = zbtvVar28;
        zbtv zbtvVar29 = new zbtv("BYTES_LIST", 28, 28, 2, zburVar8);
        zbC = zbtvVar29;
        zbtv zbtvVar30 = new zbtv("UINT32_LIST", 29, 29, 2, zburVar4);
        zbD = zbtvVar30;
        zbtv zbtvVar31 = new zbtv("ENUM_LIST", 30, 30, 2, zburVar9);
        zbE = zbtvVar31;
        zbtv zbtvVar32 = new zbtv("SFIXED32_LIST", 31, 31, 2, zburVar4);
        zbF = zbtvVar32;
        zbtv zbtvVar33 = new zbtv("SFIXED64_LIST", 32, 32, 2, zburVar3);
        zbG = zbtvVar33;
        zbtv zbtvVar34 = new zbtv("SINT32_LIST", 33, 33, 2, zburVar4);
        zbH = zbtvVar34;
        zbtv zbtvVar35 = new zbtv("SINT64_LIST", 34, 34, 2, zburVar3);
        zbI = zbtvVar35;
        zbtv zbtvVar36 = new zbtv("DOUBLE_LIST_PACKED", 35, 35, 3, zburVar);
        zbJ = zbtvVar36;
        zbtv zbtvVar37 = new zbtv("FLOAT_LIST_PACKED", 36, 36, 3, zburVar2);
        zbK = zbtvVar37;
        zbtv zbtvVar38 = new zbtv("INT64_LIST_PACKED", 37, 37, 3, zburVar3);
        zbL = zbtvVar38;
        zbtv zbtvVar39 = new zbtv("UINT64_LIST_PACKED", 38, 38, 3, zburVar3);
        zbM = zbtvVar39;
        zbtv zbtvVar40 = new zbtv("INT32_LIST_PACKED", 39, 39, 3, zburVar4);
        zbN = zbtvVar40;
        zbtv zbtvVar41 = new zbtv("FIXED64_LIST_PACKED", 40, 40, 3, zburVar3);
        zbO = zbtvVar41;
        zbtv zbtvVar42 = new zbtv("FIXED32_LIST_PACKED", 41, 41, 3, zburVar4);
        zbP = zbtvVar42;
        zbtv zbtvVar43 = new zbtv("BOOL_LIST_PACKED", 42, 42, 3, zburVar5);
        zbQ = zbtvVar43;
        zbtv zbtvVar44 = new zbtv("UINT32_LIST_PACKED", 43, 43, 3, zburVar4);
        zbR = zbtvVar44;
        zbtv zbtvVar45 = new zbtv("ENUM_LIST_PACKED", 44, 44, 3, zburVar9);
        zbS = zbtvVar45;
        zbtv zbtvVar46 = new zbtv("SFIXED32_LIST_PACKED", 45, 45, 3, zburVar4);
        zbT = zbtvVar46;
        zbtv zbtvVar47 = new zbtv("SFIXED64_LIST_PACKED", 46, 46, 3, zburVar3);
        zbU = zbtvVar47;
        zbtv zbtvVar48 = new zbtv("SINT32_LIST_PACKED", 47, 47, 3, zburVar4);
        zbV = zbtvVar48;
        zbtv zbtvVar49 = new zbtv("SINT64_LIST_PACKED", 48, 48, 3, zburVar3);
        zbW = zbtvVar49;
        zbtv zbtvVar50 = new zbtv("GROUP_LIST", 49, 49, 2, zburVar7);
        zbX = zbtvVar50;
        zbtv zbtvVar51 = new zbtv("MAP", 50, 50, 4, zbur.zba);
        zbY = zbtvVar51;
        zbaa = new zbtv[]{zbtvVar, zbtvVar2, zbtvVar3, zbtvVar4, zbtvVar5, zbtvVar6, zbtvVar7, zbtvVar8, zbtvVar9, zbtvVar10, zbtvVar11, zbtvVar12, zbtvVar13, zbtvVar14, zbtvVar15, zbtvVar16, zbtvVar17, zbtvVar18, zbtvVar19, zbtvVar20, zbtvVar21, zbtvVar22, zbtvVar23, zbtvVar24, zbtvVar25, zbtvVar26, zbtvVar27, zbtvVar28, zbtvVar29, zbtvVar30, zbtvVar31, zbtvVar32, zbtvVar33, zbtvVar34, zbtvVar35, zbtvVar36, zbtvVar37, zbtvVar38, zbtvVar39, zbtvVar40, zbtvVar41, zbtvVar42, zbtvVar43, zbtvVar44, zbtvVar45, zbtvVar46, zbtvVar47, zbtvVar48, zbtvVar49, zbtvVar50, zbtvVar51};
        zbtv[] values = values();
        zbZ = new zbtv[values.length];
        for (zbtv zbtvVar52 : values) {
            zbZ[zbtvVar52.zbab] = zbtvVar52;
        }
    }

    private zbtv(String str, int i, int i2, int i3, zbur zburVar) {
        this.zbab = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                zburVar.zba();
            }
        } else {
            zburVar.zba();
        }
        if (i3 == 1) {
            zbur zburVar2 = zbur.zba;
            zburVar.ordinal();
        }
    }

    public static zbtv[] values() {
        return (zbtv[]) zbaa.clone();
    }

    public final int zba() {
        return this.zbab;
    }
}
