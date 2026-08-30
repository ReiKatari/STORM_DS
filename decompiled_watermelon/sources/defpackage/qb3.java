package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qb3  reason: default package */
/* loaded from: classes.dex */
public final class qb3 extends jl2 {
    private static final qb3 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile wj4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private r33 key_ = sv4.R;
    private int primaryKeyId_;

    static {
        qb3 qb3Var = new qb3();
        DEFAULT_INSTANCE = qb3Var;
        jl2.l(qb3.class, qb3Var);
    }

    public static void m(qb3 qb3Var, int i) {
        qb3Var.primaryKeyId_ = i;
    }

    public static void n(qb3 qb3Var, pb3 pb3Var) {
        int i;
        qb3Var.getClass();
        r33 r33Var = qb3Var.key_;
        if (!((i1) r33Var).A) {
            int size = r33Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            qb3Var.key_ = r33Var.e(i);
        }
        qb3Var.key_.add(pb3Var);
    }

    public static nb3 s() {
        return (nb3) DEFAULT_INSTANCE.e();
    }

    public static qb3 t(byte[] bArr, o32 o32Var) {
        return (qb3) jl2.k(DEFAULT_INSTANCE, bArr, o32Var);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (mb3.a[il2Var.ordinal()]) {
            case 1:
                return new qb3();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", pb3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (qb3.class) {
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

    public final pb3 o(int i) {
        return (pb3) this.key_.get(i);
    }

    public final int p() {
        return this.key_.size();
    }

    public final List q() {
        return this.key_;
    }

    public final int r() {
        return this.primaryKeyId_;
    }
}
