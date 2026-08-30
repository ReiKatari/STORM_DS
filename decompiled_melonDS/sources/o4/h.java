package o4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public final float A;
    public final int B;
    public final boolean L;
    public final boolean R;
    public final float X;
    public final int Y;
    public int Z = Integer.MIN_VALUE;

    /* renamed from: b0  reason: collision with root package name */
    public int f10833b0 = Integer.MIN_VALUE;

    /* renamed from: c0  reason: collision with root package name */
    public int f10834c0 = Integer.MIN_VALUE;

    /* renamed from: d0  reason: collision with root package name */
    public int f10835d0 = Integer.MIN_VALUE;

    /* renamed from: e0  reason: collision with root package name */
    public int f10836e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f10837f0;

    public h(float f8, int i2, boolean z10, boolean z11, float f10, int i10) {
        this.A = f8;
        this.B = i2;
        this.L = z10;
        this.R = z11;
        this.X = f10;
        this.Y = i10;
        if ((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
            return;
        }
        r4.a.c("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        double ceil;
        int min;
        int max;
        int i15 = fontMetricsInt.descent;
        int i16 = fontMetricsInt.ascent;
        if (i15 - i16 > 0) {
            if (i2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == this.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i17 = this.Y;
            boolean z12 = this.R;
            boolean z13 = this.L;
            if (z10 && z11 && z13 && z12 && i17 != 2) {
                return;
            }
            if (this.Z == Integer.MIN_VALUE) {
                int i18 = i15 - i16;
                int ceil2 = (int) Math.ceil(this.A);
                int i19 = ceil2 - i18;
                if (i17 == 1 && i19 <= 0) {
                    int i20 = fontMetricsInt.ascent;
                    this.f10833b0 = i20;
                    int i21 = fontMetricsInt.descent;
                    this.f10834c0 = i21;
                    this.Z = i20;
                    this.f10835d0 = i21;
                    this.f10836e0 = 0;
                    this.f10837f0 = 0;
                } else {
                    float f8 = this.X;
                    if (f8 == -1.0f) {
                        f8 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i19 <= 0) {
                        ceil = Math.ceil(i19 * f8);
                    } else {
                        ceil = Math.ceil((1.0f - f8) * i19);
                    }
                    int i22 = (int) ceil;
                    int i23 = fontMetricsInt.descent;
                    int i24 = i22 + i23;
                    this.f10834c0 = i24;
                    int i25 = i24 - ceil2;
                    this.f10833b0 = i25;
                    if (i17 == 0 || i19 >= 0) {
                        if (z13) {
                            i25 = fontMetricsInt.ascent;
                        }
                        this.Z = i25;
                        if (z12) {
                            i24 = i23;
                        }
                        this.f10835d0 = i24;
                        this.f10836e0 = fontMetricsInt.ascent - i25;
                        this.f10837f0 = i24 - i23;
                    } else if (i17 == 2) {
                        int i26 = fontMetricsInt.ascent;
                        if (z13) {
                            min = Math.max(i26, i25);
                        } else {
                            min = Math.min(i26, i25);
                        }
                        this.Z = min;
                        int i27 = fontMetricsInt.descent;
                        int i28 = this.f10834c0;
                        if (z12) {
                            max = Math.min(i27, i28);
                        } else {
                            max = Math.max(i27, i28);
                        }
                        this.f10835d0 = max;
                        this.f10836e0 = 0;
                        this.f10837f0 = 0;
                    }
                }
            }
            if (z10) {
                i13 = this.Z;
            } else {
                i13 = this.f10833b0;
            }
            fontMetricsInt.ascent = i13;
            if (z11) {
                i14 = this.f10835d0;
            } else {
                i14 = this.f10834c0;
            }
            fontMetricsInt.descent = i14;
        }
    }
}
