package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk1  reason: default package */
/* loaded from: classes.dex */
public final class bk1 implements nb0 {
    public boolean A;
    public Object B;
    public Object L;
    public Object R;

    public bk1(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.L = randomUUID;
        String uuid = ((UUID) this.L).toString();
        uuid.getClass();
        this.B = new yw7(uuid, (iw7) null, cls.getName(), (String) null, (xb1) null, (xb1) null, 0L, 0L, 0L, (p21) null, 0, (w10) null, 0L, 0L, 0L, 0L, false, (oo4) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.R = ii2.G(cls.getName());
    }

    public static IOException b(bk1 bk1Var, boolean z, IOException iOException, int i) {
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
            bk1Var.o(iOException);
        }
        je5 je5Var = (je5) bk1Var.L;
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
        return je5Var.i(bk1Var, z4, z5, z7, z6, iOException);
    }

    public void a() {
        kk1 kk1Var = (kk1) this.R;
        synchronized (kk1Var) {
            try {
                if (!this.A) {
                    if (nb3.k(((dk1) this.L).g, this)) {
                        kk1Var.h(this, false);
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

    public gm4 c() {
        boolean z;
        String str;
        if (this.A && ((yw7) this.B).j.d) {
            i.h("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        gm4 gm4Var = new gm4((UUID) this.L, (yw7) this.B, (Set) this.R);
        p21 p21Var = ((yw7) this.B).j;
        if (p21Var.i.isEmpty() && !p21Var.e && !p21Var.c && !p21Var.d) {
            z = false;
        } else {
            z = true;
        }
        yw7 yw7Var = (yw7) this.B;
        if (yw7Var.q) {
            if (!z) {
                if (yw7Var.g > 0) {
                    i.h("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                i.h("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        String str2 = yw7Var.x;
        if (str2 == null) {
            List K0 = qs6.K0(yw7Var.c, new String[]{"."}, 6);
            if (K0.size() == 1) {
                str = (String) K0.get(0);
            } else {
                str = (String) gt0.Q0(K0);
            }
            if (str.length() > 127) {
                str = qs6.S0(127, str);
            }
            yw7Var.x = str;
        } else if (str2.length() > 127) {
            ((yw7) this.B).x = qs6.S0(127, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.L = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        yw7 yw7Var2 = (yw7) this.B;
        yw7Var2.getClass();
        this.B = new yw7(uuid, yw7Var2.b, yw7Var2.c, yw7Var2.d, new xb1(yw7Var2.e), new xb1(yw7Var2.f), yw7Var2.g, yw7Var2.h, yw7Var2.i, new p21(yw7Var2.j), yw7Var2.k, yw7Var2.l, yw7Var2.m, yw7Var2.n, yw7Var2.o, yw7Var2.p, yw7Var2.q, yw7Var2.r, yw7Var2.s, yw7Var2.u, yw7Var2.v, yw7Var2.w, yw7Var2.x, yw7Var2.y, 524288);
        return gm4Var;
    }

    public void d() {
        kk1 kk1Var = (kk1) this.R;
        synchronized (kk1Var) {
            try {
                if (!this.A) {
                    if (nb3.k(((dk1) this.L).g, this)) {
                        kk1Var.h(this, true);
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

    public void e(boolean z) {
        lk1 lk1Var = (lk1) this.R;
        synchronized (lk1Var) {
            try {
                if (!this.A) {
                    if (nb3.k(((ek1) this.L).g, this)) {
                        lk1.e(lk1Var, this, z);
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

    @Override // defpackage.nb0
    public void f(je5 je5Var, wl5 wl5Var) {
        rj0 rj0Var = (rj0) this.L;
        if (wl5Var.R == 401 && this.A) {
            wl5Var.close();
            hv.V(vt1.A, new bf4((hb5) this.B, (l85) this.R, null, 9));
            rj0Var.i(new em5(new Exception("User token expired")));
            return;
        }
        rj0Var.i(wl5Var);
    }

    public void g() {
        dk1 dk1Var = (dk1) this.L;
        if (nb3.k(dk1Var.g, this)) {
            kk1 kk1Var = (kk1) this.R;
            if (kk1Var.h0) {
                kk1Var.h(this, false);
            } else {
                dk1Var.f = true;
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

    public lt4 i(int i) {
        lt4 lt4Var;
        lk1 lk1Var = (lk1) this.R;
        synchronized (lk1Var) {
            if (!this.A) {
                ((boolean[]) this.B)[i] = true;
                Object obj = ((ek1) this.L).d.get(i);
                jk1 jk1Var = lk1Var.l0;
                lt4 lt4Var2 = (lt4) obj;
                if (!jk1Var.v(lt4Var2)) {
                    k.a(jk1Var.J(lt4Var2));
                }
                lt4Var = (lt4) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return lt4Var;
    }

    public ke5 j() {
        ke5 ke5Var;
        u62 i = ((v62) this.R).i();
        if (i instanceof ke5) {
            ke5Var = (ke5) i;
        } else {
            ke5Var = null;
        }
        if (ke5Var != null) {
            return ke5Var;
        }
        i.m("no connection for CONNECT tunnels");
        return null;
    }

    @Override // defpackage.nb0
    public void k(je5 je5Var, IOException iOException) {
        ((rj0) this.L).i(new em5(iOException));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [ui6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ui6, java.lang.Object] */
    public ui6 l(int i) {
        kk1 kk1Var = (kk1) this.R;
        synchronized (kk1Var) {
            try {
                if (!this.A) {
                    if (!nb3.k(((dk1) this.L).g, this)) {
                        return new Object();
                    }
                    if (!((dk1) this.L).e) {
                        boolean[] zArr = (boolean[]) this.B;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    lt4 lt4Var = (lt4) ((dk1) this.L).d.get(i);
                    try {
                        ik1 ik1Var = kk1Var.B;
                        ik1Var.getClass();
                        lt4Var.getClass();
                        return new v92(ik1Var.J(lt4Var), new y(23, kk1Var, this));
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

    public ul5 m(boolean z) {
        try {
            ul5 f = ((v62) this.R).f(z);
            if (f != null) {
                f.n = this;
                return f;
            }
            return f;
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
                mb5 mb5Var = (mb5) this.B;
                if (mb5Var != null) {
                    str2 = mb5Var.a;
                } else {
                    str2 = null;
                }
                if (!nb3.k(str2, str)) {
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
        ((v62) this.R).i().f((je5) this.L, iOException);
    }

    public boolean p() {
        boolean z;
        synchronized (this.L) {
            if (!this.A && ((mb5) this.B) == null) {
                z = true;
                this.A = true;
                this.R = null;
            }
            z = false;
        }
        return z;
    }

    public bt q() {
        je5 je5Var = (je5) this.L;
        if (!je5Var.f0) {
            je5Var.f0 = true;
            je5Var.X.j();
            synchronized (je5Var) {
                if (je5Var.n0 != null) {
                    if (!je5Var.j0 && !je5Var.k0) {
                        if (!je5Var.h0) {
                            if (je5Var.i0) {
                                je5Var.i0 = false;
                                je5Var.j0 = true;
                                je5Var.k0 = true;
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
            u62 i = ((v62) this.R).i();
            i.getClass();
            ke5 ke5Var = (ke5) i;
            ke5Var.e.setSoTimeout(0);
            ke5Var.e();
            return new bt(this);
        }
        i.m("Check failed.");
        return null;
    }

    public bk1(int i) {
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

    public bk1(lk1 lk1Var, ek1 ek1Var) {
        this.R = lk1Var;
        this.L = ek1Var;
        this.B = new boolean[2];
    }

    public bk1(kk1 kk1Var, dk1 dk1Var) {
        boolean[] zArr;
        this.R = kk1Var;
        this.L = dk1Var;
        if (dk1Var.e) {
            zArr = null;
        } else {
            kk1Var.getClass();
            zArr = new boolean[2];
        }
        this.B = zArr;
    }
}
