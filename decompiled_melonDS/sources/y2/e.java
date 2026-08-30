package y2;

import a1.m0;
import a1.u0;
import ai.c0;
import java.util.Map;
import mg.m;
import mh.z;
import n2.l;
import n2.o1;
import n2.p1;
import n2.r;
import n2.s;
import n2.t2;
import p1.a0;
import u1.h1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {
    public static final a0 X = new a0(28, new m(20, (byte) 0), new h1(23));
    public final Map A;
    public final m0 B;
    public f L;
    public final z R;

    public e(Map map) {
        this.A = map;
        long[] jArr = u0.f103a;
        this.B = new m0();
        this.R = new z(26, this);
    }

    @Override // y2.d
    public final void a(Object obj, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(533563200);
        if ((i2 & 6) == 0) {
            if (rVar.h(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(cVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(this)) {
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
            rVar.a0(obj);
            Object L = rVar.L();
            n2.e eVar = l.f9953a;
            if (L == eVar) {
                z zVar = this.R;
                if (((Boolean) zVar.k(obj)).booleanValue()) {
                    t2 t2Var = h.f14658a;
                    i iVar = new i(new g((Map) this.A.get(obj), zVar));
                    rVar.h0(iVar);
                    L = iVar;
                } else {
                    fj.j.m(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
            }
            i iVar2 = (i) L;
            s.b(new o1[]{h.f14658a.a(iVar2), r7.a.f12619a.a(iVar2)}, cVar, rVar, (i10 & 112) | 8);
            boolean h2 = rVar.h(this) | rVar.h(obj) | rVar.h(iVar2);
            Object L2 = rVar.L();
            if (h2 || L2 == eVar) {
                L2 = new c0(this, obj, iVar2, 18);
                rVar.h0(L2);
            }
            s.d(y.f14813a, (mc.l) L2, rVar);
            if (rVar.f10017y && rVar.G.f9894i == rVar.f10018z) {
                rVar.f10018z = -1;
                rVar.f10017y = false;
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(this, obj, cVar, i2, 12);
        }
    }

    @Override // y2.d
    public final void e(Object obj) {
        if (this.B.k(obj) == null) {
            this.A.remove(obj);
        }
    }
}
