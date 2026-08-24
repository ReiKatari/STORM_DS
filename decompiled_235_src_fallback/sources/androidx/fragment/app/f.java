package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class f {
    public final androidx.fragment.app.b0 a;

    public f(androidx.fragment.app.b0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean a() {
            r2 = this;
            androidx.fragment.app.b0 r2 = r2.a
            androidx.fragment.app.o r0 = r2.c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L12
            yn6 r1 = defpackage.ao6.Companion
            r1.getClass()
            ao6 r0 = defpackage.yn6.a(r0)
            goto L13
        L12:
            r0 = 0
        L13:
            ao6 r2 = r2.a
            if (r0 == r2) goto L20
            ao6 r1 = defpackage.ao6.VISIBLE
            if (r0 == r1) goto L1e
            if (r2 == r1) goto L1e
            goto L20
        L1e:
            r2 = 0
            return r2
        L20:
            r2 = 1
            return r2
    }
}
