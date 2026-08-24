package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class z implements defpackage.mw2, defpackage.g56, defpackage.bp7 {
    public final androidx.fragment.app.o A;
    public final defpackage.ap7 B;
    public final androidx.fragment.app.j L;
    public defpackage.yo7 R;
    public defpackage.ku3 X;
    public defpackage.e56 Y;

    public z(androidx.fragment.app.o r2, defpackage.ap7 r3, androidx.fragment.app.j r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.X = r0
            r1.Y = r0
            r1.A = r2
            r1.B = r3
            r1.L = r4
            return
    }

    public final void a(defpackage.st3 r1) {
            r0 = this;
            ku3 r0 = r0.X
            r0.f(r1)
            return
    }

    public final void c() {
            r3 = this;
            ku3 r0 = r3.X
            if (r0 != 0) goto L26
            ku3 r0 = new ku3
            r1 = 1
            r0.<init>(r3, r1)
            r3.X = r0
            f56 r0 = new f56
            t46 r1 = new t46
            r2 = 2
            r1.<init>(r3, r2)
            r0.<init>(r3, r1)
            e56 r1 = new e56
            r1.<init>(r0)
            r3.Y = r1
            r1.a()
            androidx.fragment.app.j r3 = r3.L
            r3.run()
        L26:
            return
    }

    @Override // defpackage.mw2
    public final defpackage.j71 getDefaultViewModelCreationExtras() {
            r5 = this;
            androidx.fragment.app.o r0 = r5.A
            android.content.Context r1 = r0.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        La:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L1c
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L15
            android.app.Application r1 = (android.app.Application) r1
            goto L1d
        L15:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto La
        L1c:
            r1 = 0
        L1d:
            m94 r2 = new m94
            r3 = 0
            r2.<init>(r3)
            java.util.LinkedHashMap r3 = r2.a
            if (r1 == 0) goto L2c
            vo7 r4 = defpackage.wo7.d
            r3.put(r4, r1)
        L2c:
            q61 r1 = defpackage.y46.a
            r3.put(r1, r0)
            jd1 r1 = defpackage.y46.b
            r3.put(r1, r5)
            android.os.Bundle r5 = r0.getArguments()
            if (r5 == 0) goto L45
            w31 r5 = defpackage.y46.c
            android.os.Bundle r0 = r0.getArguments()
            r3.put(r5, r0)
        L45:
            return r2
    }

    @Override // defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r4 = this;
            androidx.fragment.app.o r0 = r4.A
            yo7 r1 = r0.getDefaultViewModelProviderFactory()
            yo7 r2 = r0.mDefaultFactory
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L11
            r4.R = r1
            return r1
        L11:
            yo7 r1 = r4.R
            if (r1 != 0) goto L3b
            android.content.Context r1 = r0.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        L1d:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L2f
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L28
            android.app.Application r1 = (android.app.Application) r1
            goto L30
        L28:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L1d
        L2f:
            r1 = 0
        L30:
            h56 r2 = new h56
            android.os.Bundle r3 = r0.getArguments()
            r2.<init>(r1, r0, r3)
            r4.R = r2
        L3b:
            yo7 r4 = r4.R
            return r4
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            r0.c()
            ku3 r0 = r0.X
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r0 = this;
            r0.c()
            e56 r0 = r0.Y
            d56 r0 = r0.b
            return r0
    }

    @Override // defpackage.bp7
    public final defpackage.ap7 getViewModelStore() {
            r0 = this;
            r0.c()
            ap7 r0 = r0.B
            return r0
    }
}
