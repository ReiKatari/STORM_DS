package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sv2 implements gf2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ sv2(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.gf2
    public final void e(hf2 hf2Var) {
        gf2 gf2Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                uv2 uv2Var = (uv2) ((WeakReference) ((tv2) obj).X).get();
                if (uv2Var != null) {
                    uv2Var.q0.execute(new m0(28, uv2Var));
                    return;
                }
                return;
            default:
                e55 e55Var = (e55) obj;
                synchronized (e55Var.R) {
                    try {
                        int i2 = e55Var.L - 1;
                        e55Var.L = i2;
                        if (e55Var.A && i2 == 0) {
                            e55Var.close();
                        }
                        gf2Var = (gf2) e55Var.Y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (gf2Var != null) {
                    gf2Var.e(hf2Var);
                    return;
                }
                return;
        }
    }
}
