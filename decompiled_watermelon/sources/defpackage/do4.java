package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do4  reason: default package */
/* loaded from: classes.dex */
public final class do4 extends ReplacementSpan {
    public final float A;
    public final int B;
    public final float L;
    public final int R;
    public final float X;
    public final float Y;
    public final int Z;
    public Paint.FontMetricsInt c0;
    public int d0;
    public int e0;
    public boolean f0;

    public do4(float f, int i, float f2, int i2, od1 od1Var, int i3) {
        float f3;
        float f4 = RecyclerView.A1;
        if (i == 0) {
            f3 = od1Var.n0(hi2.L(f, 4294967296L));
        } else {
            f3 = 0.0f;
        }
        f4 = i2 == 0 ? od1Var.n0(hi2.L(f2, 4294967296L)) : f4;
        this.A = f;
        this.B = i;
        this.L = f2;
        this.R = i2;
        this.X = f3;
        this.Y = f4;
        this.Z = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.c0;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        b53.g0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f0) {
            nz2.c("PlaceholderSpan is not laid out yet.");
        }
        return this.e0;
    }

    public final int c() {
        if (!this.f0) {
            nz2.c("PlaceholderSpan is not laid out yet.");
        }
        return this.d0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.f0 = true;
        float textSize = paint.getTextSize();
        this.c0 = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            nz2.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.B;
        if (i3 != 0) {
            if (i3 == 1) {
                f = this.A * textSize;
            } else {
                nz2.b("Unsupported unit.");
                f81.c();
                return 0;
            }
        } else {
            f = this.X;
        }
        this.d0 = (int) Math.ceil(f);
        int i4 = this.R;
        if (i4 != 0) {
            if (i4 == 1) {
                f2 = this.L * textSize;
            } else {
                nz2.b("Unsupported unit.");
                f81.c();
                return 0;
            }
        } else {
            f2 = this.Y;
        }
        this.e0 = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.Z) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case ig7.b /* 6 */:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b;
                        fontMetricsInt.descent = b() + b;
                        break;
                    }
                    break;
                default:
                    nz2.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
