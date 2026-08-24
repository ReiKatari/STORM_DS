package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j42  reason: default package */
/* loaded from: classes.dex */
public final class j42 extends pr2 {
    private static final j42 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile ys4 PARSER;
    private ea0 encryptedKeyset_ = ea0.B;
    private ni3 keysetInfo_;

    static {
        j42 j42Var = new j42();
        DEFAULT_INSTANCE = j42Var;
        pr2.l(j42.class, j42Var);
    }

    public static void m(j42 j42Var, ca0 ca0Var) {
        j42Var.getClass();
        j42Var.encryptedKeyset_ = ca0Var;
    }

    public static void n(j42 j42Var, ni3 ni3Var) {
        j42Var.getClass();
        j42Var.keysetInfo_ = ni3Var;
    }

    public static i42 p() {
        return (i42) DEFAULT_INSTANCE.e();
    }

    public static j42 q(byte[] bArr, g82 g82Var) {
        return (j42) pr2.k(DEFAULT_INSTANCE, bArr, g82Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (h42.a[or2Var.ordinal()]) {
            case 1:
                return new j42();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (j42.class) {
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

    public final ea0 o() {
        return this.encryptedKeyset_;
    }
}
