package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class n implements mo2 {
    public final /* synthetic */ o A;

    public n(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.mo2
    public final Object apply(Object obj) {
        Void r2 = (Void) obj;
        o oVar = this.A;
        cl2 cl2Var = oVar.mHost;
        if (cl2Var instanceof l9) {
            return ((l9) cl2Var).g();
        }
        return oVar.requireActivity().e0;
    }
}
