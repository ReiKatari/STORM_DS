package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh0  reason: default package */
/* loaded from: classes.dex */
public enum nh0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.nh0[] $VALUES = null;
    public static final defpackage.nh0 CLOSED = null;
    public static final defpackage.nh0 CLOSING = null;
    public static final defpackage.nh0 OPEN = null;
    public static final defpackage.nh0 OPENING = null;
    public static final defpackage.nh0 PENDING_OPEN = null;

    private static /* synthetic */ defpackage.nh0[] $values() {
            nh0 r0 = defpackage.nh0.PENDING_OPEN
            nh0 r1 = defpackage.nh0.OPENING
            nh0 r2 = defpackage.nh0.OPEN
            nh0 r3 = defpackage.nh0.CLOSING
            nh0 r4 = defpackage.nh0.CLOSED
            nh0[] r0 = new defpackage.nh0[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            nh0 r0 = new nh0
            java.lang.String r1 = "PENDING_OPEN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.nh0.PENDING_OPEN = r0
            nh0 r0 = new nh0
            java.lang.String r1 = "OPENING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.nh0.OPENING = r0
            nh0 r0 = new nh0
            java.lang.String r1 = "OPEN"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.nh0.OPEN = r0
            nh0 r0 = new nh0
            java.lang.String r1 = "CLOSING"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.nh0.CLOSING = r0
            nh0 r0 = new nh0
            java.lang.String r1 = "CLOSED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.nh0.CLOSED = r0
            nh0[] r0 = $values()
            defpackage.nh0.$VALUES = r0
            return
    }

    nh0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.nh0 valueOf(java.lang.String r1) {
            java.lang.Class<nh0> r0 = defpackage.nh0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nh0 r1 = (defpackage.nh0) r1
            return r1
    }

    public static defpackage.nh0[] values() {
            nh0[] r0 = defpackage.nh0.$VALUES
            java.lang.Object r0 = r0.clone()
            nh0[] r0 = (defpackage.nh0[]) r0
            return r0
    }
}
