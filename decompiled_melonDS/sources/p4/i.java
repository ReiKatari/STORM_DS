package p4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f11312a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f11312a != ((i) obj).f11312a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11312a);
    }

    public final String toString() {
        int i2 = this.f11312a;
        if (i2 == 0) {
            return "None";
        }
        if (i2 == 1) {
            return "Weight";
        }
        if (i2 == 2) {
            return "Style";
        }
        if (i2 == 65535) {
            return "All";
        }
        return "Invalid";
    }
}
