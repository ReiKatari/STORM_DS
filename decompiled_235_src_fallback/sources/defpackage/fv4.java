package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv4  reason: default package */
/* loaded from: classes.dex */
public enum fv4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fv4[] $VALUES = null;
    public static final defpackage.fv4 ADDED = null;
    public static final defpackage.fv4 CLOSED = null;
    public static final defpackage.fv4 CONTEXT_MISMATCH = null;
    public static final defpackage.fv4 DUPLICATE_LEADERBOARD_ATTEMPT_ID = null;
    public static final defpackage.fv4 DUPLICATE_NATIVE_SUBMISSION_ID = null;
    public static final defpackage.fv4 DUPLICATE_SUBMISSION_ID = null;

    private static final /* synthetic */ defpackage.fv4[] $values() {
            fv4 r0 = defpackage.fv4.ADDED
            fv4 r1 = defpackage.fv4.DUPLICATE_SUBMISSION_ID
            fv4 r2 = defpackage.fv4.DUPLICATE_NATIVE_SUBMISSION_ID
            fv4 r3 = defpackage.fv4.DUPLICATE_LEADERBOARD_ATTEMPT_ID
            fv4 r4 = defpackage.fv4.CONTEXT_MISMATCH
            fv4 r5 = defpackage.fv4.CLOSED
            fv4[] r0 = new defpackage.fv4[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            fv4 r0 = new fv4
            java.lang.String r1 = "ADDED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fv4.ADDED = r0
            fv4 r0 = new fv4
            java.lang.String r1 = "DUPLICATE_SUBMISSION_ID"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fv4.DUPLICATE_SUBMISSION_ID = r0
            fv4 r0 = new fv4
            java.lang.String r1 = "DUPLICATE_NATIVE_SUBMISSION_ID"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.fv4.DUPLICATE_NATIVE_SUBMISSION_ID = r0
            fv4 r0 = new fv4
            java.lang.String r1 = "DUPLICATE_LEADERBOARD_ATTEMPT_ID"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.fv4.DUPLICATE_LEADERBOARD_ATTEMPT_ID = r0
            fv4 r0 = new fv4
            java.lang.String r1 = "CONTEXT_MISMATCH"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.fv4.CONTEXT_MISMATCH = r0
            fv4 r0 = new fv4
            java.lang.String r1 = "CLOSED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.fv4.CLOSED = r0
            fv4[] r0 = $values()
            defpackage.fv4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fv4.$ENTRIES = r0
            return
    }

    fv4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fv4.$ENTRIES
            return r0
    }

    public static defpackage.fv4 valueOf(java.lang.String r1) {
            java.lang.Class<fv4> r0 = defpackage.fv4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fv4 r1 = (defpackage.fv4) r1
            return r1
    }

    public static defpackage.fv4[] values() {
            fv4[] r0 = defpackage.fv4.$VALUES
            java.lang.Object r0 = r0.clone()
            fv4[] r0 = (defpackage.fv4[]) r0
            return r0
    }
}
