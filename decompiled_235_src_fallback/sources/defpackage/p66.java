package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p66  reason: default package */
/* loaded from: classes.dex */
public enum p66 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.p66[] $VALUES = null;
    public static final defpackage.p66 BOTTOM = null;
    public static final defpackage.p66 CENTER = null;
    public static final defpackage.p66 TOP = null;

    private static final /* synthetic */ defpackage.p66[] $values() {
            p66 r0 = defpackage.p66.TOP
            p66 r1 = defpackage.p66.CENTER
            p66 r2 = defpackage.p66.BOTTOM
            p66[] r0 = new defpackage.p66[]{r0, r1, r2}
            return r0
    }

    static {
            p66 r0 = new p66
            java.lang.String r1 = "TOP"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.p66.TOP = r0
            p66 r0 = new p66
            java.lang.String r1 = "CENTER"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.p66.CENTER = r0
            p66 r0 = new p66
            java.lang.String r1 = "BOTTOM"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.p66.BOTTOM = r0
            p66[] r0 = $values()
            defpackage.p66.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.p66.$ENTRIES = r0
            return
    }

    p66(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.p66.$ENTRIES
            return r0
    }

    public static defpackage.p66 valueOf(java.lang.String r1) {
            java.lang.Class<p66> r0 = defpackage.p66.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            p66 r1 = (defpackage.p66) r1
            return r1
    }

    public static defpackage.p66[] values() {
            p66[] r0 = defpackage.p66.$VALUES
            java.lang.Object r0 = r0.clone()
            p66[] r0 = (defpackage.p66[]) r0
            return r0
    }
}
