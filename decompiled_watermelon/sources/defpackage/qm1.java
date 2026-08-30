package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qm1  reason: default package */
/* loaded from: classes.dex */
public final class qm1 extends mh7 {
    public final /* synthetic */ int u;

    public /* synthetic */ qm1(int i) {
        this.u = i;
    }

    @Override // defpackage.mh7
    public final float P(l36 l36Var) {
        switch (this.u) {
            case 0:
                return ((View) l36Var).getAlpha();
            case 1:
                return ((View) l36Var).getScaleX();
            case 2:
                return ((View) l36Var).getScaleY();
            case 3:
                return ((View) l36Var).getRotation();
            case 4:
                return ((View) l36Var).getRotationX();
            default:
                return ((View) l36Var).getRotationY();
        }
    }

    @Override // defpackage.mh7
    public final void e0(l36 l36Var, float f) {
        switch (this.u) {
            case 0:
                ((View) l36Var).setAlpha(f);
                return;
            case 1:
                ((View) l36Var).setScaleX(f);
                return;
            case 2:
                ((View) l36Var).setScaleY(f);
                return;
            case 3:
                ((View) l36Var).setRotation(f);
                return;
            case 4:
                ((View) l36Var).setRotationX(f);
                return;
            default:
                ((View) l36Var).setRotationY(f);
                return;
        }
    }
}
