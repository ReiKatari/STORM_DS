package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk7  reason: default package */
/* loaded from: classes.dex */
public abstract class dk7 {
    public static final long a = s21.h(0, 0, 0, 0);
    public static final ve5 b;

    static {
        wi6 wi6Var = wi6.c;
        b = new ve5();
    }

    public static final z23 a(Object obj, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.c0(1087186730);
        if (obj instanceof z23) {
            z23 z23Var = (z23) obj;
            xq2Var.p(false);
            return z23Var;
        }
        Context context = (Context) xq2Var.j(kf.b);
        xq2Var.c0(-1245195153);
        boolean f = xq2Var.f(context) | xq2Var.f(obj);
        Object P = xq2Var.P();
        if (f || P == ox0.a) {
            x23 x23Var = new x23(context);
            x23Var.c = obj;
            P = x23Var.a();
            xq2Var.l0(P);
        }
        z23 z23Var2 = (z23) P;
        xq2Var.p(false);
        xq2Var.p(false);
        return z23Var2;
    }
}
