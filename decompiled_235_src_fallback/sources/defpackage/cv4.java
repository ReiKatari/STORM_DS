package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv4  reason: default package */
/* loaded from: classes.dex */
public enum cv4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.cv4[] $VALUES = null;
    public static final defpackage.cv4 PERMANENT_FAILURE = null;
    public static final defpackage.cv4 RETRYABLE = null;

    private static final /* synthetic */ defpackage.cv4[] $values() {
            cv4 r0 = defpackage.cv4.RETRYABLE
            cv4 r1 = defpackage.cv4.PERMANENT_FAILURE
            cv4[] r0 = new defpackage.cv4[]{r0, r1}
            return r0
    }

    static {
            cv4 r0 = new cv4
            java.lang.String r1 = "RETRYABLE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.cv4.RETRYABLE = r0
            cv4 r0 = new cv4
            java.lang.String r1 = "PERMANENT_FAILURE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.cv4.PERMANENT_FAILURE = r0
            cv4[] r0 = $values()
            defpackage.cv4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.cv4.$ENTRIES = r0
            return
    }

    cv4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.cv4.$ENTRIES
            return r0
    }

    public static defpackage.cv4 valueOf(java.lang.String r1) {
            java.lang.Class<cv4> r0 = defpackage.cv4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cv4 r1 = (defpackage.cv4) r1
            return r1
    }

    public static defpackage.cv4[] values() {
            cv4[] r0 = defpackage.cv4.$VALUES
            java.lang.Object r0 = r0.clone()
            cv4[] r0 = (defpackage.cv4[]) r0
            return r0
    }
}
