package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public enum n3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.n3[] $VALUES = null;
    public static final defpackage.n3 FAILURE = null;
    public static final defpackage.n3 SUCCESS = null;

    private static final /* synthetic */ defpackage.n3[] $values() {
            n3 r0 = defpackage.n3.SUCCESS
            n3 r1 = defpackage.n3.FAILURE
            n3[] r0 = new defpackage.n3[]{r0, r1}
            return r0
    }

    static {
            n3 r0 = new n3
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n3.SUCCESS = r0
            n3 r0 = new n3
            java.lang.String r1 = "FAILURE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n3.FAILURE = r0
            n3[] r0 = $values()
            defpackage.n3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.n3.$ENTRIES = r0
            return
    }

    n3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.n3.$ENTRIES
            return r0
    }

    public static defpackage.n3 valueOf(java.lang.String r1) {
            java.lang.Class<n3> r0 = defpackage.n3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n3 r1 = (defpackage.n3) r1
            return r1
    }

    public static defpackage.n3[] values() {
            n3[] r0 = defpackage.n3.$VALUES
            java.lang.Object r0 = r0.clone()
            n3[] r0 = (defpackage.n3[]) r0
            return r0
    }
}
