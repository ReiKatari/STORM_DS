package d0;

import android.util.Size;
import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 extends j0.u0 {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3437o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final Object f3438p;

    public p1(Surface surface) {
        super(j0.u0.f7292k, 0);
        this.f3438p = surface;
    }

    @Override // j0.u0
    public final ta.a f() {
        switch (this.f3437o) {
            case 0:
                return ((r1) this.f3438p).f3449e;
            default:
                return m0.i.c((Surface) this.f3438p);
        }
    }

    public p1(Surface surface, Size size, int i2) {
        super(size, i2);
        this.f3438p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, Size size) {
        super(size, 34);
        this.f3438p = r1Var;
    }
}
