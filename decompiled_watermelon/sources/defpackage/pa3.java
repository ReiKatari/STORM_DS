package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pa3  reason: default package */
/* loaded from: classes.dex */
public enum pa3 implements o33 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final p33 internalValueMap = new jo1(11);
    private final int value;

    pa3(int i) {
        this.value = i;
    }

    public static pa3 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    public static p33 internalGetValueMap() {
        return internalValueMap;
    }

    public static q33 internalGetVerifier() {
        return qq2.d;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.i("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static pa3 valueOf(int i) {
        return forNumber(i);
    }
}
