package v3;

import a4.h2;
import a4.r1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c  reason: collision with root package name */
    public final b3.o f13668c;

    /* renamed from: d  reason: collision with root package name */
    public final bk.a f13669d;

    /* renamed from: e  reason: collision with root package name */
    public final a1.q f13670e;

    /* renamed from: f  reason: collision with root package name */
    public r1 f13671f;

    /* renamed from: g  reason: collision with root package name */
    public k f13672g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13673h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13674i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13675j;

    public i(b3.o oVar) {
        this.f13668c = oVar;
        bk.a aVar = new bk.a((char) 0, 11);
        aVar.L = new long[2];
        this.f13669d = aVar;
        this.f13670e = new a1.q(2);
        this.f13674i = true;
        this.f13675j = true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List, java.lang.Object] */
    @Override // v3.j
    public final boolean a(a1.q qVar, y3.z zVar, p1.a0 a0Var, boolean z10) {
        bk.a aVar;
        a1.q qVar2;
        Object obj;
        int i2;
        boolean z11;
        boolean z12;
        k kVar;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i10;
        int i11;
        int i12;
        boolean z19;
        int i13;
        int i14;
        List list;
        a1.q qVar3;
        long j2;
        boolean a10 = super.a(qVar, zVar, a0Var, z10);
        b3.o oVar = this.f13668c;
        if (oVar.f1777h0) {
            p2.b bVar = null;
            while (oVar != null) {
                if (oVar instanceof h2) {
                    this.f13671f = a4.l.r((h2) oVar, 16);
                } else if ((oVar.L & 16) != 0 && (oVar instanceof a4.k)) {
                    int i15 = 0;
                    for (b3.o oVar2 = ((a4.k) oVar).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                        if ((oVar2.L & 16) != 0) {
                            i15++;
                            if (i15 == 1) {
                                oVar = oVar2;
                            } else {
                                if (bVar == null) {
                                    bVar = new p2.b(new b3.o[16]);
                                }
                                if (oVar != null) {
                                    bVar.b(oVar);
                                    oVar = null;
                                }
                                bVar.b(oVar2);
                            }
                        }
                    }
                    if (i15 == 1) {
                    }
                }
                oVar = a4.l.e(bVar);
            }
            if (this.f13671f != null) {
                int j10 = qVar.j();
                int i16 = 0;
                while (true) {
                    aVar = this.f13669d;
                    qVar2 = this.f13670e;
                    if (i16 >= j10) {
                        break;
                    }
                    long f8 = qVar.f(i16);
                    t tVar = (t) qVar.k(i16);
                    if (aVar.h(f8)) {
                        long j11 = tVar.f13697g;
                        List list2 = tVar.f13701k;
                        i14 = i16;
                        long j12 = tVar.f13693c;
                        if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j12 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            List list3 = zb.q.A;
                            if (list2 == null) {
                                list = list3;
                            } else {
                                list = list2;
                            }
                            z19 = a10;
                            ArrayList arrayList = new ArrayList(list.size());
                            if (list2 == null) {
                                list2 = list3;
                            }
                            int size = list2.size();
                            i13 = j10;
                            int i17 = 0;
                            while (i17 < size) {
                                int i18 = size;
                                c cVar = (c) list2.get(i17);
                                int i19 = i17;
                                List list4 = list2;
                                long j13 = cVar.f13635b;
                                if ((((j13 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    qVar3 = qVar2;
                                    j2 = f8;
                                    long j14 = cVar.f13634a;
                                    r1 r1Var = this.f13671f;
                                    r1Var.getClass();
                                    arrayList.add(new c(j14, r1Var.F(zVar, j13, true), cVar.f13636c));
                                } else {
                                    qVar3 = qVar2;
                                    j2 = f8;
                                }
                                i17 = i19 + 1;
                                list2 = list4;
                                size = i18;
                                qVar2 = qVar3;
                                f8 = j2;
                            }
                            a1.q qVar4 = qVar2;
                            long j15 = f8;
                            r1 r1Var2 = this.f13671f;
                            r1Var2.getClass();
                            long F = r1Var2.F(zVar, j11, true);
                            r1 r1Var3 = this.f13671f;
                            r1Var3.getClass();
                            t tVar2 = new t(tVar.f13691a, tVar.f13692b, r1Var3.F(zVar, j12, true), tVar.f13694d, tVar.f13695e, tVar.f13696f, F, tVar.f13698h, tVar.f13699i, arrayList, tVar.f13700j, tVar.f13702l);
                            t tVar3 = tVar.f13704o;
                            if (tVar3 == null) {
                                tVar3 = tVar;
                            }
                            tVar2.f13704o = tVar3;
                            t tVar4 = tVar.f13704o;
                            if (tVar4 != null) {
                                tVar = tVar4;
                            }
                            tVar2.f13704o = tVar;
                            qVar4.g(j15, tVar2);
                        } else {
                            z19 = a10;
                            i13 = j10;
                        }
                    } else {
                        z19 = a10;
                        i13 = j10;
                        i14 = i16;
                    }
                    i16 = i14 + 1;
                    j10 = i13;
                    a10 = z19;
                }
                boolean z20 = a10;
                if (qVar2.e()) {
                    aVar.B = 0;
                    this.f13676a.g();
                    return true;
                }
                int i20 = aVar.B;
                while (true) {
                    i20--;
                    if (-1 >= i20) {
                        break;
                    } else if (qVar.c(((long[]) aVar.L)[i20]) < 0 && i20 < (i12 = aVar.B)) {
                        int i21 = i12 - 1;
                        int i22 = i20;
                        while (i22 < i21) {
                            long[] jArr = (long[]) aVar.L;
                            int i23 = i22 + 1;
                            jArr[i22] = jArr[i23];
                            i22 = i23;
                        }
                        aVar.B--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.j());
                int j16 = qVar2.j();
                for (int i24 = 0; i24 < j16; i24++) {
                    arrayList2.add(qVar2.k(i24));
                }
                k kVar2 = new k(arrayList2, a0Var);
                int size2 = arrayList2.size();
                int i25 = 0;
                while (true) {
                    if (i25 < size2) {
                        obj = arrayList2.get(i25);
                        if (a0Var.p(((t) obj).f13691a)) {
                            break;
                        }
                        i25++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                t tVar5 = (t) obj;
                if (tVar5 != null) {
                    boolean z21 = tVar5.f13694d;
                    if (!z10) {
                        i2 = false;
                        this.f13674i = false;
                    } else {
                        i2 = false;
                        if (!this.f13674i && (z21 || tVar5.f13698h)) {
                            r1 r1Var4 = this.f13671f;
                            r1Var4.getClass();
                            long j17 = r1Var4.L;
                            long j18 = tVar5.f13693c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j18 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j18 & 4294967295L));
                            int i26 = (int) (j17 >> 32);
                            int i27 = (int) (j17 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (intBitsToFloat > i26) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z22 = z13 | z14;
                            if (intBitsToFloat2 < 0.0f) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean z23 = z22 | z15;
                            if (intBitsToFloat2 > i27) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z11 = true;
                            this.f13674i = !(z23 | z16);
                            z17 = this.f13674i;
                            z18 = this.f13673h;
                            int i28 = 5;
                            if (z17 == z18 && ((i11 = kVar2.f13683f) == 3 || i11 == 4 || i11 == 5)) {
                                if (z17) {
                                    i28 = 4;
                                }
                                kVar2.f13683f = i28;
                            } else {
                                i10 = kVar2.f13683f;
                                if (i10 != 4 && z18 && !this.f13675j) {
                                    kVar2.f13683f = 3;
                                } else if (i10 == 5 && z17 && z21) {
                                    kVar2.f13683f = 3;
                                }
                            }
                        }
                    }
                    z11 = true;
                    z17 = this.f13674i;
                    z18 = this.f13673h;
                    int i282 = 5;
                    if (z17 == z18) {
                    }
                    i10 = kVar2.f13683f;
                    if (i10 != 4) {
                    }
                    if (i10 == 5) {
                        kVar2.f13683f = 3;
                    }
                } else {
                    i2 = false;
                    z11 = true;
                }
                if (!z20 && kVar2.f13683f == 3 && (kVar = this.f13672g) != null) {
                    ?? r12 = kVar.f13678a;
                    int size3 = r12.size();
                    ?? r42 = kVar2.f13678a;
                    if (size3 == r42.size()) {
                        int size4 = r42.size();
                        for (int i29 = i2; i29 < size4; i29++) {
                            if (h3.b.b(((t) r12.get(i29)).f13693c, ((t) r42.get(i29)).f13693c)) {
                            }
                        }
                        z12 = i2;
                        this.f13672g = kVar2;
                        return z12;
                    }
                }
                z12 = z11;
                this.f13672g = kVar2;
                return z12;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // v3.j
    public final void b(p1.a0 a0Var) {
        super.b(a0Var);
        k kVar = this.f13672g;
        if (kVar == null) {
            return;
        }
        this.f13673h = this.f13674i;
        ?? r12 = kVar.f13678a;
        int size = r12.size();
        boolean z10 = false;
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = (t) r12.get(i2);
            boolean z11 = tVar.f13694d;
            long j2 = tVar.f13691a;
            boolean p10 = a0Var.p(j2);
            boolean z12 = this.f13674i;
            if ((!z11 && !p10) || (!z11 && !z12)) {
                this.f13669d.q(j2);
            }
        }
        this.f13674i = false;
        if (kVar.f13683f == 5) {
            z10 = true;
        }
        this.f13675j = z10;
    }

    public final void c() {
        p2.b bVar = this.f13676a;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ((i) objArr[i10]).c();
        }
        b3.o oVar = this.f13668c;
        p2.b bVar2 = null;
        while (oVar != null) {
            if (oVar instanceof h2) {
                ((h2) oVar).g0();
            } else if ((oVar.L & 16) != 0 && (oVar instanceof a4.k)) {
                int i11 = 0;
                for (b3.o oVar2 = ((a4.k) oVar).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                    if ((oVar2.L & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            oVar = oVar2;
                        } else {
                            if (bVar2 == null) {
                                bVar2 = new p2.b(new b3.o[16]);
                            }
                            if (oVar != null) {
                                bVar2.b(oVar);
                                oVar = null;
                            }
                            bVar2.b(oVar2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            oVar = a4.l.e(bVar2);
        }
    }

    public final boolean d(p1.a0 a0Var) {
        a1.q qVar = this.f13670e;
        boolean z10 = false;
        z10 = false;
        if (!qVar.e()) {
            b3.o oVar = this.f13668c;
            if (oVar.f1777h0) {
                k kVar = this.f13672g;
                kVar.getClass();
                r1 r1Var = this.f13671f;
                r1Var.getClass();
                long j2 = r1Var.L;
                b3.o oVar2 = oVar;
                p2.b bVar = null;
                while (oVar2 != null) {
                    if (oVar2 instanceof h2) {
                        ((h2) oVar2).s0(kVar, l.Final, j2);
                    } else if ((oVar2.L & 16) != 0 && (oVar2 instanceof a4.k)) {
                        int i2 = 0;
                        for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                            if ((oVar3.L & 16) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    oVar2 = oVar3;
                                } else {
                                    if (bVar == null) {
                                        bVar = new p2.b(new b3.o[16]);
                                    }
                                    if (oVar2 != null) {
                                        bVar.b(oVar2);
                                        oVar2 = null;
                                    }
                                    bVar.b(oVar3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    oVar2 = a4.l.e(bVar);
                }
                if (oVar.f1777h0) {
                    p2.b bVar2 = this.f13676a;
                    Object[] objArr = bVar2.A;
                    int i10 = bVar2.L;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((i) objArr[i11]).d(a0Var);
                    }
                }
                z10 = true;
            }
        }
        b(a0Var);
        qVar.a();
        this.f13671f = null;
        return z10;
    }

    public final boolean e(p1.a0 a0Var, boolean z10) {
        if (!this.f13670e.e()) {
            b3.o oVar = this.f13668c;
            if (oVar.f1777h0) {
                k kVar = this.f13672g;
                kVar.getClass();
                r1 r1Var = this.f13671f;
                r1Var.getClass();
                long j2 = r1Var.L;
                b3.o oVar2 = oVar;
                p2.b bVar = null;
                while (oVar2 != null) {
                    if (oVar2 instanceof h2) {
                        ((h2) oVar2).s0(kVar, l.Initial, j2);
                    } else if ((oVar2.L & 16) != 0 && (oVar2 instanceof a4.k)) {
                        int i2 = 0;
                        for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                            if ((oVar3.L & 16) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    oVar2 = oVar3;
                                } else {
                                    if (bVar == null) {
                                        bVar = new p2.b(new b3.o[16]);
                                    }
                                    if (oVar2 != null) {
                                        bVar.b(oVar2);
                                        oVar2 = null;
                                    }
                                    bVar.b(oVar3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    oVar2 = a4.l.e(bVar);
                }
                if (oVar.f1777h0) {
                    p2.b bVar2 = this.f13676a;
                    Object[] objArr = bVar2.A;
                    int i10 = bVar2.L;
                    for (int i11 = 0; i11 < i10; i11++) {
                        this.f13671f.getClass();
                        ((i) objArr[i11]).e(a0Var, z10);
                    }
                }
                if (oVar.f1777h0) {
                    p2.b bVar3 = null;
                    while (oVar != null) {
                        if (oVar instanceof h2) {
                            ((h2) oVar).s0(kVar, l.Main, j2);
                        } else if ((oVar.L & 16) != 0 && (oVar instanceof a4.k)) {
                            int i12 = 0;
                            for (b3.o oVar4 = ((a4.k) oVar).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                if ((oVar4.L & 16) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        oVar = oVar4;
                                    } else {
                                        if (bVar3 == null) {
                                            bVar3 = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar != null) {
                                            bVar3.b(oVar);
                                            oVar = null;
                                        }
                                        bVar3.b(oVar4);
                                    }
                                }
                            }
                            if (i12 == 1) {
                            }
                        }
                        oVar = a4.l.e(bVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j2, a1.h0 h0Var) {
        bk.a aVar = this.f13669d;
        if (aVar.h(j2) && h0Var.g(this) < 0) {
            aVar.q(j2);
            this.f13670e.h(j2);
        }
        p2.b bVar = this.f13676a;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ((i) objArr[i10]).f(j2, h0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f13668c + ", children=" + this.f13676a + ", pointerIds=" + this.f13669d + ')';
    }
}
