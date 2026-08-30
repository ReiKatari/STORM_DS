package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co0  reason: default package */
/* loaded from: classes.dex */
public final class co0 extends z1 {
    public static final Rect j0 = new Rect(Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final hm1 k0 = new Object();
    public static final vn1 l0 = new vn1(3);
    public final AccessibilityManager c0;
    public final Chip d0;
    public fe e0;
    public final /* synthetic */ Chip i0;
    public final Rect R = new Rect();
    public final Rect X = new Rect();
    public final Rect Y = new Rect();
    public final int[] Z = new int[2];
    public int f0 = Integer.MIN_VALUE;
    public int g0 = Integer.MIN_VALUE;
    public int h0 = Integer.MIN_VALUE;

    public co0(Chip chip, Chip chip2) {
        this.i0 = chip;
        this.d0 = chip2;
        this.c0 = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = aa7.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.z1
    public final bq0 b(View view) {
        if (this.e0 == null) {
            this.e0 = new fe(this, 1);
        }
        return this.e0;
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.i0;
        do0 do0Var = chip.c0;
        if (do0Var != null && do0Var.U0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        t2Var.i(chip.getAccessibilityClassName());
        t2Var.m(chip.getText());
    }

    public final boolean j(int i) {
        if (this.g0 != i) {
            return false;
        }
        this.g0 = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final t2 k(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        t2 t2Var = new t2(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        t2Var.i("android.view.View");
        Rect rect = j0;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        t2Var.b = -1;
        Chip chip = this.d0;
        obtain.setParent(chip);
        o(i, t2Var);
        if (t2Var.g() == null && obtain.getContentDescription() == null) {
            f81.w("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.X;
        t2Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    t2Var.c = i;
                    obtain.setSource(chip, i);
                    if (this.f0 == i) {
                        obtain.setAccessibilityFocused(true);
                        t2Var.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        t2Var.a(64);
                    }
                    if (this.g0 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        t2Var.a(2);
                    } else if (obtain.isFocusable()) {
                        t2Var.a(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.Z;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.R;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        t2Var.f(rect3);
                        if (t2Var.b != -1) {
                            t2 t2Var2 = new t2(AccessibilityNodeInfo.obtain());
                            for (int i2 = t2Var.b; i2 != -1; i2 = t2Var2.b) {
                                t2Var2.b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = t2Var2.a;
                                accessibilityNodeInfo.setParent(chip, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i2, t2Var2);
                                t2Var2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.Y;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = t2Var.a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                ViewParent parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= RecyclerView.A1 || view.getVisibility() != 0) {
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
                    return t2Var;
                }
                f81.w("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            f81.w("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        f81.w("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public final void l(ArrayList arrayList) {
        do0 do0Var;
        arrayList.add(0);
        Rect rect = Chip.u0;
        Chip chip = this.i0;
        if (chip.c() && (do0Var = chip.c0) != null && do0Var.O0 && chip.f0 != null) {
            arrayList.add(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(int i, Rect rect) {
        t2 t2Var;
        boolean z;
        int i2;
        t2 t2Var2;
        t2 t2Var3;
        int lastIndexOf;
        t2 t2Var4;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        ec6 ec6Var = new ec6(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ec6Var.f(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.g0;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            t2Var = null;
        } else {
            t2Var = (t2) ec6Var.c(i4);
        }
        hm1 hm1Var = k0;
        vn1 vn1Var = l0;
        Chip chip = this.d0;
        int i6 = -1;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                i.i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.g0;
            if (i7 != Integer.MIN_VALUE) {
                n(i7).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                rect2.set(0, -1, width, -1);
                            } else {
                                i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                            rect3.offset(0, -(rect2.height() + 1));
                        } else {
                            i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
            vn1Var.getClass();
            int g = ec6Var.g();
            Rect rect4 = new Rect();
            t2Var3 = null;
            for (int i8 = 0; i8 < g; i8++) {
                t2 t2Var5 = (t2) ec6Var.h(i8);
                if (t2Var5 != t2Var) {
                    hm1Var.getClass();
                    t2Var5.f(rect4);
                    if (uh7.d(i, rect2, rect4)) {
                        if (uh7.d(i, rect2, rect3) && !uh7.a(i, rect2, rect4, rect3)) {
                            if (!uh7.a(i, rect2, rect3, rect4)) {
                                int e = uh7.e(i, rect2, rect4);
                                int f = uh7.f(i, rect2, rect4);
                                int i9 = (f * f) + (e * 13 * e);
                                int e2 = uh7.e(i, rect2, rect3);
                                int f2 = uh7.f(i, rect2, rect3);
                                if (i9 >= (f2 * f2) + (e2 * 13 * e2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        t2Var3 = t2Var5;
                    }
                }
            }
            i2 = 0;
        } else {
            WeakHashMap weakHashMap = aa7.a;
            if (chip.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            vn1Var.getClass();
            int g2 = ec6Var.g();
            ArrayList arrayList2 = new ArrayList(g2);
            for (int i10 = 0; i10 < g2; i10++) {
                arrayList2.add((t2) ec6Var.h(i10));
            }
            Collections.sort(arrayList2, new cd2(z, hm1Var));
            if (i != 1) {
                if (i == 2) {
                    int size = arrayList2.size();
                    if (t2Var == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(t2Var);
                    }
                    int i11 = lastIndexOf + 1;
                    if (i11 < size) {
                        t2Var4 = arrayList2.get(i11);
                    } else {
                        t2Var4 = null;
                    }
                    i2 = 0;
                    t2Var2 = t2Var4;
                } else {
                    i.i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
            } else {
                i2 = 0;
                int size2 = arrayList2.size();
                if (t2Var != null) {
                    size2 = arrayList2.indexOf(t2Var);
                }
                int i12 = size2 - 1;
                if (i12 >= 0) {
                    t2Var2 = arrayList2.get(i12);
                } else {
                    t2Var2 = null;
                }
            }
            t2Var3 = t2Var2;
        }
        t2 t2Var6 = t2Var3;
        if (t2Var6 != null) {
            if (ec6Var.A) {
                jv3.j(ec6Var);
            }
            int i13 = ec6Var.R;
            int i14 = i2;
            while (true) {
                if (i14 >= i13) {
                    break;
                } else if (ec6Var.L[i14] == t2Var6) {
                    i6 = i14;
                    break;
                } else {
                    i14++;
                }
            }
            i5 = ec6Var.e(i6);
        }
        return q(i5);
    }

    public final t2 n(int i) {
        if (i == -1) {
            Chip chip = this.d0;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            t2 t2Var = new t2(obtain);
            WeakHashMap weakHashMap = aa7.a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                f81.w("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                t2Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
            }
            return t2Var;
        }
        return k(i);
    }

    public final void o(int i, t2 t2Var) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        String str = "";
        if (i == 1) {
            Chip chip = this.i0;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, str).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            t2Var.b(n2.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            t2Var.i(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.u0);
    }

    public final void p(int i, boolean z) {
        Chip chip = this.i0;
        if (i == 1) {
            chip.k0 = z;
        }
        do0 do0Var = chip.c0;
        boolean z2 = chip.k0;
        boolean z3 = false;
        if (do0Var.P0 != null) {
            z3 = do0Var.R(z2 ? new int[]{16842919, 16842910} : do0.J1);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final boolean q(int i) {
        int i2;
        Chip chip = this.d0;
        if ((chip.isFocused() || chip.requestFocus()) && (i2 = this.g0) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.g0 = i;
            p(i, true);
            r(i, 8);
            return true;
        }
        return false;
    }

    public final void r(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.c0.isEnabled() && (parent = (view = this.d0).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                t2 n = n(i);
                obtain.getText().add(n.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n.a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    f81.w("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                    return;
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
