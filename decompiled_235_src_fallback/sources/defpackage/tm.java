package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm  reason: default package */
/* loaded from: classes.dex */
public final class tm implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ defpackage.rj0 A;
    public final /* synthetic */ defpackage.qn2 B;

    public tm(defpackage.rj0 r1, defpackage.um r2, defpackage.qn2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r3
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
            r1 = this;
            qn2 r0 = r1.B
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.g(r2)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r2 = move-exception
            em5 r3 = new em5
            r3.<init>(r2)
            r2 = r3
        L12:
            rj0 r1 = r1.A
            r1.i(r2)
            return
    }
}
