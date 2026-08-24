package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il3  reason: default package */
/* loaded from: classes.dex */
public enum il3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.il3[] $VALUES = null;
    public static final defpackage.il3 HEIGHT = null;
    public static final defpackage.il3 WIDTH = null;

    private static final /* synthetic */ defpackage.il3[] $values() {
            il3 r0 = defpackage.il3.WIDTH
            il3 r1 = defpackage.il3.HEIGHT
            il3[] r0 = new defpackage.il3[]{r0, r1}
            return r0
    }

    static {
            il3 r0 = new il3
            java.lang.String r1 = "WIDTH"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.il3.WIDTH = r0
            il3 r0 = new il3
            java.lang.String r1 = "HEIGHT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.il3.HEIGHT = r0
            il3[] r0 = $values()
            defpackage.il3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.il3.$ENTRIES = r0
            return
    }

    il3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.il3.$ENTRIES
            return r0
    }

    public static defpackage.il3 valueOf(java.lang.String r1) {
            java.lang.Class<il3> r0 = defpackage.il3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            il3 r1 = (defpackage.il3) r1
            return r1
    }

    public static defpackage.il3[] values() {
            il3[] r0 = defpackage.il3.$VALUES
            java.lang.Object r0 = r0.clone()
            il3[] r0 = (defpackage.il3[]) r0
            return r0
    }
}
