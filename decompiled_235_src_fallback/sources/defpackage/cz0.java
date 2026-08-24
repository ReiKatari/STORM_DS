package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz0  reason: default package */
/* loaded from: classes.dex */
public enum cz0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.cz0[] $VALUES = null;
    public static final defpackage.cz0 INVALID = null;
    public static final defpackage.cz0 UNSET = null;
    public static final defpackage.cz0 VALID = null;

    private static final /* synthetic */ defpackage.cz0[] $values() {
            cz0 r0 = defpackage.cz0.UNSET
            cz0 r1 = defpackage.cz0.INVALID
            cz0 r2 = defpackage.cz0.VALID
            cz0[] r0 = new defpackage.cz0[]{r0, r1, r2}
            return r0
    }

    static {
            cz0 r0 = new cz0
            java.lang.String r1 = "UNSET"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.cz0.UNSET = r0
            cz0 r0 = new cz0
            java.lang.String r1 = "INVALID"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.cz0.INVALID = r0
            cz0 r0 = new cz0
            java.lang.String r1 = "VALID"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.cz0.VALID = r0
            cz0[] r0 = $values()
            defpackage.cz0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.cz0.$ENTRIES = r0
            return
    }

    cz0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.cz0.$ENTRIES
            return r0
    }

    public static defpackage.cz0 valueOf(java.lang.String r1) {
            java.lang.Class<cz0> r0 = defpackage.cz0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cz0 r1 = (defpackage.cz0) r1
            return r1
    }

    public static defpackage.cz0[] values() {
            cz0[] r0 = defpackage.cz0.$VALUES
            java.lang.Object r0 = r0.clone()
            cz0[] r0 = (defpackage.cz0[]) r0
            return r0
    }
}
