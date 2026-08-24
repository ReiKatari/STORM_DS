package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze4  reason: default package */
/* loaded from: classes.dex */
public enum ze4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ze4[] $VALUES = null;
    public static final defpackage.ze4 NO_CACHE = null;
    public static final defpackage.ze4 NO_STORE = null;
    public static final defpackage.ze4 OFFLINE = null;
    final int index;

    static {
            ze4 r0 = new ze4
            java.lang.String r1 = "NO_CACHE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            defpackage.ze4.NO_CACHE = r0
            ze4 r1 = new ze4
            java.lang.String r2 = "NO_STORE"
            r4 = 2
            r1.<init>(r2, r3, r4)
            defpackage.ze4.NO_STORE = r1
            ze4 r2 = new ze4
            java.lang.String r3 = "OFFLINE"
            r5 = 4
            r2.<init>(r3, r4, r5)
            defpackage.ze4.OFFLINE = r2
            ze4[] r0 = new defpackage.ze4[]{r0, r1, r2}
            defpackage.ze4.$VALUES = r0
            return
    }

    ze4(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.index = r3
            return
    }

    public static boolean isOfflineOnly(int r1) {
            ze4 r0 = defpackage.ze4.OFFLINE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 == 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static boolean shouldReadFromDiskCache(int r1) {
            ze4 r0 = defpackage.ze4.NO_CACHE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static boolean shouldWriteToDiskCache(int r1) {
            ze4 r0 = defpackage.ze4.NO_STORE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static defpackage.ze4 valueOf(java.lang.String r1) {
            java.lang.Class<ze4> r0 = defpackage.ze4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ze4 r1 = (defpackage.ze4) r1
            return r1
    }

    public static defpackage.ze4[] values() {
            ze4[] r0 = defpackage.ze4.$VALUES
            java.lang.Object r0 = r0.clone()
            ze4[] r0 = (defpackage.ze4[]) r0
            return r0
    }
}
