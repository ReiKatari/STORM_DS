package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hg4  reason: default package */
/* loaded from: classes.dex */
public enum hg4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hg4[] $VALUES = null;
    public static final defpackage.hg4 Max = null;
    public static final defpackage.hg4 Min = null;

    private static final /* synthetic */ defpackage.hg4[] $values() {
            hg4 r0 = defpackage.hg4.Min
            hg4 r1 = defpackage.hg4.Max
            hg4[] r0 = new defpackage.hg4[]{r0, r1}
            return r0
    }

    static {
            hg4 r0 = new hg4
            java.lang.String r1 = "Min"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hg4.Min = r0
            hg4 r0 = new hg4
            java.lang.String r1 = "Max"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hg4.Max = r0
            hg4[] r0 = $values()
            defpackage.hg4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hg4.$ENTRIES = r0
            return
    }

    hg4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hg4.$ENTRIES
            return r0
    }

    public static defpackage.hg4 valueOf(java.lang.String r1) {
            java.lang.Class<hg4> r0 = defpackage.hg4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hg4 r1 = (defpackage.hg4) r1
            return r1
    }

    public static defpackage.hg4[] values() {
            hg4[] r0 = defpackage.hg4.$VALUES
            java.lang.Object r0 = r0.clone()
            hg4[] r0 = (defpackage.hg4[]) r0
            return r0
    }
}
