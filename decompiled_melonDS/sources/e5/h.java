package e5;

import f5.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends g {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public b[] E0;
    public b[] F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public WeakReference J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public final HashSet N0;
    public final f5.b O0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f4331t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final a4.n f4332u0 = new a4.n(this);

    /* renamed from: v0  reason: collision with root package name */
    public final f5.e f4333v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f4334w0;

    /* renamed from: x0  reason: collision with root package name */
    public i5.g f4335x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f4336y0;

    /* renamed from: z0  reason: collision with root package name */
    public final c5.c f4337z0;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, f5.b] */
    public h() {
        f5.e eVar = new f5.e();
        eVar.f4855b = true;
        eVar.f4856c = true;
        eVar.f4859f = new ArrayList();
        new ArrayList();
        eVar.f4861h = null;
        eVar.f4862i = new Object();
        eVar.f4860g = new ArrayList();
        eVar.f4857d = this;
        eVar.f4858e = this;
        this.f4333v0 = eVar;
        this.f4335x0 = null;
        this.f4336y0 = false;
        this.f4337z0 = new c5.c();
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = new b[4];
        this.F0 = new b[4];
        this.G0 = 257;
        this.H0 = false;
        this.I0 = false;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = new HashSet();
        this.O0 = new Object();
    }

    public static void W(g gVar, i5.g gVar2, f5.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i2;
        int i10;
        if (gVar2 == null) {
            return;
        }
        int i11 = gVar.f4303h0;
        int[] iArr = gVar.f4324t;
        if (i11 != 8 && !(gVar instanceof l) && !(gVar instanceof a)) {
            f[] fVarArr = gVar.T;
            bVar.f4842a = fVarArr[0];
            bVar.f4843b = fVarArr[1];
            bVar.f4844c = gVar.r();
            bVar.f4845d = gVar.l();
            bVar.f4850i = false;
            bVar.f4851j = 0;
            f fVar = bVar.f4842a;
            f fVar2 = f.MATCH_CONSTRAINT;
            if (fVar == fVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar.f4843b == fVar2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && gVar.X > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && gVar.X > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && gVar.u(0) && gVar.f4320r == 0 && !z12) {
                bVar.f4842a = f.WRAP_CONTENT;
                if (z11 && gVar.f4322s == 0) {
                    bVar.f4842a = f.FIXED;
                }
                z10 = false;
            }
            if (z11 && gVar.u(1) && gVar.f4322s == 0 && !z13) {
                bVar.f4843b = f.WRAP_CONTENT;
                if (z10 && gVar.f4320r == 0) {
                    bVar.f4843b = f.FIXED;
                }
                z11 = false;
            }
            if (gVar.B()) {
                bVar.f4842a = f.FIXED;
                z10 = false;
            }
            if (gVar.C()) {
                bVar.f4843b = f.FIXED;
                z11 = false;
            }
            if (z12) {
                if (iArr[0] == 4) {
                    bVar.f4842a = f.FIXED;
                } else if (!z11) {
                    f fVar3 = bVar.f4843b;
                    f fVar4 = f.FIXED;
                    if (fVar3 == fVar4) {
                        i10 = bVar.f4845d;
                    } else {
                        bVar.f4842a = f.WRAP_CONTENT;
                        gVar2.b(gVar, bVar);
                        i10 = bVar.f4847f;
                    }
                    bVar.f4842a = fVar4;
                    bVar.f4844c = (int) (gVar.X * i10);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    bVar.f4843b = f.FIXED;
                } else if (!z10) {
                    f fVar5 = bVar.f4842a;
                    f fVar6 = f.FIXED;
                    if (fVar5 == fVar6) {
                        i2 = bVar.f4844c;
                    } else {
                        bVar.f4843b = f.WRAP_CONTENT;
                        gVar2.b(gVar, bVar);
                        i2 = bVar.f4846e;
                    }
                    bVar.f4843b = fVar6;
                    int i12 = gVar.Y;
                    float f8 = gVar.X;
                    if (i12 == -1) {
                        bVar.f4845d = (int) (i2 / f8);
                    } else {
                        bVar.f4845d = (int) (f8 * i2);
                    }
                }
            }
            gVar2.b(gVar, bVar);
            gVar.P(bVar.f4846e);
            gVar.M(bVar.f4847f);
            gVar.E = bVar.f4849h;
            gVar.J(bVar.f4848g);
            bVar.f4851j = 0;
            return;
        }
        bVar.f4846e = 0;
        bVar.f4847f = 0;
    }

    @Override // e5.g
    public final void D() {
        this.f4337z0.t();
        this.A0 = 0;
        this.B0 = 0;
        this.f4331t0.clear();
        super.D();
    }

    @Override // e5.g
    public final void G(a4.n nVar) {
        super.G(nVar);
        int size = this.f4331t0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((g) this.f4331t0.get(i2)).G(nVar);
        }
    }

    @Override // e5.g
    public final void Q(boolean z10, boolean z11) {
        super.Q(z10, z11);
        int size = this.f4331t0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((g) this.f4331t0.get(i2)).Q(z10, z11);
        }
    }

    public final void S(g gVar, int i2) {
        if (i2 == 0) {
            int i10 = this.C0 + 1;
            b[] bVarArr = this.F0;
            if (i10 >= bVarArr.length) {
                this.F0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.F0;
            int i11 = this.C0;
            bVarArr2[i11] = new b(gVar, 0, this.f4336y0);
            this.C0 = i11 + 1;
        } else if (i2 == 1) {
            int i12 = this.D0 + 1;
            b[] bVarArr3 = this.E0;
            if (i12 >= bVarArr3.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.E0;
            int i13 = this.D0;
            bVarArr4[i13] = new b(gVar, 1, this.f4336y0);
            this.D0 = i13 + 1;
        }
    }

    public final void T(c5.c cVar) {
        h hVar;
        c5.c cVar2;
        int i2;
        boolean X = X(64);
        b(cVar, X);
        int size = this.f4331t0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f4331t0.get(i10);
            boolean[] zArr = gVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (gVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = (g) this.f4331t0.get(i11);
                if (gVar2 instanceof a) {
                    a aVar = (a) gVar2;
                    for (int i12 = 0; i12 < aVar.f4368u0; i12++) {
                        g gVar3 = aVar.f4367t0[i12];
                        if (aVar.f4259w0 || gVar3.c()) {
                            int i13 = aVar.f4258v0;
                            if (i13 != 0 && i13 != 1) {
                                if (i13 == 2 || i13 == 3) {
                                    gVar3.S[1] = true;
                                }
                            } else {
                                gVar3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.N0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            g gVar4 = (g) this.f4331t0.get(i14);
            gVar4.getClass();
            boolean z11 = gVar4 instanceof p;
            if (z11 || (gVar4 instanceof l)) {
                if (z11) {
                    hashSet.add(gVar4);
                } else {
                    gVar4.b(cVar, X);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) ((g) it.next());
                for (int i15 = 0; i15 < pVar.f4368u0; i15++) {
                    if (hashSet.contains(pVar.f4367t0[i15])) {
                        pVar.b(cVar, X);
                        hashSet.remove(pVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(cVar, X);
                }
                hashSet.clear();
            }
        }
        if (c5.c.f2588q) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                g gVar5 = (g) this.f4331t0.get(i16);
                gVar5.getClass();
                if (!(gVar5 instanceof p) && !(gVar5 instanceof l)) {
                    hashSet2.add(gVar5);
                }
            }
            if (this.T[0] == f.WRAP_CONTENT) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            hVar = this;
            cVar2 = cVar;
            hVar.a(this, cVar2, hashSet2, i2, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                g gVar6 = (g) it3.next();
                n.b(this, cVar2, gVar6);
                gVar6.b(cVar2, X);
            }
        } else {
            hVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                g gVar7 = (g) hVar.f4331t0.get(i17);
                if (gVar7 instanceof h) {
                    f[] fVarArr = gVar7.T;
                    f fVar = fVarArr[0];
                    f fVar2 = fVarArr[1];
                    f fVar3 = f.WRAP_CONTENT;
                    if (fVar == fVar3) {
                        gVar7.N(f.FIXED);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.O(f.FIXED);
                    }
                    gVar7.b(cVar2, X);
                    if (fVar == fVar3) {
                        gVar7.N(fVar);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.O(fVar2);
                    }
                } else {
                    n.b(this, cVar2, gVar7);
                    if (!(gVar7 instanceof p) && !(gVar7 instanceof l)) {
                        gVar7.b(cVar2, X);
                    }
                }
            }
        }
        if (hVar.C0 > 0) {
            n.a(this, cVar2, null, 0);
        }
        if (hVar.D0 > 0) {
            n.a(this, cVar2, null, 1);
        }
    }

    public final boolean U(int i2, boolean z10) {
        boolean z11;
        f fVar;
        f5.e eVar = this.f4333v0;
        ArrayList arrayList = (ArrayList) eVar.f4859f;
        h hVar = (h) eVar.f4857d;
        boolean z12 = false;
        f k10 = hVar.k(0);
        f k11 = hVar.k(1);
        int s10 = hVar.s();
        int t5 = hVar.t();
        if (z10 && (k10 == (fVar = f.WRAP_CONTENT) || k11 == fVar)) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                t tVar = (t) obj;
                if (tVar.f4895f == i2 && !tVar.k()) {
                    z10 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z10 && k10 == f.WRAP_CONTENT) {
                    hVar.N(f.FIXED);
                    hVar.P(eVar.e(hVar, 0));
                    hVar.f4294d.f4894e.d(hVar.r());
                }
            } else if (z10 && k11 == f.WRAP_CONTENT) {
                hVar.O(f.FIXED);
                hVar.M(eVar.e(hVar, 1));
                hVar.f4296e.f4894e.d(hVar.l());
            }
        }
        f[] fVarArr = hVar.T;
        if (i2 == 0) {
            f fVar2 = fVarArr[0];
            if (fVar2 == f.FIXED || fVar2 == f.MATCH_PARENT) {
                int r5 = hVar.r() + s10;
                hVar.f4294d.f4898i.d(r5);
                hVar.f4294d.f4894e.d(r5 - s10);
                z11 = true;
            }
            z11 = false;
        } else {
            f fVar3 = fVarArr[1];
            if (fVar3 == f.FIXED || fVar3 == f.MATCH_PARENT) {
                int l10 = hVar.l() + t5;
                hVar.f4296e.f4898i.d(l10);
                hVar.f4296e.f4894e.d(l10 - t5);
                z11 = true;
            }
            z11 = false;
        }
        eVar.i();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            t tVar2 = (t) obj2;
            if (tVar2.f4895f == i2 && (tVar2.f4891b != hVar || tVar2.f4896g)) {
                tVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                t tVar3 = (t) obj3;
                if (tVar3.f4895f == i2 && (z11 || tVar3.f4891b != hVar)) {
                    if (!tVar3.f4897h.f4872j) {
                        break;
                    } else if (!tVar3.f4898i.f4872j) {
                        break;
                    } else if (!(tVar3 instanceof f5.c) && !tVar3.f4894e.f4872j) {
                        break;
                    }
                }
            } else {
                z12 = true;
                break;
            }
        }
        hVar.N(k10);
        hVar.O(k11);
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:336:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0619 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0821 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0927  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, f5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 2359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.h.V():void");
    }

    public final boolean X(int i2) {
        if ((this.G0 & i2) == i2) {
            return true;
        }
        return false;
    }

    @Override // e5.g
    public final void o(StringBuilder sb2) {
        sb2.append(this.f4306j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.V);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.W);
        sb2.append("\n");
        ArrayList arrayList = this.f4331t0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((g) obj).o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
