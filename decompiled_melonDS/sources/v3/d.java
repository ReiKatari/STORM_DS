package v3;

import a4.n0;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final y3.z f13638a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13639b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13640c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13641d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13642e;

    /* renamed from: f  reason: collision with root package name */
    public final a1.h0 f13643f = new a1.h0();

    /* renamed from: g  reason: collision with root package name */
    public final j f13644g = new j();

    /* renamed from: h  reason: collision with root package name */
    public final a1.a0 f13645h = new a1.a0(10);

    public d(y3.z zVar) {
        this.f13638a = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void a(long j2, List list, boolean z10) {
        a1.a0 a0Var;
        int i2;
        i iVar;
        i iVar2;
        int size = list.size();
        j jVar = this.f13644g;
        i iVar3 = jVar;
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            a0Var = this.f13645h;
            if (i10 >= size) {
                break;
            }
            b3.o oVar = (b3.o) list.get(i10);
            if (oVar.f1777h0) {
                oVar.f1776g0 = new n0(10, this, oVar);
                if (z11) {
                    p2.b bVar = iVar3.f13676a;
                    ?? r14 = bVar.A;
                    int i11 = bVar.L;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            iVar2 = r14[i12];
                            if (nc.k.a(((i) iVar2).f13668c, oVar)) {
                                break;
                            }
                            i12++;
                        } else {
                            iVar2 = null;
                            break;
                        }
                    }
                    iVar = iVar2;
                    if (iVar != null) {
                        iVar.f13674i = true;
                        iVar.f13669d.f(j2);
                        if (z10) {
                            Object d4 = a0Var.d(j2);
                            if (d4 == null) {
                                d4 = new a1.h0();
                                a0Var.g(j2, d4);
                            }
                            ((a1.h0) d4).a(iVar);
                        }
                        iVar3 = iVar;
                    } else {
                        z11 = false;
                    }
                }
                iVar = new i(oVar);
                iVar.f13669d.f(j2);
                if (z10) {
                    Object d10 = a0Var.d(j2);
                    if (d10 == null) {
                        d10 = new a1.h0();
                        a0Var.g(j2, d10);
                    }
                    ((a1.h0) d10).a(iVar);
                }
                iVar3.f13676a.b(iVar);
                iVar3 = iVar;
            }
            i10++;
        }
        if (z10) {
            long[] jArr = a0Var.f16b;
            Object[] objArr = a0Var.f17c;
            long[] jArr2 = a0Var.f15a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr2[i13];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((255 & j10) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j11 = jArr[i17];
                                a1.h0 h0Var = (a1.h0) objArr[i17];
                                i2 = i14;
                                p2.b bVar2 = jVar.f13676a;
                                Object[] objArr2 = bVar2.A;
                                int i18 = bVar2.L;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((i) objArr2[i19]).f(j11, h0Var);
                                }
                            } else {
                                i2 = i14;
                            }
                            j10 >>= i2;
                            i16++;
                            i14 = i2;
                        }
                        if (i15 != i14) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        a0Var.a();
    }

    public final boolean b(p1.a0 a0Var, boolean z10) {
        y3.z zVar = this.f13638a;
        j jVar = this.f13644g;
        boolean a10 = jVar.a((a1.q) a0Var.B, zVar, a0Var, z10);
        p2.b bVar = jVar.f13676a;
        if (!a10) {
            return false;
        }
        boolean z11 = true;
        this.f13639b = true;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        boolean z12 = false;
        for (int i10 = 0; i10 < i2; i10++) {
            if (!((i) objArr[i10]).e(a0Var, z10) && !z12) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        Object[] objArr2 = bVar.A;
        int i11 = bVar.L;
        boolean z13 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!((i) objArr2[i12]).d(a0Var) && !z13) {
                z13 = false;
            } else {
                z13 = true;
            }
        }
        jVar.b(a0Var);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f13639b = false;
        if (this.f13642e) {
            this.f13642e = false;
            a1.h0 h0Var = this.f13643f;
            int i13 = h0Var.f45b;
            for (int i14 = 0; i14 < i13; i14++) {
                d((b3.o) h0Var.f(i14));
            }
            h0Var.d();
        }
        if (this.f13640c) {
            this.f13640c = false;
            c();
        }
        if (this.f13641d) {
            this.f13641d = false;
            jVar.f13676a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f13639b) {
            this.f13640c = true;
            return;
        }
        j jVar = this.f13644g;
        p2.b bVar = jVar.f13676a;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ((i) objArr[i10]).c();
        }
        if (this.f13641d) {
            this.f13641d = true;
        } else {
            jVar.f13676a.g();
        }
    }

    public final void d(b3.o oVar) {
        if (this.f13639b) {
            this.f13642e = true;
            this.f13643f.a(oVar);
            return;
        }
        j jVar = this.f13644g;
        a1.h0 h0Var = jVar.f13677b;
        h0Var.d();
        h0Var.a(jVar);
        while (h0Var.i()) {
            j jVar2 = (j) h0Var.k(h0Var.f45b - 1);
            int i2 = 0;
            while (true) {
                p2.b bVar = jVar2.f13676a;
                if (i2 < bVar.L) {
                    i iVar = (i) bVar.A[i2];
                    if (nc.k.a(iVar.f13668c, oVar)) {
                        jVar2.f13676a.j(iVar);
                        iVar.c();
                    } else {
                        h0Var.a(iVar);
                        i2++;
                    }
                }
            }
        }
    }
}
