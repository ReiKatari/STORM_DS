package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug3  reason: default package */
/* loaded from: classes.dex */
public enum ug3 implements w93 {
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
    private static final x93 internalValueMap = new Object();
    private final int value;

    ug3(int i) {
        this.value = i;
    }

    public static ug3 forNumber(int i) {
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

    public static x93 internalGetValueMap() {
        return internalValueMap;
    }

    public static y93 internalGetVerifier() {
        return rw2.c;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.h("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ug3 valueOf(int i) {
        return forNumber(i);
    }
}
