package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk3  reason: default package */
/* loaded from: classes.dex */
public enum dk3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.dk3[] $VALUES = null;
    public static final defpackage.dk3 CUSTOM = null;
    public static final defpackage.dk3 DEFAULT = null;

    private static final /* synthetic */ defpackage.dk3[] $values() {
            dk3 r0 = defpackage.dk3.DEFAULT
            dk3 r1 = defpackage.dk3.CUSTOM
            dk3[] r0 = new defpackage.dk3[]{r0, r1}
            return r0
    }

    static {
            dk3 r0 = new dk3
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.dk3.DEFAULT = r0
            dk3 r0 = new dk3
            java.lang.String r1 = "CUSTOM"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.dk3.CUSTOM = r0
            dk3[] r0 = $values()
            defpackage.dk3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.dk3.$ENTRIES = r0
            return
    }

    dk3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.dk3.$ENTRIES
            return r0
    }

    public static defpackage.dk3 valueOf(java.lang.String r1) {
            java.lang.Class<dk3> r0 = defpackage.dk3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dk3 r1 = (defpackage.dk3) r1
            return r1
    }

    public static defpackage.dk3[] values() {
            dk3[] r0 = defpackage.dk3.$VALUES
            java.lang.Object r0 = r0.clone()
            dk3[] r0 = (defpackage.dk3[]) r0
            return r0
    }
}
