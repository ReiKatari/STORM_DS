package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n2  reason: default package */
/* loaded from: classes.dex */
public final class n2 {
    public static final n2 e;
    public static final n2 f;
    public static final n2 g;
    public static final n2 h;
    public static final n2 i;
    public static final n2 j;
    public static final n2 k;
    public static final n2 l;
    public static final n2 m;
    public static final n2 n;
    public static final n2 o;
    public static final n2 p;
    public static final n2 q;
    public static final n2 r;
    public final Object a;
    public final int b;
    public final Class c;
    public final d3 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        int i2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24 = null;
        new n2(1, (String) null);
        new n2(2, (String) null);
        new n2(4, (String) null);
        new n2(8, (String) null);
        e = new n2(16, (String) null);
        new n2(32, (String) null);
        f = new n2(64, (String) null);
        g = new n2(128, (String) null);
        new n2(256, w2.class);
        new n2(512, w2.class);
        new n2(1024, x2.class);
        new n2(2048, x2.class);
        h = new n2(4096, (String) null);
        i = new n2(8192, (String) null);
        new n2(16384, (String) null);
        new n2(32768, (String) null);
        new n2(65536, (String) null);
        new n2(131072, b3.class);
        j = new n2(262144, (String) null);
        k = new n2(524288, (String) null);
        l = new n2(1048576, (String) null);
        new n2(2097152, c3.class);
        new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        m = new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, z2.class);
        n = new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        o = new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        p = new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        q = new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction23;
        } else {
            accessibilityAction = null;
        }
        new n2(accessibilityAction, 16908358, null, null, null);
        if (i3 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction22;
        } else {
            accessibilityAction2 = null;
        }
        new n2(accessibilityAction2, 16908359, null, null, null);
        if (i3 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new n2(accessibilityAction3, 16908360, null, null, null);
        if (i3 >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction21;
        } else {
            accessibilityAction4 = null;
        }
        new n2(accessibilityAction4, 16908361, null, null, null);
        new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new n2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, a3.class);
        if (i3 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new n2(accessibilityAction5, 16908354, null, null, y2.class);
        if (i3 >= 28) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction20;
        } else {
            accessibilityAction6 = null;
        }
        new n2(accessibilityAction6, 16908356, null, null, null);
        if (i3 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction19;
        } else {
            accessibilityAction7 = null;
        }
        new n2(accessibilityAction7, 16908357, null, null, null);
        if (i3 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new n2(accessibilityAction8, 16908362, null, null, null);
        if (i3 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction18;
        } else {
            accessibilityAction9 = null;
        }
        new n2(accessibilityAction9, 16908372, null, null, null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new n2(accessibilityAction10, 16908373, null, null, null);
        if (i3 >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction11 = accessibilityAction17;
        } else {
            accessibilityAction11 = null;
        }
        new n2(accessibilityAction11, 16908374, null, null, null);
        if (i3 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction16;
        } else {
            accessibilityAction12 = null;
        }
        new n2(accessibilityAction12, 16908375, null, null, null);
        if (i3 >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction13 = accessibilityAction15;
        } else {
            accessibilityAction13 = null;
        }
        new n2(accessibilityAction13, 16908376, null, null, null);
        if (i3 >= 34) {
            accessibilityAction14 = a2.b();
        } else {
            accessibilityAction14 = null;
        }
        r = new n2(accessibilityAction14, 16908382, null, null, null);
        int i4 = v60.a;
        if (i3 >= 36) {
            if (i3 >= 36) {
                i2 = Build.VERSION.SDK_INT_FULL;
            } else {
                i2 = i3 * 100000;
            }
            if (i2 >= 3600001) {
                accessibilityAction24 = r2.a();
            }
        }
        new n2(accessibilityAction24, 16908383, null, null, null);
    }

    public n2(Object obj, int i2, CharSequence charSequence, d3 d3Var, Class cls) {
        this.b = i2;
        this.d = d3Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n2)) {
            return false;
        }
        Object obj2 = ((n2) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = t2.d(this.b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public n2(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public n2(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
