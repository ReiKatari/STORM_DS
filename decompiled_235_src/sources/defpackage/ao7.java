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
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao7  reason: default package */
/* loaded from: classes.dex */
public abstract class ao7 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final nn7 e = new Object();
    public static final pn7 f = new pn7();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static ip7 b(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        ip7 ip7Var = (ip7) a.get(view);
        if (ip7Var == null) {
            ip7 ip7Var2 = new ip7(view);
            a.put(view, ip7Var2);
            return ip7Var2;
        }
        return ip7Var;
    }

    public static void c(View view, vu7 vu7Var) {
        WindowInsets a2;
        WindowInsets f2 = vu7Var.f();
        if (f2 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a2 = xn7.a(view, f2);
            } else {
                a2 = qn7.a(view, f2);
            }
            if (!a2.equals(f2)) {
                vu7.g(view, a2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [zn7, java.lang.Object] */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = zn7.d;
            zn7 zn7Var = (zn7) view.getTag(R.id.tag_unhandled_key_event_manager);
            zn7 zn7Var2 = zn7Var;
            if (zn7Var == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                zn7Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = zn7Var2.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = zn7.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (zn7Var2.a == null) {
                                zn7Var2.a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = zn7.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    zn7Var2.a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        zn7Var2.a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a2 = zn7Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (zn7Var2.b == null) {
                        zn7Var2.b = new SparseArray();
                    }
                    zn7Var2.b.put(keyCode, new WeakReference(a2));
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
            return wn7.a(view);
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
            tag = vn7.a(view);
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

    public static String[] h(kr krVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return yn7.a(krVar);
        }
        return (String[]) krVar.getTag(R.id.tag_on_receive_content_mime_types);
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

    public static t31 j(View view, t31 t31Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + t31Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return yn7.b(view, t31Var);
        }
        a57 a57Var = (a57) view.getTag(R.id.tag_on_receive_content_listener);
        tl4 tl4Var = e;
        if (a57Var != null) {
            t31 a2 = a57.a(view, t31Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof tl4) {
                tl4Var = (tl4) view;
            }
            return tl4Var.a(a2);
        }
        if (view instanceof tl4) {
            tl4Var = (tl4) view;
        }
        return tl4Var.a(t31Var);
    }

    public static void k(View view, int i) {
        ArrayList g = g(view);
        for (int i2 = 0; i2 < g.size(); i2++) {
            if (((p2) g.get(i2)).a() == i) {
                g.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, p2 p2Var, f3 f3Var) {
        b2 b2Var;
        p2 p2Var2 = new p2(null, p2Var.b, null, f3Var, p2Var.c);
        View.AccessibilityDelegate e2 = e(view);
        if (e2 == null) {
            b2Var = null;
        } else if (e2 instanceof a2) {
            b2Var = ((a2) e2).a;
        } else {
            b2Var = new b2(e2);
        }
        if (b2Var == null) {
            b2Var = new b2();
        }
        n(view, b2Var);
        k(view, p2Var2.a());
        g(view).add(p2Var2);
        i(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            wn7.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, b2 b2Var) {
        a2 a2Var;
        if (b2Var == null && (e(view) instanceof a2)) {
            b2Var = new b2();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (b2Var == null) {
            a2Var = null;
        } else {
            a2Var = b2Var.B;
        }
        view.setAccessibilityDelegate(a2Var);
    }

    public static void o(View view, CharSequence charSequence) {
        boolean z;
        new on7(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        pn7 pn7Var = f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = pn7Var.A;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(pn7Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(pn7Var);
                return;
            }
            return;
        }
        pn7Var.A.remove(view);
        view.removeOnAttachStateChangeListener(pn7Var);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(pn7Var);
    }

    public static void p(View view, f55 f55Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        xt7 xt7Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (f55Var != null) {
                xt7Var = new xt7(f55Var);
            }
            view.setWindowInsetsAnimationCallback(xt7Var);
            return;
        }
        PathInterpolator pathInterpolator = wt7.e;
        if (f55Var != null) {
            onApplyWindowInsetsListener = new vt7(view, f55Var);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
