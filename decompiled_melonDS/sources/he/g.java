package he;

import a1.n0;
import a4.r0;
import android.database.SQLException;
import android.net.Uri;
import android.view.View;
import androidx.preference.Preference;
import b4.o0;
import bd.v;
import cd.q1;
import f2.m0;
import g2.w5;
import g3.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l1.a1;
import l1.c1;
import l1.c2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
import n2.h0;
import n2.r1;
import n2.u1;
import n2.w0;
import p1.z0;
import q4.x;
import u1.l0;
import u1.p0;
import y3.h1;
import y3.i1;
import yb.y;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        UUID uuid;
        x4.c cVar;
        int i2;
        long j2;
        switch (this.A) {
            case 0:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                return Long.valueOf(((h) this.B).f6469b.L(aVar, (ie.c) this.L));
            case DSiCameraSource.FrontCamera /* 1 */:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                return Long.valueOf(((i) this.B).f6471b.L(aVar2, (ie.f) this.L));
            case 2:
                a1.q qVar = (a1.q) obj;
                qVar.getClass();
                ((i) this.B).a((t7.a) this.L, qVar);
                return y.f14813a;
            case 3:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                ((t) this.B).f6487e.K(aVar3, (je.j) this.L);
                return y.f14813a;
            case 4:
                je.d dVar = (je.d) this.L;
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                jb.c cVar2 = ((t) this.B).f6489g;
                cVar2.getClass();
                try {
                    ((c) cVar2.B).K(aVar4, dVar);
                } catch (SQLException e6) {
                    String message = e6.getMessage();
                    if (message != null) {
                        if (!vc.h.Y(message, "unique", true) && !vc.h.Y(message, "2067", false) && !vc.h.Y(message, "1555", false)) {
                            throw e6;
                        }
                        d dVar2 = (d) cVar2.L;
                        dVar2.getClass();
                        aVar4.getClass();
                        if (dVar != null) {
                            t7.c T = aVar4.T(dVar2.t());
                            try {
                                dVar2.j(T, dVar);
                                T.N();
                                q8.r.q(T, null);
                                p7.l.u(aVar4);
                            } finally {
                            }
                        }
                    } else {
                        throw e6;
                    }
                }
                return y.f14813a;
            case l1.c.f8511g /* 5 */:
                mc.l lVar = (mc.l) this.L;
                oe.a aVar5 = (oe.a) obj;
                q1 q1Var = ((hg.l) this.B).f6505f;
                if (aVar5 != null) {
                    uuid = aVar5.f10905a;
                } else {
                    uuid = null;
                }
                q1Var.j(uuid);
                lVar.k(aVar5);
                return y.f14813a;
            case l1.c.f8509e /* 6 */:
                String str = (String) obj;
                str.getClass();
                ((hg.l) this.L).e(new oe.a(null, str, (Uri) this.B));
                return y.f14813a;
            case 7:
                a1 a1Var = (a1) this.B;
                i1 i1Var = (i1) this.L;
                h1 h1Var = (h1) obj;
                long j10 = ((x4.j) a1Var.f8493i0.k(h1Var)).f14340a;
                if (a1Var.f8494j0) {
                    h1.o(h1Var, i1Var, (int) (j10 >> 32), (int) (4294967295L & j10));
                } else {
                    h1.u(h1Var, i1Var, (int) (j10 >> 32), (int) (4294967295L & j10), null, 12);
                }
                return y.f14813a;
            case 8:
                c1 c1Var = (c1) this.B;
                i1 i1Var2 = (i1) this.L;
                h1 h1Var2 = (h1) obj;
                boolean z10 = c1Var.f8517m0;
                float f8 = c1Var.f8513i0;
                if (z10) {
                    h1.n(h1Var2, i1Var2, h1Var2.O(f8), h1Var2.O(c1Var.f8514j0));
                } else {
                    h1.k(h1Var2, i1Var2, h1Var2.O(f8), h1Var2.O(c1Var.f8514j0));
                }
                return y.f14813a;
            case l1.c.f8508d /* 9 */:
                c2 c2Var = (c2) this.B;
                View view = (View) this.L;
                h0 h0Var = (h0) obj;
                c2Var.a(view);
                return new o0(10, c2Var, view);
            case l1.c.f8510f /* 10 */:
                ((x4.c) obj).getClass();
                float g10 = ((b1) this.B).g();
                Integer num = (Integer) ((w0) this.L).getValue();
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = Preference.DEFAULT_ORDER;
                }
                return new x4.j((0 << 32) | (cVar.O(g10 * i2) & 4294967295L));
            case 11:
                n0 n0Var = (n0) this.L;
                ((n2.y) this.B).A(obj);
                if (n0Var != null) {
                    n0Var.a(obj);
                }
                return y.f14813a;
            case 12:
                u1 u1Var = (u1) this.B;
                Throwable th2 = (Throwable) this.L;
                Throwable th3 = (Throwable) obj;
                synchronized (u1Var.f10041c) {
                    if (th2 != null) {
                        if (th3 != null) {
                            try {
                                if (th3 instanceof CancellationException) {
                                    th3 = null;
                                }
                                if (th3 != null) {
                                    p7.t.a(th2, th3);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    u1Var.f10043e = th2;
                    u1Var.f10058u.j(r1.ShutDown);
                }
                return y.f14813a;
            case 13:
                ld.a aVar6 = (ld.a) obj;
                aVar6.getClass();
                ld.a.a(aVar6, "key", ((jd.a) this.B).e());
                ld.a.a(aVar6, "value", ((jd.a) this.L).e());
                return y.f14813a;
            case 14:
                o1.l lVar2 = (o1.l) this.L;
                o1.r j11 = ((d5.j) this.B).j(((Integer) obj).intValue());
                int i10 = j11.f10585a;
                List list = j11.f10586b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = (int) ((o1.b) list.get(i12)).f10497a;
                    arrayList.add(new yb.j(Integer.valueOf(i10), new x4.a(lVar2.a(i11, i13))));
                    i10++;
                    i11 += i13;
                }
                return arrayList;
            case l1.c.f8512h /* 15 */:
                o1.l lVar3 = (o1.l) this.B;
                o1.k kVar = (o1.k) this.L;
                int intValue = ((Integer) obj).intValue();
                d5.j jVar = lVar3.f10533e;
                int i14 = jVar.f3860b;
                int r5 = jVar.r(intValue);
                return kVar.j(intValue, lVar3.a(0, r5), 0, r5, kVar.f10523d);
            case 16:
                og.h hVar = (og.h) this.B;
                ((h0) obj).getClass();
                hVar.f11000f0.addView(hVar, hVar.f11001g0);
                ((w0) this.L).setValue(Boolean.TRUE);
                return new a5.a(6, hVar);
            case 17:
                p1.c cVar3 = (p1.c) this.B;
                p1.d dVar3 = (p1.d) this.L;
                j4.c cVar4 = (j4.c) obj;
                y yVar = y.f14813a;
                j4.d dVar4 = cVar3.f11204i0;
                if (dVar4 != null) {
                    dVar4.b();
                }
                cVar3.f11204i0 = null;
                zc.m mVar = dVar3.f11207b;
                if (mVar != null) {
                    mVar.V(yVar);
                }
                dVar3.f11207b = null;
                return yVar;
            case 18:
                z0 z0Var = (z0) this.B;
                Object obj2 = this.L;
                h0 h0Var2 = (h0) obj;
                z0Var.L.i(obj2);
                return new o0(11, z0Var, obj2);
            case 19:
                return new z0((y2.f) this.B, (Map) obj, (y2.d) this.L);
            case 20:
                h1 h1Var3 = (h1) obj;
                m0 m0Var = new m0(2, (ArrayList) this.L);
                h1Var3.A = true;
                m0Var.k(h1Var3);
                h1Var3.A = false;
                ((w0) this.B).getValue();
                return y.f14813a;
            case 21:
                z zVar = (z) this.L;
                g3.r rVar = (g3.r) obj;
                rVar.getClass();
                if (!((oe.y) this.B).a()) {
                    zVar = z.f5551b;
                }
                rVar.c(zVar);
                return y.f14813a;
            case 22:
                rg.d dVar5 = (rg.d) this.B;
                ((u1.m0) obj).getClass();
                if (!((Boolean) ((w0) this.L).getValue()).booleanValue()) {
                    dVar5.b();
                }
                return y.f14813a;
            case 23:
                me.magnum.melonds.ui.layouteditor.b.m((sh.c) this.B, (me.magnum.melonds.ui.layouteditor.b) this.L, ((Integer) obj).intValue());
                return y.f14813a;
            case 24:
                ri.h hVar2 = (ri.h) this.B;
                e9.a aVar7 = (e9.a) this.L;
                ((IOException) obj).getClass();
                synchronized (hVar2) {
                    aVar7.f();
                }
                return y.f14813a;
            case 25:
                ((l1) this.B).i(null);
                ((v) this.L).a((t8.c) obj);
                return y.f14813a;
            case 26:
                mc.l lVar4 = (mc.l) this.L;
                x xVar = (x) obj;
                if (!nc.k.a((x) this.B, xVar)) {
                    lVar4.k(xVar);
                }
                return y.f14813a;
            case 27:
                p0 p0Var = (p0) this.B;
                i3.o oVar = (i3.o) this.L;
                r0 r0Var = (r0) obj;
                r0Var.a();
                if (((Boolean) p0Var.f13396s.getValue()).booleanValue() || ((Boolean) p0Var.f13397t.getValue()).booleanValue()) {
                    k3.d.X(r0Var, oVar, 0L, 0L, 0.0f, null, 126);
                }
                return y.f14813a;
            case 28:
                h1 h1Var4 = (h1) obj;
                ArrayList l10 = l0.l((List) this.B, (mc.a) ((w5) this.L).f5454b);
                if (l10 != null) {
                    int size2 = l10.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        yb.j jVar2 = (yb.j) l10.get(i15);
                        i1 i1Var3 = (i1) jVar2.A;
                        mc.a aVar8 = (mc.a) jVar2.B;
                        if (aVar8 != null) {
                            j2 = ((x4.j) aVar8.b()).f14340a;
                        } else {
                            j2 = 0;
                        }
                        h1.l(h1Var4, i1Var3, j2);
                    }
                }
                return y.f14813a;
            default:
                h0 h0Var3 = (h0) obj;
                return new o0(12, (w0) this.B, (j1.i) this.L);
        }
    }
}
