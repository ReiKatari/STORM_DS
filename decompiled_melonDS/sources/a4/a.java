package a4;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, Object obj) {
        super(1);
        this.B = i2;
        this.L = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [a4.b, y3.i1] */
    @Override // mc.l
    public final Object k(Object obj) {
        y3.v1[] v1VarArr;
        int i2 = this.B;
        int i10 = 0;
        yb.y yVar = yb.y.f14813a;
        Object obj2 = this.L;
        switch (i2) {
            case 0:
                b bVar = (b) obj;
                p0 p0Var = (p0) obj2;
                if (bVar.d0() != Integer.MAX_VALUE) {
                    if (bVar.d().f306b) {
                        bVar.M();
                    }
                    for (Map.Entry entry : bVar.d().f313i.entrySet()) {
                        p0.a(p0Var, (y3.q) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.z());
                    }
                    r1 r1Var = bVar.z().f319m0;
                    r1Var.getClass();
                    while (!r1Var.equals(p0Var.f305a.z())) {
                        for (y3.q qVar : p0Var.b(r1Var).keySet()) {
                            p0.a(p0Var, qVar, p0Var.c(r1Var, qVar), r1Var);
                        }
                        r1Var = r1Var.f319m0;
                        r1Var.getClass();
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((p2.b) obj2).b((b3.n) obj);
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(((g3.g0) obj).V0(((g3.f) obj2).f5505a));
            case 3:
                u0 u0Var = (u0) obj;
                b4.x xVar = ((b4.m) obj2).f1878j0;
                if (xVar.getInsetsListener().Z.g() > 0) {
                    a1.x xVar2 = y3.x1.f14758a;
                    u0Var.A = true;
                    x0 x0Var = u0Var.R;
                    y3.z C0 = x0Var.C0();
                    if (x4.j.a(u0Var.B, 9223372034707292159L)) {
                        u0Var.B = p7.n.u(C0.a(0L));
                        u0Var.L = C0.Z();
                    }
                    x0Var.E0().B0.b();
                    long Z = C0.Z();
                    a1.m0 m0Var = xVar.getInsetsListener().Y;
                    int i11 = (int) (Z >> 32);
                    int i12 = (int) (Z & 4294967295L);
                    for (y3.v1 v1Var : y3.x1.f14759b) {
                        Object g10 = m0Var.g(v1Var);
                        g10.getClass();
                        y3.y1 y1Var = (y3.y1) g10;
                        y3.w1 w1Var = (y3.w1) v1Var;
                        y3.x1.a(u0Var, w1Var.f14756c, y1Var.f14767h, i11, i12);
                        if (((Boolean) y1Var.f14761b.getValue()).booleanValue()) {
                            y3.x1.a(u0Var, y1Var.f14765f, y1Var.f14769j, i11, i12);
                            y3.x1.a(u0Var, y1Var.f14766g, y1Var.f14770k, i11, i12);
                        }
                        y3.x1.a(u0Var, w1Var.f14757d, y1Var.f14768i, i11, i12);
                    }
                    a1.h0 h0Var = xVar.getInsetsListener().f14742b0;
                    if (h0Var.i()) {
                        z2.p pVar = xVar.getInsetsListener().f14743c0;
                        Object[] objArr = h0Var.f44a;
                        int i13 = h0Var.f45b;
                        while (i10 < i13) {
                            y3.t tVar = (y3.t) pVar.get(i10);
                            Rect rect = (Rect) ((n2.w0) objArr[i10]).getValue();
                            u0Var.a(tVar.b(), rect.left);
                            u0Var.a(tVar.d(), rect.top);
                            u0Var.a(tVar.c(), rect.right);
                            u0Var.a(tVar.a(), rect.bottom);
                            i10++;
                        }
                    }
                }
                return yVar;
            case 4:
                return Boolean.valueOf(((a1.l) obj2).a(((i4.p) obj).f6773g));
            case l1.c.f8511g /* 5 */:
                return Boolean.valueOf(b4.l0.c((i4.p) obj, (Resources) obj2));
            case l1.c.f8509e /* 6 */:
                n2.h0 h0Var2 = (n2.h0) obj;
                return new a5.a(3, (b4.u1) obj2);
            case 7:
                if (b4.x1.f2006b.compareAndSet(false, true)) {
                    ((bd.h) obj2).a(yVar);
                }
                return yVar;
            case 8:
                k3.d dVar = (k3.d) obj;
                i3.q p10 = dVar.E().p();
                mc.p pVar2 = ((b4.y1) obj2).R;
                if (pVar2 != null) {
                    pVar2.j(p10, (l3.b) dVar.E().L);
                }
                return yVar;
            case l1.c.f8508d /* 9 */:
                q4.m mVar = (q4.m) obj;
                d2.v vVar = mVar.f12259b;
                if (vVar != null) {
                    vVar.closeConnection();
                    mVar.f12259b = null;
                }
                b4.c2 c2Var = (b4.c2) obj2;
                p2.b bVar2 = c2Var.f1801d;
                Object[] objArr2 = bVar2.A;
                int i14 = bVar2.L;
                while (true) {
                    if (i10 < i14) {
                        if (!nc.k.a((s2) objArr2[i10], mVar)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    bVar2.k(i10);
                }
                if (bVar2.L == 0) {
                    c2Var.f1799b.b();
                }
                return yVar;
            case l1.c.f8510f /* 10 */:
                Throwable th2 = (Throwable) obj;
                ((ta.a) obj2).cancel(false);
                return yVar;
            case 11:
                i4.v.d((i4.x) obj, (c3.o) obj2);
                return yVar;
            case 12:
                e3.f fVar = (e3.f) obj;
                if (!fVar.A.f1777h0) {
                    return p2.SkipSubtreeAndContinueTraversal;
                }
                e3.f fVar2 = fVar.f4256j0;
                if (fVar2 != null) {
                    a aVar = new a(12, (d2.t) obj2);
                    if (aVar.k(fVar2) == p2.ContinueTraversal) {
                        l.z(fVar2, aVar);
                    }
                }
                fVar.f4256j0 = null;
                fVar.f4255i0 = null;
                return p2.ContinueTraversal;
            case 13:
                i3.k0 k0Var = (i3.k0) obj;
                f3.n nVar = (f3.n) obj2;
                k0Var.n(k0Var.f6649h0.b() * nVar.f4837a);
                k0Var.o(nVar.f4838b);
                k0Var.g(nVar.f4839c);
                k0Var.e(nVar.f4840d);
                k0Var.s(nVar.f4841e);
                return yVar;
            case 14:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return yVar;
            case l1.c.f8512h /* 15 */:
                i3.k0 k0Var2 = (i3.k0) obj;
                i3.o0 o0Var = (i3.o0) obj2;
                k0Var2.k(o0Var.f6664i0);
                k0Var2.l(o0Var.f6665j0);
                k0Var2.d(o0Var.f6666k0);
                k0Var2.n(0.0f);
                k0Var2.h(o0Var.f6667l0);
                float f8 = o0Var.f6668m0;
                if (k0Var2.f6644c0 != f8) {
                    k0Var2.A |= 2048;
                    k0Var2.f6644c0 = f8;
                }
                k0Var2.u(o0Var.f6669n0);
                k0Var2.o(o0Var.f6670o0);
                k0Var2.g(o0Var.p0);
                k0Var2.e(o0Var.f6671q0);
                k0Var2.s(o0Var.f6672r0);
                int i15 = o0Var.f6673s0;
                if (k0Var2.f6651j0 != i15) {
                    k0Var2.A |= 524288;
                    k0Var2.f6651j0 = i15;
                }
                return yVar;
            case 16:
                i4.v.e((i4.x) obj, ((i4.i) obj2).f6722a);
                return yVar;
            case 17:
                i4.v.c((i4.x) obj, (String) obj2);
                return yVar;
            case 18:
                ((List) obj).add((Float) ((p1.x0) obj2).b());
                return true;
            case 19:
                k3.d dVar2 = (k3.d) obj;
                l3.b bVar3 = (l3.b) obj2;
                i3.h hVar = bVar3.f8693l;
                if (bVar3.f8694n && bVar3.f8703w && hVar != null) {
                    n E = dVar2.E();
                    long t5 = E.t();
                    E.p().p();
                    try {
                        ((n) ((d2.t) E.B).B).p().h(hVar);
                        bVar3.c(dVar2);
                    } finally {
                        w.d.y(E, t5);
                    }
                } else {
                    bVar3.c(dVar2);
                }
                return yVar;
            case 20:
                o3.c0 c0Var = (o3.c0) obj;
                o3.c cVar = (o3.c) obj2;
                cVar.g(c0Var);
                mc.l lVar = cVar.f10686i;
                if (lVar != null) {
                    lVar.k(c0Var);
                }
                return yVar;
            default:
                Throwable th3 = (Throwable) obj;
                v3.f0 f0Var = (v3.f0) obj2;
                zc.h hVar2 = f0Var.L;
                if (hVar2 != null) {
                    hVar2.n(th3);
                }
                f0Var.L = null;
                return yVar;
        }
    }
}
