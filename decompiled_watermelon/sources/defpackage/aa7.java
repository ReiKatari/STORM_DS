package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aa7  reason: default package */
/* loaded from: classes.dex */
public abstract class aa7 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final n97 e = new Object();
    public static final p97 f = new p97();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static hb7 b(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        hb7 hb7Var = (hb7) a.get(view);
        if (hb7Var == null) {
            hb7 hb7Var2 = new hb7(view);
            a.put(view, hb7Var2);
            return hb7Var2;
        }
        return hb7Var;
    }

    public static void c(View view, vf7 vf7Var) {
        WindowInsets a2;
        WindowInsets f2 = vf7Var.f();
        if (f2 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a2 = x97.a(view, f2);
            } else {
                a2 = q97.a(view, f2);
            }
            if (!a2.equals(f2)) {
                vf7.g(view, a2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [z97, java.lang.Object] */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = z97.d;
            z97 z97Var = (z97) view.getTag(R.id.tag_unhandled_key_event_manager);
            z97 z97Var2 = z97Var;
            if (z97Var == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                z97Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = z97Var2.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = z97.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (z97Var2.a == null) {
                                z97Var2.a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = z97.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    z97Var2.a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        z97Var2.a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a2 = z97Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (z97Var2.b == null) {
                        z97Var2.b = new SparseArray();
                    }
                    z97Var2.b.put(keyCode, new WeakReference(a2));
                }
            }
            if (a2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return w97.a(view);
        }
        if (!c) {
            if (b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    c = true;
                    return null;
                }
            }
            try {
                Object obj = b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                c = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = v97.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] h(xq xqVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y97.a(xqVar);
        }
        return (String[]) xqVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (f(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(f(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z) {
                i2 = 2048;
            }
            obtain2.setEventType(i2);
            obtain2.setContentChangeTypes(i);
            if (z) {
                obtain2.getText().add(f(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static o01 j(View view, o01 o01Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + o01Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return y97.b(view, o01Var);
        }
        ls6 ls6Var = (ls6) view.getTag(R.id.tag_on_receive_content_listener);
        uc4 uc4Var = e;
        if (ls6Var != null) {
            o01 a2 = ls6.a(view, o01Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof uc4) {
                uc4Var = (uc4) view;
            }
            return uc4Var.a(a2);
        }
        if (view instanceof uc4) {
            uc4Var = (uc4) view;
        }
        return uc4Var.a(o01Var);
    }

    public static void k(View view, int i) {
        ArrayList g = g(view);
        for (int i2 = 0; i2 < g.size(); i2++) {
            if (((n2) g.get(i2)).a() == i) {
                g.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, n2 n2Var, d3 d3Var) {
        z1 z1Var;
        n2 n2Var2 = new n2(null, n2Var.b, null, d3Var, n2Var.c);
        View.AccessibilityDelegate e2 = e(view);
        if (e2 == null) {
            z1Var = null;
        } else if (e2 instanceof y1) {
            z1Var = ((y1) e2).a;
        } else {
            z1Var = new z1(e2);
        }
        if (z1Var == null) {
            z1Var = new z1();
        }
        n(view, z1Var);
        k(view, n2Var2.a());
        g(view).add(n2Var2);
        i(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            w97.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, z1 z1Var) {
        y1 y1Var;
        if (z1Var == null && (e(view) instanceof y1)) {
            z1Var = new z1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (z1Var == null) {
            y1Var = null;
        } else {
            y1Var = z1Var.B;
        }
        view.setAccessibilityDelegate(y1Var);
    }

    public static void o(View view, CharSequence charSequence) {
        boolean z;
        new o97(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        p97 p97Var = f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = p97Var.A;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(p97Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(p97Var);
                return;
            }
            return;
        }
        p97Var.A.remove(view);
        view.removeOnAttachStateChangeListener(p97Var);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(p97Var);
    }

    public static void p(View view, yv4 yv4Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        we7 we7Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (yv4Var != null) {
                we7Var = new we7(yv4Var);
            }
            view.setWindowInsetsAnimationCallback(we7Var);
            return;
        }
        PathInterpolator pathInterpolator = ue7.e;
        if (yv4Var != null) {
            onApplyWindowInsetsListener = new te7(view, yv4Var);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
