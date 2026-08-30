package gk;

import j0.o1;
import java.io.IOException;
import java.util.ArrayList;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements e {
    public final q0 A;
    public final Object B;
    public final Object[] L;
    public final pi.x R;
    public final n X;
    public volatile boolean Y;
    public ti.n Z;

    /* renamed from: b0  reason: collision with root package name */
    public Throwable f5712b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f5713c0;

    public a0(q0 q0Var, Object obj, Object[] objArr, pi.x xVar, n nVar) {
        this.A = q0Var;
        this.B = obj;
        this.L = objArr;
        this.R = xVar;
        this.X = nVar;
    }

    public final ti.n a() {
        na.a0 a0Var;
        pi.r rVar;
        q0 q0Var = this.A;
        y0[] y0VarArr = q0Var.f5796j;
        Object[] objArr = this.L;
        int length = objArr.length;
        if (length == y0VarArr.length) {
            o0 o0Var = new o0(q0Var.f5789c, q0Var.f5788b, q0Var.f5790d, q0Var.f5791e, q0Var.f5792f, q0Var.f5793g, q0Var.f5794h, q0Var.f5795i);
            if (q0Var.f5797k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                y0VarArr[i2].a(o0Var, objArr[i2]);
            }
            na.a0 a0Var2 = o0Var.f5754d;
            if (a0Var2 != null) {
                rVar = a0Var2.b();
            } else {
                String str = o0Var.f5753c;
                pi.r rVar2 = o0Var.f5752b;
                rVar2.getClass();
                str.getClass();
                try {
                    a0Var = new na.a0(1);
                    a0Var.e(rVar2, str);
                } catch (IllegalArgumentException unused) {
                    a0Var = null;
                }
                if (a0Var != null) {
                    rVar = a0Var.b();
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    StringBuilder sb2 = new StringBuilder("Malformed URL. Base: ");
                    sb2.append(rVar2);
                    fj.j.k(sb2, ", Relative: ", o0Var.f5753c);
                    return null;
                }
            }
            n0 n0Var = o0Var.f5761k;
            if (n0Var == null) {
                p1.a0 a0Var3 = o0Var.f5760j;
                if (a0Var3 != null) {
                    n0Var = new pi.o((ArrayList) a0Var3.B, (ArrayList) a0Var3.L);
                } else {
                    c1 c1Var = o0Var.f5759i;
                    if (c1Var != null) {
                        ArrayList arrayList2 = (ArrayList) c1Var.L;
                        if (!arrayList2.isEmpty()) {
                            n0Var = new pi.v((fj.h) c1Var.A, (pi.t) c1Var.B, qi.g.i(arrayList2));
                        } else {
                            a0.j.p("Multipart body must have at least one part.");
                            return null;
                        }
                    } else if (o0Var.f5758h) {
                        int i10 = pi.b0.f11674a;
                        long j2 = 0;
                        qi.e.a(j2, j2, j2);
                        n0Var = new pi.a0(null, 0, new byte[0]);
                    }
                }
            }
            pi.t tVar = o0Var.f5757g;
            o1 o1Var = o0Var.f5756f;
            if (tVar != null) {
                if (n0Var != null) {
                    n0Var = new n0(n0Var, tVar);
                } else {
                    o1Var.b("Content-Type", tVar.f11792a);
                }
            }
            a7.v vVar = o0Var.f5755e;
            vVar.getClass();
            vVar.A = rVar;
            vVar.L = o1Var.f().c();
            vVar.u(o0Var.f5751a, n0Var);
            vVar.X = ((p7.o) vVar.X).n(nc.u.a(u.class), new u(this.B, q0Var.f5787a, arrayList));
            w.x0 x0Var = new w.x0(vVar);
            pi.x xVar = this.R;
            xVar.getClass();
            return new ti.n(xVar, x0Var);
        }
        a0.j.h(w.d.q(kc.a.i("Argument count (", length, ") doesn't match expected count ("), y0VarArr.length, ")"));
        return null;
    }

    public final ti.n b() {
        ti.n nVar = this.Z;
        if (nVar != null) {
            return nVar;
        }
        Throwable th2 = this.f5712b0;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            ti.n a10 = a();
            this.Z = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e6) {
            y0.r(e6);
            this.f5712b0 = e6;
            throw e6;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fj.f, java.lang.Object] */
    public final r0 c(pi.d0 d0Var) {
        pi.g0 g0Var = d0Var.Z;
        pi.c0 i2 = d0Var.i();
        i2.f11681g = new z(g0Var.i(), g0Var.d());
        pi.d0 a10 = i2.a();
        boolean z10 = a10.f11710k0;
        int i10 = a10.R;
        if (i10 >= 200 && i10 < 300) {
            if (i10 != 204 && i10 != 205) {
                y yVar = new y(g0Var);
                try {
                    Object g10 = this.X.g(yVar);
                    if (z10) {
                        return new r0(a10, g10);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e6) {
                    IOException iOException = yVar.X;
                    if (iOException == null) {
                        throw e6;
                    }
                    throw iOException;
                }
            } else if (z10) {
                return new r0(a10, null);
            } else {
                a0.j.h("rawResponse must be successful response");
                return null;
            }
        }
        try {
            g0Var.m().W(new Object());
            g0Var.i();
            g0Var.d();
            if (!z10) {
                return new r0(a10, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            g0Var.close();
        }
    }

    @Override // gk.e
    public final void cancel() {
        ti.n nVar;
        this.Y = true;
        synchronized (this) {
            nVar = this.Z;
        }
        if (nVar != null) {
            nVar.cancel();
        }
    }

    @Override // gk.e
    public final e clone() {
        return new a0(this.A, this.B, this.L, this.R, this.X);
    }

    @Override // gk.e
    public final void d(h hVar) {
        ti.n nVar;
        Throwable th2;
        synchronized (this) {
            try {
                if (!this.f5713c0) {
                    this.f5713c0 = true;
                    nVar = this.Z;
                    th2 = this.f5712b0;
                    if (nVar == null && th2 == null) {
                        ti.n a10 = a();
                        this.Z = a10;
                        nVar = a10;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th2 != null) {
            hVar.c(this, th2);
            return;
        }
        if (this.Y) {
            nVar.cancel();
        }
        nVar.e(new a0.g(18, this, hVar, false));
    }

    @Override // gk.e
    public final synchronized w.x0 i() {
        try {
        } catch (IOException e6) {
            throw new RuntimeException("Unable to create request.", e6);
        }
        return b().B;
    }

    @Override // gk.e
    public final boolean m() {
        boolean z10 = true;
        if (this.Y) {
            return true;
        }
        synchronized (this) {
            try {
                ti.n nVar = this.Z;
                if (nVar == null || !nVar.f13226j0) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Object m13clone() {
        return new a0(this.A, this.B, this.L, this.R, this.X);
    }
}
