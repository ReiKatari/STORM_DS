package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final p f14149c = new p(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f14150a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14151b;

    public p(float f8, float f10) {
        this.f14150a = f8;
        this.f14151b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f14150a == pVar.f14150a && this.f14151b == pVar.f14151b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14151b) + (Float.hashCode(this.f14150a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f14150a);
        sb2.append(", skewX=");
        return w.d.o(sb2, this.f14151b, ')');
    }
}
