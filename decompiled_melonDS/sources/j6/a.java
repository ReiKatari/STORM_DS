package j6;

import a0.j;
import a1.r;
import a6.x0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.preference.Preference;
import b4.y;
import b6.g;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m9.o;
import na.f;
import x8.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends a6.b {

    /* renamed from: h0  reason: collision with root package name */
    public static final Rect f7451h0 = new Rect(Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f7452i0 = new e(28);

    /* renamed from: j0  reason: collision with root package name */
    public static final f f7453j0 = new Object();

    /* renamed from: b0  reason: collision with root package name */
    public final AccessibilityManager f7454b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Chip f7455c0;

    /* renamed from: d0  reason: collision with root package name */
    public y f7456d0;
    public final Rect R = new Rect();
    public final Rect X = new Rect();
    public final Rect Y = new Rect();
    public final int[] Z = new int[2];

    /* renamed from: e0  reason: collision with root package name */
    public int f7457e0 = Integer.MIN_VALUE;

    /* renamed from: f0  reason: collision with root package name */
    public int f7458f0 = Integer.MIN_VALUE;

    /* renamed from: g0  reason: collision with root package name */
    public int f7459g0 = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.f7455c0 = chip;
        this.f7454b0 = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = x0.f533a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // a6.b
    public final a0.b b(View view) {
        if (this.f7456d0 == null) {
            this.f7456d0 = new y(this, 1);
        }
        return this.f7456d0;
    }

    @Override // a6.b
    public final void d(View view, g gVar) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((ca.d) this).f2773k0;
        ca.e eVar = chip.f3013b0;
        if (eVar != null && eVar.T0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.i(chip.getAccessibilityClassName());
        gVar.m(chip.getText());
    }

    public final boolean j(int i2) {
        if (this.f7458f0 != i2) {
            return false;
        }
        this.f7458f0 = Integer.MIN_VALUE;
        p(i2, false);
        r(i2, 8);
        return true;
    }

    public final g k(int i2) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.i("android.view.View");
        Rect rect = f7451h0;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        gVar.f2078b = -1;
        Chip chip = this.f7455c0;
        obtain.setParent(chip);
        o(i2, gVar);
        if (gVar.g() == null && obtain.getContentDescription() == null) {
            o.r("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.X;
        gVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    gVar.f2079c = i2;
                    obtain.setSource(chip, i2);
                    if (this.f7457e0 == i2) {
                        obtain.setAccessibilityFocused(true);
                        gVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        gVar.a(64);
                    }
                    if (this.f7458f0 == i2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar.a(2);
                    } else if (obtain.isFocusable()) {
                        gVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.Z;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.R;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        gVar.f(rect3);
                        if (gVar.f2078b != -1) {
                            g gVar2 = new g(AccessibilityNodeInfo.obtain());
                            for (int i10 = gVar.f2078b; i10 != -1; i10 = gVar2.f2078b) {
                                gVar2.f2078b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = gVar2.f2077a;
                                accessibilityNodeInfo.setParent(chip, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i10, gVar2);
                                gVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.Y;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f2077a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                ViewParent parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo2.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return gVar;
                }
                o.r("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            o.r("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        o.r("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(int i2, Rect rect) {
        g gVar;
        boolean z10;
        int i10;
        g gVar2;
        g gVar3;
        int lastIndexOf;
        g gVar4;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        a1.x0 x0Var = new a1.x0(0);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x0Var.f(((Integer) arrayList.get(i11)).intValue(), k(((Integer) arrayList.get(i11)).intValue()));
        }
        int i12 = this.f7458f0;
        int i13 = Integer.MIN_VALUE;
        if (i12 == Integer.MIN_VALUE) {
            gVar = null;
        } else {
            gVar = (g) x0Var.c(i12);
        }
        e eVar = f7452i0;
        f fVar = f7453j0;
        Chip chip = this.f7455c0;
        int i14 = -1;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                j.h("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i15 = this.f7458f0;
            if (i15 != Integer.MIN_VALUE) {
                n(i15).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130) {
                                rect2.set(0, -1, width, -1);
                            } else {
                                j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                        }
                    } else {
                        rect2.set(0, height, width, height);
                    }
                } else {
                    rect2.set(width, 0, width, height);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 == 130) {
                            rect3.offset(0, -(rect2.height() + 1));
                        } else {
                            j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    } else {
                        rect3.offset(-(rect2.width() + 1), 0);
                    }
                } else {
                    rect3.offset(0, rect2.height() + 1);
                }
            } else {
                rect3.offset(rect2.width() + 1, 0);
            }
            fVar.getClass();
            int g10 = x0Var.g();
            Rect rect4 = new Rect();
            gVar3 = null;
            for (int i16 = 0; i16 < g10; i16++) {
                g gVar5 = (g) x0Var.h(i16);
                if (gVar5 != gVar) {
                    eVar.getClass();
                    gVar5.f(rect4);
                    if (d0.d.X(i2, rect2, rect4)) {
                        if (d0.d.X(i2, rect2, rect3) && !d0.d.H(i2, rect2, rect4, rect3)) {
                            if (!d0.d.H(i2, rect2, rect3, rect4)) {
                                int Z = d0.d.Z(i2, rect2, rect4);
                                int a02 = d0.d.a0(i2, rect2, rect4);
                                int i17 = (a02 * a02) + (Z * 13 * Z);
                                int Z2 = d0.d.Z(i2, rect2, rect3);
                                int a03 = d0.d.a0(i2, rect2, rect3);
                                if (i17 >= (a03 * a03) + (Z2 * 13 * Z2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        gVar3 = gVar5;
                    }
                }
            }
            i10 = 0;
        } else {
            WeakHashMap weakHashMap = x0.f533a;
            if (chip.getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.getClass();
            int g11 = x0Var.g();
            ArrayList arrayList2 = new ArrayList(g11);
            for (int i18 = 0; i18 < g11; i18++) {
                arrayList2.add((g) x0Var.h(i18));
            }
            Collections.sort(arrayList2, new b(z10, eVar));
            if (i2 != 1) {
                if (i2 == 2) {
                    int size = arrayList2.size();
                    if (gVar == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(gVar);
                    }
                    int i19 = lastIndexOf + 1;
                    if (i19 < size) {
                        gVar4 = arrayList2.get(i19);
                    } else {
                        gVar4 = null;
                    }
                    i10 = 0;
                    gVar2 = gVar4;
                } else {
                    j.h("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
            } else {
                i10 = 0;
                int size2 = arrayList2.size();
                if (gVar != null) {
                    size2 = arrayList2.indexOf(gVar);
                }
                int i20 = size2 - 1;
                if (i20 >= 0) {
                    gVar2 = arrayList2.get(i20);
                } else {
                    gVar2 = null;
                }
            }
            gVar3 = gVar2;
        }
        g gVar6 = gVar3;
        if (gVar6 != null) {
            if (x0Var.A) {
                r.a(x0Var);
            }
            int i21 = x0Var.R;
            int i22 = i10;
            while (true) {
                if (i22 >= i21) {
                    break;
                } else if (x0Var.L[i22] == gVar6) {
                    i14 = i22;
                    break;
                } else {
                    i22++;
                }
            }
            i13 = x0Var.e(i14);
        }
        return q(i13);
    }

    public final g n(int i2) {
        if (i2 == -1) {
            Chip chip = this.f7455c0;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            g gVar = new g(obtain);
            WeakHashMap weakHashMap = x0.f533a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                o.r("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                gVar.f2077a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
            }
            return gVar;
        }
        return k(i2);
    }

    public abstract void o(int i2, g gVar);

    public abstract void p(int i2, boolean z10);

    public final boolean q(int i2) {
        int i10;
        Chip chip = this.f7455c0;
        if ((chip.isFocused() || chip.requestFocus()) && (i10 = this.f7458f0) != i2) {
            if (i10 != Integer.MIN_VALUE) {
                j(i10);
            }
            if (i2 == Integer.MIN_VALUE) {
                return false;
            }
            this.f7458f0 = i2;
            p(i2, true);
            r(i2, 8);
            return true;
        }
        return false;
    }

    public final void r(int i2, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i2 != Integer.MIN_VALUE && this.f7454b0.isEnabled() && (parent = (view = this.f7455c0).getParent()) != null) {
            if (i2 != -1) {
                obtain = AccessibilityEvent.obtain(i10);
                g n10 = n(i2);
                obtain.getText().add(n10.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n10.f2077a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    o.r("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                    return;
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i2);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i10);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
