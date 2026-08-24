package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi3  reason: default package */
/* loaded from: classes.dex */
public final class mi3 extends pr2 {
    private static final mi3 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile ys4 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        mi3 mi3Var = new mi3();
        DEFAULT_INSTANCE = mi3Var;
        pr2.l(mi3.class, mi3Var);
    }

    public static void m(mi3 mi3Var, String str) {
        mi3Var.getClass();
        str.getClass();
        mi3Var.typeUrl_ = str;
    }

    public static void n(mi3 mi3Var, jp4 jp4Var) {
        mi3Var.getClass();
        mi3Var.outputPrefixType_ = jp4Var.getNumber();
    }

    public static void o(mi3 mi3Var, hh3 hh3Var) {
        mi3Var.getClass();
        mi3Var.status_ = hh3Var.getNumber();
    }

    public static void p(mi3 mi3Var, int i) {
        mi3Var.keyId_ = i;
    }

    public static li3 r() {
        return (li3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ji3.a[or2Var.ordinal()]) {
            case 1:
                return new mi3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (mi3.class) {
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

    public final int q() {
        return this.keyId_;
    }
}
