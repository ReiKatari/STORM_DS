package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public final class ao implements Drawable.Callback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ao(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((eo) obj).invalidateSelf();
                return;
            default:
                drawable.getClass();
                uo1 uo1Var = (uo1) obj;
                vs4 vs4Var = uo1Var.Y;
                vs4Var.setValue(Integer.valueOf(((Number) vs4Var.getValue()).intValue() + 1));
                Drawable drawable2 = uo1Var.X;
                go3 go3Var = vo1.a;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j = ii2.n(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j = 9205357640488583168L;
                }
                uo1Var.Z.setValue(new xi6(j));
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.A) {
            case 0:
                ((eo) this.B).scheduleSelf(runnable, j);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) vo1.a.getValue()).postAtTime(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.A) {
            case 0:
                ((eo) this.B).unscheduleSelf(runnable);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) vo1.a.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
