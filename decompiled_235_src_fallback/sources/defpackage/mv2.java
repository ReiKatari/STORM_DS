package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv2  reason: default package */
/* loaded from: classes.dex */
public final class mv2 implements java.util.concurrent.Callable {
    public final /* synthetic */ java.lang.Runnable a;

    public mv2(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r0 = this;
            java.lang.Runnable r0 = r0.a
            r0.run()
            r0 = 0
            return r0
    }
}
