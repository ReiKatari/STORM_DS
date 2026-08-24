package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends e51 implements r14 {
    public final k60 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public ho7 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;
    public final int a;
    public v14 a0;
    public boolean b;
    public int b0;
    public final float c;
    public int c0;
    public final int d;
    public boolean d0;
    public int e;
    public HashMap e0;
    public boolean f;
    public final SparseIntArray f0;
    public int g;
    public final h60 g0;
    public final int h;
    public final p24 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final me6 y;
    public boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new k60(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new h60(this, 0);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.a);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = np2.S(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.y = me6.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018130).a();
        }
        me6 me6Var = this.y;
        if (me6Var != null) {
            p24 p24Var = new p24(me6Var);
            this.i = p24Var;
            p24Var.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new f60(this, 0));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            H(i);
        } else {
            H(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        G(obtainStyledAttributes.getBoolean(9, false));
        this.n = obtainStyledAttributes.getBoolean(14, false);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        if (this.b != z) {
            this.b = z;
            if (this.W != null) {
                v();
            }
            J((this.b && this.N == 6) ? i2 : this.N);
            N(this.N, true);
            M();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > RecyclerView.B1 && f < 1.0f) {
            this.F = f;
            if (this.W != null) {
                this.E = (int) ((1.0f - f) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    N(this.N, true);
                } else {
                    i.h("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    N(this.N, true);
                } else {
                    i.h("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.d = obtainStyledAttributes.getInt(12, 500);
            this.o = obtainStyledAttributes.getBoolean(18, false);
            this.p = obtainStyledAttributes.getBoolean(19, false);
            this.q = obtainStyledAttributes.getBoolean(20, false);
            this.r = obtainStyledAttributes.getBoolean(21, true);
            this.s = obtainStyledAttributes.getBoolean(15, false);
            this.t = obtainStyledAttributes.getBoolean(16, false);
            this.u = obtainStyledAttributes.getBoolean(17, false);
            this.x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        i.h("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof h51) {
            e51 e51Var = ((h51) layoutParams).a;
            if (e51Var instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) e51Var;
            }
            i.h("The view is not associated with BottomSheetBehavior");
            return null;
        }
        i.h("The view is not a child of CoordinatorLayout");
        return null;
    }

    public static int B(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public static View z(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View z = z(viewGroup.getChildAt(i));
                    if (z != null) {
                        return z;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final int C() {
        int i;
        if (this.b) {
            return this.D;
        }
        if (this.r) {
            i = 0;
        } else {
            i = this.w;
        }
        return Math.max(this.C, i);
    }

    public final int D(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.E;
                    }
                    i.h(lb1.g(i, "Invalid state to get top offset: "));
                    return 0;
                }
                return this.V;
            }
            return this.G;
        }
        return C();
    }

    public final boolean E() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void F() {
        this.b0 = -1;
        this.c0 = -1;
        VelocityTracker velocityTracker = this.Z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Z = null;
        }
    }

    public final void G(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (!z) {
                this.f = true;
            } else {
                return;
            }
        } else if (!z && this.e == i) {
            return;
        } else {
            this.f = false;
            this.e = Math.max(0, i);
        }
        P();
    }

    public final void I(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.I && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.b && D(i) <= this.D) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                is isVar = new is(this, view, i2);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(isVar);
                    return;
                } else {
                    isVar.run();
                    return;
                }
            }
            J(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(i61.n(sb, str, " should not be set externally."));
    }

    public final void J(int i) {
        View view;
        if (this.N != i) {
            this.N = i;
            if (i != 4 && i != 3 && i != 6) {
                boolean z = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            int i2 = 0;
            if (i == 3) {
                O(true);
            } else if (i == 6 || i == 5 || i == 4) {
                O(false);
            }
            N(i, true);
            while (true) {
                ArrayList arrayList = this.Y;
                if (i2 < arrayList.size()) {
                    ((i60) arrayList.get(i2)).c(view, i);
                    i2++;
                } else {
                    M();
                    return;
                }
            }
        }
    }

    public final boolean K(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        int x = x();
        if (Math.abs(((f * this.S) + view.getTop()) - this.G) / x > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        J(2);
        N(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, int i, boolean z) {
        int D = D(i);
        ho7 ho7Var = this.O;
        if (ho7Var != null) {
            if (!z) {
                int left = view.getLeft();
                ho7Var.r = view;
                ho7Var.c = -1;
                boolean h = ho7Var.h(left, D, 0, 0);
                if (!h && ho7Var.a == 0 && ho7Var.r != null) {
                    ho7Var.r = null;
                }
            }
        }
        J(i);
    }

    public final void M() {
        View view;
        int i;
        boolean z;
        b2 b2Var;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ao7.k(view, 524288);
            ao7.i(view, 0);
            ao7.k(view, 262144);
            ao7.i(view, 0);
            ao7.k(view, 1048576);
            ao7.i(view, 0);
            SparseIntArray sparseIntArray = this.f0;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                ao7.k(view, i2);
                ao7.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                zb zbVar = new zb(this, 6, 2);
                ArrayList g = ao7.g(view);
                int i4 = 0;
                while (true) {
                    if (i4 < g.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((p2) g.get(i4)).a).getLabel())) {
                            i = ((p2) g.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = ao7.d;
                            if (i5 >= 32 || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < g.size(); i8++) {
                                if (((p2) g.get(i8)).a() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    }
                }
                if (i != -1) {
                    p2 p2Var = new p2(null, i, string, zbVar, null);
                    View.AccessibilityDelegate e = ao7.e(view);
                    if (e == null) {
                        b2Var = null;
                    } else if (e instanceof a2) {
                        b2Var = ((a2) e).a;
                    } else {
                        b2Var = new b2(e);
                    }
                    if (b2Var == null) {
                        b2Var = new b2();
                    }
                    ao7.n(view, b2Var);
                    ao7.k(view, p2Var.a());
                    ao7.g(view).add(p2Var);
                    ao7.i(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.I && this.N != 5) {
                ao7.l(view, p2.l, new zb(this, 5, 2));
            }
            int i9 = this.N;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        ao7.l(view, p2.k, new zb(this, 4, 2));
                        ao7.l(view, p2.j, new zb(this, 3, 2));
                        return;
                    }
                    return;
                }
                if (this.b) {
                    i3 = 3;
                }
                ao7.l(view, p2.j, new zb(this, i3, 2));
                return;
            }
            if (this.b) {
                i3 = 4;
            }
            ao7.l(view, p2.k, new zb(this, i3, 2));
        }
    }

    public final void N(int i, boolean z) {
        boolean z2;
        p24 p24Var;
        if (i != 2) {
            if (this.N == 3 && (this.x || E())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.z != z2 && (p24Var = this.i) != null) {
                this.z = z2;
                ValueAnimator valueAnimator = this.B;
                float f = 1.0f;
                if (z && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f2 = p24Var.B.j;
                    if (z2) {
                        f = w();
                    }
                    valueAnimator.setFloatValues(f2, f);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.z) {
                    f = w();
                }
                n24 n24Var = p24Var.B;
                if (n24Var.j != f) {
                    n24Var.j = f;
                    p24Var.Y = true;
                    p24Var.Z = true;
                    p24Var.invalidateSelf();
                }
            }
        }
    }

    public final void O(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.e0 == null) {
                        this.e0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.W.get() && z) {
                        this.e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.e0 = null;
                }
            }
        }
    }

    public final void P() {
        View view;
        if (this.W != null) {
            v();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.r14
    public final void a() {
        v14 v14Var = this.a0;
        if (v14Var == null) {
            return;
        }
        int i = v14Var.d;
        int i2 = v14Var.c;
        b00 b00Var = v14Var.f;
        v14Var.f = null;
        int i3 = 4;
        if (b00Var != null) {
            float f = b00Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.I) {
                    s7 s7Var = new s7(this, 2);
                    View view = v14Var.b;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                    ofFloat.setInterpolator(new q92(1));
                    ofFloat.setDuration(vo.c(f, i2, i));
                    ofFloat.addListener(new s7(v14Var, 6));
                    ofFloat.addListener(s7Var);
                    ofFloat.start();
                    return;
                }
                AnimatorSet a = v14Var.a();
                a.setDuration(vo.c(f, i2, i));
                a.start();
                I(4);
                return;
            }
        }
        if (this.I) {
            i3 = 5;
        }
        I(i3);
    }

    @Override // defpackage.r14
    public final void b(b00 b00Var) {
        v14 v14Var = this.a0;
        if (v14Var != null) {
            if (v14Var.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            b00 b00Var2 = v14Var.f;
            v14Var.f = b00Var;
            if (b00Var2 == null) {
                return;
            }
            v14Var.b(b00Var.c);
        }
    }

    @Override // defpackage.r14
    public final void c(b00 b00Var) {
        v14 v14Var = this.a0;
        if (v14Var == null) {
            return;
        }
        v14Var.f = b00Var;
    }

    @Override // defpackage.r14
    public final void d() {
        v14 v14Var = this.a0;
        if (v14Var != null) {
            if (v14Var.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            b00 b00Var = v14Var.f;
            v14Var.f = null;
            if (b00Var == null) {
                return;
            }
            AnimatorSet a = v14Var.a();
            a.setDuration(v14Var.e);
            a.start();
        }
    }

    @Override // defpackage.e51
    public final void g(h51 h51Var) {
        this.W = null;
        this.O = null;
        this.a0 = null;
    }

    @Override // defpackage.e51
    public final void i() {
        this.W = null;
        this.O = null;
        this.a0 = null;
    }

    @Override // defpackage.e51
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        ho7 ho7Var;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                F();
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.d0 = false;
                    this.b0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.c0 = y;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x, y)) {
                        this.b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.d0 = true;
                    }
                }
                if (this.b0 == -1 && !coordinatorLayout.o(view, x, this.c0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.P = z;
            }
            if (this.P || (ho7Var = this.O) == null || !ho7Var.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.c0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [cq7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // defpackage.e51
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.n && !this.f) {
                z = true;
            } else {
                z = false;
            }
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                g60 g60Var = new g60(z, this);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.a = paddingStart;
                obj.b = paddingEnd;
                obj.c = paddingBottom;
                rr6 rr6Var = new rr6(12, g60Var, obj);
                WeakHashMap weakHashMap = ao7.a;
                sn7.c(view, rr6Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            ao7.p(view, new f83(view));
            this.W = new WeakReference(view);
            this.a0 = new v14(view);
            p24 p24Var = this.i;
            if (p24Var != null) {
                view.setBackground(p24Var);
                float f = this.H;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                p24Var.m(f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new ho7(coordinatorLayout.getContext(), coordinatorLayout, this.g0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i3 = this.V;
        int i4 = i3 - height;
        int i5 = this.w;
        if (i4 < i5) {
            boolean z2 = this.r;
            int i6 = this.l;
            if (z2) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.T = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.T = i7;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        v();
        int i8 = this.N;
        if (i8 == 3) {
            int C = C();
            WeakHashMap weakHashMap2 = ao7.a;
            view.offsetTopAndBottom(C);
        } else if (i8 == 6) {
            int i9 = this.E;
            WeakHashMap weakHashMap3 = ao7.a;
            view.offsetTopAndBottom(i9);
        } else if (this.I && i8 == 5) {
            int i10 = this.V;
            WeakHashMap weakHashMap4 = ao7.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.G;
            WeakHashMap weakHashMap5 = ao7.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = ao7.a;
            view.offsetTopAndBottom(top2);
        }
        N(this.N, false);
        this.X = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.Y;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((i60) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    @Override // defpackage.e51
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), B(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.e51
    public final boolean m(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e51
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i4 = top - i2;
                boolean z = this.K;
                boolean z2 = this.L;
                if (i2 > 0) {
                    if (!this.R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    } else if (i4 < C()) {
                        int C = top - C();
                        iArr[1] = C;
                        WeakHashMap weakHashMap = ao7.a;
                        view.offsetTopAndBottom(-C);
                        J(3);
                    } else if (z) {
                        iArr[1] = i2;
                        WeakHashMap weakHashMap2 = ao7.a;
                        view.offsetTopAndBottom(-i2);
                        J(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !z2 && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    } else if (!canScrollVertically) {
                        int i5 = this.G;
                        if (i4 > i5 && !this.I) {
                            int i6 = top - i5;
                            iArr[1] = i6;
                            WeakHashMap weakHashMap3 = ao7.a;
                            view.offsetTopAndBottom(-i6);
                            J(4);
                        } else if (!z) {
                            return;
                        } else {
                            iArr[1] = i2;
                            WeakHashMap weakHashMap4 = ao7.a;
                            view.offsetTopAndBottom(-i2);
                            J(1);
                        }
                    }
                }
                y(view.getTop());
                this.Q = i2;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // defpackage.e51
    public final void q(View view, Parcelable parcelable) {
        j60 j60Var = (j60) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = j60Var.R;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = j60Var.X;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = j60Var.Y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = j60Var.Z;
            }
        }
        int i2 = j60Var.L;
        if (i2 != 1 && i2 != 2) {
            this.N = i2;
        } else {
            this.N = 4;
        }
    }

    @Override // defpackage.e51
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new j60(this);
    }

    @Override // defpackage.e51
    public final boolean s(View view, int i, int i2) {
        this.Q = 0;
        this.R = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r4.getTop() <= r3.E) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.G)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.G)) goto L18;
     */
    @Override // defpackage.e51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == C()) {
            J(3);
            return;
        }
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.b) {
                }
                L(view, i2, false);
                this.R = false;
            }
            if (this.I) {
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.B1;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.Z.getYVelocity(this.b0);
                }
                if (K(view, yVelocity)) {
                    i2 = 5;
                    L(view, i2, false);
                    this.R = false;
                }
            }
            if (this.Q == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            L(view, i2, false);
            this.R = false;
        }
    }

    @Override // defpackage.e51
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ho7 ho7Var = this.O;
        boolean z = this.K;
        if (ho7Var != null && (z || i == 1)) {
            ho7Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            F();
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((z || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.c0 - motionEvent.getY());
            ho7 ho7Var2 = this.O;
            if (abs > ho7Var2.b) {
                ho7Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void v() {
        int x = x();
        boolean z = this.b;
        int i = this.V;
        if (z) {
            this.G = Math.max(i - x, this.D);
        } else {
            this.G = i - x;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float a;
        RoundedCorner roundedCorner;
        float f;
        float[] fArr;
        float a2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = RecyclerView.B1;
        p24 p24Var = this.i;
        if (p24Var != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.W.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float[] fArr2 = p24Var.x0;
                if (fArr2 != null) {
                    a = fArr2[3];
                } else {
                    a = p24Var.B.a.e.a(p24Var.g());
                }
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > RecyclerView.B1 && a > RecyclerView.B1) {
                        f = f3 / a;
                        fArr = p24Var.x0;
                        if (fArr == null) {
                            a2 = fArr[0];
                        } else {
                            a2 = p24Var.B.a.f.a(p24Var.g());
                        }
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > RecyclerView.B1 && a2 > RecyclerView.B1) {
                                f2 = f4 / a2;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                fArr = p24Var.x0;
                if (fArr == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return RecyclerView.B1;
    }

    public final int x() {
        int i;
        int i2;
        int i3;
        if (this.f) {
            i = Math.min(Math.max(this.g, this.V - ((this.U * 9) / 16)), this.T);
            i2 = this.v;
        } else if (!this.n && !this.o && (i3 = this.m) > 0) {
            return Math.max(this.e, i3 + this.h);
        } else {
            i = this.e;
            i2 = this.v;
        }
        return i + i2;
    }

    public final void y(int i) {
        View view = (View) this.W.get();
        if (view != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i2 = this.G;
                if (i <= i2 && i2 != C()) {
                    C();
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((i60) arrayList.get(i3)).b(view);
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new k60(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.c0 = -1;
        this.f0 = new SparseIntArray();
        this.g0 = new h60(this, 0);
    }

    @Override // defpackage.e51
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
