package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na6  reason: default package */
/* loaded from: classes.dex */
public enum na6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.na6[] $VALUES = null;
    public static final defpackage.na6 Left = null;
    public static final defpackage.na6 Middle = null;
    public static final defpackage.na6 Right = null;

    private static final /* synthetic */ defpackage.na6[] $values() {
            na6 r0 = defpackage.na6.Left
            na6 r1 = defpackage.na6.Middle
            na6 r2 = defpackage.na6.Right
            na6[] r0 = new defpackage.na6[]{r0, r1, r2}
            return r0
    }

    static {
            na6 r0 = new na6
            java.lang.String r1 = "Left"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.na6.Left = r0
            na6 r0 = new na6
            java.lang.String r1 = "Middle"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.na6.Middle = r0
            na6 r0 = new na6
            java.lang.String r1 = "Right"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.na6.Right = r0
            na6[] r0 = $values()
            defpackage.na6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.na6.$ENTRIES = r0
            return
    }

    na6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.na6.$ENTRIES
            return r0
    }

    public static defpackage.na6 valueOf(java.lang.String r1) {
            java.lang.Class<na6> r0 = defpackage.na6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            na6 r1 = (defpackage.na6) r1
            return r1
    }

    public static defpackage.na6[] values() {
            na6[] r0 = defpackage.na6.$VALUES
            java.lang.Object r0 = r0.clone()
            na6[] r0 = (defpackage.na6[]) r0
            return r0
    }
}
