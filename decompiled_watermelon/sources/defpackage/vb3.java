package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vb3  reason: default package */
/* loaded from: classes.dex */
public final class vb3 extends jl2 {
    private static final vb3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile wj4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private r33 keyInfo_ = sv4.R;
    private int primaryKeyId_;

    static {
        vb3 vb3Var = new vb3();
        DEFAULT_INSTANCE = vb3Var;
        jl2.l(vb3.class, vb3Var);
    }

    public static void m(vb3 vb3Var, int i) {
        vb3Var.primaryKeyId_ = i;
    }

    public static void n(vb3 vb3Var, ub3 ub3Var) {
        int i;
        vb3Var.getClass();
        r33 r33Var = vb3Var.keyInfo_;
        if (!((i1) r33Var).A) {
            int size = r33Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            vb3Var.keyInfo_ = r33Var.e(i);
        }
        vb3Var.keyInfo_.add(ub3Var);
    }

    public static sb3 p() {
        return (sb3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (rb3.a[il2Var.ordinal()]) {
            case 1:
                return new vb3();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", ub3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (vb3.class) {
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

    public final ub3 o() {
        return (ub3) this.keyInfo_.get(0);
    }
}
