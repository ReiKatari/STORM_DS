package a6;

import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ TextClassification.Request.Builder g(CharSequence charSequence, int i2, int i10) {
        return new TextClassification.Request.Builder(charSequence, i2, i10);
    }

    public static /* synthetic */ TextClassificationContext.Builder j(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ TextSelection.Request.Builder n(CharSequence charSequence, int i2, int i10) {
        return new TextSelection.Request.Builder(charSequence, i2, i10);
    }

    public static /* synthetic */ void r() {
    }
}
