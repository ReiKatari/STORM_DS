package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ xe0 B;
    public final /* synthetic */ List L;
    public final /* synthetic */ int R;

    public /* synthetic */ ue0(xe0 xe0Var, List list, int i, int i2) {
        this.A = i2;
        this.B = xe0Var;
        this.L = list;
        this.R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                xe0 xe0Var = this.B;
                xe0Var.a.execute(new ue0(xe0Var, this.L, this.R, 1));
                return;
            default:
                xe0 xe0Var2 = this.B;
                List list = this.L;
                int i = this.R;
                if (xe0Var2.l.get() && xe0Var2.k.equals(list)) {
                    ve2.v("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    wn4 wn4Var = xe0Var2.h;
                    if (wn4Var != null) {
                        wn4Var.a();
                    }
                    xe0Var2.d(i - 1, list);
                    return;
                }
                return;
        }
    }
}
