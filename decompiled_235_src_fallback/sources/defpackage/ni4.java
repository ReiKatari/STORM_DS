package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni4  reason: default package */
/* loaded from: classes.dex */
public enum ni4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ni4[] $VALUES = null;
    public static final defpackage.ni4 DISABLED_NOT_LOGGED_IN = null;
    public static final defpackage.ni4 DISABLED_NO_CACHE = null;
    public static final defpackage.ni4 ENABLED = null;

    private static final /* synthetic */ defpackage.ni4[] $values() {
            ni4 r0 = defpackage.ni4.ENABLED
            ni4 r1 = defpackage.ni4.DISABLED_NOT_LOGGED_IN
            ni4 r2 = defpackage.ni4.DISABLED_NO_CACHE
            ni4[] r0 = new defpackage.ni4[]{r0, r1, r2}
            return r0
    }

    static {
            ni4 r0 = new ni4
            java.lang.String r1 = "ENABLED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ni4.ENABLED = r0
            ni4 r0 = new ni4
            java.lang.String r1 = "DISABLED_NOT_LOGGED_IN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ni4.DISABLED_NOT_LOGGED_IN = r0
            ni4 r0 = new ni4
            java.lang.String r1 = "DISABLED_NO_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ni4.DISABLED_NO_CACHE = r0
            ni4[] r0 = $values()
            defpackage.ni4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ni4.$ENTRIES = r0
            return
    }

    ni4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ni4.$ENTRIES
            return r0
    }

    public static defpackage.ni4 valueOf(java.lang.String r1) {
            java.lang.Class<ni4> r0 = defpackage.ni4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ni4 r1 = (defpackage.ni4) r1
            return r1
    }

    public static defpackage.ni4[] values() {
            ni4[] r0 = defpackage.ni4.$VALUES
            java.lang.Object r0 = r0.clone()
            ni4[] r0 = (defpackage.ni4[]) r0
            return r0
    }
}
