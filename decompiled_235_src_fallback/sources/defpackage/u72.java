package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u72  reason: default package */
/* loaded from: classes.dex */
public enum u72 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.u72[] $VALUES = null;
    public static final defpackage.u72 IGNORE = null;
    public static final defpackage.u72 RESPECT_ALL = null;
    public static final defpackage.u72 RESPECT_PERFORMANCE = null;

    private static final /* synthetic */ defpackage.u72[] $values() {
            u72 r0 = defpackage.u72.IGNORE
            u72 r1 = defpackage.u72.RESPECT_PERFORMANCE
            u72 r2 = defpackage.u72.RESPECT_ALL
            u72[] r0 = new defpackage.u72[]{r0, r1, r2}
            return r0
    }

    static {
            u72 r0 = new u72
            java.lang.String r1 = "IGNORE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.u72.IGNORE = r0
            u72 r0 = new u72
            java.lang.String r1 = "RESPECT_PERFORMANCE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.u72.RESPECT_PERFORMANCE = r0
            u72 r0 = new u72
            java.lang.String r1 = "RESPECT_ALL"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.u72.RESPECT_ALL = r0
            u72[] r0 = $values()
            defpackage.u72.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.u72.$ENTRIES = r0
            return
    }

    u72(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.u72.$ENTRIES
            return r0
    }

    public static defpackage.u72 valueOf(java.lang.String r1) {
            java.lang.Class<u72> r0 = defpackage.u72.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u72 r1 = (defpackage.u72) r1
            return r1
    }

    public static defpackage.u72[] values() {
            u72[] r0 = defpackage.u72.$VALUES
            java.lang.Object r0 = r0.clone()
            u72[] r0 = (defpackage.u72[]) r0
            return r0
    }
}
