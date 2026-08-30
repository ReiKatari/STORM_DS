package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 extends s {

    /* renamed from: d  reason: collision with root package name */
    public final s f10065d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10066e;

    public w1(s sVar, int i2) {
        this.f10065d = sVar;
        this.f10066e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (w1Var.f10065d.equals(this.f10065d) && w1Var.f10066e == this.f10066e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10065d.hashCode() + (this.f10066e * 31);
    }
}
