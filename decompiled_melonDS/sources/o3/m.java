package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10789c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10790d;

    public m(float f8, float f10) {
        super(3);
        this.f10789c = f8;
        this.f10790d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Float.compare(this.f10789c, mVar.f10789c) == 0 && Float.compare(this.f10790d, mVar.f10790d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10790d) + (Float.hashCode(this.f10789c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f10789c);
        sb2.append(", y=");
        return w.d.o(sb2, this.f10790d, ')');
    }
}
