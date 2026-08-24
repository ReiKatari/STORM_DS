package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj1  reason: default package */
/* loaded from: classes.dex */
public final class uj1 implements java.util.concurrent.Executor {
    public static volatile defpackage.uj1 B;
    public final /* synthetic */ int A;

    public /* synthetic */ uj1(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            return
        Le:
            r1.run()
            return
    }
}
