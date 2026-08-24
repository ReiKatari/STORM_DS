package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l34  reason: default package */
/* loaded from: classes.dex */
public enum l34 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.l34[] $VALUES = null;
    public static final defpackage.l34 Height = null;
    public static final defpackage.l34 Width = null;

    private static final /* synthetic */ defpackage.l34[] $values() {
            l34 r0 = defpackage.l34.Width
            l34 r1 = defpackage.l34.Height
            l34[] r0 = new defpackage.l34[]{r0, r1}
            return r0
    }

    static {
            l34 r0 = new l34
            java.lang.String r1 = "Width"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.l34.Width = r0
            l34 r0 = new l34
            java.lang.String r1 = "Height"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.l34.Height = r0
            l34[] r0 = $values()
            defpackage.l34.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.l34.$ENTRIES = r0
            return
    }

    l34(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.l34.$ENTRIES
            return r0
    }

    public static defpackage.l34 valueOf(java.lang.String r1) {
            java.lang.Class<l34> r0 = defpackage.l34.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l34 r1 = (defpackage.l34) r1
            return r1
    }

    public static defpackage.l34[] values() {
            l34[] r0 = defpackage.l34.$VALUES
            java.lang.Object r0 = r0.clone()
            l34[] r0 = (defpackage.l34[]) r0
            return r0
    }
}
