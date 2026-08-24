package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w13 implements fk2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ w13(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.fk2
    public final void c(gk2 gk2Var) {
        fk2 fk2Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                y13 y13Var = (y13) ((WeakReference) ((x13) obj).X).get();
                if (y13Var != null) {
                    y13Var.r0.execute(new n0(y13Var, 29));
                    return;
                }
                return;
            default:
                re5 re5Var = (re5) obj;
                synchronized (re5Var.R) {
                    try {
                        int i2 = re5Var.L - 1;
                        re5Var.L = i2;
                        if (re5Var.A && i2 == 0) {
                            re5Var.close();
                        }
                        fk2Var = (fk2) re5Var.Y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (fk2Var != null) {
                    fk2Var.c(gk2Var);
                    return;
                }
                return;
        }
    }
}
