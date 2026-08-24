package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb2  reason: default package */
/* loaded from: classes.dex */
public enum bb2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.bb2[] $VALUES = null;
    public static final defpackage.bb2 AGGREGATION_COUNT = null;
    public static final defpackage.bb2 CLASSES = null;
    public static final defpackage.bb2 DEX_FILES = null;
    public static final defpackage.bb2 EXTRA_DESCRIPTORS = null;
    public static final defpackage.bb2 METHODS = null;
    private final long mValue;

    private static /* synthetic */ defpackage.bb2[] $values() {
            bb2 r0 = defpackage.bb2.DEX_FILES
            bb2 r1 = defpackage.bb2.EXTRA_DESCRIPTORS
            bb2 r2 = defpackage.bb2.CLASSES
            bb2 r3 = defpackage.bb2.METHODS
            bb2 r4 = defpackage.bb2.AGGREGATION_COUNT
            bb2[] r0 = new defpackage.bb2[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            bb2 r0 = new bb2
            r1 = 0
            r2 = 0
            java.lang.String r4 = "DEX_FILES"
            r0.<init>(r4, r1, r2)
            defpackage.bb2.DEX_FILES = r0
            bb2 r0 = new bb2
            r1 = 1
            r2 = 1
            java.lang.String r4 = "EXTRA_DESCRIPTORS"
            r0.<init>(r4, r1, r2)
            defpackage.bb2.EXTRA_DESCRIPTORS = r0
            bb2 r0 = new bb2
            r1 = 2
            r2 = 2
            java.lang.String r4 = "CLASSES"
            r0.<init>(r4, r1, r2)
            defpackage.bb2.CLASSES = r0
            bb2 r0 = new bb2
            r1 = 3
            r2 = 3
            java.lang.String r4 = "METHODS"
            r0.<init>(r4, r1, r2)
            defpackage.bb2.METHODS = r0
            bb2 r0 = new bb2
            r1 = 4
            r2 = 4
            java.lang.String r4 = "AGGREGATION_COUNT"
            r0.<init>(r4, r1, r2)
            defpackage.bb2.AGGREGATION_COUNT = r0
            bb2[] r0 = $values()
            defpackage.bb2.$VALUES = r0
            return
    }

    bb2(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mValue = r3
            return
    }

    public static defpackage.bb2 fromValue(long r4) {
            bb2[] r0 = values()
            r1 = 0
        L5:
            int r2 = r0.length
            if (r1 >= r2) goto L18
            r2 = r0[r1]
            long r2 = r2.getValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r4 = r0[r1]
            return r4
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            java.lang.String r0 = "Unsupported FileSection Type "
            java.lang.String r4 = defpackage.lb1.h(r4, r0)
            defpackage.i.h(r4)
            r4 = 0
            return r4
    }

    public static defpackage.bb2 valueOf(java.lang.String r1) {
            java.lang.Class<bb2> r0 = defpackage.bb2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bb2 r1 = (defpackage.bb2) r1
            return r1
    }

    public static defpackage.bb2[] values() {
            bb2[] r0 = defpackage.bb2.$VALUES
            java.lang.Object r0 = r0.clone()
            bb2[] r0 = (defpackage.bb2[]) r0
            return r0
    }

    public long getValue() {
            r2 = this;
            long r0 = r2.mValue
            return r0
    }
}
