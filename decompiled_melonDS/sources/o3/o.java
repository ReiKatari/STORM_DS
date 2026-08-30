package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10793c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10794d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10795e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10796f;

    public o(float f8, float f10, float f11, float f12) {
        super(1);
        this.f10793c = f8;
        this.f10794d = f10;
        this.f10795e = f11;
        this.f10796f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (Float.compare(this.f10793c, oVar.f10793c) == 0 && Float.compare(this.f10794d, oVar.f10794d) == 0 && Float.compare(this.f10795e, oVar.f10795e) == 0 && Float.compare(this.f10796f, oVar.f10796f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10796f) + w.d.b(this.f10795e, w.d.b(this.f10794d, Float.hashCode(this.f10793c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f10793c);
        sb2.append(", y1=");
        sb2.append(this.f10794d);
        sb2.append(", x2=");
        sb2.append(this.f10795e);
        sb2.append(", y2=");
        return w.d.o(sb2, this.f10796f, ')');
    }
}
