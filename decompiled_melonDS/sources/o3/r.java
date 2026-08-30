package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10803c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10804d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10805e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10806f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10807g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10808h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10809i;

    public r(float f8, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f10803c = f8;
        this.f10804d = f10;
        this.f10805e = f11;
        this.f10806f = z10;
        this.f10807g = z11;
        this.f10808h = f12;
        this.f10809i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(this.f10803c, rVar.f10803c) == 0 && Float.compare(this.f10804d, rVar.f10804d) == 0 && Float.compare(this.f10805e, rVar.f10805e) == 0 && this.f10806f == rVar.f10806f && this.f10807g == rVar.f10807g && Float.compare(this.f10808h, rVar.f10808h) == 0 && Float.compare(this.f10809i, rVar.f10809i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10809i) + w.d.b(this.f10808h, w.d.e(w.d.e(w.d.b(this.f10805e, w.d.b(this.f10804d, Float.hashCode(this.f10803c) * 31, 31), 31), this.f10806f, 31), this.f10807g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f10803c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f10804d);
        sb2.append(", theta=");
        sb2.append(this.f10805e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f10806f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f10807g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f10808h);
        sb2.append(", arcStartDy=");
        return w.d.o(sb2, this.f10809i, ')');
    }
}
