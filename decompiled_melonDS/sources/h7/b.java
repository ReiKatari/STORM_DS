package h7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum b {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    b(long j2) {
        this.mValue = j2;
    }

    public static b fromValue(long j2) {
        b[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].getValue() == j2) {
                return values[i2];
            }
        }
        a0.j.h(kc.a.e(j2, "Unsupported FileSection Type "));
        return null;
    }

    public long getValue() {
        return this.mValue;
    }
}
