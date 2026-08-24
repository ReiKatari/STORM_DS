package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fj0  reason: default package */
/* loaded from: classes.dex */
public enum fj0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.fj0[] $VALUES = null;
    public static final defpackage.fj0 INITIALIZED = null;
    public static final defpackage.fj0 INITIALIZING = null;
    public static final defpackage.fj0 INITIALIZING_ERROR = null;
    public static final defpackage.fj0 SHUTDOWN = null;
    public static final defpackage.fj0 UNINITIALIZED = null;

    private static /* synthetic */ defpackage.fj0[] $values() {
            fj0 r0 = defpackage.fj0.UNINITIALIZED
            fj0 r1 = defpackage.fj0.INITIALIZING
            fj0 r2 = defpackage.fj0.INITIALIZING_ERROR
            fj0 r3 = defpackage.fj0.INITIALIZED
            fj0 r4 = defpackage.fj0.SHUTDOWN
            fj0[] r0 = new defpackage.fj0[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            fj0 r0 = new fj0
            java.lang.String r1 = "UNINITIALIZED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fj0.UNINITIALIZED = r0
            fj0 r0 = new fj0
            java.lang.String r1 = "INITIALIZING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fj0.INITIALIZING = r0
            fj0 r0 = new fj0
            java.lang.String r1 = "INITIALIZING_ERROR"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.fj0.INITIALIZING_ERROR = r0
            fj0 r0 = new fj0
            java.lang.String r1 = "INITIALIZED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.fj0.INITIALIZED = r0
            fj0 r0 = new fj0
            java.lang.String r1 = "SHUTDOWN"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.fj0.SHUTDOWN = r0
            fj0[] r0 = $values()
            defpackage.fj0.$VALUES = r0
            return
    }

    fj0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.fj0 valueOf(java.lang.String r1) {
            java.lang.Class<fj0> r0 = defpackage.fj0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fj0 r1 = (defpackage.fj0) r1
            return r1
    }

    public static defpackage.fj0[] values() {
            fj0[] r0 = defpackage.fj0.$VALUES
            java.lang.Object r0 = r0.clone()
            fj0[] r0 = (defpackage.fj0[]) r0
            return r0
    }
}
