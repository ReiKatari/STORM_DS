package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db  reason: default package */
/* loaded from: classes.dex */
public final class db extends jl2 {
    private static final db DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile wj4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private x70 keyValue_ = x70.B;
    private jb params_;
    private int version_;

    static {
        db dbVar = new db();
        DEFAULT_INSTANCE = dbVar;
        jl2.l(db.class, dbVar);
    }

    public static void m(db dbVar) {
        dbVar.version_ = 0;
    }

    public static void n(db dbVar, jb jbVar) {
        dbVar.getClass();
        jbVar.getClass();
        dbVar.params_ = jbVar;
    }

    public static void o(db dbVar, v70 v70Var) {
        dbVar.getClass();
        dbVar.keyValue_ = v70Var;
    }

    public static cb s() {
        return (cb) DEFAULT_INSTANCE.e();
    }

    public static db t(x70 x70Var, o32 o32Var) {
        return (db) jl2.j(DEFAULT_INSTANCE, x70Var, o32Var);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [wj4, java.lang.Object] */
    @Override // defpackage.jl2
    public final Object f(il2 il2Var) {
        wj4 wj4Var;
        switch (bb.a[il2Var.ordinal()]) {
            case 1:
                return new db();
            case 2:
                return new gl2(DEFAULT_INSTANCE);
            case 3:
                return new j45(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                wj4 wj4Var2 = PARSER;
                if (wj4Var2 == null) {
                    synchronized (db.class) {
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

    public final x70 p() {
        return this.keyValue_;
    }

    public final jb q() {
        jb jbVar = this.params_;
        if (jbVar == null) {
            return jb.q();
        }
        return jbVar;
    }

    public final int r() {
        return this.version_;
    }
}
