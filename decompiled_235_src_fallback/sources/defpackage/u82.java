package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u82  reason: default package */
/* loaded from: classes.dex */
public enum u82 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.u82[] $VALUES = null;
    public static final defpackage.u82 MELON_DUAL_DS = null;
    public static final defpackage.u82 MIRROR = null;

    private static final /* synthetic */ defpackage.u82[] $values() {
            u82 r0 = defpackage.u82.MIRROR
            u82 r1 = defpackage.u82.MELON_DUAL_DS
            u82[] r0 = new defpackage.u82[]{r0, r1}
            return r0
    }

    static {
            u82 r0 = new u82
            java.lang.String r1 = "MIRROR"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.u82.MIRROR = r0
            u82 r0 = new u82
            java.lang.String r1 = "MELON_DUAL_DS"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.u82.MELON_DUAL_DS = r0
            u82[] r0 = $values()
            defpackage.u82.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.u82.$ENTRIES = r0
            return
    }

    u82(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.u82.$ENTRIES
            return r0
    }

    public static defpackage.u82 valueOf(java.lang.String r1) {
            java.lang.Class<u82> r0 = defpackage.u82.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u82 r1 = (defpackage.u82) r1
            return r1
    }

    public static defpackage.u82[] values() {
            u82[] r0 = defpackage.u82.$VALUES
            java.lang.Object r0 = r0.clone()
            u82[] r0 = (defpackage.u82[]) r0
            return r0
    }
}
