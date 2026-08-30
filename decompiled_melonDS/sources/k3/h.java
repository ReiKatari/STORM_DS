package k3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: a  reason: collision with root package name */
    public final float f7962a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7963b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7964c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7965d;

    public h(float f8, float f10, int i2, int i10, int i11) {
        f10 = (i11 & 2) != 0 ? 4.0f : f10;
        i2 = (i11 & 4) != 0 ? 0 : i2;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f7962a = f8;
        this.f7963b = f10;
        this.f7964c = i2;
        this.f7965d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7962a == hVar.f7962a && this.f7963b == hVar.f7963b && this.f7964c == hVar.f7964c && this.f7965d == hVar.f7965d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w.d.c(this.f7965d, w.d.c(this.f7964c, w.d.b(this.f7963b, Float.hashCode(this.f7962a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f7962a);
        sb2.append(", miter=");
        sb2.append(this.f7963b);
        sb2.append(", cap=");
        String str2 = "Unknown";
        int i2 = this.f7964c;
        if (i2 == 0) {
            str = "Butt";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i10 = this.f7965d;
        if (i10 == 0) {
            str2 = "Miter";
        } else if (i10 == 1) {
            str2 = "Round";
        } else if (i10 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
