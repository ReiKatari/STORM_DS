package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb  reason: default package */
/* loaded from: classes.dex */
public final class mb extends pr2 {
    private static final mb DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile ys4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private pb params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [pr2, mb] */
    static {
        ?? pr2Var = new pr2();
        DEFAULT_INSTANCE = pr2Var;
        pr2.l(mb.class, pr2Var);
    }

    public static void m(mb mbVar, pb pbVar) {
        mbVar.getClass();
        mbVar.params_ = pbVar;
    }

    public static void n(mb mbVar) {
        mbVar.keySize_ = 32;
    }

    public static lb q() {
        return (lb) DEFAULT_INSTANCE.e();
    }

    public static mb r(ea0 ea0Var, g82 g82Var) {
        return (mb) pr2.j(DEFAULT_INSTANCE, ea0Var, g82Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (kb.a[or2Var.ordinal()]) {
            case 1:
                return new pr2();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (mb.class) {
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

    public final int o() {
        return this.keySize_;
    }

    public final pb p() {
        pb pbVar = this.params_;
        if (pbVar == null) {
            return pb.q();
        }
        return pbVar;
    }
}
