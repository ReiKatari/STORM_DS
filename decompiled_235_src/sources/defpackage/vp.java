package defpackage;

import android.window.OnBackInvokedCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vp implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                on2 on2Var = (on2) obj;
                if (on2Var != null) {
                    on2Var.c();
                    return;
                }
                return;
            case 1:
                ((fr) obj).G();
                return;
            case 2:
                ((z82) obj).A.s();
                return;
            case 3:
                ((r14) obj).a();
                return;
            case 4:
                ((al4) obj).a();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
