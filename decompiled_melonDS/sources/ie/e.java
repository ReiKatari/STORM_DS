package ie;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f7055a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7056b;

    public e(long j2, boolean z10) {
        this.f7055a = j2;
        this.f7056b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f7055a == eVar.f7055a && this.f7056b == eVar.f7056b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7056b) + (Long.hashCode(this.f7055a) * 31);
    }

    public final String toString() {
        return "CheatStatusUpdate(id=" + this.f7055a + ", enabled=" + this.f7056b + ")";
    }
}
