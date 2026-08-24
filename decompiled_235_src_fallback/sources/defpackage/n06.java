package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n06  reason: default package */
/* loaded from: classes.dex */
public enum n06 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.n06[] $VALUES = null;
    public static final defpackage.n06 GRID = null;
    public static final defpackage.n06 LIST = null;

    private static final /* synthetic */ defpackage.n06[] $values() {
            n06 r0 = defpackage.n06.GRID
            n06 r1 = defpackage.n06.LIST
            n06[] r0 = new defpackage.n06[]{r0, r1}
            return r0
    }

    static {
            n06 r0 = new n06
            java.lang.String r1 = "GRID"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n06.GRID = r0
            n06 r0 = new n06
            java.lang.String r1 = "LIST"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n06.LIST = r0
            n06[] r0 = $values()
            defpackage.n06.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.n06.$ENTRIES = r0
            return
    }

    n06(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.n06.$ENTRIES
            return r0
    }

    public static defpackage.n06 valueOf(java.lang.String r1) {
            java.lang.Class<n06> r0 = defpackage.n06.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n06 r1 = (defpackage.n06) r1
            return r1
    }

    public static defpackage.n06[] values() {
            n06[] r0 = defpackage.n06.$VALUES
            java.lang.Object r0 = r0.clone()
            n06[] r0 = (defpackage.n06[]) r0
            return r0
    }
}
