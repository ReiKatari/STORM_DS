package l2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f8667a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8668b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8669c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8670d;

    public b(float f8, float f10, float f11, float f12) {
        this.f8667a = f8;
        this.f8668b = f10;
        this.f8669c = f11;
        this.f8670d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8667a == bVar.f8667a && this.f8668b == bVar.f8668b && this.f8669c == bVar.f8669c && this.f8670d == bVar.f8670d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8670d) + w.d.b(this.f8669c, w.d.b(this.f8668b, Float.hashCode(this.f8667a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f8667a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f8668b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f8669c);
        sb2.append(", pressedAlpha=");
        return w.d.o(sb2, this.f8670d, ')');
    }
}
