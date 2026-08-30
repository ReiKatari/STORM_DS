package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wq6  reason: default package */
/* loaded from: classes.dex */
public final class wq6 extends z1 {
    public final TextInputLayout R;

    public wq6(TextInputLayout textInputLayout) {
        this.R = textInputLayout;
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        CharSequence charSequence;
        boolean z;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
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
        boolean z2 = textInputLayout.q1;
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
        pd6 pd6Var = textInputLayout.B;
        ds dsVar = pd6Var.B;
        if (dsVar.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(dsVar);
            accessibilityNodeInfo.setTraversalAfter(dsVar);
        } else {
            accessibilityNodeInfo.setTraversalAfter(pd6Var.R);
        }
        if (!isEmpty) {
            t2Var.m(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            t2Var.m(str);
            if (!z2 && placeholderText != null) {
                t2Var.m(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            t2Var.m(placeholderText);
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
                t2Var.m(str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                t2Var.h(4, isEmpty);
            }
        }
        accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
        if (z) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        ds dsVar2 = textInputLayout.i0.y;
        if (dsVar2 != null) {
            accessibilityNodeInfo.setLabelFor(dsVar2);
        }
        textInputLayout.L.b().m(t2Var);
    }

    @Override // defpackage.z1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.R.L.b().n(accessibilityEvent);
    }
}
