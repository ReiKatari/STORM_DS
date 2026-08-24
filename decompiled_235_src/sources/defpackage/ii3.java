package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii3  reason: default package */
/* loaded from: classes.dex */
public final class ii3 extends pr2 {
    private static final ii3 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile ys4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z93 key_ = z45.R;
    private int primaryKeyId_;

    static {
        ii3 ii3Var = new ii3();
        DEFAULT_INSTANCE = ii3Var;
        pr2.l(ii3.class, ii3Var);
    }

    public static void m(ii3 ii3Var, int i) {
        ii3Var.primaryKeyId_ = i;
    }

    public static void n(ii3 ii3Var, hi3 hi3Var) {
        int i;
        ii3Var.getClass();
        z93 z93Var = ii3Var.key_;
        if (!((j1) z93Var).A) {
            int size = z93Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            ii3Var.key_ = z93Var.k(i);
        }
        ii3Var.key_.add(hi3Var);
    }

    public static fi3 s() {
        return (fi3) DEFAULT_INSTANCE.e();
    }

    public static ii3 t(byte[] bArr, g82 g82Var) {
        return (ii3) pr2.k(DEFAULT_INSTANCE, bArr, g82Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ei3.a[or2Var.ordinal()]) {
            case 1:
                return new ii3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", hi3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (ii3.class) {
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

    public final hi3 o(int i) {
        return (hi3) this.key_.get(i);
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
