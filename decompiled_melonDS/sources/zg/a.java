package zg;

import a4.f0;
import ai.b0;
import ai.d0;
import ai.k0;
import ai.q0;
import ai.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.b1;
import androidx.lifecycle.e1;
import b4.q1;
import f2.g1;
import f2.j0;
import g2.e7;
import g2.f3;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.r3;
import g2.y1;
import i3.z;
import java.util.List;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.h1;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.t0;
import l1.w;
import l1.x;
import l4.r0;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.DSiWareTitle;
import n2.p1;
import n2.t2;
import n2.w0;
import u1.l1;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f15080a = new v2.c(214602143, false, new qh.a(5));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f15081b = new v2.c(-279255658, false, new qh.a(6));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f15082c = new v2.c(-102927401, false, new qh.a(7));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f15083d = new v2.c(1089149107, false, new mg.m(25, (byte) 0));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f15084e = new v2.c(-1538973900, false, new mg.m(26, (byte) 0));

    /* renamed from: f  reason: collision with root package name */
    public static final v2.c f15085f = new v2.c(-1747871394, false, new mg.m(27, (byte) 0));

    /* renamed from: g  reason: collision with root package name */
    public static final v2.c f15086g = new v2.c(1071512148, false, new mg.m(28, (byte) 0));

    /* renamed from: h  reason: collision with root package name */
    public static final v2.c f15087h = new v2.c(-77131700, false, new qh.a(8));

    /* renamed from: i  reason: collision with root package name */
    public static final v2.c f15088i = new v2.c(-762601867, false, new qh.a(9));

    /* renamed from: j  reason: collision with root package name */
    public static final v2.c f15089j = new v2.c(-1520532968, false, new mg.m(29, (byte) 0));

    /* renamed from: k  reason: collision with root package name */
    public static final v2.c f15090k = new v2.c(-525934473, false, new b(0));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, b3.p] */
    public static final void a(b3.p pVar, DSiWareTitle dSiWareTitle, mc.a aVar, mc.l lVar, mc.l lVar2, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        i3.f e6;
        pVar.getClass();
        dSiWareTitle.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1062247953);
        if (rVar.h(dSiWareTitle)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i17 = i2 | i10;
        if (rVar.h(aVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i18 = i17 | i11;
        if (rVar.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i19 = i18 | i12;
        if (rVar.h(lVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i20 = i19 | i13;
        if (rVar.h(aVar2)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i21 = i20 | i14;
        if ((74899 & i21) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i21 & 1, z10)) {
            boolean f8 = rVar.f(dSiWareTitle);
            Object L = rVar.L();
            Object obj = n2.l.f9953a;
            if (f8 || L == obj) {
                L = n2.s.w(yg.a.NONE);
                rVar.h0(L);
            }
            w0 w0Var = (w0) L;
            l1.d dVar = l1.i.f8573c;
            b3.f fVar = b3.c.f1758g0;
            w a10 = l1.u.a(dVar, fVar, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar2 = a4.g.f215e;
            n2.s.C(a10, fVar2, rVar);
            a4.f fVar3 = a4.g.f214d;
            n2.s.C(l10, fVar3, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar4 = a4.g.f216f;
            n2.s.u(rVar, valueOf, fVar4);
            a4.e eVar = a4.g.f217g;
            n2.s.y(rVar, eVar);
            a4.f fVar5 = a4.g.f213c;
            n2.s.C(c4, fVar5, rVar);
            t0 t0Var = t0.Min;
            b3.m mVar2 = b3.m.f1770a;
            b3.p n10 = l1.c.n(mVar2, t0Var);
            float f10 = 8;
            b3.p x9 = l1.c.x(n10, f10, f10, 0.0f, f10, 4);
            o1 a11 = m1.a(l1.i.f8571a, b3.c.f1755d0, rVar, 0);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(x9, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a11, fVar2, rVar);
            n2.s.C(l11, fVar3, rVar);
            w.d.x(hashCode2, rVar, fVar4, rVar, eVar);
            n2.s.C(c10, fVar5, rVar);
            boolean e10 = rVar.e(dSiWareTitle.getTitleId());
            Object L2 = rVar.L();
            if (e10 || L2 == obj) {
                L2 = (bi.g) aVar2.b();
                rVar.h0(L2);
            }
            bi.g gVar = (bi.g) L2;
            b3.p f11 = r1.i(mVar2, 48).f(new Object());
            Bitmap bitmap = gVar.f2282a;
            if (bitmap != null) {
                e6 = new i3.f(bitmap);
                i15 = 0;
                i16 = 1;
            } else {
                i15 = 0;
                i16 = 1;
                e6 = z.e(1, 1, 0, 28);
            }
            int i22 = f.f15091a[gVar.f2283b.ordinal()];
            if (i22 != i16) {
                if (i22 == 2) {
                    i15 = 1;
                } else {
                    m9.o.o();
                    return;
                }
            }
            f1.n.c(e6, f11, i15, rVar);
            l1.c.d(r1.l(mVar2, f10), rVar);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            b3.p f12 = new l1.w0(1.0f, true).f(r1.f8614b);
            w a12 = l1.u.a(l1.i.f8575e, fVar, rVar, 6);
            int hashCode3 = Long.hashCode(rVar.T);
            v2.g l12 = rVar.l();
            b3.p c11 = b3.a.c(f12, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a12, fVar2, rVar);
            n2.s.C(l12, fVar3, rVar);
            w.d.x(hashCode3, rVar, fVar4, rVar, eVar);
            n2.s.C(c11, fVar5, rVar);
            String name = dSiWareTitle.getName();
            t2 t2Var = g7.f5161b;
            e7.b(name, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, r0.a(((f7) rVar.j(t2Var)).f5150i, 0L, p7.t.o(18), null, null, 0L, 0L, null, 16777213), rVar, 0, 3120, 55294);
            p7.l.b(dSiWareTitle.getProducer(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5151j, rVar, 0, 0, 65534);
            rVar.p(true);
            boolean f13 = rVar.f(w0Var);
            Object L3 = rVar.L();
            if (f13 || L3 == obj) {
                L3 = new ai.s(w0Var, 28);
                rVar.h0(L3);
            }
            y1.a((mc.a) L3, null, false, v2.h.c(449120135, new v(dSiWareTitle, w0Var, aVar, lVar, lVar2), rVar), rVar, 24576, 14);
            rVar.p(true);
            n0.c(null, 0L, 0.0f, 0.0f, rVar, 0, 15);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new d0(pVar, dSiWareTitle, aVar, lVar, lVar2, aVar2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public static final void b(xg.h hVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        n2.r rVar;
        w0 w0Var;
        s9.a aVar2;
        n2.e eVar;
        Context context;
        w0 w0Var2;
        sd.f fVar;
        int i12;
        cc.c cVar;
        aVar.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-134762069);
        if (rVar2.h(hVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if ((i14 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i14 & 1, z10)) {
            w0 m = n2.s.m(hVar.f14611f, rVar2);
            w0 l10 = n2.s.l(hVar.f14613h, Boolean.FALSE, null, rVar2, 48, 2);
            Context context2 = (Context) rVar2.j(b4.r0.f1937b);
            Object[] objArr = {null};
            Object L = rVar2.L();
            n2.e eVar2 = n2.l.f9953a;
            if (L == eVar2) {
                L = new od.n(22);
                rVar2.h0(L);
            }
            w0 w0Var3 = (w0) y2.k.c(objArr, (mc.a) L, rVar2, 48);
            s9.a a10 = s9.c.a(rVar2);
            boolean h2 = rVar2.h(hVar);
            Object L2 = rVar2.L();
            if (!h2 && L2 != eVar2) {
                context = context2;
                w0Var = w0Var3;
                aVar2 = a10;
                eVar = eVar2;
            } else {
                w0Var = w0Var3;
                aVar2 = a10;
                eVar = eVar2;
                context = context2;
                i iVar = new i(3, hVar, xg.h.class, "importDSiWareTitleFile", "importDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 1);
                rVar2.h0(iVar);
                L2 = iVar;
            }
            mc.q qVar = (mc.q) ((nc.i) L2);
            qVar.getClass();
            sd.f fVar2 = sd.f.READ;
            final w0 A = n2.s.A(qVar, rVar2);
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                L3 = new Object();
                rVar2.h0(L3);
            }
            final r rVar3 = (r) L3;
            vd.a aVar3 = new vd.a(fVar2, 1);
            boolean h10 = rVar2.h(rVar3) | rVar2.f(A);
            Object L4 = rVar2.L();
            if (h10 || L4 == eVar) {
                L4 = new mc.l() { // from class: zg.p
                    @Override // mc.l
                    public final Object k(Object obj) {
                        re.a aVar4;
                        re.a aVar5;
                        Uri uri = (Uri) obj;
                        switch (r3) {
                            case 0:
                                r rVar4 = rVar3;
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = rVar4.f15102a;
                                    if (dSiWareTitle != null && (aVar4 = rVar4.f15103b) != null) {
                                        ((mc.q) A.getValue()).i(dSiWareTitle, aVar4, uri);
                                    }
                                    return y.f14813a;
                                }
                                rVar4.f15102a = null;
                                rVar4.f15103b = null;
                                return y.f14813a;
                            default:
                                r rVar5 = rVar3;
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = rVar5.f15102a;
                                    if (dSiWareTitle2 != null && (aVar5 = rVar5.f15103b) != null) {
                                        ((mc.q) A.getValue()).i(dSiWareTitle2, aVar5, uri);
                                    }
                                    return y.f14813a;
                                }
                                rVar5.f15102a = null;
                                rVar5.f15103b = null;
                                return y.f14813a;
                        }
                    }
                };
                rVar2.h0(L4);
            }
            e.k S = a.a.S(aVar3, (mc.l) L4, rVar2, 0);
            Object L5 = rVar2.L();
            if (L5 == eVar) {
                L5 = new q(rVar3, S);
                rVar2.h0(L5);
            }
            q qVar2 = L5;
            boolean h11 = rVar2.h(hVar);
            Object L6 = rVar2.L();
            if (!h11 && L6 != eVar) {
                w0Var2 = m;
                fVar = fVar2;
            } else {
                w0Var2 = m;
                fVar = fVar2;
                i iVar2 = new i(3, hVar, xg.h.class, "exportDSiWareTitleFile", "exportDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 0);
                rVar2.h0(iVar2);
                L6 = iVar2;
            }
            mc.q qVar3 = (mc.q) ((nc.i) L6);
            qVar3.getClass();
            final w0 A2 = n2.s.A(qVar3, rVar2);
            Object L7 = rVar2.L();
            if (L7 == eVar) {
                L7 = new Object();
                rVar2.h0(L7);
            }
            final r rVar4 = (r) L7;
            b1 b1Var = new b1(5);
            boolean h12 = rVar2.h(rVar4) | rVar2.f(A2);
            Object L8 = rVar2.L();
            if (!h12 && L8 != eVar) {
                i12 = 0;
            } else {
                i12 = 0;
                L8 = new mc.l() { // from class: zg.p
                    @Override // mc.l
                    public final Object k(Object obj) {
                        re.a aVar4;
                        re.a aVar5;
                        Uri uri = (Uri) obj;
                        switch (r3) {
                            case 0:
                                r rVar42 = rVar4;
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = rVar42.f15102a;
                                    if (dSiWareTitle != null && (aVar4 = rVar42.f15103b) != null) {
                                        ((mc.q) A2.getValue()).i(dSiWareTitle, aVar4, uri);
                                    }
                                    return y.f14813a;
                                }
                                rVar42.f15102a = null;
                                rVar42.f15103b = null;
                                return y.f14813a;
                            default:
                                r rVar5 = rVar4;
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = rVar5.f15102a;
                                    if (dSiWareTitle2 != null && (aVar5 = rVar5.f15103b) != null) {
                                        ((mc.q) A2.getValue()).i(dSiWareTitle2, aVar5, uri);
                                    }
                                    return y.f14813a;
                                }
                                rVar5.f15102a = null;
                                rVar5.f15103b = null;
                                return y.f14813a;
                        }
                    }
                };
                rVar2.h0(L8);
            }
            e.k S2 = a.a.S(b1Var, (mc.l) L8, rVar2, i12);
            Object L9 = rVar2.L();
            if (L9 == eVar) {
                L9 = new s(rVar4, S2);
                rVar2.h0(L9);
            }
            s sVar = L9;
            vd.a aVar4 = new vd.a(fVar, 1);
            boolean h13 = rVar2.h(hVar);
            Object L10 = rVar2.L();
            if (h13 || L10 == eVar) {
                L10 = new zb.a(3, hVar);
                rVar2.h0(L10);
            }
            e.k S3 = a.a.S(aVar4, (mc.l) L10, rVar2, 0);
            t2 t2Var = m0.f5257a;
            s9.a.b(aVar2, ((l0) rVar2.j(t2Var)).h());
            aVar2.a(false);
            yg.f fVar3 = (yg.f) w0Var2.getValue();
            long j2 = ((l0) rVar2.j(t2Var)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            w0 w0Var4 = w0Var;
            n2.e eVar3 = eVar;
            r3.b(l1.s.f(rVar2).f8530l, null, null, v2.h.c(-778996239, new k0(13, aVar), rVar2), null, null, v2.h.c(1390875060, new ai.m0(fVar3, S3, w0Var4, 19), rVar2), 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(-767243990, new g1.d(fVar3, hVar, qVar2, sVar, 3), rVar2), rVar2, 1575936, 100663296, 196534);
            rVar = rVar2;
            if (((Boolean) w0Var4.getValue()).booleanValue()) {
                rVar.X(1102400384);
                boolean f8 = rVar.f(w0Var4);
                Object L11 = rVar.L();
                if (f8 || L11 == eVar3) {
                    L11 = new ai.s(w0Var4, 29);
                    rVar.h0(L11);
                }
                mc.a aVar5 = (mc.a) L11;
                boolean h14 = rVar.h(hVar) | rVar.f(w0Var4);
                Object L12 = rVar.L();
                if (h14 || L12 == eVar3) {
                    L12 = new l1(15, hVar, w0Var4);
                    rVar.h0(L12);
                }
                cVar = null;
                d(null, aVar5, (mc.l) L12, rVar, 0);
                rVar.p(false);
            } else {
                cVar = null;
                rVar.X(1102637751);
                rVar.p(false);
            }
            if (((Boolean) l10.getValue()).booleanValue()) {
                rVar.X(1102687010);
                a5.f0 f0Var = new a5.f0(4);
                Object L13 = rVar.L();
                if (L13 == eVar3) {
                    L13 = new a3.g(14);
                    rVar.h0(L13);
                }
                k0.d.a((mc.a) L13, f0Var, f15086g, rVar, 438);
                rVar.p(false);
            } else {
                rVar.X(1102928407);
                rVar.p(false);
            }
            Context context3 = context;
            boolean h15 = rVar.h(hVar) | rVar.h(context3);
            Object L14 = rVar.L();
            if (h15 || L14 == eVar3) {
                L14 = new h(hVar, context3, cVar, 0);
                rVar.h0(L14);
            }
            n2.s.g(cVar, (mc.p) L14, rVar);
            boolean h16 = rVar.h(hVar) | rVar.h(context3);
            Object L15 = rVar.L();
            if (h16 || L15 == eVar3) {
                L15 = new h(hVar, context3, cVar, 1);
                rVar.h0(L15);
            }
            n2.s.g(cVar, (mc.p) L15, rVar);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new qh.c(hVar, aVar, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final b3.p r18, final l1.d1 r19, final java.util.List r20, final mc.l r21, final mc.p r22, l1.d1 r23, n2.m r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.a.c(b3.p, l1.d1, java.util.List, mc.l, mc.p, l1.d1, n2.m, int, int):void");
    }

    public static final void d(xg.k kVar, mc.a aVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        xg.k kVar2;
        w6.c cVar;
        int i12;
        aVar.getClass();
        lVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1504194021);
        int i13 = i2 | 2;
        if (rVar.h(aVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (rVar.h(lVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i12 = i15 & (-15);
                kVar2 = kVar;
            } else {
                e1 a10 = x6.a.a(rVar);
                if (a10 != null) {
                    if (a10 instanceof androidx.lifecycle.k) {
                        cVar = ((androidx.lifecycle.k) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = w6.a.f14160b;
                    }
                    i12 = i15 & (-15);
                    kVar2 = (xg.k) p7.j.M(nc.u.a(xg.k.class), a10, null, cVar, rVar);
                } else {
                    a0.j.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            rVar.q();
            yg.j jVar = (yg.j) n2.s.m(kVar2.f14621e, rVar).getValue();
            boolean h2 = rVar.h(kVar2);
            Object L = rVar.L();
            if (h2 || L == n2.l.f9953a) {
                L = new mh.m(19, (cc.c) null, kVar2);
                rVar.h0(L);
            }
            e(jVar, aVar, lVar, (mc.p) L, rVar, i12 & 1008);
        } else {
            rVar.R();
            kVar2 = kVar;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0((Object) kVar2, aVar, (yb.d) lVar, i2, 20);
        }
    }

    public static final void e(yg.j jVar, mc.a aVar, mc.l lVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-661086427);
        if ((i2 & 6) == 0) {
            if (rVar.f(jVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(pVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            if (l0.f.j(rVar, 0).f9198a.f7028a >= 840) {
                rVar.X(-2000294509);
                o(jVar, aVar, lVar, pVar, rVar, i10 & 8190);
                rVar.p(false);
            } else {
                rVar.X(-2000088018);
                j(jVar, aVar, lVar, pVar, rVar, i10 & 8190);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n(jVar, aVar, lVar, pVar, i2, 0);
        }
    }

    public static final void f(b3.p pVar, d1 d1Var, List list, mc.l lVar, mc.p pVar2, mc.p pVar3, mc.l lVar2, n2.m mVar, int i2) {
        b3.p pVar4;
        int i10;
        mc.l lVar3;
        mc.p pVar5;
        mc.p pVar6;
        mc.l lVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h1 h1Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-858350362);
        if ((i2 & 6) == 0) {
            pVar4 = pVar;
            if (rVar.f(pVar4)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i2;
        } else {
            pVar4 = pVar;
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(d1Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(list)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i2 & 3072) == 0) {
            lVar3 = lVar;
            if (rVar.h(lVar3)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        } else {
            lVar3 = lVar;
        }
        if ((i2 & 24576) == 0) {
            pVar5 = pVar2;
            if (rVar.h(pVar5)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        } else {
            pVar5 = pVar2;
        }
        if ((196608 & i2) == 0) {
            pVar6 = pVar3;
            if (rVar.h(pVar6)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        } else {
            pVar6 = pVar3;
        }
        if ((1572864 & i2) == 0) {
            lVar4 = lVar2;
            if (rVar.h(lVar4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        } else {
            lVar4 = lVar2;
        }
        boolean z14 = false;
        if ((599187 & i10) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p k10 = l1.c.k(pVar, d1Var);
            t2 t2Var = q1.f1924n;
            float f8 = 16;
            h1 h1Var2 = new h1(l1.c.j(d1Var, (x4.m) rVar.j(t2Var)), d1Var.b(), l1.c.i(d1Var, (x4.m) rVar.j(t2Var)), d1Var.a() + f8 + 56 + f8);
            boolean h2 = rVar.h(list);
            if ((i10 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = h2 | z11;
            if ((57344 & i10) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z15 | z12;
            if ((458752 & i10) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = z16 | z13;
            if ((i10 & 3670016) == 1048576) {
                z14 = true;
            }
            boolean z18 = z17 | z14;
            Object L = rVar.L();
            if (!z18 && L != n2.l.f9953a) {
                h1Var = h1Var2;
            } else {
                h1Var = h1Var2;
                d2.a aVar = new d2.a(list, lVar3, pVar5, pVar6, lVar4);
                rVar.h0(aVar);
                L = aVar;
            }
            k0.d.c(k10, null, h1Var, null, null, null, false, null, (mc.l) L, rVar, 0, 506);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar4, d1Var, list, lVar, pVar2, pVar3, lVar2, i2, 1);
        }
    }

    public static final void g(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(419579728);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i2;
        } else {
            i10 = i2;
        }
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            e7.b(l0.f.I(rVar, R.string.no_dsiware_roms_found), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l1.n(pVar, i2, 3, (byte) 0);
        }
    }

    public static final void h(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-853335576);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i2;
        } else {
            i10 = i2;
        }
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p t5 = l1.c.t(pVar, 24);
            v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            e7.b(l0.f.I(rVar, R.string.dsiware_manager_load_error), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l1.n(pVar, i2, 2, (byte) 0);
        }
    }

    public static final void i(final re.a aVar, boolean z10, mc.a aVar2, n2.m mVar, final int i2) {
        int i10;
        int i11;
        boolean z11;
        final boolean z12;
        final mc.a aVar3;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1148831956);
        if (rVar.g(z10)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i10 | i2;
        if (rVar.h(aVar2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i13 & 1, z11)) {
            z12 = z10;
            aVar3 = aVar2;
            g2.s.b(aVar3, null, z12, null, v2.h.c(-763411951, new q0(17, aVar), rVar), rVar, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
        } else {
            z12 = z10;
            aVar3 = aVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(z12, aVar3, i2) { // from class: zg.c
                public final /* synthetic */ boolean B;
                public final /* synthetic */ mc.a L;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(7);
                    a.i(re.a.this, this.B, this.L, (n2.m) obj, F);
                    return y.f14813a;
                }
            };
        }
    }

    public static final void j(yg.j jVar, mc.a aVar, mc.l lVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-83231447);
        if ((i2 & 6) == 0) {
            if (rVar.f(jVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(pVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        int i15 = i10;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            og.a.b(aVar, v2.h.c(479601184, new b2.e(aVar, jVar, lVar, pVar, 5), rVar), rVar, ((i15 >> 3) & 14) | 48);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n(jVar, aVar, lVar, pVar, i2, 1);
        }
    }

    public static final void k(b3.p pVar, oe.h hVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(121602030);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.d(hVar.ordinal())) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(aVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            Context context = (Context) rVar.j(b4.r0.f1937b);
            b1 b1Var = new b1(4);
            if ((i10 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z11 || L == eVar) {
                L = new g1(4, aVar);
                rVar.h0(L);
            }
            e.k S = a.a.S(b1Var, (mc.l) L, rVar, 0);
            b3.p t5 = l1.c.t(pVar, 24);
            w a10 = l1.u.a(l1.i.f8574d, b3.c.f1759h0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(a10, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            int i14 = l.f15097a[hVar.ordinal()];
            b3.m mVar2 = b3.m.f1770a;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        rVar.X(-1376837873);
                        rVar.p(false);
                        z12 = true;
                        rVar.p(z12);
                    } else {
                        throw w.d.i(rVar, -44468706, false);
                    }
                } else {
                    rVar.X(-1377651034);
                    e7.b(l0.f.I(rVar, R.string.dsiware_manager_invalid_dsi_setup), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
                    rVar = rVar;
                    l1.c.d(r1.c(mVar2, 8), rVar);
                    boolean h2 = rVar.h(context) | rVar.h(S);
                    Object L2 = rVar.L();
                    if (h2 || L2 == eVar) {
                        L2 = new wh.b(context, S, 2);
                        rVar.h0(L2);
                    }
                    n0.a((mc.a) L2, null, false, null, null, og.a.d(rVar), null, f15088i, rVar, 805306368, 382);
                    rVar.p(false);
                }
            } else {
                rVar.X(-1378481617);
                e7.b(l0.f.I(rVar, R.string.dsiware_manager_no_dsi_setup), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
                rVar = rVar;
                l1.c.d(r1.c(mVar2, 8), rVar);
                boolean h10 = rVar.h(context) | rVar.h(S);
                Object L3 = rVar.L();
                if (h10 || L3 == eVar) {
                    L3 = new wh.b(context, S, 1);
                    rVar.h0(L3);
                }
                n0.a((mc.a) L3, null, false, null, null, og.a.d(rVar), null, f15087h, rVar, 805306368, 382);
                rVar.p(false);
            }
            z12 = true;
            rVar.p(z12);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(pVar, hVar, aVar, i2, 14);
        }
    }

    public static final void l(final DSiWareTitle dSiWareTitle, yg.a aVar, mc.l lVar, mc.a aVar2, final mc.l lVar2, final mc.l lVar3, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        boolean z12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1094642930);
        if (rVar.h(dSiWareTitle)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i2 | i10;
        if (rVar.d(aVar.ordinal())) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar.h(aVar2)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar.h(lVar2)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14;
        if (rVar.h(lVar3)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i21 = i20 | i15;
        boolean z13 = true;
        if ((74899 & i21) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i21 & 1, z10)) {
            int i22 = f.f15092b[aVar.ordinal()];
            if (i22 != 1) {
                n2.e eVar = n2.l.f9953a;
                if (i22 != 2) {
                    if (i22 != 3) {
                        if (i22 == 4) {
                            rVar.X(1181313212);
                            if ((i21 & 896) != 256) {
                                z13 = false;
                            }
                            Object L = rVar.L();
                            if (z13 || L == eVar) {
                                L = new b0(lVar, 10);
                                rVar.h0(L);
                            }
                            g2.s.a(true, (mc.a) L, null, 0L, null, null, v2.h.c(-1708503200, new mc.q() { // from class: zg.e
                                @Override // mc.q
                                public final Object i(Object obj, Object obj2, Object obj3) {
                                    boolean z14;
                                    boolean z15;
                                    int i23 = r1;
                                    x xVar = (x) obj;
                                    n2.m mVar2 = (n2.m) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i23) {
                                        case 0:
                                            xVar.getClass();
                                            if ((intValue & 17) != 16) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            n2.r rVar2 = (n2.r) mVar2;
                                            if (rVar2.O(intValue & 1, z14)) {
                                                re.a aVar3 = re.a.PUBLIC_SAV;
                                                DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                                boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                                mc.l lVar4 = lVar3;
                                                boolean f8 = rVar2.f(lVar4);
                                                Object L2 = rVar2.L();
                                                n2.e eVar2 = n2.l.f9953a;
                                                if (f8 || L2 == eVar2) {
                                                    L2 = new b0(lVar4, 11);
                                                    rVar2.h0(L2);
                                                }
                                                a.i(aVar3, hasPublicSavFile, (mc.a) L2, rVar2, 6);
                                                re.a aVar4 = re.a.PRIVATE_SAV;
                                                boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                                boolean f10 = rVar2.f(lVar4);
                                                Object L3 = rVar2.L();
                                                if (f10 || L3 == eVar2) {
                                                    L3 = new b0(lVar4, 12);
                                                    rVar2.h0(L3);
                                                }
                                                a.i(aVar4, hasPrivateSavFile, (mc.a) L3, rVar2, 6);
                                                re.a aVar5 = re.a.BANNER_SAV;
                                                boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                                boolean f11 = rVar2.f(lVar4);
                                                Object L4 = rVar2.L();
                                                if (f11 || L4 == eVar2) {
                                                    L4 = new b0(lVar4, 13);
                                                    rVar2.h0(L4);
                                                }
                                                a.i(aVar5, hasBannerSavFile, (mc.a) L4, rVar2, 6);
                                            } else {
                                                rVar2.R();
                                            }
                                            return y.f14813a;
                                        default:
                                            xVar.getClass();
                                            if ((intValue & 17) != 16) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            n2.r rVar3 = (n2.r) mVar2;
                                            if (rVar3.O(intValue & 1, z15)) {
                                                re.a aVar6 = re.a.PUBLIC_SAV;
                                                DSiWareTitle dSiWareTitle3 = dSiWareTitle;
                                                boolean hasPublicSavFile2 = dSiWareTitle3.hasPublicSavFile();
                                                mc.l lVar5 = lVar3;
                                                boolean f12 = rVar3.f(lVar5);
                                                Object L5 = rVar3.L();
                                                n2.e eVar3 = n2.l.f9953a;
                                                if (f12 || L5 == eVar3) {
                                                    L5 = new b0(lVar5, 4);
                                                    rVar3.h0(L5);
                                                }
                                                a.i(aVar6, hasPublicSavFile2, (mc.a) L5, rVar3, 6);
                                                re.a aVar7 = re.a.PRIVATE_SAV;
                                                boolean hasPrivateSavFile2 = dSiWareTitle3.hasPrivateSavFile();
                                                boolean f13 = rVar3.f(lVar5);
                                                Object L6 = rVar3.L();
                                                if (f13 || L6 == eVar3) {
                                                    L6 = new b0(lVar5, 5);
                                                    rVar3.h0(L6);
                                                }
                                                a.i(aVar7, hasPrivateSavFile2, (mc.a) L6, rVar3, 6);
                                                re.a aVar8 = re.a.BANNER_SAV;
                                                boolean hasBannerSavFile2 = dSiWareTitle3.hasBannerSavFile();
                                                boolean f14 = rVar3.f(lVar5);
                                                Object L7 = rVar3.L();
                                                if (f14 || L7 == eVar3) {
                                                    L7 = new b0(lVar5, 6);
                                                    rVar3.h0(L7);
                                                }
                                                a.i(aVar8, hasBannerSavFile2, (mc.a) L7, rVar3, 6);
                                            } else {
                                                rVar3.R();
                                            }
                                            return y.f14813a;
                                    }
                                }
                            }, rVar), rVar, 1572870);
                            rVar.p(false);
                        } else {
                            throw w.d.i(rVar, 315143268, false);
                        }
                    } else {
                        rVar.X(1180326172);
                        if ((i21 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Object L2 = rVar.L();
                        if (z12 || L2 == eVar) {
                            L2 = new b0(lVar, 9);
                            rVar.h0(L2);
                        }
                        g2.s.a(true, (mc.a) L2, null, 0L, null, null, v2.h.c(-1024272895, new mc.q() { // from class: zg.e
                            @Override // mc.q
                            public final Object i(Object obj, Object obj2, Object obj3) {
                                boolean z14;
                                boolean z15;
                                int i23 = r1;
                                x xVar = (x) obj;
                                n2.m mVar2 = (n2.m) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i23) {
                                    case 0:
                                        xVar.getClass();
                                        if ((intValue & 17) != 16) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        n2.r rVar2 = (n2.r) mVar2;
                                        if (rVar2.O(intValue & 1, z14)) {
                                            re.a aVar3 = re.a.PUBLIC_SAV;
                                            DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                            boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                            mc.l lVar4 = lVar2;
                                            boolean f8 = rVar2.f(lVar4);
                                            Object L22 = rVar2.L();
                                            n2.e eVar2 = n2.l.f9953a;
                                            if (f8 || L22 == eVar2) {
                                                L22 = new b0(lVar4, 11);
                                                rVar2.h0(L22);
                                            }
                                            a.i(aVar3, hasPublicSavFile, (mc.a) L22, rVar2, 6);
                                            re.a aVar4 = re.a.PRIVATE_SAV;
                                            boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                            boolean f10 = rVar2.f(lVar4);
                                            Object L3 = rVar2.L();
                                            if (f10 || L3 == eVar2) {
                                                L3 = new b0(lVar4, 12);
                                                rVar2.h0(L3);
                                            }
                                            a.i(aVar4, hasPrivateSavFile, (mc.a) L3, rVar2, 6);
                                            re.a aVar5 = re.a.BANNER_SAV;
                                            boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                            boolean f11 = rVar2.f(lVar4);
                                            Object L4 = rVar2.L();
                                            if (f11 || L4 == eVar2) {
                                                L4 = new b0(lVar4, 13);
                                                rVar2.h0(L4);
                                            }
                                            a.i(aVar5, hasBannerSavFile, (mc.a) L4, rVar2, 6);
                                        } else {
                                            rVar2.R();
                                        }
                                        return y.f14813a;
                                    default:
                                        xVar.getClass();
                                        if ((intValue & 17) != 16) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        n2.r rVar3 = (n2.r) mVar2;
                                        if (rVar3.O(intValue & 1, z15)) {
                                            re.a aVar6 = re.a.PUBLIC_SAV;
                                            DSiWareTitle dSiWareTitle3 = dSiWareTitle;
                                            boolean hasPublicSavFile2 = dSiWareTitle3.hasPublicSavFile();
                                            mc.l lVar5 = lVar2;
                                            boolean f12 = rVar3.f(lVar5);
                                            Object L5 = rVar3.L();
                                            n2.e eVar3 = n2.l.f9953a;
                                            if (f12 || L5 == eVar3) {
                                                L5 = new b0(lVar5, 4);
                                                rVar3.h0(L5);
                                            }
                                            a.i(aVar6, hasPublicSavFile2, (mc.a) L5, rVar3, 6);
                                            re.a aVar7 = re.a.PRIVATE_SAV;
                                            boolean hasPrivateSavFile2 = dSiWareTitle3.hasPrivateSavFile();
                                            boolean f13 = rVar3.f(lVar5);
                                            Object L6 = rVar3.L();
                                            if (f13 || L6 == eVar3) {
                                                L6 = new b0(lVar5, 5);
                                                rVar3.h0(L6);
                                            }
                                            a.i(aVar7, hasPrivateSavFile2, (mc.a) L6, rVar3, 6);
                                            re.a aVar8 = re.a.BANNER_SAV;
                                            boolean hasBannerSavFile2 = dSiWareTitle3.hasBannerSavFile();
                                            boolean f14 = rVar3.f(lVar5);
                                            Object L7 = rVar3.L();
                                            if (f14 || L7 == eVar3) {
                                                L7 = new b0(lVar5, 6);
                                                rVar3.h0(L7);
                                            }
                                            a.i(aVar8, hasBannerSavFile2, (mc.a) L7, rVar3, 6);
                                        } else {
                                            rVar3.R();
                                        }
                                        return y.f14813a;
                                }
                            }
                        }, rVar), rVar, 1572870);
                        rVar.p(false);
                    }
                } else {
                    rVar.X(1179550552);
                    if ((i21 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L3 = rVar.L();
                    if (z11 || L3 == eVar) {
                        L3 = new b0(lVar, 3);
                        rVar.h0(L3);
                    }
                    g2.s.a(true, (mc.a) L3, null, 0L, null, null, v2.h.c(-340042590, new j0(lVar, aVar2), rVar), rVar, 1572870);
                    rVar.p(false);
                }
            } else {
                rVar.X(1179472773);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new d0(dSiWareTitle, aVar, lVar, aVar2, lVar2, lVar3, i2);
        }
    }

    public static final void m(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-791636580);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            f3.a(l1.s.f8618b.e(b3.m.f1770a, b3.c.X), ((l0) rVar.j(m0.f5257a)).i(), 0.0f, 0L, 0, rVar, 0, 28);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.x(pVar, i2, 5);
        }
    }

    public static final void n(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(351969663);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i2;
        } else {
            i10 = i2;
        }
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p t5 = l1.c.t(pVar, 16);
            v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(t5, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            f3.a(null, 0L, 0.0f, 0L, 0, rVar, 0, 31);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l1.n(pVar, i2, 4, (byte) 0);
        }
    }

    public static final void o(yg.j jVar, mc.a aVar, mc.l lVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-289244578);
        if ((i2 & 6) == 0) {
            if (rVar.f(jVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(pVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            p7.l.a(l0.f.I(rVar, R.string.select_dsiware_title), aVar, v2.h.c(2112373737, new m(jVar, lVar, pVar, 1), rVar), v2.h.c(433906343, new k0(17, aVar), rVar), false, rVar, (i10 & 112) | 28032, 0);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n(jVar, aVar, lVar, pVar, i2, 2);
        }
    }

    public static final void p(b3.p pVar, d1 d1Var, List list, mc.l lVar, mc.p pVar2, mc.p pVar3, mc.l lVar2, n2.m mVar, int i2) {
        int i10;
        List list2;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-866377154);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(d1Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            list2 = list;
            if (rVar.h(list2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        } else {
            list2 = list;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(lVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.h(pVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(pVar3)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        if ((1572864 & i2) == 0) {
            if (rVar.h(lVar2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        }
        if ((599187 & i10) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            if (list2.isEmpty()) {
                rVar.X(-1810956402);
                e7.b(l0.f.I(rVar, R.string.no_dsiware_titles_installed), l1.c.t(l1.s.f8618b.e(l1.c.k(l1.c.s(b3.m.f1770a, d1Var), d1Var), b3.c.X), 24), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131068);
                rVar = rVar;
                rVar.p(false);
            } else {
                rVar.X(-1810624454);
                f(r1.f8615c, d1Var, list, lVar, pVar2, pVar3, lVar2, rVar, (i10 & 112) | 6 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016));
                rVar.p(false);
            }
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar, d1Var, list, lVar, pVar2, pVar3, lVar2, i2, 0);
        }
    }
}
