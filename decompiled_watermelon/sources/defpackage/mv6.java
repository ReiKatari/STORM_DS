package defpackage;

import androidx.appcompat.widget.Toolbar;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mv6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Toolbar B;

    public /* synthetic */ mv6(Toolbar toolbar, int i) {
        this.A = i;
        this.B = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zw3 zw3Var;
        int i = this.A;
        Toolbar toolbar = this.B;
        switch (i) {
            case 0:
                pv6 pv6Var = toolbar.K0;
                if (pv6Var == null) {
                    zw3Var = null;
                } else {
                    zw3Var = pv6Var.B;
                }
                if (zw3Var != null) {
                    zw3Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.o();
                return;
        }
    }
}
