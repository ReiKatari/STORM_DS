package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by2  reason: default package */
/* loaded from: classes.dex */
public final class by2 extends pr2 {
    private static final by2 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile ys4 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [pr2, by2] */
    static {
        ?? pr2Var = new pr2();
        DEFAULT_INSTANCE = pr2Var;
        pr2.l(by2.class, pr2Var);
    }

    public static by2 m() {
        return DEFAULT_INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, ys4] */
    @Override // defpackage.pr2
    public final Object f(or2 or2Var) {
        ys4 ys4Var;
        switch (ay2.a[or2Var.ordinal()]) {
            case 1:
                return new pr2();
            case 2:
                return new mr2(DEFAULT_INSTANCE);
            case 3:
                return new wd5(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ys4 ys4Var2 = PARSER;
                if (ys4Var2 == null) {
                    synchronized (by2.class) {
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

    public final sw2 n() {
        sw2 forNumber = sw2.forNumber(this.hash_);
        if (forNumber == null) {
            return sw2.UNRECOGNIZED;
        }
        return forNumber;
    }

    public final int o() {
        return this.tagSize_;
    }
}
