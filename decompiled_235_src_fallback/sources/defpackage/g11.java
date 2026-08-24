package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g11  reason: default package */
/* loaded from: classes.dex */
public enum g11 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.g11[] $VALUES = null;
    public static final defpackage.g11 BASELINE = null;
    public static final defpackage.g11 BOTTOM = null;
    public static final defpackage.g11 CENTER = null;
    public static final defpackage.g11 CENTER_X = null;
    public static final defpackage.g11 CENTER_Y = null;
    public static final defpackage.g11 LEFT = null;
    public static final defpackage.g11 NONE = null;
    public static final defpackage.g11 RIGHT = null;
    public static final defpackage.g11 TOP = null;

    private static /* synthetic */ defpackage.g11[] $values() {
            g11 r0 = defpackage.g11.NONE
            g11 r1 = defpackage.g11.LEFT
            g11 r2 = defpackage.g11.TOP
            g11 r3 = defpackage.g11.RIGHT
            g11 r4 = defpackage.g11.BOTTOM
            g11 r5 = defpackage.g11.BASELINE
            g11 r6 = defpackage.g11.CENTER
            g11 r7 = defpackage.g11.CENTER_X
            g11 r8 = defpackage.g11.CENTER_Y
            g11[] r0 = new defpackage.g11[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            return r0
    }

    static {
            g11 r0 = new g11
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.g11.NONE = r0
            g11 r0 = new g11
            java.lang.String r1 = "LEFT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.g11.LEFT = r0
            g11 r0 = new g11
            java.lang.String r1 = "TOP"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.g11.TOP = r0
            g11 r0 = new g11
            java.lang.String r1 = "RIGHT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.g11.RIGHT = r0
            g11 r0 = new g11
            java.lang.String r1 = "BOTTOM"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.g11.BOTTOM = r0
            g11 r0 = new g11
            java.lang.String r1 = "BASELINE"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.g11.BASELINE = r0
            g11 r0 = new g11
            java.lang.String r1 = "CENTER"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.g11.CENTER = r0
            g11 r0 = new g11
            java.lang.String r1 = "CENTER_X"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.g11.CENTER_X = r0
            g11 r0 = new g11
            java.lang.String r1 = "CENTER_Y"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.g11.CENTER_Y = r0
            g11[] r0 = $values()
            defpackage.g11.$VALUES = r0
            return
    }

    g11(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.g11 valueOf(java.lang.String r1) {
            java.lang.Class<g11> r0 = defpackage.g11.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g11 r1 = (defpackage.g11) r1
            return r1
    }

    public static defpackage.g11[] values() {
            g11[] r0 = defpackage.g11.$VALUES
            java.lang.Object r0 = r0.clone()
            g11[] r0 = (defpackage.g11[]) r0
            return r0
    }
}
