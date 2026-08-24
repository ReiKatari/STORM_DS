package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oo implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Runnable B;

    public /* synthetic */ oo(java.lang.Runnable r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r1) {
            r0 = this;
            int r1 = r0.A
            java.lang.Runnable r0 = r0.B
            switch(r1) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r0.run()
            return
        Lb:
            r0.run()
            return
    }
}
