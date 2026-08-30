package se;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12886a;

    public q(boolean z10) {
        this.f12886a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && this.f12886a == ((q) obj).f12886a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12886a);
    }

    public final String toString() {
        return "LaunchSuccessful(isGbaLoadSuccessful=" + this.f12886a + ")";
    }
}
