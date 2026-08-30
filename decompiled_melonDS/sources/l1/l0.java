package l1;

import a4.q2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 extends b3.o implements q2 {

    /* renamed from: i0  reason: collision with root package name */
    public b2 f8581i0;

    /* renamed from: j0  reason: collision with root package name */
    public b2 f8582j0;

    public l0() {
        h0 h0Var = c.f8507c;
        this.f8581i0 = h0Var;
        this.f8582j0 = h0Var;
    }

    @Override // b3.o
    public void G0() {
        a4.l.w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 1));
        P0();
    }

    @Override // b3.o
    public void H0() {
        this.f8582j0 = this.f8581i0;
        a4.l.y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 0));
    }

    @Override // b3.o
    public final void I0() {
        this.f8581i0 = c.f8507c;
    }

    public abstract b2 O0(b2 b2Var);

    public void P0() {
        this.f8582j0 = O0(this.f8581i0);
        a4.l.y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 0));
    }

    @Override // a4.q2
    public final Object k() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
