package androidx.fragment.app;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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
