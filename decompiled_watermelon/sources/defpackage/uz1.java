package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uz1  reason: default package */
/* loaded from: classes.dex */
public final class uz1 extends jl2 {
    private static final uz1 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile wj4 PARSER;
    private x70 encryptedKeyset_ = x70.B;
    private vb3 keysetInfo_;

    static {
        uz1 uz1Var = new uz1();
        DEFAULT_INSTANCE = uz1Var;
        jl2.l(uz1.class, uz1Var);
    }

    public static void m(uz1 uz1Var, v70 v70Var) {
        uz1Var.getClass();
        uz1Var.encryptedKeyset_ = v70Var;
    }

    public static void n(uz1 uz1Var, vb3 vb3Var) {
        uz1Var.getClass();
        uz1Var.keysetInfo_ = vb3Var;
    }

    public static tz1 p() {
        return (tz1) DEFAULT_INSTANCE.e();
    }

    public static uz1 q(byte[] bArr, o32 o32Var) {
        return (uz1) jl2.k(DEFAULT_INSTANCE, bArr, o32Var);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (sz1.a[il2Var.ordinal()]) {
            case 1:
                return new uz1();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (uz1.class) {
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

    public final x70 o() {
        return this.encryptedKeyset_;
    }
}
