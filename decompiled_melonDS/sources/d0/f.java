package d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f3365a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f3366b;

    public f(int i2, Throwable th2) {
        this.f3365a = i2;
        this.f3366b = th2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f3365a == fVar.f3365a) {
                Throwable th2 = fVar.f3366b;
                Throwable th3 = this.f3366b;
                if (th3 != null ? th3.equals(th2) : th2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = (this.f3365a ^ 1000003) * 1000003;
        Throwable th2 = this.f3366b;
        if (th2 == null) {
            hashCode = 0;
        } else {
            hashCode = th2.hashCode();
        }
        return i2 ^ hashCode;
    }

    public final String toString() {
        return "StateError{code=" + this.f3365a + ", cause=" + this.f3366b + "}";
    }
}
