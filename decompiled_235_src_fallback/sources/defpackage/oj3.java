package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj3  reason: default package */
/* loaded from: classes.dex */
public enum oj3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.oj3[] $VALUES = null;
    public static final defpackage.oj3 HEIGHT = null;
    public static final defpackage.oj3 SIZE = null;
    public static final defpackage.oj3 WIDTH = null;

    private static final /* synthetic */ defpackage.oj3[] $values() {
            oj3 r0 = defpackage.oj3.SIZE
            oj3 r1 = defpackage.oj3.WIDTH
            oj3 r2 = defpackage.oj3.HEIGHT
            oj3[] r0 = new defpackage.oj3[]{r0, r1, r2}
            return r0
    }

    static {
            oj3 r0 = new oj3
            java.lang.String r1 = "SIZE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oj3.SIZE = r0
            oj3 r0 = new oj3
            java.lang.String r1 = "WIDTH"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.oj3.WIDTH = r0
            oj3 r0 = new oj3
            java.lang.String r1 = "HEIGHT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.oj3.HEIGHT = r0
            oj3[] r0 = $values()
            defpackage.oj3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.oj3.$ENTRIES = r0
            return
    }

    oj3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.oj3.$ENTRIES
            return r0
    }

    public static defpackage.oj3 valueOf(java.lang.String r1) {
            java.lang.Class<oj3> r0 = defpackage.oj3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oj3 r1 = (defpackage.oj3) r1
            return r1
    }

    public static defpackage.oj3[] values() {
            oj3[] r0 = defpackage.oj3.$VALUES
            java.lang.Object r0 = r0.clone()
            oj3[] r0 = (defpackage.oj3[]) r0
            return r0
    }
}
