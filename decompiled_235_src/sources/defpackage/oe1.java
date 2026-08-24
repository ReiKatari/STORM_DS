package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe1  reason: default package */
/* loaded from: classes.dex */
public final class oe1 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(jr3 jr3Var, boolean z) {
        if (z) {
            return ((kr3) gt0.Q0(jr3Var.k)).a + 1;
        }
        return ((kr3) gt0.H0(jr3Var.k)).a - 1;
    }

    public static int b(wo3 wo3Var, boolean z) {
        int i;
        int i2;
        if (z) {
            xo3 xo3Var = (xo3) gt0.Q0(wo3Var.m);
            if (wo3Var.q == lo4.Vertical) {
                i2 = xo3Var.p;
            } else {
                i2 = xo3Var.q;
            }
            return i2 + 1;
        }
        xo3 xo3Var2 = (xo3) gt0.H0(wo3Var.m);
        if (wo3Var.q == lo4.Vertical) {
            i = xo3Var2.p;
        } else {
            i = xo3Var2.q;
        }
        return i - 1;
    }
}
