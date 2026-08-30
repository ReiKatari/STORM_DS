package c5;

import a4.n;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q  reason: collision with root package name */
    public static boolean f2588q = false;

    /* renamed from: d  reason: collision with root package name */
    public final e f2592d;
    public final n m;

    /* renamed from: p  reason: collision with root package name */
    public b f2603p;

    /* renamed from: a  reason: collision with root package name */
    public int f2589a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2590b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f2591c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2593e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f2594f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2596h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean[] f2597i = new boolean[32];

    /* renamed from: j  reason: collision with root package name */
    public int f2598j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f2599k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f2600l = 32;

    /* renamed from: n  reason: collision with root package name */
    public g[] f2601n = new g[1000];

    /* renamed from: o  reason: collision with root package name */
    public int f2602o = 0;

    /* renamed from: g  reason: collision with root package name */
    public b[] f2595g = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [c5.e, c5.b] */
    public c() {
        s();
        n nVar = new n(5, (byte) 0);
        nVar.B = new d();
        nVar.L = new d();
        nVar.R = new g[32];
        this.m = nVar;
        ?? bVar = new b(nVar);
        bVar.f2606f = new g[128];
        bVar.f2607g = new g[128];
        bVar.f2608h = 0;
        bVar.f2609i = new a0.g((e) bVar);
        this.f2592d = bVar;
        this.f2603p = new b(nVar);
    }

    public static int n(Object obj) {
        g gVar = ((e5.d) obj).f4286i;
        if (gVar != null) {
            return (int) (gVar.X + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final g a(f fVar) {
        d dVar = (d) this.m.L;
        int i2 = dVar.f2605b;
        g gVar = null;
        if (i2 > 0) {
            int i10 = i2 - 1;
            ?? r32 = dVar.f2604a;
            ?? r42 = r32[i10];
            r32[i10] = 0;
            dVar.f2605b = i10;
            gVar = r42;
        }
        g gVar2 = gVar;
        if (gVar2 == null) {
            gVar2 = new g(fVar);
            gVar2.f2611c0 = fVar;
        } else {
            gVar2.c();
            gVar2.f2611c0 = fVar;
        }
        int i11 = this.f2602o;
        int i12 = this.f2589a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f2589a = i13;
            this.f2601n = (g[]) Arrays.copyOf(this.f2601n, i13);
        }
        g[] gVarArr = this.f2601n;
        int i14 = this.f2602o;
        this.f2602o = i14 + 1;
        gVarArr[i14] = gVar2;
        return gVar2;
    }

    public final void b(g gVar, g gVar2, int i2, float f8, g gVar3, g gVar4, int i10, int i11) {
        b l10 = l();
        if (gVar2 == gVar3) {
            l10.f2586d.g(gVar, 1.0f);
            l10.f2586d.g(gVar4, 1.0f);
            l10.f2586d.g(gVar2, -2.0f);
        } else {
            int i12 = (f8 > 0.5f ? 1 : (f8 == 0.5f ? 0 : -1));
            a aVar = l10.f2586d;
            if (i12 == 0) {
                aVar.g(gVar, 1.0f);
                l10.f2586d.g(gVar2, -1.0f);
                l10.f2586d.g(gVar3, -1.0f);
                l10.f2586d.g(gVar4, 1.0f);
                if (i2 > 0 || i10 > 0) {
                    l10.f2584b = (-i2) + i10;
                }
            } else if (f8 <= 0.0f) {
                aVar.g(gVar, -1.0f);
                l10.f2586d.g(gVar2, 1.0f);
                l10.f2584b = i2;
            } else if (f8 >= 1.0f) {
                aVar.g(gVar4, -1.0f);
                l10.f2586d.g(gVar3, 1.0f);
                l10.f2584b = -i10;
            } else {
                float f10 = 1.0f - f8;
                aVar.g(gVar, f10 * 1.0f);
                l10.f2586d.g(gVar2, f10 * (-1.0f));
                l10.f2586d.g(gVar3, (-1.0f) * f8);
                l10.f2586d.g(gVar4, 1.0f * f8);
                if (i2 > 0 || i10 > 0) {
                    l10.f2584b = (i10 * f8) + ((-i2) * f10);
                }
            }
        }
        if (i11 != 8) {
            l10.a(this, i11);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
        if (r4.f2614f0 <= 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
        if (r4.f2614f0 <= 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
        if (r4.f2614f0 <= 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fa, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0104, code lost:
        if (r4.f2614f0 <= 1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(c5.b r18) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.c(c5.b):void");
    }

    public final void d(g gVar, int i2) {
        int i10 = gVar.L;
        if (i10 == -1) {
            gVar.d(this, i2);
            for (int i11 = 0; i11 < this.f2591c + 1; i11++) {
                g gVar2 = ((g[]) this.m.R)[i11];
            }
        } else if (i10 != -1) {
            b bVar = this.f2595g[i10];
            if (bVar.f2587e) {
                bVar.f2584b = i2;
            } else if (bVar.f2586d.d() == 0) {
                bVar.f2587e = true;
                bVar.f2584b = i2;
            } else {
                b l10 = l();
                if (i2 < 0) {
                    l10.f2584b = i2 * (-1);
                    l10.f2586d.g(gVar, 1.0f);
                } else {
                    l10.f2584b = i2;
                    l10.f2586d.g(gVar, -1.0f);
                }
                c(l10);
            }
        } else {
            b l11 = l();
            l11.f2583a = gVar;
            float f8 = i2;
            gVar.X = f8;
            l11.f2584b = f8;
            l11.f2587e = true;
            c(l11);
        }
    }

    public final void e(g gVar, g gVar2, int i2, int i10) {
        if (i10 == 8 && gVar2.Y && gVar.L == -1) {
            gVar.d(this, gVar2.X + i2);
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z10 = true;
            }
            l10.f2584b = i2;
        }
        a aVar = l10.f2586d;
        if (!z10) {
            aVar.g(gVar, -1.0f);
            l10.f2586d.g(gVar2, 1.0f);
        } else {
            aVar.g(gVar, 1.0f);
            l10.f2586d.g(gVar2, -1.0f);
        }
        if (i10 != 8) {
            l10.a(this, i10);
        }
        c(l10);
    }

    public final void f(g gVar, g gVar2, int i2, int i10) {
        b l10 = l();
        g m = m();
        m.R = 0;
        l10.b(gVar, gVar2, m, i2);
        if (i10 != 8) {
            l10.f2586d.g(j(i10), (int) (l10.f2586d.c(m) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(g gVar, g gVar2, int i2, int i10) {
        b l10 = l();
        g m = m();
        m.R = 0;
        l10.c(gVar, gVar2, m, i2);
        if (i10 != 8) {
            l10.f2586d.g(j(i10), (int) (l10.f2586d.c(m) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i2;
        if (bVar.f2587e) {
            bVar.f2583a.d(this, bVar.f2584b);
        } else {
            b[] bVarArr = this.f2595g;
            int i10 = this.f2599k;
            bVarArr[i10] = bVar;
            g gVar = bVar.f2583a;
            gVar.L = i10;
            this.f2599k = i10 + 1;
            gVar.e(this, bVar);
        }
        if (this.f2590b) {
            int i11 = 0;
            while (i11 < this.f2599k) {
                if (this.f2595g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f2595g[i11];
                if (bVar2 != null && bVar2.f2587e) {
                    bVar2.f2583a.d(this, bVar2.f2584b);
                    ((d) this.m.B).b(bVar2);
                    this.f2595g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i2 = this.f2599k;
                        if (i12 >= i2) {
                            break;
                        }
                        b[] bVarArr2 = this.f2595g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        g gVar2 = bVar3.f2583a;
                        if (gVar2.L == i12) {
                            gVar2.L = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i2) {
                        this.f2595g[i13] = null;
                    }
                    this.f2599k = i2 - 1;
                    i11--;
                }
                i11++;
            }
            this.f2590b = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.f2599k; i2++) {
            b bVar = this.f2595g[i2];
            bVar.f2583a.X = bVar.f2584b;
        }
    }

    public final g j(int i2) {
        if (this.f2598j + 1 >= this.f2594f) {
            o();
        }
        g a10 = a(f.ERROR);
        float[] fArr = a10.f2610b0;
        int i10 = this.f2591c + 1;
        this.f2591c = i10;
        this.f2598j++;
        a10.B = i10;
        a10.R = i2;
        ((g[]) this.m.R)[i10] = a10;
        e eVar = this.f2592d;
        eVar.f2609i.B = a10;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.R] = 1.0f;
        eVar.j(a10);
        return a10;
    }

    public final g k(Object obj) {
        if (obj != null) {
            if (this.f2598j + 1 >= this.f2594f) {
                o();
            }
            if (obj instanceof e5.d) {
                e5.d dVar = (e5.d) obj;
                g gVar = dVar.f4286i;
                if (gVar == null) {
                    dVar.k();
                    gVar = dVar.f4286i;
                }
                int i2 = gVar.B;
                n nVar = this.m;
                if (i2 != -1 && i2 <= this.f2591c && ((g[]) nVar.R)[i2] != null) {
                    return gVar;
                }
                if (i2 != -1) {
                    gVar.c();
                }
                int i10 = this.f2591c + 1;
                this.f2591c = i10;
                this.f2598j++;
                gVar.B = i10;
                gVar.f2611c0 = f.UNRESTRICTED;
                ((g[]) nVar.R)[i10] = gVar;
                return gVar;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b l() {
        b bVar;
        n nVar = this.m;
        d dVar = (d) nVar.B;
        int i2 = dVar.f2605b;
        if (i2 > 0) {
            int i10 = i2 - 1;
            ?? r42 = dVar.f2604a;
            ?? r5 = r42[i10];
            r42[i10] = 0;
            dVar.f2605b = i10;
            bVar = r5;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(nVar);
        }
        bVar2.f2583a = null;
        bVar2.f2586d.b();
        bVar2.f2584b = 0.0f;
        bVar2.f2587e = false;
        return bVar2;
    }

    public final g m() {
        if (this.f2598j + 1 >= this.f2594f) {
            o();
        }
        g a10 = a(f.SLACK);
        int i2 = this.f2591c + 1;
        this.f2591c = i2;
        this.f2598j++;
        a10.B = i2;
        ((g[]) this.m.R)[i2] = a10;
        return a10;
    }

    public final void o() {
        int i2 = this.f2593e * 2;
        this.f2593e = i2;
        this.f2595g = (b[]) Arrays.copyOf(this.f2595g, i2);
        n nVar = this.m;
        nVar.R = (g[]) Arrays.copyOf((g[]) nVar.R, this.f2593e);
        int i10 = this.f2593e;
        this.f2597i = new boolean[i10];
        this.f2594f = i10;
        this.f2600l = i10;
    }

    public final void p() {
        e eVar = this.f2592d;
        if (eVar.e()) {
            i();
        } else if (this.f2596h) {
            for (int i2 = 0; i2 < this.f2599k; i2++) {
                if (!this.f2595g[i2].f2587e) {
                    q(eVar);
                    return;
                }
            }
            i();
        } else {
            q(eVar);
        }
    }

    public final void q(e eVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f2599k) {
                break;
            }
            b bVar = this.f2595g[i2];
            if (bVar.f2583a.f2611c0 != f.UNRESTRICTED) {
                float f8 = 0.0f;
                if (bVar.f2584b < 0.0f) {
                    boolean z10 = false;
                    int i10 = 0;
                    while (!z10) {
                        i10++;
                        float f10 = Float.MAX_VALUE;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.f2599k) {
                            b bVar2 = this.f2595g[i13];
                            if (bVar2.f2583a.f2611c0 != f.UNRESTRICTED && !bVar2.f2587e && bVar2.f2584b < f8) {
                                int d4 = bVar2.f2586d.d();
                                int i15 = 0;
                                while (i15 < d4) {
                                    g e6 = bVar2.f2586d.e(i15);
                                    float c4 = bVar2.f2586d.c(e6);
                                    if (c4 > f8) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f11 = e6.Z[i16] / c4;
                                            if ((f11 < f10 && i16 == i14) || i16 > i14) {
                                                i14 = i16;
                                                i12 = e6.B;
                                                i11 = i13;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i15++;
                                    f8 = 0.0f;
                                }
                            }
                            i13++;
                            f8 = 0.0f;
                        }
                        if (i11 != -1) {
                            b bVar3 = this.f2595g[i11];
                            bVar3.f2583a.L = -1;
                            bVar3.g(((g[]) this.m.R)[i12]);
                            g gVar = bVar3.f2583a;
                            gVar.L = i11;
                            gVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i10 > this.f2598j / 2) {
                            z10 = true;
                        }
                        f8 = 0.0f;
                    }
                }
            }
            i2++;
        }
        r(eVar);
        i();
    }

    public final void r(b bVar) {
        boolean z10;
        int i2 = 0;
        for (int i10 = 0; i10 < this.f2598j; i10++) {
            this.f2597i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f2598j * 2) {
                g gVar = bVar.f2583a;
                if (gVar != null) {
                    this.f2597i[gVar.B] = true;
                }
                g d4 = bVar.d(this.f2597i);
                if (d4 != null) {
                    boolean[] zArr = this.f2597i;
                    int i12 = d4.B;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (d4 != null) {
                    float f8 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = i2; i14 < this.f2599k; i14++) {
                        b bVar2 = this.f2595g[i14];
                        if (bVar2.f2583a.f2611c0 != f.UNRESTRICTED && !bVar2.f2587e) {
                            a aVar = bVar2.f2586d;
                            int i15 = aVar.f2580h;
                            if (i15 != -1) {
                                for (int i16 = 0; i15 != -1 && i16 < aVar.f2573a; i16++) {
                                    if (aVar.f2577e[i15] == d4.B) {
                                        z10 = true;
                                        break;
                                    }
                                    i15 = aVar.f2578f[i15];
                                }
                            }
                            z10 = false;
                            if (z10) {
                                float c4 = bVar2.f2586d.c(d4);
                                if (c4 < 0.0f) {
                                    float f10 = (-bVar2.f2584b) / c4;
                                    if (f10 < f8) {
                                        i13 = i14;
                                        f8 = f10;
                                    }
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        b bVar3 = this.f2595g[i13];
                        bVar3.f2583a.L = -1;
                        bVar3.g(d4);
                        g gVar2 = bVar3.f2583a;
                        gVar2.L = i13;
                        gVar2.e(this, bVar3);
                    }
                } else {
                    z11 = true;
                }
                i2 = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i2 = 0; i2 < this.f2599k; i2++) {
            b bVar = this.f2595g[i2];
            if (bVar != null) {
                ((d) this.m.B).b(bVar);
            }
            this.f2595g[i2] = null;
        }
    }

    public final void t() {
        n nVar;
        int i2 = 0;
        while (true) {
            nVar = this.m;
            g[] gVarArr = (g[]) nVar.R;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.c();
            }
            i2++;
        }
        d dVar = (d) nVar.L;
        g[] gVarArr2 = this.f2601n;
        int i10 = this.f2602o;
        dVar.getClass();
        if (i10 > gVarArr2.length) {
            i10 = gVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar2 = gVarArr2[i11];
            int i12 = dVar.f2605b;
            Object[] objArr = dVar.f2604a;
            if (i12 < objArr.length) {
                objArr[i12] = gVar2;
                dVar.f2605b = i12 + 1;
            }
        }
        this.f2602o = 0;
        Arrays.fill((g[]) nVar.R, (Object) null);
        this.f2591c = 0;
        e eVar = this.f2592d;
        eVar.f2608h = 0;
        eVar.f2584b = 0.0f;
        this.f2598j = 1;
        for (int i13 = 0; i13 < this.f2599k; i13++) {
            b bVar = this.f2595g[i13];
        }
        s();
        this.f2599k = 0;
        this.f2603p = new b(nVar);
    }
}
