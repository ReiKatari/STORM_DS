package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn3  reason: default package */
/* loaded from: classes.dex */
public enum sn3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.sn3[] $VALUES = null;
    public static final defpackage.sn3 MAIN_SCREEN = null;
    public static final defpackage.sn3 SECONDARY_SCREEN = null;

    private static final /* synthetic */ defpackage.sn3[] $values() {
            sn3 r0 = defpackage.sn3.MAIN_SCREEN
            sn3 r1 = defpackage.sn3.SECONDARY_SCREEN
            sn3[] r0 = new defpackage.sn3[]{r0, r1}
            return r0
    }

    static {
            sn3 r0 = new sn3
            java.lang.String r1 = "MAIN_SCREEN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sn3.MAIN_SCREEN = r0
            sn3 r0 = new sn3
            java.lang.String r1 = "SECONDARY_SCREEN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.sn3.SECONDARY_SCREEN = r0
            sn3[] r0 = $values()
            defpackage.sn3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.sn3.$ENTRIES = r0
            return
    }

    sn3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.sn3.$ENTRIES
            return r0
    }

    public static defpackage.sn3 valueOf(java.lang.String r1) {
            java.lang.Class<sn3> r0 = defpackage.sn3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sn3 r1 = (defpackage.sn3) r1
            return r1
    }

    public static defpackage.sn3[] values() {
            sn3[] r0 = defpackage.sn3.$VALUES
            java.lang.Object r0 = r0.clone()
            sn3[] r0 = (defpackage.sn3[]) r0
            return r0
    }
}
