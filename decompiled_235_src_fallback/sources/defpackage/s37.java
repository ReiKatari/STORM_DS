package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s37  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s37 implements java.util.concurrent.Executor {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ s37(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r4) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            kj7 r3 = (defpackage.kj7) r3
            vb6 r0 = r3.c
            q64 r1 = new q64
            r2 = 12
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
        L16:
            android.view.Choreographer r3 = (android.view.Choreographer) r3
            oo r0 = new oo
            r1 = 1
            r0.<init>(r4, r1)
            r3.postFrameCallback(r0)
            return
    }
}
