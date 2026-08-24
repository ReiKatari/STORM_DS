package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw6  reason: default package */
/* loaded from: classes.dex */
public final class mw6 implements qh1, r41 {
    public final /* synthetic */ ow6 A;
    public final rj0 B;
    public rj0 L;
    public py4 R = py4.Main;
    public final vt1 X = vt1.A;
    public final /* synthetic */ ow6 Y;

    public mw6(ow6 ow6Var, rj0 rj0Var) {
        this.Y = ow6Var;
        this.A = ow6Var;
        this.B = rj0Var;
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return f / this.A.a();
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a();
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.X;
    }

    public final Object c(py4 py4Var, d20 d20Var) {
        rj0 rj0Var = new rj0(1, np2.V(d20Var));
        rj0Var.v();
        this.R = py4Var;
        this.L = rj0Var;
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    public final long d() {
        ow6 ow6Var = this.Y;
        long v0 = ow6Var.v0(nc1.f0(ow6Var).w0.d());
        long j = ow6Var.u0;
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (v0 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (v0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L);
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.a() * f;
    }

    public final fo7 f() {
        return nc1.f0(this.Y).w0;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        ow6 ow6Var = this.Y;
        synchronized (ow6Var.r0) {
            ow6Var.q0.j(this);
        }
        this.B.i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, mw6] */
    /* JADX WARN: Type inference failed for: r10v1, types: [rc3] */
    /* JADX WARN: Type inference failed for: r10v4, types: [rc3] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [eo2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, eo2 eo2Var, s41 s41Var) {
        kw6 kw6Var;
        int i;
        rj0 rj0Var;
        try {
            if (s41Var instanceof kw6) {
                kw6Var = (kw6) s41Var;
                int i2 = kw6Var.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kw6Var.Z = i2 - Integer.MIN_VALUE;
                    Object obj = kw6Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = kw6Var.Z;
                    if (i == 0) {
                        if (i == 1) {
                            ap6 ap6Var = kw6Var.R;
                            oi2.Y(obj);
                            this = ap6Var;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        if (j <= 0 && (rj0Var = this.L) != null) {
                            rj0Var.i(new em5(new qy4(j)));
                        }
                        ap6 L = hv.L(this.Y.F0(), null, null, new jc0(j, this, null, 2), 3);
                        kw6Var.R = L;
                        kw6Var.Z = 1;
                        obj = eo2Var.o(this, kw6Var);
                        this = L;
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    this.h(nj0.B);
                    return obj;
                }
            }
            if (i == 0) {
            }
            this.h(nj0.B);
            return obj;
        } catch (Throwable th) {
            this.h(nj0.B);
            throw th;
        }
        kw6Var = new kw6(this, s41Var);
        Object obj2 = kw6Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kw6Var.Z;
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j, eo2 eo2Var, s41 s41Var) {
        lw6 lw6Var;
        int i;
        try {
            if (s41Var instanceof lw6) {
                lw6Var = (lw6) s41Var;
                int i2 = lw6Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lw6Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = lw6Var.R;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = lw6Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    lw6Var.Y = 1;
                    Object k = k(j, eo2Var, lw6Var);
                    if (k == obj2) {
                        return obj2;
                    }
                    return k;
                }
            }
            if (i == 0) {
            }
        } catch (qy4 unused) {
            return null;
        }
        lw6Var = new lw6(this, s41Var);
        Object obj3 = lw6Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = lw6Var.Y;
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}
