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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq0  reason: default package */
/* loaded from: classes.dex */
public final class wq0 extends Drawable implements Animatable {
    public static final LinearInterpolator Z = new LinearInterpolator();
    public static final q92 d0 = new q92(1);
    public static final int[] e0 = {-16777216};
    public final vq0 A;
    public float B;
    public final Resources L;
    public final ValueAnimator R;
    public float X;
    public boolean Y;

    public wq0(Context context) {
        context.getClass();
        this.L = context.getResources();
        vq0 vq0Var = new vq0();
        this.A = vq0Var;
        vq0Var.i = e0;
        vq0Var.a(0);
        vq0Var.h = 2.5f;
        vq0Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.B1, 1.0f);
        ofFloat.addUpdateListener(new tq0(this, vq0Var));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(Z);
        ofFloat.addListener(new uq0(this, vq0Var));
        this.R = ofFloat;
    }

    public static void d(float f, vq0 vq0Var) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = vq0Var.i;
            int i = vq0Var.j;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            vq0Var.u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
            return;
        }
        vq0Var.u = vq0Var.i[vq0Var.j];
    }

    public final void a(float f, vq0 vq0Var, boolean z) {
        float f2;
        if (this.Y) {
            d(f, vq0Var);
            float f3 = vq0Var.k;
            float f4 = vq0Var.l;
            vq0Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            vq0Var.f = f4;
            float f5 = vq0Var.m;
            vq0Var.g = i61.a((float) (Math.floor(vq0Var.m / 0.8f) + 1.0d), f5, f, f5);
        } else if (f == 1.0f && !z) {
        } else {
            float f6 = vq0Var.m;
            int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            float f7 = vq0Var.k;
            q92 q92Var = d0;
            if (i < 0) {
                f2 = (q92Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - q92Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            vq0Var.e = f7;
            vq0Var.f = f2;
            vq0Var.g = (0.20999998f * f) + f6;
            this.B = (f + this.X) * 216.0f;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.L.getDisplayMetrics().density;
        float f6 = f2 * f5;
        vq0 vq0Var = this.A;
        vq0Var.h = f6;
        vq0Var.b.setStrokeWidth(f6);
        vq0Var.q = f * f5;
        vq0Var.a(0);
        vq0Var.r = (int) (f3 * f5);
        vq0Var.s = (int) (f4 * f5);
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
        vq0 vq0Var = this.A;
        Paint paint = vq0Var.b;
        RectF rectF = vq0Var.a;
        float f = vq0Var.q;
        float f2 = (vq0Var.h / 2.0f) + f;
        if (f <= RecyclerView.B1) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((vq0Var.r * vq0Var.p) / 2.0f, vq0Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = vq0Var.e;
        float f4 = vq0Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((vq0Var.f + f4) * 360.0f) - f5;
        paint.setColor(vq0Var.u);
        paint.setAlpha(vq0Var.t);
        float f7 = vq0Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, vq0Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = vq0Var.c;
        if (vq0Var.n) {
            Path path = vq0Var.o;
            if (path == null) {
                Path path2 = new Path();
                vq0Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            vq0Var.o.moveTo(RecyclerView.B1, RecyclerView.B1);
            vq0Var.o.lineTo(vq0Var.r * vq0Var.p, RecyclerView.B1);
            Path path3 = vq0Var.o;
            float f9 = vq0Var.p;
            path3.lineTo((vq0Var.r * f9) / 2.0f, vq0Var.s * f9);
            vq0Var.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((vq0Var.r * vq0Var.p) / 2.0f), (vq0Var.h / 2.0f) + rectF.centerY());
            vq0Var.o.close();
            paint2.setColor(vq0Var.u);
            paint2.setAlpha(vq0Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(vq0Var.o, paint2);
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
        vq0 vq0Var = this.A;
        float f = vq0Var.e;
        vq0Var.k = f;
        float f2 = vq0Var.f;
        vq0Var.l = f2;
        vq0Var.m = vq0Var.g;
        if (f2 != f) {
            this.Y = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        vq0Var.a(0);
        vq0Var.k = RecyclerView.B1;
        vq0Var.l = RecyclerView.B1;
        vq0Var.m = RecyclerView.B1;
        vq0Var.e = RecyclerView.B1;
        vq0Var.f = RecyclerView.B1;
        vq0Var.g = RecyclerView.B1;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.R.cancel();
        this.B = RecyclerView.B1;
        vq0 vq0Var = this.A;
        if (vq0Var.n) {
            vq0Var.n = false;
        }
        vq0Var.a(0);
        vq0Var.k = RecyclerView.B1;
        vq0Var.l = RecyclerView.B1;
        vq0Var.m = RecyclerView.B1;
        vq0Var.e = RecyclerView.B1;
        vq0Var.f = RecyclerView.B1;
        vq0Var.g = RecyclerView.B1;
        invalidateSelf();
    }
}
