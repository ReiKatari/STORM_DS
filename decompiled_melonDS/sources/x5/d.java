package x5;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f14363a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f14364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14365c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14366d;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i10) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = c.a(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i10);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f14363a = textPaint;
        this.f14364b = textDirectionHeuristic;
        this.f14365c = i2;
        this.f14366d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                int i2 = dVar.f14365c;
                TextPaint textPaint = dVar.f14363a;
                if (this.f14365c == i2 && this.f14366d == dVar.f14366d) {
                    TextPaint textPaint2 = this.f14363a;
                    if (textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
                        if (textPaint2.getTypeface() == null) {
                            if (textPaint.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
                            return false;
                        }
                        if (this.f14364b == dVar.f14364b) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f14363a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f14364b, Integer.valueOf(this.f14365c), Integer.valueOf(this.f14366d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f14363a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f14364b);
        sb2.append(", breakStrategy=" + this.f14365c);
        sb2.append(", hyphenationFrequency=" + this.f14366d);
        sb2.append("}");
        return sb2.toString();
    }

    public d(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f14363a = textPaint;
        textDirection = params.getTextDirection();
        this.f14364b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f14365c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f14366d = hyphenationFrequency;
    }
}
