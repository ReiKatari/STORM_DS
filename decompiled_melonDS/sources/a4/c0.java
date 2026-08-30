package a4;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements y3.w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.w0 f158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f159b;

    /* renamed from: c  reason: collision with root package name */
    public final int f160c;

    public c0(y3.w0 w0Var, d0 d0Var) {
        this.f158a = w0Var;
        b0 b0Var = d0Var.P0;
        b0Var.getClass();
        this.f159b = b0Var.A;
        b0 b0Var2 = d0Var.P0;
        b0Var2.getClass();
        this.f160c = b0Var2.B;
    }

    @Override // y3.w0
    public final int a() {
        return this.f160c;
    }

    @Override // y3.w0
    public final void b() {
        this.f158a.b();
    }

    @Override // y3.w0
    public final int c() {
        return this.f159b;
    }

    @Override // y3.w0
    public final Map d() {
        return this.f158a.d();
    }

    @Override // y3.w0
    public final mc.l e() {
        return this.f158a.e();
    }
}
