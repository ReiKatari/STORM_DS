package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w66  reason: default package */
/* loaded from: classes.dex */
public enum w66 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.w66[] $VALUES = null;
    public static final defpackage.w66 GAP = null;
    public static final defpackage.w66 SEAMLESS = null;

    private static final /* synthetic */ defpackage.w66[] $values() {
            w66 r0 = defpackage.w66.SEAMLESS
            w66 r1 = defpackage.w66.GAP
            w66[] r0 = new defpackage.w66[]{r0, r1}
            return r0
    }

    static {
            w66 r0 = new w66
            java.lang.String r1 = "SEAMLESS"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.w66.SEAMLESS = r0
            w66 r0 = new w66
            java.lang.String r1 = "GAP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.w66.GAP = r0
            w66[] r0 = $values()
            defpackage.w66.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.w66.$ENTRIES = r0
            return
    }

    w66(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.w66.$ENTRIES
            return r0
    }

    public static defpackage.w66 valueOf(java.lang.String r1) {
            java.lang.Class<w66> r0 = defpackage.w66.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            w66 r1 = (defpackage.w66) r1
            return r1
    }

    public static defpackage.w66[] values() {
            w66[] r0 = defpackage.w66.$VALUES
            java.lang.Object r0 = r0.clone()
            w66[] r0 = (defpackage.w66[]) r0
            return r0
    }
}
