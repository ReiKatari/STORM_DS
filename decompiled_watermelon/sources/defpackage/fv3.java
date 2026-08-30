package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fv3  reason: default package */
/* loaded from: classes.dex */
public final class fv3 extends mh7 {
    public final int u;

    public fv3(int i) {
        this.u = i;
    }

    @Override // defpackage.mh7
    public final float P(l36 l36Var) {
        float[] fArr = ((gv3) l36Var).w0;
        if (fArr != null) {
            return fArr[this.u];
        }
        return RecyclerView.A1;
    }

    @Override // defpackage.mh7
    public final void e0(l36 l36Var, float f) {
        gv3 gv3Var = (gv3) l36Var;
        float[] fArr = gv3Var.w0;
        if (fArr != null) {
            int i = this.u;
            if (fArr[i] != f) {
                fArr[i] = f;
                a31 a31Var = gv3Var.y0;
                if (a31Var != null) {
                    float h = gv3Var.h();
                    MaterialButton materialButton = (MaterialButton) a31Var.B;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.v0 != i2) {
                        materialButton.v0 = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                gv3Var.invalidateSelf();
            }
        }
    }
}
