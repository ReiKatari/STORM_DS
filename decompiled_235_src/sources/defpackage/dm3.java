package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm3  reason: default package */
/* loaded from: classes.dex */
public final class dm3 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public BoringLayout.Metrics f;
    public boolean g;
    public CharSequence h;

    public dm3(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metrics;
        if (!this.g) {
            TextDirectionHeuristic b = d47.b(this.c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.b;
            if (i >= 33) {
                metrics = o2.e(charSequence, textPaint, b);
            } else if (!b.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            } else {
                metrics = null;
            }
            this.f = metrics;
            this.g = true;
        }
        return this.f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            CharSequence charSequence2 = this.a;
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence2;
                if (ii2.B(spanned, CharacterStyle.class)) {
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
            this.h = charSequence2;
            return charSequence2;
        }
        charSequence.getClass();
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (defpackage.ii2.B(r2, defpackage.mt3.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r3.getLetterSpacing() == androidx.recyclerview.widget.RecyclerView.B1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        int i;
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics a = a();
        if (a != null) {
            i = a.width;
        } else {
            i = -1;
        }
        float f = i;
        int i2 = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
        TextPaint textPaint = this.b;
        if (i2 < 0) {
            f = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f != RecyclerView.B1) {
            CharSequence charSequence = this.a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!ii2.B(spanned, nt3.class)) {
                }
                f += 0.5f;
            }
        }
        this.d = f;
        return f;
    }
}
