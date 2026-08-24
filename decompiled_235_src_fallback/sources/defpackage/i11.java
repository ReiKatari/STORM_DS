package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i11  reason: default package */
/* loaded from: classes.dex */
public enum i11 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.i11[] $VALUES = null;
    public static final defpackage.i11 BOOLEAN_TYPE = null;
    public static final defpackage.i11 COLOR_DRAWABLE_TYPE = null;
    public static final defpackage.i11 COLOR_TYPE = null;
    public static final defpackage.i11 DIMENSION_TYPE = null;
    public static final defpackage.i11 FLOAT_TYPE = null;
    public static final defpackage.i11 INT_TYPE = null;
    public static final defpackage.i11 REFERENCE_TYPE = null;
    public static final defpackage.i11 STRING_TYPE = null;

    private static /* synthetic */ defpackage.i11[] $values() {
            i11 r0 = defpackage.i11.INT_TYPE
            i11 r1 = defpackage.i11.FLOAT_TYPE
            i11 r2 = defpackage.i11.COLOR_TYPE
            i11 r3 = defpackage.i11.COLOR_DRAWABLE_TYPE
            i11 r4 = defpackage.i11.STRING_TYPE
            i11 r5 = defpackage.i11.BOOLEAN_TYPE
            i11 r6 = defpackage.i11.DIMENSION_TYPE
            i11 r7 = defpackage.i11.REFERENCE_TYPE
            i11[] r0 = new defpackage.i11[]{r0, r1, r2, r3, r4, r5, r6, r7}
            return r0
    }

    static {
            i11 r0 = new i11
            java.lang.String r1 = "INT_TYPE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.i11.INT_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "FLOAT_TYPE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.i11.FLOAT_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "COLOR_TYPE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.i11.COLOR_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "COLOR_DRAWABLE_TYPE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.i11.COLOR_DRAWABLE_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "STRING_TYPE"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.i11.STRING_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "BOOLEAN_TYPE"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.i11.BOOLEAN_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "DIMENSION_TYPE"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.i11.DIMENSION_TYPE = r0
            i11 r0 = new i11
            java.lang.String r1 = "REFERENCE_TYPE"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.i11.REFERENCE_TYPE = r0
            i11[] r0 = $values()
            defpackage.i11.$VALUES = r0
            return
    }

    i11(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.i11 valueOf(java.lang.String r1) {
            java.lang.Class<i11> r0 = defpackage.i11.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i11 r1 = (defpackage.i11) r1
            return r1
    }

    public static defpackage.i11[] values() {
            i11[] r0 = defpackage.i11.$VALUES
            java.lang.Object r0 = r0.clone()
            i11[] r0 = (defpackage.i11[]) r0
            return r0
    }
}
