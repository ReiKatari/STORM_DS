package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb  reason: default package */
/* loaded from: classes.dex */
public final class jb extends pr2 {
    private static final jb DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ys4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ea0 keyValue_ = ea0.B;
    private pb params_;
    private int version_;

    static {
        jb jbVar = new jb();
        DEFAULT_INSTANCE = jbVar;
        pr2.l(jb.class, jbVar);
    }

    public static void m(jb jbVar) {
        jbVar.version_ = 0;
    }

    public static void n(jb jbVar, pb pbVar) {
        jbVar.getClass();
        pbVar.getClass();
        jbVar.params_ = pbVar;
    }

    public static void o(jb jbVar, ca0 ca0Var) {
        jbVar.getClass();
        jbVar.keyValue_ = ca0Var;
    }

    public static ib s() {
        return (ib) DEFAULT_INSTANCE.e();
    }

    public static jb t(ea0 ea0Var, g82 g82Var) {
        return (jb) pr2.j(DEFAULT_INSTANCE, ea0Var, g82Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (hb.a[or2Var.ordinal()]) {
            case 1:
                return new jb();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (jb.class) {
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

    public final ea0 p() {
        return this.keyValue_;
    }

    public final pb q() {
        pb pbVar = this.params_;
        if (pbVar == null) {
            return pb.q();
        }
        return pbVar;
    }

    public final int r() {
        return this.version_;
    }
}
