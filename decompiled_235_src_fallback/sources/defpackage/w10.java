package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w10  reason: default package */
/* loaded from: classes.dex */
public enum w10 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.w10[] $VALUES = null;
    public static final defpackage.w10 EXPONENTIAL = null;
    public static final defpackage.w10 LINEAR = null;

    private static final /* synthetic */ defpackage.w10[] $values() {
            w10 r0 = defpackage.w10.EXPONENTIAL
            w10 r1 = defpackage.w10.LINEAR
            w10[] r0 = new defpackage.w10[]{r0, r1}
            return r0
    }

    static {
            w10 r0 = new w10
            java.lang.String r1 = "EXPONENTIAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.w10.EXPONENTIAL = r0
            w10 r0 = new w10
            java.lang.String r1 = "LINEAR"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.w10.LINEAR = r0
            w10[] r0 = $values()
            defpackage.w10.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.w10.$ENTRIES = r0
            return
    }

    w10(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.w10.$ENTRIES
            return r0
    }

    public static defpackage.w10 valueOf(java.lang.String r1) {
            java.lang.Class<w10> r0 = defpackage.w10.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            w10 r1 = (defpackage.w10) r1
            return r1
    }

    public static defpackage.w10[] values() {
            w10[] r0 = defpackage.w10.$VALUES
            java.lang.Object r0 = r0.clone()
            w10[] r0 = (defpackage.w10[]) r0
            return r0
    }
}
