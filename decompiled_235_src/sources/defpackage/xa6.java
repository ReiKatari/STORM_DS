package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa6 */
/* loaded from: classes.dex */
public final class xa6 {
    public final z64 a;
    public final boolean b;
    public final sm3 c;
    public final ta6 d;
    public xa6 e;
    public final int f;

    public xa6(z64 z64Var, boolean z, sm3 sm3Var, ta6 ta6Var) {
        this.a = z64Var;
        this.b = z;
        this.c = sm3Var;
        this.d = ta6Var;
        this.f = sm3Var.B;
    }

    public static /* synthetic */ List j(int i, xa6 xa6Var) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !xa6Var.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return xa6Var.i(z, z2);
    }

    public final of5 a(eg4 eg4Var) {
        z64 z64Var;
        xa6 l = l();
        if (l == null) {
            return of5.e;
        }
        z64 z64Var2 = (z64) l.c.B0.g;
        eg4 eg4Var2 = null;
        if ((z64Var2.R & 8) != 0) {
            loop0: while (z64Var2 != null) {
                if ((z64Var2.L & 8) != 0) {
                    z64Var = z64Var2;
                    ua4 ua4Var = null;
                    while (z64Var != null) {
                        if (z64Var instanceof va6) {
                            if (((va6) z64Var).j()) {
                                break loop0;
                            }
                        } else if ((z64Var.L & 8) != 0 && (z64Var instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var3 = ((zg1) z64Var).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var != null) {
                                            ua4Var.b(z64Var);
                                            z64Var = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var = nc1.A(ua4Var);
                    }
                }
                if ((z64Var2.R & 8) == 0) {
                    break;
                }
                z64Var2 = z64Var2.Y;
            }
        }
        z64Var = null;
        va6 va6Var = (va6) z64Var;
        if (va6Var != null) {
            eg4Var2 = nc1.d0(va6Var, 8);
        }
        if (eg4Var2 == null) {
            return l.a(eg4Var);
        }
        return eg4Var2.O(eg4Var, true);
    }

    public final xa6 b(mq5 mq5Var, qn2 qn2Var) {
        int i;
        ta6 ta6Var = new ta6();
        ta6Var.L = false;
        ta6Var.R = false;
        qn2Var.g(ta6Var);
        wa6 wa6Var = new wa6(qn2Var);
        int i2 = this.f;
        if (mq5Var != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        xa6 xa6Var = new xa6(wa6Var, false, new sm3(true, i2 + i), ta6Var);
        xa6Var.e = this;
        return xa6Var;
    }

    public final void c(sm3 sm3Var, ArrayList arrayList) {
        ua4 y = sm3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (sm3Var2.H() && !sm3Var2.K0) {
                if (sm3Var2.B0.g(8)) {
                    arrayList.add(kn2.h(sm3Var2, this.b));
                } else {
                    c(sm3Var2, arrayList);
                }
            }
        }
    }

    public final eg4 d() {
        if (o()) {
            xa6 l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        va6 f = f();
        if (f != null) {
            return nc1.d0(f, 8);
        }
        return (y53) this.c.B0.d;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            xa6 xa6Var = (xa6) arrayList.get(size2);
            if (xa6Var.p()) {
                arrayList2.add(xa6Var);
            } else if (!xa6Var.d.R) {
                xa6Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final va6 f() {
        z64 z64Var;
        boolean z;
        boolean z2 = this.d.L;
        va6 va6Var = null;
        sm3 sm3Var = this.c;
        if (z2) {
            z64 z64Var2 = (z64) sm3Var.B0.g;
            if ((z64Var2.R & 8) != 0) {
                z64Var = null;
                while (z64Var2 != null) {
                    if ((z64Var2.L & 8) != 0) {
                        z64 z64Var3 = z64Var2;
                        ua4 ua4Var = null;
                        while (z64Var3 != null) {
                            if (z64Var3 instanceof va6) {
                                va6 va6Var2 = (va6) z64Var3;
                                if (va6Var2.j()) {
                                    if (va6Var2.C0()) {
                                        return va6Var2;
                                    }
                                    if (z64Var == null) {
                                        z64Var = va6Var2;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (z64Var3.L & 8) != 0 && (z64Var3 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var3 = z64Var4;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var3 != null) {
                                                ua4Var.b(z64Var3);
                                                z64Var3 = null;
                                            }
                                            ua4Var.b(z64Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var3 = nc1.A(ua4Var);
                        }
                    }
                    if ((z64Var2.R & 8) == 0) {
                        break;
                    }
                    z64Var2 = z64Var2.Y;
                }
                va6Var = z64Var;
            }
            return va6Var;
        }
        z64 z64Var5 = (z64) sm3Var.B0.g;
        if ((z64Var5.R & 8) != 0) {
            loop3: while (z64Var5 != null) {
                if ((z64Var5.L & 8) != 0) {
                    z64Var = z64Var5;
                    ua4 ua4Var2 = null;
                    while (z64Var != null) {
                        if (z64Var instanceof va6) {
                            if (((va6) z64Var).j()) {
                                va6Var = z64Var;
                            }
                        } else if ((z64Var.L & 8) != 0 && (z64Var instanceof zg1)) {
                            int i2 = 0;
                            for (z64 z64Var6 = ((zg1) z64Var).l0; z64Var6 != null; z64Var6 = z64Var6.Y) {
                                if ((z64Var6.L & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        z64Var = z64Var6;
                                    } else {
                                        if (ua4Var2 == null) {
                                            ua4Var2 = new ua4(new z64[16]);
                                        }
                                        if (z64Var != null) {
                                            ua4Var2.b(z64Var);
                                            z64Var = null;
                                        }
                                        ua4Var2.b(z64Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        z64Var = nc1.A(ua4Var2);
                    }
                }
                if ((z64Var5.R & 8) == 0) {
                    break;
                }
                z64Var5 = z64Var5.Y;
            }
        }
        return va6Var;
    }

    public final of5 g() {
        eg4 d = d();
        if (d != null) {
            if (!d.Y0().j0) {
                d = null;
            }
            if (d != null) {
                return ej2.w(d).O(d, true);
            }
        }
        return of5.e;
    }

    public final of5 h() {
        eg4 d = d();
        if (d != null) {
            if (!d.Y0().j0) {
                d = null;
            }
            if (d != null) {
                return ej2.k(d, true);
            }
        }
        return of5.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.R) {
            return yt1.A;
        }
        ArrayList arrayList = new ArrayList();
        if (p()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return s(arrayList, z2);
    }

    public final ta6 k() {
        boolean p = p();
        ta6 ta6Var = this.d;
        if (p) {
            ta6 b = ta6Var.b();
            r(new ArrayList(), b);
            return b;
        }
        return ta6Var;
    }

    public final xa6 l() {
        sm3 sm3Var;
        xa6 xa6Var = this.e;
        if (xa6Var != null) {
            return xa6Var;
        }
        sm3 sm3Var2 = this.c;
        boolean z = this.b;
        if (z) {
            sm3Var = sm3Var2.v();
            while (sm3Var != null) {
                ta6 x = sm3Var.x();
                if (x != null && x.L) {
                    break;
                }
                sm3Var = sm3Var.v();
            }
        }
        sm3Var = null;
        if (sm3Var == null) {
            sm3 v = sm3Var2.v();
            while (true) {
                if (v != null) {
                    if (v.B0.g(8)) {
                        sm3Var = v;
                        break;
                    }
                    v = v.v();
                } else {
                    sm3Var = null;
                    break;
                }
            }
        }
        if (sm3Var == null) {
            return null;
        }
        return kn2.h(sm3Var, z);
    }

    public final of5 m() {
        boolean z;
        va6 f = f();
        if (f == null) {
            return ((y53) this.c.B0.d).u1();
        }
        z64 z64Var = ((z64) f).A;
        Object g = this.d.A.g(sa6.b);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        return bl2.t(z64Var, z, true);
    }

    public final ta6 n() {
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
            sm3 v = this.c.v();
            while (true) {
                if (v != null) {
                    ta6 x = v.x();
                    if (x != null && x.L) {
                        break;
                    }
                    v = v.v();
                } else {
                    v = null;
                    break;
                }
            }
            if (v == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r(ArrayList arrayList, ta6 ta6Var) {
        if (!this.d.R) {
            s(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                xa6 xa6Var = (xa6) arrayList.get(size2);
                if (!xa6Var.p()) {
                    ta6Var.d(xa6Var.d);
                    xa6Var.r(arrayList, ta6Var);
                }
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        String str;
        if (o()) {
            return yt1.A;
        }
        c(this.c, arrayList);
        if (z) {
            ta6 ta6Var = this.d;
            ja4 ja4Var = ta6Var.A;
            Object g = ja4Var.g(bb6.z);
            if (g == null) {
                g = null;
            }
            mq5 mq5Var = (mq5) g;
            if (mq5Var != null && ta6Var.L && !arrayList.isEmpty()) {
                arrayList.add(b(mq5Var, new mc(mq5Var, 21)));
            }
            fb6 fb6Var = bb6.a;
            if (ja4Var.c(fb6Var) && !arrayList.isEmpty() && ta6Var.L) {
                Object g2 = ja4Var.g(fb6Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) gt0.J0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new mc(str, 22)));
                }
            }
        }
        return arrayList;
    }
}
