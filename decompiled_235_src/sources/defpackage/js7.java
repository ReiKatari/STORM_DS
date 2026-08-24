package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js7  reason: default package */
/* loaded from: classes.dex */
public abstract class js7 {
    public static final void a(float f, int i, px0 px0Var, a74 a74Var) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1333734539);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            x64 x64Var = x64.a;
            a74 j = dj6.j(x64Var, (18.0f * f) / 24.0f, f);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new rk7(5);
                xq2Var.l0(P);
            }
            ak7.j(j, (qn2) P, xq2Var, 48);
            a74Var = x64Var;
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fq1(a74Var, f, i, 1);
        }
    }

    public static final wb6 b(wb6 wb6Var, jd1 jd1Var) {
        wb6Var.getClass();
        jd1Var.getClass();
        if (nb3.k(wb6Var.e(), ac6.e)) {
            n16.x(wb6Var);
            return wb6Var;
        } else if (wb6Var.h()) {
            return b(wb6Var.j(0), jd1Var);
        } else {
            return wb6Var;
        }
    }

    public static final by7 c(id3 id3Var, wb6 wb6Var) {
        wb6Var.getClass();
        np2 e = wb6Var.e();
        if (e instanceof dz4) {
            return by7.POLY_OBJ;
        }
        if (nb3.k(e, bt6.f)) {
            return by7.LIST;
        }
        if (nb3.k(e, bt6.g)) {
            wb6 b = b(wb6Var.j(0), id3Var.b);
            np2 e2 = b.e();
            if (!(e2 instanceof v25) && !nb3.k(e2, bc6.e)) {
                throw hi2.b(b);
            }
            return by7.MAP;
        }
        return by7.OBJ;
    }
}
