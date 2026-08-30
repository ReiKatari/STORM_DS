package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends c {

    /* renamed from: i  reason: collision with root package name */
    public final b3.g f8500i;

    public b0(b3.g gVar) {
        this.f8500i = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && nc.k.a(this.f8500i, ((b0) obj).f8500i)) {
            return true;
        }
        return false;
    }

    @Override // l1.c
    public final int g(int i2, x4.m mVar, y3.i1 i1Var) {
        return this.f8500i.a(i1Var.B, i2);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8500i.f1764a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f8500i + ')';
    }
}
