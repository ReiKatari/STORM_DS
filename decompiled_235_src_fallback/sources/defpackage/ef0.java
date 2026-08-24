package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ef0 implements java.util.concurrent.RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            java.lang.String r0 = "CameraExecutor"
            java.lang.String r1 = "A rejected execution occurred in CameraExecutor!"
            defpackage.kj2.f0(r0, r1)
            return
    }
}
