package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ho3  reason: default package */
/* loaded from: classes.dex */
public final class ho3 {
    public static boolean q = false;
    public final zt4 d;
    public final os m;
    public gu p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ob6[] n = new ob6[1000];
    public int o = 0;
    public gu[] g = new gu[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [zt4, gu] */
    public ho3() {
        s();
        os osVar = new os(7, false);
        osVar.B = new pq4();
        osVar.L = new pq4();
        osVar.R = new ob6[32];
        this.m = osVar;
        ?? guVar = new gu(osVar);
        guVar.f = new ob6[128];
        guVar.g = new ob6[128];
        guVar.h = 0;
        guVar.i = new ci3((zt4) guVar);
        this.d = guVar;
        this.p = new gu(osVar);
    }

    public static int n(Object obj) {
        ob6 ob6Var = ((cy0) obj).i;
        if (ob6Var != null) {
            return (int) (ob6Var.X + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final ob6 a(nb6 nb6Var) {
        pq4 pq4Var = (pq4) this.m.L;
        int i = pq4Var.b;
        ob6 ob6Var = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = pq4Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            pq4Var.b = i2;
            ob6Var = r4;
        }
        ob6 ob6Var2 = ob6Var;
        if (ob6Var2 == null) {
            ob6Var2 = new ob6(nb6Var);
            ob6Var2.d0 = nb6Var;
        } else {
            ob6Var2.c();
            ob6Var2.d0 = nb6Var;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (ob6[]) Arrays.copyOf(this.n, i5);
        }
        ob6[] ob6VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        ob6VarArr[i6] = ob6Var2;
        return ob6Var2;
    }

    public final void b(ob6 ob6Var, ob6 ob6Var2, int i, float f, ob6 ob6Var3, ob6 ob6Var4, int i2, int i3) {
        gu l = l();
        if (ob6Var2 == ob6Var3) {
            l.d.g(ob6Var, 1.0f);
            l.d.g(ob6Var4, 1.0f);
            l.d.g(ob6Var2, -2.0f);
        } else {
            int i4 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            yt ytVar = l.d;
            if (i4 == 0) {
                ytVar.g(ob6Var, 1.0f);
                l.d.g(ob6Var2, -1.0f);
                l.d.g(ob6Var3, -1.0f);
                l.d.g(ob6Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= RecyclerView.A1) {
                ytVar.g(ob6Var, -1.0f);
                l.d.g(ob6Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                ytVar.g(ob6Var4, -1.0f);
                l.d.g(ob6Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                ytVar.g(ob6Var, f2 * 1.0f);
                l.d.g(ob6Var2, f2 * (-1.0f));
                l.d.g(ob6Var3, (-1.0f) * f);
                l.d.g(ob6Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
        if (r4.g0 <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r4.g0 <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
        if (r4.g0 <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0101, code lost:
        if (r4.g0 <= 1) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gu r18) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho3.c(gu):void");
    }

    public final void d(ob6 ob6Var, int i) {
        int i2 = ob6Var.L;
        if (i2 == -1) {
            ob6Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ob6 ob6Var2 = ((ob6[]) this.m.R)[i3];
            }
        } else if (i2 != -1) {
            gu guVar = this.g[i2];
            if (guVar.e) {
                guVar.b = i;
            } else if (guVar.d.d() == 0) {
                guVar.e = true;
                guVar.b = i;
            } else {
                gu l = l();
                if (i < 0) {
                    l.b = i * (-1);
                    l.d.g(ob6Var, 1.0f);
                } else {
                    l.b = i;
                    l.d.g(ob6Var, -1.0f);
                }
                c(l);
            }
        } else {
            gu l2 = l();
            l2.a = ob6Var;
            float f = i;
            ob6Var.X = f;
            l2.b = f;
            l2.e = true;
            c(l2);
        }
    }

    public final void e(ob6 ob6Var, ob6 ob6Var2, int i, int i2) {
        if (i2 == 8 && ob6Var2.Y && ob6Var.L == -1) {
            ob6Var.d(this, ob6Var2.X + i);
            return;
        }
        gu l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        yt ytVar = l.d;
        if (!z) {
            ytVar.g(ob6Var, -1.0f);
            l.d.g(ob6Var2, 1.0f);
        } else {
            ytVar.g(ob6Var, 1.0f);
            l.d.g(ob6Var2, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(ob6 ob6Var, ob6 ob6Var2, int i, int i2) {
        gu l = l();
        ob6 m = m();
        m.R = 0;
        l.b(ob6Var, ob6Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(ob6 ob6Var, ob6 ob6Var2, int i, int i2) {
        gu l = l();
        ob6 m = m();
        m.R = 0;
        l.c(ob6Var, ob6Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(gu guVar) {
        int i;
        if (guVar.e) {
            guVar.a.d(this, guVar.b);
        } else {
            gu[] guVarArr = this.g;
            int i2 = this.k;
            guVarArr[i2] = guVar;
            ob6 ob6Var = guVar.a;
            ob6Var.L = i2;
            this.k = i2 + 1;
            ob6Var.e(this, guVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                gu guVar2 = this.g[i3];
                if (guVar2 != null && guVar2.e) {
                    guVar2.a.d(this, guVar2.b);
                    ((pq4) this.m.B).b(guVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        gu[] guVarArr2 = this.g;
                        int i6 = i4 - 1;
                        gu guVar3 = guVarArr2[i4];
                        guVarArr2[i6] = guVar3;
                        ob6 ob6Var2 = guVar3.a;
                        if (ob6Var2.L == i4) {
                            ob6Var2.L = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            gu guVar = this.g[i];
            guVar.a.X = guVar.b;
        }
    }

    public final ob6 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ob6 a = a(nb6.ERROR);
        float[] fArr = a.c0;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.B = i2;
        a.R = i;
        ((ob6[]) this.m.R)[i2] = a;
        zt4 zt4Var = this.d;
        zt4Var.i.B = a;
        Arrays.fill(fArr, (float) RecyclerView.A1);
        fArr[a.R] = 1.0f;
        zt4Var.j(a);
        return a;
    }

    public final ob6 k(Object obj) {
        if (obj != null) {
            if (this.j + 1 >= this.f) {
                o();
            }
            if (obj instanceof cy0) {
                cy0 cy0Var = (cy0) obj;
                ob6 ob6Var = cy0Var.i;
                if (ob6Var == null) {
                    cy0Var.k();
                    ob6Var = cy0Var.i;
                }
                int i = ob6Var.B;
                os osVar = this.m;
                if (i != -1 && i <= this.c && ((ob6[]) osVar.R)[i] != null) {
                    return ob6Var;
                }
                if (i != -1) {
                    ob6Var.c();
                }
                int i2 = this.c + 1;
                this.c = i2;
                this.j++;
                ob6Var.B = i2;
                ob6Var.d0 = nb6.UNRESTRICTED;
                ((ob6[]) osVar.R)[i2] = ob6Var;
                return ob6Var;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final gu l() {
        gu guVar;
        os osVar = this.m;
        pq4 pq4Var = (pq4) osVar.B;
        int i = pq4Var.b;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = pq4Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            pq4Var.b = i2;
            guVar = r4;
        } else {
            guVar = null;
        }
        gu guVar2 = guVar;
        if (guVar2 == null) {
            return new gu(osVar);
        }
        guVar2.a = null;
        guVar2.d.b();
        guVar2.b = RecyclerView.A1;
        guVar2.e = false;
        return guVar2;
    }

    public final ob6 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ob6 a = a(nb6.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.B = i;
        ((ob6[]) this.m.R)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (gu[]) Arrays.copyOf(this.g, i);
        os osVar = this.m;
        osVar.R = (ob6[]) Arrays.copyOf((ob6[]) osVar.R, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        zt4 zt4Var = this.d;
        if (zt4Var.e()) {
            i();
        } else if (this.h) {
            for (int i = 0; i < this.k; i++) {
                if (!this.g[i].e) {
                    q(zt4Var);
                    return;
                }
            }
            i();
        } else {
            q(zt4Var);
        }
    }

    public final void q(zt4 zt4Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            gu guVar = this.g[i];
            if (guVar.a.d0 != nb6.UNRESTRICTED) {
                float f = guVar.b;
                float f2 = RecyclerView.A1;
                if (f < RecyclerView.A1) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.k) {
                            gu guVar2 = this.g[i5];
                            if (guVar2.a.d0 != nb6.UNRESTRICTED && !guVar2.e && guVar2.b < f2) {
                                int d = guVar2.d.d();
                                int i7 = 0;
                                while (i7 < d) {
                                    ob6 e = guVar2.d.e(i7);
                                    float c = guVar2.d.c(e);
                                    if (c > f2) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = e.Z[i8] / c;
                                            if ((f4 < f3 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = e.B;
                                                i3 = i5;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f2 = RecyclerView.A1;
                                }
                            }
                            i5++;
                            f2 = RecyclerView.A1;
                        }
                        if (i3 != -1) {
                            gu guVar3 = this.g[i3];
                            guVar3.a.L = -1;
                            guVar3.g(((ob6[]) this.m.R)[i4]);
                            ob6 ob6Var = guVar3.a;
                            ob6Var.L = i3;
                            ob6Var.e(this, guVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f2 = RecyclerView.A1;
                    }
                }
            }
            i++;
        }
        r(zt4Var);
        i();
    }

    public final void r(gu guVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 < this.j * 2) {
                ob6 ob6Var = guVar.a;
                if (ob6Var != null) {
                    this.i[ob6Var.B] = true;
                }
                ob6 d = guVar.d(this.i);
                if (d != null) {
                    boolean[] zArr = this.i;
                    int i4 = d.B;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d != null) {
                    float f = Float.MAX_VALUE;
                    int i5 = i;
                    int i6 = -1;
                    while (i5 < this.k) {
                        gu guVar2 = this.g[i5];
                        if (guVar2.a.d0 != nb6.UNRESTRICTED && !guVar2.e) {
                            yt ytVar = guVar2.d;
                            int i7 = ytVar.h;
                            if (i7 != -1) {
                                for (int i8 = i; i7 != -1 && i8 < ytVar.a; i8++) {
                                    if (ytVar.e[i7] == d.B) {
                                        z = true;
                                        break;
                                    }
                                    i7 = ytVar.f[i7];
                                }
                            }
                            z = false;
                            if (z) {
                                float c = guVar2.d.c(d);
                                if (c < RecyclerView.A1) {
                                    float f2 = (-guVar2.b) / c;
                                    if (f2 < f) {
                                        i6 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        i5++;
                        i = 0;
                    }
                    if (i6 > -1) {
                        gu guVar3 = this.g[i6];
                        guVar3.a.L = -1;
                        guVar3.g(d);
                        ob6 ob6Var2 = guVar3.a;
                        ob6Var2.L = i6;
                        ob6Var2.e(this, guVar3);
                    }
                } else {
                    z2 = true;
                }
                i = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            gu guVar = this.g[i];
            if (guVar != null) {
                ((pq4) this.m.B).b(guVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        os osVar;
        int i = 0;
        while (true) {
            osVar = this.m;
            ob6[] ob6VarArr = (ob6[]) osVar.R;
            if (i >= ob6VarArr.length) {
                break;
            }
            ob6 ob6Var = ob6VarArr[i];
            if (ob6Var != null) {
                ob6Var.c();
            }
            i++;
        }
        pq4 pq4Var = (pq4) osVar.L;
        ob6[] ob6VarArr2 = this.n;
        int i2 = this.o;
        pq4Var.getClass();
        if (i2 > ob6VarArr2.length) {
            i2 = ob6VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ob6 ob6Var2 = ob6VarArr2[i3];
            int i4 = pq4Var.b;
            Object[] objArr = pq4Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = ob6Var2;
                pq4Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ob6[]) osVar.R, (Object) null);
        this.c = 0;
        zt4 zt4Var = this.d;
        zt4Var.h = 0;
        zt4Var.b = RecyclerView.A1;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            gu guVar = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new gu(osVar);
    }
}
