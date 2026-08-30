package a7;

import a4.r0;
import ah.h1;
import ah.w0;
import b4.o0;
import b4.y2;
import d1.k1;
import d1.n1;
import d1.q1;
import g2.h3;
import g2.m2;
import h1.f3;
import h1.n2;
import h1.p2;
import hh.t1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.v1;
import l1.b2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ l(d0 d0Var, androidx.lifecycle.x xVar) {
        this.A = 7;
        this.L = d0Var;
        this.B = xVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        z zVar;
        hh.k kVar;
        lh.d dVar;
        androidx.lifecycle.r lifecycle;
        long f8;
        long j2;
        long a10;
        int i2 = this.A;
        float f10 = 1.0f;
        List list = null;
        boolean z10 = true;
        yb.y yVar = yb.y.f14813a;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i2) {
            case 0:
                x xVar = (x) obj3;
                d7.f fVar = ((d0) obj2).f552b;
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                a6.u uVar = g0Var.f568a;
                uVar.f515a = 0;
                uVar.f516b = 0;
                if (xVar instanceof z) {
                    int i10 = x.X;
                    Iterator it = k7.w.s(xVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            x xVar2 = (x) it.next();
                            x f11 = fVar.f();
                            if (f11 != null) {
                                zVar = f11.L;
                            } else {
                                zVar = null;
                            }
                            if (nc.k.a(xVar2, zVar)) {
                            }
                        } else {
                            int i11 = z.Z;
                            g0Var.f569b = l0.f.k(fVar.g()).B.f248a;
                            g0Var.f570c = true;
                        }
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                Throwable th2 = (Throwable) obj;
                ((ad.e) obj3).L.removeCallbacks((ad.c) obj2);
                return yVar;
            case 2:
                l lVar = (l) obj2;
                oe.j0 j0Var = (oe.j0) obj;
                int i12 = EmulatorActivity.f9503a1;
                j0Var.getClass();
                l.g gVar = (l.g) ((nc.t) obj3).A;
                if (gVar != null) {
                    gVar.dismiss();
                }
                lVar.k(j0Var);
                return yVar;
            case 3:
                nc.t tVar = (nc.t) obj2;
                oe.j0 j0Var2 = (oe.j0) obj;
                int i13 = EmulatorActivity.f9503a1;
                j0Var2.getClass();
                h1 C = ((EmulatorActivity) obj3).C();
                Object value = C.f777q.getValue();
                if (value instanceof hh.k) {
                    kVar = (hh.k) value;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    ze.a aVar = kVar.f6537a;
                    kf.m0 m0Var = C.f770i;
                    m0Var.getClass();
                    aVar.getClass();
                    if (j0Var2.f10943b) {
                        k6.a d4 = m0Var.d(aVar);
                        if (d4 != null) {
                            String a11 = m0Var.a(aVar);
                            if (a11 != null) {
                                k6.a c4 = d4.c(a11 + ".ml" + j0Var2.f10942a);
                                if (c4 != null) {
                                    c4.b();
                                }
                                v1 v1Var = m0Var.f8256b;
                                File a12 = v1Var.a(aVar, j0Var2, false);
                                if (a12 != null) {
                                    v1Var.c(a12);
                                    a12.delete();
                                }
                            } else {
                                throw new Exception("Could not determine ROM file name");
                            }
                        } else {
                            throw new Exception("Could not create parent directory document");
                        }
                    }
                    list = C.o(aVar);
                }
                if (list != null && (dVar = (lh.d) tVar.A) != null) {
                    ArrayList arrayList = dVar.f9105i;
                    j7.k c10 = j7.o.c(new bi.x((List) arrayList, list));
                    arrayList.clear();
                    arrayList.addAll(list);
                    c10.a(dVar);
                }
                return yVar;
            case 4:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                oe.j0 j0Var3 = (oe.j0) obj;
                if (((hh.y) ((hh.z) obj3)).f6586b == hh.x.SAVING) {
                    int i14 = EmulatorActivity.f9503a1;
                    h1 C2 = emulatorActivity.C();
                    j0Var3.getClass();
                    zc.x.v(C2.f775o, null, null, new w0(C2, j0Var3, null, 1), 3);
                } else {
                    int i15 = EmulatorActivity.f9503a1;
                    h1 C3 = emulatorActivity.C();
                    j0Var3.getClass();
                    if (!j0Var3.f10943b) {
                        C3.J.p(t1.f6578a);
                    } else {
                        zc.x.v(C3.f775o, null, null, new w0(C3, j0Var3, null, 0), 3);
                    }
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                g3.z zVar2 = (g3.z) obj3;
                g3.r rVar = (g3.r) obj;
                rVar.getClass();
                if (!((Boolean) ((n2.w0) obj2).getValue()).booleanValue()) {
                    zVar2 = g3.z.f5551b;
                }
                rVar.c(zVar2);
                return yVar;
            case l1.c.f8509e /* 6 */:
                n2.h0 h0Var = (n2.h0) obj;
                return new o0(3, (s2) obj3, (b7.i) obj2);
            case 7:
                d0 d0Var = (d0) obj2;
                androidx.lifecycle.x xVar3 = (androidx.lifecycle.x) obj3;
                n2.h0 h0Var2 = (n2.h0) obj;
                d0Var.getClass();
                xVar3.getClass();
                d7.f fVar2 = d0Var.f552b;
                y2 y2Var = fVar2.f3937r;
                if (!xVar3.equals(fVar2.f3933n)) {
                    androidx.lifecycle.x xVar4 = fVar2.f3933n;
                    if (xVar4 != null && (lifecycle = xVar4.getLifecycle()) != null) {
                        lifecycle.c(y2Var);
                    }
                    fVar2.f3933n = xVar3;
                    xVar3.getLifecycle().a(y2Var);
                }
                return new Object();
            case 8:
                d1.e0 e0Var = (d1.e0) obj3;
                d1.c0 c0Var = (d1.c0) obj2;
                n2.h0 h0Var3 = (n2.h0) obj;
                e0Var.f3556a.b(c0Var);
                e0Var.f3557b.setValue(Boolean.TRUE);
                return new o0(4, e0Var, c0Var);
            case l1.c.f8508d /* 9 */:
                n2.h0 h0Var4 = (n2.h0) obj;
                zc.x.v((zc.u) obj3, null, zc.w.UNDISPATCHED, new b7.a0((q1) obj2, null), 1);
                return new Object();
            case l1.c.f8510f /* 10 */:
                q1 q1Var = (q1) obj3;
                n1 n1Var = (n1) obj2;
                n2.h0 h0Var5 = (n2.h0) obj;
                q1Var.f3657i.add(n1Var);
                return new o0(7, q1Var, n1Var);
            case 11:
                q1 q1Var2 = (q1) obj3;
                q1 q1Var3 = (q1) obj2;
                n2.h0 h0Var6 = (n2.h0) obj;
                q1Var2.f3658j.add(q1Var3);
                return new o0(5, q1Var2, q1Var3);
            case 12:
                n2.h0 h0Var7 = (n2.h0) obj;
                return new o0(6, (q1) obj3, (k1) obj2);
            case 13:
                f.b bVar = (f.b) obj3;
                e.g gVar2 = (e.g) obj2;
                n2.h0 h0Var8 = (n2.h0) obj;
                bVar.a(gVar2);
                return new o0(8, bVar, gVar2);
            case 14:
                f.b bVar2 = (f.b) obj3;
                e.h hVar = (e.h) obj2;
                n2.h0 h0Var9 = (n2.h0) obj;
                bVar2.a(hVar);
                return new o0(9, bVar2, hVar);
            case l1.c.f8512h /* 15 */:
                Throwable th3 = (Throwable) obj;
                ((j1.i) obj3).b((j1.j) obj2);
                return yVar;
            case 16:
                i3.o oVar = (i3.o) obj2;
                r0 r0Var = (r0) obj;
                r0Var.a();
                k3.d.o0(r0Var, (i3.h) obj3, oVar, 0.0f, null, 60);
                return yVar;
            case 17:
                r0 r0Var2 = (r0) obj;
                r0Var2.a();
                k3.d.o0(r0Var2, ((i3.f0) obj3).f6631f, (i3.o) obj2, 0.0f, null, 60);
                return yVar;
            case 18:
                Throwable th4 = (Throwable) obj;
                ((j1.i) obj3).b((j1.h) obj2);
                return yVar;
            case 19:
                mc.a aVar2 = (mc.a) obj2;
                x1.g gVar3 = (x1.g) obj;
                ((mc.a) obj3).b();
                if (aVar2 != null) {
                    z10 = ((Boolean) aVar2.b()).booleanValue();
                }
                if (z10) {
                    gVar3.close();
                }
                return yVar;
            case 20:
                s2 s2Var = (s2) obj3;
                s2 s2Var2 = (s2) obj2;
                k3.d dVar2 = (k3.d) obj;
                float v10 = dVar2.v(h3.f5167e);
                float f12 = v10 / 2;
                k3.d.y(dVar2, ((i3.s) s2Var.getValue()).f6689a, dVar2.v(h3.f5165c) - f12, 0L, new k3.h(v10, 0.0f, 0, 0, 30), 108);
                if (x4.f.a(((x4.f) s2Var2.getValue()).A, 0) > 0) {
                    k3.d.y(dVar2, ((i3.s) s2Var.getValue()).f6689a, dVar2.v(((x4.f) s2Var2.getValue()).A) - f12, 0L, k3.g.f7961a, 108);
                }
                return yVar;
            case 21:
                ((m2) obj3).f5258a.setValue(new l1.d0((b2) obj2, (b2) obj));
                return yVar;
            case 22:
                nc.q qVar = (nc.q) obj2;
                d1.c cVar = (d1.c) obj;
                ((g2.m) obj3).a(((Number) cVar.e()).floatValue() - qVar.A);
                qVar.A = ((Number) cVar.e()).floatValue();
                return yVar;
            case 23:
                Throwable th5 = (Throwable) obj;
                ((h1.a) obj3).f5838a.j((h1.g) obj2);
                return yVar;
            case 24:
                g2.m mVar = (g2.m) obj3;
                h1.o0 o0Var = (h1.o0) obj2;
                long j10 = ((h1.u) obj).f6011a;
                if (o0Var.H0) {
                    f8 = h3.b.f(j10, -1.0f);
                } else {
                    f8 = h3.b.f(j10, 1.0f);
                }
                h1.n1 n1Var2 = o0Var.D0;
                h1.m0 m0Var2 = h1.n0.f5983a;
                if (n1Var2 == h1.n1.Vertical) {
                    j2 = f8 & 4294967295L;
                } else {
                    j2 = f8 >> 32;
                }
                mVar.a(Float.intBitsToFloat((int) j2));
                return yVar;
            case 25:
                n2 n2Var = (n2) obj3;
                p2 p2Var = (p2) obj2;
                h1.u uVar2 = (h1.u) obj;
                if (uVar2.f6012b) {
                    f10 = -1.0f;
                }
                long j11 = uVar2.f6011a;
                if (p2Var.f5992d == h1.n1.Horizontal) {
                    a10 = h3.b.a(j11, 0.0f, 1);
                } else {
                    a10 = h3.b.a(j11, 0.0f, 2);
                }
                n2Var.a(1, h3.b.f(a10, f10));
                return yVar;
            case 26:
                f3 f3Var = (f3) obj3;
                ((Long) obj).getClass();
                float f13 = f3Var.f5899e;
                f3Var.f5899e = 0.0f;
                ((mc.l) obj2).k(Float.valueOf(f13));
                return yVar;
            case 27:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                return Long.valueOf(((he.e) obj3).f6463b.L(aVar3, (ie.b) obj2));
            case 28:
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                return Long.valueOf(((he.f) obj3).f6467b.L(aVar4, (ie.a) obj2));
            default:
                t7.a aVar5 = (t7.a) obj;
                aVar5.getClass();
                return ((he.h) obj3).f6469b.M(aVar5, (ArrayList) obj2);
        }
    }

    public /* synthetic */ l(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
