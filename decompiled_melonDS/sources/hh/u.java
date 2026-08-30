package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends z {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f6579a;

    public u(e0 e0Var) {
        this.f6579a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u) || !this.f6579a.equals(((u) obj).f6579a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6579a.f6516a.hashCode();
    }

    public final String toString() {
        return "ShowPauseMenu(pauseMenu=" + this.f6579a + ")";
    }
}
