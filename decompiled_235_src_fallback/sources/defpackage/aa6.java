package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa6  reason: default package */
/* loaded from: classes.dex */
public enum aa6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.aa6[] $VALUES = null;
    public static final defpackage.aa6 INITIAL_SELECTION = null;
    public static final defpackage.aa6 SELECTED_BY_FALLBACK = null;
    public static final defpackage.aa6 SELECTED_BY_USER = null;

    private static final /* synthetic */ defpackage.aa6[] $values() {
            aa6 r0 = defpackage.aa6.INITIAL_SELECTION
            aa6 r1 = defpackage.aa6.SELECTED_BY_USER
            aa6 r2 = defpackage.aa6.SELECTED_BY_FALLBACK
            aa6[] r0 = new defpackage.aa6[]{r0, r1, r2}
            return r0
    }

    static {
            aa6 r0 = new aa6
            java.lang.String r1 = "INITIAL_SELECTION"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.aa6.INITIAL_SELECTION = r0
            aa6 r0 = new aa6
            java.lang.String r1 = "SELECTED_BY_USER"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.aa6.SELECTED_BY_USER = r0
            aa6 r0 = new aa6
            java.lang.String r1 = "SELECTED_BY_FALLBACK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.aa6.SELECTED_BY_FALLBACK = r0
            aa6[] r0 = $values()
            defpackage.aa6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.aa6.$ENTRIES = r0
            return
    }

    aa6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.aa6.$ENTRIES
            return r0
    }

    public static defpackage.aa6 valueOf(java.lang.String r1) {
            java.lang.Class<aa6> r0 = defpackage.aa6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            aa6 r1 = (defpackage.aa6) r1
            return r1
    }

    public static defpackage.aa6[] values() {
            aa6[] r0 = defpackage.aa6.$VALUES
            java.lang.Object r0 = r0.clone()
            aa6[] r0 = (defpackage.aa6[]) r0
            return r0
    }
}
