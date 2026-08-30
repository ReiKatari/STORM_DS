package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh0  reason: default package */
/* loaded from: classes.dex */
public final class yh0 implements ra5, vm2 {
    public final long A;
    public final ew B;
    public zm2 L;

    /* JADX WARN: Type inference failed for: r3v2, types: [ew, java.lang.Object] */
    public yh0(long j) {
        this.A = j;
        if (j > 0) {
            ?? obj = new Object();
            obj.a = 0L;
            this.B = obj;
            return;
        }
        i.i("Failed requirement.");
        throw null;
    }

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        long j2;
        long j3;
        ew ewVar = this.B;
        do {
            j2 = ewVar.a;
            long j4 = -1;
            if (j2 != -1) {
                j4 = 1 + j2;
            }
            j3 = j4;
        } while (!ew.b.compareAndSet(ewVar, j2, j3));
        if (j3 == this.A) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.L + " after " + j3 + " frames.");
            zm2 zm2Var = this.L;
            zm2Var.getClass();
            zm2Var.I(true);
        }
    }

    @Override // defpackage.vm2
    public final void a() {
        long j;
        long j2;
        ew ewVar = this.B;
        do {
            j = ewVar.a;
            j2 = -1;
            if (j != -1) {
                j2 = 0;
            }
        } while (!ew.b.compareAndSet(ewVar, j, j2));
        zm2 zm2Var = this.L;
        zm2Var.getClass();
        zm2Var.I(false);
        StringBuilder sb = new StringBuilder("Capture processing has been disabled for ");
        zm2 zm2Var2 = this.L;
        zm2Var2.getClass();
        sb.append(zm2Var2);
        sb.append(" until ");
        sb.append(this.A);
        sb.append(" frames have been completed.");
        Log.w("CXCP", sb.toString());
    }

    @Override // defpackage.vm2
    public final void b() {
        this.B.a = -1L;
        zm2 zm2Var = this.L;
        zm2Var.getClass();
        zm2Var.I(false);
    }

    @Override // defpackage.vm2
    public final void c() {
    }
}
