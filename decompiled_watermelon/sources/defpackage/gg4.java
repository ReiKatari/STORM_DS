package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gg4  reason: default package */
/* loaded from: classes.dex */
public enum gg4 implements o33 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final p33 internalValueMap = new Object();
    private final int value;

    gg4(int i) {
        this.value = i;
    }

    public static gg4 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public static p33 internalGetValueMap() {
        return internalValueMap;
    }

    public static q33 internalGetVerifier() {
        return qq2.e;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.i("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static gg4 valueOf(int i) {
        return forNumber(i);
    }
}
