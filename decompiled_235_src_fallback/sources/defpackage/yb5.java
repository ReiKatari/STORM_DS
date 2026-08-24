package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb5  reason: default package */
/* loaded from: classes.dex */
public enum yb5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.yb5[] $VALUES = null;
    public static final defpackage.yb5 AUTHENTICATION_CLEAR = null;
    public static final defpackage.yb5 IDENTITY_VERIFICATION = null;
    public static final defpackage.yb5 KOTLIN_DISCARD = null;
    public static final defpackage.yb5 NATIVE_DISCARD = null;
    public static final defpackage.yb5 PENDING_VERIFICATION = null;
    public static final defpackage.yb5 RUNTIME_TERMINATION = null;
    public static final defpackage.yb5 SESSION_CLOSE = null;
    public static final defpackage.yb5 TERMINAL_COMMIT = null;
    public static final defpackage.yb5 TRANSPORT_SUSPENSION = null;

    private static final /* synthetic */ defpackage.yb5[] $values() {
            yb5 r0 = defpackage.yb5.TRANSPORT_SUSPENSION
            yb5 r1 = defpackage.yb5.IDENTITY_VERIFICATION
            yb5 r2 = defpackage.yb5.PENDING_VERIFICATION
            yb5 r3 = defpackage.yb5.TERMINAL_COMMIT
            yb5 r4 = defpackage.yb5.NATIVE_DISCARD
            yb5 r5 = defpackage.yb5.KOTLIN_DISCARD
            yb5 r6 = defpackage.yb5.RUNTIME_TERMINATION
            yb5 r7 = defpackage.yb5.AUTHENTICATION_CLEAR
            yb5 r8 = defpackage.yb5.SESSION_CLOSE
            yb5[] r0 = new defpackage.yb5[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            return r0
    }

    static {
            yb5 r0 = new yb5
            java.lang.String r1 = "TRANSPORT_SUSPENSION"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yb5.TRANSPORT_SUSPENSION = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "IDENTITY_VERIFICATION"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.yb5.IDENTITY_VERIFICATION = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "PENDING_VERIFICATION"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.yb5.PENDING_VERIFICATION = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "TERMINAL_COMMIT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.yb5.TERMINAL_COMMIT = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "NATIVE_DISCARD"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.yb5.NATIVE_DISCARD = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "KOTLIN_DISCARD"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.yb5.KOTLIN_DISCARD = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "RUNTIME_TERMINATION"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.yb5.RUNTIME_TERMINATION = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "AUTHENTICATION_CLEAR"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.yb5.AUTHENTICATION_CLEAR = r0
            yb5 r0 = new yb5
            java.lang.String r1 = "SESSION_CLOSE"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.yb5.SESSION_CLOSE = r0
            yb5[] r0 = $values()
            defpackage.yb5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.yb5.$ENTRIES = r0
            return
    }

    yb5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.yb5.$ENTRIES
            return r0
    }

    public static defpackage.yb5 valueOf(java.lang.String r1) {
            java.lang.Class<yb5> r0 = defpackage.yb5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yb5 r1 = (defpackage.yb5) r1
            return r1
    }

    public static defpackage.yb5[] values() {
            yb5[] r0 = defpackage.yb5.$VALUES
            java.lang.Object r0 = r0.clone()
            yb5[] r0 = (defpackage.yb5[]) r0
            return r0
    }
}
