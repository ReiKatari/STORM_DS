package o1;

import c8.c0;
import n2.p1;
import p1.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements z {

    /* renamed from: a  reason: collision with root package name */
    public final t f10512a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10513b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f10514c;

    public h(t tVar, g gVar, c0 c0Var) {
        this.f10512a = tVar;
        this.f10513b = gVar;
        this.f10514c = c0Var;
    }

    @Override // p1.z
    public final int a() {
        return this.f10513b.k().f2624b;
    }

    @Override // p1.z
    public final Object b(int i2) {
        Object f8 = this.f10514c.f(i2);
        if (f8 == null) {
            return this.f10513b.l(i2);
        }
        return f8;
    }

    @Override // p1.z
    public final Object c(int i2) {
        return this.f10513b.j(i2);
    }

    @Override // p1.z
    public final int d(Object obj) {
        return this.f10514c.e(obj);
    }

    @Override // p1.z
    public final void e(int i2, Object obj, n2.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1493551140);
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
            p1.l.b(obj, i2, this.f10512a.f10604q, v2.h.c(726189336, new n1.j(this, i2, 1), rVar), rVar, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(this, i2, obj, i10, 8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return nc.k.a(this.f10513b, ((h) obj).f10513b);
    }

    public final int hashCode() {
        return this.f10513b.hashCode();
    }
}
