package se;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public final c f12877a;

    public d(c cVar) {
        this.f12877a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d) || this.f12877a != ((d) obj).f12877a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12877a.hashCode();
    }

    public final String toString() {
        return "Stop(reason=" + this.f12877a + ")";
    }
}
