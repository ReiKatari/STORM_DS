package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f9871a;

    public a(int i2) {
        this.f9871a = i2;
    }

    public final boolean a() {
        if (this.f9871a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return w.d.q(sb2, this.f9871a, " }");
    }
}
