package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10821c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10822d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10823e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10824f;

    public w(float f8, float f10, float f11, float f12) {
        super(1);
        this.f10821c = f8;
        this.f10822d = f10;
        this.f10823e = f11;
        this.f10824f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(this.f10821c, wVar.f10821c) == 0 && Float.compare(this.f10822d, wVar.f10822d) == 0 && Float.compare(this.f10823e, wVar.f10823e) == 0 && Float.compare(this.f10824f, wVar.f10824f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10824f) + w.d.b(this.f10823e, w.d.b(this.f10822d, Float.hashCode(this.f10821c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f10821c);
        sb2.append(", dy1=");
        sb2.append(this.f10822d);
        sb2.append(", dx2=");
        sb2.append(this.f10823e);
        sb2.append(", dy2=");
        return w.d.o(sb2, this.f10824f, ')');
    }
}
