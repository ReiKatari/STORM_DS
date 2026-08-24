package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig4  reason: default package */
/* loaded from: classes.dex */
public enum ig4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ig4[] $VALUES = null;
    public static final defpackage.ig4 Height = null;
    public static final defpackage.ig4 Width = null;

    private static final /* synthetic */ defpackage.ig4[] $values() {
            ig4 r0 = defpackage.ig4.Width
            ig4 r1 = defpackage.ig4.Height
            ig4[] r0 = new defpackage.ig4[]{r0, r1}
            return r0
    }

    static {
            ig4 r0 = new ig4
            java.lang.String r1 = "Width"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ig4.Width = r0
            ig4 r0 = new ig4
            java.lang.String r1 = "Height"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ig4.Height = r0
            ig4[] r0 = $values()
            defpackage.ig4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ig4.$ENTRIES = r0
            return
    }

    ig4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ig4.$ENTRIES
            return r0
    }

    public static defpackage.ig4 valueOf(java.lang.String r1) {
            java.lang.Class<ig4> r0 = defpackage.ig4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ig4 r1 = (defpackage.ig4) r1
            return r1
    }

    public static defpackage.ig4[] values() {
            ig4[] r0 = defpackage.ig4.$VALUES
            java.lang.Object r0 = r0.clone()
            ig4[] r0 = (defpackage.ig4[]) r0
            return r0
    }
}
