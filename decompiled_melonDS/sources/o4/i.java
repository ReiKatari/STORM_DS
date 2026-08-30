package o4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public final float A;
    public final int B;
    public final float L;
    public final int R;
    public final float X;
    public final float Y;
    public final int Z;

    /* renamed from: b0  reason: collision with root package name */
    public Paint.FontMetricsInt f10838b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f10839c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f10840d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f10841e0;

    public i(float f8, int i2, float f10, int i10, x4.c cVar, int i11) {
        float f11;
        if (i2 == 0) {
            f11 = cVar.c0(t.C(4294967296L, f8));
        } else {
            f11 = 0.0f;
        }
        float c02 = i10 == 0 ? cVar.c0(t.C(4294967296L, f10)) : 0.0f;
        this.A = f8;
        this.B = i2;
        this.L = f10;
        this.R = i10;
        this.X = f11;
        this.Y = c02;
        this.Z = i11;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f10838b0;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        nc.k.f("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f10841e0) {
            r4.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f10840d0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float f8;
        float f10;
        this.f10841e0 = true;
        float textSize = paint.getTextSize();
        this.f10838b0 = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            r4.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i11 = this.B;
        if (i11 != 0) {
            if (i11 == 1) {
                f8 = this.A * textSize;
            } else {
                r4.a.b("Unsupported unit.");
                wa.b.a();
                return 0;
            }
        } else {
            f8 = this.X;
        }
        this.f10839c0 = (int) Math.ceil(f8);
        int i12 = this.R;
        if (i12 != 0) {
            if (i12 == 1) {
                f10 = this.L * textSize;
            } else {
                r4.a.b("Unsupported unit.");
                wa.b.a();
                return 0;
            }
        } else {
            f10 = this.Y;
        }
        this.f10840d0 = (int) Math.ceil(f10);
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
                case DSiCameraSource.FrontCamera /* 1 */:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case l1.c.f8511g /* 5 */:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case l1.c.f8509e /* 6 */:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b10;
                        fontMetricsInt.descent = b() + b10;
                        break;
                    }
                    break;
                default:
                    r4.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f10841e0) {
            r4.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f10839c0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i10, float f8, int i11, int i12, int i13, Paint paint) {
    }
}
