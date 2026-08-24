package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zp6  reason: default package */
/* loaded from: classes.dex */
public enum zp6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.zp6[] $VALUES = null;
    public static final defpackage.zp6 PERCENT = null;
    public static final defpackage.zp6 PIXELS = null;

    private static /* synthetic */ defpackage.zp6[] $values() {
            zp6 r0 = defpackage.zp6.PERCENT
            zp6 r1 = defpackage.zp6.PIXELS
            zp6[] r0 = new defpackage.zp6[]{r0, r1}
            return r0
    }

    static {
            zp6 r0 = new zp6
            java.lang.String r1 = "PERCENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.zp6.PERCENT = r0
            zp6 r0 = new zp6
            java.lang.String r1 = "PIXELS"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.zp6.PIXELS = r0
            zp6[] r0 = $values()
            defpackage.zp6.$VALUES = r0
            return
    }

    zp6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.zp6 valueOf(java.lang.String r1) {
            java.lang.Class<zp6> r0 = defpackage.zp6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zp6 r1 = (defpackage.zp6) r1
            return r1
    }

    public static defpackage.zp6[] values() {
            zp6[] r0 = defpackage.zp6.$VALUES
            java.lang.Object r0 = r0.clone()
            zp6[] r0 = (defpackage.zp6[]) r0
            return r0
    }
}
