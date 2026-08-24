package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.textclassifier.TextClassificationContext;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o05  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o05 {
    public static /* synthetic */ PrecomputedText.Params.Builder b(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ TextClassificationContext.Builder e(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ boolean r(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
