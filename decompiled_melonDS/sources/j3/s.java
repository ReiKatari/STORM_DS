package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final float f7412a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7413b;

    public s(float f8, float f10) {
        this.f7412a = f8;
        this.f7413b = f10;
    }

    public final float[] a() {
        float f8 = this.f7412a;
        float f10 = this.f7413b;
        return new float[]{f8 / f10, 1.0f, ((1.0f - f8) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(this.f7412a, sVar.f7412a) == 0 && Float.compare(this.f7413b, sVar.f7413b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7413b) + (Float.hashCode(this.f7412a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f7412a);
        sb2.append(", y=");
        return w.d.o(sb2, this.f7413b, ')');
    }
}
