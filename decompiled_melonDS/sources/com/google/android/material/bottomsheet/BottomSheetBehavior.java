package com.google.android.material.bottomsheet;

import a0.g;
import a6.b;
import a6.p0;
import a6.x0;
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
import b4.a2;
import j6.d;
import j7.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k5.a;
import k7.w;
import m0.l;
import m9.o;
import me.magnum.melonds.R;
import na.h;
import na.j;
import na.n;
import oa.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final a2 A;
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
    public d O;
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

    /* renamed from: a  reason: collision with root package name */
    public final int f2945a;

    /* renamed from: a0  reason: collision with root package name */
    public int f2946a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2947b;

    /* renamed from: b0  reason: collision with root package name */
    public int f2948b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f2949c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2950c0;

    /* renamed from: d  reason: collision with root package name */
    public final int f2951d;

    /* renamed from: d0  reason: collision with root package name */
    public HashMap f2952d0;

    /* renamed from: e  reason: collision with root package name */
    public int f2953e;

    /* renamed from: e0  reason: collision with root package name */
    public final SparseIntArray f2954e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2955f;

    /* renamed from: f0  reason: collision with root package name */
    public final c f2956f0;

    /* renamed from: g  reason: collision with root package name */
    public int f2957g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2958h;

    /* renamed from: i  reason: collision with root package name */
    public final j f2959i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f2960j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2961k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2962l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2963n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2964o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2965p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2966q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2967r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f2968s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2969t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2970u;

    /* renamed from: v  reason: collision with root package name */
    public int f2971v;

    /* renamed from: w  reason: collision with root package name */
    public int f2972w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f2973x;

    /* renamed from: y  reason: collision with root package name */
    public final n f2974y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2975z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.f2945a = 0;
        this.f2947b = true;
        this.f2961k = -1;
        this.f2962l = -1;
        this.A = new a2(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f2948b0 = -1;
        this.f2954e0 = new SparseIntArray();
        this.f2956f0 = new c(this, 1);
        this.f2958h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13150a);
        int i10 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2960j = w.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f2974y = n.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952567).a();
        }
        n nVar = this.f2974y;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.f2959i = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.f2960j;
            if (colorStateList != null) {
                this.f2959i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2959i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new s(2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2961k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2962l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            A(i2);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z10 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f2963n = obtainStyledAttributes.getBoolean(14, false);
        boolean z11 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f2947b != z11) {
            this.f2947b = z11;
            if (this.W != null) {
                r();
            }
            C((this.f2947b && this.N == 6) ? i10 : this.N);
            G(this.N, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f2945a = obtainStyledAttributes.getInt(11, 0);
        float f8 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f8 > 0.0f && f8 < 1.0f) {
            this.F = f8;
            if (this.W != null) {
                this.E = (int) ((1.0f - f8) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i11 = peekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    G(this.N, true);
                } else {
                    a0.j.h("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    a0.j.h("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.f2951d = obtainStyledAttributes.getInt(12, 500);
            this.f2964o = obtainStyledAttributes.getBoolean(18, false);
            this.f2965p = obtainStyledAttributes.getBoolean(19, false);
            this.f2966q = obtainStyledAttributes.getBoolean(20, false);
            this.f2967r = obtainStyledAttributes.getBoolean(21, true);
            this.f2968s = obtainStyledAttributes.getBoolean(15, false);
            this.f2969t = obtainStyledAttributes.getBoolean(16, false);
            this.f2970u = obtainStyledAttributes.getBoolean(17, false);
            this.f2973x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f2949c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        a0.j.h("ratio must be a float value between 0 and 1");
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
                for (int i2 = 0; i2 < childCount; i2++) {
                    View v10 = v(viewGroup.getChildAt(i2));
                    if (v10 != null) {
                        return v10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int w(int i2, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i11 = Math.min(size, i11);
            }
            return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
    }

    public final void A(int i2) {
        boolean z10 = this.f2955f;
        if (i2 == -1) {
            if (!z10) {
                this.f2955f = true;
            } else {
                return;
            }
        } else if (!z10 && this.f2953e == i2) {
            return;
        } else {
            this.f2955f = false;
            this.f2953e = Math.max(0, i2);
        }
        I();
    }

    public final void B(int i2) {
        String str;
        int i10;
        if (i2 != 1 && i2 != 2) {
            if (!this.I && i2 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
                return;
            }
            if (i2 == 6 && this.f2947b && y(i2) <= this.D) {
                i10 = 3;
            } else {
                i10 = i2;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                l lVar = new l(this, view, i10);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(lVar);
                    return;
                } else {
                    lVar.run();
                    return;
                }
            }
            C(i2);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i2 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(w.d.s(sb2, str, " should not be set externally."));
    }

    public final void C(int i2) {
        if (this.N != i2) {
            this.N = i2;
            if (i2 != 4 && i2 != 3 && i2 != 6) {
                boolean z10 = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i2 == 3) {
                H(true);
            } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                H(false);
            }
            G(i2, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                F();
                return;
            }
            arrayList.get(0).getClass();
            o.b();
        }
    }

    public final boolean D(View view, float f8) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        int t5 = t();
        if (Math.abs(((f8 * this.S) + view.getTop()) - this.G) / t5 > 0.5f) {
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
            j6.d r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f7482r = r3
            r3 = -1
            r1.f7468c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f7466a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f7482r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f7482r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            b4.a2 r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i2;
        boolean z10;
        b bVar;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            x0.l(view, 524288);
            x0.i(view, 0);
            x0.l(view, 262144);
            x0.i(view, 0);
            x0.l(view, 1048576);
            x0.i(view, 0);
            SparseIntArray sparseIntArray = this.f2954e0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                x0.l(view, i10);
                x0.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f2947b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                bk.a aVar = new bk.a(6, 12, this);
                ArrayList g10 = x0.g(view);
                int i12 = 0;
                while (true) {
                    if (i12 < g10.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((b6.d) g10.get(i12)).f2069a).getLabel())) {
                            i2 = ((b6.d) g10.get(i12)).a();
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 0;
                        int i14 = -1;
                        while (true) {
                            int[] iArr = x0.f536d;
                            if (i13 >= 32 || i14 != -1) {
                                break;
                            }
                            int i15 = iArr[i13];
                            boolean z11 = true;
                            for (int i16 = 0; i16 < g10.size(); i16++) {
                                if (((b6.d) g10.get(i16)).a() != i15) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 &= z10;
                            }
                            if (z11) {
                                i14 = i15;
                            }
                            i13++;
                        }
                        i2 = i14;
                    }
                }
                if (i2 != -1) {
                    b6.d dVar = new b6.d(null, i2, string, aVar, null);
                    View.AccessibilityDelegate e6 = x0.e(view);
                    if (e6 == null) {
                        bVar = null;
                    } else if (e6 instanceof a6.a) {
                        bVar = ((a6.a) e6).f440a;
                    } else {
                        bVar = new b(e6);
                    }
                    if (bVar == null) {
                        bVar = new b();
                    }
                    x0.o(view, bVar);
                    x0.l(view, dVar.a());
                    x0.g(view).add(dVar);
                    x0.i(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.I && this.N != 5) {
                x0.m(view, b6.d.f2063l, new bk.a(5, 12, this));
            }
            int i17 = this.N;
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 6) {
                        x0.m(view, b6.d.f2062k, new bk.a(4, 12, this));
                        x0.m(view, b6.d.f2061j, new bk.a(3, 12, this));
                        return;
                    }
                    return;
                }
                if (this.f2947b) {
                    i11 = 3;
                }
                x0.m(view, b6.d.f2061j, new bk.a(i11, 12, this));
                return;
            }
            if (this.f2947b) {
                i11 = 4;
            }
            x0.m(view, b6.d.f2062k, new bk.a(i11, 12, this));
        }
    }

    public final void G(int i2, boolean z10) {
        boolean z11;
        j jVar;
        if (i2 != 2) {
            if (this.N == 3 && (this.f2973x || z())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f2975z != z11 && (jVar = this.f2959i) != null) {
                this.f2975z = z11;
                ValueAnimator valueAnimator = this.B;
                float f8 = 1.0f;
                if (z10 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f10 = jVar.B.f10153j;
                    if (z11) {
                        f8 = s();
                    }
                    valueAnimator.setFloatValues(f10, f8);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f2975z) {
                    f8 = s();
                }
                h hVar = jVar.B;
                if (hVar.f10153j != f8) {
                    hVar.f10153j = f8;
                    jVar.Y = true;
                    jVar.Z = true;
                    jVar.invalidateSelf();
                }
            }
        }
    }

    public final void H(boolean z10) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f2952d0 == null) {
                        this.f2952d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.W.get() && z10) {
                        this.f2952d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.f2952d0 = null;
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

    @Override // k5.a
    public final void c(k5.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // k5.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // k5.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        int i2;
        d dVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f2946a0 = -1;
                this.f2948b0 = -1;
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
                    this.f2950c0 = false;
                    this.f2946a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x9 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f2948b0 = y10;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x9, y10)) {
                        this.f2946a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f2950c0 = true;
                    }
                }
                if (this.f2946a0 == -1 && !coordinatorLayout.o(view, x9, this.f2948b0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.P = z10;
            }
            if (this.P || (dVar = this.O) == null || !dVar.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i2 = this.f2948b0) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.O.f7467b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [ha.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z10;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f2957g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f2963n && !this.f2955f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f2964o || this.f2965p || this.f2966q || this.f2968s || this.f2969t || this.f2970u || z10) {
                a0.l lVar = new a0.l(z10, this);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f6440a = paddingStart;
                obj.f6441b = paddingEnd;
                obj.f6442c = paddingBottom;
                g gVar = new g(20, lVar, (Object) obj);
                WeakHashMap weakHashMap = x0.f533a;
                p0.k(view, gVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            x0.q(view, new y9.b(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            a.a.T(context, R.attr.motionDurationMedium2, 300);
            a.a.T(context, R.attr.motionDurationShort3, 150);
            a.a.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            j jVar = this.f2959i;
            if (jVar != null) {
                view.setBackground(jVar);
                float f8 = this.H;
                if (f8 == -1.0f) {
                    f8 = view.getElevation();
                }
                jVar.m(f8);
            } else {
                ColorStateList colorStateList = this.f2960j;
                if (colorStateList != null) {
                    p0.h(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f2956f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i10 = this.V;
        int i11 = i10 - height;
        int i12 = this.f2972w;
        if (i11 < i12) {
            boolean z11 = this.f2967r;
            int i13 = this.f2962l;
            if (z11) {
                if (i13 != -1) {
                    i10 = Math.min(i10, i13);
                }
                this.T = i10;
            } else {
                int i14 = i10 - i12;
                if (i13 != -1) {
                    i14 = Math.min(i14, i13);
                }
                this.T = i14;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i15 = this.N;
        if (i15 == 3) {
            int x9 = x();
            WeakHashMap weakHashMap2 = x0.f533a;
            view.offsetTopAndBottom(x9);
        } else if (i15 == 6) {
            int i16 = this.E;
            WeakHashMap weakHashMap3 = x0.f533a;
            view.offsetTopAndBottom(i16);
        } else if (this.I && i15 == 5) {
            int i17 = this.V;
            WeakHashMap weakHashMap4 = x0.f533a;
            view.offsetTopAndBottom(i17);
        } else if (i15 == 4) {
            int i18 = this.G;
            WeakHashMap weakHashMap5 = x0.f533a;
            view.offsetTopAndBottom(i18);
        } else if (i15 == 1 || i15 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = x0.f533a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        o.b();
        return false;
    }

    @Override // k5.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f2961k, marginLayoutParams.width), w(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2962l, marginLayoutParams.height));
        return true;
    }

    @Override // k5.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // k5.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i10, int[] iArr, int i11) {
        View view3;
        if (i11 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i12 = top - i10;
                boolean z10 = this.K;
                boolean z11 = this.L;
                if (i10 > 0) {
                    if (!this.R && !z11 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    } else if (i12 < x()) {
                        int x9 = top - x();
                        iArr[1] = x9;
                        WeakHashMap weakHashMap = x0.f533a;
                        view.offsetTopAndBottom(-x9);
                        C(3);
                    } else if (z10) {
                        iArr[1] = i10;
                        WeakHashMap weakHashMap2 = x0.f533a;
                        view.offsetTopAndBottom(-i10);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i10 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !z11 && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    } else if (!canScrollVertically) {
                        int i13 = this.G;
                        if (i12 > i13 && !this.I) {
                            int i14 = top - i13;
                            iArr[1] = i14;
                            WeakHashMap weakHashMap3 = x0.f533a;
                            view.offsetTopAndBottom(-i14);
                            C(4);
                        } else if (!z10) {
                            return;
                        } else {
                            iArr[1] = i10;
                            WeakHashMap weakHashMap4 = x0.f533a;
                            view.offsetTopAndBottom(-i10);
                            C(1);
                        }
                    }
                }
                u(view.getTop());
                this.Q = i10;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // k5.a
    public final void m(View view, Parcelable parcelable) {
        y9.a aVar = (y9.a) parcelable;
        int i2 = this.f2945a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f2953e = aVar.R;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2947b = aVar.X;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = aVar.Y;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.J = aVar.Z;
            }
        }
        int i10 = aVar.L;
        if (i10 != 1 && i10 != 2) {
            this.N = i10;
        } else {
            this.N = 4;
        }
    }

    @Override // k5.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new y9.a(this);
    }

    @Override // k5.a
    public final boolean o(View view, int i2, int i10) {
        this.Q = 0;
        this.R = false;
        if ((i2 & 2) == 0) {
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
    @Override // k5.a
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
            boolean r5 = r3.f2947b
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
            float r2 = r3.f2949c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.f2946a0
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
            boolean r2 = r3.f2947b
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
            boolean r5 = r3.f2947b
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

    @Override // k5.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.N;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.O;
        if (dVar != null && (this.K || i2 == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2946a0 = -1;
            this.f2948b0 = -1;
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
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.f2948b0 - motionEvent.getY());
            d dVar2 = this.O;
            if (abs > dVar2.f7467b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int t5 = t();
        boolean z10 = this.f2947b;
        int i2 = this.V;
        if (z10) {
            this.G = Math.max(i2 - t5, this.D);
        } else {
            this.G = i2 - t5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            na.j r0 = r5.f2959i
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L89
            na.j r2 = r5.f2959i
            float[] r3 = r2.f10182v0
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            na.h r3 = r2.B
            na.n r3 = r3.f10144a
            na.d r3 = r3.f10202e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
        L41:
            android.view.RoundedCorner r3 = m4.b.g(r0)
            if (r3 == 0) goto L56
            int r3 = m4.b.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = r1
        L57:
            na.j r2 = r5.f2959i
            float[] r4 = r2.f10182v0
            if (r4 == 0) goto L61
            r2 = 0
            r2 = r4[r2]
            goto L6f
        L61:
            na.h r4 = r2.B
            na.n r4 = r4.f10144a
            na.d r4 = r4.f10203f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
        L6f:
            android.view.RoundedCorner r0 = m4.b.q(r0)
            if (r0 == 0) goto L84
            int r0 = m4.b.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            float r1 = r0 / r2
        L84:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i2;
        if (this.f2955f) {
            return Math.min(Math.max(this.f2957g, this.V - ((this.U * 9) / 16)), this.T) + this.f2971v;
        }
        if (!this.f2963n && !this.f2964o && (i2 = this.m) > 0) {
            return Math.max(this.f2953e, i2 + this.f2958h);
        }
        return this.f2953e + this.f2971v;
    }

    public final void u(int i2) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i10 = this.G;
                if (i2 <= i10 && i10 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    o.b();
                }
            }
        }
    }

    public final int x() {
        int i2;
        if (this.f2947b) {
            return this.D;
        }
        if (this.f2967r) {
            i2 = 0;
        } else {
            i2 = this.f2972w;
        }
        return Math.max(this.C, i2);
    }

    public final int y(int i2) {
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return this.E;
                    }
                    a0.j.h(w.d.l(i2, "Invalid state to get top offset: "));
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
        this.f2945a = 0;
        this.f2947b = true;
        this.f2961k = -1;
        this.f2962l = -1;
        this.A = new a2(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f2948b0 = -1;
        this.f2954e0 = new SparseIntArray();
        this.f2956f0 = new c(this, 1);
    }

    @Override // k5.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11, int[] iArr) {
    }
}
