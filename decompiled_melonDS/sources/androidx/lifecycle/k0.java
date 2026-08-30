package androidx.lifecycle;

import android.os.Handler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements x {

    /* renamed from: c0  reason: collision with root package name */
    public static final k0 f1475c0 = new k0();
    public int A;
    public int B;
    public Handler X;
    public boolean L = true;
    public boolean R = true;
    public final z Y = new z(this, true);
    public final a8.f Z = new a8.f(2, this);

    /* renamed from: b0  reason: collision with root package name */
    public final c1 f1476b0 = new c1(this);

    public final void b() {
        int i2 = this.B + 1;
        this.B = i2;
        if (i2 == 1) {
            if (this.L) {
                this.Y.f(p.ON_RESUME);
                this.L = false;
                return;
            }
            Handler handler = this.X;
            handler.getClass();
            handler.removeCallbacks(this.Z);
        }
    }

    @Override // androidx.lifecycle.x
    public final r getLifecycle() {
        return this.Y;
    }
}
