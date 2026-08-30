package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10810c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10811d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10812e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10813f;

    /* renamed from: g  reason: collision with root package name */
    public final float f10814g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10815h;

    public s(float f8, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f10810c = f8;
        this.f10811d = f10;
        this.f10812e = f11;
        this.f10813f = f12;
        this.f10814g = f13;
        this.f10815h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(this.f10810c, sVar.f10810c) == 0 && Float.compare(this.f10811d, sVar.f10811d) == 0 && Float.compare(this.f10812e, sVar.f10812e) == 0 && Float.compare(this.f10813f, sVar.f10813f) == 0 && Float.compare(this.f10814g, sVar.f10814g) == 0 && Float.compare(this.f10815h, sVar.f10815h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10815h) + w.d.b(this.f10814g, w.d.b(this.f10813f, w.d.b(this.f10812e, w.d.b(this.f10811d, Float.hashCode(this.f10810c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f10810c);
        sb2.append(", dy1=");
        sb2.append(this.f10811d);
        sb2.append(", dx2=");
        sb2.append(this.f10812e);
        sb2.append(", dy2=");
        sb2.append(this.f10813f);
        sb2.append(", dx3=");
        sb2.append(this.f10814g);
        sb2.append(", dy3=");
        return w.d.o(sb2, this.f10815h, ')');
    }
}
