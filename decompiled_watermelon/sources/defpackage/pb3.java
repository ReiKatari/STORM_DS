package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pb3  reason: default package */
/* loaded from: classes.dex */
public final class pb3 extends jl2 {
    private static final pb3 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile wj4 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private ca3 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [pb3, jl2] */
    static {
        ?? jl2Var = new jl2();
        DEFAULT_INSTANCE = jl2Var;
        jl2.l(pb3.class, jl2Var);
    }

    public static void m(pb3 pb3Var, ca3 ca3Var) {
        pb3Var.getClass();
        pb3Var.keyData_ = ca3Var;
    }

    public static void n(pb3 pb3Var, gg4 gg4Var) {
        pb3Var.getClass();
        pb3Var.outputPrefixType_ = gg4Var.getNumber();
    }

    public static void o(pb3 pb3Var, pa3 pa3Var) {
        pb3Var.getClass();
        pb3Var.status_ = pa3Var.getNumber();
    }

    public static void p(pb3 pb3Var, int i) {
        pb3Var.keyId_ = i;
    }

    public static ob3 v() {
        return (ob3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (mb3.a[il2Var.ordinal()]) {
            case 1:
                return new jl2();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (pb3.class) {
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

    public final ca3 q() {
        ca3 ca3Var = this.keyData_;
        if (ca3Var == null) {
            return ca3.p();
        }
        return ca3Var;
    }

    public final int r() {
        return this.keyId_;
    }

    public final gg4 s() {
        gg4 forNumber = gg4.forNumber(this.outputPrefixType_);
        if (forNumber == null) {
            return gg4.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final pa3 t() {
        pa3 forNumber = pa3.forNumber(this.status_);
        if (forNumber == null) {
            return pa3.UNRECOGNIZED;
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
