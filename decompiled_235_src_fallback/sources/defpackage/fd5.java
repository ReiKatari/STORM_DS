package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd5  reason: default package */
/* loaded from: classes.dex */
public enum fd5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fd5[] $VALUES = null;
    public static final defpackage.fd5 BEFORE_ONLINE_SUBMISSION = null;
    public static final defpackage.fd5 EXIT_DIALOG = null;
    public static final defpackage.fd5 PAUSE_MENU = null;
    public static final defpackage.fd5 RUNTIME_RECONNECTED = null;

    private static final /* synthetic */ defpackage.fd5[] $values() {
            fd5 r0 = defpackage.fd5.RUNTIME_RECONNECTED
            fd5 r1 = defpackage.fd5.PAUSE_MENU
            fd5 r2 = defpackage.fd5.EXIT_DIALOG
            fd5 r3 = defpackage.fd5.BEFORE_ONLINE_SUBMISSION
            fd5[] r0 = new defpackage.fd5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            fd5 r0 = new fd5
            java.lang.String r1 = "RUNTIME_RECONNECTED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fd5.RUNTIME_RECONNECTED = r0
            fd5 r0 = new fd5
            java.lang.String r1 = "PAUSE_MENU"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fd5.PAUSE_MENU = r0
            fd5 r0 = new fd5
            java.lang.String r1 = "EXIT_DIALOG"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.fd5.EXIT_DIALOG = r0
            fd5 r0 = new fd5
            java.lang.String r1 = "BEFORE_ONLINE_SUBMISSION"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.fd5.BEFORE_ONLINE_SUBMISSION = r0
            fd5[] r0 = $values()
            defpackage.fd5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fd5.$ENTRIES = r0
            return
    }

    fd5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fd5.$ENTRIES
            return r0
    }

    public static defpackage.fd5 valueOf(java.lang.String r1) {
            java.lang.Class<fd5> r0 = defpackage.fd5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fd5 r1 = (defpackage.fd5) r1
            return r1
    }

    public static defpackage.fd5[] values() {
            fd5[] r0 = defpackage.fd5.$VALUES
            java.lang.Object r0 = r0.clone()
            fd5[] r0 = (defpackage.fd5[]) r0
            return r0
    }
}
