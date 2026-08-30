package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tz3  reason: default package */
/* loaded from: classes.dex */
public final class tz3 {
    public float[] a;
    public final int[] b;
    public final float[] c;
    public Path d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final float[] j;
    public int k;
    public final Rect l = new Rect();
    public final int m = 1;
    public final /* synthetic */ MotionLayout n;

    public tz3(MotionLayout motionLayout) {
        this.n = motionLayout;
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.j = new float[8];
        Paint paint5 = new Paint();
        this.i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, RecyclerView.A1));
        this.c = new float[100];
        this.b = new int[50];
    }

    public final void a(Canvas canvas, int i, int i2, lz3 lz3Var) {
        Canvas canvas2;
        int i3;
        int i4;
        char c;
        float f;
        Paint paint = this.g;
        int[] iArr = this.b;
        char c2 = 0;
        int i5 = 4;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i6 = 0; i6 < this.k; i6++) {
                int i7 = iArr[i6];
                if (i7 == 1) {
                    z = true;
                }
                if (i7 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z2) {
                b(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[fArr2.length - 2];
            float f5 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f2, f3, f4, f5, paint);
        } else {
            canvas2 = canvas;
        }
        if (i == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.a, this.e);
        View view = lz3Var.b;
        if (view != null) {
            i3 = view.getWidth();
            i4 = lz3Var.b.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i8 = 1;
        while (i8 < i2 - 1) {
            if (i == i5 && iArr[i8 - 1] == 0) {
                c = c2;
            } else {
                int i9 = i8 * 2;
                float[] fArr3 = this.c;
                float f6 = fArr3[i9];
                float f7 = fArr3[i9 + 1];
                this.d.reset();
                c = c2;
                this.d.moveTo(f6, f7 + 10.0f);
                this.d.lineTo(f6 + 10.0f, f7);
                this.d.lineTo(f6, f7 - 10.0f);
                this.d.lineTo(f6 - 10.0f, f7);
                this.d.close();
                int i10 = i8 - 1;
                wz3 wz3Var = (wz3) lz3Var.u.get(i10);
                Paint paint2 = this.i;
                if (i == i5) {
                    int i11 = iArr[i10];
                    if (i11 == 1) {
                        d(canvas2, f6 - RecyclerView.A1, f7 - RecyclerView.A1);
                    } else if (i11 == 0) {
                        c(canvas2, f6 - RecyclerView.A1, f7 - RecyclerView.A1);
                    } else if (i11 == 2) {
                        f = f7;
                        e(canvas2, f6 - RecyclerView.A1, f - RecyclerView.A1, i3, i4);
                        canvas2.drawPath(this.d, paint2);
                    }
                    f = f7;
                    canvas2.drawPath(this.d, paint2);
                } else {
                    f = f7;
                }
                if (i == 2) {
                    d(canvas2, f6 - RecyclerView.A1, f - RecyclerView.A1);
                }
                if (i == 3) {
                    c(canvas2, f6 - RecyclerView.A1, f - RecyclerView.A1);
                }
                if (i == 6) {
                    e(canvas2, f6 - RecyclerView.A1, f - RecyclerView.A1, i3, i4);
                }
                canvas2.drawPath(this.d, paint2);
            }
            i8++;
            c2 = c;
            i5 = 4;
        }
        char c3 = c2;
        float[] fArr4 = this.a;
        if (fArr4.length > 1) {
            float f8 = fArr4[c3];
            float f9 = fArr4[1];
            Paint paint3 = this.f;
            canvas2.drawCircle(f8, f9, 8.0f, paint3);
            float[] fArr5 = this.a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float min = Math.min(f, f3);
        float max = Math.max(f2, f4);
        float max2 = Math.max(f, f3);
        float max3 = Math.max(f2, f4);
        Paint paint = this.g;
        canvas.drawLine(min, max, max2, max3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    public final void c(Canvas canvas, float f, float f2) {
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float min = Math.min(f3, f5);
        float max = Math.max(f4, f6);
        float min2 = f - Math.min(f3, f5);
        float max2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.h;
        Rect rect = this.l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f2 - 20.0f, paint);
        float min3 = Math.min(f3, f5);
        Paint paint2 = this.g;
        canvas.drawLine(f, f2, min3, f2, paint2);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    public final void d(Canvas canvas, float f, float f2) {
        Rect rect;
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
        float f10 = (f7 * f9) + f3;
        float f11 = (f9 * f8) + f4;
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.h;
        paint.getTextBounds(str, 0, length, this.l);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.g);
    }

    public final void e(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        MotionLayout motionLayout = this.n;
        sb.append(((int) ((((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i)) + 0.5d)) / 100.0f);
        String sb2 = sb.toString();
        int length = sb2.length();
        Paint paint = this.h;
        Rect rect = this.l;
        paint.getTextBounds(sb2, 0, length, rect);
        canvas.drawText(sb2, ((f / 2.0f) - (rect.width() / 2)) + RecyclerView.A1, f2 - 20.0f, paint);
        float min = Math.min((float) RecyclerView.A1, 1.0f);
        Paint paint2 = this.g;
        canvas.drawLine(f, f2, min, f2, paint2);
        String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, RecyclerView.A1 - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max((float) RecyclerView.A1, 1.0f), paint2);
    }
}
