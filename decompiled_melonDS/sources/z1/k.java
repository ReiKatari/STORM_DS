package z1;

import a5.r0;
import a5.u;
import ai.c0;
import android.content.Context;
import android.os.Build;
import d2.t;
import k7.w;
import kf.s0;
import l1.r1;
import n2.p1;
import n2.r;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f14879a = new r0(14);

    public static final void a(x1.g gVar, x1.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        Context context;
        r rVar = (r) mVar;
        rVar.Z(1904307118);
        if (rVar.f(gVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(cVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        boolean z11 = true;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            if (Build.VERSION.SDK_INT >= 28) {
                rVar.X(-1009482584);
                context = (Context) rVar.j(b4.r0.f1937b);
                rVar.p(false);
            } else {
                rVar.X(-1009433480);
                rVar.p(false);
                context = null;
            }
            boolean h2 = rVar.h(cVar);
            if ((i13 & 14) != 4) {
                z11 = false;
            }
            boolean h10 = h2 | z11 | rVar.h(context);
            Object L = rVar.L();
            if (h10 || L == n2.l.f9953a) {
                L = new c0(cVar, context, gVar, 19);
                rVar.h0(L);
            }
            g1.i.b(null, null, (mc.l) L, rVar, 0, 3);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new qh.c(gVar, cVar, i2, 5);
        }
    }

    public static final void b(final int i2, final int i10, final long j2, n2.m mVar) {
        final int i11;
        int i12;
        boolean z10;
        p1 r5;
        mc.p pVar;
        boolean z11;
        int i13;
        int i14;
        r rVar = (r) mVar;
        rVar.Z(-1240244237);
        if ((i10 & 6) == 0) {
            i11 = i2;
            if (rVar.d(i11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i11 = i2;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.e(j2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z12 = true;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i12 & 1, z10)) {
            Context context = (Context) rVar.j(b4.r0.f1937b);
            boolean f8 = rVar.f(context);
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z11 | f8;
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z13 || L == eVar) {
                L = Integer.valueOf(context.obtainStyledAttributes(new int[]{i11}).getResourceId(0, -1));
                rVar.h0(L);
            }
            int intValue = ((Number) L).intValue();
            if (intValue == -1) {
                r5 = rVar.r();
                if (r5 != null) {
                    pVar = new mc.p() { // from class: z1.i
                        @Override // mc.p
                        public final Object j(Object obj, Object obj2) {
                            int i15 = r5;
                            n2.m mVar2 = (n2.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i15) {
                                case 0:
                                    k.b(i11, s.F(i10 | 1), j2, mVar2);
                                    break;
                                default:
                                    k.b(i11, s.F(i10 | 1), j2, mVar2);
                                    break;
                            }
                            return y.f14813a;
                        }
                    };
                    r5.f9983d = pVar;
                }
                return;
            }
            n3.b z14 = w.z(rVar, intValue);
            if ((i12 & 112) != 32) {
                z12 = false;
            }
            Object L2 = rVar.L();
            if (z12 || L2 == eVar) {
                if (j2 == 16) {
                    L2 = null;
                } else {
                    L2 = new i3.l(5, j2);
                }
                rVar.h0(L2);
            }
            l1.p.a(f3.g.g(r1.i(b3.m.f1770a, g1.f.f5029j), z14, null, y3.n.f14709a, 0.0f, (i3.l) L2, 22), rVar, 0);
        } else {
            rVar.R();
        }
        r5 = rVar.r();
        if (r5 != null) {
            pVar = new mc.p() { // from class: z1.i
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    int i15 = r5;
                    n2.m mVar2 = (n2.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i15) {
                        case 0:
                            k.b(i2, s.F(i10 | 1), j2, mVar2);
                            break;
                        default:
                            k.b(i2, s.F(i10 | 1), j2, mVar2);
                            break;
                    }
                    return y.f14813a;
                }
            };
            r5.f9983d = pVar;
        }
    }

    public static final void c(x1.g gVar, b2.g gVar2, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean h2;
        int i12;
        boolean h10;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(-2040393164);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h10 = rVar.f(gVar);
            } else {
                h10 = rVar.h(gVar);
            }
            if (h10) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = rVar.f(gVar2);
            } else {
                h2 = rVar.h(gVar2);
            }
            if (h2) {
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
        boolean z12 = false;
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            if ((i10 & 112) != 32 && ((i10 & 64) == 0 || !rVar.f(gVar2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z11 || L == eVar) {
                L = new m(new t(6, new q1.e(17, gVar2, aVar)));
                rVar.h0(L);
            }
            m mVar2 = (m) L;
            if ((i10 & 14) == 4 || ((i10 & 8) != 0 && rVar.h(gVar))) {
                z12 = true;
            }
            Object L2 = rVar.L();
            if (z12 || L2 == eVar) {
                L2 = new s0(26, gVar);
                rVar.h0(L2);
            }
            u.a(mVar2, (mc.a) L2, f14879a, v2.h.c(1315155414, new qh.c(4, gVar2, gVar), rVar), rVar, 3456, 0);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(gVar, gVar2, aVar, i2, 13);
        }
    }

    public static final void d(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.Z(1392105195);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(cVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            pc.a.g(pVar, b2.i.f1748a, cVar, rVar, ((i10 << 6) & 7168) | (i10 & 14) | 432);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar, cVar, i2, 2);
        }
    }
}
