package a6;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final b f440a;

    public a(b bVar) {
        this.f440a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f440a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        a0.b b10 = this.f440a.b(view);
        if (b10 != null) {
            return (AccessibilityNodeProvider) b10.B;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z10;
        Object tag2;
        Object tag3;
        int i2;
        b6.g gVar = new b6.g(accessibilityNodeInfo);
        WeakHashMap weakHashMap = x0.f533a;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(s0.c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i10 = 0;
        boolean z11 = true;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z10);
        } else {
            gVar.h(1, z10);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(s0.b(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        z11 = (bool2 == null || !bool2.booleanValue()) ? false : false;
        if (i11 >= 28) {
            accessibilityNodeInfo.setHeading(z11);
        } else {
            gVar.h(2, z11);
        }
        CharSequence f8 = x0.f(view);
        if (i11 >= 28) {
            accessibilityNodeInfo.setPaneTitle(f8);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", f8);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = u0.b(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i11 >= 30) {
            l.j(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f440a.d(view, gVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i11 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i14 = 0;
                while (i14 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = i10;
                    while (true) {
                        if (i15 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i2 = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        } else {
                            i2 = b6.g.f2076d;
                            b6.g.f2076d = i2 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i2, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    i14++;
                    i10 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            gVar.b((b6.d) list.get(i16));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f440a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f440a.g(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f440a.h(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.i(view, accessibilityEvent);
    }
}
