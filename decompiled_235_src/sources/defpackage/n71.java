package defpackage;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n71  reason: default package */
/* loaded from: classes.dex */
public final class n71 extends Drawable implements Drawable.Callback, Animatable {
    public final y56 A;
    public final int B;
    public final boolean L;
    public final ArrayList R = new ArrayList();
    public final int X;
    public final int Y;
    public long Z;
    public int d0;
    public int e0;
    public Drawable f0;
    public final Drawable g0;

    public n71(Drawable drawable, y56 y56Var, int i, boolean z) {
        Integer num;
        Integer num2;
        Drawable drawable2;
        this.A = y56Var;
        this.B = i;
        this.L = z;
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
        this.d0 = 255;
        this.f0 = null;
        if (drawable != null) {
            drawable2 = drawable.mutate();
        } else {
            drawable2 = null;
        }
        this.g0 = drawable2;
        if (i > 0) {
            Drawable drawable3 = this.f0;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawable2 != null) {
                drawable2.setCallback(this);
                return;
            }
            return;
        }
        i.h("durationMillis must be > 0.");
        throw null;
    }

    public final int a(Integer num, Integer num2) {
        int i;
        int i2 = -1;
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(i, i2);
    }

    public final void b() {
        this.e0 = 2;
        this.f0 = null;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ColorStateList colorStateList = ((g24) arrayList.get(i)).b.n0;
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
            double N = ak7.N(intrinsicWidth, intrinsicHeight, width, height, this.A);
            int D = u24.D((width - (intrinsicWidth * N)) / 2.0d);
            int D2 = u24.D((height - (N * intrinsicHeight)) / 2.0d);
            drawable.setBounds(rect.left + D, rect.top + D2, rect.right - D, rect.bottom - D2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int save;
        Drawable drawable;
        int i = this.e0;
        if (i == 0) {
            Drawable drawable2 = this.f0;
            if (drawable2 != null) {
                drawable2.setAlpha(this.d0);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.g0;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.d0);
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
        double o = gi2.o(uptimeMillis, 0.0d, 1.0d);
        int i2 = this.d0;
        int i3 = (int) (o * i2);
        if (this.L) {
            i2 -= i3;
        }
        if (uptimeMillis >= 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (drawable = this.f0) != null) {
            drawable.setAlpha(i2);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.e0;
        if (i != 0) {
            Drawable drawable = this.g0;
            if (i != 1) {
                if (i == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            } else if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            } else {
                Drawable drawable2 = this.f0;
                if (drawable2 != null) {
                    return drawable2.getColorFilter();
                }
                return null;
            }
        }
        Drawable drawable3 = this.f0;
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
        Drawable drawable = this.f0;
        int i = this.e0;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.g0;
        if (i == 2) {
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
        if (this.e0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f0;
        if (drawable != null) {
            z = drawable.setLevel(i);
        } else {
            z = false;
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            z2 = drawable2.setLevel(i);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f0;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            z = false;
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            z2 = drawable2.setState(iArr);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i >= 0 && i < 256) {
            this.d0 = i;
        } else {
            i.f(lb1.g(i, "Invalid alpha: "));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f0;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Drawable drawable = this.f0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.g0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.e0 != 0) {
            return;
        }
        this.e0 = 1;
        this.Z = SystemClock.uptimeMillis();
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g24) arrayList.get(i)).a(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Drawable drawable = this.f0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.g0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.e0 != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
