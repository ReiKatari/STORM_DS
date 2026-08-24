package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk3  reason: default package */
/* loaded from: classes.dex */
public enum lk3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.lk3[] $VALUES = null;
    public static final defpackage.lk3 BUILT_IN = null;
    public static final defpackage.lk3 EXTERNAL = null;

    private static final /* synthetic */ defpackage.lk3[] $values() {
            lk3 r0 = defpackage.lk3.BUILT_IN
            lk3 r1 = defpackage.lk3.EXTERNAL
            lk3[] r0 = new defpackage.lk3[]{r0, r1}
            return r0
    }

    static {
            lk3 r0 = new lk3
            java.lang.String r1 = "BUILT_IN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.lk3.BUILT_IN = r0
            lk3 r0 = new lk3
            java.lang.String r1 = "EXTERNAL"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.lk3.EXTERNAL = r0
            lk3[] r0 = $values()
            defpackage.lk3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.lk3.$ENTRIES = r0
            return
    }

    lk3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.lk3.$ENTRIES
            return r0
    }

    public static defpackage.lk3 valueOf(java.lang.String r1) {
            java.lang.Class<lk3> r0 = defpackage.lk3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            lk3 r1 = (defpackage.lk3) r1
            return r1
    }

    public static defpackage.lk3[] values() {
            lk3[] r0 = defpackage.lk3.$VALUES
            java.lang.Object r0 = r0.clone()
            lk3[] r0 = (defpackage.lk3[]) r0
            return r0
    }
}
