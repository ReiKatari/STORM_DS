package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th3  reason: default package */
/* loaded from: classes.dex */
public final class th3 extends pr2 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final th3 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile ys4 PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        th3 th3Var = new th3();
        DEFAULT_INSTANCE = th3Var;
        pr2.l(th3.class, th3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (sh3.a[or2Var.ordinal()]) {
            case 1:
                return new th3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (th3.class) {
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
}
