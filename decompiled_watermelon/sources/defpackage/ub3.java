package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ub3  reason: default package */
/* loaded from: classes.dex */
public final class ub3 extends jl2 {
    private static final ub3 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile wj4 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        ub3 ub3Var = new ub3();
        DEFAULT_INSTANCE = ub3Var;
        jl2.l(ub3.class, ub3Var);
    }

    public static void m(ub3 ub3Var, String str) {
        ub3Var.getClass();
        str.getClass();
        ub3Var.typeUrl_ = str;
    }

    public static void n(ub3 ub3Var, gg4 gg4Var) {
        ub3Var.getClass();
        ub3Var.outputPrefixType_ = gg4Var.getNumber();
    }

    public static void o(ub3 ub3Var, pa3 pa3Var) {
        ub3Var.getClass();
        ub3Var.status_ = pa3Var.getNumber();
    }

    public static void p(ub3 ub3Var, int i) {
        ub3Var.keyId_ = i;
    }

    public static tb3 r() {
        return (tb3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (rb3.a[il2Var.ordinal()]) {
            case 1:
                return new ub3();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (ub3.class) {
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

    public final int q() {
        return this.keyId_;
    }
}
