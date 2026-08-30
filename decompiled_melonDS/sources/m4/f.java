package m4;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f9205a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f9206b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9207c;

    /* renamed from: d  reason: collision with root package name */
    public float f9208d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public float f9209e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    public BoringLayout.Metrics f9210f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9211g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f9212h;

    public f(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f9205a = charSequence;
        this.f9206b = textPaint;
        this.f9207c = i2;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metrics;
        if (!this.f9211g) {
            TextDirectionHeuristic b10 = l.b(this.f9207c);
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f9205a;
            TextPaint textPaint = this.f9206b;
            if (i2 >= 33) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, b10, true, null);
            } else if (!b10.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            } else {
                metrics = null;
            }
            this.f9210f = metrics;
            this.f9211g = true;
        }
        return this.f9210f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f9212h;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f9205a;
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence2;
                if (aj.g.G(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence2);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence2 = spannableString;
                        }
                    }
                }
            }
            this.f9212h = charSequence2;
            return charSequence2;
        }
        charSequence.getClass();
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (aj.g.G(r2, o4.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r3.getLetterSpacing() == 0.0f) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f9208d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f9208d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f9206b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f9205a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<o4.f> r4 = o4.f.class
            boolean r4 = aj.g.G(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<o4.e> r4 = o4.e.class
            boolean r2 = aj.g.G(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f9208d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f.c():float");
    }
}
