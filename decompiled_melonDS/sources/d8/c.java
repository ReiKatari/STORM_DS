package d8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import n2.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Drawable.Callback {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ c(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j2;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                ((f) obj).invalidateSelf();
                return;
            default:
                drawable.getClass();
                r9.b bVar = (r9.b) obj;
                f1 f1Var = bVar.Y;
                f1Var.setValue(Integer.valueOf(((Number) f1Var.getValue()).intValue() + 1));
                Drawable drawable2 = bVar.X;
                Object obj2 = r9.d.f12637a;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j2 = a.a.f(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j2 = 9205357640488583168L;
                }
                bVar.Z.setValue(new h3.e(j2));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [yb.f, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.A) {
            case 0:
                ((f) this.B).scheduleSelf(runnable, j2);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) r9.d.f12637a.getValue()).postAtTime(runnable, j2);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [yb.f, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.A) {
            case 0:
                ((f) this.B).unscheduleSelf(runnable);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) r9.d.f12637a.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
