package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10825c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10826d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10827e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10828f;

    public x(float f8, float f10, float f11, float f12) {
        super(2);
        this.f10825c = f8;
        this.f10826d = f10;
        this.f10827e = f11;
        this.f10828f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(this.f10825c, xVar.f10825c) == 0 && Float.compare(this.f10826d, xVar.f10826d) == 0 && Float.compare(this.f10827e, xVar.f10827e) == 0 && Float.compare(this.f10828f, xVar.f10828f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10828f) + w.d.b(this.f10827e, w.d.b(this.f10826d, Float.hashCode(this.f10825c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f10825c);
        sb2.append(", dy1=");
        sb2.append(this.f10826d);
        sb2.append(", dx2=");
        sb2.append(this.f10827e);
        sb2.append(", dy2=");
        return w.d.o(sb2, this.f10828f, ')');
    }
}
