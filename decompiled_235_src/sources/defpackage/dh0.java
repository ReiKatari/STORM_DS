package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dh0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ gh0 B;
    public final /* synthetic */ List L;
    public final /* synthetic */ int R;

    public /* synthetic */ dh0(gh0 gh0Var, List list, int i, int i2) {
        this.A = i2;
        this.B = gh0Var;
        this.L = list;
        this.R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                gh0 gh0Var = this.B;
                gh0Var.a.execute(new dh0(gh0Var, this.L, this.R, 1));
                return;
            default:
                gh0 gh0Var2 = this.B;
                List list = this.L;
                int i = this.R;
                if (gh0Var2.l.get() && gh0Var2.k.equals(list)) {
                    kj2.t("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    bx4 bx4Var = gh0Var2.h;
                    if (bx4Var != null) {
                        bx4Var.a();
                    }
                    gh0Var2.d(i - 1, list);
                    return;
                }
                return;
        }
    }
}
