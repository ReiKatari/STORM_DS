package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bi1  reason: default package */
/* loaded from: classes.dex */
public enum bi1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.bi1[] $VALUES = null;
    public static final defpackage.bi1 BASELINE = null;
    public static final defpackage.bi1 BOTTOM = null;
    public static final defpackage.bi1 HORIZONTAL_DIMENSION = null;
    public static final defpackage.bi1 LEFT = null;
    public static final defpackage.bi1 RIGHT = null;
    public static final defpackage.bi1 TOP = null;
    public static final defpackage.bi1 UNKNOWN = null;
    public static final defpackage.bi1 VERTICAL_DIMENSION = null;

    private static /* synthetic */ defpackage.bi1[] $values() {
            bi1 r0 = defpackage.bi1.UNKNOWN
            bi1 r1 = defpackage.bi1.HORIZONTAL_DIMENSION
            bi1 r2 = defpackage.bi1.VERTICAL_DIMENSION
            bi1 r3 = defpackage.bi1.LEFT
            bi1 r4 = defpackage.bi1.RIGHT
            bi1 r5 = defpackage.bi1.TOP
            bi1 r6 = defpackage.bi1.BOTTOM
            bi1 r7 = defpackage.bi1.BASELINE
            bi1[] r0 = new defpackage.bi1[]{r0, r1, r2, r3, r4, r5, r6, r7}
            return r0
    }

    static {
            bi1 r0 = new bi1
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bi1.UNKNOWN = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "HORIZONTAL_DIMENSION"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bi1.HORIZONTAL_DIMENSION = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "VERTICAL_DIMENSION"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.bi1.VERTICAL_DIMENSION = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "LEFT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.bi1.LEFT = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "RIGHT"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.bi1.RIGHT = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "TOP"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.bi1.TOP = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "BOTTOM"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.bi1.BOTTOM = r0
            bi1 r0 = new bi1
            java.lang.String r1 = "BASELINE"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.bi1.BASELINE = r0
            bi1[] r0 = $values()
            defpackage.bi1.$VALUES = r0
            return
    }

    bi1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.bi1 valueOf(java.lang.String r1) {
            java.lang.Class<bi1> r0 = defpackage.bi1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi1 r1 = (defpackage.bi1) r1
            return r1
    }

    public static defpackage.bi1[] values() {
            bi1[] r0 = defpackage.bi1.$VALUES
            java.lang.Object r0 = r0.clone()
            bi1[] r0 = (defpackage.bi1[]) r0
            return r0
    }
}
