package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ca3  reason: default package */
/* loaded from: classes.dex */
public final class ca3 extends jl2 {
    private static final ca3 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile wj4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private x70 value_ = x70.B;

    static {
        ca3 ca3Var = new ca3();
        DEFAULT_INSTANCE = ca3Var;
        jl2.l(ca3.class, ca3Var);
    }

    public static void m(ca3 ca3Var, String str) {
        ca3Var.getClass();
        str.getClass();
        ca3Var.typeUrl_ = str;
    }

    public static void n(ca3 ca3Var, v70 v70Var) {
        ca3Var.getClass();
        ca3Var.value_ = v70Var;
    }

    public static void o(ca3 ca3Var, ba3 ba3Var) {
        ca3Var.getClass();
        ca3Var.keyMaterialType_ = ba3Var.getNumber();
    }

    public static ca3 p() {
        return DEFAULT_INSTANCE;
    }

    public static aa3 t() {
        return (aa3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (z93.a[il2Var.ordinal()]) {
            case 1:
                return new ca3();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (ca3.class) {
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

    public final ba3 q() {
        ba3 forNumber = ba3.forNumber(this.keyMaterialType_);
        if (forNumber == null) {
            return ba3.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final String r() {
        return this.typeUrl_;
    }

    public final x70 s() {
        return this.value_;
    }
}
