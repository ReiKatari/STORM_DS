package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq2  reason: default package */
/* loaded from: classes.dex */
public final class bq2 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj0 b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ bq2(rj0 rj0Var, Bitmap bitmap, int i) {
        this.a = i;
        this.b = rj0Var;
        this.c = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.a;
        Bitmap bitmap = this.c;
        rj0 rj0Var = this.b;
        switch (i2) {
            case 0:
                if (i == 0) {
                    if (rj0Var.u() instanceof sg4) {
                        rj0Var.G(bitmap, null);
                        return;
                    }
                    return;
                } else if (rj0Var.u() instanceof sg4) {
                    rj0Var.G(null, null);
                    return;
                } else {
                    return;
                }
            default:
                if (i == 0) {
                    if (rj0Var.u() instanceof sg4) {
                        rj0Var.G(bitmap, null);
                        return;
                    }
                    return;
                } else if (rj0Var.u() instanceof sg4) {
                    rj0Var.G(null, null);
                    return;
                } else {
                    return;
                }
        }
    }
}
