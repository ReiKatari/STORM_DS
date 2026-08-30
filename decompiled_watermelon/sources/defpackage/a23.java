package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a23  reason: default package */
/* loaded from: classes.dex */
public abstract class a23 extends yy3 implements zx6 {
    public re7 j0;
    public re7 k0;

    public a23() {
        p82 p82Var = tq5.p;
        this.j0 = p82Var;
        this.k0 = p82Var;
    }

    @Override // defpackage.yy3
    public void J0() {
        ve2.W(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new z13(this, 1));
        S0();
    }

    @Override // defpackage.yy3
    public void K0() {
        this.k0 = this.j0;
        ve2.Y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new z13(this, 0));
    }

    @Override // defpackage.yy3
    public final void L0() {
        this.j0 = tq5.p;
    }

    public abstract re7 R0(re7 re7Var);

    public void S0() {
        this.k0 = R0(this.j0);
        ve2.Y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new z13(this, 0));
    }

    @Override // defpackage.zx6
    public final Object t() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
