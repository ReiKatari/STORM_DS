package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f25  reason: default package */
/* loaded from: classes.dex */
public enum f25 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.f25[] $VALUES = null;
    public static final defpackage.f25 FILL_AREA = null;
    public static final defpackage.f25 MAIN = null;
    public static final defpackage.f25 VERTICAL_ALIGNMENT = null;

    private static final /* synthetic */ defpackage.f25[] $values() {
            f25 r0 = defpackage.f25.MAIN
            f25 r1 = defpackage.f25.FILL_AREA
            f25 r2 = defpackage.f25.VERTICAL_ALIGNMENT
            f25[] r0 = new defpackage.f25[]{r0, r1, r2}
            return r0
    }

    static {
            f25 r0 = new f25
            java.lang.String r1 = "MAIN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.f25.MAIN = r0
            f25 r0 = new f25
            java.lang.String r1 = "FILL_AREA"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.f25.FILL_AREA = r0
            f25 r0 = new f25
            java.lang.String r1 = "VERTICAL_ALIGNMENT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.f25.VERTICAL_ALIGNMENT = r0
            f25[] r0 = $values()
            defpackage.f25.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.f25.$ENTRIES = r0
            return
    }

    f25(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.f25.$ENTRIES
            return r0
    }

    public static defpackage.f25 valueOf(java.lang.String r1) {
            java.lang.Class<f25> r0 = defpackage.f25.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            f25 r1 = (defpackage.f25) r1
            return r1
    }

    public static defpackage.f25[] values() {
            f25[] r0 = defpackage.f25.$VALUES
            java.lang.Object r0 = r0.clone()
            f25[] r0 = (defpackage.f25[]) r0
            return r0
    }
}
