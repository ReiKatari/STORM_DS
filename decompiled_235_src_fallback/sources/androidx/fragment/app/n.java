package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class n implements defpackage.mo2 {
    public final /* synthetic */ androidx.fragment.app.o A;

    public n(androidx.fragment.app.o r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.mo2
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            java.lang.Void r2 = (java.lang.Void) r2
            androidx.fragment.app.o r1 = r1.A
            cl2 r2 = r1.mHost
            boolean r0 = r2 instanceof defpackage.l9
            if (r0 == 0) goto L11
            l9 r2 = (defpackage.l9) r2
            j9 r1 = r2.g()
            return r1
        L11:
            androidx.fragment.app.p r1 = r1.requireActivity()
            kv0 r1 = r1.e0
            return r1
    }
}
