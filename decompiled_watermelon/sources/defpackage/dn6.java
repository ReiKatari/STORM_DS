package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn6  reason: default package */
/* loaded from: classes.dex */
public final class dn6 extends cn6 {
    public final Runnable L;

    public dn6(Runnable runnable, long j, boolean z) {
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
        sb.append(w81.s(runnable));
        sb.append(", ");
        sb.append(this.A);
        sb.append(", ");
        if (this.B) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return wh1.o(sb, str, ']');
    }
}
