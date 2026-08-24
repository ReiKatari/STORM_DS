package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx3  reason: default package */
/* loaded from: classes.dex */
public abstract class nx3 {
    public final android.content.Context a;
    public final androidx.work.WorkerParameters b;
    public final java.util.concurrent.atomic.AtomicInteger c;
    public boolean d;

    public nx3(android.content.Context r3, androidx.work.WorkerParameters r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = -256(0xffffffffffffff00, float:NaN)
            r0.<init>(r1)
            r2.c = r0
            r2.a = r3
            r2.b = r4
            return
    }

    public abstract defpackage.tb0 a();

    public final defpackage.gx3 b(defpackage.wj2 r5) {
            r4 = this;
            androidx.work.WorkerParameters r0 = r4.b
            fw7 r1 = r0.h
            java.util.UUID r0 = r0.a
            ow7 r2 = r1.a
            zb6 r2 = r2.a
            hf0 r3 = new hf0
            android.content.Context r4 = r4.a
            r3.<init>(r1, r0, r5, r4)
            java.lang.String r4 = "setForegroundAsync"
            gx3 r4 = defpackage.yh2.p(r2, r4, r3)
            return r4
    }

    public final void c(defpackage.xb1 r5) {
            r4 = this;
            androidx.work.WorkerParameters r4 = r4.b
            tw7 r0 = r4.g
            java.util.UUID r4 = r4.a
            ow7 r1 = r0.b
            zb6 r1 = r1.a
            u6 r2 = new u6
            r3 = 22
            r2.<init>(r0, r4, r5, r3)
            java.lang.String r4 = "updateProgress"
            defpackage.yh2.p(r1, r4, r2)
            return
    }

    public abstract defpackage.tb0 d();
}
