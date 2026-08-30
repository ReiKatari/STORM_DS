package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends w11 {
    public final l40 A;
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
    public ha7 O;
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
    public int a0;
    public boolean b;
    public int b0;
    public final float c;
    public boolean c0;
    public final int d;
    public HashMap d0;
    public int e;
    public final SparseIntArray e0;
    public boolean f;
    public final j40 f0;
    public int g;
    public final int h;
    public final gv3 i;
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
    public final a36 y;
    public boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new l40(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new j40(this, 0);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.a);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = nk2.C(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.y = a36.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018122).a();
        }
        a36 a36Var = this.y;
        if (a36Var != null) {
            gv3 gv3Var = new gv3(a36Var);
            this.i = gv3Var;
            gv3Var.k(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new h40(0, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                B(4);
            }
            F();
        }
        this.n = obtainStyledAttributes.getBoolean(14, false);
        boolean z2 = obtainStyledAttributes.getBoolean(7, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.W != null) {
                r();
            }
            C((this.b && this.N == 6) ? i2 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > RecyclerView.A1 && f < 1.0f) {
            this.F = f;
            if (this.W != null) {
                this.E = (int) ((1.0f - f) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    G(this.N, true);
                } else {
                    i.i("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    i.i("offset must be greater than or equal to 0");
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
        i.i("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static View v(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View v = v(viewGroup.getChildAt(i));
                    if (v != null) {
                        return v;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
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

    public final void A(int i) {
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
        I();
    }

    public final void B(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.I && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.b && y(i) <= this.D) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                vr vrVar = new vr(this, view, i2);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(vrVar);
                    return;
                } else {
                    vrVar.run();
                    return;
                }
            }
            C(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(b31.q(sb, str, " should not be set externally."));
    }

    public final void C(int i) {
        if (this.N != i) {
            this.N = i;
            if (i != 4 && i != 3 && i != 6) {
                boolean z = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                H(true);
            } else if (i == 6 || i == 5 || i == 4) {
                H(false);
            }
            G(i, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                F();
                return;
            }
            arrayList.get(0).getClass();
            c44.b();
        }
    }

    public final boolean D(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        int t = t();
        if (Math.abs(((f * this.S) + view.getTop()) - this.G) / t > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        C(2);
        G(r4, true);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            ha7 r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            l40 r2 = r2.A
            r2.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i;
        boolean z;
        z1 z1Var;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            aa7.k(view, 524288);
            aa7.i(view, 0);
            aa7.k(view, 262144);
            aa7.i(view, 0);
            aa7.k(view, 1048576);
            aa7.i(view, 0);
            SparseIntArray sparseIntArray = this.e0;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                aa7.k(view, i2);
                aa7.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                sb sbVar = new sb(6, 2, this);
                ArrayList g = aa7.g(view);
                int i4 = 0;
                while (true) {
                    if (i4 < g.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((n2) g.get(i4)).a).getLabel())) {
                            i = ((n2) g.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = aa7.d;
                            if (i5 >= 32 || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < g.size(); i8++) {
                                if (((n2) g.get(i8)).a() != i7) {
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
                    n2 n2Var = new n2(null, i, string, sbVar, null);
                    View.AccessibilityDelegate e = aa7.e(view);
                    if (e == null) {
                        z1Var = null;
                    } else if (e instanceof y1) {
                        z1Var = ((y1) e).a;
                    } else {
                        z1Var = new z1(e);
                    }
                    if (z1Var == null) {
                        z1Var = new z1();
                    }
                    aa7.n(view, z1Var);
                    aa7.k(view, n2Var.a());
                    aa7.g(view).add(n2Var);
                    aa7.i(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.I && this.N != 5) {
                aa7.l(view, n2.l, new sb(5, 2, this));
            }
            int i9 = this.N;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        aa7.l(view, n2.k, new sb(4, 2, this));
                        aa7.l(view, n2.j, new sb(3, 2, this));
                        return;
                    }
                    return;
                }
                if (this.b) {
                    i3 = 3;
                }
                aa7.l(view, n2.j, new sb(i3, 2, this));
                return;
            }
            if (this.b) {
                i3 = 4;
            }
            aa7.l(view, n2.k, new sb(i3, 2, this));
        }
    }

    public final void G(int i, boolean z) {
        boolean z2;
        gv3 gv3Var;
        if (i != 2) {
            if (this.N == 3 && (this.x || z())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.z != z2 && (gv3Var = this.i) != null) {
                this.z = z2;
                ValueAnimator valueAnimator = this.B;
                float f = 1.0f;
                if (z && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f2 = gv3Var.B.j;
                    if (z2) {
                        f = s();
                    }
                    valueAnimator.setFloatValues(f2, f);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.z) {
                    f = s();
                }
                ev3 ev3Var = gv3Var.B;
                if (ev3Var.j != f) {
                    ev3Var.j = f;
                    gv3Var.Y = true;
                    gv3Var.Z = true;
                    gv3Var.invalidateSelf();
                }
            }
        }
    }

    public final void H(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.d0 == null) {
                        this.d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.W.get() && z) {
                        this.d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.d0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.w11
    public final void c(z11 z11Var) {
        this.W = null;
        this.O = null;
    }

    @Override // defpackage.w11
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // defpackage.w11
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        ha7 ha7Var;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.a0 = -1;
                this.b0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.c0 = false;
                    this.a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.b0 = y;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x, y)) {
                        this.a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.c0 = true;
                    }
                }
                if (this.a0 == -1 && !coordinatorLayout.o(view, x, this.b0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.P = z;
            }
            if (this.P || (ha7Var = this.O) == null || !ha7Var.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.O.b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [bc7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // defpackage.w11
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.n && !this.f) {
                z = true;
            } else {
                z = false;
            }
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                i40 i40Var = new i40(z, this);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.a = paddingStart;
                obj.b = paddingEnd;
                obj.c = paddingBottom;
                wv6 wv6Var = new wv6(5, i40Var, obj);
                WeakHashMap weakHashMap = aa7.a;
                s97.c(view, wv6Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            aa7.p(view, new y13(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, RecyclerView.A1, 1.0f);
            Context context = view.getContext();
            me2.M(context, R.attr.motionDurationMedium2, 300);
            me2.M(context, R.attr.motionDurationShort3, 150);
            me2.M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            gv3 gv3Var = this.i;
            if (gv3Var != null) {
                view.setBackground(gv3Var);
                float f = this.H;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                gv3Var.m(f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new ha7(coordinatorLayout.getContext(), coordinatorLayout, this.f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i2 = this.V;
        int i3 = i2 - height;
        int i4 = this.w;
        if (i3 < i4) {
            boolean z2 = this.r;
            int i5 = this.l;
            if (z2) {
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.T = i2;
            } else {
                int i6 = i2 - i4;
                if (i5 != -1) {
                    i6 = Math.min(i6, i5);
                }
                this.T = i6;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i7 = this.N;
        if (i7 == 3) {
            int x = x();
            WeakHashMap weakHashMap2 = aa7.a;
            view.offsetTopAndBottom(x);
        } else if (i7 == 6) {
            int i8 = this.E;
            WeakHashMap weakHashMap3 = aa7.a;
            view.offsetTopAndBottom(i8);
        } else if (this.I && i7 == 5) {
            int i9 = this.V;
            WeakHashMap weakHashMap4 = aa7.a;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.G;
            WeakHashMap weakHashMap5 = aa7.a;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = aa7.a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        c44.b();
        return false;
    }

    @Override // defpackage.w11
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.w11
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w11
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
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
                    } else if (i4 < x()) {
                        int x = top - x();
                        iArr[1] = x;
                        WeakHashMap weakHashMap = aa7.a;
                        view.offsetTopAndBottom(-x);
                        C(3);
                    } else if (z) {
                        iArr[1] = i2;
                        WeakHashMap weakHashMap2 = aa7.a;
                        view.offsetTopAndBottom(-i2);
                        C(1);
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
                            WeakHashMap weakHashMap3 = aa7.a;
                            view.offsetTopAndBottom(-i6);
                            C(4);
                        } else if (!z) {
                            return;
                        } else {
                            iArr[1] = i2;
                            WeakHashMap weakHashMap4 = aa7.a;
                            view.offsetTopAndBottom(-i2);
                            C(1);
                        }
                    }
                }
                u(view.getTop());
                this.Q = i2;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // defpackage.w11
    public final void m(View view, Parcelable parcelable) {
        k40 k40Var = (k40) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = k40Var.R;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = k40Var.X;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = k40Var.Y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = k40Var.Z;
            }
        }
        int i2 = k40Var.L;
        if (i2 != 1 && i2 != 2) {
            this.N = i2;
        } else {
            this.N = 4;
        }
    }

    @Override // defpackage.w11
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new k40(this);
    }

    @Override // defpackage.w11
    public final boolean o(View view, int i, int i2) {
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
    @Override // defpackage.w11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.a0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.w11
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ha7 ha7Var = this.O;
        boolean z = this.K;
        if (ha7Var != null && (z || i == 1)) {
            ha7Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.a0 = -1;
            this.b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((z || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.b0 - motionEvent.getY());
            ha7 ha7Var2 = this.O;
            if (abs > ha7Var2.b) {
                ha7Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t = t();
        boolean z = this.b;
        int i = this.V;
        if (z) {
            this.G = Math.max(i - t, this.D);
        } else {
            this.G = i - t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            r0 = 0
            gv3 r1 = r5.i
            if (r1 == 0) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L85
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L85
            java.lang.ref.WeakReference r2 = r5.W
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.z()
            if (r5 == 0) goto L85
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L85
            float[] r2 = r1.w0
            if (r2 == 0) goto L31
            r3 = 3
            r2 = r2[r3]
            goto L3f
        L31:
            ev3 r2 = r1.B
            a36 r2 = r2.a
            y21 r2 = r2.e
            android.graphics.RectF r3 = r1.g()
            float r2 = r2.a(r3)
        L3f:
            android.view.RoundedCorner r3 = defpackage.dd.j(r5)
            if (r3 == 0) goto L54
            int r3 = defpackage.dd.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            float r3 = r3 / r2
            goto L55
        L54:
            r3 = r0
        L55:
            float[] r2 = r1.w0
            if (r2 == 0) goto L5d
            r1 = 0
            r1 = r2[r1]
            goto L6b
        L5d:
            ev3 r2 = r1.B
            a36 r2 = r2.a
            y21 r2 = r2.f
            android.graphics.RectF r1 = r1.g()
            float r1 = r2.a(r1)
        L6b:
            android.view.RoundedCorner r5 = defpackage.dd.A(r5)
            if (r5 == 0) goto L80
            int r5 = defpackage.dd.b(r5)
            float r5 = (float) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            float r0 = r5 / r1
        L80:
            float r5 = java.lang.Math.max(r3, r0)
            return r5
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
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

    public final void u(int i) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i2 = this.G;
                if (i <= i2 && i2 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    c44.b();
                }
            }
        }
    }

    public final int x() {
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

    public final int y(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.E;
                    }
                    i.i(wh1.g(i, "Invalid state to get top offset: "));
                    return 0;
                }
                return this.V;
            }
            return this.G;
        }
        return x();
    }

    public final boolean z() {
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

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new l40(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.b0 = -1;
        this.e0 = new SparseIntArray();
        this.f0 = new j40(this, 0);
    }

    @Override // defpackage.w11
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
