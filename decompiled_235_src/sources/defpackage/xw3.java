package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw3  reason: default package */
/* loaded from: classes.dex */
public final class xw3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ax3 B;

    public /* synthetic */ xw3(ax3 ax3Var, int i) {
        this.A = i;
        this.B = ax3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ax3 ax3Var = this.B;
        switch (i) {
            case 0:
                mp1 mp1Var = ax3Var.L;
                if (mp1Var != null) {
                    mp1Var.setListSelectionHidden(true);
                    mp1Var.requestLayout();
                    return;
                }
                return;
            default:
                mp1 mp1Var2 = ax3Var.L;
                if (mp1Var2 != null && mp1Var2.isAttachedToWindow() && ax3Var.L.getCount() > ax3Var.L.getChildCount() && ax3Var.L.getChildCount() <= ax3Var.i0) {
                    ax3Var.v0.setInputMethodMode(2);
                    ax3Var.e();
                    return;
                }
                return;
        }
    }
}
