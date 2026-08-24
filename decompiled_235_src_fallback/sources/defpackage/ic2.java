package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic2  reason: default package */
/* loaded from: classes.dex */
public enum ic2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ic2[] $VALUES = null;
    public static final defpackage.ic2 BOTTOM_UP = null;
    public static final defpackage.ic2 TOP_DOWN = null;

    private static final /* synthetic */ defpackage.ic2[] $values() {
            ic2 r0 = defpackage.ic2.TOP_DOWN
            ic2 r1 = defpackage.ic2.BOTTOM_UP
            ic2[] r0 = new defpackage.ic2[]{r0, r1}
            return r0
    }

    static {
            ic2 r0 = new ic2
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ic2.TOP_DOWN = r0
            ic2 r0 = new ic2
            java.lang.String r1 = "BOTTOM_UP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ic2.BOTTOM_UP = r0
            ic2[] r0 = $values()
            defpackage.ic2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ic2.$ENTRIES = r0
            return
    }

    ic2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ic2.$ENTRIES
            return r0
    }

    public static defpackage.ic2 valueOf(java.lang.String r1) {
            java.lang.Class<ic2> r0 = defpackage.ic2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ic2 r1 = (defpackage.ic2) r1
            return r1
    }

    public static defpackage.ic2[] values() {
            ic2[] r0 = defpackage.ic2.$VALUES
            java.lang.Object r0 = r0.clone()
            ic2[] r0 = (defpackage.ic2[]) r0
            return r0
    }
}
