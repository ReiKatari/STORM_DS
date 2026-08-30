package b6;

import a6.g0;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f2056e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f2057f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f2058g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f2059h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f2060i;

    /* renamed from: j  reason: collision with root package name */
    public static final d f2061j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f2062k;

    /* renamed from: l  reason: collision with root package name */
    public static final d f2063l;
    public static final d m;

    /* renamed from: n  reason: collision with root package name */
    public static final d f2064n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f2065o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f2066p;

    /* renamed from: q  reason: collision with root package name */
    public static final d f2067q;

    /* renamed from: r  reason: collision with root package name */
    public static final d f2068r;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2069a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2070b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f2071c;

    /* renamed from: d  reason: collision with root package name */
    public final q f2072d;

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
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        new d(1, (String) null);
        new d(2, (String) null);
        new d(4, (String) null);
        new d(8, (String) null);
        f2056e = new d(16, (String) null);
        new d(32, (String) null);
        f2057f = new d(64, (String) null);
        f2058g = new d(128, (String) null);
        new d(256, j.class);
        new d(512, j.class);
        new d(1024, k.class);
        new d(2048, k.class);
        f2059h = new d(4096, (String) null);
        f2060i = new d(8192, (String) null);
        new d(16384, (String) null);
        new d(32768, (String) null);
        new d(65536, (String) null);
        new d(131072, o.class);
        f2061j = new d(262144, (String) null);
        f2062k = new d(524288, (String) null);
        f2063l = new d(1048576, (String) null);
        new d(2097152, p.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, m.class);
        f2064n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        f2065o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        f2066p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        f2067q = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction21;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, 16908358, null, null, null);
        if (i2 >= 29) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction20;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, 16908359, null, null, null);
        if (i2 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, 16908360, null, null, null);
        if (i2 >= 29) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction19;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, 16908361, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, n.class);
        if (i2 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, 16908354, null, null, l.class);
        if (i2 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction18;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, 16908356, null, null, null);
        if (i2 >= 28) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction17;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, 16908357, null, null, null);
        if (i2 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, 16908362, null, null, null);
        if (i2 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction16;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, 16908372, null, null, null);
        if (i2 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new d(accessibilityAction10, 16908373, null, null, null);
        if (i2 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction11 = accessibilityAction15;
        } else {
            accessibilityAction11 = null;
        }
        new d(accessibilityAction11, 16908374, null, null, null);
        if (i2 >= 32) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction14;
        } else {
            accessibilityAction12 = null;
        }
        new d(accessibilityAction12, 16908375, null, null, null);
        if (i2 >= 33) {
            accessibilityAction13 = c.j();
        } else {
            accessibilityAction13 = null;
        }
        new d(accessibilityAction13, 16908376, null, null, null);
        if (i2 >= 34) {
            accessibilityAction22 = g0.b();
        }
        f2068r = new d(accessibilityAction22, 16908382, null, null, null);
    }

    public d(Object obj, int i2, CharSequence charSequence, q qVar, Class cls) {
        this.f2070b = i2;
        this.f2072d = qVar;
        if (obj == null) {
            this.f2069a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.f2069a = obj;
        }
        this.f2071c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2069a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f2069a;
        Object obj3 = this.f2069a;
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
        Object obj = this.f2069a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d4 = g.d(this.f2070b);
        if (d4.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2069a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d4 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d4);
        return sb2.toString();
    }

    public d(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public d(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
