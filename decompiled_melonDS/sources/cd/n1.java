package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 implements j1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f2845a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2846b;

    public n1(long j2, long j10) {
        this.f2845a = j2;
        this.f2846b = j10;
        if (j2 >= 0) {
            if (j10 >= 0) {
                return;
            }
            a0.j.i("replayExpiration(", j10, " ms) cannot be negative");
            throw null;
        }
        a0.j.i("stopTimeout(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // cd.j1
    public final h a(dd.a0 a0Var) {
        return q.m(new v(q.z(a0Var, new m1(this, null)), new bh.m(2, 2, null), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f2845a == n1Var.f2845a && this.f2846b == n1Var.f2846b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2846b) + (Long.hashCode(this.f2845a) * 31);
    }

    public final String toString() {
        ac.b bVar = new ac.b(2);
        long j2 = this.f2845a;
        if (j2 > 0) {
            bVar.add("stopTimeout=" + j2 + "ms");
        }
        long j10 = this.f2846b;
        if (j10 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j10 + "ms");
        }
        return w.d.r(new StringBuilder("SharingStarted.WhileSubscribed("), zb.l.Y(p7.t.d(bVar), null, null, null, null, 63), ')');
    }
}
