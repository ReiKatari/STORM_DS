package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch6  reason: default package */
/* loaded from: classes.dex */
public enum ch6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ch6[] $VALUES = null;
    public static final defpackage.ch6 START = null;
    public static final defpackage.ch6 STOP = null;
    public static final defpackage.ch6 STOP_AND_RESET_REPLAY_CACHE = null;

    private static final /* synthetic */ defpackage.ch6[] $values() {
            ch6 r0 = defpackage.ch6.START
            ch6 r1 = defpackage.ch6.STOP
            ch6 r2 = defpackage.ch6.STOP_AND_RESET_REPLAY_CACHE
            ch6[] r0 = new defpackage.ch6[]{r0, r1, r2}
            return r0
    }

    static {
            ch6 r0 = new ch6
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ch6.START = r0
            ch6 r0 = new ch6
            java.lang.String r1 = "STOP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ch6.STOP = r0
            ch6 r0 = new ch6
            java.lang.String r1 = "STOP_AND_RESET_REPLAY_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ch6.STOP_AND_RESET_REPLAY_CACHE = r0
            ch6[] r0 = $values()
            defpackage.ch6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ch6.$ENTRIES = r0
            return
    }

    ch6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ch6.$ENTRIES
            return r0
    }

    public static defpackage.ch6 valueOf(java.lang.String r1) {
            java.lang.Class<ch6> r0 = defpackage.ch6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ch6 r1 = (defpackage.ch6) r1
            return r1
    }

    public static defpackage.ch6[] values() {
            ch6[] r0 = defpackage.ch6.$VALUES
            java.lang.Object r0 = r0.clone()
            ch6[] r0 = (defpackage.ch6[]) r0
            return r0
    }
}
