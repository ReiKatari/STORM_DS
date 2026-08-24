package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k34  reason: default package */
/* loaded from: classes.dex */
public enum k34 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.k34[] $VALUES = null;
    public static final defpackage.k34 Max = null;
    public static final defpackage.k34 Min = null;

    private static final /* synthetic */ defpackage.k34[] $values() {
            k34 r0 = defpackage.k34.Min
            k34 r1 = defpackage.k34.Max
            k34[] r0 = new defpackage.k34[]{r0, r1}
            return r0
    }

    static {
            k34 r0 = new k34
            java.lang.String r1 = "Min"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.k34.Min = r0
            k34 r0 = new k34
            java.lang.String r1 = "Max"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.k34.Max = r0
            k34[] r0 = $values()
            defpackage.k34.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.k34.$ENTRIES = r0
            return
    }

    k34(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.k34.$ENTRIES
            return r0
    }

    public static defpackage.k34 valueOf(java.lang.String r1) {
            java.lang.Class<k34> r0 = defpackage.k34.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            k34 r1 = (defpackage.k34) r1
            return r1
    }

    public static defpackage.k34[] values() {
            k34[] r0 = defpackage.k34.$VALUES
            java.lang.Object r0 = r0.clone()
            k34[] r0 = (defpackage.k34[]) r0
            return r0
    }
}
