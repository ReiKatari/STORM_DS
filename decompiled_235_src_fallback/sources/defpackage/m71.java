package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m71  reason: default package */
/* loaded from: classes.dex */
public enum m71 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.m71[] $VALUES = null;
    public static final defpackage.m71 COLLAPSED = null;
    public static final defpackage.m71 CROSSED = null;
    public static final defpackage.m71 NOT_CROSSED = null;

    private static final /* synthetic */ defpackage.m71[] $values() {
            m71 r0 = defpackage.m71.CROSSED
            m71 r1 = defpackage.m71.NOT_CROSSED
            m71 r2 = defpackage.m71.COLLAPSED
            m71[] r0 = new defpackage.m71[]{r0, r1, r2}
            return r0
    }

    static {
            m71 r0 = new m71
            java.lang.String r1 = "CROSSED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.m71.CROSSED = r0
            m71 r0 = new m71
            java.lang.String r1 = "NOT_CROSSED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.m71.NOT_CROSSED = r0
            m71 r0 = new m71
            java.lang.String r1 = "COLLAPSED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.m71.COLLAPSED = r0
            m71[] r0 = $values()
            defpackage.m71.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.m71.$ENTRIES = r0
            return
    }

    m71(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.m71.$ENTRIES
            return r0
    }

    public static defpackage.m71 valueOf(java.lang.String r1) {
            java.lang.Class<m71> r0 = defpackage.m71.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m71 r1 = (defpackage.m71) r1
            return r1
    }

    public static defpackage.m71[] values() {
            m71[] r0 = defpackage.m71.$VALUES
            java.lang.Object r0 = r0.clone()
            m71[] r0 = (defpackage.m71[]) r0
            return r0
    }
}
