package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l37  reason: default package */
/* loaded from: classes.dex */
public final class l37 extends b2 {
    public final TextInputLayout R;

    public l37(TextInputLayout textInputLayout) {
        this.R = textInputLayout;
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        CharSequence charSequence;
        boolean z;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
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
        boolean z2 = textInputLayout.r1;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z = false;
        } else {
            z = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        fp6 fp6Var = textInputLayout.B;
        qs qsVar = fp6Var.B;
        if (qsVar.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(qsVar);
            accessibilityNodeInfo.setTraversalAfter(qsVar);
        } else {
            accessibilityNodeInfo.setTraversalAfter(fp6Var.R);
        }
        if (!isEmpty) {
            v2Var.m(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            v2Var.m(str);
            if (!z2 && placeholderText != null) {
                v2Var.m(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            v2Var.m(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                if (i >= 26) {
                    accessibilityNodeInfo.setHintText(str);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                }
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                v2Var.m(str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                v2Var.h(4, isEmpty);
            }
        }
        accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
        if (z) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        qs qsVar2 = textInputLayout.j0.y;
        if (qsVar2 != null) {
            accessibilityNodeInfo.setLabelFor(qsVar2);
        }
        textInputLayout.L.b().m(v2Var);
    }

    @Override // defpackage.b2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.R.L.b().n(accessibilityEvent);
    }
}
