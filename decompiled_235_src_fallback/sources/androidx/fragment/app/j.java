package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {
    public final /* synthetic */ androidx.fragment.app.o A;

    public /* synthetic */ j(androidx.fragment.app.o r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            androidx.fragment.app.o r2 = r2.A
            androidx.fragment.app.z r0 = r2.mViewLifecycleOwner
            android.os.Bundle r1 = r2.mSavedViewRegistryState
            e56 r0 = r0.Y
            r0.b(r1)
            r0 = 0
            r2.mSavedViewRegistryState = r0
            return
    }
}
