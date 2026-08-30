package i4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final h f6719c = new h(0.0f, new sc.a(0.0f, 0.0f));

    /* renamed from: a  reason: collision with root package name */
    public final float f6720a;

    /* renamed from: b  reason: collision with root package name */
    public final sc.a f6721b;

    public h(float f8, sc.a aVar) {
        this.f6720a = f8;
        this.f6721b = aVar;
        if (!Float.isNaN(f8)) {
            return;
        }
        a0.j.h("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f6720a == hVar.f6720a && this.f6721b.equals(hVar.f6721b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6721b.hashCode() + (Float.hashCode(this.f6720a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f6720a + ", range=" + this.f6721b + ", steps=0)";
    }
}
