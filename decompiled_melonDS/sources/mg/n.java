package mg;

import a4.f0;
import ai.i0;
import ai.y0;
import android.content.res.Configuration;
import b3.p;
import b4.r0;
import f2.i1;
import f2.j1;
import g2.l0;
import g2.m0;
import g3.z;
import kf.s0;
import l1.d1;
import l1.u;
import l1.w;
import l4.b0;
import me.magnum.melonds.R;
import n2.p1;
import n2.r;
import n2.s;
import p1.a0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f9659a = new v2.c(-1890422454, false, new b0(27, (byte) 0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f9660b = new v2.c(-163762566, false, new ai.m(22));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f9661c = new v2.c(803814188, false, new b0(28, (byte) 0));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f9662d = new v2.c(387696893, false, new b0(29, (byte) 0));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f9663e = new v2.c(899959196, false, new m(0, (byte) 0));

    /* renamed from: f  reason: collision with root package name */
    public static final v2.c f9664f = new v2.c(-2067582301, false, new m(1, (byte) 0));

    public static final void a(p pVar, l lVar, d1 d1Var, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar = (r) mVar;
        rVar.Z(-2059675956);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rVar.f(d1Var)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(aVar)) {
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
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new z();
                rVar.h0(L);
            }
            z zVar = (z) L;
            p s10 = l1.c.s(pVar, d1Var);
            w a10 = u.a(l1.i.g(16), b3.c.f1758g0, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(s10, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            n2.b0 b0Var = j1.f4748a;
            s.a(b0Var.a(new i1(((l0) rVar.j(m0.f5257a)).i(), ((i1) rVar.j(b0Var)).f4747b)), v2.h.c(-1778091006, new ai.m0(zVar, lVar, aVar), rVar), rVar, 56);
            rVar.p(true);
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new i0(zVar, null, 1);
                rVar.h0(L2);
            }
            s.g(y.f14813a, (mc.p) L2, rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(pVar, lVar, d1Var, aVar, i2);
        }
    }

    public static final void b(kg.d dVar, mc.a aVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-548343735);
        if (rVar.f(dVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        boolean z11 = true;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if (!dVar.equals(kg.b.f8292b)) {
                rVar.X(-1947384047);
                Object[] objArr = {dVar};
                a0 a0Var = l.f9652g;
                if ((((i15 & 14) ^ 6) <= 4 || !rVar.f(dVar)) && (i15 & 6) != 4) {
                    z11 = false;
                }
                Object L = rVar.L();
                if (z11 || L == n2.l.f9953a) {
                    L = new s0(5, dVar);
                    rVar.h0(L);
                }
                l lVar2 = (l) y2.k.d(objArr, a0Var, (mc.a) L, rVar, 0);
                if (l0.f.j(rVar, 0).f9198a.f7028a >= 840) {
                    rVar.X(-1947118501);
                    d(lVar2, aVar, lVar, rVar, i15 & 1008);
                    rVar.p(false);
                } else {
                    rVar.X(-1946923914);
                    c(lVar2, aVar, lVar, rVar, i15 & 1008);
                    rVar.p(false);
                }
                rVar.p(false);
            } else {
                rVar.X(-1946730567);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0((Object) dVar, aVar, (yb.d) lVar, i2, 8);
        }
    }

    public static final void c(l lVar, mc.a aVar, mc.l lVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        r rVar = (r) mVar;
        rVar.Z(-1421209610);
        if (rVar.f(lVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.h(lVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        boolean z13 = false;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if ((i15 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i15 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = z11 | z12;
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z14 || L == eVar) {
                L = new a(lVar, lVar2, 1);
                rVar.h0(L);
            }
            mc.a aVar2 = (mc.a) L;
            s9.a a10 = s9.c.a(rVar);
            if ((((Configuration) rVar.j(r0.f1936a)).uiMode & 48) == 32) {
                z13 = true;
            }
            boolean f8 = rVar.f(a10) | rVar.g(z13);
            Object L2 = rVar.L();
            if (f8 || L2 == eVar) {
                L2 = new e.c(a10, z13, 2);
                rVar.h0(L2);
            }
            s.d(y.f14813a, (mc.l) L2, rVar);
            og.a.b(aVar, v2.h.c(-1505530067, new b(lVar, aVar, aVar2, 1), rVar), rVar, ((i15 >> 3) & 14) | 48);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new h(lVar, aVar, lVar2, i2, 1);
        }
    }

    public static final void d(l lVar, mc.a aVar, mc.l lVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        r rVar = (r) mVar;
        rVar.Z(-1520793769);
        if (rVar.f(lVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i10 | i2;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (rVar.h(lVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i17 = i16 | i12;
        boolean z12 = true;
        if ((i17 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            if ((i17 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i17 & 896) != 256) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object L = rVar.L();
            if (z13 || L == n2.l.f9953a) {
                L = new a(lVar, lVar2, 0);
                rVar.h0(L);
            }
            mc.a aVar2 = (mc.a) L;
            if (lVar.f9653a) {
                i13 = -1193917191;
                i14 = R.string.new_cheat;
            } else {
                i13 = -1193915910;
                i14 = R.string.edit_cheat;
            }
            p7.l.a(kc.a.h(rVar, i13, i14, rVar, false), aVar, v2.h.c(-979761630, new c(lVar, aVar2, 1), rVar), v2.h.c(-1109498528, new g(aVar, aVar2, 0), rVar), false, rVar, (i17 & 112) | 3456, 16);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new h(lVar, aVar, lVar2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q4.x e(q4.x r15) {
        /*
            r15.getClass()
            long r0 = r15.f12277b
            int r2 = l4.q0.f8884c
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            l4.h r3 = r15.f12276a
            java.lang.String r3 = r3.B
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L1b:
            int r11 = r3.length()
            if (r5 >= r11) goto L83
            char r11 = r3.charAt(r5)
            int r12 = r7 + 1
            r13 = 16
            r14 = 1
            if (r8 != r13) goto L43
            r8 = 10
            r1.append(r8)
            if (r11 == r8) goto L40
            int r8 = r0 + r9
            if (r7 > r8) goto L3d
            int r9 = r9 + 1
            r8 = r4
            r10 = r8
        L3b:
            r6 = r14
            goto L58
        L3d:
            r8 = r4
            r10 = r8
            goto L58
        L40:
            r8 = r4
            r10 = r8
            goto L7f
        L43:
            r13 = 8
            if (r10 != r13) goto L58
            r1.append(r2)
            if (r11 == r2) goto L56
            int r10 = r0 + r9
            if (r7 > r10) goto L54
            int r9 = r9 + 1
            r10 = r4
            goto L3b
        L54:
            r10 = r4
            goto L58
        L56:
            r10 = r4
            goto L7f
        L58:
            char r7 = java.lang.Character.toUpperCase(r11)
            r13 = 48
            if (r13 > r7) goto L65
            r13 = 58
            if (r7 >= r13) goto L65
            goto L6d
        L65:
            r13 = 65
            if (r13 > r7) goto L7e
            r13 = 71
            if (r7 >= r13) goto L7e
        L6d:
            char r7 = java.lang.Character.toUpperCase(r11)
            r1.append(r7)
            int r8 = r8 + 1
            int r10 = r10 + 1
            boolean r7 = java.lang.Character.isUpperCase(r11)
            if (r7 != 0) goto L7f
        L7e:
            r6 = r14
        L7f:
            int r5 = r5 + 1
            r7 = r12
            goto L1b
        L83:
            if (r6 == 0) goto L94
            q4.x r15 = new q4.x
            java.lang.String r1 = r1.toString()
            int r0 = r0 + r9
            long r2 = l4.i0.b(r0, r0)
            r0 = 4
            r15.<init>(r1, r0, r2)
        L94:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.n.e(q4.x):q4.x");
    }
}
