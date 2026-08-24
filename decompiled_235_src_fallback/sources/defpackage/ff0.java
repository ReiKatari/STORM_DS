package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff0  reason: default package */
/* loaded from: classes.dex */
public final class ff0 implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ int a;
    public final java.util.concurrent.atomic.AtomicInteger b;

    public ff0(int r2) {
            r1 = this;
            r1.a = r2
            switch(r2) {
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.b = r2
            return
        L11:
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.b = r2
            return
        L1d:
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            int r0 = r3.a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.b
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L24;
                default: goto L7;
            }
        L7:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r4)
            java.util.Locale r4 = java.util.Locale.US
            int r3 = r3.getAndIncrement()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraX-camerax_io_"
            r4.<init>(r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.setName(r3)
            return r0
        L24:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "arch_disk_io_"
            r4.<init>(r1)
            int r3 = r3.getAndIncrement()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.setName(r3)
            return r0
        L3f:
            java.lang.Thread r0 = new java.lang.Thread
            n0 r1 = new n0
            r2 = 9
            r1.<init>(r4, r2)
            r0.<init>(r1)
            r4 = 7
            r0.setPriority(r4)
            java.util.Locale r4 = java.util.Locale.US
            int r3 = r3.getAndIncrement()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraX-core_camera_"
            r4.<init>(r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.setName(r3)
            return r0
    }
}
