package c5;

import a4.n;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public final a f2586d;

    /* renamed from: a  reason: collision with root package name */
    public g f2583a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f2584b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2585c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2587e = false;

    public b(n nVar) {
        this.f2586d = new a(this, nVar);
    }

    public final void a(c cVar, int i2) {
        this.f2586d.g(cVar.j(i2), 1.0f);
        this.f2586d.g(cVar.j(i2), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i2) {
        boolean z10 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z10 = true;
            }
            this.f2584b = i2;
        }
        a aVar = this.f2586d;
        if (!z10) {
            aVar.g(gVar, -1.0f);
            this.f2586d.g(gVar2, 1.0f);
            this.f2586d.g(gVar3, 1.0f);
            return;
        }
        aVar.g(gVar, 1.0f);
        this.f2586d.g(gVar2, -1.0f);
        this.f2586d.g(gVar3, -1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i2) {
        boolean z10 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z10 = true;
            }
            this.f2584b = i2;
        }
        a aVar = this.f2586d;
        if (!z10) {
            aVar.g(gVar, -1.0f);
            this.f2586d.g(gVar2, 1.0f);
            this.f2586d.g(gVar3, -1.0f);
            return;
        }
        aVar.g(gVar, 1.0f);
        this.f2586d.g(gVar2, -1.0f);
        this.f2586d.g(gVar3, 1.0f);
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f2583a == null && this.f2584b == 0.0f && this.f2586d.d() == 0) {
            return true;
        }
        return false;
    }

    public final g f(boolean[] zArr, g gVar) {
        f fVar;
        int d4 = this.f2586d.d();
        g gVar2 = null;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < d4; i2++) {
            float f10 = this.f2586d.f(i2);
            if (f10 < 0.0f) {
                g e6 = this.f2586d.e(i2);
                if ((zArr == null || !zArr[e6.B]) && e6 != gVar && (((fVar = e6.f2611c0) == f.SLACK || fVar == f.ERROR) && f10 < f8)) {
                    f8 = f10;
                    gVar2 = e6;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f2583a;
        if (gVar2 != null) {
            this.f2586d.g(gVar2, -1.0f);
            this.f2583a.L = -1;
            this.f2583a = null;
        }
        float h2 = this.f2586d.h(gVar, true) * (-1.0f);
        this.f2583a = gVar;
        if (h2 == 1.0f) {
            return;
        }
        this.f2584b /= h2;
        a aVar = this.f2586d;
        int i2 = aVar.f2580h;
        for (int i10 = 0; i2 != -1 && i10 < aVar.f2573a; i10++) {
            float[] fArr = aVar.f2579g;
            fArr[i2] = fArr[i2] / h2;
            i2 = aVar.f2578f[i2];
        }
    }

    public final void h(c cVar, g gVar, boolean z10) {
        if (gVar.Y) {
            float c4 = this.f2586d.c(gVar);
            this.f2584b = (gVar.X * c4) + this.f2584b;
            this.f2586d.h(gVar, z10);
            if (z10) {
                gVar.b(this);
            }
            if (this.f2586d.d() == 0) {
                this.f2587e = true;
                cVar.f2590b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        a aVar = this.f2586d;
        aVar.getClass();
        float c4 = aVar.c(bVar.f2583a);
        aVar.h(bVar.f2583a, z10);
        a aVar2 = bVar.f2586d;
        int d4 = aVar2.d();
        for (int i2 = 0; i2 < d4; i2++) {
            g e6 = aVar2.e(i2);
            aVar.a(e6, aVar2.c(e6) * c4, z10);
        }
        this.f2584b = (bVar.f2584b * c4) + this.f2584b;
        if (z10) {
            bVar.f2583a.b(this);
        }
        if (this.f2583a != null && this.f2586d.d() == 0) {
            this.f2587e = true;
            cVar.f2590b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            c5.g r0 = r10.f2583a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            c5.g r1 = r10.f2583a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.f2584b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = w.d.t(r0)
            float r1 = r10.f2584b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            c5.a r5 = r10.f2586d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto Lcb
            c5.a r6 = r10.f2586d
            c5.g r6 = r6.e(r3)
            if (r6 != 0) goto L48
            goto Lc7
        L48:
            c5.a r7 = r10.f2586d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L54
            goto Lc7
        L54:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L73
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L99
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L71:
            float r7 = r7 * r9
            goto L99
        L73:
            if (r8 <= 0) goto L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L99
        L87:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L71
        L99:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Lc6
        Laf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Lc6:
            r1 = r4
        Lc7:
            int r3 = r3 + 1
            goto L3c
        Lcb:
            if (r1 != 0) goto Lde
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.b.toString():java.lang.String");
    }
}
