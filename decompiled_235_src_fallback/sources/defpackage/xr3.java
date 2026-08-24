package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr3  reason: default package */
/* loaded from: classes.dex */
public enum xr3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xr3[] $VALUES = null;
    public static final defpackage.xr3 NONE = null;
    public static final defpackage.xr3 PUBLICATION = null;
    public static final defpackage.xr3 SYNCHRONIZED = null;

    private static final /* synthetic */ defpackage.xr3[] $values() {
            xr3 r0 = defpackage.xr3.SYNCHRONIZED
            xr3 r1 = defpackage.xr3.PUBLICATION
            xr3 r2 = defpackage.xr3.NONE
            xr3[] r0 = new defpackage.xr3[]{r0, r1, r2}
            return r0
    }

    static {
            xr3 r0 = new xr3
            java.lang.String r1 = "SYNCHRONIZED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xr3.SYNCHRONIZED = r0
            xr3 r0 = new xr3
            java.lang.String r1 = "PUBLICATION"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xr3.PUBLICATION = r0
            xr3 r0 = new xr3
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xr3.NONE = r0
            xr3[] r0 = $values()
            defpackage.xr3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xr3.$ENTRIES = r0
            return
    }

    xr3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xr3.$ENTRIES
            return r0
    }

    public static defpackage.xr3 valueOf(java.lang.String r1) {
            java.lang.Class<xr3> r0 = defpackage.xr3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xr3 r1 = (defpackage.xr3) r1
            return r1
    }

    public static defpackage.xr3[] values() {
            xr3[] r0 = defpackage.xr3.$VALUES
            java.lang.Object r0 = r0.clone()
            xr3[] r0 = (defpackage.xr3[]) r0
            return r0
    }
}
