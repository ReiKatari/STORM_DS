package u1;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.preference.Preference;
import d1.g2;
import g2.w5;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f13361a = new i0(1);

    /* renamed from: b  reason: collision with root package name */
    public static final v3.a f13362b = new v3.a(1022);

    public static final void a(final l4.h hVar, final b3.p pVar, final l4.r0 r0Var, final mc.l lVar, final int i2, final boolean z10, final int i10, final int i11, final Map map, final i3.t tVar, n2.m mVar, final int i12) {
        int i13;
        boolean z11;
        n2.r rVar;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-1343466571);
        if ((i12 & 6) == 0) {
            if (rVar2.f(hVar)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i13 = i24 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar2.f(pVar)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i13 |= i23;
        }
        if ((i12 & 384) == 0) {
            if (rVar2.f(r0Var)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i13 |= i22;
        }
        if ((i12 & 3072) == 0) {
            if (rVar2.h(lVar)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i13 |= i21;
        }
        if ((i12 & 24576) == 0) {
            if (rVar2.d(i2)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i13 |= i20;
        }
        if ((196608 & i12) == 0) {
            if (rVar2.g(z10)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        if ((1572864 & i12) == 0) {
            if (rVar2.d(i10)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((12582912 & i12) == 0) {
            if (rVar2.d(i11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((100663296 & i12) == 0) {
            if (rVar2.h(map)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i13 |= i16;
        }
        if ((805306368 & i12) == 0) {
            if (rVar2.h(tVar)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        boolean z13 = false;
        if ((306783379 & i13) == 306783378) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (rVar2.O(i13 & 1, z11)) {
            z(i11, i10);
            if (rVar2.j(f2.l0.f4754a) == null) {
                rVar2.X(1588759409);
                rVar2.p(false);
                yb.j jVar = c.f13288a;
                int length = hVar.B.length();
                List list = hVar.A;
                if (list != null) {
                    int size = list.size();
                    int i25 = 0;
                    while (i25 < size) {
                        l4.f fVar = (l4.f) list.get(i25);
                        i14 = i13;
                        if ((fVar.f8790a instanceof l4.l0) && "androidx.compose.foundation.text.inlineContent".equals(fVar.f8793d)) {
                            int i26 = fVar.f8791b;
                            int i27 = fVar.f8792c;
                            z13 = false;
                            if (l4.j.b(0, length, i26, i27)) {
                                z12 = true;
                                break;
                            }
                        } else {
                            z13 = false;
                        }
                        i25++;
                        i13 = i14;
                    }
                }
                i14 = i13;
                z12 = z13;
                boolean v10 = k7.w.v(hVar);
                p4.d dVar = (p4.d) rVar2.j(b4.q1.f1922k);
                if (!z12 && !v10) {
                    rVar2.X(1589006262);
                    n.a(hVar, r0Var, dVar, null, rVar2, (i14 & 14) | 3072 | ((i14 >> 3) & 112));
                    rVar = rVar2;
                    b3.p y10 = y(pVar, hVar, r0Var, lVar, i2, z10, i10, i11, dVar, null, null, tVar, null);
                    b bVar = b.f13281c;
                    int hashCode = Long.hashCode(rVar.T);
                    b3.p c4 = b3.a.c(y10, rVar);
                    v2.g l10 = rVar.l();
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(bVar, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    n2.s.y(rVar, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar);
                    n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    rVar.p(true);
                    rVar.p(false);
                } else {
                    rVar = rVar2;
                    boolean z14 = true;
                    rVar.X(1590022070);
                    if ((i14 & 14) != 4) {
                        z14 = z13;
                    }
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (z14 || L == eVar) {
                        L = n2.s.w(hVar);
                        rVar.h0(L);
                    }
                    n2.w0 w0Var = (n2.w0) L;
                    l4.h hVar2 = (l4.h) w0Var.getValue();
                    boolean f8 = rVar.f(w0Var);
                    Object L2 = rVar.L();
                    if (f8 || L2 == eVar) {
                        L2 = new ai.o(w0Var, 9);
                        rVar.h0(L2);
                    }
                    int i28 = i14 << 6;
                    g(pVar, hVar2, lVar, z12, map, r0Var, i2, z10, i10, i11, dVar, tVar, (mc.l) L2, rVar, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i28) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i14 >> 21) & 896) | 24576);
                    rVar.p(false);
                }
            } else {
                m9.o.b();
                return;
            }
        } else {
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: u1.k
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l0.a(l4.h.this, pVar, r0Var, lVar, i2, z10, i10, i11, map, tVar, (n2.m) obj, n2.s.F(i12 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0189, code lost:
        if (r15.f(r23) == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r21, final b3.p r22, final l4.r0 r23, mc.l r24, int r25, boolean r26, final int r27, int r28, i3.t r29, n2.m r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.l0.b(java.lang.String, b3.p, l4.r0, mc.l, int, boolean, int, int, i3.t, n2.m, int, int):void");
    }

    public static final void c(f2.b1 b1Var, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        b3.p d4;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1533506138);
        if ((i2 & 6) == 0) {
            if (rVar.h(b1Var)) {
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
            rVar.X(-885604480);
            if (!b1Var.k()) {
                d4 = b3.m.f1770a;
            } else {
                d4 = a2.l.d(a2.l.c(new f2.t0(b1Var, null, 0)), b1Var.f4729y, new f2.u0(0, null, b1Var), new f2.v0(b1Var, null, 0), new f2.s0(b1Var, 0));
            }
            z1.h.b(d4, cVar, rVar, i10 & 112);
            rVar.p(false);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o(b1Var, cVar, i2, 0);
        }
    }

    public static final void d(f2.b1 b1Var, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(2080741862);
        if ((i2 & 6) == 0) {
            if (rVar.h(b1Var)) {
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
            c(b1Var, cVar, rVar, i10 & 126);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o(b1Var, cVar, i2, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x049c, code lost:
        if (r8 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L391;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0723 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x075b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0875 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0912 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0958 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09f9  */
    /* JADX WARN: Type inference failed for: r0v99, types: [b3.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final q4.x r68, mc.l r69, b3.p r70, final l4.r0 r71, final q4.g0 r72, final mc.l r73, final j1.i r74, i3.p0 r75, boolean r76, final int r77, final int r78, q4.j r79, u1.n0 r80, final boolean r81, final v2.c r82, n2.m r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 2691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.l0.e(q4.x, mc.l, b3.p, l4.r0, q4.g0, mc.l, j1.i, i3.p0, boolean, int, int, q4.j, u1.n0, boolean, v2.c, n2.m, int, int):void");
    }

    public static final void f(b3.p pVar, f2.b1 b1Var, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(2036174316);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(b1Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            y3.v0 d4 = l1.p.d(b3.c.A, true);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
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
            d(b1Var, cVar, rVar, (i13 >> 3) & 126);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0(pVar, b1Var, cVar, i2, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [zb.q] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [n2.m, n2.r] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [n2.w0, java.lang.Object] */
    public static final void g(final b3.p pVar, final l4.h hVar, final mc.l lVar, final boolean z10, final Map map, final l4.r0 r0Var, final int i2, final boolean z11, final int i10, final int i11, final p4.d dVar, final i3.t tVar, final mc.l lVar2, n2.m mVar, final int i12, final int i13) {
        int i14;
        int i15;
        o1 o1Var;
        int i16;
        mc.a aVar;
        yb.j jVar;
        mc.l lVar3;
        n2.w0 w0Var;
        Object qVar;
        boolean z12;
        boolean z13;
        ?? r02;
        Map map2 = map;
        ?? r42 = (n2.r) mVar;
        r42.Z(-2118572703);
        if ((i12 & 6) == 0) {
            i14 = (r42.f(pVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= r42.f(hVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= r42.h(lVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= r42.g(z10) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= r42.h(map2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i14 |= r42.f(r0Var) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= r42.d(i2) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= r42.g(z11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= r42.d(i10) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= r42.d(i11) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = (r42.h(dVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14;
        if ((i13 & 48) == 0) {
            i15 |= r42.h(null) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= r42.h(tVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= r42.h(lVar2) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? r42.f(null) : r42.h(null) ? 16384 : 8192;
        }
        if (r42.O(i17 & 1, ((i17 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true)) {
            boolean v10 = k7.w.v(hVar);
            Object obj = n2.l.f9953a;
            if (v10) {
                r42.X(145641571);
                boolean z14 = (i17 & 112) == 32;
                Object L = r42.L();
                if (z14 || L == obj) {
                    L = new o1(hVar);
                    r42.h0(L);
                }
                r42.p(false);
                o1Var = (o1) L;
            } else {
                r42.X(145707228);
                r42.p(false);
                o1Var = null;
            }
            if (k7.w.v(hVar)) {
                r42.X(145905443);
                i16 = i15;
                boolean f8 = ((i17 & 112) == 32) | r42.f(o1Var);
                Object L2 = r42.L();
                if (f8 || L2 == obj) {
                    L2 = new q1.e(5, o1Var, hVar);
                    r42.h0(L2);
                }
                aVar = (mc.a) L2;
                r42.p(false);
            } else {
                i16 = i15;
                r42.X(146002721);
                boolean z15 = (i17 & 112) == 32;
                Object L3 = r42.L();
                if (z15 || L3 == obj) {
                    L3 = new kf.s0(12, hVar);
                    r42.h0(L3);
                }
                aVar = (mc.a) L3;
                r42.p(false);
            }
            mc.a aVar2 = aVar;
            if (z10) {
                if (map2 != null) {
                    yb.j jVar2 = c.f13288a;
                    if (!map2.isEmpty()) {
                        int length = hVar.B.length();
                        List list = hVar.A;
                        if (list != null) {
                            r02 = new ArrayList(list.size());
                            int size = list.size();
                            int i18 = 0;
                            while (i18 < size) {
                                List list2 = list;
                                l4.f fVar = (l4.f) list.get(i18);
                                int i19 = size;
                                Object obj2 = fVar.f8790a;
                                int i20 = i18;
                                int i21 = fVar.f8792c;
                                int i22 = fVar.f8791b;
                                String str = fVar.f8793d;
                                if ((obj2 instanceof l4.l0) && "androidx.compose.foundation.text.inlineContent".equals(str) && l4.j.b(0, length, i22, i21)) {
                                    Object obj3 = fVar.f8790a;
                                    obj3.getClass();
                                    r02.add(new l4.f(i22, i21, ((l4.l0) obj3).f8847a, str));
                                }
                                i18 = i20 + 1;
                                size = i19;
                                list = list2;
                            }
                        } else {
                            r02 = zb.q.A;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r02.size();
                        int i23 = 0;
                        List list3 = r02;
                        while (i23 < size2) {
                            l4.f fVar2 = (l4.f) list3.get(i23);
                            Object obj4 = fVar2.f8790a;
                            List list4 = list3;
                            int i24 = fVar2.f8792c;
                            int i25 = fVar2.f8791b;
                            g0 g0Var = (g0) map2.get(obj4);
                            int i26 = size2;
                            if (g0Var != null) {
                                arrayList.add(new l4.f(i25, i24, g0Var.f13320a));
                                arrayList2.add(new l4.f(i25, i24, g0Var.f13321b));
                            }
                            i23++;
                            map2 = map;
                            list3 = list4;
                            size2 = i26;
                        }
                        jVar = new yb.j(arrayList, arrayList2);
                        lVar3 = null;
                    }
                }
                jVar = c.f13288a;
                lVar3 = null;
            } else {
                lVar3 = null;
                jVar = new yb.j(null, null);
            }
            List list5 = (List) jVar.A;
            List list6 = (List) jVar.B;
            if (z10) {
                r42.X(146318828);
                Object L4 = r42.L();
                if (L4 == obj) {
                    L4 = n2.s.w(lVar3);
                    r42.h0(L4);
                }
                r42.p(false);
                w0Var = (n2.w0) L4;
            } else {
                r42.X(146406588);
                r42.p(false);
                w0Var = lVar3;
            }
            if (z10) {
                r42.X(146499837);
                boolean f10 = r42.f(w0Var);
                Object L5 = r42.L();
                if (f10 || L5 == obj) {
                    L5 = new ai.o(w0Var, 10);
                    r42.h0(L5);
                }
                lVar3 = (mc.l) L5;
                r42.p(false);
            } else {
                r42.X(146571260);
                r42.p(false);
            }
            mc.l lVar4 = lVar3;
            int i27 = (i17 >> 3) & 14;
            n.a(hVar, r0Var, dVar, list5, r42, ((i17 >> 12) & 112) | i27 | ((i16 << 6) & 896));
            l4.h hVar2 = (l4.h) aVar2.b();
            boolean h2 = r42.h(o1Var) | ((i17 & 896) == 256);
            Object L6 = r42.L();
            if (h2 || L6 == obj) {
                L6 = new l(o1Var, lVar, 0);
                r42.h0(L6);
            }
            b3.p y10 = y(pVar, hVar2, r0Var, (mc.l) L6, i2, z11, i10, i11, dVar, list5, lVar4, tVar, lVar2);
            if (!z10) {
                r42.X(147750935);
                boolean h10 = r42.h(o1Var);
                Object L7 = r42.L();
                if (h10 || L7 == obj) {
                    z13 = false;
                    L7 = new m(o1Var, 0);
                    r42.h0(L7);
                } else {
                    z13 = false;
                }
                qVar = new w5((mc.a) L7, 1);
                r42.p(z13);
            } else {
                r42.X(147927697);
                boolean h11 = r42.h(o1Var);
                Object L8 = r42.L();
                if (h11 || L8 == obj) {
                    L8 = new m(o1Var, 1);
                    r42.h0(L8);
                }
                mc.a aVar3 = (mc.a) L8;
                boolean f11 = r42.f(w0Var);
                Object L9 = r42.L();
                if (f11 || L9 == obj) {
                    L9 = new ai.s(w0Var, 20);
                    r42.h0(L9);
                }
                qVar = new a5.q(1, aVar3, (mc.a) L9);
                r42.p(false);
            }
            int hashCode = Long.hashCode(r42.T);
            v2.g l10 = r42.l();
            b3.p c4 = b3.a.c(y10, r42);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            r42.b0();
            if (r42.S) {
                r42.k(f0Var);
            } else {
                r42.k0();
            }
            n2.s.C(qVar, a4.g.f215e, r42);
            n2.s.C(l10, a4.g.f214d, r42);
            n2.s.u(r42, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(r42, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, r42);
            if (o1Var == null) {
                r42.X(-433557001);
                z12 = false;
            } else {
                z12 = false;
                r42.X(-291080374);
                o1Var.a(r42, 0);
            }
            r42.p(z12);
            if (list6 == null) {
                r42.X(-433506223);
            } else {
                r42.X(-433506222);
                c.a(hVar, list6, r42, i27);
            }
            r42.p(z12);
            r42.p(true);
        } else {
            r42.R();
        }
        n2.p1 r5 = r42.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: u1.j
                @Override // mc.p
                public final Object j(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int F = n2.s.F(i12 | 1);
                    int F2 = n2.s.F(i13);
                    l0.g(b3.p.this, hVar, lVar, z10, map, r0Var, i2, z11, i10, i11, dVar, tVar, lVar2, (n2.m) obj5, F, F2);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void h(f2.b1 b1Var, boolean z10, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z11;
        k1 d4;
        boolean z12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(626339208);
        if (rVar.h(b1Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.g(z10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i13 & 1, z11)) {
            if (z10) {
                rVar.X(1530097388);
                p0 p0Var = b1Var.f4709d;
                l4.o0 o0Var = null;
                if (p0Var != null && (d4 = p0Var.d()) != null) {
                    l4.o0 o0Var2 = d4.f13358a;
                    p0 p0Var2 = b1Var.f4709d;
                    if (p0Var2 != null) {
                        z12 = p0Var2.f13393p;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        o0Var = o0Var2;
                    }
                }
                if (o0Var == null) {
                    rVar.X(1530097387);
                } else {
                    rVar.X(1530097388);
                    if (!l4.q0.c(b1Var.n().f12277b)) {
                        rVar.X(2109807302);
                        int m = b1Var.f4707b.m((int) (b1Var.n().f12277b >> 32));
                        int m10 = b1Var.f4707b.m((int) (b1Var.n().f12277b & 4294967295L));
                        w4.j a10 = o0Var.a(m);
                        w4.j a11 = o0Var.a(Math.max(m10 - 1, 0));
                        p0 p0Var3 = b1Var.f4709d;
                        if (p0Var3 != null && ((Boolean) p0Var3.m.getValue()).booleanValue()) {
                            rVar.X(2110225306);
                            l0.f.b(true, a10, b1Var, rVar, ((i13 << 6) & 896) | 6);
                        } else {
                            rVar.X(2062097806);
                        }
                        rVar.p(false);
                        p0 p0Var4 = b1Var.f4709d;
                        if (p0Var4 != null && ((Boolean) p0Var4.f13391n.getValue()).booleanValue()) {
                            rVar.X(2110574459);
                            l0.f.b(false, a11, b1Var, rVar, ((i13 << 6) & 896) | 6);
                        } else {
                            rVar.X(2062097806);
                        }
                        rVar.p(false);
                    } else {
                        rVar.X(2062097806);
                    }
                    rVar.p(false);
                    p0 p0Var5 = b1Var.f4709d;
                    if (p0Var5 != null) {
                        n2.f1 f1Var = p0Var5.f13390l;
                        if (!nc.k.a(b1Var.f4725u.f12276a.B, b1Var.n().f12276a.B)) {
                            f1Var.setValue(Boolean.FALSE);
                        }
                        if (p0Var5.b()) {
                            if (((Boolean) f1Var.getValue()).booleanValue()) {
                                b1Var.r();
                            } else {
                                b1Var.o();
                            }
                        }
                    }
                }
                rVar.p(false);
                rVar.p(false);
            } else {
                rVar.X(1989076778);
                rVar.p(false);
                b1Var.o();
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new c7.a(b1Var, z10, i2);
        }
    }

    public static final void i(f2.b1 b1Var, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        l4.h m;
        k1 k1Var;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1436003720);
        if (rVar.h(b1Var)) {
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
            p0 p0Var = b1Var.f4709d;
            if (p0Var != null && ((Boolean) p0Var.f13392o.getValue()).booleanValue() && (m = b1Var.m()) != null && m.B.length() > 0) {
                rVar.X(-2112351432);
                boolean f8 = rVar.f(b1Var);
                Object L = rVar.L();
                n2.e eVar = n2.l.f9953a;
                if (f8 || L == eVar) {
                    L = new f2.w0(b1Var);
                    rVar.h0(L);
                }
                v0 v0Var = (v0) L;
                x4.c cVar = (x4.c) rVar.j(b4.q1.f1919h);
                q4.q qVar = b1Var.f4707b;
                long j2 = b1Var.n().f12277b;
                int i12 = l4.q0.f8884c;
                int m10 = qVar.m((int) (j2 >> 32));
                p0 p0Var2 = b1Var.f4709d;
                if (p0Var2 != null) {
                    k1Var = p0Var2.d();
                } else {
                    k1Var = null;
                }
                k1Var.getClass();
                l4.o0 o0Var = k1Var.f13358a;
                h3.c c4 = o0Var.c(p7.j.g(m10, 0, o0Var.f8865a.f8853a.B.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((cVar.v(w0.f13460a) / 2) + c4.f6052a) << 32) | (Float.floatToRawIntBits(c4.f6055d) & 4294967295L);
                boolean e6 = rVar.e(floatToRawIntBits);
                Object L2 = rVar.L();
                if (e6 || L2 == eVar) {
                    L2 = new x(floatToRawIntBits);
                    rVar.h0(L2);
                }
                f2.m mVar2 = (f2.m) L2;
                boolean h2 = rVar.h(v0Var) | rVar.h(b1Var);
                Object L3 = rVar.L();
                if (h2 || L3 == eVar) {
                    L3 = new a0(v0Var, b1Var);
                    rVar.h0(L3);
                }
                b3.p a10 = v3.c0.a(b3.m.f1770a, v0Var, (PointerInputEventHandler) L3);
                boolean e10 = rVar.e(floatToRawIntBits);
                Object L4 = rVar.L();
                if (e10 || L4 == eVar) {
                    L4 = new cd.k(15, floatToRawIntBits);
                    rVar.h0(L4);
                }
                a.a(mVar2, i4.n.a(a10, false, (mc.l) L4), 0L, rVar, 0);
            } else {
                rVar.X(2132946858);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.s0(i2, 25, b1Var);
        }
    }

    public static final h3.c j(y3.h1 h1Var, int i2, q4.e0 e0Var, l4.o0 o0Var, boolean z10, int i10) {
        h3.c cVar;
        float f8;
        float f10;
        if (o0Var != null) {
            cVar = o0Var.c(e0Var.f12245b.m(i2));
        } else {
            cVar = h3.c.f6051e;
        }
        float f11 = cVar.f6052a;
        int O = h1Var.O(w0.f13460a);
        if (z10) {
            f8 = (i10 - f11) - O;
        } else {
            f8 = f11;
        }
        if (z10) {
            f10 = i10 - f11;
        } else {
            f10 = O + f11;
        }
        return new h3.c(f8, cVar.f6053b, f10, cVar.f6055d);
    }

    public static final boolean k(int i2, KeyEvent keyEvent) {
        if (((int) (t3.c.b(keyEvent) >> 32)) == i2) {
            return true;
        }
        return false;
    }

    public static final ArrayList l(List list, mc.a aVar) {
        g2 g2Var;
        if (((Boolean) aVar.b()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                y3.u0 u0Var = (y3.u0) list.get(i2);
                Object n10 = u0Var.n();
                n10.getClass();
                bi.h hVar = ((p1) n10).f13404a;
                l4.f fVar = (l4.f) hVar.L;
                l4.o0 o0Var = (l4.o0) ((o1) hVar.B).f13376a.getValue();
                if (o0Var == null) {
                    g2Var = new g2(0, 0, new od.n(13));
                } else {
                    l4.f c4 = o1.c(fVar, o0Var);
                    if (c4 == null) {
                        g2Var = new g2(0, 0, new od.n(14));
                    } else {
                        x4.k o5 = p7.o.o(o0Var.h(c4.f8791b, c4.f8792c).d());
                        g2Var = new g2(o5.f14344c - o5.f14342a, o5.a(), new kf.s0(15, o5));
                    }
                }
                int i10 = g2Var.A;
                int i11 = g2Var.B;
                arrayList.add(new yb.j(u0Var.e(p7.k.n(i10, i10, i11, i11)), (mc.a) g2Var.L));
            }
            return arrayList;
        }
        return null;
    }

    public static final void m(l4.e eVar, String str, String str2) {
        if (str2.length() <= 0) {
            k1.b.a("alternateText can't be an empty string.");
        }
        l4.d dVar = new l4.d(new l4.l0(str), eVar.A.length(), 0, 4);
        ArrayList arrayList = eVar.B;
        arrayList.add(dVar);
        eVar.L.add(dVar);
        arrayList.size();
        eVar.b(str2);
        eVar.d();
    }

    public static final int o(float f8) {
        return Math.round((float) Math.ceil(f8));
    }

    public static final void p(p0 p0Var) {
        q4.d0 d0Var = p0Var.f13383e;
        if (d0Var != null) {
            p0Var.f13399v.k(q4.x.a((q4.x) p0Var.f13382d.B, null, 0L, 3));
            q4.y yVar = d0Var.f12240a;
            AtomicReference atomicReference = yVar.f12280b;
            while (true) {
                if (atomicReference.compareAndSet(d0Var, null)) {
                    yVar.f12279a.h();
                    break;
                } else if (atomicReference.get() != d0Var) {
                    break;
                }
            }
        }
        p0Var.f13383e = null;
    }

    public static final int q(int i2, String str) {
        String str2;
        int i10;
        m6.i u4 = u();
        Integer num = null;
        if (u4 != null) {
            boolean z10 = true;
            if (u4.c() != 1) {
                z10 = false;
            }
            p7.m.o("Not initialized yet", z10);
            p7.m.l(str, "charSequence cannot be null");
            a4.n nVar = u4.f9280e.f9272b;
            nVar.getClass();
            if (i2 < 0 || i2 >= str.length()) {
                str2 = str;
                i10 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    m6.v[] vVarArr = (m6.v[]) spanned.getSpans(i2, i2 + 1, m6.v.class);
                    if (vVarArr.length > 0) {
                        i10 = spanned.getSpanEnd(vVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i10 = ((m6.n) nVar.E(str2, Math.max(0, i2 - 16), Math.min(str.length(), i2 + 16), Preference.DEFAULT_ORDER, true, new m6.n(i2))).L;
            }
            Integer valueOf = Integer.valueOf(i10);
            if (i10 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i2);
    }

    public static final int r(int i2, CharSequence charSequence) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final int s(int i2, CharSequence charSequence) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    public static final int t(int i2, String str) {
        m6.i u4 = u();
        Integer num = null;
        if (u4 != null) {
            Integer valueOf = Integer.valueOf(u4.b(Math.max(0, i2 - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    public static final m6.i u() {
        if (m6.i.d()) {
            m6.i a10 = m6.i.a();
            if (a10.c() == 1) {
                return a10;
            }
            return null;
        }
        return null;
    }

    public static final void v(p0 p0Var, q4.x xVar, q4.q qVar) {
        mc.l lVar;
        z2.f e6 = z2.q.e();
        if (e6 != null) {
            lVar = e6.e();
        } else {
            lVar = null;
        }
        mc.l lVar2 = lVar;
        z2.f h2 = z2.q.h(e6);
        try {
            k1 d4 = p0Var.d();
            if (d4 == null) {
                return;
            }
            q4.d0 d0Var = p0Var.f13383e;
            if (d0Var == null) {
                return;
            }
            y3.z c4 = p0Var.c();
            if (c4 == null) {
                return;
            }
            w(xVar, p0Var.f13379a, d4.f13358a, c4, d0Var, p0Var.b(), qVar);
        } finally {
            z2.q.k(e6, h2, lVar2);
        }
    }

    public static void w(q4.x xVar, u0 u0Var, l4.o0 o0Var, y3.z zVar, q4.d0 d0Var, boolean z10, q4.q qVar) {
        h3.c cVar;
        if (z10) {
            int m = qVar.m(l4.q0.e(xVar.f12277b));
            String str = x0.f13462a;
            if (m < o0Var.f8865a.f8853a.B.length()) {
                cVar = o0Var.b(m);
            } else if (m != 0) {
                cVar = o0Var.b(m - 1);
            } else {
                cVar = new h3.c(0.0f, 0.0f, 1.0f, (int) (new x4.l(x0.b(u0Var.f13444b, u0Var.f13449g, u0Var.f13450h)).f14346a & 4294967295L));
            }
            float f8 = cVar.f6053b;
            float f10 = cVar.f6052a;
            long a02 = zVar.a0((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (a02 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (a02 & 4294967295L));
            h3.c h2 = pc.a.h((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(cVar.f6054c - f10) << 32) | (Float.floatToRawIntBits(cVar.f6055d - f8) & 4294967295L));
            if (nc.k.a((q4.d0) d0Var.f12240a.f12280b.get(), d0Var)) {
                d0Var.f12241b.d(h2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [nc.t, java.lang.Object] */
    public static final void x(q4.y yVar, p0 p0Var, q4.x xVar, q4.j jVar, q4.q qVar) {
        p1.a0 a0Var = p0Var.f13382d;
        s sVar = p0Var.f13399v;
        s sVar2 = p0Var.f13400w;
        ?? obj = new Object();
        ai.c0 c0Var = new ai.c0(a0Var, sVar, (Object) obj, 15);
        q4.s sVar3 = yVar.f12279a;
        sVar3.a(xVar, jVar, c0Var, sVar2);
        q4.d0 d0Var = new q4.d0(yVar, sVar3);
        yVar.f12280b.set(d0Var);
        obj.A = d0Var;
        p0Var.f13383e = d0Var;
        v(p0Var, xVar, qVar);
    }

    public static final b3.p y(b3.p pVar, l4.h hVar, l4.r0 r0Var, mc.l lVar, int i2, boolean z10, int i10, int i11, p4.d dVar, List list, mc.l lVar2, i3.t tVar, mc.l lVar3) {
        return pVar.f(b3.m.f1770a).f(new e2.f(hVar, r0Var, dVar, lVar, i2, z10, i10, i11, list, lVar2, tVar, lVar3));
    }

    public static final void z(int i2, int i10) {
        boolean z10;
        boolean z11 = false;
        if (i2 > 0 && i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            k1.b.a("both minLines " + i2 + " and maxLines " + i10 + " must be greater than zero");
        }
        if (i2 <= i10) {
            z11 = true;
        }
        if (!z11) {
            k1.b.a("minLines " + i2 + " must be less than or equal to maxLines " + i10);
        }
    }
}
