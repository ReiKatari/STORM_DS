package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw2  reason: default package */
/* loaded from: classes.dex */
public enum sw2 implements w93 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final x93 internalValueMap = new jd1(7);
    private final int value;

    sw2(int i) {
        this.value = i;
    }

    public static sw2 forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    public static x93 internalGetValueMap() {
        return internalValueMap;
    }

    public static y93 internalGetVerifier() {
        return rw2.b;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        i.h("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static sw2 valueOf(int i) {
        return forNumber(i);
    }
}
