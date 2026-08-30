package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements s2 {
    public Number A;
    public Number B;
    public final w1 L;
    public final n2.f1 R;
    public h1 X;
    public boolean Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public long f3534b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ e0 f3535c0;

    public c0(e0 e0Var, Number number, Number number2, w1 w1Var, b0 b0Var) {
        this.f3535c0 = e0Var;
        this.A = number;
        this.B = number2;
        this.L = w1Var;
        this.R = n2.s.w(number);
        this.X = new h1(b0Var, w1Var, this.A, this.B, null);
    }

    @Override // n2.s2
    public final Object getValue() {
        return this.R.getValue();
    }
}
