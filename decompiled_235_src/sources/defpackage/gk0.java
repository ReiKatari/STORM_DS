package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk0  reason: default package */
/* loaded from: classes.dex */
public final class gk0 implements jk5, bt2 {
    public final long A;
    public final ww B;
    public ft2 L;

    /* JADX WARN: Type inference failed for: r3v2, types: [ww, java.lang.Object] */
    public gk0(long j) {
        this.A = j;
        if (j > 0) {
            ?? obj = new Object();
            obj.a = 0L;
            this.B = obj;
            return;
        }
        i.h("Failed requirement.");
        throw null;
    }

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        long j2;
        long j3;
        ww wwVar = this.B;
        do {
            j2 = wwVar.a;
            long j4 = -1;
            if (j2 != -1) {
                j4 = 1 + j2;
            }
            j3 = j4;
        } while (!ww.b.compareAndSet(wwVar, j2, j3));
        if (j3 == this.A) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.L + " after " + j3 + " frames.");
            ft2 ft2Var = this.L;
            ft2Var.getClass();
            ft2Var.D(true);
        }
    }

    @Override // defpackage.bt2
    public final void a() {
        long j;
        long j2;
        ww wwVar = this.B;
        do {
            j = wwVar.a;
            j2 = -1;
            if (j != -1) {
                j2 = 0;
            }
        } while (!ww.b.compareAndSet(wwVar, j, j2));
        ft2 ft2Var = this.L;
        ft2Var.getClass();
        ft2Var.D(false);
        StringBuilder sb = new StringBuilder("Capture processing has been disabled for ");
        ft2 ft2Var2 = this.L;
        ft2Var2.getClass();
        sb.append(ft2Var2);
        sb.append(" until ");
        sb.append(this.A);
        sb.append(" frames have been completed.");
        Log.w("CXCP", sb.toString());
    }

    @Override // defpackage.bt2
    public final void b() {
        this.B.a = -1L;
        ft2 ft2Var = this.L;
        ft2Var.getClass();
        ft2Var.D(false);
    }

    @Override // defpackage.bt2
    public final void c() {
    }
}
