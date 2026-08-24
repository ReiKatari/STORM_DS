package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m80  reason: default package */
/* loaded from: classes.dex */
public enum m80 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.m80[] $VALUES = null;
    public static final defpackage.m80 DROP_LATEST = null;
    public static final defpackage.m80 DROP_OLDEST = null;
    public static final defpackage.m80 SUSPEND = null;

    private static final /* synthetic */ defpackage.m80[] $values() {
            m80 r0 = defpackage.m80.SUSPEND
            m80 r1 = defpackage.m80.DROP_OLDEST
            m80 r2 = defpackage.m80.DROP_LATEST
            m80[] r0 = new defpackage.m80[]{r0, r1, r2}
            return r0
    }

    static {
            m80 r0 = new m80
            java.lang.String r1 = "SUSPEND"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.m80.SUSPEND = r0
            m80 r0 = new m80
            java.lang.String r1 = "DROP_OLDEST"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.m80.DROP_OLDEST = r0
            m80 r0 = new m80
            java.lang.String r1 = "DROP_LATEST"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.m80.DROP_LATEST = r0
            m80[] r0 = $values()
            defpackage.m80.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.m80.$ENTRIES = r0
            return
    }

    m80(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.m80.$ENTRIES
            return r0
    }

    public static defpackage.m80 valueOf(java.lang.String r1) {
            java.lang.Class<m80> r0 = defpackage.m80.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m80 r1 = (defpackage.m80) r1
            return r1
    }

    public static defpackage.m80[] values() {
            m80[] r0 = defpackage.m80.$VALUES
            java.lang.Object r0 = r0.clone()
            m80[] r0 = (defpackage.m80[]) r0
            return r0
    }
}
