package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jb  reason: default package */
/* loaded from: classes.dex */
public final class jb extends jl2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final jb DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile wj4 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    /* JADX WARN: Type inference failed for: r0v0, types: [jl2, jb] */
    static {
        ?? jl2Var = new jl2();
        DEFAULT_INSTANCE = jl2Var;
        jl2.l(jb.class, jl2Var);
    }

    public static void m(jb jbVar) {
        jbVar.ciphertextSegmentSize_ = 4096;
    }

    public static void n(jb jbVar) {
        jbVar.derivedKeySize_ = 32;
    }

    public static void o(jb jbVar, rq2 rq2Var) {
        jbVar.getClass();
        jbVar.hkdfHashType_ = rq2Var.getNumber();
    }

    public static jb q() {
        return DEFAULT_INSTANCE;
    }

    public static ib t() {
        return (ib) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (hb.a[il2Var.ordinal()]) {
            case 1:
                return new jl2();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (jb.class) {
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

    public final int p() {
        return this.ciphertextSegmentSize_;
    }

    public final int r() {
        return this.derivedKeySize_;
    }

    public final rq2 s() {
        rq2 forNumber = rq2.forNumber(this.hkdfHashType_);
        if (forNumber == null) {
            return rq2.UNRECOGNIZED;
        }
        return forNumber;
    }
}
