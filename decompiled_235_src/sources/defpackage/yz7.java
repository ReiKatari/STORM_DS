package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz7  reason: default package */
/* loaded from: classes.dex */
public final class yz7 extends Drawable implements Drawable.Callback {
    public long B;
    public int L;
    public int X;
    public boolean d0;
    public final wz7 e0;
    public Drawable f0;
    public Drawable g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int A = 0;
    public int R = 255;
    public int Y = 0;
    public final boolean Z = true;

    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable$ConstantState, wz7] */
    public yz7(wz7 wz7Var) {
        ?? constantState = new Drawable.ConstantState();
        if (wz7Var != null) {
            constantState.a = wz7Var.a;
            constantState.b = wz7Var.b;
        }
        this.e0 = constantState;
    }

    public final boolean a() {
        if (!this.h0) {
            boolean z = false;
            if (this.f0.getConstantState() != null && this.g0.getConstantState() != null) {
                z = true;
            }
            this.i0 = z;
            this.h0 = true;
        }
        return this.i0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r0 == 0) goto L15;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z;
        int i = this.A;
        int i2 = 0;
        if (i != 1) {
            if (i != 2 || this.B < 0) {
                z = true;
            } else {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.B)) / this.X;
                if (uptimeMillis >= 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.A = 0;
                }
                this.Y = (int) ((this.L * Math.min(uptimeMillis, 1.0f)) + RecyclerView.B1);
            }
        } else {
            this.B = SystemClock.uptimeMillis();
            this.A = 2;
            z = false;
        }
        int i3 = this.Y;
        Drawable drawable = this.f0;
        Drawable drawable2 = this.g0;
        boolean z2 = this.Z;
        if (z) {
            if (!z2) {
                i2 = i3;
            }
            drawable.draw(canvas);
            i3 = i2;
            int i4 = this.R;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.R - i3);
            i2 = 1;
        }
        drawable.draw(canvas);
        if (i2 != 0) {
            drawable.setAlpha(this.R);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.R);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        wz7 wz7Var = this.e0;
        return wz7Var.b | changingConfigurations | wz7Var.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (a()) {
            int changingConfigurations = getChangingConfigurations();
            wz7 wz7Var = this.e0;
            wz7Var.a = changingConfigurations;
            return wz7Var;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f0.getIntrinsicHeight(), this.g0.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f0.getIntrinsicWidth(), this.g0.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.j0) {
            this.k0 = Drawable.resolveOpacity(this.f0.getOpacity(), this.g0.getOpacity());
            this.j0 = true;
        }
        return this.k0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.d0 && super.mutate() == this) {
            if (a()) {
                this.f0.mutate();
                this.g0.mutate();
                this.d0 = true;
                return this;
            }
            i.m("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            return null;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f0.setBounds(rect);
        this.g0.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.Y == this.R) {
            this.Y = i;
        }
        this.R = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f0.setColorFilter(colorFilter);
        this.g0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
