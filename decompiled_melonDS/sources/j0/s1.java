package j0;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s1 implements t1 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f7290a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final t1 f7291b;

    public s1(t1 t1Var) {
        this.f7291b = t1Var;
    }

    @Override // j0.t1
    public final void a(w1 w1Var, u1 u1Var) {
        if (!this.f7290a.get()) {
            this.f7291b.a(w1Var, u1Var);
        }
    }

    public final void b() {
        this.f7290a.set(true);
    }
}
