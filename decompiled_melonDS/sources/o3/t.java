package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10816c;

    public t(float f8) {
        super(3);
        this.f10816c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && Float.compare(this.f10816c, ((t) obj).f10816c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10816c);
    }

    public final String toString() {
        return w.d.o(new StringBuilder("RelativeHorizontalTo(dx="), this.f10816c, ')');
    }
}
