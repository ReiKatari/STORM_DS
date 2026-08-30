package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: on  reason: default package */
/* loaded from: classes.dex */
public final class on implements Drawable.Callback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ on(int i, Object obj) {
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
                ((rn) obj).invalidateSelf();
                return;
            default:
                drawable.getClass();
                ok1 ok1Var = (ok1) obj;
                tj4 tj4Var = ok1Var.Y;
                tj4Var.setValue(Integer.valueOf(((Number) tj4Var.getValue()).intValue() + 1));
                Drawable drawable2 = ok1Var.X;
                gh3 gh3Var = pk1.a;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j = mj2.d(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j = 9205357640488583168L;
                }
                ok1Var.Z.setValue(new i76(j));
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.A) {
            case 0:
                ((rn) this.B).scheduleSelf(runnable, j);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) pk1.a.getValue()).postAtTime(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.A) {
            case 0:
                ((rn) this.B).unscheduleSelf(runnable);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) pk1.a.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
