package ti;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final t f13264a;

    /* renamed from: b  reason: collision with root package name */
    public final t f13265b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f13266c;

    public /* synthetic */ s(t tVar, Throwable th2, int i2) {
        this(tVar, (c) null, (i2 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (nc.k.a(this.f13264a, sVar.f13264a) && nc.k.a(this.f13265b, sVar.f13265b) && nc.k.a(this.f13266c, sVar.f13266c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13264a.hashCode() * 31;
        int i2 = 0;
        t tVar = this.f13265b;
        if (tVar == null) {
            hashCode = 0;
        } else {
            hashCode = tVar.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Throwable th2 = this.f13266c;
        if (th2 != null) {
            i2 = th2.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f13264a + ", nextPlan=" + this.f13265b + ", throwable=" + this.f13266c + ')';
    }

    public s(t tVar, c cVar, Throwable th2) {
        this.f13264a = tVar;
        this.f13265b = cVar;
        this.f13266c = th2;
    }
}
