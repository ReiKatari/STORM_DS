package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o24  reason: default package */
/* loaded from: classes.dex */
public final class o24 extends jw2 {
    public final int F;

    public o24(int i) {
        this.F = i;
    }

    @Override // defpackage.jw2
    public final void F(xe6 xe6Var, float f) {
        p24 p24Var = (p24) xe6Var;
        float[] fArr = p24Var.x0;
        if (fArr != null) {
            int i = this.F;
            if (fArr[i] != f) {
                fArr[i] = f;
                h61 h61Var = p24Var.z0;
                if (h61Var != null) {
                    float h = p24Var.h();
                    MaterialButton materialButton = (MaterialButton) h61Var.B;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.w0 != i2) {
                        materialButton.w0 = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                p24Var.invalidateSelf();
            }
        }
    }

    @Override // defpackage.jw2
    public final float t(xe6 xe6Var) {
        float[] fArr = ((p24) xe6Var).x0;
        if (fArr != null) {
            return fArr[this.F];
        }
        return RecyclerView.B1;
    }
}
