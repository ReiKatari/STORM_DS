package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx5  reason: default package */
/* loaded from: classes.dex */
public enum nx5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.nx5[] $VALUES = null;
    public static final defpackage.nx5 CUSTOM = null;
    public static final defpackage.nx5 GLOBAL = null;

    private static final /* synthetic */ defpackage.nx5[] $values() {
            nx5 r0 = defpackage.nx5.GLOBAL
            nx5 r1 = defpackage.nx5.CUSTOM
            nx5[] r0 = new defpackage.nx5[]{r0, r1}
            return r0
    }

    static {
            nx5 r0 = new nx5
            java.lang.String r1 = "GLOBAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.nx5.GLOBAL = r0
            nx5 r0 = new nx5
            java.lang.String r1 = "CUSTOM"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.nx5.CUSTOM = r0
            nx5[] r0 = $values()
            defpackage.nx5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.nx5.$ENTRIES = r0
            return
    }

    nx5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.nx5.$ENTRIES
            return r0
    }

    public static defpackage.nx5 valueOf(java.lang.String r1) {
            java.lang.Class<nx5> r0 = defpackage.nx5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nx5 r1 = (defpackage.nx5) r1
            return r1
    }

    public static defpackage.nx5[] values() {
            nx5[] r0 = defpackage.nx5.$VALUES
            java.lang.Object r0 = r0.clone()
            nx5[] r0 = (defpackage.nx5[]) r0
            return r0
    }
}
