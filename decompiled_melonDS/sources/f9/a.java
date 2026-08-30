package f9;

import a0.j;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import k0.d;
import n9.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {
    public final f A;
    public final int B;
    public final boolean L;
    public final ArrayList R = new ArrayList();
    public final int X;
    public final int Y;
    public long Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f4958b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4959c0;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f4960d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Drawable f4961e0;

    public a(Drawable drawable, f fVar, int i2, boolean z10) {
        Integer num;
        Integer num2;
        this.A = fVar;
        this.B = i2;
        this.L = z10;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        this.X = a(null, num);
        if (drawable != null) {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num2 = null;
        }
        this.Y = a(null, num2);
        this.f4958b0 = 255;
        this.f4960d0 = null;
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        this.f4961e0 = mutate;
        if (i2 > 0) {
            Drawable drawable2 = this.f4960d0;
            if (drawable2 != null) {
                drawable2.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        j.h("durationMillis must be > 0.");
        throw null;
    }

    public final int a(Integer num, Integer num2) {
        int i2;
        int i10 = -1;
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        if (num2 != null) {
            i10 = num2.intValue();
        }
        return Math.max(i2, i10);
    }

    public final void b() {
        this.f4959c0 = 2;
        this.f4960d0 = null;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ColorStateList colorStateList = ((ba.a) arrayList.get(i2)).f2131b.f2146l0;
            if (colorStateList != null) {
                setTintList(colorStateList);
            }
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double p10 = d.p(intrinsicWidth, intrinsicHeight, width, height, this.A);
            double d4 = 2;
            int L = pc.a.L((width - (intrinsicWidth * p10)) / d4);
            int L2 = pc.a.L((height - (p10 * intrinsicHeight)) / d4);
            drawable.setBounds(rect.left + L, rect.top + L2, rect.right - L, rect.bottom - L2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int save;
        Drawable drawable;
        int i2 = this.f4959c0;
        if (i2 == 0) {
            Drawable drawable2 = this.f4960d0;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f4958b0);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f4961e0;
        if (i2 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f4958b0);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.Z) / this.B;
        double e6 = p7.j.e(uptimeMillis, 0.0d, 1.0d);
        int i10 = this.f4958b0;
        int i11 = (int) (e6 * i10);
        if (this.L) {
            i10 -= i11;
        }
        if (uptimeMillis >= 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (drawable = this.f4960d0) != null) {
            drawable.setAlpha(i10);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i11);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4958b0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i2 = this.f4959c0;
        if (i2 != 0) {
            Drawable drawable = this.f4961e0;
            if (i2 != 1) {
                if (i2 == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            } else if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            } else {
                Drawable drawable2 = this.f4960d0;
                if (drawable2 != null) {
                    return drawable2.getColorFilter();
                }
                return null;
            }
        }
        Drawable drawable3 = this.f4960d0;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4960d0;
        int i2 = this.f4959c0;
        if (i2 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f4961e0;
        if (i2 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.f4959c0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            z10 = drawable.setLevel(i2);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i2);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (i2 >= 0 && i2 < 256) {
            this.f4958b0 = i2;
        } else {
            j.e(w.d.l(i2, "Invalid alpha: "));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4960d0;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Drawable drawable = this.f4960d0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f4959c0 != 0) {
            return;
        }
        this.f4959c0 = 1;
        this.Z = SystemClock.uptimeMillis();
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ba.a) arrayList.get(i2)).a(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Drawable drawable = this.f4960d0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.f4961e0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f4959c0 != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
