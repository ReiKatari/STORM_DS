package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu3  reason: default package */
/* loaded from: classes.dex */
public final class yu3 implements LineHeightSpan {
    public final float A;
    public final int B;
    public final boolean L;
    public final boolean R;
    public final float X;
    public final int Y;
    public int Z = Integer.MIN_VALUE;
    public int d0 = Integer.MIN_VALUE;
    public int e0 = Integer.MIN_VALUE;
    public int f0 = Integer.MIN_VALUE;
    public int g0;
    public int h0;

    public yu3(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.A = f;
        this.B = i;
        this.L = z;
        this.R = z2;
        this.X = f2;
        this.Y = i2;
        if ((RecyclerView.B1 <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        q53.c("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double ceil;
        int min;
        int max;
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 > 0) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 == this.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i9 = this.Y;
            boolean z3 = this.R;
            boolean z4 = this.L;
            if (z && z2 && z4 && z3 && i9 != 2) {
                return;
            }
            if (this.Z == Integer.MIN_VALUE) {
                int i10 = i7 - i8;
                int ceil2 = (int) Math.ceil(this.A);
                int i11 = ceil2 - i10;
                if (i9 == 1 && i11 <= 0) {
                    int i12 = fontMetricsInt.ascent;
                    this.d0 = i12;
                    int i13 = fontMetricsInt.descent;
                    this.e0 = i13;
                    this.Z = i12;
                    this.f0 = i13;
                    this.g0 = 0;
                    this.h0 = 0;
                } else {
                    float f = this.X;
                    if (f == -1.0f) {
                        f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i11 <= 0) {
                        ceil = Math.ceil(i11 * f);
                    } else {
                        ceil = Math.ceil((1.0f - f) * i11);
                    }
                    int i14 = (int) ceil;
                    int i15 = fontMetricsInt.descent;
                    int i16 = i14 + i15;
                    this.e0 = i16;
                    int i17 = i16 - ceil2;
                    this.d0 = i17;
                    if (i9 == 0 || i11 >= 0) {
                        if (z4) {
                            i17 = fontMetricsInt.ascent;
                        }
                        this.Z = i17;
                        if (z3) {
                            i16 = i15;
                        }
                        this.f0 = i16;
                        this.g0 = fontMetricsInt.ascent - i17;
                        this.h0 = i16 - i15;
                    } else if (i9 == 2) {
                        int i18 = fontMetricsInt.ascent;
                        if (z4) {
                            min = Math.max(i18, i17);
                        } else {
                            min = Math.min(i18, i17);
                        }
                        this.Z = min;
                        int i19 = fontMetricsInt.descent;
                        int i20 = this.e0;
                        if (z3) {
                            max = Math.min(i19, i20);
                        } else {
                            max = Math.max(i19, i20);
                        }
                        this.f0 = max;
                        this.g0 = 0;
                        this.h0 = 0;
                    }
                }
            }
            if (z) {
                i5 = this.Z;
            } else {
                i5 = this.d0;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.f0;
            } else {
                i6 = this.e0;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
