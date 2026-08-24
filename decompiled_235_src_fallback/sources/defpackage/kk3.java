package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk3  reason: default package */
/* loaded from: classes.dex */
public enum kk3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.kk3[] $VALUES = null;
    public static final defpackage.kk3 Ltr = null;
    public static final defpackage.kk3 Rtl = null;

    private static final /* synthetic */ defpackage.kk3[] $values() {
            kk3 r0 = defpackage.kk3.Ltr
            kk3 r1 = defpackage.kk3.Rtl
            kk3[] r0 = new defpackage.kk3[]{r0, r1}
            return r0
    }

    static {
            kk3 r0 = new kk3
            java.lang.String r1 = "Ltr"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.kk3.Ltr = r0
            kk3 r0 = new kk3
            java.lang.String r1 = "Rtl"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.kk3.Rtl = r0
            kk3[] r0 = $values()
            defpackage.kk3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.kk3.$ENTRIES = r0
            return
    }

    kk3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.kk3.$ENTRIES
            return r0
    }

    public static defpackage.kk3 valueOf(java.lang.String r1) {
            java.lang.Class<kk3> r0 = defpackage.kk3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kk3 r1 = (defpackage.kk3) r1
            return r1
    }

    public static defpackage.kk3[] values() {
            kk3[] r0 = defpackage.kk3.$VALUES
            java.lang.Object r0 = r0.clone()
            kk3[] r0 = (defpackage.kk3[]) r0
            return r0
    }
}
