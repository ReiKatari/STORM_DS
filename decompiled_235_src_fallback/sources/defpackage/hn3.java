package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn3  reason: default package */
/* loaded from: classes.dex */
public enum hn3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.hn3[] $VALUES = null;
    public static final defpackage.hn3 Horizontal = null;
    public static final defpackage.hn3 Vertical = null;

    private static final /* synthetic */ defpackage.hn3[] $values() {
            hn3 r0 = defpackage.hn3.Horizontal
            hn3 r1 = defpackage.hn3.Vertical
            hn3[] r0 = new defpackage.hn3[]{r0, r1}
            return r0
    }

    static {
            hn3 r0 = new hn3
            java.lang.String r1 = "Horizontal"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.hn3.Horizontal = r0
            hn3 r0 = new hn3
            java.lang.String r1 = "Vertical"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.hn3.Vertical = r0
            hn3[] r0 = $values()
            defpackage.hn3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.hn3.$ENTRIES = r0
            return
    }

    hn3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.hn3.$ENTRIES
            return r0
    }

    public static defpackage.hn3 valueOf(java.lang.String r1) {
            java.lang.Class<hn3> r0 = defpackage.hn3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hn3 r1 = (defpackage.hn3) r1
            return r1
    }

    public static defpackage.hn3[] values() {
            hn3[] r0 = defpackage.hn3.$VALUES
            java.lang.Object r0 = r0.clone()
            hn3[] r0 = (defpackage.hn3[]) r0
            return r0
    }
}
