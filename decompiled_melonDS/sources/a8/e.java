package a8;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends Drawable implements Animatable {
    public static final LinearInterpolator Z = new LinearInterpolator();

    /* renamed from: b0  reason: collision with root package name */
    public static final t6.a f662b0 = new t6.a(1);

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f663c0 = {-16777216};
    public final d A;
    public float B;
    public final Resources L;
    public final ValueAnimator R;
    public float X;
    public boolean Y;

    public e(Context context) {
        context.getClass();
        this.L = context.getResources();
        d dVar = new d();
        this.A = dVar;
        dVar.f650i = f663c0;
        dVar.a(0);
        dVar.f649h = 2.5f;
        dVar.f643b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(Z);
        ofFloat.addListener(new c(this, dVar));
        this.R = ofFloat;
    }

    public static void d(float f8, d dVar) {
        if (f8 > 0.75f) {
            float f10 = (f8 - 0.75f) / 0.25f;
            int[] iArr = dVar.f650i;
            int i2 = dVar.f651j;
            int i10 = iArr[i2];
            int i11 = iArr[(i2 + 1) % iArr.length];
            int i12 = (i10 >> 24) & 255;
            int i13 = (i10 >> 16) & 255;
            int i14 = (i10 >> 8) & 255;
            int i15 = i10 & 255;
            dVar.f661u = ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
            return;
        }
        dVar.f661u = dVar.f650i[dVar.f651j];
    }

    public final void a(float f8, d dVar, boolean z10) {
        float f10;
        if (this.Y) {
            d(f8, dVar);
            float floor = (float) (Math.floor(dVar.m / 0.8f) + 1.0d);
            float f11 = dVar.f652k;
            float f12 = dVar.f653l;
            dVar.f646e = (((f12 - 0.01f) - f11) * f8) + f11;
            dVar.f647f = f12;
            float f13 = dVar.m;
            dVar.f648g = w.d.a(floor, f13, f8, f13);
        } else if (f8 == 1.0f && !z10) {
        } else {
            float f14 = dVar.m;
            int i2 = (f8 > 0.5f ? 1 : (f8 == 0.5f ? 0 : -1));
            float f15 = dVar.f652k;
            t6.a aVar = f662b0;
            if (i2 < 0) {
                f10 = (aVar.getInterpolation(f8 / 0.5f) * 0.79f) + 0.01f + f15;
            } else {
                float f16 = f15 + 0.79f;
                f15 = f16 - (((1.0f - aVar.getInterpolation((f8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f16;
            }
            dVar.f646e = f15;
            dVar.f647f = f10;
            dVar.f648g = (0.20999998f * f8) + f14;
            this.B = (f8 + this.X) * 216.0f;
        }
    }

    public final void b(float f8, float f10, float f11, float f12) {
        float f13 = this.L.getDisplayMetrics().density;
        float f14 = f10 * f13;
        d dVar = this.A;
        dVar.f649h = f14;
        dVar.f643b.setStrokeWidth(f14);
        dVar.f657q = f8 * f13;
        dVar.a(0);
        dVar.f658r = (int) (f11 * f13);
        dVar.f659s = (int) (f12 * f13);
    }

    public final void c(int i2) {
        if (i2 == 0) {
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
        d dVar = this.A;
        Paint paint = dVar.f643b;
        RectF rectF = dVar.f642a;
        float f8 = dVar.f657q;
        float f10 = (dVar.f649h / 2.0f) + f8;
        if (f8 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f658r * dVar.f656p) / 2.0f, dVar.f649h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = dVar.f646e;
        float f12 = dVar.f648g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f647f + f12) * 360.0f) - f13;
        paint.setColor(dVar.f661u);
        paint.setAlpha(dVar.f660t);
        float f15 = dVar.f649h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f645d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = dVar.f644c;
        if (dVar.f654n) {
            Path path = dVar.f655o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f655o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            dVar.f655o.moveTo(0.0f, 0.0f);
            dVar.f655o.lineTo(dVar.f658r * dVar.f656p, 0.0f);
            Path path3 = dVar.f655o;
            float f17 = dVar.f656p;
            path3.lineTo((dVar.f658r * f17) / 2.0f, dVar.f659s * f17);
            dVar.f655o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((dVar.f658r * dVar.f656p) / 2.0f), (dVar.f649h / 2.0f) + rectF.centerY());
            dVar.f655o.close();
            paint2.setColor(dVar.f661u);
            paint2.setAlpha(dVar.f660t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f655o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A.f660t;
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
    public final void setAlpha(int i2) {
        this.A.f660t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A.f643b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.R.cancel();
        d dVar = this.A;
        float f8 = dVar.f646e;
        dVar.f652k = f8;
        float f10 = dVar.f647f;
        dVar.f653l = f10;
        dVar.m = dVar.f648g;
        if (f10 != f8) {
            this.Y = true;
            this.R.setDuration(666L);
            this.R.start();
            return;
        }
        dVar.a(0);
        dVar.f652k = 0.0f;
        dVar.f653l = 0.0f;
        dVar.m = 0.0f;
        dVar.f646e = 0.0f;
        dVar.f647f = 0.0f;
        dVar.f648g = 0.0f;
        this.R.setDuration(1332L);
        this.R.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.R.cancel();
        this.B = 0.0f;
        d dVar = this.A;
        if (dVar.f654n) {
            dVar.f654n = false;
        }
        dVar.a(0);
        dVar.f652k = 0.0f;
        dVar.f653l = 0.0f;
        dVar.m = 0.0f;
        dVar.f646e = 0.0f;
        dVar.f647f = 0.0f;
        dVar.f648g = 0.0f;
        invalidateSelf();
    }
}
