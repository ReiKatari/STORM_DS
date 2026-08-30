package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u2 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10063a;

    public u2(Object obj) {
        this.f10063a = obj;
    }

    @Override // n2.v2
    public final Object a(v2.g gVar) {
        return this.f10063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u2) && nc.k.a(this.f10063a, ((u2) obj).f10063a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10063a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f10063a + ')';
    }
}
