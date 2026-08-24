package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms1  reason: default package */
/* loaded from: classes.dex */
public abstract class ms1 {
    public static final sc7 a = new sc7(120, ir1.a, 2);
    public static final sc7 b = new sc7(150, new v71(0.4f, 0.6f), 2);
    public static final sc7 c = new sc7(120, new v71(0.4f, 0.6f), 2);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
        if ((r10 instanceof defpackage.sg2) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
        if ((r9 instanceof defpackage.sg2) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gn gnVar, float f, t93 t93Var, t93 t93Var2, s41 s41Var) {
        sc7 sc7Var;
        sc7 sc7Var2 = null;
        if (t93Var2 != null) {
            boolean z = t93Var2 instanceof l25;
            sc7Var = a;
            if (!z) {
                if (!(t93Var2 instanceof ao1)) {
                    if (!(t93Var2 instanceof oy2)) {
                    }
                }
            }
            sc7Var2 = sc7Var;
        } else if (t93Var != null) {
            boolean z2 = t93Var instanceof l25;
            sc7Var = b;
            if (!z2 && !(t93Var instanceof ao1)) {
                if (t93Var instanceof oy2) {
                    sc7Var2 = c;
                }
            }
            sc7Var2 = sc7Var;
        }
        sc7 sc7Var3 = sc7Var2;
        if (sc7Var3 != null) {
            Object c2 = gn.c(gnVar, new om1(f), sc7Var3, null, s41Var, 12);
            if (c2 == x61.COROUTINE_SUSPENDED) {
                return c2;
            }
        } else {
            Object e = gnVar.e(s41Var, new om1(f));
            if (e == x61.COROUTINE_SUSPENDED) {
                return e;
            }
        }
        return jg7.a;
    }
}
