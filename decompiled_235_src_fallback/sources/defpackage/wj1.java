package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj1  reason: default package */
/* loaded from: classes.dex */
public enum wj1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wj1[] $VALUES = null;
    public static final defpackage.wj1 Both = null;
    public static final defpackage.wj1 Horizontal = null;
    public static final defpackage.wj1 Vertical = null;

    private static final /* synthetic */ defpackage.wj1[] $values() {
            wj1 r0 = defpackage.wj1.Vertical
            wj1 r1 = defpackage.wj1.Horizontal
            wj1 r2 = defpackage.wj1.Both
            wj1[] r0 = new defpackage.wj1[]{r0, r1, r2}
            return r0
    }

    static {
            wj1 r0 = new wj1
            java.lang.String r1 = "Vertical"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wj1.Vertical = r0
            wj1 r0 = new wj1
            java.lang.String r1 = "Horizontal"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.wj1.Horizontal = r0
            wj1 r0 = new wj1
            java.lang.String r1 = "Both"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.wj1.Both = r0
            wj1[] r0 = $values()
            defpackage.wj1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wj1.$ENTRIES = r0
            return
    }

    wj1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wj1.$ENTRIES
            return r0
    }

    public static defpackage.wj1 valueOf(java.lang.String r1) {
            java.lang.Class<wj1> r0 = defpackage.wj1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wj1 r1 = (defpackage.wj1) r1
            return r1
    }

    public static defpackage.wj1[] values() {
            wj1[] r0 = defpackage.wj1.$VALUES
            java.lang.Object r0 = r0.clone()
            wj1[] r0 = (defpackage.wj1[]) r0
            return r0
    }
}
