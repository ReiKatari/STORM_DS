package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n75  reason: default package */
/* loaded from: classes.dex */
public enum n75 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.n75[] $VALUES = null;
    public static final defpackage.n75 CORE = null;
    public static final defpackage.n75 UNOFFICIAL = null;

    private static final /* synthetic */ defpackage.n75[] $values() {
            n75 r0 = defpackage.n75.CORE
            n75 r1 = defpackage.n75.UNOFFICIAL
            n75[] r0 = new defpackage.n75[]{r0, r1}
            return r0
    }

    static {
            n75 r0 = new n75
            java.lang.String r1 = "CORE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n75.CORE = r0
            n75 r0 = new n75
            java.lang.String r1 = "UNOFFICIAL"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n75.UNOFFICIAL = r0
            n75[] r0 = $values()
            defpackage.n75.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.n75.$ENTRIES = r0
            return
    }

    n75(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.n75.$ENTRIES
            return r0
    }

    public static defpackage.n75 valueOf(java.lang.String r1) {
            java.lang.Class<n75> r0 = defpackage.n75.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n75 r1 = (defpackage.n75) r1
            return r1
    }

    public static defpackage.n75[] values() {
            n75[] r0 = defpackage.n75.$VALUES
            java.lang.Object r0 = r0.clone()
            n75[] r0 = (defpackage.n75[]) r0
            return r0
    }
}
