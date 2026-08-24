package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hi3  reason: default package */
/* loaded from: classes.dex */
public final class hi3 extends pr2 {
    private static final hi3 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile ys4 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private vg3 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [pr2, hi3] */
    static {
        ?? pr2Var = new pr2();
        DEFAULT_INSTANCE = pr2Var;
        pr2.l(hi3.class, pr2Var);
    }

    public static void m(hi3 hi3Var, vg3 vg3Var) {
        hi3Var.getClass();
        hi3Var.keyData_ = vg3Var;
    }

    public static void n(hi3 hi3Var, jp4 jp4Var) {
        hi3Var.getClass();
        hi3Var.outputPrefixType_ = jp4Var.getNumber();
    }

    public static void o(hi3 hi3Var, hh3 hh3Var) {
        hi3Var.getClass();
        hi3Var.status_ = hh3Var.getNumber();
    }

    public static void p(hi3 hi3Var, int i) {
        hi3Var.keyId_ = i;
    }

    public static gi3 v() {
        return (gi3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ei3.a[or2Var.ordinal()]) {
            case 1:
                return new pr2();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (hi3.class) {
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

    public final vg3 q() {
        vg3 vg3Var = this.keyData_;
        if (vg3Var == null) {
            return vg3.p();
        }
        return vg3Var;
    }

    public final int r() {
        return this.keyId_;
    }

    public final jp4 s() {
        jp4 forNumber = jp4.forNumber(this.outputPrefixType_);
        if (forNumber == null) {
            return jp4.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final hh3 t() {
        hh3 forNumber = hh3.forNumber(this.status_);
        if (forNumber == null) {
            return hh3.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final boolean u() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
    }
}
