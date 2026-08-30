package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a  reason: collision with root package name */
    public final af.f f15133a;

    public n(af.f fVar) {
        fVar.getClass();
        this.f15133a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f15133a == ((n) obj).f15133a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15133a.hashCode();
    }

    public final String toString() {
        return "RuntimeConsoleUpdate(newRuntimeConsole=" + this.f15133a + ")";
    }
}
