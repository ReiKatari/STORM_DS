package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mo0  reason: default package */
/* loaded from: classes.dex */
public final class mo0 extends Drawable implements Animatable {
    public static final LinearInterpolator Z = new LinearInterpolator();
    public static final x42 c0 = new x42(1);
    public static final int[] d0 = {-16777216};
    public final lo0 A;
    public float B;
    public final Resources L;
    public final ValueAnimator R;
    public float X;
    public boolean Y;

    public mo0(Context context) {
        context.getClass();
        this.L = context.getResources();
        lo0 lo0Var = new lo0();
        this.A = lo0Var;
        lo0Var.i = d0;
        lo0Var.a(0);
        lo0Var.h = 2.5f;
        lo0Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.A1, 1.0f);
        ofFloat.addUpdateListener(new jo0(this, lo0Var));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(Z);
        ofFloat.addListener(new ko0(this, lo0Var));
        this.R = ofFloat;
    }

    public static void d(float f, lo0 lo0Var) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = lo0Var.i;
            int i = lo0Var.j;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            lo0Var.u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
            return;
        }
        lo0Var.u = lo0Var.i[lo0Var.j];
    }

    public final void a(float f, lo0 lo0Var, boolean z) {
        float f2;
        if (this.Y) {
            d(f, lo0Var);
            float f3 = lo0Var.k;
            float f4 = lo0Var.l;
            lo0Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            lo0Var.f = f4;
            float f5 = lo0Var.m;
            lo0Var.g = b31.a((float) (Math.floor(lo0Var.m / 0.8f) + 1.0d), f5, f, f5);
        } else if (f == 1.0f && !z) {
        } else {
            float f6 = lo0Var.m;
            int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            float f7 = lo0Var.k;
            x42 x42Var = c0;
            if (i < 0) {
                f2 = (x42Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - x42Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            lo0Var.e = f7;
            lo0Var.f = f2;
            lo0Var.g = (0.20999998f * f) + f6;
            this.B = (f + this.X) * 216.0f;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.L.getDisplayMetrics().density;
        float f6 = f2 * f5;
        lo0 lo0Var = this.A;
        lo0Var.h = f6;
        lo0Var.b.setStrokeWidth(f6);
        lo0Var.q = f * f5;
        lo0Var.a(0);
        lo0Var.r = (int) (f3 * f5);
        lo0Var.s = (int) (f4 * f5);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.B, bounds.exactCenterX(), bounds.exactCenterY());
        lo0 lo0Var = this.A;
        Paint paint = lo0Var.b;
        RectF rectF = lo0Var.a;
        float f = lo0Var.q;
        float f2 = (lo0Var.h / 2.0f) + f;
        if (f <= RecyclerView.A1) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((lo0Var.r * lo0Var.p) / 2.0f, lo0Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = lo0Var.e;
        float f4 = lo0Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((lo0Var.f + f4) * 360.0f) - f5;
        paint.setColor(lo0Var.u);
        paint.setAlpha(lo0Var.t);
        float f7 = lo0Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, lo0Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = lo0Var.c;
        if (lo0Var.n) {
            Path path = lo0Var.o;
            if (path == null) {
                Path path2 = new Path();
                lo0Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            lo0Var.o.moveTo(RecyclerView.A1, RecyclerView.A1);
            lo0Var.o.lineTo(lo0Var.r * lo0Var.p, RecyclerView.A1);
            Path path3 = lo0Var.o;
            float f9 = lo0Var.p;
            path3.lineTo((lo0Var.r * f9) / 2.0f, lo0Var.s * f9);
            lo0Var.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((lo0Var.r * lo0Var.p) / 2.0f), (lo0Var.h / 2.0f) + rectF.centerY());
            lo0Var.o.close();
            paint2.setColor(lo0Var.u);
            paint2.setAlpha(lo0Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(lo0Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.R.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.R;
        valueAnimator.cancel();
        lo0 lo0Var = this.A;
        float f = lo0Var.e;
        lo0Var.k = f;
        float f2 = lo0Var.f;
        lo0Var.l = f2;
        lo0Var.m = lo0Var.g;
        if (f2 != f) {
            this.Y = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        lo0Var.a(0);
        lo0Var.k = RecyclerView.A1;
        lo0Var.l = RecyclerView.A1;
        lo0Var.m = RecyclerView.A1;
        lo0Var.e = RecyclerView.A1;
        lo0Var.f = RecyclerView.A1;
        lo0Var.g = RecyclerView.A1;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.R.cancel();
        this.B = RecyclerView.A1;
        lo0 lo0Var = this.A;
        if (lo0Var.n) {
            lo0Var.n = false;
        }
        lo0Var.a(0);
        lo0Var.k = RecyclerView.A1;
        lo0Var.l = RecyclerView.A1;
        lo0Var.m = RecyclerView.A1;
        lo0Var.e = RecyclerView.A1;
        lo0Var.f = RecyclerView.A1;
        lo0Var.g = RecyclerView.A1;
        invalidateSelf();
    }
}
