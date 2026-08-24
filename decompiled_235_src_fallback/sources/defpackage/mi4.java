package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi4  reason: default package */
/* loaded from: classes.dex */
public enum mi4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mi4[] $VALUES = null;
    public static final defpackage.mi4 CONTINUE_OFFLINE = null;
    public static final defpackage.mi4 SYNC_NOW = null;

    private static final /* synthetic */ defpackage.mi4[] $values() {
            mi4 r0 = defpackage.mi4.SYNC_NOW
            mi4 r1 = defpackage.mi4.CONTINUE_OFFLINE
            mi4[] r0 = new defpackage.mi4[]{r0, r1}
            return r0
    }

    static {
            mi4 r0 = new mi4
            java.lang.String r1 = "SYNC_NOW"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mi4.SYNC_NOW = r0
            mi4 r0 = new mi4
            java.lang.String r1 = "CONTINUE_OFFLINE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.mi4.CONTINUE_OFFLINE = r0
            mi4[] r0 = $values()
            defpackage.mi4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mi4.$ENTRIES = r0
            return
    }

    mi4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mi4.$ENTRIES
            return r0
    }

    public static defpackage.mi4 valueOf(java.lang.String r1) {
            java.lang.Class<mi4> r0 = defpackage.mi4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mi4 r1 = (defpackage.mi4) r1
            return r1
    }

    public static defpackage.mi4[] values() {
            mi4[] r0 = defpackage.mi4.$VALUES
            java.lang.Object r0 = r0.clone()
            mi4[] r0 = (defpackage.mi4[]) r0
            return r0
    }
}
