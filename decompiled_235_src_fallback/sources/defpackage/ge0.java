package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge0  reason: default package */
/* loaded from: classes.dex */
public enum ge0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ge0[] $VALUES = null;
    public static final defpackage.ge0 INACTIVE = null;
    public static final defpackage.ge0 LOCKED_FOCUSED = null;
    public static final defpackage.ge0 LOCKED_NOT_FOCUSED = null;
    public static final defpackage.ge0 PASSIVE_FOCUSED = null;
    public static final defpackage.ge0 PASSIVE_NOT_FOCUSED = null;
    public static final defpackage.ge0 SCANNING = null;
    public static final defpackage.ge0 UNKNOWN = null;

    private static /* synthetic */ defpackage.ge0[] $values() {
            ge0 r0 = defpackage.ge0.UNKNOWN
            ge0 r1 = defpackage.ge0.INACTIVE
            ge0 r2 = defpackage.ge0.SCANNING
            ge0 r3 = defpackage.ge0.PASSIVE_FOCUSED
            ge0 r4 = defpackage.ge0.PASSIVE_NOT_FOCUSED
            ge0 r5 = defpackage.ge0.LOCKED_FOCUSED
            ge0 r6 = defpackage.ge0.LOCKED_NOT_FOCUSED
            ge0[] r0 = new defpackage.ge0[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            ge0 r0 = new ge0
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ge0.UNKNOWN = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "INACTIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ge0.INACTIVE = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "SCANNING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ge0.SCANNING = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "PASSIVE_FOCUSED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ge0.PASSIVE_FOCUSED = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "PASSIVE_NOT_FOCUSED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ge0.PASSIVE_NOT_FOCUSED = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "LOCKED_FOCUSED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.ge0.LOCKED_FOCUSED = r0
            ge0 r0 = new ge0
            java.lang.String r1 = "LOCKED_NOT_FOCUSED"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.ge0.LOCKED_NOT_FOCUSED = r0
            ge0[] r0 = $values()
            defpackage.ge0.$VALUES = r0
            return
    }

    ge0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ge0 valueOf(java.lang.String r1) {
            java.lang.Class<ge0> r0 = defpackage.ge0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ge0 r1 = (defpackage.ge0) r1
            return r1
    }

    public static defpackage.ge0[] values() {
            ge0[] r0 = defpackage.ge0.$VALUES
            java.lang.Object r0 = r0.clone()
            ge0[] r0 = (defpackage.ge0[]) r0
            return r0
    }
}
