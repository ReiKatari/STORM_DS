package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h62  reason: default package */
/* loaded from: classes.dex */
public enum h62 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    h62(long j) {
        this.mValue = j;
    }

    public static h62 fromValue(long j) {
        h62[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        i.i(wh1.h(j, "Unsupported FileSection Type "));
        return null;
    }

    public long getValue() {
        return this.mValue;
    }
}
