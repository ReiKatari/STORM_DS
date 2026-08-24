package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc1  reason: default package */
/* loaded from: classes.dex */
public enum xc1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xc1[] $VALUES = null;
    public static final defpackage.xc1 CONFIRM = null;
    public static final defpackage.xc1 DECRYPTING = null;
    public static final defpackage.xc1 ERROR = null;
    public static final defpackage.xc1 SUCCESS = null;

    private static final /* synthetic */ defpackage.xc1[] $values() {
            xc1 r0 = defpackage.xc1.CONFIRM
            xc1 r1 = defpackage.xc1.DECRYPTING
            xc1 r2 = defpackage.xc1.SUCCESS
            xc1 r3 = defpackage.xc1.ERROR
            xc1[] r0 = new defpackage.xc1[]{r0, r1, r2, r3}
            return r0
    }

    static {
            xc1 r0 = new xc1
            java.lang.String r1 = "CONFIRM"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xc1.CONFIRM = r0
            xc1 r0 = new xc1
            java.lang.String r1 = "DECRYPTING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xc1.DECRYPTING = r0
            xc1 r0 = new xc1
            java.lang.String r1 = "SUCCESS"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xc1.SUCCESS = r0
            xc1 r0 = new xc1
            java.lang.String r1 = "ERROR"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.xc1.ERROR = r0
            xc1[] r0 = $values()
            defpackage.xc1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xc1.$ENTRIES = r0
            return
    }

    xc1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xc1.$ENTRIES
            return r0
    }

    public static defpackage.xc1 valueOf(java.lang.String r1) {
            java.lang.Class<xc1> r0 = defpackage.xc1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xc1 r1 = (defpackage.xc1) r1
            return r1
    }

    public static defpackage.xc1[] values() {
            xc1[] r0 = defpackage.xc1.$VALUES
            java.lang.Object r0 = r0.clone()
            xc1[] r0 = (defpackage.xc1[]) r0
            return r0
    }
}
