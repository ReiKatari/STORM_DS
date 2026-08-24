package defpackage;

import androidx.camera.core.ImageProcessingUtil;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o23 implements fk2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ s23 B;

    public /* synthetic */ o23(s23 s23Var, s23 s23Var2, int i) {
        this.A = i;
        this.B = s23Var2;
    }

    @Override // defpackage.fk2
    public final void c(gk2 gk2Var) {
        int i = this.A;
        s23 s23Var = this.B;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                if (s23Var != null) {
                    s23Var.close();
                    return;
                }
                return;
            default:
                int i3 = ImageProcessingUtil.a;
                s23Var.close();
                return;
        }
    }
}
