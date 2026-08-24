package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb1  reason: default package */
/* loaded from: classes.dex */
public enum zb1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.zb1[] $VALUES = null;
    public static final defpackage.zb1 DISK = null;
    public static final defpackage.zb1 MEMORY = null;
    public static final defpackage.zb1 MEMORY_CACHE = null;
    public static final defpackage.zb1 NETWORK = null;

    private static final /* synthetic */ defpackage.zb1[] $values() {
            zb1 r0 = defpackage.zb1.MEMORY_CACHE
            zb1 r1 = defpackage.zb1.MEMORY
            zb1 r2 = defpackage.zb1.DISK
            zb1 r3 = defpackage.zb1.NETWORK
            zb1[] r0 = new defpackage.zb1[]{r0, r1, r2, r3}
            return r0
    }

    static {
            zb1 r0 = new zb1
            java.lang.String r1 = "MEMORY_CACHE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.zb1.MEMORY_CACHE = r0
            zb1 r0 = new zb1
            java.lang.String r1 = "MEMORY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.zb1.MEMORY = r0
            zb1 r0 = new zb1
            java.lang.String r1 = "DISK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.zb1.DISK = r0
            zb1 r0 = new zb1
            java.lang.String r1 = "NETWORK"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.zb1.NETWORK = r0
            zb1[] r0 = $values()
            defpackage.zb1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.zb1.$ENTRIES = r0
            return
    }

    zb1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.zb1.$ENTRIES
            return r0
    }

    public static defpackage.zb1 valueOf(java.lang.String r1) {
            java.lang.Class<zb1> r0 = defpackage.zb1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zb1 r1 = (defpackage.zb1) r1
            return r1
    }

    public static defpackage.zb1[] values() {
            zb1[] r0 = defpackage.zb1.$VALUES
            java.lang.Object r0 = r0.clone()
            zb1[] r0 = (defpackage.zb1[]) r0
            return r0
    }
}
