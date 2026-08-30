package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends h {

    /* renamed from: c0  reason: collision with root package name */
    public final f1 f15012c0;

    public c1(cc.c cVar, f1 f1Var) {
        super(1, cVar);
        this.f15012c0 = f1Var;
    }

    @Override // zc.h
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // zc.h
    public final Throwable t(f1 f1Var) {
        Throwable b10;
        f1 f1Var2 = this.f15012c0;
        f1Var2.getClass();
        Object obj = f1.A.get(f1Var2);
        if ((obj instanceof e1) && (b10 = ((e1) obj).b()) != null) {
            return b10;
        }
        if (obj instanceof o) {
            return ((o) obj).f15025a;
        }
        return f1Var.B();
    }
}
