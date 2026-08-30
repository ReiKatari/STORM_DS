package sc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f12863a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12864b;

    public a(float f8, float f10) {
        this.f12863a = f8;
        this.f12864b = f10;
    }

    public static boolean a(Float f8, Float f10) {
        if (f8.floatValue() <= f10.floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            float f8 = this.f12863a;
            float f10 = this.f12864b;
            if (f8 > f10) {
                a aVar = (a) obj;
                if (aVar.f12863a > aVar.f12864b) {
                    return true;
                }
            }
            a aVar2 = (a) obj;
            if (f8 == aVar2.f12863a && f10 == aVar2.f12864b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f8 = this.f12863a;
        float f10 = this.f12864b;
        if (f8 > f10) {
            return -1;
        }
        return Float.hashCode(f10) + (Float.hashCode(f8) * 31);
    }

    public final String toString() {
        return this.f12863a + ".." + this.f12864b;
    }
}
