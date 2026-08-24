package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd3  reason: default package */
/* loaded from: classes.dex */
public abstract class fd3 {
    public static final gr1 a = new gr1("COMPLETING_ALREADY", 9);
    public static final gr1 b = new gr1("COMPLETING_WAITING_CHILDREN", 9);
    public static final gr1 c = new gr1("COMPLETING_RETRY", 9);
    public static final gr1 d = new gr1("TOO_LATE_TO_CANCEL", 9);
    public static final gr1 e = new gr1("SEALED", 9);
    public static final rt1 f = new rt1(false);
    public static final rt1 g = new rt1(true);

    public static final Object a(Object obj) {
        f43 f43Var;
        e43 e43Var;
        if (obj instanceof f43) {
            f43Var = (f43) obj;
        } else {
            f43Var = null;
        }
        if (f43Var != null && (e43Var = f43Var.a) != null) {
            return e43Var;
        }
        return obj;
    }
}
