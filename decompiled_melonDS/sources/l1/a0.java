package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends c {

    /* renamed from: i  reason: collision with root package name */
    public final b3.f f8492i;

    public a0(b3.f fVar) {
        this.f8492i = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a0) && nc.k.a(this.f8492i, ((a0) obj).f8492i)) {
            return true;
        }
        return false;
    }

    @Override // l1.c
    public final int g(int i2, x4.m mVar, y3.i1 i1Var) {
        return this.f8492i.a(i1Var.A, i2, mVar);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8492i.f1763a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f8492i + ')';
    }
}
