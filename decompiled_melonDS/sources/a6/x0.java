package a6;

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
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f533a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f534b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f535c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f536d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f537e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final l0 f538f = new l0();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static f1 b(View view) {
        if (f533a == null) {
            f533a = new WeakHashMap();
        }
        f1 f1Var = (f1) f533a.get(view);
        if (f1Var == null) {
            f1 f1Var2 = new f1(view);
            f533a.put(view, f1Var2);
            return f1Var2;
        }
        return f1Var;
    }

    public static void c(View view, i2 i2Var) {
        WindowInsets a10;
        WindowInsets f8 = i2Var.f();
        if (f8 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a10 = u0.a(view, f8);
            } else {
                a10 = n0.a(view, f8);
            }
            if (!a10.equals(f8)) {
                i2.g(view, a10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [a6.w0, java.lang.Object] */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = w0.f519d;
            w0 w0Var = (w0) view.getTag(R.id.tag_unhandled_key_event_manager);
            w0 w0Var2 = w0Var;
            if (w0Var == null) {
                ?? obj = new Object();
                obj.f520a = null;
                obj.f521b = null;
                obj.f522c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                w0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = w0Var2.f520a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = w0.f519d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (w0Var2.f520a == null) {
                                w0Var2.f520a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = w0.f519d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    w0Var2.f520a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        w0Var2.f520a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a10 = w0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (w0Var2.f521b == null) {
                        w0Var2.f521b = new SparseArray();
                    }
                    w0Var2.f521b.put(keyCode, new WeakReference(a10));
                }
            }
            if (a10 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return t0.a(view);
        }
        if (!f535c) {
            if (f534b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f534b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f535c = true;
                    return null;
                }
            }
            try {
                Object obj = f534b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f535c = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = s0.a(view);
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

    public static String[] h(q.t tVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return v0.a(tVar);
        }
        return (String[]) tVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(View view, int i2) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (f(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z10) {
                if (i2 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i2);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(f(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z10) {
                i10 = 2048;
            }
            obtain2.setEventType(i10);
            obtain2.setContentChangeTypes(i2);
            if (z10) {
                obtain2.getText().add(f(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
        if (r3 == 9) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(android.view.View r5, int r6) {
        /*
            r0 = -1
            if (r6 != r0) goto L5
        L3:
            r3 = r0
            goto L3f
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L16
            switch(r6) {
                case 21: goto L15;
                case 22: goto L13;
                case 23: goto L15;
                case 24: goto L13;
                case 25: goto L11;
                case 26: goto L15;
                case 27: goto L13;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r6 = r4
            goto L16
        L13:
            r6 = 4
            goto L16
        L15:
            r6 = r3
        L16:
            r2 = 30
            if (r1 >= r2) goto L2f
            r2 = 12
            if (r6 == r2) goto L2d
            r2 = 13
            if (r6 == r2) goto L30
            r2 = 16
            if (r6 == r2) goto L2d
            r2 = 17
            if (r6 == r2) goto L2b
            goto L2f
        L2b:
            r3 = r4
            goto L30
        L2d:
            r3 = 1
            goto L30
        L2f:
            r3 = r6
        L30:
            r6 = 27
            if (r1 >= r6) goto L3f
            r6 = 7
            if (r3 == r6) goto L3
            r6 = 8
            if (r3 == r6) goto L3
            r6 = 9
            if (r3 == r6) goto L3
        L3f:
            if (r3 != r0) goto L42
            return
        L42:
            r5.performHapticFeedback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.x0.j(android.view.View, int):void");
    }

    public static g k(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return v0.b(view, gVar);
        }
        f6.i iVar = (f6.i) view.getTag(R.id.tag_on_receive_content_listener);
        w wVar = f537e;
        if (iVar != null) {
            g a10 = f6.i.a(view, gVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof w) {
                wVar = (w) view;
            }
            return wVar.a(a10);
        }
        if (view instanceof w) {
            wVar = (w) view;
        }
        return wVar.a(gVar);
    }

    public static void l(View view, int i2) {
        ArrayList g10 = g(view);
        for (int i10 = 0; i10 < g10.size(); i10++) {
            if (((b6.d) g10.get(i10)).a() == i2) {
                g10.remove(i10);
                return;
            }
        }
    }

    public static void m(View view, b6.d dVar, b6.q qVar) {
        b bVar;
        b6.d dVar2 = new b6.d(null, dVar.f2070b, null, qVar, dVar.f2071c);
        View.AccessibilityDelegate e6 = e(view);
        if (e6 == null) {
            bVar = null;
        } else if (e6 instanceof a) {
            bVar = ((a) e6).f440a;
        } else {
            bVar = new b(e6);
        }
        if (bVar == null) {
            bVar = new b();
        }
        o(view, bVar);
        l(view, dVar2.a());
        g(view).add(dVar2);
        i(view, 0);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            t0.b(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void o(View view, b bVar) {
        a aVar;
        if (bVar == null && (e(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.B;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void p(View view, CharSequence charSequence) {
        boolean z10;
        new k0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        l0 l0Var = f538f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = l0Var.A;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(l0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(l0Var);
                return;
            }
            return;
        }
        l0Var.A.remove(view);
        view.removeOnAttachStateChangeListener(l0Var);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(l0Var);
    }

    public static void q(View view, pd.g gVar) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        m1 m1Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (gVar != null) {
                m1Var = new m1(gVar);
            }
            view.setWindowInsetsAnimationCallback(m1Var);
            return;
        }
        PathInterpolator pathInterpolator = l1.f483e;
        if (gVar != null) {
            onApplyWindowInsetsListener = new k1(view, gVar);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
