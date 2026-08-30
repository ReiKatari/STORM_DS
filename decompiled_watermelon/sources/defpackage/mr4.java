package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mr4  reason: default package */
/* loaded from: classes.dex */
public final class mr4 {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public mr4(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = lr4.b(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mr4) {
                mr4 mr4Var = (mr4) obj;
                int i = mr4Var.c;
                TextPaint textPaint = mr4Var.a;
                if (this.c == i && this.d == mr4Var.d) {
                    TextPaint textPaint2 = this.a;
                    if (textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
                        if (textPaint2.getTypeface() == null) {
                            if (textPaint.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
                            return false;
                        }
                        if (this.b == mr4Var.b) {
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
        TextPaint textPaint = this.a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public mr4(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.a = textPaint;
        textDirection = params.getTextDirection();
        this.b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.d = hyphenationFrequency;
    }
}
