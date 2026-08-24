package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp5  reason: default package */
/* loaded from: classes.dex */
public enum hp5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hp5[] $VALUES = null;
    public static final defpackage.hp5 NATIVE = null;
    public static final defpackage.hp5 VULKAN_IR = null;

    private static final /* synthetic */ defpackage.hp5[] $values() {
            hp5 r0 = defpackage.hp5.VULKAN_IR
            hp5 r1 = defpackage.hp5.NATIVE
            hp5[] r0 = new defpackage.hp5[]{r0, r1}
            return r0
    }

    static {
            hp5 r0 = new hp5
            java.lang.String r1 = "VULKAN_IR"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hp5.VULKAN_IR = r0
            hp5 r0 = new hp5
            java.lang.String r1 = "NATIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hp5.NATIVE = r0
            hp5[] r0 = $values()
            defpackage.hp5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hp5.$ENTRIES = r0
            return
    }

    hp5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hp5.$ENTRIES
            return r0
    }

    public static defpackage.hp5 valueOf(java.lang.String r1) {
            java.lang.Class<hp5> r0 = defpackage.hp5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hp5 r1 = (defpackage.hp5) r1
            return r1
    }

    public static defpackage.hp5[] values() {
            hp5[] r0 = defpackage.hp5.$VALUES
            java.lang.Object r0 = r0.clone()
            hp5[] r0 = (defpackage.hp5[]) r0
            return r0
    }
}
