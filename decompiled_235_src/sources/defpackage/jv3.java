package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv3  reason: default package */
/* loaded from: classes.dex */
public final class jv3 {
    public static boolean q = false;
    public final c35 d;
    public final bt m;
    public yu p;
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
    public en6[] n = new en6[1000];
    public int o = 0;
    public yu[] g = new yu[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [c35, yu] */
    public jv3() {
        s();
        bt btVar = new bt(8, false);
        btVar.B = new tz4();
        btVar.L = new tz4();
        btVar.R = new en6[32];
        this.m = btVar;
        ?? yuVar = new yu(btVar);
        yuVar.f = new en6[128];
        yuVar.g = new en6[128];
        yuVar.h = 0;
        yuVar.i = new ap3((c35) yuVar);
        this.d = yuVar;
        this.p = new yu(btVar);
    }

    public static int n(Object obj) {
        en6 en6Var = ((h11) obj).i;
        if (en6Var != null) {
            return (int) (en6Var.X + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final en6 a(dn6 dn6Var) {
        tz4 tz4Var = (tz4) this.m.L;
        int i = tz4Var.b;
        en6 en6Var = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = tz4Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            tz4Var.b = i2;
            en6Var = r4;
        }
        en6 en6Var2 = en6Var;
        if (en6Var2 == null) {
            en6Var2 = new en6(dn6Var);
            en6Var2.e0 = dn6Var;
        } else {
            en6Var2.c();
            en6Var2.e0 = dn6Var;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (en6[]) Arrays.copyOf(this.n, i5);
        }
        en6[] en6VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        en6VarArr[i6] = en6Var2;
        return en6Var2;
    }

    public final void b(en6 en6Var, en6 en6Var2, int i, float f, en6 en6Var3, en6 en6Var4, int i2, int i3) {
        yu l = l();
        if (en6Var2 == en6Var3) {
            l.d.g(en6Var, 1.0f);
            l.d.g(en6Var4, 1.0f);
            l.d.g(en6Var2, -2.0f);
        } else {
            int i4 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            qu quVar = l.d;
            if (i4 == 0) {
                quVar.g(en6Var, 1.0f);
                l.d.g(en6Var2, -1.0f);
                l.d.g(en6Var3, -1.0f);
                l.d.g(en6Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= RecyclerView.B1) {
                quVar.g(en6Var, -1.0f);
                l.d.g(en6Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                quVar.g(en6Var4, -1.0f);
                l.d.g(en6Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                quVar.g(en6Var, f2 * 1.0f);
                l.d.g(en6Var2, f2 * (-1.0f));
                l.d.g(en6Var3, (-1.0f) * f);
                l.d.g(en6Var4, 1.0f * f);
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
        if (r4.h0 <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r4.h0 <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
        if (r4.h0 <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0101, code lost:
        if (r4.h0 <= 1) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(yu yuVar) {
        boolean z;
        boolean z2;
        en6 en6Var;
        en6 f;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (!yuVar.e) {
            ArrayList arrayList = yuVar.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = yuVar.d.d();
                    for (int i = 0; i < d; i++) {
                        en6 e = yuVar.d.e(i);
                        if (e.L != -1 || e.Y) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            en6 en6Var2 = (en6) arrayList.get(i2);
                            if (en6Var2.Y) {
                                yuVar.h(this, en6Var2, true);
                            } else {
                                yuVar.i(this, this.g[en6Var2.L], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (yuVar.a != null && yuVar.d.d() == 0) {
                    yuVar.e = true;
                    this.b = true;
                }
            }
            if (!yuVar.e()) {
                float f2 = yuVar.b;
                float f3 = RecyclerView.B1;
                if (f2 < RecyclerView.B1) {
                    yuVar.b = f2 * (-1.0f);
                    qu quVar = yuVar.d;
                    int i3 = quVar.h;
                    for (int i4 = 0; i3 != -1 && i4 < quVar.a; i4++) {
                        float[] fArr = quVar.g;
                        fArr[i3] = fArr[i3] * (-1.0f);
                        i3 = quVar.f[i3];
                    }
                }
                int d2 = yuVar.d.d();
                float f4 = 0.0f;
                float f5 = 0.0f;
                en6 en6Var3 = null;
                en6 en6Var4 = null;
                int i5 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (i5 < d2) {
                    float f6 = yuVar.d.f(i5);
                    en6 e2 = yuVar.d.e(i5);
                    float f7 = f3;
                    if (e2.e0 == dn6.UNRESTRICTED) {
                        if (en6Var3 != null) {
                            if (f4 <= f6) {
                                if (!z5) {
                                    if (e2.h0 > 1) {
                                    }
                                }
                            }
                            z5 = true;
                        }
                        en6Var3 = e2;
                        f4 = f6;
                    } else if (en6Var3 == null && f6 < f7) {
                        if (en6Var4 != null) {
                            if (f5 <= f6) {
                                if (!z6) {
                                    if (e2.h0 > 1) {
                                    }
                                }
                            }
                            z6 = true;
                        }
                        en6Var4 = e2;
                        f5 = f6;
                    }
                    i5++;
                    f3 = f7;
                }
                float f8 = f3;
                if (en6Var3 == null) {
                    en6Var3 = en6Var4;
                }
                if (en6Var3 == null) {
                    z2 = true;
                } else {
                    yuVar.g(en6Var3);
                    z2 = false;
                }
                if (yuVar.d.d() == 0) {
                    yuVar.e = true;
                }
                if (z2) {
                    if (this.j + 1 >= this.f) {
                        o();
                    }
                    en6 a = a(dn6.SLACK);
                    int i6 = this.c + 1;
                    this.c = i6;
                    this.j++;
                    a.B = i6;
                    bt btVar = this.m;
                    ((en6[]) btVar.R)[i6] = a;
                    yuVar.a = a;
                    int i7 = this.k;
                    h(yuVar);
                    if (this.k == i7 + 1) {
                        yu yuVar2 = this.p;
                        yuVar2.a = null;
                        yuVar2.d.b();
                        for (int i8 = 0; i8 < yuVar.d.d(); i8++) {
                            yuVar2.d.a(yuVar.d.e(i8), yuVar.d.f(i8), true);
                        }
                        r(this.p);
                        if (a.L == -1) {
                            if (yuVar.a == a && (f = yuVar.f(null, a)) != null) {
                                yuVar.g(f);
                            }
                            if (!yuVar.e) {
                                yuVar.a.e(this, yuVar);
                            }
                            ((tz4) btVar.B).b(yuVar);
                            this.k--;
                        }
                        en6Var = yuVar.a;
                        if (en6Var == null) {
                            if (en6Var.e0 == dn6.UNRESTRICTED || yuVar.b >= f8) {
                                z = z3;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                z3 = false;
                en6Var = yuVar.a;
                if (en6Var == null) {
                }
            } else {
                return;
            }
        } else {
            z = false;
        }
        if (!z) {
            h(yuVar);
        }
    }

    public final void d(en6 en6Var, int i) {
        int i2 = en6Var.L;
        if (i2 == -1) {
            en6Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                en6 en6Var2 = ((en6[]) this.m.R)[i3];
            }
        } else if (i2 != -1) {
            yu yuVar = this.g[i2];
            if (yuVar.e) {
                yuVar.b = i;
            } else if (yuVar.d.d() == 0) {
                yuVar.e = true;
                yuVar.b = i;
            } else {
                yu l = l();
                if (i < 0) {
                    l.b = i * (-1);
                    l.d.g(en6Var, 1.0f);
                } else {
                    l.b = i;
                    l.d.g(en6Var, -1.0f);
                }
                c(l);
            }
        } else {
            yu l2 = l();
            l2.a = en6Var;
            float f = i;
            en6Var.X = f;
            l2.b = f;
            l2.e = true;
            c(l2);
        }
    }

    public final void e(en6 en6Var, en6 en6Var2, int i, int i2) {
        if (i2 == 8 && en6Var2.Y && en6Var.L == -1) {
            en6Var.d(this, en6Var2.X + i);
            return;
        }
        yu l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        qu quVar = l.d;
        if (!z) {
            quVar.g(en6Var, -1.0f);
            l.d.g(en6Var2, 1.0f);
        } else {
            quVar.g(en6Var, 1.0f);
            l.d.g(en6Var2, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(en6 en6Var, en6 en6Var2, int i, int i2) {
        yu l = l();
        en6 m = m();
        m.R = 0;
        l.b(en6Var, en6Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(en6 en6Var, en6 en6Var2, int i, int i2) {
        yu l = l();
        en6 m = m();
        m.R = 0;
        l.c(en6Var, en6Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(yu yuVar) {
        int i;
        if (yuVar.e) {
            yuVar.a.d(this, yuVar.b);
        } else {
            yu[] yuVarArr = this.g;
            int i2 = this.k;
            yuVarArr[i2] = yuVar;
            en6 en6Var = yuVar.a;
            en6Var.L = i2;
            this.k = i2 + 1;
            en6Var.e(this, yuVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                yu yuVar2 = this.g[i3];
                if (yuVar2 != null && yuVar2.e) {
                    yuVar2.a.d(this, yuVar2.b);
                    ((tz4) this.m.B).b(yuVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        yu[] yuVarArr2 = this.g;
                        int i6 = i4 - 1;
                        yu yuVar3 = yuVarArr2[i4];
                        yuVarArr2[i6] = yuVar3;
                        en6 en6Var2 = yuVar3.a;
                        if (en6Var2.L == i4) {
                            en6Var2.L = i6;
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
            yu yuVar = this.g[i];
            yuVar.a.X = yuVar.b;
        }
    }

    public final en6 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        en6 a = a(dn6.ERROR);
        float[] fArr = a.d0;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.B = i2;
        a.R = i;
        ((en6[]) this.m.R)[i2] = a;
        c35 c35Var = this.d;
        c35Var.i.B = a;
        Arrays.fill(fArr, (float) RecyclerView.B1);
        fArr[a.R] = 1.0f;
        c35Var.j(a);
        return a;
    }

    public final en6 k(Object obj) {
        if (obj != null) {
            if (this.j + 1 >= this.f) {
                o();
            }
            if (obj instanceof h11) {
                h11 h11Var = (h11) obj;
                en6 en6Var = h11Var.i;
                if (en6Var == null) {
                    h11Var.k();
                    en6Var = h11Var.i;
                }
                int i = en6Var.B;
                bt btVar = this.m;
                if (i != -1 && i <= this.c && ((en6[]) btVar.R)[i] != null) {
                    return en6Var;
                }
                if (i != -1) {
                    en6Var.c();
                }
                int i2 = this.c + 1;
                this.c = i2;
                this.j++;
                en6Var.B = i2;
                en6Var.e0 = dn6.UNRESTRICTED;
                ((en6[]) btVar.R)[i2] = en6Var;
                return en6Var;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final yu l() {
        yu yuVar;
        bt btVar = this.m;
        tz4 tz4Var = (tz4) btVar.B;
        int i = tz4Var.b;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = tz4Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            tz4Var.b = i2;
            yuVar = r4;
        } else {
            yuVar = null;
        }
        yu yuVar2 = yuVar;
        if (yuVar2 == null) {
            return new yu(btVar);
        }
        yuVar2.a = null;
        yuVar2.d.b();
        yuVar2.b = RecyclerView.B1;
        yuVar2.e = false;
        return yuVar2;
    }

    public final en6 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        en6 a = a(dn6.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.B = i;
        ((en6[]) this.m.R)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (yu[]) Arrays.copyOf(this.g, i);
        bt btVar = this.m;
        btVar.R = (en6[]) Arrays.copyOf((en6[]) btVar.R, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        c35 c35Var = this.d;
        if (c35Var.e()) {
            i();
        } else if (this.h) {
            for (int i = 0; i < this.k; i++) {
                if (!this.g[i].e) {
                    q(c35Var);
                    return;
                }
            }
            i();
        } else {
            q(c35Var);
        }
    }

    public final void q(c35 c35Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            yu yuVar = this.g[i];
            if (yuVar.a.e0 != dn6.UNRESTRICTED) {
                float f = yuVar.b;
                float f2 = RecyclerView.B1;
                if (f < RecyclerView.B1) {
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
                            yu yuVar2 = this.g[i5];
                            if (yuVar2.a.e0 != dn6.UNRESTRICTED && !yuVar2.e && yuVar2.b < f2) {
                                int d = yuVar2.d.d();
                                int i7 = 0;
                                while (i7 < d) {
                                    en6 e = yuVar2.d.e(i7);
                                    float c = yuVar2.d.c(e);
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
                                    f2 = RecyclerView.B1;
                                }
                            }
                            i5++;
                            f2 = RecyclerView.B1;
                        }
                        if (i3 != -1) {
                            yu yuVar3 = this.g[i3];
                            yuVar3.a.L = -1;
                            yuVar3.g(((en6[]) this.m.R)[i4]);
                            en6 en6Var = yuVar3.a;
                            en6Var.L = i3;
                            en6Var.e(this, yuVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f2 = RecyclerView.B1;
                    }
                }
            }
            i++;
        }
        r(c35Var);
        i();
    }

    public final void r(yu yuVar) {
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
                en6 en6Var = yuVar.a;
                if (en6Var != null) {
                    this.i[en6Var.B] = true;
                }
                en6 d = yuVar.d(this.i);
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
                        yu yuVar2 = this.g[i5];
                        if (yuVar2.a.e0 != dn6.UNRESTRICTED && !yuVar2.e) {
                            qu quVar = yuVar2.d;
                            int i7 = quVar.h;
                            if (i7 != -1) {
                                for (int i8 = i; i7 != -1 && i8 < quVar.a; i8++) {
                                    if (quVar.e[i7] == d.B) {
                                        z = true;
                                        break;
                                    }
                                    i7 = quVar.f[i7];
                                }
                            }
                            z = false;
                            if (z) {
                                float c = yuVar2.d.c(d);
                                if (c < RecyclerView.B1) {
                                    float f2 = (-yuVar2.b) / c;
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
                        yu yuVar3 = this.g[i6];
                        yuVar3.a.L = -1;
                        yuVar3.g(d);
                        en6 en6Var2 = yuVar3.a;
                        en6Var2.L = i6;
                        en6Var2.e(this, yuVar3);
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
            yu yuVar = this.g[i];
            if (yuVar != null) {
                ((tz4) this.m.B).b(yuVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        bt btVar;
        int i = 0;
        while (true) {
            btVar = this.m;
            en6[] en6VarArr = (en6[]) btVar.R;
            if (i >= en6VarArr.length) {
                break;
            }
            en6 en6Var = en6VarArr[i];
            if (en6Var != null) {
                en6Var.c();
            }
            i++;
        }
        tz4 tz4Var = (tz4) btVar.L;
        en6[] en6VarArr2 = this.n;
        int i2 = this.o;
        tz4Var.getClass();
        if (i2 > en6VarArr2.length) {
            i2 = en6VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            en6 en6Var2 = en6VarArr2[i3];
            int i4 = tz4Var.b;
            Object[] objArr = tz4Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = en6Var2;
                tz4Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((en6[]) btVar.R, (Object) null);
        this.c = 0;
        c35 c35Var = this.d;
        c35Var.h = 0;
        c35Var.b = RecyclerView.B1;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            yu yuVar = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new yu(btVar);
    }
}
