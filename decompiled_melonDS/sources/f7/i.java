package f7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final b f4952e;

    public i(b bVar) {
        bVar.getClass();
        this.f4952e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass() && nc.k.a(this.f4952e, ((i) obj).f4952e)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4952e.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f4952e + ", direction=-1)";
    }
}
