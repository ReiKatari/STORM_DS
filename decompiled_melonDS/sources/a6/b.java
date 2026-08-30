package a6;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b {
    public static final View.AccessibilityDelegate L = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A;
    public final a B;

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.A = accessibilityDelegate;
        this.B = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a0.b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a0.b(11, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, b6.g gVar) {
        this.A.onInitializeAccessibilityNodeInfo(view, gVar.f2077a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i2, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i10 >= list.size()) {
                break;
            }
            b6.d dVar = (b6.d) list.get(i10);
            if (dVar.a() == i2) {
                Class cls = dVar.f2071c;
                b6.q qVar = dVar.f2072d;
                if (qVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    z10 = qVar.c(view);
                }
            } else {
                i10++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = this.A.performAccessibilityAction(view, i2, bundle);
        }
        if (!z10 && i2 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i12 = 0;
                while (true) {
                    if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        z11 = true;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            return z11;
        }
        return z10;
    }

    public void h(View view, int i2) {
        this.A.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.A.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b() {
        this(L);
    }
}
