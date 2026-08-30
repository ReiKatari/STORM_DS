package androidx.fragment.app;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements t.a {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ d0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public void a() {
        ((n0) this.B).R.P();
    }

    @Override // t.a
    public Object apply(Object obj) {
        switch (this.A) {
            case 0:
                Void r32 = (Void) obj;
                j0 j0Var = (j0) this.B;
                s0 s0Var = j0Var.mHost;
                if (s0Var instanceof h.i) {
                    return ((h.i) s0Var).m();
                }
                return j0Var.requireActivity().f3294c0;
            default:
                Void r33 = (Void) obj;
                return (h.h) this.B;
        }
    }
}
