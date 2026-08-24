package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dg0  reason: default package */
/* loaded from: classes.dex */
public enum dg0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.dg0[] $VALUES = null;
    public static final defpackage.dg0 CLOSED = null;
    public static final defpackage.dg0 CLOSING = null;
    public static final defpackage.dg0 CONFIGURED = null;
    public static final defpackage.dg0 OPEN = null;
    public static final defpackage.dg0 OPENING = null;
    public static final defpackage.dg0 PENDING_OPEN = null;
    public static final defpackage.dg0 RELEASED = null;
    public static final defpackage.dg0 RELEASING = null;
    private final boolean mHoldsCameraSlot;

    private static /* synthetic */ defpackage.dg0[] $values() {
            dg0 r0 = defpackage.dg0.RELEASED
            dg0 r1 = defpackage.dg0.RELEASING
            dg0 r2 = defpackage.dg0.CLOSED
            dg0 r3 = defpackage.dg0.PENDING_OPEN
            dg0 r4 = defpackage.dg0.CLOSING
            dg0 r5 = defpackage.dg0.OPENING
            dg0 r6 = defpackage.dg0.OPEN
            dg0 r7 = defpackage.dg0.CONFIGURED
            dg0[] r0 = new defpackage.dg0[]{r0, r1, r2, r3, r4, r5, r6, r7}
            return r0
    }

    static {
            dg0 r0 = new dg0
            java.lang.String r1 = "RELEASED"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.dg0.RELEASED = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "RELEASING"
            r3 = 1
            r0.<init>(r1, r3, r3)
            defpackage.dg0.RELEASING = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "CLOSED"
            r4 = 2
            r0.<init>(r1, r4, r2)
            defpackage.dg0.CLOSED = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "PENDING_OPEN"
            r4 = 3
            r0.<init>(r1, r4, r2)
            defpackage.dg0.PENDING_OPEN = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "CLOSING"
            r2 = 4
            r0.<init>(r1, r2, r3)
            defpackage.dg0.CLOSING = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "OPENING"
            r2 = 5
            r0.<init>(r1, r2, r3)
            defpackage.dg0.OPENING = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "OPEN"
            r2 = 6
            r0.<init>(r1, r2, r3)
            defpackage.dg0.OPEN = r0
            dg0 r0 = new dg0
            java.lang.String r1 = "CONFIGURED"
            r2 = 7
            r0.<init>(r1, r2, r3)
            defpackage.dg0.CONFIGURED = r0
            dg0[] r0 = $values()
            defpackage.dg0.$VALUES = r0
            return
    }

    dg0(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mHoldsCameraSlot = r3
            return
    }

    public static defpackage.dg0 valueOf(java.lang.String r1) {
            java.lang.Class<dg0> r0 = defpackage.dg0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dg0 r1 = (defpackage.dg0) r1
            return r1
    }

    public static defpackage.dg0[] values() {
            dg0[] r0 = defpackage.dg0.$VALUES
            java.lang.Object r0 = r0.clone()
            dg0[] r0 = (defpackage.dg0[]) r0
            return r0
    }

    public boolean holdsCameraSlot() {
            r0 = this;
            boolean r0 = r0.mHoldsCameraSlot
            return r0
    }
}
