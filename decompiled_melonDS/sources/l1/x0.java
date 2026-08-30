package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends b3.o implements a4.f2 {

    /* renamed from: i0  reason: collision with root package name */
    public float f8645i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8646j0;

    @Override // a4.f2
    public final Object z0(x4.c cVar, Object obj) {
        l1 l1Var;
        if (obj instanceof l1) {
            l1Var = (l1) obj;
        } else {
            l1Var = null;
        }
        if (l1Var == null) {
            l1Var = new l1();
        }
        l1Var.f8583a = this.f8645i0;
        l1Var.f8584b = this.f8646j0;
        return l1Var;
    }
}
