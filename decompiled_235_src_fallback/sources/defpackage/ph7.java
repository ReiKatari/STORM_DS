package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph7  reason: default package */
/* loaded from: classes.dex */
public enum ph7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ph7[] $VALUES = null;
    public static final defpackage.ph7 PACKAGE_MISMATCH = null;
    public static final defpackage.ph7 SIGNATURE_MISMATCH = null;
    public static final defpackage.ph7 SIZE_MISMATCH = null;
    public static final defpackage.ph7 VERSION_CODE_NOT_NEWER = null;
    public static final defpackage.ph7 VERSION_NAME_MISMATCH = null;

    private static final /* synthetic */ defpackage.ph7[] $values() {
            ph7 r0 = defpackage.ph7.SIZE_MISMATCH
            ph7 r1 = defpackage.ph7.PACKAGE_MISMATCH
            ph7 r2 = defpackage.ph7.VERSION_CODE_NOT_NEWER
            ph7 r3 = defpackage.ph7.VERSION_NAME_MISMATCH
            ph7 r4 = defpackage.ph7.SIGNATURE_MISMATCH
            ph7[] r0 = new defpackage.ph7[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            ph7 r0 = new ph7
            java.lang.String r1 = "SIZE_MISMATCH"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ph7.SIZE_MISMATCH = r0
            ph7 r0 = new ph7
            java.lang.String r1 = "PACKAGE_MISMATCH"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ph7.PACKAGE_MISMATCH = r0
            ph7 r0 = new ph7
            java.lang.String r1 = "VERSION_CODE_NOT_NEWER"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ph7.VERSION_CODE_NOT_NEWER = r0
            ph7 r0 = new ph7
            java.lang.String r1 = "VERSION_NAME_MISMATCH"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ph7.VERSION_NAME_MISMATCH = r0
            ph7 r0 = new ph7
            java.lang.String r1 = "SIGNATURE_MISMATCH"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ph7.SIGNATURE_MISMATCH = r0
            ph7[] r0 = $values()
            defpackage.ph7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ph7.$ENTRIES = r0
            return
    }

    ph7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ph7.$ENTRIES
            return r0
    }

    public static defpackage.ph7 valueOf(java.lang.String r1) {
            java.lang.Class<ph7> r0 = defpackage.ph7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ph7 r1 = (defpackage.ph7) r1
            return r1
    }

    public static defpackage.ph7[] values() {
            ph7[] r0 = defpackage.ph7.$VALUES
            java.lang.Object r0 = r0.clone()
            ph7[] r0 = (defpackage.ph7[]) r0
            return r0
    }
}
