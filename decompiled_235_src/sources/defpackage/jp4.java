package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp4  reason: default package */
/* loaded from: classes.dex */
public enum jp4 implements w93 {
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
    private static final x93 internalValueMap = new w31(17);
    private final int value;

    jp4(int i) {
        this.value = i;
    }

    public static jp4 forNumber(int i) {
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

    public static x93 internalGetValueMap() {
        return internalValueMap;
    }

    public static y93 internalGetVerifier() {
        return rw2.e;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.h("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static jp4 valueOf(int i) {
        return forNumber(i);
    }
}
