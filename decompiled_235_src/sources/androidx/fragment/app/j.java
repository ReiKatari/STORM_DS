package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ o A;

    public /* synthetic */ j(o oVar) {
        this.A = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.A;
        z zVar = oVar.mViewLifecycleOwner;
        zVar.Y.b(oVar.mSavedViewRegistryState);
        oVar.mSavedViewRegistryState = null;
    }
}
