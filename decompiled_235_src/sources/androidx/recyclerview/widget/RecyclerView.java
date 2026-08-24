package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
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
import android.view.Display;
import android.view.FocusFinder;
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
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] A1 = {16843830};
    public static final float B1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean C1 = true;
    public static final boolean D1 = true;
    public static final Class[] E1;
    public static final tf5 F1;
    public static final tg5 G1;
    public static boolean y1 = false;
    public static boolean z1 = false;
    public final float A;
    public final AccessibilityManager A0;
    public final og5 B;
    public ArrayList B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public bg5 G0;
    public EdgeEffect H0;
    public EdgeEffect I0;
    public EdgeEffect J0;
    public EdgeEffect K0;
    public final mg5 L;
    public cg5 L0;
    public int M0;
    public int N0;
    public VelocityTracker O0;
    public int P0;
    public int Q0;
    public pg5 R;
    public int R0;
    public int S0;
    public int T0;
    public ig5 U0;
    public final int V0;
    public final int W0;
    public final float X0;
    public final float Y0;
    public boolean Z0;
    public final vg5 a1;
    public dr2 b1;
    public final ls0 c1;
    public final z9 d0;
    public final sg5 d1;
    public final dk0 e0;
    public jg5 e1;
    public final rr6 f0;
    public ArrayList f1;
    public boolean g0;
    public boolean g1;
    public final sf5 h0;
    public boolean h1;
    public final Rect i0;
    public final uf5 i1;
    public final Rect j0;
    public boolean j1;
    public final RectF k0;
    public yg5 k1;
    public wf5 l0;
    public final int[] l1;
    public gg5 m0;
    public je4 m1;
    public final ArrayList n0;
    public final int[] n1;
    public final ArrayList o0;
    public final int[] o1;
    public final ArrayList p0;
    public final int[] p1;
    public u92 q0;
    public final ArrayList q1;
    public boolean r0;
    public final sf5 r1;
    public boolean s0;
    public boolean s1;
    public boolean t0;
    public int t1;
    public int u0;
    public int u1;
    public boolean v0;
    public final boolean v1;
    public boolean w0;
    public final uf5 w1;
    public boolean x0;
    public final nj1 x1;
    public int y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r0v10, types: [tg5, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        E1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F1 = new tf5(0);
        G1 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [cg5, ke1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v18, types: [sg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, z9] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class[]] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ls0 ls0Var;
        float a;
        float a2;
        boolean z;
        int i2;
        char c;
        Throwable th;
        ?? r19;
        char c2;
        int i3;
        TypedArray typedArray;
        int i4;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.B = new og5(this);
        this.L = new mg5(this);
        this.f0 = new rr6(11);
        this.h0 = new sf5(this, 0);
        this.i0 = new Rect();
        this.j0 = new Rect();
        this.k0 = new RectF();
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.u0 = 0;
        this.C0 = false;
        this.D0 = false;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = G1;
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
        this.L0 = obj;
        this.M0 = 0;
        this.N0 = -1;
        this.X0 = Float.MIN_VALUE;
        this.Y0 = Float.MIN_VALUE;
        this.Z0 = true;
        this.a1 = new vg5(this);
        if (D1) {
            ls0Var = new ls0(2);
        } else {
            ls0Var = null;
        }
        this.c1 = ls0Var;
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
        this.d1 = obj2;
        this.g1 = false;
        this.h1 = false;
        uf5 uf5Var = new uf5(this);
        this.i1 = uf5Var;
        this.j1 = false;
        this.l1 = new int[2];
        this.n1 = new int[2];
        this.o1 = new int[2];
        this.p1 = new int[2];
        this.q1 = new ArrayList();
        this.r1 = new sf5(this, 1);
        this.t1 = 0;
        this.u1 = 0;
        this.w1 = new uf5(this);
        this.x1 = new nj1(getContext(), new uf5(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.T0 = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = go7.a;
            a = pt0.j(viewConfiguration);
        } else {
            a = go7.a(viewConfiguration, context);
        }
        this.X0 = a;
        if (i5 >= 26) {
            a2 = pt0.k(viewConfiguration);
        } else {
            a2 = go7.a(viewConfiguration, context);
        }
        this.Y0 = a2;
        this.V0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.L0.a = uf5Var;
        uf5 uf5Var2 = new uf5(this);
        ?? obj3 = new Object();
        obj3.b = new tz4(30);
        obj3.c = new ArrayList();
        obj3.d = new ArrayList();
        obj3.a = 0;
        obj3.e = uf5Var2;
        obj3.f = new s63((Object) obj3, 23);
        this.d0 = obj3;
        this.e0 = new dk0(new uf5(this));
        WeakHashMap weakHashMap = ao7.a;
        if (i5 >= 26) {
            i2 = un7.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i5 >= 26) {
            un7.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.A0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new yg5(this));
        int[] iArr = j75.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ao7.m(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.g0 = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c2 = 2;
                r19 = 1;
                typedArray = obtainStyledAttributes;
                i3 = i;
                c = 3;
                th = null;
                i4 = 4;
                new u92(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                i.h("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
        } else {
            c = 3;
            th = null;
            r19 = 1;
            c2 = 2;
            i3 = i;
            typedArray = obtainStyledAttributes;
            i4 = 4;
        }
        typedArray.recycle();
        this.v1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                            } catch (ClassNotFoundException e) {
                                e = e;
                                th = null;
                                u34.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                th = null;
                                u34.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e3) {
                                e = e3;
                                th = null;
                                u34.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                th = null;
                                u34.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        ?? asSubclass = Class.forName(str, false, classLoader).asSubclass(gg5.class);
                        try {
                            constructor = asSubclass.getConstructor(E1);
                            objArr = new Object[i4];
                            objArr[0] = context;
                            objArr[r19] = attributeSet;
                            objArr[c2] = Integer.valueOf(i3);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            try {
                                constructor = asSubclass.getConstructor(th);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        constructor.setAccessible(r19);
                        setLayoutManager((gg5) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        u34.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                        throw null;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                } catch (IllegalAccessException e9) {
                    e = e9;
                } catch (InstantiationException e10) {
                    e = e10;
                } catch (InvocationTargetException e11) {
                    e = e11;
                }
            }
        }
        int[] iArr2 = A1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        ao7.m(this, context, iArr2, attributeSet, obtainStyledAttributes2, i3);
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

    public static wg5 N(View view) {
        if (view == null) {
            return null;
        }
        return ((hg5) view.getLayoutParams()).a;
    }

    private je4 getScrollingChildHelper() {
        if (this.m1 == null) {
            this.m1 = new je4(this);
        }
        return this.m1;
    }

    public static void l(wg5 wg5Var) {
        WeakReference weakReference = wg5Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != wg5Var.a) {
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
            wg5Var.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && nw7.g0(edgeEffect) != B1) {
            int round = Math.round(nw7.j0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i < 0 && edgeEffect2 != null && nw7.g0(edgeEffect2) != B1) {
            float f = i2;
            int round2 = Math.round(nw7.j0(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        y1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        z1 = z;
    }

    public final void A() {
        if (this.J0 != null) {
            return;
        }
        ((tg5) this.G0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J0 = edgeEffect;
        if (this.g0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.I0 != null) {
            return;
        }
        ((tg5) this.G0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I0 = edgeEffect;
        if (this.g0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.l0 + ", layout:" + this.m0 + ", context:" + getContext();
    }

    public final void D(sg5 sg5Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.a1.L;
            overScroller.getFinalX();
            overScroller.getCurrX();
            sg5Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        sg5Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u92 u92Var = (u92) arrayList.get(i);
            int i2 = u92Var.v;
            if (i2 == 1) {
                boolean e = u92Var.e(motionEvent.getX(), motionEvent.getY());
                boolean d = u92Var.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (e || d)) {
                    if (d) {
                        u92Var.w = 1;
                        u92Var.p = (int) motionEvent.getX();
                    } else if (e) {
                        u92Var.w = 2;
                        u92Var.m = (int) motionEvent.getY();
                    }
                    u92Var.g(2);
                    if (action == 3) {
                        this.q0 = u92Var;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        dk0 dk0Var = this.e0;
        int q = dk0Var.q();
        if (q == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < q; i3++) {
            wg5 N = N(dk0Var.p(i3));
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

    public final wg5 I(int i) {
        wg5 wg5Var = null;
        if (this.C0) {
            return null;
        }
        dk0 dk0Var = this.e0;
        int t = dk0Var.t();
        for (int i2 = 0; i2 < t; i2++) {
            wg5 N = N(dk0Var.s(i2));
            if (N != null && !N.h() && K(N) == i) {
                if (((ArrayList) dk0Var.B).contains(N.a)) {
                    wg5Var = N;
                } else {
                    return N;
                }
            }
        }
        return wg5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x0210, code lost:
        if (r1 < r14) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        vg5 vg5Var;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int minFlingVelocity;
        boolean z5;
        gr4 gr4Var;
        ts1 ts1Var;
        Object[] objArr;
        Object[] objArr2;
        int i9;
        int i10;
        PointF a;
        int i11;
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.w0) {
            boolean d = gg5Var.d();
            boolean e = this.m0.e();
            if (d && Math.abs(i) >= i3) {
                i5 = i;
            } else {
                i5 = 0;
            }
            if (e && Math.abs(i2) >= i3) {
                i6 = i2;
            } else {
                i6 = 0;
            }
            if (i5 != 0 || i6 != 0) {
                if (i5 != 0) {
                    EdgeEffect edgeEffect = this.H0;
                    if (edgeEffect != null && nw7.g0(edgeEffect) != B1) {
                        int i12 = -i5;
                        if (i0(this.H0, i12, getWidth())) {
                            this.H0.onAbsorb(i12);
                            i5 = 0;
                        }
                        i7 = i5;
                        i5 = 0;
                    } else {
                        EdgeEffect edgeEffect2 = this.J0;
                        if (edgeEffect2 != null && nw7.g0(edgeEffect2) != B1) {
                            if (i0(this.J0, i5, getWidth())) {
                                this.J0.onAbsorb(i5);
                                i5 = 0;
                            }
                            i7 = i5;
                            i5 = 0;
                        }
                    }
                    if (i6 != 0) {
                        EdgeEffect edgeEffect3 = this.I0;
                        if (edgeEffect3 != null && nw7.g0(edgeEffect3) != B1) {
                            int i13 = -i6;
                            if (i0(this.I0, i13, getHeight())) {
                                this.I0.onAbsorb(i13);
                                i6 = 0;
                            }
                            i8 = 0;
                        } else {
                            EdgeEffect edgeEffect4 = this.K0;
                            if (edgeEffect4 != null && nw7.g0(edgeEffect4) != B1) {
                                if (i0(this.K0, i6, getHeight())) {
                                    this.K0.onAbsorb(i6);
                                    i6 = 0;
                                }
                                i8 = 0;
                            }
                        }
                        vg5Var = this.a1;
                        if (i7 == 0 || i6 != 0) {
                            int i14 = -i4;
                            i7 = Math.max(i14, Math.min(i7, i4));
                            i6 = Math.max(i14, Math.min(i6, i4));
                            m0(1);
                            vg5Var.a(i7, i6);
                        }
                        if (i5 != 0 && i8 == 0) {
                            if (i7 != 0 || i6 != 0) {
                                return true;
                            }
                        } else {
                            f = i5;
                            f2 = i8;
                            if (!dispatchNestedPreFling(f, f2)) {
                                if (!d && !e) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                dispatchNestedFling(f, f2, z);
                                ig5 ig5Var = this.U0;
                                if (ig5Var != null) {
                                    hr4 hr4Var = (hr4) ig5Var;
                                    gg5 layoutManager = hr4Var.a.getLayoutManager();
                                    if (layoutManager != null && hr4Var.a.getAdapter() != null && ((Math.abs(i8) > (minFlingVelocity = hr4Var.a.getMinFlingVelocity()) || Math.abs(i5) > minFlingVelocity) && ((z5 = layoutManager instanceof rg5)))) {
                                        View view = null;
                                        if (!z5) {
                                            gr4Var = null;
                                        } else {
                                            gr4Var = new gr4(hr4Var, hr4Var.a.getContext());
                                        }
                                        if (gr4Var != null) {
                                            int B = layoutManager.B();
                                            if (B != 0) {
                                                if (layoutManager.e()) {
                                                    ts1Var = hr4Var.e(layoutManager);
                                                } else if (layoutManager.d()) {
                                                    ts1Var = hr4Var.d(layoutManager);
                                                } else {
                                                    ts1Var = null;
                                                }
                                                if (ts1Var != null) {
                                                    z3 = false;
                                                    int v = layoutManager.v();
                                                    z4 = true;
                                                    int i15 = 0;
                                                    int i16 = Integer.MIN_VALUE;
                                                    int i17 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i15 < v) {
                                                        boolean z6 = z;
                                                        View u = layoutManager.u(i15);
                                                        if (u == null) {
                                                            i11 = v;
                                                        } else {
                                                            i11 = v;
                                                            int b = hr4.b(u, ts1Var);
                                                            if (b <= 0 && b > i16) {
                                                                view2 = u;
                                                                i16 = b;
                                                            }
                                                            if (b >= 0 && b < i17) {
                                                                view = u;
                                                                i17 = b;
                                                            }
                                                        }
                                                        i15++;
                                                        z = z6;
                                                        v = i11;
                                                    }
                                                    z2 = z;
                                                    if (!layoutManager.d() ? i8 > 0 : i5 > 0) {
                                                        objArr = 1;
                                                    } else {
                                                        objArr = null;
                                                    }
                                                    if (objArr != null && view != null) {
                                                        i10 = gg5.G(view);
                                                    } else if (objArr == null && view2 != null) {
                                                        i10 = gg5.G(view2);
                                                    } else {
                                                        if (objArr != null) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int G = gg5.G(view);
                                                            int B2 = layoutManager.B();
                                                            if (!z5 || (a = ((rg5) layoutManager).a(B2 - 1)) == null || (a.x >= B1 && a.y >= B1)) {
                                                                objArr2 = null;
                                                            } else {
                                                                objArr2 = 1;
                                                            }
                                                            if (objArr2 == objArr) {
                                                                i9 = -1;
                                                            } else {
                                                                i9 = 1;
                                                            }
                                                            i10 = i9 + G;
                                                            if (i10 >= 0) {
                                                            }
                                                        }
                                                        i10 = -1;
                                                    }
                                                    if (i10 != -1) {
                                                        gr4Var.a = i10;
                                                        layoutManager.B0(gr4Var);
                                                        return z4;
                                                    }
                                                    if (z2) {
                                                        boolean z7 = z4;
                                                        m0(z7 ? 1 : 0);
                                                        int i18 = -i4;
                                                        vg5Var.a(Math.max(i18, Math.min(i5, i4)), Math.max(i18, Math.min(i8, i4)));
                                                        return z7;
                                                    }
                                                    return z3;
                                                }
                                            }
                                            z2 = z;
                                            z3 = false;
                                            z4 = true;
                                            i10 = -1;
                                            if (i10 != -1) {
                                            }
                                            if (z2) {
                                            }
                                        }
                                    }
                                }
                                z2 = z;
                                z3 = false;
                                z4 = true;
                                if (z2) {
                                }
                            }
                        }
                    }
                    i8 = i6;
                    i6 = 0;
                    vg5Var = this.a1;
                    if (i7 == 0) {
                    }
                    int i142 = -i4;
                    i7 = Math.max(i142, Math.min(i7, i4));
                    i6 = Math.max(i142, Math.min(i6, i4));
                    m0(1);
                    vg5Var.a(i7, i6);
                    if (i5 != 0) {
                    }
                    f = i5;
                    f2 = i8;
                    if (!dispatchNestedPreFling(f, f2)) {
                    }
                }
                i7 = 0;
                if (i6 != 0) {
                }
                i8 = i6;
                i6 = 0;
                vg5Var = this.a1;
                if (i7 == 0) {
                }
                int i1422 = -i4;
                i7 = Math.max(i1422, Math.min(i7, i4));
                i6 = Math.max(i1422, Math.min(i6, i4));
                m0(1);
                vg5Var.a(i7, i6);
                if (i5 != 0) {
                }
                f = i5;
                f2 = i8;
                if (!dispatchNestedPreFling(f, f2)) {
                }
            }
        }
        return false;
    }

    public final int K(wg5 wg5Var) {
        if ((wg5Var.j & 524) == 0 && wg5Var.e()) {
            int i = wg5Var.c;
            ArrayList arrayList = (ArrayList) this.d0.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                y9 y9Var = (y9) arrayList.get(i2);
                int i3 = y9Var.a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = y9Var.b;
                            if (i4 == i) {
                                i = y9Var.d;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (y9Var.d <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = y9Var.b;
                        if (i5 <= i) {
                            int i6 = y9Var.d;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (y9Var.b <= i) {
                    i += y9Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long L(wg5 wg5Var) {
        if (this.l0.b) {
            return wg5Var.e;
        }
        return wg5Var.c;
    }

    public final wg5 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            fa6.f("View ", view, " is not a direct child of ", this);
            return null;
        }
        return N(view);
    }

    public final Rect O(View view) {
        hg5 hg5Var = (hg5) view.getLayoutParams();
        boolean z = hg5Var.c;
        Rect rect = hg5Var.b;
        if (z) {
            sg5 sg5Var = this.d1;
            if (!sg5Var.g || (!hg5Var.a.k() && !hg5Var.a.f())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.o0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.i0;
                    rect2.set(0, 0, 0, 0);
                    ((dg5) arrayList.get(i)).a(rect2, view, this, sg5Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                hg5Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean P() {
        if (this.t0 && !this.C0 && !this.d0.j()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.E0 > 0) {
            return true;
        }
        return false;
    }

    public final void R(int i) {
        if (this.m0 == null) {
            return;
        }
        setScrollState(2);
        this.m0.q0(i);
        awakenScrollBars();
    }

    public final void S() {
        dk0 dk0Var = this.e0;
        int t = dk0Var.t();
        for (int i = 0; i < t; i++) {
            ((hg5) dk0Var.s(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.L.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hg5 hg5Var = (hg5) ((wg5) arrayList.get(i2)).a.getLayoutParams();
            if (hg5Var != null) {
                hg5Var.c = true;
            }
        }
    }

    public final void T(int i, boolean z, int i2) {
        int i3 = i + i2;
        dk0 dk0Var = this.e0;
        int t = dk0Var.t();
        for (int i4 = 0; i4 < t; i4++) {
            wg5 N = N(dk0Var.s(i4));
            if (N != null && !N.o()) {
                int i5 = N.c;
                sg5 sg5Var = this.d1;
                if (i5 >= i3) {
                    if (z1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + N + " now at position " + (N.c - i2));
                    }
                    N.l(-i2, z);
                    sg5Var.f = true;
                } else if (i5 >= i) {
                    if (z1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + N + " now REMOVED");
                    }
                    N.a(8);
                    N.l(-i2, z);
                    N.c = i - 1;
                    sg5Var.f = true;
                }
            }
        }
        mg5 mg5Var = this.L;
        ArrayList arrayList = (ArrayList) mg5Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wg5 wg5Var = (wg5) arrayList.get(size);
            if (wg5Var != null) {
                int i6 = wg5Var.c;
                if (i6 >= i3) {
                    if (z1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + wg5Var + " now at position " + (wg5Var.c - i2));
                    }
                    wg5Var.l(-i2, z);
                } else if (i6 >= i) {
                    wg5Var.a(8);
                    mg5Var.k(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.E0++;
    }

    public final void V(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.E0 - 1;
        this.E0 = i2;
        if (i2 < 1) {
            if (y1 && i2 < 0) {
                i.m("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.E0 = 0;
            if (z) {
                int i3 = this.y0;
                this.y0 = 0;
                if (i3 != 0 && (accessibilityManager = this.A0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.q1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    wg5 wg5Var = (wg5) arrayList.get(size);
                    if (wg5Var.a.getParent() == this && !wg5Var.o() && (i = wg5Var.q) != -1) {
                        wg5Var.a.setImportantForAccessibility(i);
                        wg5Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.N0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.R0 = x;
            this.P0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.S0 = y;
            this.Q0 = y;
        }
    }

    public final void X() {
        if (!this.j1 && this.r0) {
            WeakHashMap weakHashMap = ao7.a;
            postOnAnimation(this.r1);
            this.j1 = true;
        }
    }

    public final void Y() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.C0;
        z9 z9Var = this.d0;
        boolean z6 = false;
        if (z5) {
            z9Var.r((ArrayList) z9Var.c);
            z9Var.r((ArrayList) z9Var.d);
            z9Var.a = 0;
            if (this.D0) {
                this.m0.Z();
            }
        }
        if (this.L0 != null && this.m0.C0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z9Var.q();
        } else {
            z9Var.d();
        }
        if (!this.g1 && !this.h1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.t0 && this.L0 != null && (((z4 = this.C0) || z2 || this.m0.f) && (!z4 || this.l0.b))) {
            z3 = true;
        } else {
            z3 = false;
        }
        sg5 sg5Var = this.d1;
        sg5Var.j = z3;
        if (z3 && z2 && !this.C0 && this.L0 != null && this.m0.C0()) {
            z6 = true;
        }
        sg5Var.k = z6;
    }

    public final void Z(boolean z) {
        this.D0 = z | this.D0;
        this.C0 = true;
        dk0 dk0Var = this.e0;
        int t = dk0Var.t();
        for (int i = 0; i < t; i++) {
            wg5 N = N(dk0Var.s(i));
            if (N != null && !N.o()) {
                N.a(6);
            }
        }
        S();
        mg5 mg5Var = this.L;
        ArrayList arrayList = (ArrayList) mg5Var.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wg5 wg5Var = (wg5) arrayList.get(i2);
            if (wg5Var != null) {
                wg5Var.a(6);
                wg5Var.a(1024);
            }
        }
        wf5 wf5Var = ((RecyclerView) mg5Var.h).l0;
        if (wf5Var != null && wf5Var.b) {
            return;
        }
        mg5Var.j();
    }

    public final void a0(wg5 wg5Var, dy7 dy7Var) {
        wg5Var.j &= -8193;
        boolean z = this.d1.h;
        rr6 rr6Var = this.f0;
        if (z && wg5Var.k() && !wg5Var.h() && !wg5Var.o()) {
            ((hz3) rr6Var.L).f(L(wg5Var), wg5Var);
        }
        ci6 ci6Var = (ci6) rr6Var.B;
        lo7 lo7Var = (lo7) ci6Var.get(wg5Var);
        if (lo7Var == null) {
            lo7Var = lo7.a();
            ci6Var.put(wg5Var, lo7Var);
        }
        lo7Var.b = dy7Var;
        lo7Var.a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            gg5Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        boolean z;
        EdgeEffect edgeEffect = this.H0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.H0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.I0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.I0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.J0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.K0.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final int c0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.H0;
        float f2 = B1;
        if (edgeEffect != null && nw7.g0(edgeEffect) != B1) {
            boolean canScrollHorizontally = canScrollHorizontally(-1);
            EdgeEffect edgeEffect2 = this.H0;
            if (canScrollHorizontally) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -nw7.j0(edgeEffect2, -width, 1.0f - height);
                if (nw7.g0(this.H0) == B1) {
                    this.H0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.J0;
            if (edgeEffect3 != null && nw7.g0(edgeEffect3) != B1) {
                boolean canScrollHorizontally2 = canScrollHorizontally(1);
                EdgeEffect edgeEffect4 = this.J0;
                if (canScrollHorizontally2) {
                    edgeEffect4.onRelease();
                } else {
                    float j0 = nw7.j0(edgeEffect4, width, height);
                    if (nw7.g0(this.J0) == B1) {
                        this.J0.onRelease();
                    }
                    f2 = j0;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof hg5) && this.m0.f((hg5) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.d()) {
            return this.m0.j(this.d1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.d()) {
            return this.m0.k(this.d1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.d()) {
            return this.m0.l(this.d1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.e()) {
            return this.m0.m(this.d1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.e()) {
            return this.m0.n(this.d1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null && gg5Var.e()) {
            return this.m0.o(this.d1);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.I0;
        float f2 = B1;
        if (edgeEffect != null && nw7.g0(edgeEffect) != B1) {
            boolean canScrollVertically = canScrollVertically(-1);
            EdgeEffect edgeEffect2 = this.I0;
            if (canScrollVertically) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -nw7.j0(edgeEffect2, -height, width);
                if (nw7.g0(this.I0) == B1) {
                    this.I0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.K0;
            if (edgeEffect3 != null && nw7.g0(edgeEffect3) != B1) {
                boolean canScrollVertically2 = canScrollVertically(1);
                EdgeEffect edgeEffect4 = this.K0;
                if (canScrollVertically2) {
                    edgeEffect4.onRelease();
                } else {
                    float j0 = nw7.j0(edgeEffect4, height, 1.0f - width);
                    if (nw7.g0(this.K0) == B1) {
                        this.K0.onRelease();
                    }
                    f2 = j0;
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
        gg5 layoutManager = getLayoutManager();
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
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((dg5) arrayList.get(i3)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.H0;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.g0) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, B1);
            EdgeEffect edgeEffect2 = this.H0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.I0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.g0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.g0) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.J0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.K0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.L0 == null || arrayList.size() <= 0 || !this.L0.f()) {
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
        Rect rect = this.i0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof hg5) {
            hg5 hg5Var = (hg5) layoutParams;
            if (!hg5Var.c) {
                Rect rect2 = hg5Var.b;
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
        gg5 gg5Var = this.m0;
        boolean z2 = !this.t0;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        gg5Var.n0(this, view, this.i0, z2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        p();
        wf5 wf5Var = this.l0;
        int[] iArr = this.p1;
        if (wf5Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            g0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.o0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i4, i5, i6, i7, this.n1, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        if (i8 == 0 && i10 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i12 = this.R0;
        int[] iArr2 = this.n1;
        int i13 = iArr2[0];
        this.R0 = i12 - i13;
        int i14 = this.S0;
        int i15 = iArr2[1];
        this.S0 = i14 - i15;
        int[] iArr3 = this.o1;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !ej2.J(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < B1) {
                    z();
                    z2 = true;
                    z3 = false;
                    nw7.j0(this.H0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z2 = true;
                    z3 = false;
                    if (f > B1) {
                        A();
                        nw7.j0(this.J0, f / getWidth(), y / getHeight());
                    } else {
                        z4 = false;
                        if (f2 >= B1) {
                            B();
                            nw7.j0(this.I0, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > B1) {
                                y();
                                nw7.j0(this.K0, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z4 || f != B1 || f2 != B1) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && ej2.J(motionEvent, Compress.MAXWINSIZE)) {
                                b0();
                            }
                        }
                        z4 = z2;
                        if (!z4) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            b0();
                        }
                    }
                }
                z4 = z2;
                if (f2 >= B1) {
                }
                z4 = z2;
                if (!z4) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            } else {
                z2 = true;
                z3 = false;
            }
            n(i, i2);
        } else {
            z2 = true;
            z3 = false;
        }
        if (i4 != 0 || i5 != 0) {
            x(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i4 == 0 && i5 == 0) {
            return z3;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0168, code lost:
        if (r16 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0175, code lost:
        if (r5 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0178, code lost:
        if (r16 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x017b, code lost:
        if (r5 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0183, code lost:
        if ((r5 * r6) <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x018b, code lost:
        if ((r5 * r6) >= 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0186  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        boolean z;
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        int i8;
        int i9;
        this.m0.getClass();
        if (this.l0 != null && this.m0 != null && !Q() && !this.w0) {
            z = true;
        } else {
            z = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        sg5 sg5Var = this.d1;
        mg5 mg5Var = this.L;
        if (z && (i == 2 || i == 1)) {
            if (this.m0.e()) {
                if (i == 2) {
                    i9 = 130;
                } else {
                    i9 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i9) == null) {
                    z2 = true;
                    if (!z2 && this.m0.d()) {
                        if (this.m0.b.getLayoutDirection() != 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i != 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!(z3 ^ z4)) {
                            i8 = 66;
                        } else {
                            i8 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i8) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        p();
                        if (E(view) != null) {
                            l0();
                            this.m0.T(view, i, mg5Var, sg5Var);
                            n0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (view != null) {
                            int width = view.getWidth();
                            int height = view.getHeight();
                            Rect rect = this.i0;
                            rect.set(0, 0, width, height);
                            int width2 = view2.getWidth();
                            int height2 = view2.getHeight();
                            Rect rect2 = this.j0;
                            rect2.set(0, 0, width2, height2);
                            offsetDescendantRectToMyCoords(view, rect);
                            offsetDescendantRectToMyCoords(view2, rect2);
                            if (this.m0.b.getLayoutDirection() != 1) {
                            }
                            i3 = rect.left;
                            i4 = rect2.left;
                            if (i3 >= i4) {
                            }
                            i5 = 1;
                            i6 = rect.top;
                            i7 = rect2.top;
                            if (i6 >= i7) {
                            }
                            c = 1;
                            if (i == 1) {
                            }
                        }
                        return view2;
                    }
                    return super.focusSearch(view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (this.m0.b.getLayoutDirection() != 1) {
                }
                if (i != 2) {
                }
                if (!(z3 ^ z4)) {
                }
                if (focusFinder.findNextFocus(this, view, i8) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            return super.focusSearch(view, i);
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null && z) {
            p();
            if (E(view) != null) {
                l0();
                view2 = this.m0.T(view, i, mg5Var, sg5Var);
                n0(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            e0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view && E(view2) != null) {
            if (view != null && E(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.i0;
                rect3.set(0, 0, width3, height3);
                int width22 = view2.getWidth();
                int height22 = view2.getHeight();
                Rect rect22 = this.j0;
                rect22.set(0, 0, width22, height22);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(view2, rect22);
                if (this.m0.b.getLayoutDirection() != 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                i3 = rect3.left;
                i4 = rect22.left;
                if ((i3 >= i4 || rect3.right <= i4) && rect3.right < rect22.right) {
                    i5 = 1;
                } else {
                    int i10 = rect3.right;
                    int i11 = rect22.right;
                    if ((i10 > i11 || i3 >= i11) && i3 > i4) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                }
                i6 = rect3.top;
                i7 = rect22.top;
                if ((i6 >= i7 || rect3.bottom <= i7) && rect3.bottom < rect22.bottom) {
                    c = 1;
                } else {
                    int i12 = rect3.bottom;
                    int i13 = rect22.bottom;
                    if ((i12 > i13 || i6 >= i13) && i6 > i7) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        i.i("Invalid direction: ", i, C());
                                        return null;
                                    }
                                }
                            }
                        }
                    } else if (c <= 0) {
                        if (c == 0) {
                        }
                    }
                } else if (c >= 0) {
                    if (c == 0) {
                    }
                }
            }
            return view2;
        }
        return super.focusSearch(view, i);
    }

    public final void g0(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        wg5 wg5Var;
        l0();
        U();
        Trace.beginSection("RV Scroll");
        sg5 sg5Var = this.d1;
        D(sg5Var);
        mg5 mg5Var = this.L;
        if (i != 0) {
            i3 = this.m0.p0(i, mg5Var, sg5Var);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.m0.r0(i2, mg5Var, sg5Var);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        dk0 dk0Var = this.e0;
        int q = dk0Var.q();
        for (int i5 = 0; i5 < q; i5++) {
            View p = dk0Var.p(i5);
            wg5 M = M(p);
            if (M != null && (wg5Var = M.i) != null) {
                View view = wg5Var.a;
                int left = p.getLeft();
                int top = p.getTop();
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
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            return gg5Var.r();
        }
        i.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            return gg5Var.s(getContext(), attributeSet);
        }
        i.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public wf5 getAdapter() {
        return this.l0;
    }

    @Override // android.view.View
    public int getBaseline() {
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            gg5Var.getClass();
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
        return this.g0;
    }

    public yg5 getCompatAccessibilityDelegate() {
        return this.k1;
    }

    public bg5 getEdgeEffectFactory() {
        return this.G0;
    }

    public cg5 getItemAnimator() {
        return this.L0;
    }

    public int getItemDecorationCount() {
        return this.o0.size();
    }

    public gg5 getLayoutManager() {
        return this.m0;
    }

    public int getMaxFlingVelocity() {
        return this.W0;
    }

    public int getMinFlingVelocity() {
        return this.V0;
    }

    public long getNanoTime() {
        if (D1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public ig5 getOnFlingListener() {
        return this.U0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.Z0;
    }

    public lg5 getRecycledViewPool() {
        return this.L.c();
    }

    public int getScrollState() {
        return this.M0;
    }

    public final void h(wg5 wg5Var) {
        boolean z;
        View view = wg5Var.a;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.L.p(M(view));
        boolean j = wg5Var.j();
        dk0 dk0Var = this.e0;
        if (j) {
            dk0Var.h(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            dk0Var.g(view, -1, true);
        } else {
            int indexOfChild = ((uf5) dk0Var.R).A.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((kk) dk0Var.X).j(indexOfChild);
                dk0Var.u(view);
                return;
            }
            e41.w(view, "view is not a child, cannot hide ");
        }
    }

    public final void h0(int i) {
        if (this.w0) {
            return;
        }
        p0();
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        gg5Var.q0(i);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(dg5 dg5Var) {
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            gg5Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.o0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(dg5Var);
        S();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i, int i2) {
        if (i <= 0) {
            float f = this.A * 0.015f;
            double log = Math.log((Math.abs(-i) * 0.35f) / f);
            double d = B1;
            if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < nw7.g0(edgeEffect) * i2) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.w0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(jg5 jg5Var) {
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        this.f1.add(jg5Var);
    }

    public final void j0(int i, boolean z, int i2) {
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.w0) {
            int i3 = 0;
            if (!gg5Var.d()) {
                i = 0;
            }
            if (!this.m0.e()) {
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
            this.a1.c(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                i.m("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
            } else {
                i.m(str);
            }
        } else if (this.F0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
        }
    }

    public final void k0(int i) {
        if (this.w0) {
            return;
        }
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            gg5Var.A0(this, i);
        }
    }

    public final void l0() {
        int i = this.u0 + 1;
        this.u0 = i;
        if (i == 1 && !this.w0) {
            this.v0 = false;
        }
    }

    public final void m() {
        dk0 dk0Var = this.e0;
        int t = dk0Var.t();
        for (int i = 0; i < t; i++) {
            wg5 N = N(dk0Var.s(i));
            if (!N.o()) {
                N.d = -1;
                N.g = -1;
            }
        }
        mg5 mg5Var = this.L;
        ArrayList arrayList = (ArrayList) mg5Var.c;
        ArrayList arrayList2 = (ArrayList) mg5Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            wg5 wg5Var = (wg5) arrayList2.get(i2);
            wg5Var.d = -1;
            wg5Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            wg5 wg5Var2 = (wg5) arrayList.get(i3);
            wg5Var2.d = -1;
            wg5Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) mg5Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                wg5 wg5Var3 = (wg5) ((ArrayList) mg5Var.d).get(i4);
                wg5Var3.d = -1;
                wg5Var3.g = -1;
            }
        }
    }

    public final void m0(int i) {
        boolean d = this.m0.d();
        int i2 = d;
        if (this.m0.e()) {
            i2 = (d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void n(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.H0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.H0.onRelease();
            z = this.H0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.J0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.J0.onRelease();
            z |= this.J0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.I0.onRelease();
            z |= this.I0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.K0.onRelease();
            z |= this.K0.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z) {
        if (this.u0 < 1) {
            if (!y1) {
                this.u0 = 1;
            } else {
                i.m("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            }
        }
        if (!z && !this.w0) {
            this.v0 = false;
        }
        if (this.u0 == 1) {
            if (z && this.v0 && !this.w0 && this.m0 != null && this.l0 != null) {
                s();
            }
            if (!this.w0) {
                this.v0 = false;
            }
        }
        this.u0--;
    }

    public final void o0(int i) {
        getScrollingChildHelper().h(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0055, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z;
        float f;
        super.onAttachedToWindow();
        this.E0 = 0;
        this.r0 = true;
        if (this.t0 && !isLayoutRequested()) {
            z = true;
        } else {
            z = false;
        }
        this.t0 = z;
        this.L.g();
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            gg5Var.g = true;
            gg5Var.R(this);
        }
        this.j1 = false;
        if (D1) {
            ThreadLocal threadLocal = dr2.X;
            dr2 dr2Var = (dr2) threadLocal.get();
            this.b1 = dr2Var;
            if (dr2Var == null) {
                this.b1 = new dr2();
                WeakHashMap weakHashMap = ao7.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                dr2 dr2Var2 = this.b1;
                dr2Var2.L = 1.0E9f / f;
                threadLocal.set(dr2Var2);
            }
            ArrayList arrayList = this.b1.A;
            if (y1 && arrayList.contains(this)) {
                i.m("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        dr2 dr2Var;
        super.onDetachedFromWindow();
        cg5 cg5Var = this.L0;
        if (cg5Var != null) {
            cg5Var.e();
        }
        p0();
        int i = 0;
        this.r0 = false;
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            gg5Var.g = false;
            gg5Var.S(this);
        }
        this.q1.clear();
        removeCallbacks(this.r1);
        this.f0.getClass();
        do {
        } while (lo7.d.a() != null);
        mg5 mg5Var = this.L;
        ArrayList arrayList = (ArrayList) mg5Var.e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bl2.n(((wg5) arrayList.get(i2)).a);
        }
        mg5Var.h(((RecyclerView) mg5Var.h).l0, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                ArrayList arrayList2 = bl2.D(childAt).a;
                for (int U = hf.U(arrayList2); -1 < U; U--) {
                    ((do7) arrayList2.get(U)).a.e();
                }
                i = i3;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (D1 && (dr2Var = this.b1) != null) {
            boolean remove = dr2Var.A.remove(this);
            if (y1 && !remove) {
                i.m("RecyclerView removal failed!");
            } else {
                this.b1 = null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dg5) arrayList.get(i)).b(this);
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
        if (this.m0 != null && !this.w0 && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float f3 = B1;
            if (source != 0) {
                if (this.m0.e()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.m0.d()) {
                    f3 = motionEvent.getAxisValue(10);
                }
                f = f3;
                i = 0;
                z = false;
                f3 = f2;
            } else if ((motionEvent.getSource() & Compress.MAXWINSIZE) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.m0.e()) {
                    float f4 = -f;
                    f = 0.0f;
                    f3 = f4;
                } else if (!this.m0.d()) {
                    f = 0.0f;
                }
                i = 26;
                z = this.v1;
            } else {
                f = 0.0f;
                i = 0;
                z = false;
            }
            int i7 = (int) (f3 * this.Y0);
            int i8 = (int) (f * this.X0);
            if (z) {
                OverScroller overScroller = this.a1.L;
                j0((overScroller.getFinalX() - overScroller.getCurrX()) + i8, true, (overScroller.getFinalY() - overScroller.getCurrY()) + i7);
            } else {
                gg5 gg5Var = this.m0;
                if (gg5Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.w0) {
                    int[] iArr = this.p1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d = gg5Var.d();
                    boolean e = this.m0.e();
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
                    if (v(i3, i4, 1, this.p1, this.n1)) {
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
                    dr2 dr2Var = this.b1;
                    if (dr2Var != null && (c0 != 0 || d0 != 0)) {
                        dr2Var.a(this, c0, d0);
                    }
                    o0(1);
                }
            }
            if (i != 0 && !z) {
                this.x1.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.w0) {
            this.q0 = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.O0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                b0();
                setScrollState(0);
                return true;
            }
            gg5 gg5Var = this.m0;
            if (gg5Var != null) {
                boolean d = gg5Var.d();
                boolean e = this.m0.e();
                if (this.O0 == null) {
                    this.O0 = VelocityTracker.obtain();
                }
                this.O0.addMovement(motionEvent);
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
                                    this.N0 = motionEvent.getPointerId(actionIndex);
                                    int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.R0 = x;
                                    this.P0 = x;
                                    int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.S0 = y;
                                    this.Q0 = y;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.O0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                o0(0);
                                b0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.N0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.M0 != 1) {
                                int i = x2 - this.P0;
                                int i2 = y2 - this.Q0;
                                if (d && Math.abs(i) > this.T0) {
                                    this.R0 = x2;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (e && Math.abs(i2) > this.T0) {
                                    this.S0 = y2;
                                    z2 = true;
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.O0.clear();
                        o0(0);
                    }
                } else {
                    if (this.x0) {
                        this.x0 = false;
                    }
                    this.N0 = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.R0 = x3;
                    this.P0 = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.S0 = y3;
                    this.Q0 = y3;
                    EdgeEffect edgeEffect = this.H0;
                    if (edgeEffect != null && nw7.g0(edgeEffect) != B1 && !canScrollHorizontally(-1)) {
                        nw7.j0(this.H0, B1, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    } else {
                        z = false;
                    }
                    EdgeEffect edgeEffect2 = this.J0;
                    if (edgeEffect2 != null && nw7.g0(edgeEffect2) != B1 && !canScrollHorizontally(1)) {
                        nw7.j0(this.J0, B1, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.I0;
                    if (edgeEffect3 != null && nw7.g0(edgeEffect3) != B1 && !canScrollVertically(-1)) {
                        nw7.j0(this.I0, B1, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.K0;
                    if (edgeEffect4 != null && nw7.g0(edgeEffect4) != B1 && !canScrollVertically(1)) {
                        nw7.j0(this.K0, B1, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.M0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.o1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m0(0);
                }
                if (this.M0 == 1) {
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
        this.t0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            q(i, i2);
            return;
        }
        boolean K = gg5Var.K();
        boolean z = false;
        sg5 sg5Var = this.d1;
        if (K) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m0.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.s1 = z;
            if (!z && this.l0 != null) {
                if (sg5Var.d == 1) {
                    t();
                }
                this.m0.t0(i, i2);
                sg5Var.i = true;
                u();
                this.m0.v0(i, i2);
                if (this.m0.y0()) {
                    this.m0.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    sg5Var.i = true;
                    u();
                    this.m0.v0(i, i2);
                }
                this.t1 = getMeasuredWidth();
                this.u1 = getMeasuredHeight();
            }
        } else if (this.s0) {
            this.m0.b.q(i, i2);
        } else {
            if (this.z0) {
                l0();
                U();
                Y();
                V(true);
                if (sg5Var.k) {
                    sg5Var.g = true;
                } else {
                    this.d0.d();
                    sg5Var.g = false;
                }
                this.z0 = false;
                n0(false);
            } else if (sg5Var.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            wf5 wf5Var = this.l0;
            if (wf5Var != null) {
                sg5Var.e = wf5Var.a();
            } else {
                sg5Var.e = 0;
            }
            l0();
            this.m0.b.q(i, i2);
            n0(false);
            sg5Var.g = false;
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
        if (!(parcelable instanceof pg5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pg5 pg5Var = (pg5) parcelable;
        this.R = pg5Var;
        super.onRestoreInstanceState(pg5Var.A);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s, android.os.Parcelable, pg5] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? sVar = new s(super.onSaveInstanceState());
        pg5 pg5Var = this.R;
        if (pg5Var != null) {
            sVar.L = pg5Var.L;
            return sVar;
        }
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            sVar.L = gg5Var.g0();
            return sVar;
        }
        sVar.L = null;
        return sVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.K0 = null;
        this.I0 = null;
        this.J0 = null;
        this.H0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0220  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (!this.w0 && !this.x0) {
            u92 u92Var = this.q0;
            if (u92Var == null) {
                if (motionEvent.getAction() == 0) {
                    z = false;
                } else {
                    z = F(motionEvent);
                }
            } else {
                int i5 = u92Var.b;
                if (u92Var.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean e = u92Var.e(motionEvent.getX(), motionEvent.getY());
                        boolean d = u92Var.d(motionEvent.getX(), motionEvent.getY());
                        if (e || d) {
                            if (d) {
                                u92Var.w = 1;
                                u92Var.p = (int) motionEvent.getX();
                            } else if (e) {
                                u92Var.w = 2;
                                u92Var.m = (int) motionEvent.getY();
                            }
                            u92Var.g(2);
                        }
                    } else if (motionEvent.getAction() == 1 && u92Var.v == 2) {
                        u92Var.m = B1;
                        u92Var.p = B1;
                        u92Var.g(1);
                        u92Var.w = 0;
                    } else if (motionEvent.getAction() == 2 && u92Var.v == 2) {
                        u92Var.h();
                        if (u92Var.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = u92Var.y;
                            iArr[0] = i5;
                            int i6 = u92Var.q - i5;
                            iArr[1] = i6;
                            float max = Math.max(i5, Math.min(i6, x));
                            if (Math.abs(u92Var.o - max) >= 2.0f) {
                                int f3 = u92.f(u92Var.p, max, iArr, u92Var.s.computeHorizontalScrollRange(), u92Var.s.computeHorizontalScrollOffset(), u92Var.q);
                                if (f3 != 0) {
                                    u92Var.s.scrollBy(f3, 0);
                                }
                                u92Var.p = max;
                            }
                        }
                        if (u92Var.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = u92Var.x;
                            iArr2[0] = i5;
                            int i7 = u92Var.r - i5;
                            iArr2[1] = i7;
                            float max2 = Math.max(i5, Math.min(i7, y));
                            if (Math.abs(u92Var.l - max2) >= 2.0f) {
                                int f4 = u92.f(u92Var.m, max2, iArr2, u92Var.s.computeVerticalScrollRange(), u92Var.s.computeVerticalScrollOffset(), u92Var.r);
                                if (f4 != 0) {
                                    u92Var.s.scrollBy(0, f4);
                                }
                                u92Var.m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.q0 = null;
                }
                z = true;
            }
            if (z) {
                VelocityTracker velocityTracker = this.O0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                b0();
                setScrollState(0);
                return true;
            }
            gg5 gg5Var = this.m0;
            if (gg5Var != null) {
                boolean d2 = gg5Var.d();
                boolean e2 = this.m0.e();
                if (this.O0 == null) {
                    this.O0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.o1;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        W(motionEvent);
                                    }
                                } else {
                                    this.N0 = motionEvent.getPointerId(actionIndex);
                                    int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.R0 = x2;
                                    this.P0 = x2;
                                    int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.S0 = y2;
                                    this.Q0 = y2;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.O0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                o0(0);
                                b0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.N0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            int i8 = this.R0 - x3;
                            int i9 = this.S0 - y3;
                            if (this.M0 != 1) {
                                if (d2) {
                                    int i10 = this.T0;
                                    if (i8 > 0) {
                                        i8 = Math.max(0, i8 - i10);
                                    } else {
                                        i8 = Math.min(0, i8 + i10);
                                    }
                                    if (i8 != 0) {
                                        z2 = true;
                                        if (e2) {
                                            int i11 = this.T0;
                                            if (i9 > 0) {
                                                i9 = Math.max(0, i9 - i11);
                                            } else {
                                                i9 = Math.min(0, i9 + i11);
                                            }
                                            if (i9 != 0) {
                                                z2 = true;
                                            }
                                        }
                                        if (z2) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                z2 = false;
                                if (e2) {
                                }
                                if (z2) {
                                }
                            }
                            if (this.M0 == 1) {
                                int[] iArr4 = this.p1;
                                iArr4[0] = 0;
                                iArr4[1] = 0;
                                int c0 = i8 - c0(i8, motionEvent.getY());
                                int d0 = i9 - d0(i9, motionEvent.getX());
                                if (d2) {
                                    i = c0;
                                } else {
                                    i = 0;
                                }
                                if (e2) {
                                    i2 = d0;
                                } else {
                                    i2 = 0;
                                }
                                boolean v = v(i, i2, 0, this.p1, this.n1);
                                int[] iArr5 = this.n1;
                                if (v) {
                                    c0 -= iArr4[0];
                                    d0 -= iArr4[1];
                                    iArr3[0] = iArr3[0] + iArr5[0];
                                    iArr3[1] = iArr3[1] + iArr5[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i12 = c0;
                                int i13 = d0;
                                this.R0 = x3 - iArr5[0];
                                this.S0 = y3 - iArr5[1];
                                if (d2) {
                                    i3 = i12;
                                } else {
                                    i3 = 0;
                                }
                                if (e2) {
                                    i4 = i13;
                                } else {
                                    i4 = 0;
                                }
                                if (f0(i3, i4, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                dr2 dr2Var = this.b1;
                                if (dr2Var != null && (i12 != 0 || i13 != 0)) {
                                    dr2Var.a(this, i12, i13);
                                }
                            }
                        }
                    } else {
                        this.O0.addMovement(obtain);
                        VelocityTracker velocityTracker3 = this.O0;
                        int i14 = this.W0;
                        velocityTracker3.computeCurrentVelocity(1000, i14);
                        if (d2) {
                            f = -this.O0.getXVelocity(this.N0);
                        } else {
                            f = 0.0f;
                        }
                        if (e2) {
                            f2 = -this.O0.getYVelocity(this.N0);
                        } else {
                            f2 = 0.0f;
                        }
                        if ((f == B1 && f2 == B1) || !J((int) f, (int) f2, this.V0, i14)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker4 = this.O0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        o0(0);
                        b0();
                        obtain.recycle();
                        return true;
                    }
                } else {
                    this.N0 = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.R0 = x4;
                    this.P0 = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.S0 = y4;
                    this.Q0 = y4;
                    m0(0);
                }
                this.O0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (this.t0 && !this.C0) {
            z9 z9Var = this.d0;
            if (z9Var.j()) {
                int i = z9Var.a;
                if ((i & 4) != 0 && (i & 11) == 0) {
                    Trace.beginSection("RV PartialInvalidate");
                    l0();
                    U();
                    z9Var.q();
                    if (!this.v0) {
                        dk0 dk0Var = this.e0;
                        int q = dk0Var.q();
                        int i2 = 0;
                        while (true) {
                            if (i2 < q) {
                                wg5 N = N(dk0Var.p(i2));
                                if (N != null && !N.o() && N.k()) {
                                    s();
                                    break;
                                }
                                i2++;
                            } else {
                                z9Var.c();
                                break;
                            }
                        }
                    }
                    n0(true);
                    V(true);
                    Trace.endSection();
                    return;
                } else if (z9Var.j()) {
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
        iv3 iv3Var;
        setScrollState(0);
        vg5 vg5Var = this.a1;
        vg5Var.Z.removeCallbacks(vg5Var);
        vg5Var.L.abortAnimation();
        gg5 gg5Var = this.m0;
        if (gg5Var != null && (iv3Var = gg5Var.e) != null) {
            iv3Var.i();
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ao7.a;
        setMeasuredDimension(gg5.g(i, paddingRight, getMinimumWidth()), gg5.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        N(view);
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BasePreferenceFragment$onCreateRecyclerView$1$2) this.B0.get(size)).getClass();
                view.getClass();
                view.setOnFocusChangeListener(null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        wg5 N = N(view);
        if (N != null) {
            if (N.j()) {
                N.j &= -257;
            } else if (!N.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N);
                i.j(sb, C());
                return;
            }
        } else if (y1) {
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
        iv3 iv3Var = this.m0.e;
        if ((iv3Var == null || !iv3Var.e) && !Q() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m0.n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u92) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0 == 0 && !this.w0) {
            super.requestLayout();
        } else {
            this.v0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0344, code lost:
        if (((java.util.ArrayList) r7.B).contains(getFocusedChild()) == false) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x03e7  */
    /* JADX WARN: Type inference failed for: r14v7, types: [dy7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        Object[] objArr;
        boolean z;
        wg5 wg5Var;
        View findViewById;
        boolean z2;
        ci6 ci6Var;
        dy7 dy7Var;
        boolean g;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.l0 == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.m0 == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            sg5 sg5Var = this.d1;
            boolean z6 = false;
            sg5Var.i = false;
            boolean z7 = true;
            if (this.s1 && (this.t1 != getWidth() || this.u1 != getHeight())) {
                objArr = 1;
            } else {
                objArr = null;
            }
            this.t1 = 0;
            this.u1 = 0;
            this.s1 = false;
            if (sg5Var.d == 1) {
                t();
                this.m0.s0(this);
                u();
            } else {
                z9 z9Var = this.d0;
                if ((((ArrayList) z9Var.d).isEmpty() || ((ArrayList) z9Var.c).isEmpty()) && objArr == null && this.m0.n == getWidth() && this.m0.o == getHeight()) {
                    this.m0.s0(this);
                } else {
                    this.m0.s0(this);
                    u();
                }
            }
            sg5Var.a(4);
            l0();
            U();
            sg5Var.d = 1;
            boolean z8 = sg5Var.j;
            dk0 dk0Var = this.e0;
            mg5 mg5Var = this.L;
            rr6 rr6Var = this.f0;
            if (z8) {
                int q = dk0Var.q() - 1;
                while (q >= 0) {
                    wg5 N = N(dk0Var.p(q));
                    if (N.o()) {
                        z3 = z7;
                    } else {
                        long L = L(N);
                        this.L0.getClass();
                        ?? obj = new Object();
                        obj.b(N);
                        z3 = z7;
                        ci6 ci6Var2 = (ci6) rr6Var.B;
                        wg5 wg5Var2 = (wg5) ((hz3) rr6Var.L).b(L);
                        if (wg5Var2 != null && !wg5Var2.o()) {
                            lo7 lo7Var = (lo7) ci6Var2.get(wg5Var2);
                            if (lo7Var != null && (lo7Var.a & 1) != 0) {
                                z4 = z3;
                            } else {
                                z4 = z6;
                            }
                            lo7 lo7Var2 = (lo7) ci6Var2.get(N);
                            if (lo7Var2 != null && (lo7Var2.a & 1) != 0) {
                                z5 = z3;
                            } else {
                                z5 = z6;
                            }
                            if (z4 && wg5Var2 == N) {
                                rr6Var.e(N, obj);
                            } else {
                                dy7 k = rr6Var.k(wg5Var2, 4);
                                rr6Var.e(N, obj);
                                dy7 k2 = rr6Var.k(N, 8);
                                if (k == null) {
                                    int q2 = dk0Var.q();
                                    for (int i = 0; i < q2; i++) {
                                        wg5 N2 = N(dk0Var.p(i));
                                        if (N2 != N && L(N2) == L) {
                                            wf5 wf5Var = this.l0;
                                            if (wf5Var != null && wf5Var.b) {
                                                StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                sb.append(N2);
                                                sb.append(" \n View Holder 2:");
                                                sb.append(N);
                                                u34.r(sb, C());
                                                return;
                                            }
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(N2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(N);
                                            u34.r(sb2, C());
                                            return;
                                        }
                                    }
                                    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + wg5Var2 + " cannot be found but it is necessary for " + N + C());
                                } else {
                                    wg5Var2.n(false);
                                    if (z4) {
                                        h(wg5Var2);
                                    }
                                    if (wg5Var2 != N) {
                                        if (z5) {
                                            h(N);
                                        }
                                        wg5Var2.h = N;
                                        h(wg5Var2);
                                        mg5Var.p(wg5Var2);
                                        N.n(false);
                                        N.i = wg5Var2;
                                    }
                                    if (this.L0.a(wg5Var2, N, k, k2)) {
                                        X();
                                    }
                                }
                            }
                        } else {
                            rr6Var.e(N, obj);
                        }
                    }
                    q--;
                    z7 = z3;
                    z6 = false;
                }
                z = z7;
                ci6 ci6Var3 = (ci6) rr6Var.B;
                int i2 = ci6Var3.L - 1;
                while (i2 >= 0) {
                    wg5 wg5Var3 = (wg5) ci6Var3.f(i2);
                    lo7 lo7Var3 = (lo7) ci6Var3.g(i2);
                    int i3 = lo7Var3.a;
                    int i4 = i3 & 3;
                    uf5 uf5Var = this.w1;
                    if (i4 == 3) {
                        RecyclerView recyclerView = uf5Var.A;
                        recyclerView.m0.l0(wg5Var3.a, recyclerView.L);
                    } else if ((i3 & 1) != 0) {
                        dy7 dy7Var2 = lo7Var3.b;
                        if (dy7Var2 == null) {
                            RecyclerView recyclerView2 = uf5Var.A;
                            recyclerView2.m0.l0(wg5Var3.a, recyclerView2.L);
                        } else {
                            uf5Var.i(wg5Var3, dy7Var2, lo7Var3.c);
                        }
                    } else if ((i3 & 14) == 14) {
                        uf5Var.h(wg5Var3, lo7Var3.b, lo7Var3.c);
                    } else if ((i3 & 12) == 12) {
                        dy7 dy7Var3 = lo7Var3.b;
                        dy7 dy7Var4 = lo7Var3.c;
                        uf5Var.getClass();
                        wg5Var3.n(false);
                        RecyclerView recyclerView3 = uf5Var.A;
                        boolean z9 = recyclerView3.C0;
                        cg5 cg5Var = recyclerView3.L0;
                        if (z9) {
                            if (cg5Var.a(wg5Var3, wg5Var3, dy7Var3, dy7Var4)) {
                                recyclerView3.X();
                            }
                        } else {
                            ke1 ke1Var = (ke1) cg5Var;
                            ke1Var.getClass();
                            int i5 = dy7Var3.a;
                            int i6 = dy7Var4.a;
                            if (i5 == i6) {
                                ci6Var = ci6Var3;
                                if (dy7Var3.b == dy7Var4.b) {
                                    ke1Var.c(wg5Var3);
                                    g = false;
                                    if (g) {
                                        recyclerView3.X();
                                    }
                                    dy7Var = null;
                                    lo7Var3.a = 0;
                                    lo7Var3.b = dy7Var;
                                    lo7Var3.c = dy7Var;
                                    lo7.d.c(lo7Var3);
                                    i2--;
                                    ci6Var3 = ci6Var;
                                }
                            } else {
                                ci6Var = ci6Var3;
                            }
                            g = ke1Var.g(wg5Var3, i5, dy7Var3.b, i6, dy7Var4.b);
                            if (g) {
                            }
                            dy7Var = null;
                            lo7Var3.a = 0;
                            lo7Var3.b = dy7Var;
                            lo7Var3.c = dy7Var;
                            lo7.d.c(lo7Var3);
                            i2--;
                            ci6Var3 = ci6Var;
                        }
                    } else {
                        ci6Var = ci6Var3;
                        if ((i3 & 4) != 0) {
                            dy7Var = null;
                            uf5Var.i(wg5Var3, lo7Var3.b, null);
                        } else {
                            dy7Var = null;
                            if ((i3 & 8) != 0) {
                                uf5Var.h(wg5Var3, lo7Var3.b, lo7Var3.c);
                            }
                        }
                        lo7Var3.a = 0;
                        lo7Var3.b = dy7Var;
                        lo7Var3.c = dy7Var;
                        lo7.d.c(lo7Var3);
                        i2--;
                        ci6Var3 = ci6Var;
                    }
                    ci6Var = ci6Var3;
                    dy7Var = null;
                    lo7Var3.a = 0;
                    lo7Var3.b = dy7Var;
                    lo7Var3.c = dy7Var;
                    lo7.d.c(lo7Var3);
                    i2--;
                    ci6Var3 = ci6Var;
                }
            } else {
                z = true;
            }
            View view = null;
            this.m0.k0(mg5Var);
            sg5Var.b = sg5Var.e;
            this.C0 = false;
            this.D0 = false;
            sg5Var.j = false;
            sg5Var.k = false;
            this.m0.f = false;
            ArrayList arrayList = (ArrayList) mg5Var.d;
            if (arrayList != null) {
                arrayList.clear();
            }
            gg5 gg5Var = this.m0;
            if (gg5Var.k) {
                gg5Var.j = 0;
                gg5Var.k = false;
                mg5Var.q();
            }
            this.m0.e0(sg5Var);
            boolean z10 = z;
            V(z10);
            n0(false);
            ((ci6) rr6Var.B).clear();
            ((hz3) rr6Var.L).a();
            int[] iArr = this.l1;
            int i7 = iArr[0];
            int i8 = iArr[z10 ? 1 : 0];
            G(iArr);
            if (iArr[0] != i7 || iArr[z10 ? 1 : 0] != i8) {
                x(0, 0);
            }
            if (this.Z0 && this.l0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                if (!isFocused()) {
                }
                long j = sg5Var.m;
                if (j != -1 && (z2 = this.l0.b) && z2) {
                    int t = dk0Var.t();
                    wg5Var = null;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= t) {
                            break;
                        }
                        wg5 N3 = N(dk0Var.s(i9));
                        if (N3 != null && !N3.h() && N3.e == j) {
                            if (((ArrayList) dk0Var.B).contains(N3.a)) {
                                wg5Var = N3;
                            } else {
                                wg5Var = N3;
                                break;
                            }
                        }
                        i9++;
                    }
                } else {
                    wg5Var = null;
                }
                if (wg5Var != null) {
                    View view2 = wg5Var.a;
                    if (!((ArrayList) dk0Var.B).contains(view2) && view2.hasFocusable()) {
                        view = view2;
                        if (view != null) {
                            int i10 = sg5Var.n;
                            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                                view = findViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
                if (dk0Var.q() > 0) {
                    int i11 = sg5Var.l;
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    int b = sg5Var.b();
                    for (int i12 = i11; i12 < b; i12++) {
                        wg5 I = I(i12);
                        if (I == null) {
                            break;
                        }
                        View view3 = I.a;
                        if (view3.hasFocusable()) {
                            view = view3;
                            break;
                        }
                    }
                    int min = Math.min(b, i11) - 1;
                    while (true) {
                        if (min < 0) {
                            break;
                        }
                        wg5 I2 = I(min);
                        if (I2 == null) {
                            break;
                        }
                        View view4 = I2.a;
                        if (view4.hasFocusable()) {
                            view = view4;
                            break;
                        }
                        min--;
                    }
                }
                if (view != null) {
                }
            }
            sg5Var.m = -1L;
            sg5Var.l = -1;
            sg5Var.n = -1;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        gg5 gg5Var = this.m0;
        if (gg5Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.w0) {
            boolean d = gg5Var.d();
            boolean e = this.m0.e();
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
            this.y0 |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(yg5 yg5Var) {
        this.k1 = yg5Var;
        ao7.n(this, yg5Var);
    }

    public void setAdapter(wf5 wf5Var) {
        setLayoutFrozen(false);
        wf5 wf5Var2 = this.l0;
        og5 og5Var = this.B;
        if (wf5Var2 != null) {
            wf5Var2.a.unregisterObserver(og5Var);
            this.l0.getClass();
        }
        cg5 cg5Var = this.L0;
        if (cg5Var != null) {
            cg5Var.e();
        }
        gg5 gg5Var = this.m0;
        mg5 mg5Var = this.L;
        if (gg5Var != null) {
            gg5Var.j0(mg5Var);
            this.m0.k0(mg5Var);
        }
        ((ArrayList) mg5Var.c).clear();
        mg5Var.j();
        z9 z9Var = this.d0;
        z9Var.r((ArrayList) z9Var.c);
        z9Var.r((ArrayList) z9Var.d);
        z9Var.a = 0;
        wf5 wf5Var3 = this.l0;
        this.l0 = wf5Var;
        if (wf5Var != null) {
            wf5Var.a.registerObserver(og5Var);
            wf5Var.d(this);
        }
        gg5 gg5Var2 = this.m0;
        if (gg5Var2 != null) {
            gg5Var2.Q();
        }
        wf5 wf5Var4 = this.l0;
        ((ArrayList) mg5Var.c).clear();
        mg5Var.j();
        mg5Var.h(wf5Var3, true);
        lg5 c = mg5Var.c();
        if (wf5Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                kg5 kg5Var = (kg5) sparseArray.valueAt(i);
                ArrayList arrayList = kg5Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    bl2.n(((wg5) obj).a);
                }
                kg5Var.a.clear();
            }
        }
        if (wf5Var4 != null) {
            c.b++;
        }
        mg5Var.g();
        this.d1.f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ag5 ag5Var) {
        if (ag5Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.g0) {
            this.K0 = null;
            this.I0 = null;
            this.J0 = null;
            this.H0 = null;
        }
        this.g0 = z;
        super.setClipToPadding(z);
        if (this.t0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(bg5 bg5Var) {
        bg5Var.getClass();
        this.G0 = bg5Var;
        this.K0 = null;
        this.I0 = null;
        this.J0 = null;
        this.H0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.s0 = z;
    }

    public void setItemAnimator(cg5 cg5Var) {
        cg5 cg5Var2 = this.L0;
        if (cg5Var2 != null) {
            cg5Var2.e();
            this.L0.a = null;
        }
        this.L0 = cg5Var;
        if (cg5Var != null) {
            cg5Var.a = this.i1;
        }
    }

    public void setItemViewCacheSize(int i) {
        mg5 mg5Var = this.L;
        mg5Var.a = i;
        mg5Var.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(gg5 gg5Var) {
        RecyclerView recyclerView;
        if (gg5Var == this.m0) {
            return;
        }
        p0();
        gg5 gg5Var2 = this.m0;
        mg5 mg5Var = this.L;
        if (gg5Var2 != null) {
            cg5 cg5Var = this.L0;
            if (cg5Var != null) {
                cg5Var.e();
            }
            this.m0.j0(mg5Var);
            this.m0.k0(mg5Var);
            ((ArrayList) mg5Var.c).clear();
            mg5Var.j();
            if (this.r0) {
                gg5 gg5Var3 = this.m0;
                gg5Var3.g = false;
                gg5Var3.S(this);
            }
            this.m0.w0(null);
            this.m0 = null;
        } else {
            ((ArrayList) mg5Var.c).clear();
            mg5Var.j();
        }
        dk0 dk0Var = this.e0;
        ((kk) dk0Var.X).i();
        ArrayList arrayList = (ArrayList) dk0Var.B;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((uf5) dk0Var.R).A;
            if (size < 0) {
                break;
            }
            wg5 N = N((View) arrayList.get(size));
            if (N != null) {
                int i = N.p;
                if (recyclerView.Q()) {
                    N.q = i;
                    recyclerView.q1.add(N);
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
        this.m0 = gg5Var;
        if (gg5Var != null) {
            if (gg5Var.b == null) {
                gg5Var.w0(this);
                if (this.r0) {
                    gg5 gg5Var4 = this.m0;
                    gg5Var4.g = true;
                    gg5Var4.R(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(gg5Var);
                fa6.g(sb, " is already attached to a RecyclerView:", gg5Var.b.C());
                return;
            }
        }
        mg5Var.q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            i.h("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        je4 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = ao7.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(ig5 ig5Var) {
        this.U0 = ig5Var;
    }

    @Deprecated
    public void setOnScrollListener(jg5 jg5Var) {
        this.e1 = jg5Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.Z0 = z;
    }

    public void setRecycledViewPool(lg5 lg5Var) {
        lg5 lg5Var2;
        mg5 mg5Var = this.L;
        RecyclerView recyclerView = (RecyclerView) mg5Var.h;
        mg5Var.h(recyclerView.l0, false);
        if (((lg5) mg5Var.g) != null) {
            lg5Var2.b--;
        }
        mg5Var.g = lg5Var;
        if (lg5Var != null && recyclerView.getAdapter() != null) {
            ((lg5) mg5Var.g).b++;
        }
        mg5Var.g();
    }

    public void setScrollState(int i) {
        iv3 iv3Var;
        if (i != this.M0) {
            if (z1) {
                StringBuilder t = xg6.t("setting scroll state to ", i, " from ");
                t.append(this.M0);
                Log.d("RecyclerView", t.toString(), new Exception());
            }
            this.M0 = i;
            if (i != 2) {
                vg5 vg5Var = this.a1;
                vg5Var.Z.removeCallbacks(vg5Var);
                vg5Var.L.abortAnimation();
                gg5 gg5Var = this.m0;
                if (gg5Var != null && (iv3Var = gg5Var.e) != null) {
                    iv3Var.i();
                }
            }
            gg5 gg5Var2 = this.m0;
            if (gg5Var2 != null) {
                gg5Var2.h0(i);
            }
            jg5 jg5Var = this.e1;
            if (jg5Var != null) {
                jg5Var.a(i);
            }
            ArrayList arrayList = this.f1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((jg5) this.f1.get(size)).a(i);
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
                this.T0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.T0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ug5 ug5Var) {
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
        if (z != this.w0) {
            k("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.w0 = false;
                if (this.v0 && this.m0 != null && this.l0 != null) {
                    requestLayout();
                }
                this.v0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, B1, B1, 0));
            this.w0 = true;
            this.x0 = true;
            p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:290:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [dy7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [dy7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        View view;
        int K;
        View view2;
        boolean z;
        lo7 lo7Var;
        boolean z2;
        View E;
        sg5 sg5Var = this.d1;
        sg5Var.a(1);
        D(sg5Var);
        sg5Var.i = false;
        l0();
        rr6 rr6Var = this.f0;
        ci6 ci6Var = (ci6) rr6Var.B;
        ((ci6) rr6Var.B).clear();
        hz3 hz3Var = (hz3) rr6Var.L;
        hz3Var.a();
        U();
        Y();
        wg5 wg5Var = null;
        if (this.Z0 && hasFocus() && this.l0 != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (E = E(view)) != null) {
            wg5Var = M(E);
        }
        long j = -1;
        if (wg5Var == null) {
            sg5Var.m = -1L;
            sg5Var.l = -1;
            sg5Var.n = -1;
        } else {
            if (this.l0.b) {
                j = wg5Var.e;
            }
            sg5Var.m = j;
            if (!this.C0) {
                if (wg5Var.h()) {
                    K = wg5Var.d;
                } else {
                    RecyclerView recyclerView = wg5Var.r;
                    if (recyclerView != null) {
                        K = recyclerView.K(wg5Var);
                    }
                }
                sg5Var.l = K;
                view2 = wg5Var.a;
                int id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() == -1) {
                        id = view2.getId();
                    }
                }
                sg5Var.n = id;
            }
            K = -1;
            sg5Var.l = K;
            view2 = wg5Var.a;
            int id2 = view2.getId();
            while (!view2.isFocused()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() == -1) {
                }
            }
            sg5Var.n = id2;
        }
        if (sg5Var.j && this.h1) {
            z = true;
        } else {
            z = false;
        }
        sg5Var.h = z;
        this.h1 = false;
        this.g1 = false;
        sg5Var.g = sg5Var.k;
        sg5Var.e = this.l0.a();
        G(this.l1);
        boolean z3 = sg5Var.j;
        dk0 dk0Var = this.e0;
        if (z3) {
            int q = dk0Var.q();
            for (int i = 0; i < q; i++) {
                wg5 N = N(dk0Var.p(i));
                if (!N.o() && (!N.f() || this.l0.b)) {
                    cg5 cg5Var = this.L0;
                    cg5.b(N);
                    N.c();
                    cg5Var.getClass();
                    ?? obj = new Object();
                    obj.b(N);
                    lo7 lo7Var2 = (lo7) ci6Var.get(N);
                    if (lo7Var2 == null) {
                        lo7Var2 = lo7.a();
                        ci6Var.put(N, lo7Var2);
                    }
                    lo7Var2.b = obj;
                    lo7Var2.a |= 4;
                    if (sg5Var.h && N.k() && !N.h() && !N.o() && !N.f()) {
                        hz3Var.f(L(N), N);
                    }
                }
            }
        }
        if (sg5Var.k) {
            int t = dk0Var.t();
            for (int i2 = 0; i2 < t; i2++) {
                wg5 N2 = N(dk0Var.s(i2));
                if (y1 && N2.c == -1 && !N2.h()) {
                    i.m("view holder cannot have position -1 unless it is removed".concat(C()));
                    return;
                }
                if (!N2.o() && N2.d == -1) {
                    N2.d = N2.c;
                }
            }
            boolean z4 = sg5Var.f;
            sg5Var.f = false;
            this.m0.d0(this.L, sg5Var);
            sg5Var.f = z4;
            for (int i3 = 0; i3 < dk0Var.q(); i3++) {
                wg5 N3 = N(dk0Var.p(i3));
                if (!N3.o() && ((lo7Var = (lo7) ci6Var.get(N3)) == null || (lo7Var.a & 4) == 0)) {
                    cg5.b(N3);
                    if ((N3.j & 8192) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cg5 cg5Var2 = this.L0;
                    N3.c();
                    cg5Var2.getClass();
                    ?? obj2 = new Object();
                    obj2.b(N3);
                    if (z2) {
                        a0(N3, obj2);
                    } else {
                        lo7 lo7Var3 = (lo7) ci6Var.get(N3);
                        if (lo7Var3 == null) {
                            lo7Var3 = lo7.a();
                            ci6Var.put(N3, lo7Var3);
                        }
                        lo7Var3.a |= 2;
                        lo7Var3.b = obj2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        V(true);
        n0(false);
        sg5Var.d = 2;
    }

    public final void u() {
        boolean z;
        l0();
        U();
        sg5 sg5Var = this.d1;
        sg5Var.a(6);
        this.d0.d();
        sg5Var.e = this.l0.a();
        sg5Var.c = 0;
        if (this.R != null) {
            wf5 wf5Var = this.l0;
            int ordinal = wf5Var.c.ordinal();
            if (ordinal == 1 ? wf5Var.a() > 0 : ordinal != 2) {
                Parcelable parcelable = this.R.L;
                if (parcelable != null) {
                    this.m0.f0(parcelable);
                }
                this.R = null;
            }
        }
        sg5Var.g = false;
        this.m0.d0(this.L, sg5Var);
        sg5Var.f = false;
        if (sg5Var.j && this.L0 != null) {
            z = true;
        } else {
            z = false;
        }
        sg5Var.j = z;
        sg5Var.d = 4;
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
        this.F0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        jg5 jg5Var = this.e1;
        if (jg5Var != null) {
            jg5Var.b(this, i, i2);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((jg5) this.f1.get(size)).b(this, i, i2);
            }
        }
        this.F0--;
    }

    public final void y() {
        if (this.K0 != null) {
            return;
        }
        ((tg5) this.G0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K0 = edgeEffect;
        if (this.g0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.H0 != null) {
            return;
        }
        ((tg5) this.G0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H0 = edgeEffect;
        if (this.g0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Deprecated
    public void setRecyclerListener(ng5 ng5Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        gg5 gg5Var = this.m0;
        if (gg5Var != null) {
            return gg5Var.t(layoutParams);
        }
        i.m("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }
}
