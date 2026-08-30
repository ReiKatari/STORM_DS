package androidx.recyclerview.widget;

import a4.k2;
import a6.h;
import a6.q;
import a6.r;
import a6.r0;
import a6.u;
import a6.y0;
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
import b4.u2;
import c1.h2;
import c5.d;
import d5.j;
import f2.s;
import h1.c3;
import i7.a;
import j6.c;
import j7.a1;
import j7.b1;
import j7.c0;
import j7.c1;
import j7.f1;
import j7.g1;
import j7.h0;
import j7.h1;
import j7.i0;
import j7.i1;
import j7.j1;
import j7.k0;
import j7.l1;
import j7.o0;
import j7.p0;
import j7.q0;
import j7.s1;
import j7.t;
import j7.u0;
import j7.v;
import j7.v0;
import j7.w0;
import j7.x0;
import j7.z0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m9.o;
import me.magnum.melonds.R;
import zd.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] B1;
    public static final c C1;
    public static final g1 D1;

    /* renamed from: v1  reason: collision with root package name */
    public static boolean f1616v1 = false;

    /* renamed from: w1  reason: collision with root package name */
    public static boolean f1617w1 = false;
    public final float A;
    public boolean A0;
    public final b1 B;
    public int B0;
    public int C0;
    public p0 D0;
    public EdgeEffect E0;
    public EdgeEffect F0;
    public EdgeEffect G0;
    public EdgeEffect H0;
    public q0 I0;
    public int J0;
    public int K0;
    public final h2 L;
    public VelocityTracker L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public c1 R;
    public w0 R0;
    public final int S0;
    public final int T0;
    public final float U0;
    public final float V0;
    public boolean W0;
    public final i1 X0;
    public v Y0;
    public final s Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final f1 f1621a1;

    /* renamed from: b0  reason: collision with root package name */
    public final k2 f1622b0;

    /* renamed from: b1  reason: collision with root package name */
    public x0 f1623b1;

    /* renamed from: c0  reason: collision with root package name */
    public final j f1624c0;

    /* renamed from: c1  reason: collision with root package name */
    public ArrayList f1625c1;

    /* renamed from: d0  reason: collision with root package name */
    public final b f1626d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f1627d1;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1628e0;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f1629e1;

    /* renamed from: f0  reason: collision with root package name */
    public final h0 f1630f0;

    /* renamed from: f1  reason: collision with root package name */
    public final i0 f1631f1;

    /* renamed from: g0  reason: collision with root package name */
    public final Rect f1632g0;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f1633g1;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f1634h0;

    /* renamed from: h1  reason: collision with root package name */
    public l1 f1635h1;

    /* renamed from: i0  reason: collision with root package name */
    public final RectF f1636i0;

    /* renamed from: i1  reason: collision with root package name */
    public final int[] f1637i1;

    /* renamed from: j0  reason: collision with root package name */
    public k0 f1638j0;

    /* renamed from: j1  reason: collision with root package name */
    public r f1639j1;

    /* renamed from: k0  reason: collision with root package name */
    public u0 f1640k0;

    /* renamed from: k1  reason: collision with root package name */
    public final int[] f1641k1;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f1642l0;

    /* renamed from: l1  reason: collision with root package name */
    public final int[] f1643l1;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f1644m0;

    /* renamed from: m1  reason: collision with root package name */
    public final int[] f1645m1;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f1646n0;

    /* renamed from: n1  reason: collision with root package name */
    public final ArrayList f1647n1;

    /* renamed from: o0  reason: collision with root package name */
    public t f1648o0;

    /* renamed from: o1  reason: collision with root package name */
    public final h0 f1649o1;
    public boolean p0;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f1650p1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f1651q0;

    /* renamed from: q1  reason: collision with root package name */
    public int f1652q1;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1653r0;

    /* renamed from: r1  reason: collision with root package name */
    public int f1654r1;

    /* renamed from: s0  reason: collision with root package name */
    public int f1655s0;

    /* renamed from: s1  reason: collision with root package name */
    public final boolean f1656s1;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1657t0;

    /* renamed from: t1  reason: collision with root package name */
    public final i0 f1658t1;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1659u0;

    /* renamed from: u1  reason: collision with root package name */
    public final h f1660u1;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1661v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f1662w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f1663x0;

    /* renamed from: y0  reason: collision with root package name */
    public final AccessibilityManager f1664y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1665z0;

    /* renamed from: x1  reason: collision with root package name */
    public static final int[] f1618x1 = {16843830};

    /* renamed from: y1  reason: collision with root package name */
    public static final float f1619y1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: z1  reason: collision with root package name */
    public static final boolean f1620z1 = true;
    public static final boolean A1 = true;

    /* JADX WARN: Type inference failed for: r0v10, types: [j7.g1, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        B1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        C1 = new c(1);
        D1 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [j7.i, java.lang.Object, j7.q0] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v17, types: [j7.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, a4.k2] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class[]] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s sVar;
        float a10;
        float a11;
        boolean z10;
        int i10;
        char c4;
        Throwable th2;
        ?? r19;
        char c10;
        int i11;
        TypedArray typedArray;
        int i12;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.B = new b1(this);
        this.L = new h2(this);
        this.f1626d0 = new b();
        this.f1630f0 = new h0(this, 0);
        this.f1632g0 = new Rect();
        this.f1634h0 = new Rect();
        this.f1636i0 = new RectF();
        this.f1642l0 = new ArrayList();
        this.f1644m0 = new ArrayList();
        this.f1646n0 = new ArrayList();
        this.f1655s0 = 0;
        this.f1665z0 = false;
        this.A0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = D1;
        ?? obj = new Object();
        obj.f7650a = null;
        obj.f7651b = new ArrayList();
        obj.f7652c = 120L;
        obj.f7653d = 120L;
        obj.f7654e = 250L;
        obj.f7655f = 250L;
        obj.f7579g = true;
        obj.f7580h = new ArrayList();
        obj.f7581i = new ArrayList();
        obj.f7582j = new ArrayList();
        obj.f7583k = new ArrayList();
        obj.f7584l = new ArrayList();
        obj.m = new ArrayList();
        obj.f7585n = new ArrayList();
        obj.f7586o = new ArrayList();
        obj.f7587p = new ArrayList();
        obj.f7588q = new ArrayList();
        obj.f7589r = new ArrayList();
        this.I0 = obj;
        this.J0 = 0;
        this.K0 = -1;
        this.U0 = Float.MIN_VALUE;
        this.V0 = Float.MIN_VALUE;
        this.W0 = true;
        this.X0 = new i1(this);
        if (A1) {
            sVar = new s(1);
        } else {
            sVar = null;
        }
        this.Z0 = sVar;
        ?? obj2 = new Object();
        obj2.f7550a = -1;
        obj2.f7551b = 0;
        obj2.f7552c = 0;
        obj2.f7553d = 1;
        obj2.f7554e = 0;
        obj2.f7555f = false;
        obj2.f7556g = false;
        obj2.f7557h = false;
        obj2.f7558i = false;
        obj2.f7559j = false;
        obj2.f7560k = false;
        this.f1621a1 = obj2;
        this.f1627d1 = false;
        this.f1629e1 = false;
        i0 i0Var = new i0(this);
        this.f1631f1 = i0Var;
        this.f1633g1 = false;
        this.f1637i1 = new int[2];
        this.f1641k1 = new int[2];
        this.f1643l1 = new int[2];
        this.f1645m1 = new int[2];
        this.f1647n1 = new ArrayList();
        this.f1649o1 = new h0(this, 1);
        this.f1652q1 = 0;
        this.f1654r1 = 0;
        this.f1658t1 = new i0(this);
        this.f1660u1 = new h(getContext(), new i0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Q0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = y0.f540a;
            a10 = q.c(viewConfiguration);
        } else {
            a10 = y0.a(viewConfiguration, context);
        }
        this.U0 = a10;
        if (i13 >= 26) {
            a11 = q.d(viewConfiguration);
        } else {
            a11 = y0.a(viewConfiguration, context);
        }
        this.V0 = a11;
        this.S0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.T0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        this.I0.f7650a = i0Var;
        i0 i0Var2 = new i0(this);
        ?? obj3 = new Object();
        obj3.f249b = new d(30);
        obj3.f250c = new ArrayList();
        obj3.f251d = new ArrayList();
        obj3.f248a = 0;
        obj3.f252e = i0Var2;
        obj3.f253f = new d2.t(24, (Object) obj3);
        this.f1622b0 = obj3;
        this.f1624c0 = new j(new i0(this));
        WeakHashMap weakHashMap = a6.x0.f533a;
        if (i13 >= 26) {
            i10 = r0.a(this);
        } else {
            i10 = 0;
        }
        if (i10 == 0 && i13 >= 26) {
            r0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1664y0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new l1(this));
        int[] iArr = a.f7026a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        a6.x0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i2);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1628e0 = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c10 = 2;
                r19 = 1;
                typedArray = obtainStyledAttributes;
                i11 = i2;
                c4 = 3;
                th2 = null;
                i12 = 4;
                new t(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                a0.j.h("Trying to set fast scroller without both required drawables.".concat(B()));
                throw null;
            }
        } else {
            c4 = 3;
            th2 = null;
            r19 = 1;
            c10 = 2;
            i11 = i2;
            typedArray = obtainStyledAttributes;
            i12 = 4;
        }
        typedArray.recycle();
        this.f1656s1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e6) {
                                e = e6;
                                th2 = null;
                                fj.j.e(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th2;
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                th2 = null;
                                fj.j.e(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th2;
                            } catch (InstantiationException e11) {
                                e = e11;
                                th2 = null;
                                fj.j.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th2;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                th2 = null;
                                fj.j.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th2;
                            }
                        }
                        ?? asSubclass = Class.forName(str, false, classLoader).asSubclass(u0.class);
                        try {
                            constructor = asSubclass.getConstructor(B1);
                            objArr = new Object[i12];
                            objArr[0] = context;
                            objArr[r19] = attributeSet;
                            objArr[c10] = Integer.valueOf(i11);
                            objArr[c4] = 0;
                        } catch (NoSuchMethodException e13) {
                            try {
                                constructor = asSubclass.getConstructor(th2);
                                objArr = null;
                            } catch (NoSuchMethodException e14) {
                                e14.initCause(e13);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e14);
                            }
                        }
                        constructor.setAccessible(r19);
                        setLayoutManager((u0) constructor.newInstance(objArr));
                    } catch (ClassCastException e15) {
                        fj.j.e(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e15);
                        throw null;
                    }
                } catch (ClassNotFoundException e16) {
                    e = e16;
                } catch (IllegalAccessException e17) {
                    e = e17;
                } catch (InstantiationException e18) {
                    e = e18;
                } catch (InvocationTargetException e19) {
                    e = e19;
                }
            }
        }
        int[] iArr2 = f1618x1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        a6.x0.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i11);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView G = G(viewGroup.getChildAt(i2));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static j1 M(View view) {
        if (view == null) {
            return null;
        }
        return ((v0) view.getLayoutParams()).f7722a;
    }

    public static void N(View view, Rect rect) {
        v0 v0Var = (v0) view.getLayoutParams();
        Rect rect2 = v0Var.f7723b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) v0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) v0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) v0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) v0Var).bottomMargin);
    }

    private r getScrollingChildHelper() {
        if (this.f1639j1 == null) {
            this.f1639j1 = new r(this);
        }
        return this.f1639j1;
    }

    public static void l(j1 j1Var) {
        WeakReference weakReference = j1Var.f7595b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != j1Var.f7594a) {
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
            j1Var.f7595b = null;
        }
    }

    public static int o(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i2 > 0 && edgeEffect != null && a.a.z(edgeEffect) != 0.0f) {
            int round = Math.round(a.a.R(edgeEffect, ((-i2) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        } else if (i2 < 0 && edgeEffect2 != null && a.a.z(edgeEffect2) != 0.0f) {
            float f8 = i10;
            int round2 = Math.round(a.a.R(edgeEffect2, (i2 * 4.0f) / f8, 0.5f) * (f8 / 4.0f));
            if (round2 != i2) {
                edgeEffect2.finish();
            }
            return i2 - round2;
        } else {
            return i2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f1616v1 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f1617w1 = z10;
    }

    public final void A() {
        if (this.F0 != null) {
            return;
        }
        ((g1) this.D0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F0 = edgeEffect;
        if (this.f1628e0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1638j0 + ", layout:" + this.f1640k0 + ", context:" + getContext();
    }

    public final void C(f1 f1Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.X0.L;
            overScroller.getFinalX();
            overScroller.getCurrX();
            f1Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        f1Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View D(android.view.View r3) {
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
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f1646n0
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            j7.t r5 = (j7.t) r5
            int r6 = r5.f7694v
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
            r5.f7695w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f7688p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f7695w = r8
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
            r11.f1648o0 = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.MotionEvent):boolean");
    }

    public final void F(int[] iArr) {
        int i2 = this.f1624c0.i();
        if (i2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Preference.DEFAULT_ORDER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < i2; i12++) {
            j1 M = M(this.f1624c0.h(i12));
            if (!M.o()) {
                int b10 = M.b();
                if (b10 < i10) {
                    i10 = b10;
                }
                if (b10 > i11) {
                    i11 = b10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final j1 H(int i2) {
        j1 j1Var = null;
        if (this.f1665z0) {
            return null;
        }
        int o5 = this.f1624c0.o();
        for (int i10 = 0; i10 < o5; i10++) {
            j1 M = M(this.f1624c0.n(i10));
            if (M != null && !M.h() && J(M) == i2) {
                if (((ArrayList) this.f1624c0.f3863e).contains(M.f7594a)) {
                    j1Var = M;
                } else {
                    return M;
                }
            }
        }
        return j1Var;
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
    public final boolean I(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.I(int, int, int, int):boolean");
    }

    public final int J(j1 j1Var) {
        if ((j1Var.f7603j & 524) == 0 && j1Var.e()) {
            int i2 = j1Var.f7596c;
            ArrayList arrayList = (ArrayList) this.f1622b0.f250c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j7.a aVar = (j7.a) arrayList.get(i10);
                int i11 = aVar.f7486a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 8) {
                            int i12 = aVar.f7487b;
                            if (i12 == i2) {
                                i2 = aVar.f7489d;
                            } else {
                                if (i12 < i2) {
                                    i2--;
                                }
                                if (aVar.f7489d <= i2) {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        int i13 = aVar.f7487b;
                        if (i13 <= i2) {
                            int i14 = aVar.f7489d;
                            if (i13 + i14 <= i2) {
                                i2 -= i14;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (aVar.f7487b <= i2) {
                    i2 += aVar.f7489d;
                }
            }
            return i2;
        }
        return -1;
    }

    public final long K(j1 j1Var) {
        if (this.f1638j0.f7620b) {
            return j1Var.f7598e;
        }
        return j1Var.f7596c;
    }

    public final j1 L(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            fj.j.s("View ", view, " is not a direct child of ", this);
            return null;
        }
        return M(view);
    }

    public final Rect O(View view) {
        v0 v0Var = (v0) view.getLayoutParams();
        boolean z10 = v0Var.f7724c;
        Rect rect = v0Var.f7723b;
        if (z10) {
            f1 f1Var = this.f1621a1;
            if (!f1Var.f7556g || (!v0Var.f7722a.k() && !v0Var.f7722a.f())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f1644m0;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Rect rect2 = this.f1632g0;
                    rect2.set(0, 0, 0, 0);
                    ((j7.r0) arrayList.get(i2)).a(rect2, view, this, f1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                v0Var.f7724c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean P() {
        if (this.f1653r0 && !this.f1665z0 && !this.f1622b0.j()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.B0 > 0) {
            return true;
        }
        return false;
    }

    public final void R(int i2) {
        if (this.f1640k0 == null) {
            return;
        }
        setScrollState(2);
        this.f1640k0.q0(i2);
        awakenScrollBars();
    }

    public final void S() {
        int o5 = this.f1624c0.o();
        for (int i2 = 0; i2 < o5; i2++) {
            ((v0) this.f1624c0.n(i2).getLayoutParams()).f7724c = true;
        }
        ArrayList arrayList = (ArrayList) this.L.f2433e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) ((j1) arrayList.get(i10)).f7594a.getLayoutParams();
            if (v0Var != null) {
                v0Var.f7724c = true;
            }
        }
    }

    public final void T(int i2, boolean z10, int i10) {
        int i11 = i2 + i10;
        int o5 = this.f1624c0.o();
        for (int i12 = 0; i12 < o5; i12++) {
            j1 M = M(this.f1624c0.n(i12));
            if (M != null && !M.o()) {
                int i13 = M.f7596c;
                f1 f1Var = this.f1621a1;
                if (i13 >= i11) {
                    if (f1617w1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + M + " now at position " + (M.f7596c - i10));
                    }
                    M.l(-i10, z10);
                    f1Var.f7555f = true;
                } else if (i13 >= i2) {
                    if (f1617w1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + M + " now REMOVED");
                    }
                    M.a(8);
                    M.l(-i10, z10);
                    M.f7596c = i2 - 1;
                    f1Var.f7555f = true;
                }
            }
        }
        h2 h2Var = this.L;
        ArrayList arrayList = (ArrayList) h2Var.f2433e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j1 j1Var = (j1) arrayList.get(size);
            if (j1Var != null) {
                int i14 = j1Var.f7596c;
                if (i14 >= i11) {
                    if (f1617w1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + j1Var + " now at position " + (j1Var.f7596c - i10));
                    }
                    j1Var.l(-i10, z10);
                } else if (i14 >= i2) {
                    j1Var.a(8);
                    h2Var.k(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.B0++;
    }

    public final void V(boolean z10) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i10 = this.B0 - 1;
        this.B0 = i10;
        if (i10 < 1) {
            if (f1616v1 && i10 < 0) {
                a0.j.p("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
                return;
            }
            this.B0 = 0;
            if (z10) {
                int i11 = this.f1662w0;
                this.f1662w0 = 0;
                if (i11 != 0 && (accessibilityManager = this.f1664y0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1647n1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j1 j1Var = (j1) arrayList.get(size);
                    if (j1Var.f7594a.getParent() == this && !j1Var.o() && (i2 = j1Var.f7609q) != -1) {
                        j1Var.f7594a.setImportantForAccessibility(i2);
                        j1Var.f7609q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K0) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.K0 = motionEvent.getPointerId(i2);
            int x9 = (int) (motionEvent.getX(i2) + 0.5f);
            this.O0 = x9;
            this.M0 = x9;
            int y10 = (int) (motionEvent.getY(i2) + 0.5f);
            this.P0 = y10;
            this.N0 = y10;
        }
    }

    public final void X() {
        if (!this.f1633g1 && this.p0) {
            WeakHashMap weakHashMap = a6.x0.f533a;
            postOnAnimation(this.f1649o1);
            this.f1633g1 = true;
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (this.f1665z0) {
            k2 k2Var = this.f1622b0;
            k2Var.r((ArrayList) k2Var.f250c);
            k2Var.r((ArrayList) k2Var.f251d);
            k2Var.f248a = 0;
            if (this.A0) {
                this.f1640k0.Z();
            }
        }
        if (this.I0 != null && this.f1640k0.C0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k2 k2Var2 = this.f1622b0;
        if (z10) {
            k2Var2.q();
        } else {
            k2Var2.d();
        }
        if (!this.f1627d1 && !this.f1629e1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f1653r0 && this.I0 != null && (((z13 = this.f1665z0) || z11 || this.f1640k0.f7713f) && (!z13 || this.f1638j0.f7620b))) {
            z12 = true;
        } else {
            z12 = false;
        }
        f1 f1Var = this.f1621a1;
        f1Var.f7559j = z12;
        if (z12 && z11 && !this.f1665z0 && this.I0 != null && this.f1640k0.C0()) {
            z14 = true;
        }
        f1Var.f7560k = z14;
    }

    public final void Z(boolean z10) {
        this.A0 = z10 | this.A0;
        this.f1665z0 = true;
        int o5 = this.f1624c0.o();
        for (int i2 = 0; i2 < o5; i2++) {
            j1 M = M(this.f1624c0.n(i2));
            if (M != null && !M.o()) {
                M.a(6);
            }
        }
        S();
        h2 h2Var = this.L;
        ArrayList arrayList = (ArrayList) h2Var.f2433e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1 j1Var = (j1) arrayList.get(i10);
            if (j1Var != null) {
                j1Var.a(6);
                j1Var.a(1024);
            }
        }
        k0 k0Var = ((RecyclerView) h2Var.f2436h).f1638j0;
        if (k0Var != null && k0Var.f7620b) {
            return;
        }
        h2Var.j();
    }

    public final void a0(j1 j1Var, u uVar) {
        j1Var.f7603j &= -8193;
        boolean z10 = this.f1621a1.f7557h;
        b bVar = this.f1626d0;
        if (z10 && j1Var.k() && !j1Var.h() && !j1Var.o()) {
            ((a1.q) bVar.f15045b).g(K(j1Var), j1Var);
        }
        a1.w0 w0Var = (a1.w0) bVar.f15044a;
        s1 s1Var = (s1) w0Var.get(j1Var);
        if (s1Var == null) {
            s1Var = s1.a();
            w0Var.put(j1Var, s1Var);
        }
        s1Var.f7672b = uVar;
        s1Var.f7671a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i10) {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            u0Var.getClass();
        }
        super.addFocusables(arrayList, i2, i10);
    }

    public final void b0() {
        boolean z10;
        EdgeEffect edgeEffect = this.E0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.E0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.F0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.F0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.G0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.H0.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final int c0(int i2, float f8) {
        float height = f8 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.E0;
        float f10 = 0.0f;
        if (edgeEffect != null && a.a.z(edgeEffect) != 0.0f) {
            boolean canScrollHorizontally = canScrollHorizontally(-1);
            EdgeEffect edgeEffect2 = this.E0;
            if (canScrollHorizontally) {
                edgeEffect2.onRelease();
            } else {
                float f11 = -a.a.R(edgeEffect2, -width, 1.0f - height);
                if (a.a.z(this.E0) == 0.0f) {
                    this.E0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.G0;
            if (edgeEffect3 != null && a.a.z(edgeEffect3) != 0.0f) {
                boolean canScrollHorizontally2 = canScrollHorizontally(1);
                EdgeEffect edgeEffect4 = this.G0;
                if (canScrollHorizontally2) {
                    edgeEffect4.onRelease();
                } else {
                    float R = a.a.R(edgeEffect4, width, height);
                    if (a.a.z(this.G0) == 0.0f) {
                        this.G0.onRelease();
                    }
                    f10 = R;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof v0) && this.f1640k0.f((v0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.d()) {
            return this.f1640k0.j(this.f1621a1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.d()) {
            return this.f1640k0.k(this.f1621a1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.d()) {
            return this.f1640k0.l(this.f1621a1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.e()) {
            return this.f1640k0.m(this.f1621a1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.e()) {
            return this.f1640k0.n(this.f1621a1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null && u0Var.e()) {
            return this.f1640k0.o(this.f1621a1);
        }
        return 0;
    }

    public final int d0(int i2, float f8) {
        float width = f8 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.F0;
        float f10 = 0.0f;
        if (edgeEffect != null && a.a.z(edgeEffect) != 0.0f) {
            boolean canScrollVertically = canScrollVertically(-1);
            EdgeEffect edgeEffect2 = this.F0;
            if (canScrollVertically) {
                edgeEffect2.onRelease();
            } else {
                float f11 = -a.a.R(edgeEffect2, -height, width);
                if (a.a.z(this.F0) == 0.0f) {
                    this.F0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.H0;
            if (edgeEffect3 != null && a.a.z(edgeEffect3) != 0.0f) {
                boolean canScrollVertically2 = canScrollVertically(1);
                EdgeEffect edgeEffect4 = this.H0;
                if (canScrollVertically2) {
                    edgeEffect4.onRelease();
                } else {
                    float R = a.a.R(edgeEffect4, height, 1.0f - width);
                    if (a.a.z(this.H0) == 0.0f) {
                        this.H0.onRelease();
                    }
                    f10 = R;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        u0 layoutManager = getLayoutManager();
        int i2 = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 92 && keyCode != 93) {
                    if (keyCode == 122 || keyCode == 123) {
                        boolean L = layoutManager.L();
                        if (keyCode == 122) {
                            if (L) {
                                i2 = getAdapter().a();
                            }
                        } else if (!L) {
                            i2 = getAdapter().a();
                        }
                        k0(i2);
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
                                i2 = getAdapter().a();
                            }
                        } else if (!L2) {
                            i2 = getAdapter().a();
                        }
                        k0(i2);
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
    public final boolean dispatchNestedFling(float f8, float f10, boolean z10) {
        return getScrollingChildHelper().a(f8, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f10) {
        return getScrollingChildHelper().b(f8, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i2, i10, i11, i12, iArr, 0, null);
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
        boolean z10;
        int i2;
        boolean z11;
        boolean z12;
        int i10;
        super.draw(canvas);
        ArrayList arrayList = this.f1644m0;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ((j7.r0) arrayList.get(i11)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.E0;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f1628e0) {
                i10 = getPaddingBottom();
            } else {
                i10 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i10, 0.0f);
            EdgeEffect edgeEffect2 = this.E0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.F0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1628e0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.F0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.G0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f1628e0) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i2, -width);
            EdgeEffect edgeEffect6 = this.G0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.H0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1628e0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.H0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.I0 == null || arrayList.size() <= 0 || !this.I0.f()) {
            z14 = z10;
        }
        if (z14) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1632g0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof v0) {
            v0 v0Var = (v0) layoutParams;
            if (!v0Var.f7724c) {
                Rect rect2 = v0Var.f7723b;
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
        u0 u0Var = this.f1640k0;
        boolean z11 = !this.f1653r0;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0Var.n0(this, view, this.f1632g0, z11, z10);
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

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0164, code lost:
        if (r7 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0184, code lost:
        if (r5 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0187, code lost:
        if (r7 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x018a, code lost:
        if (r5 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0192, code lost:
        if ((r5 * r6) <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x019a, code lost:
        if ((r5 * r6) >= 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
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
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i2, int i10, int[] iArr) {
        int i11;
        int i12;
        j1 j1Var;
        l0();
        U();
        Trace.beginSection("RV Scroll");
        f1 f1Var = this.f1621a1;
        C(f1Var);
        h2 h2Var = this.L;
        if (i2 != 0) {
            i11 = this.f1640k0.p0(i2, h2Var, f1Var);
        } else {
            i11 = 0;
        }
        if (i10 != 0) {
            i12 = this.f1640k0.r0(i10, h2Var, f1Var);
        } else {
            i12 = 0;
        }
        Trace.endSection();
        int i13 = this.f1624c0.i();
        for (int i14 = 0; i14 < i13; i14++) {
            View h2 = this.f1624c0.h(i14);
            j1 L = L(h2);
            if (L != null && (j1Var = L.f7602i) != null) {
                View view = j1Var.f7594a;
                int left = h2.getLeft();
                int top = h2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i12;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            return u0Var.r();
        }
        a0.j.p("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            return u0Var.s(getContext(), attributeSet);
        }
        a0.j.p("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public k0 getAdapter() {
        return this.f1638j0;
    }

    @Override // android.view.View
    public int getBaseline() {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            u0Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i10) {
        return super.getChildDrawingOrder(i2, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1628e0;
    }

    public l1 getCompatAccessibilityDelegate() {
        return this.f1635h1;
    }

    public p0 getEdgeEffectFactory() {
        return this.D0;
    }

    public q0 getItemAnimator() {
        return this.I0;
    }

    public int getItemDecorationCount() {
        return this.f1644m0.size();
    }

    public u0 getLayoutManager() {
        return this.f1640k0;
    }

    public int getMaxFlingVelocity() {
        return this.T0;
    }

    public int getMinFlingVelocity() {
        return this.S0;
    }

    public long getNanoTime() {
        if (A1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public w0 getOnFlingListener() {
        return this.R0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.W0;
    }

    public z0 getRecycledViewPool() {
        return this.L.c();
    }

    public int getScrollState() {
        return this.J0;
    }

    public final void h(j1 j1Var) {
        boolean z10;
        View view = j1Var.f7594a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L.p(L(view));
        boolean j2 = j1Var.j();
        j jVar = this.f1624c0;
        if (j2) {
            jVar.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            jVar.b(view, -1, true);
        } else {
            int indexOfChild = ((i0) jVar.f3861c).A.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((c3) jVar.f3862d).j(indexOfChild);
                jVar.p(view);
                return;
            }
            fj.j.r(view, "view is not a child, cannot hide ");
        }
    }

    public final void h0(int i2) {
        if (this.f1659u0) {
            return;
        }
        p0();
        u0 u0Var = this.f1640k0;
        if (u0Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        u0Var.q0(i2);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(j7.r0 r0Var) {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            u0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1644m0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r0Var);
        S();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i2, int i10) {
        if (i2 <= 0) {
            float f8 = this.A * 0.015f;
            double log = Math.log((Math.abs(-i2) * 0.35f) / f8);
            double d4 = f1619y1;
            if (((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * f8)) < a.a.z(edgeEffect) * i10) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1659u0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f512d;
    }

    public final void j(x0 x0Var) {
        if (this.f1625c1 == null) {
            this.f1625c1 = new ArrayList();
        }
        this.f1625c1.add(x0Var);
    }

    public final void j0(int i2, boolean z10, int i10) {
        u0 u0Var = this.f1640k0;
        if (u0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1659u0) {
            int i11 = 0;
            if (!u0Var.d()) {
                i2 = 0;
            }
            if (!this.f1640k0.e()) {
                i10 = 0;
            }
            if (i2 == 0 && i10 == 0) {
                return;
            }
            if (z10) {
                if (i2 != 0) {
                    i11 = 1;
                }
                if (i10 != 0) {
                    i11 |= 2;
                }
                getScrollingChildHelper().g(i11, 1);
            }
            this.X0.c(i2, i10, Integer.MIN_VALUE, null);
        }
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                a0.j.p("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
            } else {
                a0.j.p(str);
            }
        } else if (this.C0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B()));
        }
    }

    public final void k0(int i2) {
        if (this.f1659u0) {
            return;
        }
        u0 u0Var = this.f1640k0;
        if (u0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            u0Var.A0(this, i2);
        }
    }

    public final void l0() {
        int i2 = this.f1655s0 + 1;
        this.f1655s0 = i2;
        if (i2 == 1 && !this.f1659u0) {
            this.f1657t0 = false;
        }
    }

    public final void m() {
        int o5 = this.f1624c0.o();
        for (int i2 = 0; i2 < o5; i2++) {
            j1 M = M(this.f1624c0.n(i2));
            if (!M.o()) {
                M.f7597d = -1;
                M.f7600g = -1;
            }
        }
        h2 h2Var = this.L;
        ArrayList arrayList = (ArrayList) h2Var.f2431c;
        ArrayList arrayList2 = (ArrayList) h2Var.f2433e;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1 j1Var = (j1) arrayList2.get(i10);
            j1Var.f7597d = -1;
            j1Var.f7600g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j1 j1Var2 = (j1) arrayList.get(i11);
            j1Var2.f7597d = -1;
            j1Var2.f7600g = -1;
        }
        ArrayList arrayList3 = (ArrayList) h2Var.f2432d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                j1 j1Var3 = (j1) ((ArrayList) h2Var.f2432d).get(i12);
                j1Var3.f7597d = -1;
                j1Var3.f7600g = -1;
            }
        }
    }

    public final void m0(int i2) {
        boolean d4 = this.f1640k0.d();
        int i10 = d4;
        if (this.f1640k0.e()) {
            i10 = (d4 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i10, i2);
    }

    public final void n(int i2, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.E0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i2 > 0) {
            this.E0.onRelease();
            z10 = this.E0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.G0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.G0.onRelease();
            z10 |= this.G0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.F0.onRelease();
            z10 |= this.F0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.H0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.H0.onRelease();
            z10 |= this.H0.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z10) {
        if (this.f1655s0 < 1) {
            if (!f1616v1) {
                this.f1655s0 = 1;
            } else {
                a0.j.p("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
                return;
            }
        }
        if (!z10 && !this.f1659u0) {
            this.f1657t0 = false;
        }
        if (this.f1655s0 == 1) {
            if (z10 && this.f1657t0 && !this.f1659u0 && this.f1640k0 != null && this.f1638j0 != null) {
                r();
            }
            if (!this.f1659u0) {
                this.f1657t0 = false;
            }
        }
        this.f1655s0--;
    }

    public final void o0(int i2) {
        getScrollingChildHelper().h(i2);
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
            r5.B0 = r0
            r1 = 1
            r5.p0 = r1
            boolean r2 = r5.f1653r0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f1653r0 = r2
            c1.h2 r2 = r5.L
            r2.g()
            j7.u0 r2 = r5.f1640k0
            if (r2 == 0) goto L26
            r2.f7714g = r1
            r2.R(r5)
        L26:
            r5.f1633g1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = j7.v.X
            java.lang.Object r1 = r0.get()
            j7.v r1 = (j7.v) r1
            r5.Y0 = r1
            if (r1 != 0) goto L66
            j7.v r1 = new j7.v
            r1.<init>()
            r5.Y0 = r1
            java.util.WeakHashMap r1 = a6.x0.f533a
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
            j7.v r2 = r5.Y0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.L = r3
            r0.set(r2)
        L66:
            j7.v r0 = r5.Y0
            java.util.ArrayList r0 = r0.A
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f1616v1
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r0 = "RecyclerView already present in worker list!"
            a0.j.p(r0)
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
        v vVar;
        super.onDetachedFromWindow();
        q0 q0Var = this.I0;
        if (q0Var != null) {
            q0Var.e();
        }
        p0();
        int i2 = 0;
        this.p0 = false;
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            u0Var.f7714g = false;
            u0Var.S(this);
        }
        this.f1647n1.clear();
        removeCallbacks(this.f1649o1);
        this.f1626d0.getClass();
        do {
        } while (s1.f7670d.a() != null);
        h2 h2Var = this.L;
        ArrayList arrayList = (ArrayList) h2Var.f2433e;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ij.a.A(((j1) arrayList.get(i10)).f7594a);
        }
        h2Var.h(((RecyclerView) h2Var.f2436h).f1638j0, false);
        while (i2 < getChildCount()) {
            int i11 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt != null) {
                ArrayList arrayList2 = ij.a.Y(childAt).f6289a;
                for (int l10 = p7.t.l(arrayList2); -1 < l10; l10--) {
                    ((u2) arrayList2.get(l10)).f1950a.c();
                }
                i2 = i11;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (A1 && (vVar = this.Y0) != null) {
            boolean remove = vVar.A.remove(this);
            if (f1616v1 && !remove) {
                a0.j.p("RecyclerView removal failed!");
            } else {
                this.Y0 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1644m0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((j7.r0) arrayList.get(i2)).b(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f8;
        int i2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        if (this.f1640k0 != null && !this.f1659u0 && motionEvent.getAction() == 8) {
            float f11 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f1640k0.e()) {
                    f10 = -motionEvent.getAxisValue(9);
                } else {
                    f10 = 0.0f;
                }
                if (this.f1640k0.d()) {
                    f11 = motionEvent.getAxisValue(10);
                }
                f8 = f11;
                i2 = 0;
                z10 = false;
                f11 = f10;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f8 = motionEvent.getAxisValue(26);
                if (this.f1640k0.e()) {
                    float f12 = -f8;
                    f8 = 0.0f;
                    f11 = f12;
                } else if (!this.f1640k0.d()) {
                    f8 = 0.0f;
                }
                i2 = 26;
                z10 = this.f1656s1;
            } else {
                f8 = 0.0f;
                i2 = 0;
                z10 = false;
            }
            int i15 = (int) (f11 * this.V0);
            int i16 = (int) (f8 * this.U0);
            if (z10) {
                OverScroller overScroller = this.X0.L;
                j0((overScroller.getFinalX() - overScroller.getCurrX()) + i16, true, (overScroller.getFinalY() - overScroller.getCurrY()) + i15);
            } else {
                u0 u0Var = this.f1640k0;
                if (u0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f1659u0) {
                    int[] iArr = this.f1645m1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d4 = u0Var.d();
                    boolean e6 = this.f1640k0.e();
                    if (e6) {
                        i10 = d4 | 2;
                    } else {
                        i10 = d4;
                    }
                    float y10 = motionEvent.getY();
                    float x9 = motionEvent.getX();
                    int c02 = i16 - c0(i16, y10);
                    int d02 = i15 - d0(i15, x9);
                    getScrollingChildHelper().g(i10, 1);
                    if (d4 != 0) {
                        i11 = c02;
                    } else {
                        i11 = 0;
                    }
                    if (e6) {
                        i12 = d02;
                    } else {
                        i12 = 0;
                    }
                    if (u(i11, i12, 1, this.f1645m1, this.f1641k1)) {
                        c02 -= iArr[0];
                        d02 -= iArr[1];
                    }
                    if (d4 != 0) {
                        i13 = c02;
                    } else {
                        i13 = 0;
                    }
                    if (e6) {
                        i14 = d02;
                    } else {
                        i14 = 0;
                    }
                    f0(i13, i14, motionEvent, 1);
                    v vVar = this.Y0;
                    if (vVar != null && (c02 != 0 || d02 != 0)) {
                        vVar.a(this, c02, d02);
                    }
                    o0(1);
                }
            }
            if (i2 != 0 && !z10) {
                this.f1660u1.a(motionEvent, i2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.f1659u0) {
            this.f1648o0 = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.L0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                b0();
                setScrollState(0);
                return true;
            }
            u0 u0Var = this.f1640k0;
            if (u0Var != null) {
                boolean d4 = u0Var.d();
                boolean e6 = this.f1640k0.e();
                if (this.L0 == null) {
                    this.L0 = VelocityTracker.obtain();
                }
                this.L0.addMovement(motionEvent);
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
                                    this.K0 = motionEvent.getPointerId(actionIndex);
                                    int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.O0 = x9;
                                    this.M0 = x9;
                                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.P0 = y10;
                                    this.N0 = y10;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.L0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                o0(0);
                                b0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.K0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.K0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.J0 != 1) {
                                int i2 = x10 - this.M0;
                                int i10 = y11 - this.N0;
                                if (d4 && Math.abs(i2) > this.Q0) {
                                    this.O0 = x10;
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (e6 && Math.abs(i10) > this.Q0) {
                                    this.P0 = y11;
                                    z11 = true;
                                }
                                if (z11) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.L0.clear();
                        o0(0);
                    }
                } else {
                    if (this.f1661v0) {
                        this.f1661v0 = false;
                    }
                    this.K0 = motionEvent.getPointerId(0);
                    int x11 = (int) (motionEvent.getX() + 0.5f);
                    this.O0 = x11;
                    this.M0 = x11;
                    int y12 = (int) (motionEvent.getY() + 0.5f);
                    this.P0 = y12;
                    this.N0 = y12;
                    EdgeEffect edgeEffect = this.E0;
                    if (edgeEffect != null && a.a.z(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                        a.a.R(this.E0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    EdgeEffect edgeEffect2 = this.G0;
                    if (edgeEffect2 != null && a.a.z(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        a.a.R(this.G0, 0.0f, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect3 = this.F0;
                    if (edgeEffect3 != null && a.a.z(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        a.a.R(this.F0, 0.0f, motionEvent.getX() / getWidth());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect4 = this.H0;
                    if (edgeEffect4 != null && a.a.z(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        a.a.R(this.H0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z10 = true;
                    }
                    if (z10 || this.J0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.f1643l1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m0(0);
                }
                if (this.J0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f1653r0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        u0 u0Var = this.f1640k0;
        if (u0Var == null) {
            q(i2, i10);
            return;
        }
        boolean K = u0Var.K();
        boolean z10 = false;
        f1 f1Var = this.f1621a1;
        if (K) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f1640k0.f7709b.q(i2, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f1650p1 = z10;
            if (!z10 && this.f1638j0 != null) {
                if (f1Var.f7553d == 1) {
                    s();
                }
                this.f1640k0.t0(i2, i10);
                f1Var.f7558i = true;
                t();
                this.f1640k0.v0(i2, i10);
                if (this.f1640k0.y0()) {
                    this.f1640k0.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    f1Var.f7558i = true;
                    t();
                    this.f1640k0.v0(i2, i10);
                }
                this.f1652q1 = getMeasuredWidth();
                this.f1654r1 = getMeasuredHeight();
            }
        } else if (this.f1651q0) {
            this.f1640k0.f7709b.q(i2, i10);
        } else {
            if (this.f1663x0) {
                l0();
                U();
                Y();
                V(true);
                if (f1Var.f7560k) {
                    f1Var.f7556g = true;
                } else {
                    this.f1622b0.d();
                    f1Var.f7556g = false;
                }
                this.f1663x0 = false;
                n0(false);
            } else if (f1Var.f7560k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            k0 k0Var = this.f1638j0;
            if (k0Var != null) {
                f1Var.f7554e = k0Var.a();
            } else {
                f1Var.f7554e = 0;
            }
            l0();
            this.f1640k0.f7709b.q(i2, i10);
            n0(false);
            f1Var.f7556g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c1 c1Var = (c1) parcelable;
        this.R = c1Var;
        super.onRestoreInstanceState(c1Var.A);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j7.c1, i6.b, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i6.b(super.onSaveInstanceState());
        c1 c1Var = this.R;
        if (c1Var != null) {
            bVar.L = c1Var.L;
            return bVar;
        }
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            bVar.L = u0Var.g0();
            return bVar;
        }
        bVar.L = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i10, int i11, int i12) {
        super.onSizeChanged(i2, i10, i11, i12);
        if (i2 == i11 && i10 == i12) {
            return;
        }
        this.H0 = null;
        this.F0 = null;
        this.G0 = null;
        this.E0 = null;
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
        if (this.f1653r0 && !this.f1665z0) {
            if (this.f1622b0.j()) {
                k2 k2Var = this.f1622b0;
                int i2 = k2Var.f248a;
                if ((i2 & 4) != 0 && (i2 & 11) == 0) {
                    Trace.beginSection("RV PartialInvalidate");
                    l0();
                    U();
                    this.f1622b0.q();
                    if (!this.f1657t0) {
                        int i10 = this.f1624c0.i();
                        int i11 = 0;
                        while (true) {
                            if (i11 < i10) {
                                j1 M = M(this.f1624c0.h(i11));
                                if (M != null && !M.o() && M.k()) {
                                    r();
                                    break;
                                }
                                i11++;
                            } else {
                                this.f1622b0.c();
                                break;
                            }
                        }
                    }
                    n0(true);
                    V(true);
                    Trace.endSection();
                    return;
                } else if (k2Var.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        r();
        Trace.endSection();
    }

    public final void p0() {
        c0 c0Var;
        setScrollState(0);
        i1 i1Var = this.X0;
        i1Var.Z.removeCallbacks(i1Var);
        i1Var.L.abortAnimation();
        u0 u0Var = this.f1640k0;
        if (u0Var != null && (c0Var = u0Var.f7712e) != null) {
            c0Var.i();
        }
    }

    public final void q(int i2, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = a6.x0.f533a;
        setMeasuredDimension(u0.g(i2, paddingRight, getMinimumWidth()), u0.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0341, code lost:
        if (((java.util.ArrayList) r21.f1624c0.f3863e).contains(getFocusedChild()) == false) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ed  */
    /* JADX WARN: Type inference failed for: r13v10, types: [a6.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r9v0, types: [zd.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        j1 M = M(view);
        if (M != null) {
            if (M.j()) {
                M.f7603j &= -257;
            } else if (!M.o()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(M);
                o.n(sb2, B());
                return;
            }
        } else if (f1616v1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            o.n(sb3, B());
            return;
        }
        view.clearAnimation();
        M(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        c0 c0Var = this.f1640k0.f7712e;
        if ((c0Var == null || !c0Var.f7511e) && !Q() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f1640k0.n0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f1646n0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1655s0 == 0 && !this.f1659u0) {
            super.requestLayout();
        } else {
            this.f1657t0 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [a6.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [a6.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i10) {
        u0 u0Var = this.f1640k0;
        if (u0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1659u0) {
            boolean d4 = u0Var.d();
            boolean e6 = this.f1640k0.e();
            if (!d4 && !e6) {
                return;
            }
            if (!d4) {
                i2 = 0;
            }
            if (!e6) {
                i10 = 0;
            }
            f0(i2, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        if (Q()) {
            int i10 = 0;
            if (accessibilityEvent != null) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i10 = i2;
            }
            this.f1662w0 |= i10;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(l1 l1Var) {
        this.f1635h1 = l1Var;
        a6.x0.o(this, l1Var);
    }

    public void setAdapter(k0 k0Var) {
        setLayoutFrozen(false);
        k0 k0Var2 = this.f1638j0;
        b1 b1Var = this.B;
        if (k0Var2 != null) {
            k0Var2.f7619a.unregisterObserver(b1Var);
            this.f1638j0.getClass();
        }
        q0 q0Var = this.I0;
        if (q0Var != null) {
            q0Var.e();
        }
        u0 u0Var = this.f1640k0;
        h2 h2Var = this.L;
        if (u0Var != null) {
            u0Var.j0(h2Var);
            this.f1640k0.k0(h2Var);
        }
        ((ArrayList) h2Var.f2431c).clear();
        h2Var.j();
        k2 k2Var = this.f1622b0;
        k2Var.r((ArrayList) k2Var.f250c);
        k2Var.r((ArrayList) k2Var.f251d);
        k2Var.f248a = 0;
        k0 k0Var3 = this.f1638j0;
        this.f1638j0 = k0Var;
        if (k0Var != null) {
            k0Var.f7619a.registerObserver(b1Var);
            k0Var.d(this);
        }
        u0 u0Var2 = this.f1640k0;
        if (u0Var2 != null) {
            u0Var2.Q();
        }
        k0 k0Var4 = this.f1638j0;
        ((ArrayList) h2Var.f2431c).clear();
        h2Var.j();
        h2Var.h(k0Var3, true);
        z0 c4 = h2Var.c();
        if (k0Var3 != null) {
            c4.f7751b--;
        }
        if (c4.f7751b == 0) {
            SparseArray sparseArray = c4.f7750a;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                j7.y0 y0Var = (j7.y0) sparseArray.valueAt(i2);
                ArrayList arrayList = y0Var.f7742a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ij.a.A(((j1) obj).f7594a);
                }
                y0Var.f7742a.clear();
            }
        }
        if (k0Var4 != null) {
            c4.f7751b++;
        }
        h2Var.g();
        this.f1621a1.f7555f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f1628e0) {
            this.H0 = null;
            this.F0 = null;
            this.G0 = null;
            this.E0 = null;
        }
        this.f1628e0 = z10;
        super.setClipToPadding(z10);
        if (this.f1653r0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p0 p0Var) {
        p0Var.getClass();
        this.D0 = p0Var;
        this.H0 = null;
        this.F0 = null;
        this.G0 = null;
        this.E0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f1651q0 = z10;
    }

    public void setItemAnimator(q0 q0Var) {
        q0 q0Var2 = this.I0;
        if (q0Var2 != null) {
            q0Var2.e();
            this.I0.f7650a = null;
        }
        this.I0 = q0Var;
        if (q0Var != null) {
            q0Var.f7650a = this.f1631f1;
        }
    }

    public void setItemViewCacheSize(int i2) {
        h2 h2Var = this.L;
        h2Var.f2429a = i2;
        h2Var.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(u0 u0Var) {
        RecyclerView recyclerView;
        if (u0Var == this.f1640k0) {
            return;
        }
        p0();
        u0 u0Var2 = this.f1640k0;
        h2 h2Var = this.L;
        if (u0Var2 != null) {
            q0 q0Var = this.I0;
            if (q0Var != null) {
                q0Var.e();
            }
            this.f1640k0.j0(h2Var);
            this.f1640k0.k0(h2Var);
            ((ArrayList) h2Var.f2431c).clear();
            h2Var.j();
            if (this.p0) {
                u0 u0Var3 = this.f1640k0;
                u0Var3.f7714g = false;
                u0Var3.S(this);
            }
            this.f1640k0.w0(null);
            this.f1640k0 = null;
        } else {
            ((ArrayList) h2Var.f2431c).clear();
            h2Var.j();
        }
        j jVar = this.f1624c0;
        ((c3) jVar.f3862d).i();
        ArrayList arrayList = (ArrayList) jVar.f3863e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((i0) jVar.f3861c).A;
            if (size < 0) {
                break;
            }
            j1 M = M((View) arrayList.get(size));
            if (M != null) {
                int i2 = M.f7608p;
                if (recyclerView.Q()) {
                    M.f7609q = i2;
                    recyclerView.f1647n1.add(M);
                } else {
                    M.f7594a.setImportantForAccessibility(i2);
                }
                M.f7608p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1640k0 = u0Var;
        if (u0Var != null) {
            if (u0Var.f7709b == null) {
                u0Var.w0(this);
                if (this.p0) {
                    u0 u0Var4 = this.f1640k0;
                    u0Var4.f7714g = true;
                    u0Var4.R(this);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(u0Var);
                fj.j.k(sb2, " is already attached to a RecyclerView:", u0Var.f7709b.B());
                return;
            }
        }
        h2Var.q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            a0.j.h("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        r scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f512d) {
            ViewGroup viewGroup = scrollingChildHelper.f511c;
            WeakHashMap weakHashMap = a6.x0.f533a;
            a6.p0.m(viewGroup);
        }
        scrollingChildHelper.f512d = z10;
    }

    public void setOnFlingListener(w0 w0Var) {
        this.R0 = w0Var;
    }

    @Deprecated
    public void setOnScrollListener(x0 x0Var) {
        this.f1623b1 = x0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.W0 = z10;
    }

    public void setRecycledViewPool(z0 z0Var) {
        z0 z0Var2;
        h2 h2Var = this.L;
        RecyclerView recyclerView = (RecyclerView) h2Var.f2436h;
        h2Var.h(recyclerView.f1638j0, false);
        if (((z0) h2Var.f2435g) != null) {
            z0Var2.f7751b--;
        }
        h2Var.f2435g = z0Var;
        if (z0Var != null && recyclerView.getAdapter() != null) {
            ((z0) h2Var.f2435g).f7751b++;
        }
        h2Var.g();
    }

    public void setScrollState(int i2) {
        c0 c0Var;
        if (i2 != this.J0) {
            if (f1617w1) {
                StringBuilder i10 = kc.a.i("setting scroll state to ", i2, " from ");
                i10.append(this.J0);
                Log.d("RecyclerView", i10.toString(), new Exception());
            }
            this.J0 = i2;
            if (i2 != 2) {
                i1 i1Var = this.X0;
                i1Var.Z.removeCallbacks(i1Var);
                i1Var.L.abortAnimation();
                u0 u0Var = this.f1640k0;
                if (u0Var != null && (c0Var = u0Var.f7712e) != null) {
                    c0Var.i();
                }
            }
            u0 u0Var2 = this.f1640k0;
            if (u0Var2 != null) {
                u0Var2.h0(i2);
            }
            x0 x0Var = this.f1623b1;
            if (x0Var != null) {
                x0Var.a(i2);
            }
            ArrayList arrayList = this.f1625c1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((x0) this.f1625c1.get(size)).a(i2);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.Q0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.Q0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(h1 h1Var) {
        this.L.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f1659u0) {
            k("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f1659u0 = false;
                if (this.f1657t0 && this.f1640k0 != null && this.f1638j0 != null) {
                    requestLayout();
                }
                this.f1657t0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1659u0 = true;
            this.f1661v0 = true;
            p0();
        }
    }

    public final void t() {
        boolean z10;
        l0();
        U();
        f1 f1Var = this.f1621a1;
        f1Var.a(6);
        this.f1622b0.d();
        f1Var.f7554e = this.f1638j0.a();
        f1Var.f7552c = 0;
        if (this.R != null) {
            k0 k0Var = this.f1638j0;
            int ordinal = k0Var.f7621c.ordinal();
            if (ordinal == 1 ? k0Var.a() > 0 : ordinal != 2) {
                Parcelable parcelable = this.R.L;
                if (parcelable != null) {
                    this.f1640k0.f0(parcelable);
                }
                this.R = null;
            }
        }
        f1Var.f7556g = false;
        this.f1640k0.d0(this.L, f1Var);
        f1Var.f7555f = false;
        if (f1Var.f7559j && this.I0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.f7559j = z10;
        f1Var.f7553d = 4;
        V(true);
        n0(false);
    }

    public final boolean u(int i2, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i10, i11, iArr, iArr2);
    }

    public final void v(int i2, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i2, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w(int i2, int i10) {
        this.C0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i10);
        x0 x0Var = this.f1623b1;
        if (x0Var != null) {
            x0Var.b(this, i2, i10);
        }
        ArrayList arrayList = this.f1625c1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((x0) this.f1625c1.get(size)).b(this, i2, i10);
            }
        }
        this.C0--;
    }

    public final void x() {
        if (this.H0 != null) {
            return;
        }
        ((g1) this.D0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H0 = edgeEffect;
        if (this.f1628e0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.E0 != null) {
            return;
        }
        ((g1) this.D0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E0 = edgeEffect;
        if (this.f1628e0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.G0 != null) {
            return;
        }
        ((g1) this.D0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G0 = edgeEffect;
        if (this.f1628e0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        u0 u0Var = this.f1640k0;
        if (u0Var != null) {
            return u0Var.t(layoutParams);
        }
        a0.j.p("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(a1 a1Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }
}
