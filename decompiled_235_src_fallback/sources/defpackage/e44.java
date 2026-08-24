package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e44  reason: default package */
/* loaded from: classes.dex */
public enum e44 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.e44[] $VALUES = null;
    public static final defpackage.e44 NO_CACHE = null;
    public static final defpackage.e44 NO_STORE = null;
    final int index;

    static {
            e44 r0 = new e44
            java.lang.String r1 = "NO_CACHE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            defpackage.e44.NO_CACHE = r0
            e44 r1 = new e44
            java.lang.String r2 = "NO_STORE"
            r4 = 2
            r1.<init>(r2, r3, r4)
            defpackage.e44.NO_STORE = r1
            e44[] r0 = new defpackage.e44[]{r0, r1}
            defpackage.e44.$VALUES = r0
            return
    }

    e44(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.index = r3
            return
    }

    public static boolean shouldReadFromMemoryCache(int r1) {
            e44 r0 = defpackage.e44.NO_CACHE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static boolean shouldWriteToMemoryCache(int r1) {
            e44 r0 = defpackage.e44.NO_STORE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static defpackage.e44 valueOf(java.lang.String r1) {
            java.lang.Class<e44> r0 = defpackage.e44.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            e44 r1 = (defpackage.e44) r1
            return r1
    }

    public static defpackage.e44[] values() {
            e44[] r0 = defpackage.e44.$VALUES
            java.lang.Object r0 = r0.clone()
            e44[] r0 = (defpackage.e44[]) r0
            return r0
    }
}
