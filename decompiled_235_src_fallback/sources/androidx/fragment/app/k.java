package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class k extends defpackage.sk2 {
    public final /* synthetic */ androidx.fragment.app.o a;

    public k(androidx.fragment.app.o r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.sk2
    public final void a() {
            r2 = this;
            androidx.fragment.app.o r2 = r2.a
            e56 r0 = r2.mSavedStateRegistryController
            r0.a()
            defpackage.y46.b(r2)
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L15
            java.lang.String r1 = "registryState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto L16
        L15:
            r0 = 0
        L16:
            e56 r2 = r2.mSavedStateRegistryController
            r2.b(r0)
            return
    }
}
