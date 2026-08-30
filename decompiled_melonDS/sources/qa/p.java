package qa;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f12465a;

    public p(q qVar) {
        this.f12465a = qVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f12465a.f12473h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
