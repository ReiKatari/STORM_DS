package d0;

import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements c0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ m0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // d0.c0
    public final void d(d0 d0Var) {
        c0 c0Var;
        switch (this.A) {
            case 0:
                o0 o0Var = (o0) ((WeakReference) ((n0) this.B).X).get();
                if (o0Var != null) {
                    o0Var.p0.execute(new a8.f(8, o0Var));
                    return;
                }
                return;
            default:
                i1 i1Var = (i1) this.B;
                synchronized (i1Var.L) {
                    try {
                        int i2 = i1Var.A - 1;
                        i1Var.A = i2;
                        if (i1Var.B && i2 == 0) {
                            i1Var.close();
                        }
                        c0Var = (c0) i1Var.Y;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c0Var != null) {
                    c0Var.d(d0Var);
                    return;
                }
                return;
        }
    }
}
