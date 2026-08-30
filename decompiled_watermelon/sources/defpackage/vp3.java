package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vp3  reason: default package */
/* loaded from: classes.dex */
public final class vp3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ yp3 B;

    public /* synthetic */ vp3(yp3 yp3Var, int i) {
        this.A = i;
        this.B = yp3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        yp3 yp3Var = this.B;
        switch (i) {
            case 0:
                fl1 fl1Var = yp3Var.L;
                if (fl1Var != null) {
                    fl1Var.setListSelectionHidden(true);
                    fl1Var.requestLayout();
                    return;
                }
                return;
            default:
                fl1 fl1Var2 = yp3Var.L;
                if (fl1Var2 != null && fl1Var2.isAttachedToWindow() && yp3Var.L.getCount() > yp3Var.L.getChildCount() && yp3Var.L.getChildCount() <= yp3Var.h0) {
                    yp3Var.u0.setInputMethodMode(2);
                    yp3Var.c();
                    return;
                }
                return;
        }
    }
}
