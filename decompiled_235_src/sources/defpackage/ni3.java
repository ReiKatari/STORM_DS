package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni3  reason: default package */
/* loaded from: classes.dex */
public final class ni3 extends pr2 {
    private static final ni3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile ys4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z93 keyInfo_ = z45.R;
    private int primaryKeyId_;

    static {
        ni3 ni3Var = new ni3();
        DEFAULT_INSTANCE = ni3Var;
        pr2.l(ni3.class, ni3Var);
    }

    public static void m(ni3 ni3Var, int i) {
        ni3Var.primaryKeyId_ = i;
    }

    public static void n(ni3 ni3Var, mi3 mi3Var) {
        int i;
        ni3Var.getClass();
        z93 z93Var = ni3Var.keyInfo_;
        if (!((j1) z93Var).A) {
            int size = z93Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            ni3Var.keyInfo_ = z93Var.k(i);
        }
        ni3Var.keyInfo_.add(mi3Var);
    }

    public static ki3 p() {
        return (ki3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ji3.a[or2Var.ordinal()]) {
            case 1:
                return new ni3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", mi3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (ni3.class) {
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

    public final mi3 o() {
        return (mi3) this.keyInfo_.get(0);
    }
}
