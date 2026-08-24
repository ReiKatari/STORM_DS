package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo5  reason: default package */
/* loaded from: classes.dex */
public enum xo5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xo5[] $VALUES = null;
    public static final defpackage.xo5 CorruptArchive = null;
    public static final defpackage.xo5 HttpError = null;
    public static final defpackage.xo5 NoNetwork = null;
    public static final defpackage.xo5 NotEnoughSpace = null;
    public static final defpackage.xo5 Truncated = null;

    private static final /* synthetic */ defpackage.xo5[] $values() {
            xo5 r0 = defpackage.xo5.NoNetwork
            xo5 r1 = defpackage.xo5.NotEnoughSpace
            xo5 r2 = defpackage.xo5.HttpError
            xo5 r3 = defpackage.xo5.Truncated
            xo5 r4 = defpackage.xo5.CorruptArchive
            xo5[] r0 = new defpackage.xo5[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            xo5 r0 = new xo5
            java.lang.String r1 = "NoNetwork"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xo5.NoNetwork = r0
            xo5 r0 = new xo5
            java.lang.String r1 = "NotEnoughSpace"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xo5.NotEnoughSpace = r0
            xo5 r0 = new xo5
            java.lang.String r1 = "HttpError"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xo5.HttpError = r0
            xo5 r0 = new xo5
            java.lang.String r1 = "Truncated"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.xo5.Truncated = r0
            xo5 r0 = new xo5
            java.lang.String r1 = "CorruptArchive"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.xo5.CorruptArchive = r0
            xo5[] r0 = $values()
            defpackage.xo5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xo5.$ENTRIES = r0
            return
    }

    xo5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xo5.$ENTRIES
            return r0
    }

    public static defpackage.xo5 valueOf(java.lang.String r1) {
            java.lang.Class<xo5> r0 = defpackage.xo5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xo5 r1 = (defpackage.xo5) r1
            return r1
    }

    public static defpackage.xo5[] values() {
            xo5[] r0 = defpackage.xo5.$VALUES
            java.lang.Object r0 = r0.clone()
            xo5[] r0 = (defpackage.xo5[]) r0
            return r0
    }
}
