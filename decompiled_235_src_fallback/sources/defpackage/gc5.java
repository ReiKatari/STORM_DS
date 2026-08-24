package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc5  reason: default package */
/* loaded from: classes.dex */
public enum gc5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.gc5[] $VALUES = null;
    public static final defpackage.gc5 ACCEPTED = null;
    public static final defpackage.gc5 ALREADY_ACCEPTED = null;
    public static final defpackage.fc5 Companion = null;
    public static final defpackage.gc5 PERMANENT_FAILURE = null;
    public static final defpackage.gc5 RETRYABLE_FAILURE = null;
    private final int wireValue;

    private static final /* synthetic */ defpackage.gc5[] $values() {
            gc5 r0 = defpackage.gc5.ACCEPTED
            gc5 r1 = defpackage.gc5.ALREADY_ACCEPTED
            gc5 r2 = defpackage.gc5.PERMANENT_FAILURE
            gc5 r3 = defpackage.gc5.RETRYABLE_FAILURE
            gc5[] r0 = new defpackage.gc5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            gc5 r0 = new gc5
            java.lang.String r1 = "ACCEPTED"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            defpackage.gc5.ACCEPTED = r0
            gc5 r0 = new gc5
            java.lang.String r1 = "ALREADY_ACCEPTED"
            r2 = 2
            r0.<init>(r1, r3, r2)
            defpackage.gc5.ALREADY_ACCEPTED = r0
            gc5 r0 = new gc5
            java.lang.String r1 = "PERMANENT_FAILURE"
            r3 = 3
            r0.<init>(r1, r2, r3)
            defpackage.gc5.PERMANENT_FAILURE = r0
            gc5 r0 = new gc5
            java.lang.String r1 = "RETRYABLE_FAILURE"
            r2 = 4
            r0.<init>(r1, r3, r2)
            defpackage.gc5.RETRYABLE_FAILURE = r0
            gc5[] r0 = $values()
            defpackage.gc5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.gc5.$ENTRIES = r0
            fc5 r0 = new fc5
            r0.<init>()
            defpackage.gc5.Companion = r0
            return
    }

    gc5(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.wireValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.gc5.$ENTRIES
            return r0
    }

    public static defpackage.gc5 valueOf(java.lang.String r1) {
            java.lang.Class<gc5> r0 = defpackage.gc5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gc5 r1 = (defpackage.gc5) r1
            return r1
    }

    public static defpackage.gc5[] values() {
            gc5[] r0 = defpackage.gc5.$VALUES
            java.lang.Object r0 = r0.clone()
            gc5[] r0 = (defpackage.gc5[]) r0
            return r0
    }

    public final int getWireValue() {
            r0 = this;
            int r0 = r0.wireValue
            return r0
    }
}
