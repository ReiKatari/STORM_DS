package u1;

import g2.u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float f13274a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f13275b;

    static {
        float f8 = 25;
        f13274a = f8;
        f13275b = (f8 * 2.0f) / 2.4142137f;
    }

    public static final void a(f2.m mVar, b3.p pVar, long j2, n2.m mVar2, int i2) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        n2.r rVar = (n2.r) mVar2;
        rVar.Z(1776202187);
        if (rVar.f(mVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar.f(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11 | 128;
        boolean z11 = true;
        if ((i14 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i14 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i12 = i14 & (-897);
            } else {
                i12 = i14 & (-897);
                j2 = 9205357640488583168L;
            }
            rVar.q();
            int i15 = i12 & 14;
            if (i15 != 4) {
                z11 = false;
            }
            Object L = rVar.L();
            if (z11 || L == n2.l.f9953a) {
                L = new mh.z(20, mVar);
                rVar.h0(L);
            }
            pc.a.f(mVar, b3.c.B, v2.h.c(-1653527038, new u1(j2, i4.n.a(pVar, false, (mc.l) L), 1), rVar), rVar, i15 | 432);
        } else {
            rVar.R();
        }
        long j10 = j2;
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.c(mVar, pVar, j10, i2);
        }
    }

    public static final void b(b3.p pVar, n2.m mVar, int i2, int i10) {
        int i11;
        int i12;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(694251107);
        int i13 = i10 & 1;
        if (i13 != 0) {
            i12 = i2 | 6;
        } else {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i12 = i11 | i2;
        }
        if ((i12 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i12 & 1, z10)) {
            if (i13 != 0) {
                pVar = b3.m.f1770a;
            }
            l1.c.d(b3.a.a(l1.r1.j(pVar, f13275b, f13274a), new qh.a(1)), rVar);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new l1.n(pVar, i2, i10);
        }
    }
}
