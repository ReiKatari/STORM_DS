package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ya  reason: default package */
/* loaded from: classes.dex */
public final class ya extends jl2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final ya DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile wj4 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private as2 hmacParams_;

    /* JADX WARN: Type inference failed for: r0v0, types: [jl2, ya] */
    static {
        ?? jl2Var = new jl2();
        DEFAULT_INSTANCE = jl2Var;
        jl2.l(ya.class, jl2Var);
    }

    public static ya n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (xa.a[il2Var.ordinal()]) {
            case 1:
                return new jl2();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (ya.class) {
                        try {
                            wj4 wj4Var3 = PARSER;
                            wj4Var = wj4Var3;
                            if (wj4Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                wj4Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return wj4Var;
                }
                return wj4Var2;
            case ig7.b /* 6 */:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int m() {
        return this.ciphertextSegmentSize_;
    }

    public final int o() {
        return this.derivedKeySize_;
    }

    public final rq2 p() {
        rq2 forNumber = rq2.forNumber(this.hkdfHashType_);
        if (forNumber == null) {
            return rq2.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final as2 q() {
        as2 as2Var = this.hmacParams_;
        if (as2Var == null) {
            return as2.m();
        }
        return as2Var;
    }
}
