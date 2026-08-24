package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg3  reason: default package */
/* loaded from: classes.dex */
public final class vg3 extends pr2 {
    private static final vg3 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile ys4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ea0 value_ = ea0.B;

    static {
        vg3 vg3Var = new vg3();
        DEFAULT_INSTANCE = vg3Var;
        pr2.l(vg3.class, vg3Var);
    }

    public static void m(vg3 vg3Var, String str) {
        vg3Var.getClass();
        str.getClass();
        vg3Var.typeUrl_ = str;
    }

    public static void n(vg3 vg3Var, ca0 ca0Var) {
        vg3Var.getClass();
        vg3Var.value_ = ca0Var;
    }

    public static void o(vg3 vg3Var, ug3 ug3Var) {
        vg3Var.getClass();
        vg3Var.keyMaterialType_ = ug3Var.getNumber();
    }

    public static vg3 p() {
        return DEFAULT_INSTANCE;
    }

    public static tg3 t() {
        return (tg3) DEFAULT_INSTANCE.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (sg3.a[or2Var.ordinal()]) {
            case 1:
                return new vg3();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (vg3.class) {
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

    public final ug3 q() {
        ug3 forNumber = ug3.forNumber(this.keyMaterialType_);
        if (forNumber == null) {
            return ug3.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final String r() {
        return this.typeUrl_;
    }

    public final ea0 s() {
        return this.value_;
    }
}
