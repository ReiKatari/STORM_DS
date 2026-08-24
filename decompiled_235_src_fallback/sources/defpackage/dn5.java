package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn5  reason: default package */
/* loaded from: classes.dex */
public enum dn5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.dn5[] $VALUES = null;
    public static final defpackage.dn5 OFFICIAL = null;
    public static final defpackage.dn5 RA_OFFLINE_PROXY = null;
    public static final defpackage.dn5 RA_OFFLINE_PROXY_UNAVAILABLE = null;

    private static final /* synthetic */ defpackage.dn5[] $values() {
            dn5 r0 = defpackage.dn5.OFFICIAL
            dn5 r1 = defpackage.dn5.RA_OFFLINE_PROXY
            dn5 r2 = defpackage.dn5.RA_OFFLINE_PROXY_UNAVAILABLE
            dn5[] r0 = new defpackage.dn5[]{r0, r1, r2}
            return r0
    }

    static {
            dn5 r0 = new dn5
            java.lang.String r1 = "OFFICIAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.dn5.OFFICIAL = r0
            dn5 r0 = new dn5
            java.lang.String r1 = "RA_OFFLINE_PROXY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.dn5.RA_OFFLINE_PROXY = r0
            dn5 r0 = new dn5
            java.lang.String r1 = "RA_OFFLINE_PROXY_UNAVAILABLE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.dn5.RA_OFFLINE_PROXY_UNAVAILABLE = r0
            dn5[] r0 = $values()
            defpackage.dn5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.dn5.$ENTRIES = r0
            return
    }

    dn5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.dn5.$ENTRIES
            return r0
    }

    public static defpackage.dn5 valueOf(java.lang.String r1) {
            java.lang.Class<dn5> r0 = defpackage.dn5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dn5 r1 = (defpackage.dn5) r1
            return r1
    }

    public static defpackage.dn5[] values() {
            dn5[] r0 = defpackage.dn5.$VALUES
            java.lang.Object r0 = r0.clone()
            dn5[] r0 = (defpackage.dn5[]) r0
            return r0
    }
}
