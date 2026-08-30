package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10831c;

    public z(float f8) {
        super(3);
        this.f10831c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && Float.compare(this.f10831c, ((z) obj).f10831c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10831c);
    }

    public final String toString() {
        return w.d.o(new StringBuilder("RelativeVerticalTo(dy="), this.f10831c, ')');
    }
}
