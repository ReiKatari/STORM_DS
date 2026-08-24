package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie0  reason: default package */
/* loaded from: classes.dex */
public enum ie0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ie0[] $VALUES = null;
    public static final defpackage.ie0 FIRED = null;
    public static final defpackage.ie0 NONE = null;
    public static final defpackage.ie0 READY = null;
    public static final defpackage.ie0 UNKNOWN = null;

    private static /* synthetic */ defpackage.ie0[] $values() {
            ie0 r0 = defpackage.ie0.UNKNOWN
            ie0 r1 = defpackage.ie0.NONE
            ie0 r2 = defpackage.ie0.READY
            ie0 r3 = defpackage.ie0.FIRED
            ie0[] r0 = new defpackage.ie0[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ie0 r0 = new ie0
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ie0.UNKNOWN = r0
            ie0 r0 = new ie0
            java.lang.String r1 = "NONE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ie0.NONE = r0
            ie0 r0 = new ie0
            java.lang.String r1 = "READY"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ie0.READY = r0
            ie0 r0 = new ie0
            java.lang.String r1 = "FIRED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ie0.FIRED = r0
            ie0[] r0 = $values()
            defpackage.ie0.$VALUES = r0
            return
    }

    ie0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ie0 valueOf(java.lang.String r1) {
            java.lang.Class<ie0> r0 = defpackage.ie0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ie0 r1 = (defpackage.ie0) r1
            return r1
    }

    public static defpackage.ie0[] values() {
            ie0[] r0 = defpackage.ie0.$VALUES
            java.lang.Object r0 = r0.clone()
            ie0[] r0 = (defpackage.ie0[]) r0
            return r0
    }

    public int toFlashState() {
            r3 = this;
            int r3 = r3.ordinal()
            r0 = 2
            r1 = 1
            if (r3 == r1) goto L11
            r2 = 3
            if (r3 == r0) goto L10
            if (r3 == r2) goto Lf
            r3 = 0
            return r3
        Lf:
            return r1
        L10:
            return r2
        L11:
            return r0
    }
}
