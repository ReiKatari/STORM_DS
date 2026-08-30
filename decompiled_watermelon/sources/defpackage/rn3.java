package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rn3  reason: default package */
/* loaded from: classes.dex */
public final class rn3 implements LineHeightSpan {
    public final float A;

    public rn3(float f) {
        this.A = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.A);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / i5));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
