package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: a  reason: collision with root package name */
    public final float f5489a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5490b;

    public y5(float f8, float f10) {
        this.f5489a = f8;
        this.f5490b = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y5) {
                y5 y5Var = (y5) obj;
                if (!x4.f.b(this.f5489a, y5Var.f5489a) || !x4.f.b(this.f5490b, y5Var.f5490b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5490b) + (Float.hashCode(this.f5489a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f8 = this.f5489a;
        sb2.append((Object) x4.f.c(f8));
        sb2.append(", right=");
        float f10 = this.f5490b;
        sb2.append((Object) x4.f.c(f8 + f10));
        sb2.append(", width=");
        sb2.append((Object) x4.f.c(f10));
        sb2.append(')');
        return sb2.toString();
    }
}
