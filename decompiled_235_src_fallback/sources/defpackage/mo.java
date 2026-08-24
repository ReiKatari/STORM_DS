package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo  reason: default package */
/* loaded from: classes.dex */
public enum mo extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mo[] $VALUES = null;
    public static final defpackage.mo BoundReached = null;
    public static final defpackage.mo Finished = null;

    private static final /* synthetic */ defpackage.mo[] $values() {
            mo r0 = defpackage.mo.BoundReached
            mo r1 = defpackage.mo.Finished
            mo[] r0 = new defpackage.mo[]{r0, r1}
            return r0
    }

    static {
            mo r0 = new mo
            java.lang.String r1 = "BoundReached"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mo.BoundReached = r0
            mo r0 = new mo
            java.lang.String r1 = "Finished"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.mo.Finished = r0
            mo[] r0 = $values()
            defpackage.mo.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mo.$ENTRIES = r0
            return
    }

    mo(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mo.$ENTRIES
            return r0
    }

    public static defpackage.mo valueOf(java.lang.String r1) {
            java.lang.Class<mo> r0 = defpackage.mo.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mo r1 = (defpackage.mo) r1
            return r1
    }

    public static defpackage.mo[] values() {
            mo[] r0 = defpackage.mo.$VALUES
            java.lang.Object r0 = r0.clone()
            mo[] r0 = (defpackage.mo[]) r0
            return r0
    }
}
