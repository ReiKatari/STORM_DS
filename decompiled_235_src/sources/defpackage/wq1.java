package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq1  reason: default package */
/* loaded from: classes.dex */
public final class wq1 extends jw2 {
    public final /* synthetic */ int F;

    public /* synthetic */ wq1(int i) {
        this.F = i;
    }

    @Override // defpackage.jw2
    public final void F(xe6 xe6Var, float f) {
        switch (this.F) {
            case 0:
                ((View) xe6Var).setAlpha(f);
                return;
            case 1:
                ((View) xe6Var).setScaleX(f);
                return;
            case 2:
                ((View) xe6Var).setScaleY(f);
                return;
            case 3:
                ((View) xe6Var).setRotation(f);
                return;
            case 4:
                ((View) xe6Var).setRotationX(f);
                return;
            default:
                ((View) xe6Var).setRotationY(f);
                return;
        }
    }

    @Override // defpackage.jw2
    public final float t(xe6 xe6Var) {
        switch (this.F) {
            case 0:
                return ((View) xe6Var).getAlpha();
            case 1:
                return ((View) xe6Var).getScaleX();
            case 2:
                return ((View) xe6Var).getScaleY();
            case 3:
                return ((View) xe6Var).getRotation();
            case 4:
                return ((View) xe6Var).getRotationX();
            default:
                return ((View) xe6Var).getRotationY();
        }
    }
}
