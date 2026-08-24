package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b2  reason: default package */
/* loaded from: classes.dex */
public class b2 {
    public static final View.AccessibilityDelegate L = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A;
    public final a2 B;

    public b2(View.AccessibilityDelegate accessibilityDelegate) {
        this.A = accessibilityDelegate;
        this.B = new a2(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public os0 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new os0(accessibilityNodeProvider, 4);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, v2 v2Var) {
        this.A.onInitializeAccessibilityNodeInfo(view, v2Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            p2 p2Var = (p2) list.get(i2);
            if (p2Var.a() == i) {
                Class cls = p2Var.c;
                f3 f3Var = p2Var.d;
                if (f3Var != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = f3Var.c(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.A.performAccessibilityAction(view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i4 = 0;
                while (true) {
                    if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i4])) {
                        clickableSpan.onClick(view);
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            return z2;
        }
        return z;
    }

    public void h(View view, int i) {
        this.A.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.A.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b2() {
        this(L);
    }
}
