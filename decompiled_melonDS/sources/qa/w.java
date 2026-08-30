package qa;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends a6.b {
    public final TextInputLayout R;

    public w(TextInputLayout textInputLayout) {
        this.R = textInputLayout;
    }

    @Override // a6.b
    public final void d(View view, b6.g gVar) {
        CharSequence charSequence;
        boolean z10;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.R;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z11 = textInputLayout.f3133p1;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        u uVar = textInputLayout.B;
        z0 z0Var = uVar.B;
        if (z0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z0Var);
            accessibilityNodeInfo.setTraversalAfter(z0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.R);
        }
        if (!isEmpty) {
            gVar.m(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            gVar.m(str);
            if (!z11 && placeholderText != null) {
                gVar.m(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                if (i2 >= 26) {
                    accessibilityNodeInfo.setHintText(str);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                }
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                gVar.m(str);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                gVar.h(4, isEmpty);
            }
        }
        accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
        if (z10) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        z0 z0Var2 = textInputLayout.f3117h0.f12489y;
        if (z0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(z0Var2);
        }
        textInputLayout.L.b().m(gVar);
    }

    @Override // a6.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.R.L.b().n(accessibilityEvent);
    }
}
