package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko4  reason: default package */
/* loaded from: classes.dex */
public enum ko4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ko4[] $VALUES = null;
    public static final defpackage.ko4 LANDSCAPE = null;
    public static final defpackage.ko4 PORTRAIT = null;

    private static final /* synthetic */ defpackage.ko4[] $values() {
            ko4 r0 = defpackage.ko4.PORTRAIT
            ko4 r1 = defpackage.ko4.LANDSCAPE
            ko4[] r0 = new defpackage.ko4[]{r0, r1}
            return r0
    }

    static {
            ko4 r0 = new ko4
            java.lang.String r1 = "PORTRAIT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ko4.PORTRAIT = r0
            ko4 r0 = new ko4
            java.lang.String r1 = "LANDSCAPE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ko4.LANDSCAPE = r0
            ko4[] r0 = $values()
            defpackage.ko4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ko4.$ENTRIES = r0
            return
    }

    ko4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ko4.$ENTRIES
            return r0
    }

    public static defpackage.ko4 valueOf(java.lang.String r1) {
            java.lang.Class<ko4> r0 = defpackage.ko4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ko4 r1 = (defpackage.ko4) r1
            return r1
    }

    public static defpackage.ko4[] values() {
            ko4[] r0 = defpackage.ko4.$VALUES
            java.lang.Object r0 = r0.clone()
            ko4[] r0 = (defpackage.ko4[]) r0
            return r0
    }
}
