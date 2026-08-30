package androidx.fragment.app;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class n implements ij2 {
    public final /* synthetic */ o A;

    public n(o oVar) {
        this.A = oVar;
    }

    @Override // defpackage.ij2
    public final Object apply(Object obj) {
        Void r2 = (Void) obj;
        o oVar = this.A;
        dg2 dg2Var = oVar.mHost;
        if (dg2Var instanceof k9) {
            return ((k9) dg2Var).l();
        }
        return oVar.requireActivity().d0;
    }
}
