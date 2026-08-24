package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ex0 implements android.os.CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ex0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            p27 r3 = (defpackage.p27) r3
            if (r3 == 0) goto L1d
            jt3 r0 = r3.d
            if (r0 == 0) goto L14
            long r1 = defpackage.k47.b
            r0.e(r1)
        L14:
            jt3 r3 = r3.d
            if (r3 == 0) goto L1d
            long r0 = defpackage.k47.b
            r3.f(r0)
        L1d:
            return
        L1e:
            ap6 r3 = (defpackage.ap6) r3
            r0 = 0
            r3.h(r0)
            return
    }
}
