package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz5  reason: default package */
/* loaded from: classes.dex */
public enum zz5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.zz5[] $VALUES = null;
    public static final defpackage.zz5 ARM7 = null;
    public static final defpackage.zz5 ARM9 = null;
    public static final defpackage.zz5 BANNER = null;

    private static final /* synthetic */ defpackage.zz5[] $values() {
            zz5 r0 = defpackage.zz5.ARM9
            zz5 r1 = defpackage.zz5.ARM7
            zz5 r2 = defpackage.zz5.BANNER
            zz5[] r0 = new defpackage.zz5[]{r0, r1, r2}
            return r0
    }

    static {
            zz5 r0 = new zz5
            java.lang.String r1 = "ARM9"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.zz5.ARM9 = r0
            zz5 r0 = new zz5
            java.lang.String r1 = "ARM7"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.zz5.ARM7 = r0
            zz5 r0 = new zz5
            java.lang.String r1 = "BANNER"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.zz5.BANNER = r0
            zz5[] r0 = $values()
            defpackage.zz5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.zz5.$ENTRIES = r0
            return
    }

    zz5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.zz5.$ENTRIES
            return r0
    }

    public static defpackage.zz5 valueOf(java.lang.String r1) {
            java.lang.Class<zz5> r0 = defpackage.zz5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zz5 r1 = (defpackage.zz5) r1
            return r1
    }

    public static defpackage.zz5[] values() {
            zz5[] r0 = defpackage.zz5.$VALUES
            java.lang.Object r0 = r0.clone()
            zz5[] r0 = (defpackage.zz5[]) r0
            return r0
    }
}
