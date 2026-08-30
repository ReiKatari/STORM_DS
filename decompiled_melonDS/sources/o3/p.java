package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10797c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10798d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10799e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10800f;

    public p(float f8, float f10, float f11, float f12) {
        super(2);
        this.f10797c = f8;
        this.f10798d = f10;
        this.f10799e = f11;
        this.f10800f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.compare(this.f10797c, pVar.f10797c) == 0 && Float.compare(this.f10798d, pVar.f10798d) == 0 && Float.compare(this.f10799e, pVar.f10799e) == 0 && Float.compare(this.f10800f, pVar.f10800f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10800f) + w.d.b(this.f10799e, w.d.b(this.f10798d, Float.hashCode(this.f10797c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f10797c);
        sb2.append(", y1=");
        sb2.append(this.f10798d);
        sb2.append(", x2=");
        sb2.append(this.f10799e);
        sb2.append(", y2=");
        return w.d.o(sb2, this.f10800f, ')');
    }
}
