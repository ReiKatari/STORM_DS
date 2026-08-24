package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha  reason: default package */
/* loaded from: classes.dex */
public enum ha extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ha[] $VALUES = null;
    public static final defpackage.ha AmbiguousDriver = null;
    public static final defpackage.ha InvalidZip = null;
    public static final defpackage.ha NoDriver = null;
    public static final defpackage.ha NotZip = null;
    public static final defpackage.ha UnsupportedBuild = null;

    private static final /* synthetic */ defpackage.ha[] $values() {
            ha r0 = defpackage.ha.UnsupportedBuild
            ha r1 = defpackage.ha.NotZip
            ha r2 = defpackage.ha.InvalidZip
            ha r3 = defpackage.ha.NoDriver
            ha r4 = defpackage.ha.AmbiguousDriver
            ha[] r0 = new defpackage.ha[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            ha r0 = new ha
            java.lang.String r1 = "UnsupportedBuild"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ha.UnsupportedBuild = r0
            ha r0 = new ha
            java.lang.String r1 = "NotZip"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ha.NotZip = r0
            ha r0 = new ha
            java.lang.String r1 = "InvalidZip"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ha.InvalidZip = r0
            ha r0 = new ha
            java.lang.String r1 = "NoDriver"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ha.NoDriver = r0
            ha r0 = new ha
            java.lang.String r1 = "AmbiguousDriver"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ha.AmbiguousDriver = r0
            ha[] r0 = $values()
            defpackage.ha.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ha.$ENTRIES = r0
            return
    }

    ha(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ha.$ENTRIES
            return r0
    }

    public static defpackage.ha valueOf(java.lang.String r1) {
            java.lang.Class<ha> r0 = defpackage.ha.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ha r1 = (defpackage.ha) r1
            return r1
    }

    public static defpackage.ha[] values() {
            ha[] r0 = defpackage.ha.$VALUES
            java.lang.Object r0 = r0.clone()
            ha[] r0 = (defpackage.ha[]) r0
            return r0
    }
}
