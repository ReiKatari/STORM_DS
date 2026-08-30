package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ua3  reason: default package */
/* loaded from: classes.dex */
public final class ua3 extends jl2 {
    private static final ua3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile wj4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private x70 value_ = x70.B;

    static {
        ua3 ua3Var = new ua3();
        DEFAULT_INSTANCE = ua3Var;
        jl2.l(ua3.class, ua3Var);
    }

    public static void m(ua3 ua3Var) {
        ua3Var.getClass();
        ua3Var.typeUrl_ = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    public static void n(ua3 ua3Var, v70 v70Var) {
        ua3Var.getClass();
        ua3Var.value_ = v70Var;
    }

    public static void o(ua3 ua3Var, gg4 gg4Var) {
        ua3Var.getClass();
        ua3Var.outputPrefixType_ = gg4Var.getNumber();
    }

    public static sa3 s() {
        return (sa3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (qa3.a[il2Var.ordinal()]) {
            case 1:
                return new ua3();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (ua3.class) {
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

    public final gg4 p() {
        gg4 forNumber = gg4.forNumber(this.outputPrefixType_);
        if (forNumber == null) {
            return gg4.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final String q() {
        return this.typeUrl_;
    }

    public final x70 r() {
        return this.value_;
    }
}
