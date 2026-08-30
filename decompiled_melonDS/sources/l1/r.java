package l1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final b3.h f8610a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8611b;

    public r(b3.h hVar, boolean z10) {
        this.f8610a = hVar;
        this.f8611b = z10;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, nc.r] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, nc.r] */
    @Override // y3.v0
    public final y3.w0 a(final y3.x0 x0Var, List list, long j2) {
        long j10;
        boolean isEmpty = list.isEmpty();
        zb.r rVar = zb.r.A;
        if (isEmpty) {
            return x0Var.u0(x4.a.j(j2), x4.a.i(j2), rVar, new d1.x1(13));
        }
        if (this.f8611b) {
            j10 = j2;
        } else {
            j10 = j2 & (-8589934589L);
        }
        if (list.size() == 1) {
            final y3.u0 u0Var = (y3.u0) list.get(0);
            u0Var.n();
            final y3.i1 e6 = u0Var.e(j10);
            final int max = Math.max(x4.a.j(j2), e6.A);
            final int max2 = Math.max(x4.a.i(j2), e6.B);
            return x0Var.u0(max, max2, rVar, new mc.l() { // from class: l1.q
                @Override // mc.l
                public final Object k(Object obj) {
                    p.b((y3.h1) obj, y3.i1.this, u0Var, x0Var.getLayoutDirection(), max, max2, this.f8610a);
                    return yb.y.f14813a;
                }
            });
        }
        y3.i1[] i1VarArr = new y3.i1[list.size()];
        ?? obj = new Object();
        obj.A = x4.a.j(j2);
        ?? obj2 = new Object();
        obj2.A = x4.a.i(j2);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            y3.u0 u0Var2 = (y3.u0) list.get(i2);
            u0Var2.n();
            y3.i1 e10 = u0Var2.e(j10);
            i1VarArr[i2] = e10;
            obj.A = Math.max(obj.A, e10.A);
            obj2.A = Math.max(obj2.A, e10.B);
        }
        return x0Var.u0(obj.A, obj2.A, rVar, new g2.h0(i1VarArr, list, x0Var, obj, obj2, this, 2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!this.f8610a.equals(rVar.f8610a) || this.f8611b != rVar.f8611b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8611b) + (this.f8610a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f8610a + ", propagateMinConstraints=" + this.f8611b + ')';
    }
}
