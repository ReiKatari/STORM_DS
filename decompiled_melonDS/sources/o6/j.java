package o6;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {
    public final TransformationMethod A;

    public j(TransformationMethod transformationMethod) {
        this.A = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && m6.i.a().c() == 1) {
            m6.i a10 = m6.i.a();
            a10.getClass();
            return a10.g(0, charSequence.length(), 0, charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i2, rect);
        }
    }
}
