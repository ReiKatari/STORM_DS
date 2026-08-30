package d2;

import android.os.CancellationSignal;
import f2.b1;
import l4.q0;
import u1.p0;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3744b;

    public /* synthetic */ k(int i2, Object obj) {
        this.f3743a = i2;
        this.f3744b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f3743a) {
            case 0:
                b1 b1Var = (b1) this.f3744b;
                if (b1Var != null) {
                    p0 p0Var = b1Var.f4709d;
                    if (p0Var != null) {
                        p0Var.e(q0.f8883b);
                    }
                    p0 p0Var2 = b1Var.f4709d;
                    if (p0Var2 != null) {
                        p0Var2.f(q0.f8883b);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l1) this.f3744b).i(null);
                return;
        }
    }
}
