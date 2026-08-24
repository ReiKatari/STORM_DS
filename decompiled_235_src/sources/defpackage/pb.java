package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb  reason: default package */
/* loaded from: classes.dex */
public final class pb extends pr2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final pb DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile ys4 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    /* JADX WARN: Type inference failed for: r0v0, types: [pr2, pb] */
    static {
        ?? pr2Var = new pr2();
        DEFAULT_INSTANCE = pr2Var;
        pr2.l(pb.class, pr2Var);
    }

    public static void m(pb pbVar) {
        pbVar.ciphertextSegmentSize_ = 4096;
    }

    public static void n(pb pbVar) {
        pbVar.derivedKeySize_ = 32;
    }

    public static void o(pb pbVar, sw2 sw2Var) {
        pbVar.getClass();
        pbVar.hkdfHashType_ = sw2Var.getNumber();
    }

    public static pb q() {
        return DEFAULT_INSTANCE;
    }

    public static ob t() {
        return (ob) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (nb.a[or2Var.ordinal()]) {
            case 1:
                return new pr2();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (pb.class) {
                        try {
                            ys4 ys4Var3 = PARSER;
                            ys4Var = ys4Var3;
                            if (ys4Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                ys4Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return ys4Var;
                }
                return ys4Var2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                e41.t();
                break;
        }
        return null;
    }

    public final int p() {
        return this.ciphertextSegmentSize_;
    }

    public final int r() {
        return this.derivedKeySize_;
    }

    public final sw2 s() {
        sw2 forNumber = sw2.forNumber(this.hkdfHashType_);
        if (forNumber == null) {
            return sw2.UNRECOGNIZED;
        }
        return forNumber;
    }
}
