package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.preference.Preference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] D1;
    public static final d65 E1;
    public static final d75 F1;
    public static boolean x1 = false;
    public static boolean y1 = false;
    public final float A;
    public ArrayList A0;
    public final y65 B;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public l65 F0;
    public EdgeEffect G0;
    public EdgeEffect H0;
    public EdgeEffect I0;
    public EdgeEffect J0;
    public m65 K0;
    public final w65 L;
    public int L0;
    public int M0;
    public VelocityTracker N0;
    public int O0;
    public int P0;
    public int Q0;
    public z65 R;
    public int R0;
    public int S0;
    public s65 T0;
    public final int U0;
    public final int V0;
    public final float W0;
    public final float X0;
    public boolean Y0;
    public final f75 Z0;
    public yk2 a1;
    public final yp0 b1;
    public final y9 c0;
    public final c75 c1;
    public final vh0 d0;
    public t65 d1;
    public final wv6 e0;
    public ArrayList e1;
    public boolean f0;
    public boolean f1;
    public final c65 g0;
    public boolean g1;
    public final Rect h0;
    public final e65 h1;
    public final Rect i0;
    public boolean i1;
    public final RectF j0;
    public i75 j1;
    public g65 k0;
    public final int[] k1;
    public q65 l0;
    public d64 l1;
    public final ArrayList m0;
    public final int[] m1;
    public final ArrayList n0;
    public final int[] n1;
    public final ArrayList o0;
    public final int[] o1;
    public b52 p0;
    public final ArrayList p1;
    public boolean q0;
    public final c65 q1;
    public boolean r0;
    public boolean r1;
    public boolean s0;
    public int s1;
    public int t0;
    public int t1;
    public boolean u0;
    public final boolean u1;
    public boolean v0;
    public final e65 v1;
    public boolean w0;
    public final jf1 w1;
    public int x0;
    public boolean y0;
    public final AccessibilityManager z0;
    public static final int[] z1 = {16843830};
    public static final float A1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean B1 = true;
    public static final boolean C1 = true;

    /* JADX WARN: Type inference failed for: r0v10, types: [d75, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        D1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E1 = new d65(0);
        F1 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, m65, oa1] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v17, types: [c75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [y9, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yp0 yp0Var;
        float a;
        float a2;
        boolean z;
        int i2;
        char c;
        TypedArray typedArray;
        ?? r18;
        char c2;
        AttributeSet attributeSet2;
        int i3;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.B = new y65(this);
        this.L = new w65(this);
        this.e0 = new wv6(4);
        this.g0 = new c65(this, 0);
        this.h0 = new Rect();
        this.i0 = new Rect();
        this.j0 = new RectF();
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.t0 = 0;
        this.B0 = false;
        this.C0 = false;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = F1;
        ?? obj = new Object();
        obj.a = null;
        obj.b = new ArrayList();
        obj.c = 120L;
        obj.d = 120L;
        obj.e = 250L;
        obj.f = 250L;
        obj.g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.l = new ArrayList();
        obj.m = new ArrayList();
        obj.n = new ArrayList();
        obj.o = new ArrayList();
        obj.p = new ArrayList();
        obj.q = new ArrayList();
        obj.r = new ArrayList();
        this.K0 = obj;
        this.L0 = 0;
        this.M0 = -1;
        this.W0 = Float.MIN_VALUE;
        this.X0 = Float.MIN_VALUE;
        this.Y0 = true;
        this.Z0 = new f75(this);
        if (C1) {
            yp0Var = new yp0(2);
        } else {
            yp0Var = null;
        }
        this.b1 = yp0Var;
        ?? obj2 = new Object();
        obj2.a = -1;
        obj2.b = 0;
        obj2.c = 0;
        obj2.d = 1;
        obj2.e = 0;
        obj2.f = false;
        obj2.g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.j = false;
        obj2.k = false;
        this.c1 = obj2;
        this.f1 = false;
        this.g1 = false;
        e65 e65Var = new e65(this);
        this.h1 = e65Var;
        this.i1 = false;
        this.k1 = new int[2];
        this.m1 = new int[2];
        this.n1 = new int[2];
        this.o1 = new int[2];
        this.p1 = new ArrayList();
        this.q1 = new c65(this, 1);
        this.s1 = 0;
        this.t1 = 0;
        this.v1 = new e65(this);
        this.w1 = new jf1(getContext(), new e65(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.S0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = ga7.a;
            a = cr0.j(viewConfiguration);
        } else {
            a = ga7.a(viewConfiguration, context);
        }
        this.W0 = a;
        if (i4 >= 26) {
            a2 = cr0.k(viewConfiguration);
        } else {
            a2 = ga7.a(viewConfiguration, context);
        }
        this.X0 = a2;
        this.U0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.V0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.K0.a = e65Var;
        e65 e65Var2 = new e65(this);
        ?? obj3 = new Object();
        obj3.b = new pq4(30);
        obj3.c = new ArrayList();
        obj3.d = new ArrayList();
        obj3.a = 0;
        obj3.e = e65Var2;
        obj3.f = new ka3(20, (Object) obj3);
        this.c0 = obj3;
        this.d0 = new vh0(new e65(this));
        WeakHashMap weakHashMap = aa7.a;
        if (i4 >= 26) {
            i2 = u97.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i4 >= 26) {
            u97.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.z0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i75(this));
        int[] iArr = yx4.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        aa7.m(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f0 = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c2 = 2;
                r18 = 1;
                attributeSet2 = attributeSet;
                typedArray = obtainStyledAttributes;
                c = 3;
                i3 = i;
                new b52(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                i.i("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
        } else {
            c = 3;
            typedArray = obtainStyledAttributes;
            r18 = 1;
            c2 = 2;
            attributeSet2 = attributeSet;
            i3 = i;
        }
        typedArray.recycle();
        this.u1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(q65.class);
                    try {
                        constructor = asSubclass.getConstructor(D1);
                        objArr = new Object[4];
                        objArr[0] = context;
                        objArr[r18] = attributeSet2;
                        objArr[c2] = Integer.valueOf(i3);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(r18);
                    setLayoutManager((q65) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    c44.f(attributeSet2.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    c44.f(attributeSet2.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    c44.f(attributeSet2.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    c44.f(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    c44.f(attributeSet2.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = z1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i3, 0);
        aa7.m(this, context, iArr2, attributeSet2, obtainStyledAttributes2, i3);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView H = H(viewGroup.getChildAt(i));
            if (H != null) {
                return H;
            }
        }
        return null;
    }

    public static g75 N(View view) {
        if (view == null) {
            return null;
        }
        return ((r65) view.getLayoutParams()).a;
    }

    private d64 getScrollingChildHelper() {
        if (this.l1 == null) {
            this.l1 = new d64(this);
        }
        return this.l1;
    }

    public static void l(g75 g75Var) {
        WeakReference weakReference = g75Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != g75Var.a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            g75Var.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && jv3.z(edgeEffect) != A1) {
            int round = Math.round(jv3.O(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i < 0 && edgeEffect2 != null && jv3.z(edgeEffect2) != A1) {
            float f = i2;
            int round2 = Math.round(jv3.O(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        x1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        y1 = z;
    }

    public final void A() {
        if (this.I0 != null) {
            return;
        }
        ((d75) this.F0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I0 = edgeEffect;
        if (this.f0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.H0 != null) {
            return;
        }
        ((d75) this.F0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H0 = edgeEffect;
        if (this.f0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.k0 + ", layout:" + this.l0 + ", context:" + getContext();
    }

    public final void D(c75 c75Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.Z0.L;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c75Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c75Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View E(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.o0
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            b52 r5 = (defpackage.b52) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.p0 = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(android.view.MotionEvent):boolean");
    }

    public final void G(int[] iArr) {
        vh0 vh0Var = this.d0;
        int n = vh0Var.n();
        if (n == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Preference.DEFAULT_ORDER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < n; i3++) {
            g75 N = N(vh0Var.m(i3));
            if (!N.o()) {
                int b = N.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final g75 I(int i) {
        g75 g75Var = null;
        if (this.B0) {
            return null;
        }
        vh0 vh0Var = this.d0;
        int q = vh0Var.q();
        for (int i2 = 0; i2 < q; i2++) {
            g75 N = N(vh0Var.p(i2));
            if (N != null && !N.h() && K(N) == i) {
                if (((ArrayList) vh0Var.b).contains(N.a)) {
                    g75Var = N;
                } else {
                    return N;
                }
            }
        }
        return g75Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0210, code lost:
        if (r1 < r14) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(int, int, int, int):boolean");
    }

    public final int K(g75 g75Var) {
        if ((g75Var.j & 524) == 0 && g75Var.e()) {
            int i = g75Var.c;
            ArrayList arrayList = (ArrayList) this.c0.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                x9 x9Var = (x9) arrayList.get(i2);
                int i3 = x9Var.a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = x9Var.b;
                            if (i4 == i) {
                                i = x9Var.d;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (x9Var.d <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = x9Var.b;
                        if (i5 <= i) {
                            int i6 = x9Var.d;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (x9Var.b <= i) {
                    i += x9Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long L(g75 g75Var) {
        if (this.k0.b) {
            return g75Var.e;
        }
        return g75Var.c;
    }

    public final g75 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            vd6.g("View ", view, " is not a direct child of ", this);
            return null;
        }
        return N(view);
    }

    public final Rect O(View view) {
        r65 r65Var = (r65) view.getLayoutParams();
        boolean z = r65Var.c;
        Rect rect = r65Var.b;
        if (z) {
            c75 c75Var = this.c1;
            if (!c75Var.g || (!r65Var.a.k() && !r65Var.a.f())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.n0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.h0;
                    rect2.set(0, 0, 0, 0);
                    ((n65) arrayList.get(i)).a(rect2, view, this, c75Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                r65Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean P() {
        if (this.s0 && !this.B0 && !this.c0.j()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.D0 > 0) {
            return true;
        }
        return false;
    }

    public final void R(int i) {
        if (this.l0 == null) {
            return;
        }
        setScrollState(2);
        this.l0.q0(i);
        awakenScrollBars();
    }

    public final void S() {
        vh0 vh0Var = this.d0;
        int q = vh0Var.q();
        for (int i = 0; i < q; i++) {
            ((r65) vh0Var.p(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.L.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r65 r65Var = (r65) ((g75) arrayList.get(i2)).a.getLayoutParams();
            if (r65Var != null) {
                r65Var.c = true;
            }
        }
    }

    public final void T(int i, boolean z, int i2) {
        int i3 = i + i2;
        vh0 vh0Var = this.d0;
        int q = vh0Var.q();
        for (int i4 = 0; i4 < q; i4++) {
            g75 N = N(vh0Var.p(i4));
            if (N != null && !N.o()) {
                int i5 = N.c;
                c75 c75Var = this.c1;
                if (i5 >= i3) {
                    if (y1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + N + " now at position " + (N.c - i2));
                    }
                    N.l(-i2, z);
                    c75Var.f = true;
                } else if (i5 >= i) {
                    if (y1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + N + " now REMOVED");
                    }
                    N.a(8);
                    N.l(-i2, z);
                    N.c = i - 1;
                    c75Var.f = true;
                }
            }
        }
        w65 w65Var = this.L;
        ArrayList arrayList = (ArrayList) w65Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g75 g75Var = (g75) arrayList.get(size);
            if (g75Var != null) {
                int i6 = g75Var.c;
                if (i6 >= i3) {
                    if (y1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + g75Var + " now at position " + (g75Var.c - i2));
                    }
                    g75Var.l(-i2, z);
                } else if (i6 >= i) {
                    g75Var.a(8);
                    w65Var.k(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.D0++;
    }

    public final void V(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.D0 - 1;
        this.D0 = i2;
        if (i2 < 1) {
            if (x1 && i2 < 0) {
                i.n("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.D0 = 0;
            if (z) {
                int i3 = this.x0;
                this.x0 = 0;
                if (i3 != 0 && (accessibilityManager = this.z0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.p1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g75 g75Var = (g75) arrayList.get(size);
                    if (g75Var.a.getParent() == this && !g75Var.o() && (i = g75Var.q) != -1) {
                        g75Var.a.setImportantForAccessibility(i);
                        g75Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.M0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.Q0 = x;
            this.O0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.R0 = y;
            this.P0 = y;
        }
    }

    public final void X() {
        if (!this.i1 && this.q0) {
            WeakHashMap weakHashMap = aa7.a;
            postOnAnimation(this.q1);
            this.i1 = true;
        }
    }

    public final void Y() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.B0;
        y9 y9Var = this.c0;
        boolean z6 = false;
        if (z5) {
            y9Var.r((ArrayList) y9Var.c);
            y9Var.r((ArrayList) y9Var.d);
            y9Var.a = 0;
            if (this.C0) {
                this.l0.Z();
            }
        }
        if (this.K0 != null && this.l0.C0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y9Var.q();
        } else {
            y9Var.d();
        }
        if (!this.f1 && !this.g1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.s0 && this.K0 != null && (((z4 = this.B0) || z2 || this.l0.f) && (!z4 || this.k0.b))) {
            z3 = true;
        } else {
            z3 = false;
        }
        c75 c75Var = this.c1;
        c75Var.j = z3;
        if (z3 && z2 && !this.B0 && this.K0 != null && this.l0.C0()) {
            z6 = true;
        }
        c75Var.k = z6;
    }

    public final void Z(boolean z) {
        this.C0 = z | this.C0;
        this.B0 = true;
        vh0 vh0Var = this.d0;
        int q = vh0Var.q();
        for (int i = 0; i < q; i++) {
            g75 N = N(vh0Var.p(i));
            if (N != null && !N.o()) {
                N.a(6);
            }
        }
        S();
        w65 w65Var = this.L;
        ArrayList arrayList = (ArrayList) w65Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g75 g75Var = (g75) arrayList.get(i2);
            if (g75Var != null) {
                g75Var.a(6);
                g75Var.a(1024);
            }
        }
        g65 g65Var = ((RecyclerView) w65Var.h).k0;
        if (g65Var != null && g65Var.b) {
            return;
        }
        w65Var.j();
    }

    public final void a0(g75 g75Var, hj7 hj7Var) {
        g75Var.j &= -8193;
        boolean z = this.c1.h;
        wv6 wv6Var = this.e0;
        if (z && g75Var.k() && !g75Var.h() && !g75Var.o()) {
            ((cs3) wv6Var.L).g(L(g75Var), g75Var);
        }
        m66 m66Var = (m66) wv6Var.B;
        la7 la7Var = (la7) m66Var.get(g75Var);
        if (la7Var == null) {
            la7Var = la7.a();
            m66Var.put(g75Var, la7Var);
        }
        la7Var.b = hj7Var;
        la7Var.a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            q65Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        boolean z;
        EdgeEffect edgeEffect = this.G0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.G0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.H0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.H0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.I0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.J0.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final int c0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.G0;
        float f2 = A1;
        if (edgeEffect != null && jv3.z(edgeEffect) != A1) {
            boolean canScrollHorizontally = canScrollHorizontally(-1);
            EdgeEffect edgeEffect2 = this.G0;
            if (canScrollHorizontally) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -jv3.O(edgeEffect2, -width, 1.0f - height);
                if (jv3.z(this.G0) == A1) {
                    this.G0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.I0;
            if (edgeEffect3 != null && jv3.z(edgeEffect3) != A1) {
                boolean canScrollHorizontally2 = canScrollHorizontally(1);
                EdgeEffect edgeEffect4 = this.I0;
                if (canScrollHorizontally2) {
                    edgeEffect4.onRelease();
                } else {
                    float O = jv3.O(edgeEffect4, width, height);
                    if (jv3.z(this.I0) == A1) {
                        this.I0.onRelease();
                    }
                    f2 = O;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof r65) && this.l0.f((r65) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.d()) {
            return this.l0.j(this.c1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.d()) {
            return this.l0.k(this.c1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.d()) {
            return this.l0.l(this.c1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.e()) {
            return this.l0.m(this.c1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.e()) {
            return this.l0.n(this.c1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        q65 q65Var = this.l0;
        if (q65Var != null && q65Var.e()) {
            return this.l0.o(this.c1);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.H0;
        float f2 = A1;
        if (edgeEffect != null && jv3.z(edgeEffect) != A1) {
            boolean canScrollVertically = canScrollVertically(-1);
            EdgeEffect edgeEffect2 = this.H0;
            if (canScrollVertically) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -jv3.O(edgeEffect2, -height, width);
                if (jv3.z(this.H0) == A1) {
                    this.H0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.J0;
            if (edgeEffect3 != null && jv3.z(edgeEffect3) != A1) {
                boolean canScrollVertically2 = canScrollVertically(1);
                EdgeEffect edgeEffect4 = this.J0;
                if (canScrollVertically2) {
                    edgeEffect4.onRelease();
                } else {
                    float O = jv3.O(edgeEffect4, height, 1.0f - width);
                    if (jv3.z(this.J0) == A1) {
                        this.J0.onRelease();
                    }
                    f2 = O;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q65 layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 92 && keyCode != 93) {
                    if (keyCode == 122 || keyCode == 123) {
                        boolean L = layoutManager.L();
                        if (keyCode == 122) {
                            if (L) {
                                i = getAdapter().a();
                            }
                        } else if (!L) {
                            i = getAdapter().a();
                        }
                        k0(i);
                        return true;
                    }
                } else {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        j0(0, false, measuredHeight);
                        return true;
                    }
                    j0(0, false, -measuredHeight);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 92 && keyCode2 != 93) {
                    if (keyCode2 == 122 || keyCode2 == 123) {
                        boolean L2 = layoutManager.L();
                        if (keyCode2 == 122) {
                            if (L2) {
                                i = getAdapter().a();
                            }
                        } else if (!L2) {
                            i = getAdapter().a();
                        }
                        k0(i);
                        return true;
                    }
                } else {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        j0(measuredWidth, false, 0);
                        return true;
                    }
                    j0(-measuredWidth, false, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((n65) arrayList.get(i3)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.G0;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f0) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, A1);
            EdgeEffect edgeEffect2 = this.G0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.H0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.H0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.I0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f0) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.I0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.J0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.J0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.K0 == null || arrayList.size() <= 0 || !this.K0.f()) {
            z5 = z;
        }
        if (z5) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r65) {
            r65 r65Var = (r65) layoutParams;
            if (!r65Var.c) {
                Rect rect2 = r65Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        q65 q65Var = this.l0;
        boolean z2 = !this.s0;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        q65Var.n0(this, view, this.h0, z2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f0(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0168, code lost:
        if (r16 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0175, code lost:
        if (r5 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0178, code lost:
        if (r16 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017b, code lost:
        if (r5 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0183, code lost:
        if ((r5 * r6) <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x018b, code lost:
        if ((r5 * r6) >= 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        g75 g75Var;
        l0();
        U();
        Trace.beginSection("RV Scroll");
        c75 c75Var = this.c1;
        D(c75Var);
        w65 w65Var = this.L;
        if (i != 0) {
            i3 = this.l0.p0(i, w65Var, c75Var);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.l0.r0(i2, w65Var, c75Var);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        vh0 vh0Var = this.d0;
        int n = vh0Var.n();
        for (int i5 = 0; i5 < n; i5++) {
            View m = vh0Var.m(i5);
            g75 M = M(m);
            if (M != null && (g75Var = M.i) != null) {
                View view = g75Var.a;
                int left = m.getLeft();
                int top = m.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            return q65Var.r();
        }
        i.n("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            return q65Var.s(getContext(), attributeSet);
        }
        i.n("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g65 getAdapter() {
        return this.k0;
    }

    @Override // android.view.View
    public int getBaseline() {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            q65Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f0;
    }

    public i75 getCompatAccessibilityDelegate() {
        return this.j1;
    }

    public l65 getEdgeEffectFactory() {
        return this.F0;
    }

    public m65 getItemAnimator() {
        return this.K0;
    }

    public int getItemDecorationCount() {
        return this.n0.size();
    }

    public q65 getLayoutManager() {
        return this.l0;
    }

    public int getMaxFlingVelocity() {
        return this.V0;
    }

    public int getMinFlingVelocity() {
        return this.U0;
    }

    public long getNanoTime() {
        if (C1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s65 getOnFlingListener() {
        return this.T0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.Y0;
    }

    public v65 getRecycledViewPool() {
        return this.L.c();
    }

    public int getScrollState() {
        return this.L0;
    }

    public final void h(g75 g75Var) {
        boolean z;
        View view = g75Var.a;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.L.p(M(view));
        boolean j = g75Var.j();
        vh0 vh0Var = this.d0;
        if (j) {
            vh0Var.g(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            vh0Var.f(view, -1, true);
        } else {
            int indexOfChild = ((e65) vh0Var.d).A.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((yj) vh0Var.e).j(indexOfChild);
                vh0Var.r(view);
                return;
            }
            f81.x(view, "view is not a child, cannot hide ");
        }
    }

    public final void h0(int i) {
        if (this.v0) {
            return;
        }
        p0();
        q65 q65Var = this.l0;
        if (q65Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        q65Var.q0(i);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(n65 n65Var) {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            q65Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.n0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(n65Var);
        S();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i, int i2) {
        if (i <= 0) {
            float f = this.A * 0.015f;
            double log = Math.log((Math.abs(-i) * 0.35f) / f);
            double d = A1;
            if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < jv3.z(edgeEffect) * i2) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(t65 t65Var) {
        if (this.e1 == null) {
            this.e1 = new ArrayList();
        }
        this.e1.add(t65Var);
    }

    public final void j0(int i, boolean z, int i2) {
        q65 q65Var = this.l0;
        if (q65Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.v0) {
            int i3 = 0;
            if (!q65Var.d()) {
                i = 0;
            }
            if (!this.l0.e()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().g(i3, 1);
            }
            this.Z0.c(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                i.n("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
            } else {
                i.n(str);
            }
        } else if (this.E0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
        }
    }

    public final void k0(int i) {
        if (this.v0) {
            return;
        }
        q65 q65Var = this.l0;
        if (q65Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            q65Var.A0(this, i);
        }
    }

    public final void l0() {
        int i = this.t0 + 1;
        this.t0 = i;
        if (i == 1 && !this.v0) {
            this.u0 = false;
        }
    }

    public final void m() {
        vh0 vh0Var = this.d0;
        int q = vh0Var.q();
        for (int i = 0; i < q; i++) {
            g75 N = N(vh0Var.p(i));
            if (!N.o()) {
                N.d = -1;
                N.g = -1;
            }
        }
        w65 w65Var = this.L;
        ArrayList arrayList = (ArrayList) w65Var.c;
        ArrayList arrayList2 = (ArrayList) w65Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            g75 g75Var = (g75) arrayList2.get(i2);
            g75Var.d = -1;
            g75Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g75 g75Var2 = (g75) arrayList.get(i3);
            g75Var2.d = -1;
            g75Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) w65Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                g75 g75Var3 = (g75) ((ArrayList) w65Var.d).get(i4);
                g75Var3.d = -1;
                g75Var3.g = -1;
            }
        }
    }

    public final void m0(int i) {
        boolean d = this.l0.d();
        int i2 = d;
        if (this.l0.e()) {
            i2 = (d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void n(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.G0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.G0.onRelease();
            z = this.G0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.I0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.I0.onRelease();
            z |= this.I0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.H0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.H0.onRelease();
            z |= this.H0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.J0.onRelease();
            z |= this.J0.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z) {
        if (this.t0 < 1) {
            if (!x1) {
                this.t0 = 1;
            } else {
                i.n("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            }
        }
        if (!z && !this.v0) {
            this.u0 = false;
        }
        if (this.t0 == 1) {
            if (z && this.u0 && !this.v0 && this.l0 != null && this.k0 != null) {
                s();
            }
            if (!this.v0) {
                this.u0 = false;
            }
        }
        this.t0--;
    }

    public final void o0(int i) {
        getScrollingChildHelper().h(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.D0 = r0
            r1 = 1
            r5.q0 = r1
            boolean r2 = r5.s0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.s0 = r2
            w65 r2 = r5.L
            r2.g()
            q65 r2 = r5.l0
            if (r2 == 0) goto L26
            r2.g = r1
            r2.R(r5)
        L26:
            r5.i1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.C1
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = defpackage.yk2.X
            java.lang.Object r1 = r0.get()
            yk2 r1 = (defpackage.yk2) r1
            r5.a1 = r1
            if (r1 != 0) goto L66
            yk2 r1 = new yk2
            r1.<init>()
            r5.a1 = r1
            java.util.WeakHashMap r1 = defpackage.aa7.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            yk2 r2 = r5.a1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.L = r3
            r0.set(r2)
        L66:
            yk2 r0 = r5.a1
            java.util.ArrayList r0 = r0.A
            boolean r1 = androidx.recyclerview.widget.RecyclerView.x1
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            defpackage.i.n(r5)
            return
        L7b:
            r0.add(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yk2 yk2Var;
        super.onDetachedFromWindow();
        m65 m65Var = this.K0;
        if (m65Var != null) {
            m65Var.e();
        }
        p0();
        int i = 0;
        this.q0 = false;
        q65 q65Var = this.l0;
        if (q65Var != null) {
            q65Var.g = false;
            q65Var.S(this);
        }
        this.p1.clear();
        removeCallbacks(this.q1);
        this.e0.getClass();
        do {
        } while (la7.d.a() != null);
        w65 w65Var = this.L;
        ArrayList arrayList = (ArrayList) w65Var.e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            gk2.w(((g75) arrayList.get(i2)).a);
        }
        w65Var.h(((RecyclerView) w65Var.h).k0, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                ArrayList arrayList2 = gk2.T(childAt).a;
                for (int P = l07.P(arrayList2); -1 < P; P--) {
                    ((da7) arrayList2.get(P)).a.e();
                }
                i = i3;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (C1 && (yk2Var = this.a1) != null) {
            boolean remove = yk2Var.A.remove(this);
            if (x1 && !remove) {
                i.n("RecyclerView removal failed!");
            } else {
                this.a1 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n65) arrayList.get(i)).b(this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        if (this.l0 != null && !this.v0 && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float f3 = A1;
            if (source != 0) {
                if (this.l0.e()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.l0.d()) {
                    f3 = motionEvent.getAxisValue(10);
                }
                f = f3;
                i = 0;
                z = false;
                f3 = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.l0.e()) {
                    float f4 = -f;
                    f = 0.0f;
                    f3 = f4;
                } else if (!this.l0.d()) {
                    f = 0.0f;
                }
                i = 26;
                z = this.u1;
            } else {
                f = 0.0f;
                i = 0;
                z = false;
            }
            int i7 = (int) (f3 * this.X0);
            int i8 = (int) (f * this.W0);
            if (z) {
                OverScroller overScroller = this.Z0.L;
                j0((overScroller.getFinalX() - overScroller.getCurrX()) + i8, true, (overScroller.getFinalY() - overScroller.getCurrY()) + i7);
            } else {
                q65 q65Var = this.l0;
                if (q65Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.v0) {
                    int[] iArr = this.o1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d = q65Var.d();
                    boolean e = this.l0.e();
                    if (e) {
                        i2 = d | 2;
                    } else {
                        i2 = d;
                    }
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int c0 = i8 - c0(i8, y);
                    int d0 = i7 - d0(i7, x);
                    getScrollingChildHelper().g(i2, 1);
                    if (d != 0) {
                        i3 = c0;
                    } else {
                        i3 = 0;
                    }
                    if (e) {
                        i4 = d0;
                    } else {
                        i4 = 0;
                    }
                    if (v(i3, i4, 1, this.o1, this.m1)) {
                        c0 -= iArr[0];
                        d0 -= iArr[1];
                    }
                    if (d != 0) {
                        i5 = c0;
                    } else {
                        i5 = 0;
                    }
                    if (e) {
                        i6 = d0;
                    } else {
                        i6 = 0;
                    }
                    f0(i5, i6, motionEvent, 1);
                    yk2 yk2Var = this.a1;
                    if (yk2Var != null && (c0 != 0 || d0 != 0)) {
                        yk2Var.a(this, c0, d0);
                    }
                    o0(1);
                }
            }
            if (i != 0 && !z) {
                this.w1.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.v0) {
            this.p0 = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.N0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                b0();
                setScrollState(0);
                return true;
            }
            q65 q65Var = this.l0;
            if (q65Var != null) {
                boolean d = q65Var.d();
                boolean e = this.l0.e();
                if (this.N0 == null) {
                    this.N0 = VelocityTracker.obtain();
                }
                this.N0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        W(motionEvent);
                                    }
                                } else {
                                    this.M0 = motionEvent.getPointerId(actionIndex);
                                    int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.Q0 = x;
                                    this.O0 = x;
                                    int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.R0 = y;
                                    this.P0 = y;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.N0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                o0(0);
                                b0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.M0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.M0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.L0 != 1) {
                                int i = x2 - this.O0;
                                int i2 = y2 - this.P0;
                                if (d && Math.abs(i) > this.S0) {
                                    this.Q0 = x2;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (e && Math.abs(i2) > this.S0) {
                                    this.R0 = y2;
                                    z2 = true;
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.N0.clear();
                        o0(0);
                    }
                } else {
                    if (this.w0) {
                        this.w0 = false;
                    }
                    this.M0 = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.Q0 = x3;
                    this.O0 = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.R0 = y3;
                    this.P0 = y3;
                    EdgeEffect edgeEffect = this.G0;
                    if (edgeEffect != null && jv3.z(edgeEffect) != A1 && !canScrollHorizontally(-1)) {
                        jv3.O(this.G0, A1, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    } else {
                        z = false;
                    }
                    EdgeEffect edgeEffect2 = this.I0;
                    if (edgeEffect2 != null && jv3.z(edgeEffect2) != A1 && !canScrollHorizontally(1)) {
                        jv3.O(this.I0, A1, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.H0;
                    if (edgeEffect3 != null && jv3.z(edgeEffect3) != A1 && !canScrollVertically(-1)) {
                        jv3.O(this.H0, A1, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.J0;
                    if (edgeEffect4 != null && jv3.z(edgeEffect4) != A1 && !canScrollVertically(1)) {
                        jv3.O(this.J0, A1, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.L0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.n1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m0(0);
                }
                if (this.L0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.s0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        q65 q65Var = this.l0;
        if (q65Var == null) {
            q(i, i2);
            return;
        }
        boolean K = q65Var.K();
        boolean z = false;
        c75 c75Var = this.c1;
        if (K) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.l0.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.r1 = z;
            if (!z && this.k0 != null) {
                if (c75Var.d == 1) {
                    t();
                }
                this.l0.t0(i, i2);
                c75Var.i = true;
                u();
                this.l0.v0(i, i2);
                if (this.l0.y0()) {
                    this.l0.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    c75Var.i = true;
                    u();
                    this.l0.v0(i, i2);
                }
                this.s1 = getMeasuredWidth();
                this.t1 = getMeasuredHeight();
            }
        } else if (this.r0) {
            this.l0.b.q(i, i2);
        } else {
            if (this.y0) {
                l0();
                U();
                Y();
                V(true);
                if (c75Var.k) {
                    c75Var.g = true;
                } else {
                    this.c0.d();
                    c75Var.g = false;
                }
                this.y0 = false;
                n0(false);
            } else if (c75Var.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g65 g65Var = this.k0;
            if (g65Var != null) {
                c75Var.e = g65Var.a();
            } else {
                c75Var.e = 0;
            }
            l0();
            this.l0.b.q(i, i2);
            n0(false);
            c75Var.g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z65)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z65 z65Var = (z65) parcelable;
        this.R = z65Var;
        super.onRestoreInstanceState(z65Var.A);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r, android.os.Parcelable, z65] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? rVar = new r(super.onSaveInstanceState());
        z65 z65Var = this.R;
        if (z65Var != null) {
            rVar.L = z65Var.L;
            return rVar;
        }
        q65 q65Var = this.l0;
        if (q65Var != null) {
            rVar.L = q65Var.g0();
            return rVar;
        }
        rVar.L = null;
        return rVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.J0 = null;
        this.H0 = null;
        this.I0 = null;
        this.G0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.s0 && !this.B0) {
            y9 y9Var = this.c0;
            if (y9Var.j()) {
                int i = y9Var.a;
                if ((i & 4) != 0 && (i & 11) == 0) {
                    Trace.beginSection("RV PartialInvalidate");
                    l0();
                    U();
                    y9Var.q();
                    if (!this.u0) {
                        vh0 vh0Var = this.d0;
                        int n = vh0Var.n();
                        int i2 = 0;
                        while (true) {
                            if (i2 < n) {
                                g75 N = N(vh0Var.m(i2));
                                if (N != null && !N.o() && N.k()) {
                                    s();
                                    break;
                                }
                                i2++;
                            } else {
                                y9Var.c();
                                break;
                            }
                        }
                    }
                    n0(true);
                    V(true);
                    Trace.endSection();
                    return;
                } else if (y9Var.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        s();
        Trace.endSection();
    }

    public final void p0() {
        go3 go3Var;
        setScrollState(0);
        f75 f75Var = this.Z0;
        f75Var.Z.removeCallbacks(f75Var);
        f75Var.L.abortAnimation();
        q65 q65Var = this.l0;
        if (q65Var != null && (go3Var = q65Var.e) != null) {
            go3Var.i();
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = aa7.a;
        setMeasuredDimension(q65.g(i, paddingRight, getMinimumWidth()), q65.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        N(view);
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BasePreferenceFragment$onCreateRecyclerView$1$2) this.A0.get(size)).getClass();
                view.getClass();
                view.setOnFocusChangeListener(null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        g75 N = N(view);
        if (N != null) {
            if (N.j()) {
                N.j &= -257;
            } else if (!N.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N);
                i.j(sb, C());
                return;
            }
        } else if (x1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            i.j(sb2, C());
            return;
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        go3 go3Var = this.l0.e;
        if ((go3Var == null || !go3Var.e) && !Q() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.l0.n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b52) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t0 == 0 && !this.v0) {
            super.requestLayout();
        } else {
            this.u0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0344, code lost:
        if (((java.util.ArrayList) r7.b).contains(getFocusedChild()) == false) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e7  */
    /* JADX WARN: Type inference failed for: r14v7, types: [hj7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        q65 q65Var = this.l0;
        if (q65Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.v0) {
            boolean d = q65Var.d();
            boolean e = this.l0.e();
            if (!d && !e) {
                return;
            }
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            f0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (Q()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.x0 |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(i75 i75Var) {
        this.j1 = i75Var;
        aa7.n(this, i75Var);
    }

    public void setAdapter(g65 g65Var) {
        setLayoutFrozen(false);
        g65 g65Var2 = this.k0;
        y65 y65Var = this.B;
        if (g65Var2 != null) {
            g65Var2.a.unregisterObserver(y65Var);
            this.k0.getClass();
        }
        m65 m65Var = this.K0;
        if (m65Var != null) {
            m65Var.e();
        }
        q65 q65Var = this.l0;
        w65 w65Var = this.L;
        if (q65Var != null) {
            q65Var.j0(w65Var);
            this.l0.k0(w65Var);
        }
        ((ArrayList) w65Var.c).clear();
        w65Var.j();
        y9 y9Var = this.c0;
        y9Var.r((ArrayList) y9Var.c);
        y9Var.r((ArrayList) y9Var.d);
        y9Var.a = 0;
        g65 g65Var3 = this.k0;
        this.k0 = g65Var;
        if (g65Var != null) {
            g65Var.a.registerObserver(y65Var);
            g65Var.d(this);
        }
        q65 q65Var2 = this.l0;
        if (q65Var2 != null) {
            q65Var2.Q();
        }
        g65 g65Var4 = this.k0;
        ((ArrayList) w65Var.c).clear();
        w65Var.j();
        w65Var.h(g65Var3, true);
        v65 c = w65Var.c();
        if (g65Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                u65 u65Var = (u65) sparseArray.valueAt(i);
                ArrayList arrayList = u65Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    gk2.w(((g75) obj).a);
                }
                u65Var.a.clear();
            }
        }
        if (g65Var4 != null) {
            c.b++;
        }
        w65Var.g();
        this.c1.f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k65 k65Var) {
        if (k65Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f0) {
            this.J0 = null;
            this.H0 = null;
            this.I0 = null;
            this.G0 = null;
        }
        this.f0 = z;
        super.setClipToPadding(z);
        if (this.s0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l65 l65Var) {
        l65Var.getClass();
        this.F0 = l65Var;
        this.J0 = null;
        this.H0 = null;
        this.I0 = null;
        this.G0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.r0 = z;
    }

    public void setItemAnimator(m65 m65Var) {
        m65 m65Var2 = this.K0;
        if (m65Var2 != null) {
            m65Var2.e();
            this.K0.a = null;
        }
        this.K0 = m65Var;
        if (m65Var != null) {
            m65Var.a = this.h1;
        }
    }

    public void setItemViewCacheSize(int i) {
        w65 w65Var = this.L;
        w65Var.a = i;
        w65Var.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(q65 q65Var) {
        RecyclerView recyclerView;
        if (q65Var == this.l0) {
            return;
        }
        p0();
        q65 q65Var2 = this.l0;
        w65 w65Var = this.L;
        if (q65Var2 != null) {
            m65 m65Var = this.K0;
            if (m65Var != null) {
                m65Var.e();
            }
            this.l0.j0(w65Var);
            this.l0.k0(w65Var);
            ((ArrayList) w65Var.c).clear();
            w65Var.j();
            if (this.q0) {
                q65 q65Var3 = this.l0;
                q65Var3.g = false;
                q65Var3.S(this);
            }
            this.l0.w0(null);
            this.l0 = null;
        } else {
            ((ArrayList) w65Var.c).clear();
            w65Var.j();
        }
        vh0 vh0Var = this.d0;
        ((yj) vh0Var.e).i();
        ArrayList arrayList = (ArrayList) vh0Var.b;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((e65) vh0Var.d).A;
            if (size < 0) {
                break;
            }
            g75 N = N((View) arrayList.get(size));
            if (N != null) {
                int i = N.p;
                if (recyclerView.Q()) {
                    N.q = i;
                    recyclerView.p1.add(N);
                } else {
                    N.a.setImportantForAccessibility(i);
                }
                N.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.l0 = q65Var;
        if (q65Var != null) {
            if (q65Var.b == null) {
                q65Var.w0(this);
                if (this.q0) {
                    q65 q65Var4 = this.l0;
                    q65Var4.g = true;
                    q65Var4.R(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(q65Var);
                vd6.h(sb, " is already attached to a RecyclerView:", q65Var.b.C());
                return;
            }
        }
        w65Var.q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            i.i("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        d64 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = aa7.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(s65 s65Var) {
        this.T0 = s65Var;
    }

    @Deprecated
    public void setOnScrollListener(t65 t65Var) {
        this.d1 = t65Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.Y0 = z;
    }

    public void setRecycledViewPool(v65 v65Var) {
        v65 v65Var2;
        w65 w65Var = this.L;
        RecyclerView recyclerView = (RecyclerView) w65Var.h;
        w65Var.h(recyclerView.k0, false);
        if (((v65) w65Var.g) != null) {
            v65Var2.b--;
        }
        w65Var.g = v65Var;
        if (v65Var != null && recyclerView.getAdapter() != null) {
            ((v65) w65Var.g).b++;
        }
        w65Var.g();
    }

    public void setScrollState(int i) {
        go3 go3Var;
        if (i != this.L0) {
            if (y1) {
                StringBuilder s = wh1.s("setting scroll state to ", i, " from ");
                s.append(this.L0);
                Log.d("RecyclerView", s.toString(), new Exception());
            }
            this.L0 = i;
            if (i != 2) {
                f75 f75Var = this.Z0;
                f75Var.Z.removeCallbacks(f75Var);
                f75Var.L.abortAnimation();
                q65 q65Var = this.l0;
                if (q65Var != null && (go3Var = q65Var.e) != null) {
                    go3Var.i();
                }
            }
            q65 q65Var2 = this.l0;
            if (q65Var2 != null) {
                q65Var2.h0(i);
            }
            t65 t65Var = this.d1;
            if (t65Var != null) {
                t65Var.a(i);
            }
            ArrayList arrayList = this.e1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((t65) this.e1.get(size)).a(i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.S0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.S0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e75 e75Var) {
        this.L.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v0) {
            k("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.v0 = false;
                if (this.u0 && this.l0 != null && this.k0 != null) {
                    requestLayout();
                }
                this.u0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, A1, A1, 0));
            this.v0 = true;
            this.w0 = true;
            p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [hj7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [hj7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void u() {
        boolean z;
        l0();
        U();
        c75 c75Var = this.c1;
        c75Var.a(6);
        this.c0.d();
        c75Var.e = this.k0.a();
        c75Var.c = 0;
        if (this.R != null) {
            g65 g65Var = this.k0;
            int ordinal = g65Var.c.ordinal();
            if (ordinal == 1 ? g65Var.a() > 0 : ordinal != 2) {
                Parcelable parcelable = this.R.L;
                if (parcelable != null) {
                    this.l0.f0(parcelable);
                }
                this.R = null;
            }
        }
        c75Var.g = false;
        this.l0.d0(this.L, c75Var);
        c75Var.f = false;
        if (c75Var.j && this.K0 != null) {
            z = true;
        } else {
            z = false;
        }
        c75Var.j = z;
        c75Var.d = 4;
        V(true);
        n0(false);
    }

    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x(int i, int i2) {
        this.E0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        t65 t65Var = this.d1;
        if (t65Var != null) {
            t65Var.b(this, i, i2);
        }
        ArrayList arrayList = this.e1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t65) this.e1.get(size)).b(this, i, i2);
            }
        }
        this.E0--;
    }

    public final void y() {
        if (this.J0 != null) {
            return;
        }
        ((d75) this.F0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J0 = edgeEffect;
        if (this.f0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.G0 != null) {
            return;
        }
        ((d75) this.F0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G0 = edgeEffect;
        if (this.f0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q65 q65Var = this.l0;
        if (q65Var != null) {
            return q65Var.t(layoutParams);
        }
        i.n("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(x65 x65Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }
}
