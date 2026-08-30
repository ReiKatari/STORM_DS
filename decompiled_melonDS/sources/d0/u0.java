package d0;

import androidx.camera.core.ImageProcessingUtil;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements c0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ y0 B;

    public /* synthetic */ u0(y0 y0Var, y0 y0Var2, int i2) {
        this.A = i2;
        this.B = y0Var2;
    }

    @Override // d0.c0
    public final void d(d0 d0Var) {
        int i2 = this.A;
        y0 y0Var = this.B;
        switch (i2) {
            case 0:
                int i10 = ImageProcessingUtil.f1062a;
                if (y0Var != null) {
                    y0Var.close();
                    return;
                }
                return;
            default:
                int i11 = ImageProcessingUtil.f1062a;
                y0Var.close();
                return;
        }
    }
}
