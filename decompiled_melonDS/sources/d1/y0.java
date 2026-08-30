package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 implements u {

    /* renamed from: a  reason: collision with root package name */
    public final int f3709a;

    public y0(int i2) {
        this.f3709a = i2;
    }

    @Override // d1.j
    public final a2 a(w1 w1Var) {
        return new f2(this.f3709a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y0) && ((y0) obj).f3709a == this.f3709a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3709a;
    }
}
