package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls6  reason: default package */
/* loaded from: classes.dex */
public enum ls6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ls6[] $VALUES = null;
    public static final defpackage.ls6 LEGACY_STRICT = null;
    public static final defpackage.ls6 LENIENT = null;
    public static final defpackage.ls6 STRICT = null;

    private static /* synthetic */ defpackage.ls6[] $values() {
            ls6 r0 = defpackage.ls6.LENIENT
            ls6 r1 = defpackage.ls6.LEGACY_STRICT
            ls6 r2 = defpackage.ls6.STRICT
            ls6[] r0 = new defpackage.ls6[]{r0, r1, r2}
            return r0
    }

    static {
            ls6 r0 = new ls6
            java.lang.String r1 = "LENIENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ls6.LENIENT = r0
            ls6 r0 = new ls6
            java.lang.String r1 = "LEGACY_STRICT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ls6.LEGACY_STRICT = r0
            ls6 r0 = new ls6
            java.lang.String r1 = "STRICT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ls6.STRICT = r0
            ls6[] r0 = $values()
            defpackage.ls6.$VALUES = r0
            return
    }

    ls6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ls6 valueOf(java.lang.String r1) {
            java.lang.Class<ls6> r0 = defpackage.ls6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ls6 r1 = (defpackage.ls6) r1
            return r1
    }

    public static defpackage.ls6[] values() {
            ls6[] r0 = defpackage.ls6.$VALUES
            java.lang.Object r0 = r0.clone()
            ls6[] r0 = (defpackage.ls6[]) r0
            return r0
    }
}
