package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd3  reason: default package */
/* loaded from: classes.dex */
public final class zd3 extends nw7 {
    public final u0 t0;
    public final jd1 u0;

    public zd3(u0 u0Var, id3 id3Var) {
        id3Var.getClass();
        this.t0 = u0Var;
        this.u0 = id3Var.b;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int B() {
        u0 u0Var = this.t0;
        String m = u0Var.m();
        try {
            m.getClass();
            mf7 U = qo2.U(10, m);
            if (U != null) {
                return U.A;
            }
            xs6.a0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'UInt' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final long L() {
        u0 u0Var = this.t0;
        String m = u0Var.m();
        try {
            m.getClass();
            rf7 V = qo2.V(m);
            if (V != null) {
                return V.A;
            }
            xs6.a0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'ULong' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final byte Y() {
        u0 u0Var = this.t0;
        String m = u0Var.m();
        try {
            m.getClass();
            ze7 T = qo2.T(10, m);
            if (T != null) {
                return T.A;
            }
            xs6.a0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'UByte' for input '", m), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    @Override // defpackage.nw7, defpackage.sc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short Z() {
        xf7 xf7Var;
        u0 u0Var = this.t0;
        String m = u0Var.m();
        try {
            m.getClass();
            mf7 U = qo2.U(10, m);
            if (U != null) {
                int i = U.A;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    xf7Var = new xf7((short) i);
                    if (xf7Var == null) {
                        return xf7Var.A;
                    }
                    xs6.a0(m);
                    throw null;
                }
            }
            xf7Var = null;
            if (xf7Var == null) {
            }
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'UShort' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ux0
    public final jd1 b() {
        return this.u0;
    }

    @Override // defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        throw new IllegalStateException("unsupported");
    }
}
