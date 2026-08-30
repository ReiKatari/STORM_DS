package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6511a;

    public b1(int i2) {
        this.f6511a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b1) && this.f6511a == ((b1) obj).f6511a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6511a);
    }

    public final String toString() {
        return w.d.m("RumbleStart(duration=", this.f6511a, ")");
    }
}
