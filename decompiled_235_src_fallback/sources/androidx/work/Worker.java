package androidx.work;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Worker extends defpackage.nx3 {
    public Worker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.nx3
    public final defpackage.tb0 a() {
            r3 = this;
            androidx.work.WorkerParameters r0 = r3.b
            java.util.concurrent.ExecutorService r0 = r0.c
            r0.getClass()
            kt5 r1 = new kt5
            r2 = 22
            r1.<init>(r3, r2)
            pk0 r3 = new pk0
            r2 = 10
            r3.<init>(r2, r0, r1)
            tb0 r3 = defpackage.ak7.W(r3)
            return r3
    }

    @Override // defpackage.nx3
    public final defpackage.tb0 d() {
            r3 = this;
            androidx.work.WorkerParameters r0 = r3.b
            java.util.concurrent.ExecutorService r0 = r0.c
            r0.getClass()
            t46 r1 = new t46
            r2 = 25
            r1.<init>(r3, r2)
            pk0 r3 = new pk0
            r2 = 10
            r3.<init>(r2, r0, r1)
            tb0 r3 = defpackage.ak7.W(r3)
            return r3
    }

    public abstract defpackage.lx3 e();
}
