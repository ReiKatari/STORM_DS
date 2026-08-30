package p1;

import java.util.Map;
import n2.p1;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements y2.f, y2.d {
    public final y2.g A;
    public final y2.d B;
    public final a1.n0 L;

    public z0(y2.f fVar, Map map, y2.d dVar) {
        mh.z zVar = new mh.z(14, fVar);
        t2 t2Var = y2.h.f14658a;
        this.A = new y2.g(map, zVar);
        this.B = dVar;
        a1.n0 n0Var = a1.v0.f110a;
        this.L = new a1.n0();
    }

    @Override // y2.d
    public final void a(Object obj, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-858296452);
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
            this.B.a(obj, cVar, rVar, i10 & 126);
            boolean h2 = rVar.h(this) | rVar.h(obj);
            Object L = rVar.L();
            if (h2 || L == n2.l.f9953a) {
                L = new he.g(18, this, obj);
                rVar.h0(L);
            }
            n2.s.d(obj, (mc.l) L, rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(this, obj, cVar, i2, 7);
        }
    }

    @Override // y2.f
    public final boolean b(Object obj) {
        return this.A.b(obj);
    }

    @Override // y2.f
    public final Map c() {
        a1.n0 n0Var = this.L;
        Object[] objArr = n0Var.f75b;
        long[] jArr = n0Var.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            this.B.e(objArr[(i2 << 3) + i11]);
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return this.A.c();
    }

    @Override // y2.f
    public final Object d(String str) {
        return this.A.d(str);
    }

    @Override // y2.d
    public final void e(Object obj) {
        this.B.e(obj);
    }

    @Override // y2.f
    public final c1 f(String str, mc.a aVar) {
        return this.A.f(str, aVar);
    }
}
