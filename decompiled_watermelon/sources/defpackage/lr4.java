package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.textclassifier.TextClassificationContext;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lr4 {
    public static /* synthetic */ PrecomputedText.Params.Builder b(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ TextClassificationContext.Builder e(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ boolean q(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
