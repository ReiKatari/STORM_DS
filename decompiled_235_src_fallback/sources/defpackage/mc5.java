package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc5  reason: default package */
/* loaded from: classes.dex */
public enum mc5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mc5[] $VALUES = null;
    public static final defpackage.mc5 RESUMABLE_SESSION = null;
    public static final defpackage.mc5 TERMINAL_STOP = null;

    private static final /* synthetic */ defpackage.mc5[] $values() {
            mc5 r0 = defpackage.mc5.RESUMABLE_SESSION
            mc5 r1 = defpackage.mc5.TERMINAL_STOP
            mc5[] r0 = new defpackage.mc5[]{r0, r1}
            return r0
    }

    static {
            mc5 r0 = new mc5
            java.lang.String r1 = "RESUMABLE_SESSION"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mc5.RESUMABLE_SESSION = r0
            mc5 r0 = new mc5
            java.lang.String r1 = "TERMINAL_STOP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.mc5.TERMINAL_STOP = r0
            mc5[] r0 = $values()
            defpackage.mc5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mc5.$ENTRIES = r0
            return
    }

    mc5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mc5.$ENTRIES
            return r0
    }

    public static defpackage.mc5 valueOf(java.lang.String r1) {
            java.lang.Class<mc5> r0 = defpackage.mc5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mc5 r1 = (defpackage.mc5) r1
            return r1
    }

    public static defpackage.mc5[] values() {
            mc5[] r0 = defpackage.mc5.$VALUES
            java.lang.Object r0 = r0.clone()
            mc5[] r0 = (defpackage.mc5[]) r0
            return r0
    }
}
