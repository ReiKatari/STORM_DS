package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class m implements defpackage.fu3 {
    public final /* synthetic */ androidx.fragment.app.o A;

    public m(androidx.fragment.app.o r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r1, defpackage.st3 r2) {
            r0 = this;
            st3 r1 = defpackage.st3.ON_STOP
            if (r2 != r1) goto Ld
            androidx.fragment.app.o r0 = r0.A
            android.view.View r0 = r0.mView
            if (r0 == 0) goto Ld
            r0.cancelPendingInputEvents()
        Ld:
            return
    }
}
