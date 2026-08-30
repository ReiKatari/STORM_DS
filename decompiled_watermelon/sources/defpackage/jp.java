package defpackage;

import android.window.OnBackInvokedCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jp implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj;
                if (ki2Var != null) {
                    ki2Var.c();
                    return;
                }
                return;
            case 1:
                ((tq) obj).C();
                return;
            case 2:
                ((h42) obj).A.s();
                return;
            case 3:
                ((cc4) obj).a();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
