package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10775c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10776d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10777e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10778f;

    /* renamed from: g  reason: collision with root package name */
    public final float f10779g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10780h;

    public k(float f8, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f10775c = f8;
        this.f10776d = f10;
        this.f10777e = f11;
        this.f10778f = f12;
        this.f10779g = f13;
        this.f10780h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Float.compare(this.f10775c, kVar.f10775c) == 0 && Float.compare(this.f10776d, kVar.f10776d) == 0 && Float.compare(this.f10777e, kVar.f10777e) == 0 && Float.compare(this.f10778f, kVar.f10778f) == 0 && Float.compare(this.f10779g, kVar.f10779g) == 0 && Float.compare(this.f10780h, kVar.f10780h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10780h) + w.d.b(this.f10779g, w.d.b(this.f10778f, w.d.b(this.f10777e, w.d.b(this.f10776d, Float.hashCode(this.f10775c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f10775c);
        sb2.append(", y1=");
        sb2.append(this.f10776d);
        sb2.append(", x2=");
        sb2.append(this.f10777e);
        sb2.append(", y2=");
        sb2.append(this.f10778f);
        sb2.append(", x3=");
        sb2.append(this.f10779g);
        sb2.append(", y3=");
        return w.d.o(sb2, this.f10780h, ')');
    }
}
