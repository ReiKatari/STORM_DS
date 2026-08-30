package v2;

import n2.a0;
import n2.n1;
import n2.v2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends s2.b implements a0 {
    public static final g R = new s2.b(s2.k.f12817e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [s2.d, v2.f] */
    @Override // s2.b
    public final s2.d a() {
        ?? dVar = new s2.d(this);
        dVar.Z = this;
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s2.d, v2.f] */
    @Override // s2.b
    public final s2.d b() {
        ?? dVar = new s2.d(this);
        dVar.Z = this;
        return dVar;
    }

    @Override // s2.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        return super.containsKey((n1) obj);
    }

    @Override // s2.b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        return super.containsValue((v2) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [v2.g, s2.b] */
    public final g d(n1 n1Var, v2 v2Var) {
        bk.a u4 = this.A.u(n1Var, n1Var.hashCode(), v2Var, 0);
        if (u4 == null) {
            return this;
        }
        return new s2.b((s2.k) u4.L, this.B + u4.B);
    }

    @Override // s2.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof n1)) {
            return null;
        }
        return (v2) super.get((n1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof n1)) {
            return obj2;
        }
        return (v2) super.getOrDefault((n1) obj, (v2) obj2);
    }
}
