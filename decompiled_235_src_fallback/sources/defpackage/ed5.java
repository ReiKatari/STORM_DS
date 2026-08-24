package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed5  reason: default package */
/* loaded from: classes.dex */
public enum ed5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ed5[] $VALUES = null;
    public static final defpackage.ed5 REOPEN_PAUSE_MENU = null;
    public static final defpackage.ed5 REOPEN_TERMINAL_EXIT = null;
    public static final defpackage.ed5 RESUME_SESSION = null;

    private static final /* synthetic */ defpackage.ed5[] $values() {
            ed5 r0 = defpackage.ed5.REOPEN_PAUSE_MENU
            ed5 r1 = defpackage.ed5.RESUME_SESSION
            ed5 r2 = defpackage.ed5.REOPEN_TERMINAL_EXIT
            ed5[] r0 = new defpackage.ed5[]{r0, r1, r2}
            return r0
    }

    static {
            ed5 r0 = new ed5
            java.lang.String r1 = "REOPEN_PAUSE_MENU"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ed5.REOPEN_PAUSE_MENU = r0
            ed5 r0 = new ed5
            java.lang.String r1 = "RESUME_SESSION"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ed5.RESUME_SESSION = r0
            ed5 r0 = new ed5
            java.lang.String r1 = "REOPEN_TERMINAL_EXIT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ed5.REOPEN_TERMINAL_EXIT = r0
            ed5[] r0 = $values()
            defpackage.ed5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ed5.$ENTRIES = r0
            return
    }

    ed5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ed5.$ENTRIES
            return r0
    }

    public static defpackage.ed5 valueOf(java.lang.String r1) {
            java.lang.Class<ed5> r0 = defpackage.ed5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ed5 r1 = (defpackage.ed5) r1
            return r1
    }

    public static defpackage.ed5[] values() {
            ed5[] r0 = defpackage.ed5.$VALUES
            java.lang.Object r0 = r0.clone()
            ed5[] r0 = (defpackage.ed5[]) r0
            return r0
    }
}
