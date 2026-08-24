package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ev0 implements defpackage.fu3 {
    public final /* synthetic */ defpackage.il4 A;
    public final /* synthetic */ defpackage.mv0 B;

    public /* synthetic */ ev0(defpackage.il4 r1, defpackage.mv0 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r1, defpackage.st3 r2) {
            r0 = this;
            st3 r1 = defpackage.st3.ON_CREATE
            if (r2 != r1) goto L12
            mv0 r1 = r0.B
            android.window.OnBackInvokedDispatcher r1 = defpackage.o2.m(r1)
            r1.getClass()
            il4 r0 = r0.A
            r0.d(r1)
        L12:
            return
    }
}
