package q1;

import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements p1.z {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12160a;

    /* renamed from: b  reason: collision with root package name */
    public final p1.l f12161b;

    /* renamed from: c  reason: collision with root package name */
    public final c8.c0 f12162c;

    public q(a0 a0Var, p pVar, c8.c0 c0Var) {
        this.f12160a = a0Var;
        this.f12161b = pVar;
        this.f12162c = c0Var;
    }

    @Override // p1.z
    public final int a() {
        return this.f12161b.k().f2624b;
    }

    @Override // p1.z
    public final Object b(int i2) {
        Object f8 = this.f12162c.f(i2);
        if (f8 == null) {
            return this.f12161b.l(i2);
        }
        return f8;
    }

    @Override // p1.z
    public final int d(Object obj) {
        return this.f12162c.e(obj);
    }

    @Override // p1.z
    public final void e(int i2, Object obj, n2.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1201380429);
        if (rVar.d(i2)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i11 | i10;
        if (rVar.h(obj)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i15 = i14 | i12;
        if (rVar.f(this)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i16 = i15 | i13;
        if ((i16 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            p1.l.b(obj, i2, this.f12160a.B, v2.h.c(1142237095, new n1.j(this, i2, 2), rVar), rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(this, i2, obj, i10, 11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return nc.k.a(this.f12161b, ((q) obj).f12161b);
    }

    public final int hashCode() {
        return this.f12161b.hashCode();
    }
}
