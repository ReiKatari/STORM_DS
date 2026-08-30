package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends s {

    /* renamed from: d  reason: collision with root package name */
    public final int f9874d;

    public b(int i2) {
        this.f9874d = i2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f9874d == this.f9874d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9874d * 31;
    }
}
