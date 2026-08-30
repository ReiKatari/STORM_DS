package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10764c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10765d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10766e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10767f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10768g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10769h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10770i;

    public i(float f8, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f10764c = f8;
        this.f10765d = f10;
        this.f10766e = f11;
        this.f10767f = z10;
        this.f10768g = z11;
        this.f10769h = f12;
        this.f10770i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Float.compare(this.f10764c, iVar.f10764c) == 0 && Float.compare(this.f10765d, iVar.f10765d) == 0 && Float.compare(this.f10766e, iVar.f10766e) == 0 && this.f10767f == iVar.f10767f && this.f10768g == iVar.f10768g && Float.compare(this.f10769h, iVar.f10769h) == 0 && Float.compare(this.f10770i, iVar.f10770i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10770i) + w.d.b(this.f10769h, w.d.e(w.d.e(w.d.b(this.f10766e, w.d.b(this.f10765d, Float.hashCode(this.f10764c) * 31, 31), 31), this.f10767f, 31), this.f10768g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f10764c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f10765d);
        sb2.append(", theta=");
        sb2.append(this.f10766e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f10767f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f10768g);
        sb2.append(", arcStartX=");
        sb2.append(this.f10769h);
        sb2.append(", arcStartY=");
        return w.d.o(sb2, this.f10770i, ')');
    }
}
