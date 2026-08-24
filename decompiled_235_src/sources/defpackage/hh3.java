package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh3  reason: default package */
/* loaded from: classes.dex */
public enum hh3 implements w93 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final x93 internalValueMap = new x31(13);
    private final int value;

    hh3(int i) {
        this.value = i;
    }

    public static hh3 forNumber(int i) {
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

    public static x93 internalGetValueMap() {
        return internalValueMap;
    }

    public static y93 internalGetVerifier() {
        return rw2.d;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.h("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static hh3 valueOf(int i) {
        return forNumber(i);
    }
}
