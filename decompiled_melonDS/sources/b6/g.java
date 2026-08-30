package b6;

import a5.z;
import a6.g0;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static int f2076d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f2077a;

    /* renamed from: b  reason: collision with root package name */
    public int f2078b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2079c = -1;

    public g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2077a = accessibilityNodeInfo;
    }

    public static String d(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i2) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i2) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i2) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void a(int i2) {
        this.f2077a.addAction(i2);
    }

    public final void b(d dVar) {
        this.f2077a.addAction((AccessibilityNodeInfo.AccessibilityAction) dVar.f2069a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2077a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean e(int i2) {
        Bundle extras = this.f2077a.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) != i2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f2077a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.f2079c == gVar.f2079c && this.f2078b == gVar.f2078b) {
            return true;
        }
        return false;
    }

    public final void f(Rect rect) {
        this.f2077a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean isEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2077a;
        if (!isEmpty) {
            ArrayList c4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i2 = 0; i2 < c4.size(); i2++) {
                spannableString.setSpan(new a(((Integer) c12.get(i2)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c4.get(i2)).intValue(), ((Integer) c10.get(i2)).intValue(), ((Integer) c11.get(i2)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(int i2, boolean z10) {
        Bundle extras = this.f2077a.getExtras();
        if (extras != null) {
            int i10 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z10) {
                i2 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i10);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2077a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f2077a.setClassName(charSequence);
    }

    public final void j(d0.d dVar) {
        this.f2077a.setCollectionInfo(null);
    }

    public final void k(f fVar) {
        this.f2077a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) fVar.f2075b);
    }

    public final void l(boolean z10) {
        this.f2077a.setScrollable(z10);
    }

    public final void m(CharSequence charSequence) {
        this.f2077a.setText(charSequence);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String string;
        int i2;
        String str;
        boolean z10;
        int i10;
        CharSequence charSequence4;
        boolean e6;
        boolean e10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2077a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            g0.d(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(g());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        if (i11 >= 30) {
            charSequence = a6.l.e(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb2.append(charSequence);
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; supplementalDescription: ");
        if (i11 >= 36) {
            charSequence2 = e.c(accessibilityNodeInfo);
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        }
        sb2.append(charSequence2);
        sb2.append("; tooltipText: ");
        if (i11 >= 28) {
            charSequence3 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb2.append(charSequence3);
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (i11 >= 33) {
            string = z.e(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        if (i11 >= 36) {
            i2 = e.a(accessibilityNodeInfo);
        } else {
            i2 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        }
        String str2 = "PARTIAL";
        if (i2 == 1) {
            str = "TRUE";
        } else if (i2 == 2) {
            str = "PARTIAL";
        } else {
            str = "FALSE";
        }
        sb2.append(str);
        sb2.append("; fieldRequired: ");
        if (i11 >= 36) {
            z10 = e.d(accessibilityNodeInfo);
        } else {
            z10 = accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        }
        sb2.append(z10);
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; expandedState: ");
        if (i11 >= 36) {
            i10 = e.b(accessibilityNodeInfo);
        } else {
            i10 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        str2 = "UNKNOWN";
                    } else {
                        str2 = "FULL";
                    }
                }
            } else {
                str2 = "COLLAPSED";
            }
        } else {
            str2 = "UNDEFINED";
        }
        sb2.append(str2);
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        if (i11 >= 34) {
            charSequence4 = g0.e(accessibilityNodeInfo);
        } else {
            charSequence4 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb2.append(charSequence4);
        sb2.append("; granularScrollingSupported: ");
        sb2.append(e(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        if (i11 >= 33) {
            e6 = z.f(accessibilityNodeInfo);
        } else {
            e6 = e(8388608);
        }
        sb2.append(e6);
        sb2.append("; accessibilityDataSensitive: ");
        if (i11 >= 34) {
            e10 = g0.j(accessibilityNodeInfo);
        } else {
            e10 = e(64);
        }
        sb2.append(e10);
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new d(actionList.get(i12), 0, null, null, null));
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            d dVar = (d) arrayList.get(i13);
            int a10 = dVar.a();
            Object obj = dVar.f2069a;
            String d4 = d(a10);
            if (d4.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d4 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb2.append(d4);
            if (i13 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
