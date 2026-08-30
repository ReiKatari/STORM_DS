package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iz5 */
/* loaded from: classes.dex */
public final class iz5 {
    public final yy3 a;
    public final boolean b;
    public final vf3 c;
    public final ez5 d;
    public iz5 e;
    public final int f;

    public iz5(yy3 yy3Var, boolean z, vf3 vf3Var, ez5 ez5Var) {
        this.a = yy3Var;
        this.b = z;
        this.c = vf3Var;
        this.d = ez5Var;
        this.f = vf3Var.B;
    }

    public static /* synthetic */ List j(int i, iz5 iz5Var) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !iz5Var.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return iz5Var.i(z, z2);
    }

    public final y55 a(m74 m74Var) {
        yy3 yy3Var;
        iz5 l = l();
        if (l == null) {
            return y55.e;
        }
        yy3 yy3Var2 = (yy3) l.c.A0.g;
        m74 m74Var2 = null;
        if ((yy3Var2.R & 8) != 0) {
            loop0: while (yy3Var2 != null) {
                if ((yy3Var2.L & 8) != 0) {
                    yy3Var = yy3Var2;
                    o24 o24Var = null;
                    while (yy3Var != null) {
                        if (yy3Var instanceof gz5) {
                            if (((gz5) yy3Var).l()) {
                                break loop0;
                            }
                        } else if ((yy3Var.L & 8) != 0 && (yy3Var instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var3 = ((xc1) yy3Var).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var != null) {
                                            o24Var.b(yy3Var);
                                            yy3Var = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var = l.p(o24Var);
                    }
                }
                if ((yy3Var2.R & 8) == 0) {
                    break;
                }
                yy3Var2 = yy3Var2.Y;
            }
        }
        yy3Var = null;
        gz5 gz5Var = (gz5) yy3Var;
        if (gz5Var != null) {
            m74Var2 = l.N(gz5Var, 8);
        }
        if (m74Var2 == null) {
            return l.a(m74Var);
        }
        return m74Var2.L(m74Var, true);
    }

    public final iz5 b(og5 og5Var, mi2 mi2Var) {
        int i;
        ez5 ez5Var = new ez5();
        ez5Var.L = false;
        ez5Var.R = false;
        mi2Var.n(ez5Var);
        hz5 hz5Var = new hz5(mi2Var);
        int i2 = this.f;
        if (og5Var != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        iz5 iz5Var = new iz5(hz5Var, false, new vf3(i2 + i, true), ez5Var);
        iz5Var.e = this;
        return iz5Var;
    }

    public final void c(vf3 vf3Var, ArrayList arrayList) {
        o24 x = vf3Var.x();
        Object[] objArr = x.A;
        int i = x.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (vf3Var2.H() && !vf3Var2.J0) {
                if (vf3Var2.A0.g(8)) {
                    arrayList.add(ln2.l(vf3Var2, this.b));
                } else {
                    c(vf3Var2, arrayList);
                }
            }
        }
    }

    public final m74 d() {
        if (o()) {
            iz5 l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        gz5 f = f();
        if (f != null) {
            return l.N(f, 8);
        }
        return (vz2) this.c.A0.d;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            iz5 iz5Var = (iz5) arrayList.get(size2);
            if (iz5Var.p()) {
                arrayList2.add(iz5Var);
            } else if (!iz5Var.d.R) {
                iz5Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gz5 f() {
        yy3 yy3Var;
        boolean z;
        boolean z2 = this.d.L;
        gz5 gz5Var = null;
        vf3 vf3Var = this.c;
        if (z2) {
            yy3 yy3Var2 = (yy3) vf3Var.A0.g;
            if ((yy3Var2.R & 8) != 0) {
                yy3Var = null;
                while (yy3Var2 != null) {
                    if ((yy3Var2.L & 8) != 0) {
                        yy3 yy3Var3 = yy3Var2;
                        o24 o24Var = null;
                        while (yy3Var3 != null) {
                            if (yy3Var3 instanceof gz5) {
                                gz5 gz5Var2 = (gz5) yy3Var3;
                                if (gz5Var2.l()) {
                                    if (gz5Var2.t0()) {
                                        return gz5Var2;
                                    }
                                    if (yy3Var == null) {
                                        yy3Var = gz5Var2;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (yy3Var3.L & 8) != 0 && (yy3Var3 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var3 = yy3Var4;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var3 != null) {
                                                o24Var.b(yy3Var3);
                                                yy3Var3 = null;
                                            }
                                            o24Var.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var3 = l.p(o24Var);
                        }
                    }
                    if ((yy3Var2.R & 8) == 0) {
                        break;
                    }
                    yy3Var2 = yy3Var2.Y;
                }
                gz5Var = yy3Var;
            }
            return gz5Var;
        }
        yy3 yy3Var5 = (yy3) vf3Var.A0.g;
        if ((yy3Var5.R & 8) != 0) {
            loop3: while (yy3Var5 != null) {
                if ((yy3Var5.L & 8) != 0) {
                    yy3Var = yy3Var5;
                    o24 o24Var2 = null;
                    while (yy3Var != null) {
                        if (yy3Var instanceof gz5) {
                            if (((gz5) yy3Var).l()) {
                                gz5Var = yy3Var;
                            }
                        } else if ((yy3Var.L & 8) != 0 && (yy3Var instanceof xc1)) {
                            int i2 = 0;
                            for (yy3 yy3Var6 = ((xc1) yy3Var).k0; yy3Var6 != null; yy3Var6 = yy3Var6.Y) {
                                if ((yy3Var6.L & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        yy3Var = yy3Var6;
                                    } else {
                                        if (o24Var2 == null) {
                                            o24Var2 = new o24(new yy3[16]);
                                        }
                                        if (yy3Var != null) {
                                            o24Var2.b(yy3Var);
                                            yy3Var = null;
                                        }
                                        o24Var2.b(yy3Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        yy3Var = l.p(o24Var2);
                    }
                }
                if ((yy3Var5.R & 8) == 0) {
                    break;
                }
                yy3Var5 = yy3Var5.Y;
            }
        }
        return gz5Var;
    }

    public final y55 g() {
        m74 d = d();
        if (d != null) {
            if (!d.Y0().i0) {
                d = null;
            }
            if (d != null) {
                return me2.s(d).L(d, true);
            }
        }
        return y55.e;
    }

    public final y55 h() {
        m74 d = d();
        if (d != null) {
            if (!d.Y0().i0) {
                d = null;
            }
            if (d != null) {
                return me2.j(d, true);
            }
        }
        return y55.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.R) {
            return pp1.A;
        }
        ArrayList arrayList = new ArrayList();
        if (p()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return s(arrayList, z2);
    }

    public final ez5 k() {
        boolean p = p();
        ez5 ez5Var = this.d;
        if (p) {
            ez5 c = ez5Var.c();
            r(new ArrayList(), c);
            return c;
        }
        return ez5Var;
    }

    public final iz5 l() {
        vf3 vf3Var;
        iz5 iz5Var = this.e;
        if (iz5Var != null) {
            return iz5Var;
        }
        vf3 vf3Var2 = this.c;
        boolean z = this.b;
        if (z) {
            vf3Var = vf3Var2.u();
            while (vf3Var != null) {
                ez5 w = vf3Var.w();
                if (w != null && w.L) {
                    break;
                }
                vf3Var = vf3Var.u();
            }
        }
        vf3Var = null;
        if (vf3Var == null) {
            vf3 u = vf3Var2.u();
            while (true) {
                if (u != null) {
                    if (u.A0.g(8)) {
                        vf3Var = u;
                        break;
                    }
                    u = u.u();
                } else {
                    vf3Var = null;
                    break;
                }
            }
        }
        if (vf3Var == null) {
            return null;
        }
        return ln2.l(vf3Var, z);
    }

    public final y55 m() {
        boolean z;
        gz5 f = f();
        if (f == null) {
            return ((vz2) this.c.A0.d).u1();
        }
        yy3 yy3Var = ((yy3) f).A;
        Object g = this.d.A.g(dz5.b);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        return nl2.J(yy3Var, z, true);
    }

    public final ez5 n() {
        return this.d;
    }

    public final boolean o() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.b && this.d.L) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (!o() && j(4, this).isEmpty()) {
            vf3 u = this.c.u();
            while (true) {
                if (u != null) {
                    ez5 w = u.w();
                    if (w != null && w.L) {
                        break;
                    }
                    u = u.u();
                } else {
                    u = null;
                    break;
                }
            }
            if (u == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r(ArrayList arrayList, ez5 ez5Var) {
        if (!this.d.R) {
            s(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                iz5 iz5Var = (iz5) arrayList.get(size2);
                if (!iz5Var.p()) {
                    ez5Var.i(iz5Var.d);
                    iz5Var.r(arrayList, ez5Var);
                }
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        String str;
        if (o()) {
            return pp1.A;
        }
        c(this.c, arrayList);
        if (z) {
            ez5 ez5Var = this.d;
            d24 d24Var = ez5Var.A;
            Object g = d24Var.g(mz5.z);
            if (g == null) {
                g = null;
            }
            og5 og5Var = (og5) g;
            if (og5Var != null && ez5Var.L && !arrayList.isEmpty()) {
                arrayList.add(b(og5Var, new yb(22, og5Var)));
            }
            qz5 qz5Var = mz5.a;
            if (d24Var.c(qz5Var) && !arrayList.isEmpty() && ez5Var.L) {
                Object g2 = d24Var.g(qz5Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) tq0.M0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new yb(23, str)));
                }
            }
        }
        return arrayList;
    }
}
