package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh3  reason: default package */
/* loaded from: classes.dex */
public final class mh3 extends pr2 {
    private static final mh3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile ys4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ea0 value_ = ea0.B;

    static {
        mh3 mh3Var = new mh3();
        DEFAULT_INSTANCE = mh3Var;
        pr2.l(mh3.class, mh3Var);
    }

    public static void m(mh3 mh3Var) {
        mh3Var.getClass();
        mh3Var.typeUrl_ = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    public static void n(mh3 mh3Var, ca0 ca0Var) {
        mh3Var.getClass();
        mh3Var.value_ = ca0Var;
    }

    public static void o(mh3 mh3Var, jp4 jp4Var) {
        mh3Var.getClass();
        mh3Var.outputPrefixType_ = jp4Var.getNumber();
    }

    public static kh3 s() {
        return (kh3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ih3.a[or2Var.ordinal()]) {
            case 1:
                return new mh3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (mh3.class) {
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

    public final jp4 p() {
        jp4 forNumber = jp4.forNumber(this.outputPrefixType_);
        if (forNumber == null) {
            return jp4.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final String q() {
        return this.typeUrl_;
    }

    public final ea0 r() {
        return this.value_;
    }
}
