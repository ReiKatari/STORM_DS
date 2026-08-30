package defpackage;

import androidx.camera.core.ImageProcessingUtil;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kw2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kw2 implements gf2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ow2 B;

    public /* synthetic */ kw2(ow2 ow2Var, ow2 ow2Var2, int i) {
        this.A = i;
        this.B = ow2Var2;
    }

    @Override // defpackage.gf2
    public final void e(hf2 hf2Var) {
        int i = this.A;
        ow2 ow2Var = this.B;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                if (ow2Var != null) {
                    ow2Var.close();
                    return;
                }
                return;
            default:
                int i3 = ImageProcessingUtil.a;
                ow2Var.close();
                return;
        }
    }
}
