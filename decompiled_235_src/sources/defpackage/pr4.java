package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr4  reason: default package */
/* loaded from: classes.dex */
public abstract class pr4 {
    public static final or4 a;
    public static final cr4 b;

    static {
        or4 or4Var = new or4(0);
        a = or4Var;
        b = new cr4(0, 0, 0, lo4.Horizontal, 0, 0, 0, cs1.l0, new jp3(2), g04.i(vt1.A), or4Var, s21.b(0, 0, 0, 0, 15));
    }

    public static final long a(cr4 cr4Var, int i) {
        long e;
        int i2 = cr4Var.c;
        long j = (((i * (cr4Var.b + i2)) + (-cr4Var.f)) + cr4Var.d) - i2;
        if (cr4Var.e == lo4.Horizontal) {
            e = cr4Var.e() >> 32;
        } else {
            e = cr4Var.e() & 4294967295L;
        }
        int i3 = (int) e;
        cr4Var.n.getClass();
        long q = j - (i3 - gi2.q(0, 0, i3));
        if (q < 0) {
            return 0L;
        }
        return q;
    }
}
