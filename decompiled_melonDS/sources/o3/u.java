package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10817c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10818d;

    public u(float f8, float f10) {
        super(3);
        this.f10817c = f8;
        this.f10818d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (Float.compare(this.f10817c, uVar.f10817c) == 0 && Float.compare(this.f10818d, uVar.f10818d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10818d) + (Float.hashCode(this.f10817c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f10817c);
        sb2.append(", dy=");
        return w.d.o(sb2, this.f10818d, ')');
    }
}
