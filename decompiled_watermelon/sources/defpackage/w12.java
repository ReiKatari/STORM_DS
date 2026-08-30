package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w12  reason: default package */
/* loaded from: classes.dex */
public final class w12 extends x12 {
    public final Runnable L;

    public w12(Runnable runnable, long j) {
        super(j);
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.run();
    }

    @Override // defpackage.x12
    public final String toString() {
        return super.toString() + this.L;
    }
}
