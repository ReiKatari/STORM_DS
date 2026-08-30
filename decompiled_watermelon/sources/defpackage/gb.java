package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb extends jl2 {
    private static final gb DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile wj4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private jb params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [jl2, gb] */
    static {
        ?? jl2Var = new jl2();
        DEFAULT_INSTANCE = jl2Var;
        jl2.l(gb.class, jl2Var);
    }

    public static void m(gb gbVar, jb jbVar) {
        gbVar.getClass();
        gbVar.params_ = jbVar;
    }

    public static void n(gb gbVar) {
        gbVar.keySize_ = 32;
    }

    public static fb q() {
        return (fb) DEFAULT_INSTANCE.e();
    }

    public static gb r(x70 x70Var, o32 o32Var) {
        return (gb) jl2.j(DEFAULT_INSTANCE, x70Var, o32Var);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (eb.a[il2Var.ordinal()]) {
            case 1:
                return new jl2();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (gb.class) {
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

    public final int o() {
        return this.keySize_;
    }

    public final jb p() {
        jb jbVar = this.params_;
        if (jbVar == null) {
            return jb.q();
        }
        return jbVar;
    }
}
