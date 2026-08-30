package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 implements zc.i0 {
    public final e1 A;
    public final long B;
    public final Object L;
    public final zc.h R;

    public b1(e1 e1Var, long j2, Object obj, zc.h hVar) {
        this.A = e1Var;
        this.B = j2;
        this.L = obj;
        this.R = hVar;
    }

    @Override // zc.i0
    public final void dispose() {
        e1 e1Var = this.A;
        synchronized (e1Var) {
            if (this.B < e1Var.q()) {
                return;
            }
            Object[] objArr = e1Var.f2824b0;
            objArr.getClass();
            long j2 = this.B;
            if (objArr[((int) j2) & (objArr.length - 1)] != this) {
                return;
            }
            q.f(objArr, j2, q.f2855b);
            e1Var.j();
        }
    }
}
