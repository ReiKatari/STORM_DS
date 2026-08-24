package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz0  reason: default package */
/* loaded from: classes.dex */
public final class fz0 implements java.util.concurrent.ThreadFactory {
    public final java.util.concurrent.atomic.AtomicInteger a;
    public final /* synthetic */ boolean b;

    public fz0(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.b = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.a = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r2.b
            if (r0 == 0) goto La
            java.lang.String r0 = "WM.task-"
            goto Lc
        La:
            java.lang.String r0 = "androidx.work-"
        Lc:
            java.lang.Thread r1 = new java.lang.Thread
            java.lang.StringBuilder r0 = defpackage.lb1.s(r0)
            java.util.concurrent.atomic.AtomicInteger r2 = r2.a
            int r2 = r2.incrementAndGet()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r3, r2)
            return r1
    }
}
