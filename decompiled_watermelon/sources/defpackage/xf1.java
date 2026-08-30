package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xf1  reason: default package */
/* loaded from: classes.dex */
public final class xf1 implements f90 {
    public boolean A;
    public Object B;
    public Object L;
    public Object R;

    public xf1(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.L = randomUUID;
        String uuid = ((UUID) this.L).toString();
        uuid.getClass();
        this.B = new xh7(uuid, (ih7) null, cls.getName(), (String) null, (g81) null, (g81) null, 0L, 0L, 0L, (kz0) null, 0, (f00) null, 0L, 0L, 0L, 0L, false, (mf4) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.R = hi2.J(cls.getName());
    }

    public static IOException b(xf1 xf1Var, boolean z, IOException iOException, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iOException != null) {
            xf1Var.o(iOException);
        }
        w45 w45Var = (w45) xf1Var.L;
        if (z3 && !z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && !z) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3 && z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z2 && z) {
            z7 = true;
        } else {
            z7 = false;
        }
        return w45Var.j(xf1Var, z4, z5, z7, z6, iOException);
    }

    public void a() {
        gg1 gg1Var = (gg1) this.R;
        synchronized (gg1Var) {
            try {
                if (!this.A) {
                    if (b53.x(((zf1) this.L).g, this)) {
                        gg1Var.i(this, false);
                    }
                    this.A = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public id4 c() {
        boolean z;
        String str;
        if (this.A && ((xh7) this.B).j.d) {
            i.i("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        id4 id4Var = new id4((UUID) this.L, (xh7) this.B, (Set) this.R);
        kz0 kz0Var = ((xh7) this.B).j;
        if (kz0Var.i.isEmpty() && !kz0Var.e && !kz0Var.c && !kz0Var.d) {
            z = false;
        } else {
            z = true;
        }
        xh7 xh7Var = (xh7) this.B;
        if (xh7Var.q) {
            if (!z) {
                if (xh7Var.g > 0) {
                    i.i("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                i.i("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        String str2 = xh7Var.x;
        if (str2 == null) {
            List Q0 = zg6.Q0(xh7Var.c, new String[]{"."});
            if (Q0.size() == 1) {
                str = (String) Q0.get(0);
            } else {
                str = (String) tq0.T0(Q0);
            }
            if (str.length() > 127) {
                str = zg6.Y0(127, str);
            }
            xh7Var.x = str;
        } else if (str2.length() > 127) {
            ((xh7) this.B).x = zg6.Y0(127, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.L = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        xh7 xh7Var2 = (xh7) this.B;
        xh7Var2.getClass();
        this.B = new xh7(uuid, xh7Var2.b, xh7Var2.c, xh7Var2.d, new g81(xh7Var2.e), new g81(xh7Var2.f), xh7Var2.g, xh7Var2.h, xh7Var2.i, new kz0(xh7Var2.j), xh7Var2.k, xh7Var2.l, xh7Var2.m, xh7Var2.n, xh7Var2.o, xh7Var2.p, xh7Var2.q, xh7Var2.r, xh7Var2.s, xh7Var2.u, xh7Var2.v, xh7Var2.w, xh7Var2.x, xh7Var2.y, 524288);
        return id4Var;
    }

    @Override // defpackage.f90
    public void d(w45 w45Var, ec5 ec5Var) {
        ih0 ih0Var = (ih0) this.L;
        if (ec5Var.R == 401 && this.A) {
            ec5Var.close();
            tq5.A(mp1.A, new v74((x15) this.B, (az4) this.R, null, 8));
            ih0Var.k(new kc5(new Exception("User token expired")));
            return;
        }
        ih0Var.k(ec5Var);
    }

    public void e() {
        gg1 gg1Var = (gg1) this.R;
        synchronized (gg1Var) {
            try {
                if (!this.A) {
                    if (b53.x(((zf1) this.L).g, this)) {
                        gg1Var.i(this, true);
                    }
                    this.A = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(boolean z) {
        hg1 hg1Var = (hg1) this.R;
        synchronized (hg1Var) {
            try {
                if (!this.A) {
                    if (b53.x(((ag1) this.L).g, this)) {
                        hg1.d(hg1Var, this, z);
                    }
                    this.A = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g() {
        zf1 zf1Var = (zf1) this.L;
        if (b53.x(zf1Var.g, this)) {
            gg1 gg1Var = (gg1) this.R;
            if (gg1Var.g0) {
                gg1Var.i(this, false);
            } else {
                zf1Var.f = true;
            }
        }
    }

    public void h() {
        synchronized (this.L) {
            if (this.A) {
                this.A = false;
                this.R = null;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public jk4 i(int i) {
        jk4 jk4Var;
        hg1 hg1Var = (hg1) this.R;
        synchronized (hg1Var) {
            if (!this.A) {
                ((boolean[]) this.B)[i] = true;
                Object obj = ((ag1) this.L).d.get(i);
                fg1 fg1Var = hg1Var.k0;
                jk4 jk4Var2 = (jk4) obj;
                if (!fg1Var.C(jk4Var2)) {
                    k.a(fg1Var.K(jk4Var2));
                }
                jk4Var = (jk4) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return jk4Var;
    }

    public x45 j() {
        x45 x45Var;
        d22 f = ((e22) this.R).f();
        if (f instanceof x45) {
            x45Var = (x45) f;
        } else {
            x45Var = null;
        }
        if (x45Var != null) {
            return x45Var;
        }
        i.n("no connection for CONNECT tunnels");
        return null;
    }

    @Override // defpackage.f90
    public void k(w45 w45Var, IOException iOException) {
        ((ih0) this.L).k(new kc5(iOException));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [g76, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [g76, java.lang.Object] */
    public g76 l(int i) {
        gg1 gg1Var = (gg1) this.R;
        synchronized (gg1Var) {
            try {
                if (!this.A) {
                    if (!b53.x(((zf1) this.L).g, this)) {
                        return new Object();
                    }
                    if (!((zf1) this.L).e) {
                        boolean[] zArr = (boolean[]) this.B;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    jk4 jk4Var = (jk4) ((zf1) this.L).d.get(i);
                    try {
                        eg1 eg1Var = gg1Var.B;
                        eg1Var.getClass();
                        jk4Var.getClass();
                        return new c52(eg1Var.K(jk4Var), new x(22, gg1Var, this));
                    } catch (FileNotFoundException unused) {
                        return new Object();
                    }
                }
                throw new IllegalStateException("Check failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cc5 m(boolean z) {
        try {
            cc5 j = ((e22) this.R).j(z);
            if (j != null) {
                j.n = this;
                return j;
            }
            return j;
        } catch (IOException e) {
            o(e);
            throw e;
        }
    }

    public boolean n(String str) {
        String str2;
        boolean z;
        str.getClass();
        synchronized (this.L) {
            try {
                c25 c25Var = (c25) this.B;
                if (c25Var != null) {
                    str2 = c25Var.a;
                } else {
                    str2 = null;
                }
                if (!b53.x(str2, str)) {
                    z = false;
                } else {
                    this.B = null;
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public void o(IOException iOException) {
        this.A = true;
        ((e22) this.R).f().b((w45) this.L, iOException);
    }

    public boolean p() {
        boolean z;
        synchronized (this.L) {
            if (!this.A && ((c25) this.B) == null) {
                z = true;
                this.A = true;
                this.R = null;
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [k91, java.lang.Object] */
    public k91 q() {
        w45 w45Var = (w45) this.L;
        if (!w45Var.d0) {
            w45Var.d0 = true;
            w45Var.R.i();
            synchronized (w45Var) {
                if (w45Var.l0 != null) {
                    if (!w45Var.h0 && !w45Var.i0) {
                        if (!w45Var.f0) {
                            if (w45Var.g0) {
                                w45Var.g0 = false;
                                w45Var.h0 = true;
                                w45Var.i0 = true;
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            d22 f = ((e22) this.R).f();
            f.getClass();
            x45 x45Var = (x45) f;
            x45Var.e.setSoTimeout(0);
            x45Var.h();
            ?? obj = new Object();
            e22 e22Var = (e22) this.R;
            obj.A = new b22(this, e22Var.e().n(), -1L, true);
            obj.B = new c22(this, e22Var.e().j(), -1L, true);
            return obj;
        }
        i.n("Check failed.");
        return null;
    }

    public xf1(int i) {
        switch (i) {
            case 7:
                this.L = new Object();
                return;
            default:
                this.L = new Object();
                this.B = new ArrayList();
                this.R = new ArrayList();
                this.A = true;
                return;
        }
    }

    public xf1(hg1 hg1Var, ag1 ag1Var) {
        this.R = hg1Var;
        this.L = ag1Var;
        this.B = new boolean[2];
    }

    public xf1(gg1 gg1Var, zf1 zf1Var) {
        boolean[] zArr;
        this.R = gg1Var;
        this.L = zf1Var;
        if (zf1Var.e) {
            zArr = null;
        } else {
            gg1Var.getClass();
            zArr = new boolean[2];
        }
        this.B = zArr;
    }
}
