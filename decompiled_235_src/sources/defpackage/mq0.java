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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq0  reason: default package */
/* loaded from: classes.dex */
public final class mq0 extends b2 {
    public static final Rect k0 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final jd1 l0 = new jd1(4);
    public static final w31 m0 = new w31(5);
    public final AccessibilityManager d0;
    public final Chip e0;
    public ue f0;
    public final /* synthetic */ Chip j0;
    public final Rect R = new Rect();
    public final Rect X = new Rect();
    public final Rect Y = new Rect();
    public final int[] Z = new int[2];
    public int g0 = Integer.MIN_VALUE;
    public int h0 = Integer.MIN_VALUE;
    public int i0 = Integer.MIN_VALUE;

    public mq0(Chip chip, Chip chip2) {
        this.j0 = chip;
        this.e0 = chip2;
        this.d0 = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = ao7.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.b2
    public final os0 b(View view) {
        if (this.f0 == null) {
            this.f0 = new ue(this, 1);
        }
        return this.f0;
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.j0;
        nq0 nq0Var = chip.d0;
        if (nq0Var != null && nq0Var.V0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        v2Var.i(chip.getAccessibilityClassName());
        v2Var.m(chip.getText());
    }

    public final boolean j(int i) {
        if (this.h0 != i) {
            return false;
        }
        this.h0 = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final v2 k(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        v2 v2Var = new v2(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        v2Var.i("android.view.View");
        Rect rect = k0;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        v2Var.b = -1;
        Chip chip = this.e0;
        obtain.setParent(chip);
        o(i, v2Var);
        if (v2Var.g() == null && obtain.getContentDescription() == null) {
            u34.j("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.X;
        v2Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    v2Var.c = i;
                    obtain.setSource(chip, i);
                    if (this.g0 == i) {
                        obtain.setAccessibilityFocused(true);
                        v2Var.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        v2Var.a(64);
                    }
                    if (this.h0 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        v2Var.a(2);
                    } else if (obtain.isFocusable()) {
                        v2Var.a(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.Z;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.R;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        v2Var.f(rect3);
                        if (v2Var.b != -1) {
                            v2 v2Var2 = new v2(AccessibilityNodeInfo.obtain());
                            for (int i2 = v2Var.b; i2 != -1; i2 = v2Var2.b) {
                                v2Var2.b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = v2Var2.a;
                                accessibilityNodeInfo.setParent(chip, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i2, v2Var2);
                                v2Var2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.Y;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = v2Var.a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                ViewParent parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= RecyclerView.B1 || view.getVisibility() != 0) {
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
                    return v2Var;
                }
                u34.j("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            u34.j("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        u34.j("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public final void l(ArrayList arrayList) {
        nq0 nq0Var;
        arrayList.add(0);
        Rect rect = Chip.v0;
        Chip chip = this.j0;
        if (chip.c() && (nq0Var = chip.d0) != null && nq0Var.P0 && chip.g0 != null) {
            arrayList.add(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(int i, Rect rect) {
        v2 v2Var;
        boolean z;
        int i2;
        v2 v2Var2;
        v2 v2Var3;
        int lastIndexOf;
        v2 v2Var4;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        un6 un6Var = new un6(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            un6Var.e(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.h0;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            v2Var = null;
        } else {
            v2Var = (v2) un6Var.c(i4);
        }
        jd1 jd1Var = l0;
        w31 w31Var = m0;
        Chip chip = this.e0;
        int i6 = -1;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                i.h("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.h0;
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
                                i.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
                            i.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
            w31Var.getClass();
            int f = un6Var.f();
            Rect rect4 = new Rect();
            v2Var3 = null;
            for (int i8 = 0; i8 < f; i8++) {
                v2 v2Var5 = (v2) un6Var.g(i8);
                if (v2Var5 != v2Var) {
                    jd1Var.getClass();
                    v2Var5.f(rect4);
                    if (vw7.d(i, rect2, rect4)) {
                        if (vw7.d(i, rect2, rect3) && !vw7.a(i, rect2, rect4, rect3)) {
                            if (!vw7.a(i, rect2, rect3, rect4)) {
                                int e = vw7.e(i, rect2, rect4);
                                int f2 = vw7.f(i, rect2, rect4);
                                int i9 = (f2 * f2) + (e * 13 * e);
                                int e2 = vw7.e(i, rect2, rect3);
                                int f3 = vw7.f(i, rect2, rect3);
                                if (i9 >= (f3 * f3) + (e2 * 13 * e2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        v2Var3 = v2Var5;
                    }
                }
            }
            i2 = 0;
        } else {
            WeakHashMap weakHashMap = ao7.a;
            if (chip.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            w31Var.getClass();
            int f4 = un6Var.f();
            ArrayList arrayList2 = new ArrayList(f4);
            for (int i10 = 0; i10 < f4; i10++) {
                arrayList2.add((v2) un6Var.g(i10));
            }
            Collections.sort(arrayList2, new th2(z, jd1Var));
            if (i != 1) {
                if (i == 2) {
                    int size = arrayList2.size();
                    if (v2Var == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(v2Var);
                    }
                    int i11 = lastIndexOf + 1;
                    if (i11 < size) {
                        v2Var4 = arrayList2.get(i11);
                    } else {
                        v2Var4 = null;
                    }
                    i2 = 0;
                    v2Var2 = v2Var4;
                } else {
                    i.h("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
            } else {
                i2 = 0;
                int size2 = arrayList2.size();
                if (v2Var != null) {
                    size2 = arrayList2.indexOf(v2Var);
                }
                int i12 = size2 - 1;
                if (i12 >= 0) {
                    v2Var2 = arrayList2.get(i12);
                } else {
                    v2Var2 = null;
                }
            }
            v2Var3 = v2Var2;
        }
        v2 v2Var6 = v2Var3;
        if (v2Var6 != null) {
            if (un6Var.A) {
                vy7.I(un6Var);
            }
            int i13 = un6Var.R;
            int i14 = i2;
            while (true) {
                if (i14 >= i13) {
                    break;
                } else if (un6Var.L[i14] == v2Var6) {
                    i6 = i14;
                    break;
                } else {
                    i14++;
                }
            }
            i5 = un6Var.d(i6);
        }
        return q(i5);
    }

    public final v2 n(int i) {
        if (i == -1) {
            Chip chip = this.e0;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            v2 v2Var = new v2(obtain);
            WeakHashMap weakHashMap = ao7.a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                u34.j("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                v2Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
            }
            return v2Var;
        }
        return k(i);
    }

    public final void o(int i, v2 v2Var) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        String str = "";
        if (i == 1) {
            Chip chip = this.j0;
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
            v2Var.b(p2.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            v2Var.i(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.v0);
    }

    public final void p(int i, boolean z) {
        Chip chip = this.j0;
        if (i == 1) {
            chip.l0 = z;
        }
        nq0 nq0Var = chip.d0;
        boolean z2 = chip.l0;
        boolean z3 = false;
        if (nq0Var.Q0 != null) {
            z3 = nq0Var.R(z2 ? new int[]{16842919, 16842910} : nq0.K1);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final boolean q(int i) {
        int i2;
        Chip chip = this.e0;
        if ((chip.isFocused() || chip.requestFocus()) && (i2 = this.h0) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.h0 = i;
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
        if (i != Integer.MIN_VALUE && this.d0.isEnabled() && (parent = (view = this.e0).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                v2 n = n(i);
                obtain.getText().add(n.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n.a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    u34.j("Callbacks must add text or a content description in populateEventForVirtualViewId()");
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
