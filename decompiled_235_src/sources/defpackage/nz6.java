package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz6  reason: default package */
/* loaded from: classes.dex */
public final class nz6 extends mz6 {
    public final Runnable L;

    public nz6(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.L;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(nc1.P(runnable));
        sb.append(", ");
        sb.append(this.A);
        sb.append(", ");
        if (this.B) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return lb1.q(sb, str, ']');
    }
}
