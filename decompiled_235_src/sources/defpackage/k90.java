package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k90  reason: default package */
/* loaded from: classes.dex */
public abstract class k90 {
    public static final pq4 a = new pq4(16.0f, 8.0f, 16.0f, 8.0f);
    public static final float b = 64.0f;
    public static final float c = 36.0f;
    public static final float d = 1.0f;
    public static final pq4 e = new pq4(8.0f, 8.0f, 8.0f, 8.0f);

    public static bd1 a(long j, long j2, px0 px0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((ut0) ((xq2) px0Var).j(vt0.a)).g();
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = vt0.b(j3, px0Var);
        }
        long j4 = j2;
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        long l = hv.l(kt0.c(0.12f, ((ut0) xq2Var.j(nq6Var)).f()), ((ut0) xq2Var.j(nq6Var)).j());
        xq2 xq2Var2 = (xq2) px0Var;
        long f = ((ut0) xq2Var2.j(nq6Var)).f();
        long j5 = ((kt0) xq2Var2.j(j31.a)).a;
        if (((ut0) xq2Var2.j(nq6Var)).k()) {
            hv.N(j5);
        } else {
            hv.N(j5);
        }
        return new bd1(j3, j4, l, kt0.c(0.38f, f));
    }

    public static bd1 b(long j, px0 px0Var, int i) {
        long j2 = kt0.g;
        if ((i & 2) != 0) {
            j = ((ut0) ((xq2) px0Var).j(vt0.a)).g();
        }
        long j3 = j;
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        long f = ((ut0) xq2Var.j(nq6Var)).f();
        long j4 = ((kt0) xq2Var.j(j31.a)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j4);
        } else {
            hv.N(j4);
        }
        return new bd1(j2, j3, j2, kt0.c(0.38f, f));
    }
}
