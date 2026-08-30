package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements s2 {
    public final w1 A;
    public final n2.f1 B;
    public p L;
    public long R;
    public long X;
    public boolean Y;

    public k(w1 w1Var, Object obj, p pVar, long j2, long j10, boolean z10) {
        p pVar2;
        this.A = w1Var;
        this.B = n2.s.w(obj);
        if (pVar != null) {
            pVar2 = d.k(pVar);
        } else {
            pVar2 = (p) w1Var.f3690a.k(obj);
            pVar2.d();
        }
        this.L = pVar2;
        this.R = j2;
        this.X = j10;
        this.Y = z10;
    }

    public final Object a() {
        return this.A.f3691b.k(this.L);
    }

    @Override // n2.s2
    public final Object getValue() {
        return this.B.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.B.getValue() + ", velocity=" + a() + ", isRunning=" + this.Y + ", lastFrameTimeNanos=" + this.R + ", finishedTimeNanos=" + this.X + ')';
    }

    public /* synthetic */ k(w1 w1Var, Object obj, p pVar, int i2) {
        this(w1Var, obj, (i2 & 4) != 0 ? null : pVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
