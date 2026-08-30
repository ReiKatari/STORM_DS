package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba3  reason: default package */
/* loaded from: classes.dex */
public enum ba3 implements o33 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final p33 internalValueMap = new so1(10);
    private final int value;

    ba3(int i) {
        this.value = i;
    }

    public static ba3 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REMOTE;
                    }
                    return ASYMMETRIC_PUBLIC;
                }
                return ASYMMETRIC_PRIVATE;
            }
            return SYMMETRIC;
        }
        return UNKNOWN_KEYMATERIAL;
    }

    public static p33 internalGetValueMap() {
        return internalValueMap;
    }

    public static q33 internalGetVerifier() {
        return qq2.c;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.i("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ba3 valueOf(int i) {
        return forNumber(i);
    }
}
