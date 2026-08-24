package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb1  reason: default package */
/* loaded from: classes.dex */
public enum bb1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.bb1[] $VALUES = null;
    public static final defpackage.bb1 BANNER_SAV = null;
    public static final defpackage.bb1 PRIVATE_SAV = null;
    public static final defpackage.bb1 PUBLIC_SAV = null;
    private final java.lang.String fileName;

    private static final /* synthetic */ defpackage.bb1[] $values() {
            bb1 r0 = defpackage.bb1.PUBLIC_SAV
            bb1 r1 = defpackage.bb1.PRIVATE_SAV
            bb1 r2 = defpackage.bb1.BANNER_SAV
            bb1[] r0 = new defpackage.bb1[]{r0, r1, r2}
            return r0
    }

    static {
            bb1 r0 = new bb1
            r1 = 0
            java.lang.String r2 = "public.sav"
            java.lang.String r3 = "PUBLIC_SAV"
            r0.<init>(r3, r1, r2)
            defpackage.bb1.PUBLIC_SAV = r0
            bb1 r0 = new bb1
            r1 = 1
            java.lang.String r2 = "private.sav"
            java.lang.String r3 = "PRIVATE_SAV"
            r0.<init>(r3, r1, r2)
            defpackage.bb1.PRIVATE_SAV = r0
            bb1 r0 = new bb1
            r1 = 2
            java.lang.String r2 = "banner.sav"
            java.lang.String r3 = "BANNER_SAV"
            r0.<init>(r3, r1, r2)
            defpackage.bb1.BANNER_SAV = r0
            bb1[] r0 = $values()
            defpackage.bb1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.bb1.$ENTRIES = r0
            return
    }

    bb1(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.fileName = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.bb1.$ENTRIES
            return r0
    }

    public static defpackage.bb1 valueOf(java.lang.String r1) {
            java.lang.Class<bb1> r0 = defpackage.bb1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bb1 r1 = (defpackage.bb1) r1
            return r1
    }

    public static defpackage.bb1[] values() {
            bb1[] r0 = defpackage.bb1.$VALUES
            java.lang.Object r0 = r0.clone()
            bb1[] r0 = (defpackage.bb1[]) r0
            return r0
    }

    public final java.lang.String getFileName() {
            r0 = this;
            java.lang.String r0 = r0.fileName
            return r0
    }
}
