package se;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final int f12875a;

    public a(int i2) {
        this.f12875a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f12875a == ((a) obj).f12875a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12875a);
    }

    public final String toString() {
        return w.d.m("RumbleStart(duration=", this.f12875a, ")");
    }
}
