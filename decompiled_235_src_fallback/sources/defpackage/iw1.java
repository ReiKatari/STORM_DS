package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw1  reason: default package */
/* loaded from: classes.dex */
public enum iw1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.iw1[] $VALUES = null;
    public static final defpackage.iw1 BadExceptionRegion = null;
    public static final defpackage.iw1 GBAModeNotSupported = null;
    public static final defpackage.iw1 PowerOff = null;

    private static final /* synthetic */ defpackage.iw1[] $values() {
            iw1 r0 = defpackage.iw1.GBAModeNotSupported
            iw1 r1 = defpackage.iw1.BadExceptionRegion
            iw1 r2 = defpackage.iw1.PowerOff
            iw1[] r0 = new defpackage.iw1[]{r0, r1, r2}
            return r0
    }

    static {
            iw1 r0 = new iw1
            java.lang.String r1 = "GBAModeNotSupported"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.iw1.GBAModeNotSupported = r0
            iw1 r0 = new iw1
            java.lang.String r1 = "BadExceptionRegion"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.iw1.BadExceptionRegion = r0
            iw1 r0 = new iw1
            java.lang.String r1 = "PowerOff"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.iw1.PowerOff = r0
            iw1[] r0 = $values()
            defpackage.iw1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.iw1.$ENTRIES = r0
            return
    }

    iw1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.iw1.$ENTRIES
            return r0
    }

    public static defpackage.iw1 valueOf(java.lang.String r1) {
            java.lang.Class<iw1> r0 = defpackage.iw1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            iw1 r1 = (defpackage.iw1) r1
            return r1
    }

    public static defpackage.iw1[] values() {
            iw1[] r0 = defpackage.iw1.$VALUES
            java.lang.Object r0 = r0.clone()
            iw1[] r0 = (defpackage.iw1[]) r0
            return r0
    }
}
