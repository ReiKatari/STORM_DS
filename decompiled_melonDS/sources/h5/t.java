package h5;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public float[] f6239a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6240b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f6241c;

    /* renamed from: d  reason: collision with root package name */
    public Path f6242d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f6243e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f6244f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f6245g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6246h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f6247i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f6248j;

    /* renamed from: k  reason: collision with root package name */
    public int f6249k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f6250l = new Rect();
    public final int m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ MotionLayout f6251n;

    public t(MotionLayout motionLayout) {
        this.f6251n = motionLayout;
        Paint paint = new Paint();
        this.f6243e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f6244f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f6245g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f6246h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f6248j = new float[8];
        Paint paint5 = new Paint();
        this.f6247i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f6241c = new float[100];
        this.f6240b = new int[50];
    }

    public final void a(Canvas canvas, int i2, int i10, p pVar) {
        Canvas canvas2;
        int i11;
        int i12;
        char c4;
        float f8;
        Paint paint = this.f6245g;
        int[] iArr = this.f6240b;
        char c10 = 0;
        int i13 = 4;
        if (i2 == 4) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i14 = 0; i14 < this.f6249k; i14++) {
                int i15 = iArr[i14];
                if (i15 == 1) {
                    z10 = true;
                }
                if (i15 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                float[] fArr = this.f6239a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z11) {
                b(canvas);
            }
        }
        if (i2 == 2) {
            float[] fArr2 = this.f6239a;
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            float f12 = fArr2[fArr2.length - 2];
            float f13 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f10, f11, f12, f13, paint);
        } else {
            canvas2 = canvas;
        }
        if (i2 == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.f6239a, this.f6243e);
        View view = pVar.f6211b;
        if (view != null) {
            i11 = view.getWidth();
            i12 = pVar.f6211b.getHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i16 = 1;
        while (i16 < i10 - 1) {
            if (i2 == i13 && iArr[i16 - 1] == 0) {
                c4 = c10;
            } else {
                int i17 = i16 * 2;
                float[] fArr3 = this.f6241c;
                float f14 = fArr3[i17];
                float f15 = fArr3[i17 + 1];
                this.f6242d.reset();
                c4 = c10;
                this.f6242d.moveTo(f14, f15 + 10.0f);
                this.f6242d.lineTo(f14 + 10.0f, f15);
                this.f6242d.lineTo(f14, f15 - 10.0f);
                this.f6242d.lineTo(f14 - 10.0f, f15);
                this.f6242d.close();
                int i18 = i16 - 1;
                x xVar = (x) pVar.f6229u.get(i18);
                Paint paint2 = this.f6247i;
                if (i2 == i13) {
                    int i19 = iArr[i18];
                    if (i19 == 1) {
                        d(canvas2, f14 - 0.0f, f15 - 0.0f);
                    } else if (i19 == 0) {
                        c(canvas2, f14 - 0.0f, f15 - 0.0f);
                    } else if (i19 == 2) {
                        f8 = f15;
                        e(canvas2, f14 - 0.0f, f8 - 0.0f, i11, i12);
                        canvas2.drawPath(this.f6242d, paint2);
                    }
                    f8 = f15;
                    canvas2.drawPath(this.f6242d, paint2);
                } else {
                    f8 = f15;
                }
                if (i2 == 2) {
                    d(canvas2, f14 - 0.0f, f8 - 0.0f);
                }
                if (i2 == 3) {
                    c(canvas2, f14 - 0.0f, f8 - 0.0f);
                }
                if (i2 == 6) {
                    e(canvas2, f14 - 0.0f, f8 - 0.0f, i11, i12);
                }
                canvas2.drawPath(this.f6242d, paint2);
            }
            i16++;
            c10 = c4;
            i13 = 4;
        }
        char c11 = c10;
        float[] fArr4 = this.f6239a;
        if (fArr4.length > 1) {
            float f16 = fArr4[c11];
            float f17 = fArr4[1];
            Paint paint3 = this.f6244f;
            canvas2.drawCircle(f16, f17, 8.0f, paint3);
            float[] fArr5 = this.f6239a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f6239a;
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[fArr.length - 2];
        float f12 = fArr[fArr.length - 1];
        float min = Math.min(f8, f11);
        float max = Math.max(f10, f12);
        float max2 = Math.max(f8, f11);
        float max3 = Math.max(f10, f12);
        Paint paint = this.f6245g;
        canvas.drawLine(min, max, max2, max3, paint);
        canvas.drawLine(Math.min(f8, f11), Math.min(f10, f12), Math.min(f8, f11), Math.max(f10, f12), paint);
    }

    public final void c(Canvas canvas, float f8, float f10) {
        float[] fArr = this.f6239a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[fArr.length - 2];
        float f14 = fArr[fArr.length - 1];
        float min = Math.min(f11, f13);
        float max = Math.max(f12, f14);
        float min2 = f8 - Math.min(f11, f13);
        float max2 = Math.max(f12, f14) - f10;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f13 - f11)) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f6246h;
        Rect rect = this.f6250l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f10 - 20.0f, paint);
        float min3 = Math.min(f11, f13);
        Paint paint2 = this.f6245g;
        canvas.drawLine(f8, f10, min3, f10, paint2);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f8 + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f8, f10, f8, Math.max(f12, f14), paint2);
    }

    public final void d(Canvas canvas, float f8, float f10) {
        Rect rect;
        float[] fArr = this.f6239a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[fArr.length - 2];
        float f14 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f11 - f13, f12 - f14);
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float f17 = (((f10 - f12) * f16) + ((f8 - f11) * f15)) / (hypot * hypot);
        float f18 = (f15 * f17) + f11;
        float f19 = (f17 * f16) + f12;
        Path path = new Path();
        path.moveTo(f8, f10);
        path.lineTo(f18, f19);
        float hypot2 = (float) Math.hypot(f18 - f8, f19 - f10);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f6246h;
        paint.getTextBounds(str, 0, length, this.f6250l);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f8, f10, f18, f19, this.f6245g);
    }

    public final void e(Canvas canvas, float f8, float f10, int i2, int i10) {
        StringBuilder sb2 = new StringBuilder("");
        MotionLayout motionLayout = this.f6251n;
        sb2.append(((int) ((((f8 - (i2 / 2)) * 100.0f) / (motionLayout.getWidth() - i2)) + 0.5d)) / 100.0f);
        String sb3 = sb2.toString();
        int length = sb3.length();
        Paint paint = this.f6246h;
        Rect rect = this.f6250l;
        paint.getTextBounds(sb3, 0, length, rect);
        canvas.drawText(sb3, ((f8 / 2.0f) - (rect.width() / 2)) + 0.0f, f10 - 20.0f, paint);
        float min = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f6245g;
        canvas.drawLine(f8, f10, min, f10, paint2);
        String str = "" + (((int) ((((f10 - (i10 / 2)) * 100.0f) / (motionLayout.getHeight() - i10)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f8 + 5.0f, 0.0f - ((f10 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f8, f10, f8, Math.max(0.0f, 1.0f), paint2);
    }
}
