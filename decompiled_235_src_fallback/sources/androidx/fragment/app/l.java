package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class l extends defpackage.zk2 {
    public final /* synthetic */ androidx.fragment.app.o A;

    public l(androidx.fragment.app.o r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.zk2
    public final android.view.View c(int r2) {
            r1 = this;
            androidx.fragment.app.o r1 = r1.A
            android.view.View r0 = r1.mView
            if (r0 == 0) goto Lb
            android.view.View r1 = r0.findViewById(r2)
            return r1
        Lb:
            java.lang.String r2 = "Fragment "
            java.lang.String r0 = " does not have a view"
            java.lang.String r1 = defpackage.lb1.l(r2, r1, r0)
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.zk2
    public final boolean j() {
            r0 = this;
            androidx.fragment.app.o r0 = r0.A
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
