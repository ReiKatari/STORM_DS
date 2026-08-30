package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends b1 {
    public final f1 X;
    public final e1 Y;
    public final l Z;

    /* renamed from: b0  reason: collision with root package name */
    public final Object f15014b0;

    public d1(f1 f1Var, e1 e1Var, l lVar, Object obj) {
        this.X = f1Var;
        this.Y = e1Var;
        this.Z = lVar;
        this.f15014b0 = obj;
    }

    @Override // zc.b1
    public final boolean j() {
        return false;
    }

    @Override // zc.b1
    public final void k(Throwable th2) {
        l lVar = this.Z;
        l Y = f1.Y(lVar);
        f1 f1Var = this.X;
        e1 e1Var = this.Y;
        Object obj = this.f15014b0;
        if (Y == null || !f1Var.h0(e1Var, Y, obj)) {
            e1Var.A.b(new ed.h(2), 2);
            l Y2 = f1.Y(lVar);
            if (Y2 != null && f1Var.h0(e1Var, Y2, obj)) {
                return;
            }
            f1Var.c(f1Var.J(e1Var, obj));
        }
    }
}
