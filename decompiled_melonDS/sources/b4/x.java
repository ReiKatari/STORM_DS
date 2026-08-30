package b4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.preference.Preference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends ViewGroup implements a4.c2, a4.j2, androidx.lifecycle.f, a4.a2, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, g3.j {
    public static Class D1;
    public static Method E1;
    public static Method F1;
    public static final a1.h0 G1 = new a1.h0();
    public static l H1;
    public static Method I1;
    public long A;
    public final a1.h0 A0;
    public final d2.t A1;
    public final boolean B;
    public a1.h0 B0;
    public View B1;
    public boolean C0;
    public final t C1;
    public final v3.h D0;
    public final l2.g E0;
    public final n2.f1 F0;
    public final b9.e G0;
    public final c3.d H0;
    public boolean I0;
    public final j J0;
    public final i K0;
    public s3.a L;
    public final a4.e2 L0;
    public boolean M0;
    public d1 N0;
    public x4.a O0;
    public boolean P0;
    public final a4.f1 Q0;
    public final a4.r0 R;
    public long R0;
    public final int[] S0;
    public final float[] T0;
    public final float[] U0;
    public final float[] V0;
    public long W0;
    public boolean X0;
    public long Y0;
    public final n2.f1 Z0;

    /* renamed from: a1 */
    public final n2.e0 f1955a1;

    /* renamed from: b0 */
    public f2 f1956b0;

    /* renamed from: b1 */
    public mc.l f1957b1;

    /* renamed from: c0 */
    public g2 f1958c0;

    /* renamed from: c1 */
    public final q4.b0 f1959c1;

    /* renamed from: d0 */
    public w2.d f1960d0;

    /* renamed from: d1 */
    public final q4.y f1961d1;

    /* renamed from: e0 */
    public final zb.j f1962e0;

    /* renamed from: e1 */
    public final AtomicReference f1963e1;

    /* renamed from: f0 */
    public final k f1964f0;

    /* renamed from: f1 */
    public final s1 f1965f1;

    /* renamed from: g0 */
    public final n2.f1 f1966g0;

    /* renamed from: g1 */
    public final b2 f1967g1;

    /* renamed from: h0 */
    public final View f1968h0;

    /* renamed from: h1 */
    public final n2.f1 f1969h1;

    /* renamed from: i0 */
    public final boolean f1970i0;

    /* renamed from: i1 */
    public final n2.f1 f1971i1;

    /* renamed from: j0 */
    public final g3.p f1972j0;

    /* renamed from: j1 */
    public final r1 f1973j1;

    /* renamed from: k0 */
    public cc.g f1974k0;

    /* renamed from: k1 */
    public final r3.c f1975k1;

    /* renamed from: l0 */
    public final e3.b f1976l0;

    /* renamed from: l1 */
    public final z3.b f1977l1;

    /* renamed from: m0 */
    public final e2 f1978m0;

    /* renamed from: m1 */
    public final u0 f1979m1;

    /* renamed from: n0 */
    public final i3.r f1980n0;

    /* renamed from: n1 */
    public MotionEvent f1981n1;

    /* renamed from: o0 */
    public final c1 f1982o0;

    /* renamed from: o1 */
    public long f1983o1;
    public final y3.u p0;

    /* renamed from: p1 */
    public final a0.g f1984p1;

    /* renamed from: q0 */
    public final a4.o0 f1985q0;

    /* renamed from: q1 */
    public final a1.h0 f1986q1;

    /* renamed from: r0 */
    public final a1.x f1987r0;

    /* renamed from: r1 */
    public float f1988r1;

    /* renamed from: s0 */
    public final j4.b f1989s0;

    /* renamed from: s1 */
    public float f1990s1;

    /* renamed from: t0 */
    public final x f1991t0;

    /* renamed from: t1 */
    public final ad.g f1992t1;

    /* renamed from: u0 */
    public final i4.r f1993u0;

    /* renamed from: u1 */
    public final k f1994u1;

    /* renamed from: v0 */
    public final d0 f1995v0;

    /* renamed from: v1 */
    public boolean f1996v1;

    /* renamed from: w0 */
    public d3.e f1997w0;

    /* renamed from: w1 */
    public final a2 f1998w1;

    /* renamed from: x0 */
    public final h f1999x0;

    /* renamed from: x1 */
    public final s f2000x1;

    /* renamed from: y0 */
    public final i3.e f2001y0;

    /* renamed from: y1 */
    public final i1 f2002y1;

    /* renamed from: z0 */
    public final c3.l f2003z0;

    /* renamed from: z1 */
    public boolean f2004z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, l2.g] */
    /* JADX WARN: Type inference failed for: r0v7, types: [i4.e, b3.o] */
    /* JADX WARN: Type inference failed for: r1v35, types: [b4.b2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [z3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, b4.u0] */
    public x(Context context, cc.g gVar) {
        super(context);
        boolean z10;
        b9.e eVar;
        c3.d dVar;
        x4.m mVar;
        i1 k1Var;
        x xVar = this;
        xVar.A = 9205357640488583168L;
        xVar.B = true;
        xVar.R = new a4.r0();
        xVar.f1960d0 = w2.a.A;
        xVar.f1962e0 = new zb.j();
        xVar.f1964f0 = new k(xVar, 0);
        x4.e a10 = p7.j.a(context);
        n2.e eVar2 = n2.e.X;
        xVar.f1966g0 = new n2.f1(a10, eVar2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.f1970i0 = z10;
        ?? oVar = new b3.o();
        xVar.f1972j0 = new g3.p(xVar, xVar);
        xVar.f1974k0 = gVar;
        xVar.f1976l0 = new e3.b();
        xVar.f1978m0 = new e2();
        xVar.f1980n0 = new i3.r();
        xVar.f1982o0 = new c1(ViewConfiguration.get(context));
        xVar.p0 = new y3.u();
        a4.o0 o0Var = new a4.o0(3);
        o0Var.e0(y3.l1.f14706b);
        o0Var.b0(xVar.getDensity());
        o0Var.g0(xVar.getViewConfiguration());
        o0Var.f0(new v(xVar).f(((g3.p) xVar.getFocusOwner()).f5531e).f(xVar.m10getDragAndDropManager().f4253c));
        xVar.f1985q0 = o0Var;
        a1.x xVar2 = a1.m.f66a;
        xVar.f1987r0 = new a1.x();
        xVar.getLayoutNodes();
        xVar.f1989s0 = new j4.b();
        xVar.f1991t0 = xVar;
        xVar.f1993u0 = new i4.r(xVar.getRoot(), oVar, xVar.getLayoutNodes());
        d0 d0Var = new d0(xVar);
        xVar.f1995v0 = d0Var;
        xVar.f1997w0 = new d3.e(xVar, new o(0, xVar, l0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        xVar.f1999x0 = new h(context);
        xVar.f2001y0 = new i3.e(xVar);
        xVar.f2003z0 = new c3.l();
        xVar.A0 = new a1.h0();
        xVar.D0 = new v3.h();
        a4.o0 root = xVar.getRoot();
        ?? obj = new Object();
        obj.f8678b = root;
        obj.f8679c = new v3.d(root.A0.f265c);
        obj.f8680d = new rd.k(9);
        obj.f8681e = new a4.t();
        xVar.E0 = obj;
        xVar.F0 = n2.s.w(new Configuration(context.getResources().getConfiguration()));
        if (e()) {
            eVar = new b9.e(xVar, xVar.getAutofillTree());
        } else {
            eVar = null;
        }
        xVar.G0 = eVar;
        if (e()) {
            AutofillManager d4 = a0.e.d(context.getSystemService(a0.e.i()));
            if (d4 != null) {
                xVar = this;
                dVar = new c3.d(new a0.b(15, d4), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                throw w.d.g("Autofill service could not be located.");
            }
        } else {
            dVar = null;
        }
        xVar.H0 = dVar;
        xVar.J0 = new j(context);
        xVar.K0 = new i(xVar.m9getClipboardManager());
        xVar.L0 = new a4.e2(new r(xVar, 1));
        xVar.Q0 = new a4.f1(xVar.getRoot());
        long j2 = (long) Preference.DEFAULT_ORDER;
        xVar.R0 = (j2 & 4294967295L) | (j2 << 32);
        xVar.S0 = new int[]{0, 0};
        float[] a11 = i3.e0.a();
        xVar.T0 = a11;
        xVar.U0 = i3.e0.a();
        xVar.V0 = i3.e0.a();
        xVar.W0 = -1L;
        xVar.Y0 = 9187343241974906880L;
        xVar.Z0 = n2.s.w(null);
        xVar.f1955a1 = n2.s.q(new s(xVar, 2));
        q4.b0 b0Var = new q4.b0(xVar.getView(), xVar);
        xVar.f1959c1 = b0Var;
        xVar.f1961d1 = new q4.y(b0Var);
        xVar.f1963e1 = new AtomicReference(null);
        xVar.f1965f1 = new s1(xVar.getTextInputService());
        xVar.f1967g1 = new Object();
        xVar.f1969h1 = new n2.f1(l0.f.h(context), eVar2);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = g3.h.f5512a;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                mVar = null;
            } else {
                mVar = x4.m.Rtl;
            }
        } else {
            mVar = x4.m.Ltr;
        }
        xVar.f1971i1 = n2.s.w(mVar == null ? x4.m.Ltr : mVar);
        xVar.f1973j1 = new r1(xVar, 1);
        xVar.f1975k1 = new r3.c(xVar.isInTouchMode() ? 1 : 2);
        ?? obj2 = new Object();
        new p2.b(new a4.c[16]);
        new p2.b(new rd.k[16]);
        new p2.b(new a4.o0[16]);
        new p2.b(new rd.k[16]);
        xVar.f1977l1 = obj2;
        ?? obj3 = new Object();
        new x8.e(new a4.m0(3, obj3));
        t2 t2Var = t2.Shown;
        xVar.f1979m1 = obj3;
        xVar.f1984p1 = new a0.g(8);
        xVar.f1986q1 = new a1.h0();
        xVar.f1992t1 = new ad.g(1, xVar);
        xVar.f1994u1 = new k(xVar, 1);
        xVar.f1998w1 = new a2(context, new r(xVar, 0));
        xVar.f2000x1 = new s(xVar, 1);
        if (i2 < 29) {
            k1Var = new j1(a11);
        } else {
            k1Var = new k1();
        }
        xVar.f2002y1 = k1Var;
        xVar.addOnAttachStateChangeListener(xVar.f1997w0);
        xVar.setWillNotDraw(false);
        xVar.setFocusable(true);
        if (i2 >= 26) {
            k0.f1871a.a(xVar, 1, false);
        }
        xVar.setFocusableInTouchMode(true);
        xVar.setClipChildren(false);
        a6.x0.o(xVar, d0Var);
        xVar.setOnDragListener(xVar.m10getDragAndDropManager());
        xVar.getRoot().d(xVar);
        if (i2 >= 29) {
            g0.f1847a.a(xVar);
        }
        if (z10) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            xVar.f1968h0 = view;
            xVar.addView(view, -1);
        }
        xVar.A1 = i2 >= 31 ? new d2.t(10, (byte) 0) : null;
        xVar.C1 = new t(xVar);
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof x) {
                ((x) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j2 = size;
                    return j2 | (j2 << 32);
                }
                throw new IllegalStateException();
            }
            return (0 << 32) | ((long) Preference.DEFAULT_ORDER);
        }
        return (0 << 32) | size;
    }

    public final n get_viewTreeOwners() {
        return (n) this.Z0.getValue();
    }

    public static View h(View view, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (nc.k.a(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View h2 = h(viewGroup.getChildAt(i10), i2);
                    if (h2 != null) {
                        return h2;
                    }
                }
            }
        }
        return null;
    }

    public static void k(a4.o0 o0Var) {
        o0Var.D();
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            k((a4.o0) objArr[i10]);
        }
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z10;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Preference.DEFAULT_ORDER) < 2139095040) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i2)) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i2)) & Preference.DEFAULT_ORDER) < 2139095040 && (Build.VERSION.SDK_INT < 29 || j2.f1868a.a(motionEvent, i2))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private void setDensity(x4.c cVar) {
        this.f1966g0.setValue(cVar);
    }

    private void setFontFamilyResolver(p4.d dVar) {
        this.f1969h1.setValue(dVar);
    }

    private void setLayoutDirection(x4.m mVar) {
        this.f1971i1.setValue(mVar);
    }

    private final void set_viewTreeOwners(n nVar) {
        this.Z0.setValue(nVar);
    }

    public final boolean A() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void B(a4.o0 o0Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (o0Var != null) {
                while (o0Var != null && o0Var.r() == a4.k0.InMeasureBlock) {
                    if (!this.P0) {
                        a4.o0 u4 = o0Var.u();
                        if (u4 == null) {
                            break;
                        }
                        long j2 = u4.A0.f265c.R;
                        if (x4.a.f(j2) && x4.a.e(j2)) {
                            break;
                        }
                    }
                    o0Var = o0Var.u();
                }
                if (o0Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long C(long j2) {
        y();
        return i3.e0.b((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.Y0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.Y0 >> 32))) << 32), this.V0);
    }

    public final int D(MotionEvent motionEvent) {
        Object obj;
        if (this.f2004z1) {
            this.f2004z1 = false;
            int metaState = motionEvent.getMetaState();
            this.f1978m0.getClass();
            c3.f1803a.setValue(new v3.x(metaState));
        }
        v3.h hVar = this.D0;
        p1.a0 c4 = hVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        l2.g gVar = this.E0;
        if (c4 != null) {
            List list = (List) c4.B;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    obj = list.get(size);
                    if (((v3.v) obj).f13712e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    } else if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            obj = null;
            v3.v vVar = (v3.v) obj;
            if (vVar != null) {
                this.A = vVar.f13711d;
            }
            int b10 = gVar.b(c4, this, n(motionEvent));
            c4.L = null;
            if ((actionMasked != 0 && actionMasked != 5) || (b10 & 1) != 0) {
                return b10;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            hVar.f13653c.delete(pointerId);
            hVar.f13652b.delete(pointerId);
            return b10;
        }
        if (!gVar.f8677a) {
            ((a1.q) ((rd.k) gVar.f8680d).B).a();
            ((v3.d) gVar.f8679c).c();
        }
        return 0;
    }

    public final void E(MotionEvent motionEvent, int i2, long j2, boolean z10) {
        int i10;
        int buttonState;
        long downTime;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int i12 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i12 >= 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = pointerCount - i10;
        if (i13 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            pointerPropertiesArr[i14] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            pointerCoordsArr[i15] = new MotionEvent.PointerCoords();
        }
        for (int i16 = 0; i16 < i13; i16++) {
            if (i12 >= 0 && i16 >= i12) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i17 = i11 + i16;
            motionEvent.getPointerProperties(i17, pointerPropertiesArr[i16]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i16];
            motionEvent.getPointerCoords(i17, pointerCoords);
            float f8 = pointerCoords.x;
            float f10 = pointerCoords.y;
            long q10 = q((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (q10 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (q10 & 4294967295L));
        }
        if (z10) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j2;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j2, i2, i13, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        p1.a0 c4 = this.D0.c(obtain, this);
        c4.getClass();
        this.E0.b(c4, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dc.a F(mc.p r6, ec.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b4.w
            if (r0 == 0) goto L13
            r0 = r7
            b4.w r0 = (b4.w) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            b4.w r0 = new b4.w
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
        L28:
            r6 = 0
            return r6
        L2a:
            p7.j.I(r7)
            goto L48
        L2e:
            p7.j.I(r7)
            b4.r r7 = new b4.r
            r2 = 2
            r7.<init>(r5, r2)
            r0.Y = r3
            a9.d r2 = new a9.d
            r3 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r5.f1963e1
            r2.<init>(r7, r4, r6, r3)
            java.lang.Object r6 = zc.x.g(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            wa.b.a()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.F(mc.p, ec.c):dc.a");
    }

    public final void G(Configuration configuration) {
        int i2;
        n2.f1 f1Var;
        Configuration configuration2 = getConfiguration();
        if (!nc.k.a(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(p7.j.a(getContext()));
            }
            if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (f1Var = this.f1978m0.f1840b) != null) {
                f1Var.setValue(l0.e(this));
            }
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 31) {
                i2 = configuration2.fontWeightAdjustment;
            } else {
                i2 = 0;
            }
            if (i10 >= 31) {
                i11 = configuration.fontWeightAdjustment;
            }
            if (i2 != i11) {
                setFontFamilyResolver(l0.f.h(getContext()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.H():void");
    }

    public final void I(float f8) {
        if (this.f1970i0) {
            if (f8 > 0.0f) {
                if (Float.isNaN(this.f1988r1) || f8 > this.f1988r1) {
                    this.f1988r1 = f8;
                }
            } else if (f8 < 0.0f) {
                if (Float.isNaN(this.f1990s1) || f8 < this.f1990s1) {
                    this.f1990s1 = f8;
                }
            }
        }
    }

    @Override // g3.j
    public final void a(g3.g0 g0Var, g3.g0 g0Var2) {
        boolean z10;
        a4.n1 n1Var;
        a4.n1 n1Var2;
        if (g0Var != null) {
            g3.g0 g0Var3 = g0Var;
            if (!g0Var3.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar = g0Var3.A;
            a4.o0 t5 = a4.l.t(g0Var);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (t5 != null) {
                if ((t5.A0.f268f.R & 2097152) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 2097152) != 0) {
                            b3.o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof s3.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(oVar2);
                                } else if ((oVar2.L & 2097152) != 0 && (oVar2 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = a4.l.e(bVar);
                            }
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var2 = t5.A0) != null) {
                    oVar = n1Var2.f267e;
                } else {
                    oVar = null;
                }
            }
            if (arrayList != null) {
                if (g0Var2 != null) {
                    if (!g0Var2.A.f1777h0) {
                        x3.a.c("visitAncestors called on an unattached node");
                    }
                    b3.o oVar4 = g0Var2.A;
                    a4.o0 t10 = a4.l.t(g0Var2);
                    LinkedHashSet linkedHashSet2 = null;
                    while (t10 != null) {
                        if ((t10.A0.f268f.R & 2097152) != 0) {
                            while (oVar4 != null) {
                                if ((oVar4.L & 2097152) != 0) {
                                    b3.o oVar5 = oVar4;
                                    p2.b bVar2 = null;
                                    while (oVar5 != null) {
                                        if (oVar5 instanceof s3.c) {
                                            if (linkedHashSet2 == null) {
                                                linkedHashSet2 = new LinkedHashSet();
                                            }
                                            linkedHashSet2.add(oVar5);
                                        } else if ((oVar5.L & 2097152) != 0 && (oVar5 instanceof a4.k)) {
                                            int i10 = 0;
                                            for (b3.o oVar6 = ((a4.k) oVar5).f247j0; oVar6 != null; oVar6 = oVar6.Y) {
                                                if ((oVar6.L & 2097152) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        oVar5 = oVar6;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new p2.b(new b3.o[16]);
                                                        }
                                                        if (oVar5 != null) {
                                                            bVar2.b(oVar5);
                                                            oVar5 = null;
                                                        }
                                                        bVar2.b(oVar6);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        oVar5 = a4.l.e(bVar2);
                                    }
                                }
                                oVar4 = oVar4.X;
                            }
                        }
                        t10 = t10.u();
                        if (t10 != null && (n1Var = t10.A0) != null) {
                            oVar4 = n1Var.f267e;
                        } else {
                            oVar4 = null;
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    s3.c cVar = (s3.c) arrayList.get(i11);
                    if (linkedHashSet != null) {
                        z10 = linkedHashSet.contains(cVar);
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        cVar.B();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i10) {
        g3.g0 g0Var = ((g3.p) getFocusOwner()).f5529c;
        if (g0Var.f1777h0) {
            if (!g0Var.A.f1777h0) {
                x3.a.c("visitSubtreeIf called on an unattached node");
            }
            p2.b bVar = new p2.b(new b3.o[16]);
            b3.o oVar = g0Var.A;
            b3.o oVar2 = oVar.Y;
            if (oVar2 == null) {
                a4.l.b(bVar, oVar);
            } else {
                bVar.b(oVar2);
            }
            while (true) {
                int i11 = bVar.L;
                if (i11 != 0) {
                    b3.o oVar3 = (b3.o) bVar.k(i11 - 1);
                    if ((oVar3.R & 1024) != 0) {
                        for (b3.o oVar4 = oVar3; oVar4 != null && oVar4.f1777h0; oVar4 = oVar4.Y) {
                            if ((oVar4.L & 1024) != 0) {
                                b3.o oVar5 = oVar4;
                                p2.b bVar2 = null;
                                while (oVar5 != null) {
                                    int i12 = 0;
                                    if (oVar5 instanceof g3.g0) {
                                        g3.g0 g0Var2 = (g3.g0) oVar5;
                                        if (g0Var2.f1777h0 && g0Var2.Q0().f5537a) {
                                            super.addFocusables(arrayList, i2, i10);
                                            g3.g0 g0Var3 = ((g3.p) getFocusOwner()).f5529c;
                                            if (g0Var3.f1777h0) {
                                                if (!g0Var3.A.f1777h0) {
                                                    x3.a.c("visitSubtreeIf called on an unattached node");
                                                }
                                                p2.b bVar3 = new p2.b(new b3.o[16]);
                                                b3.o oVar6 = g0Var3.A;
                                                b3.o oVar7 = oVar6.Y;
                                                if (oVar7 == null) {
                                                    a4.l.b(bVar3, oVar6);
                                                } else {
                                                    bVar3.b(oVar7);
                                                }
                                                while (true) {
                                                    int i13 = bVar3.L;
                                                    if (i13 == 0) {
                                                        break;
                                                    }
                                                    b3.o oVar8 = (b3.o) bVar3.k(i13 - 1);
                                                    if ((oVar8.R & 1024) != 0) {
                                                        for (b3.o oVar9 = oVar8; oVar9 != null && oVar9.f1777h0; oVar9 = oVar9.Y) {
                                                            if ((oVar9.L & 1024) != 0) {
                                                                b3.o oVar10 = oVar9;
                                                                p2.b bVar4 = null;
                                                                while (oVar10 != null) {
                                                                    if (oVar10 instanceof g3.g0) {
                                                                        g3.g0 g0Var4 = (g3.g0) oVar10;
                                                                        if (g0Var4.f1777h0) {
                                                                            g3.u Q0 = g0Var4.Q0();
                                                                            if (g0Var4.f1777h0 && Q0.f5537a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((oVar10.L & 1024) != 0 && (oVar10 instanceof a4.k)) {
                                                                        int i14 = 0;
                                                                        for (b3.o oVar11 = ((a4.k) oVar10).f247j0; oVar11 != null; oVar11 = oVar11.Y) {
                                                                            if ((oVar11.L & 1024) != 0) {
                                                                                i14++;
                                                                                if (i14 == 1) {
                                                                                    oVar10 = oVar11;
                                                                                } else {
                                                                                    if (bVar4 == null) {
                                                                                        bVar4 = new p2.b(new b3.o[16]);
                                                                                    }
                                                                                    if (oVar10 != null) {
                                                                                        bVar4.b(oVar10);
                                                                                        oVar10 = null;
                                                                                    }
                                                                                    bVar4.b(oVar11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i14 == 1) {
                                                                        }
                                                                    }
                                                                    oVar10 = a4.l.e(bVar4);
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    a4.l.b(bVar3, oVar8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((oVar5.L & 1024) != 0 && (oVar5 instanceof a4.k)) {
                                        for (b3.o oVar12 = ((a4.k) oVar5).f247j0; oVar12 != null; oVar12 = oVar12.Y) {
                                            if ((oVar12.L & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    oVar5 = oVar12;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new p2.b(new b3.o[16]);
                                                    }
                                                    if (oVar5 != null) {
                                                        bVar2.b(oVar5);
                                                        oVar5 = null;
                                                    }
                                                    bVar2.b(oVar12);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    oVar5 = a4.l.e(bVar2);
                                }
                                continue;
                            }
                        }
                    }
                    a4.l.b(bVar, oVar3);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        i4.m x9;
        mc.l lVar;
        mc.l lVar2;
        CharSequence textValue2;
        if (e()) {
            c3.d dVar = this.H0;
            if (dVar != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = sparseArray.keyAt(i2);
                    AutofillValue e6 = a0.e.e(sparseArray.get(keyAt));
                    a4.o0 o0Var = (a4.o0) dVar.B.f6778c.b(keyAt);
                    if (o0Var != null && (x9 = o0Var.x()) != null) {
                        a1.m0 m0Var = x9.A;
                        Object g10 = m0Var.g(i4.l.f6746g);
                        i4.a aVar = null;
                        if (g10 == null) {
                            g10 = null;
                        }
                        i4.a aVar2 = (i4.a) g10;
                        if (aVar2 != null && (lVar2 = (mc.l) aVar2.f6708b) != null) {
                            textValue2 = e6.getTextValue();
                            Boolean bool = (Boolean) lVar2.k(new l4.h(textValue2.toString()));
                        }
                        Object g11 = m0Var.g(i4.l.f6747h);
                        if (g11 != null) {
                            aVar = g11;
                        }
                        i4.a aVar3 = aVar;
                        if (aVar3 != null && (lVar = (mc.l) aVar3.f6708b) != null) {
                            Boolean bool2 = (Boolean) lVar.k(new c3.g(e6));
                        }
                    }
                }
            }
            b9.e eVar = this.G0;
            if (eVar != null) {
                c3.l lVar3 = (c3.l) eVar.L;
                if (!lVar3.f2564a.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        int keyAt2 = sparseArray.keyAt(i10);
                        AutofillValue e10 = a0.e.e(sparseArray.get(keyAt2));
                        isText = e10.isText();
                        if (isText) {
                            textValue = e10.getTextValue();
                            textValue.toString();
                            if (lVar3.f2564a.get(Integer.valueOf(keyAt2)) != null) {
                                m9.o.b();
                                return;
                            }
                        } else {
                            isDate = e10.isDate();
                            if (!isDate) {
                                isList = e10.isList();
                                if (!isList) {
                                    isToggle = e10.isToggle();
                                    if (isToggle) {
                                        throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                                    }
                                } else {
                                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                                }
                            } else {
                                throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.f1995v0.m(false, i2, this.A);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.f1995v0.m(true, i2, this.A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        r(true);
        z2.l.j().m();
        this.C0 = true;
        i3.r rVar = this.f1980n0;
        i3.b bVar = rVar.f6680a;
        Canvas canvas2 = bVar.f6615a;
        bVar.f6615a = canvas;
        getRoot().i(bVar, null);
        rVar.f6680a.f6615a = canvas2;
        a1.h0 h0Var = this.A0;
        if (h0Var.i()) {
            int i2 = h0Var.f45b;
            for (int i10 = 0; i10 < i2; i10++) {
                ((y1) ((a4.b2) h0Var.f(i10))).g();
            }
        }
        int i11 = a3.A;
        h0Var.d();
        this.C0 = false;
        a1.h0 h0Var2 = this.B0;
        if (h0Var2 != null) {
            h0Var.b(h0Var2);
            h0Var2.d();
        }
        if (this.f1970i0) {
            g1.a(this, this.f1988r1);
            View view = this.f1968h0;
            if (view != null) {
                g1.a(view, this.f1990s1);
                if (!Float.isNaN(this.f1990s1)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
                this.f1988r1 = Float.NaN;
                this.f1990s1 = Float.NaN;
            } else {
                nc.k.f("frameRateCategoryView");
                throw null;
            }
        }
        getRectManager().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:950:0x043f, code lost:
        if ((r2 / r3) >= 5.0f) goto L635;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0154, code lost:
        if (o(r24) == false) goto L68;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.f1978m0.getClass();
            c3.f1803a.setValue(new v3.x(metaState));
            if (!((g3.p) getFocusOwner()).d(keyEvent, g3.k.B) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((g3.p) getFocusOwner()).d(keyEvent, new a4.n0(2, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        a4.n1 n1Var;
        if (isFocused()) {
            g3.p pVar = (g3.p) getFocusOwner();
            if (pVar.f5530d.f5519e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                g3.g0 f8 = g3.d.f(pVar.f5529c);
                if (f8 != null) {
                    if (!f8.A.f1777h0) {
                        x3.a.c("visitAncestors called on an unattached node");
                    }
                    b3.o oVar = f8.A;
                    a4.o0 t5 = a4.l.t(f8);
                    while (t5 != null) {
                        if ((t5.A0.f268f.R & 131072) != 0) {
                            while (oVar != null) {
                                if ((oVar.L & 131072) != 0) {
                                    b3.o oVar2 = oVar;
                                    p2.b bVar = null;
                                    while (oVar2 != null) {
                                        if ((oVar2.L & 131072) != 0 && (oVar2 instanceof a4.k)) {
                                            int i2 = 0;
                                            for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                                if ((oVar3.L & 131072) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        oVar2 = oVar3;
                                                    } else {
                                                        if (bVar == null) {
                                                            bVar = new p2.b(new b3.o[16]);
                                                        }
                                                        if (oVar2 != null) {
                                                            bVar.b(oVar2);
                                                            oVar2 = null;
                                                        }
                                                        bVar.b(oVar3);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        oVar2 = a4.l.e(bVar);
                                    }
                                }
                                oVar = oVar.X;
                            }
                        }
                        t5 = t5.u();
                        if (t5 != null && (n1Var = t5.A0) != null) {
                            oVar = n1Var.f267e;
                        } else {
                            oVar = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            f0.f1844a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        View view;
        Object h1Var;
        g3.g0 f8;
        if (this.f1996v1) {
            k kVar = this.f1994u1;
            removeCallbacks(kVar);
            MotionEvent motionEvent2 = this.f1981n1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f1996v1 = false;
            } else {
                kVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int j2 = j(motionEvent);
            if ((j2 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 && z11) {
                ViewParent parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null || (h1Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    h1Var = new h1(1);
                }
                if (h1Var.equals(new h1(1)) && (f8 = ((g3.p) getFocusOwner()).f()) != null) {
                    a4.r1 s10 = a4.l.s(f8);
                    if (!y3.c0.i(s10).k(s10, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((g3.p) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((j2 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return h(this, i2);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [nc.t, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i10;
        if (view != null && !this.Q0.f204c) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i2);
            h3.c cVar = null;
            if (findNextFocus != null && !findNextFocus.equals(this)) {
                for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
            }
            findNextFocus = null;
            if (view == this) {
                g3.g0 f8 = g3.d.f(((g3.p) getFocusOwner()).f5529c);
                if (f8 != null) {
                    cVar = g3.d.j(f8);
                }
                if (cVar == null) {
                    cVar = g3.h.a(view, this);
                }
            } else {
                cVar = g3.h.a(view, this);
            }
            g3.f b10 = g3.h.b(i2);
            if (b10 != null) {
                i10 = b10.f5505a;
            } else {
                i10 = 6;
            }
            ?? obj = new Object();
            if (((g3.p) getFocusOwner()).e(i10, cVar, new p(obj, 0)) == null) {
                return view;
            }
            Object obj2 = obj.A;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i2);
                }
            } else if (findNextFocus == null || i10 == 1 || i10 == 2 || g3.d.p(g3.d.j((g3.g0) obj2), g3.h.a(findNextFocus, this), cVar, i10)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i2);
    }

    public final d1 getAndroidViewsHandler$ui() {
        if (this.N0 == null) {
            d1 d1Var = new d1(getContext());
            this.N0 = d1Var;
            addView(d1Var, -1);
            requestLayout();
        }
        d1 d1Var2 = this.N0;
        d1Var2.getClass();
        return d1Var2;
    }

    public c3.h getAutofill() {
        return this.G0;
    }

    public c3.k getAutofillManager() {
        return this.H0;
    }

    public c3.l getAutofillTree() {
        return this.f2003z0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.F0.getValue();
    }

    public final d3.e getContentCaptureManager$ui() {
        return this.f1997w0;
    }

    public cc.g getCoroutineContext() {
        return this.f1974k0;
    }

    public x4.c getDensity() {
        return (x4.c) this.f1966g0.getValue();
    }

    public h3.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            g3.g0 f8 = g3.d.f(((g3.p) getFocusOwner()).f5529c);
            if (f8 == null) {
                return null;
            }
            return g3.d.j(f8);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return g3.h.a(findFocus, this);
    }

    public g3.l getFocusOwner() {
        return this.f1972j0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        h3.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f6052a);
            rect.top = Math.round(embeddedViewFocusRect.f6053b);
            rect.right = Math.round(embeddedViewFocusRect.f6054c);
            rect.bottom = Math.round(embeddedViewFocusRect.f6055d);
            return;
        }
        if (!nc.k.a(((g3.p) getFocusOwner()).e(6, null, q.L), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public p4.d getFontFamilyResolver() {
        return (p4.d) this.f1969h1.getValue();
    }

    public p4.c getFontLoader() {
        return this.f1967g1;
    }

    public final f2 getFrameEndScheduler$ui() {
        return this.f1956b0;
    }

    public i3.x getGraphicsContext() {
        return this.f2001y0;
    }

    public q3.a getHapticFeedBack() {
        return this.f1973j1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!this.Q0.f203b.y() && this.f1962e0.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public r3.b getInputModeManager() {
        return this.f1975k1;
    }

    public final y3.u getInsetsListener() {
        return this.p0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.W0;
    }

    @Override // android.view.View, android.view.ViewParent
    public x4.m getLayoutDirection() {
        return (x4.m) this.f1971i1.getValue();
    }

    public long getMeasureIteration() {
        a4.f1 f1Var = this.Q0;
        if (!f1Var.f204c) {
            x3.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return f1Var.f208g;
    }

    public z3.b getModifierLocalManager() {
        return this.f1977l1;
    }

    public x getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public y3.h1 getPlacementScope() {
        int i2 = y3.k1.f14703b;
        return new y3.q0(1, this);
    }

    public v3.r getPointerIconService() {
        return this.C1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui */
    public final s3.a m5getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.L;
    }

    public j4.b getRectManager() {
        return this.f1989s0;
    }

    public w2.d getRetainedValuesStore() {
        return this.f1960d0;
    }

    public a4.o0 getRoot() {
        return this.f1985q0;
    }

    public a4.j2 getRootForTest() {
        return this.f1991t0;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        d2.t tVar;
        if (Build.VERSION.SDK_INT >= 31 && (tVar = this.A1) != null) {
            return ((Boolean) ((n2.f1) tVar.B).getValue()).booleanValue();
        }
        return false;
    }

    public i4.r getSemanticsOwner() {
        return this.f1993u0;
    }

    public a4.r0 getSharedDrawScope() {
        return this.R;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return f1.f1845a.a(this);
        }
        return this.M0;
    }

    public a4.e2 getSnapshotObserver() {
        return this.L0;
    }

    public r2 getSoftwareKeyboardController() {
        return this.f1965f1;
    }

    public q4.y getTextInputService() {
        return this.f1961d1;
    }

    public s2 getTextToolbar() {
        return this.f1979m1;
    }

    public final a4.i2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public z2 getViewConfiguration() {
        return this.f1982o0;
    }

    public final n getViewTreeOwners() {
        return (n) this.f1955a1.getValue();
    }

    public b3 getWindowInfo() {
        return this.f1978m0;
    }

    public final c3.d get_autofillManager$ui() {
        return this.H0;
    }

    public final void i(a4.o0 o0Var, boolean z10) {
        this.Q0.f(o0Var, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:135:0x0034, B:137:0x003e, B:143:0x004e, B:159:0x007d, B:161:0x0081, B:162:0x0093, B:171:0x00a6, B:173:0x00ac, B:146:0x0056, B:152:0x0062, B:155:0x006a), top: B:237:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:125:0x0018, B:127:0x0021, B:175:0x00b6, B:178:0x00be, B:179:0x00c1, B:181:0x00c5, B:183:0x00cb, B:185:0x00cf, B:187:0x00d5, B:190:0x00dd, B:193:0x00e5, B:194:0x00f1, B:196:0x00f7, B:198:0x00fd, B:200:0x0103, B:202:0x0109, B:204:0x010d, B:205:0x0111, B:211:0x0124, B:213:0x0128, B:215:0x012f, B:222:0x0140, B:223:0x014a, B:225:0x0152, B:226:0x0155, B:227:0x015c), top: B:239:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.j(android.view.MotionEvent):int");
    }

    public final void l(a4.o0 o0Var) {
        this.Q0.p(o0Var, false);
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            l((a4.o0) objArr[i10]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x9 && x9 <= getWidth() && 0.0f <= y10 && y10 <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f1981n1) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.a1, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        w2.d dVar;
        androidx.lifecycle.r lifecycle;
        g2 g2Var;
        b9.e eVar;
        Method method;
        super.onAttachedToWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(l0.k());
        }
        this.p0.onViewAttachedToWindow(this);
        int i10 = 0;
        int i11 = 1;
        androidx.lifecycle.r rVar = null;
        if (i2 > 28) {
            if (H1 == null) {
                l lVar = new l(0);
                H1 = lVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (D1 == null) {
                        D1 = Class.forName("android.os.SystemProperties");
                    }
                    if (F1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = D1;
                        if (cls != null) {
                            method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                        } else {
                            method = null;
                        }
                        F1 = method;
                    }
                    Method method2 = F1;
                    if (method2 != null) {
                        method2.invoke(null, lVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            a1.h0 h0Var = G1;
            synchronized (h0Var) {
                h0Var.a(this);
            }
        }
        this.f1978m0.f1841c.setValue(Boolean.valueOf(hasWindowFocus()));
        e2 e2Var = this.f1978m0;
        s sVar = new s(this, 0);
        n2.f1 f1Var = e2Var.f1840b;
        if (f1Var == null) {
            e2Var.f1839a = sVar;
        }
        if (f1Var != null) {
            f1Var.setValue(l0.e(this));
        }
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().f194a.d();
        if (e() && (eVar = this.G0) != null) {
            c3.j jVar = c3.j.f2563a;
            jVar.getClass();
            ((AutofillManager) eVar.R).registerCallback(a0.e.c(jVar));
        }
        androidx.lifecycle.x d4 = androidx.lifecycle.s0.d(this);
        q7.f j2 = p7.o.j(this);
        androidx.lifecycle.e1 e6 = androidx.lifecycle.s0.e(this);
        f2 f2Var = this.f1956b0;
        if (d4 != null && e6 != null && f2Var != null) {
            androidx.lifecycle.d1 viewModelStore = e6.getViewModelStore();
            ?? obj = new Object();
            w6.a aVar = w6.a.f14160b;
            viewModelStore.getClass();
            aVar.getClass();
            b9.e eVar2 = new b9.e(viewModelStore, (androidx.lifecycle.a1) obj, aVar);
            nc.e a10 = nc.u.a(h2.class);
            String b10 = a10.b();
            if (b10 != null) {
                ViewParent parent = getParent();
                parent.getClass();
                int id2 = ((View) parent).getId();
                a1.x xVar = ((h2) eVar2.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f1855b;
                Object b11 = xVar.b(id2);
                if (b11 == null) {
                    b11 = new a1.h0(1);
                    xVar.i(id2, b11);
                }
                a1.h0 h0Var2 = (a1.h0) b11;
                Object[] objArr = h0Var2.f44a;
                int i12 = h0Var2.f45b;
                while (true) {
                    if (i10 < i12) {
                        g2Var = objArr[i10];
                        if (!((g2) g2Var).f1850c) {
                            break;
                        }
                        i10++;
                    } else {
                        g2Var = null;
                        break;
                    }
                }
                g2 g2Var2 = g2Var;
                if (g2Var2 == null) {
                    g2Var2 = new g2();
                    h0Var2.a(g2Var2);
                }
                g2Var2.f1850c = true;
                this.f1958c0 = g2Var2;
                dVar = g2Var2.f1849b;
            } else {
                a0.j.h("Local and anonymous classes can not be ViewModels");
                return;
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = w2.a.A;
        }
        this.f1960d0 = dVar;
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (d4 != null && j2 != null && (d4 != viewTreeOwners.f1902a || j2 != viewTreeOwners.f1903b || e6 != viewTreeOwners.f1904c))) {
            if (d4 != null) {
                if (j2 != null) {
                    if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f1902a.getLifecycle()) != null) {
                        lifecycle.c(this);
                    }
                    d4.getLifecycle().a(this);
                    n nVar = new n(d4, j2, e6);
                    set_viewTreeOwners(nVar);
                    mc.l lVar2 = this.f1957b1;
                    if (lVar2 != null) {
                        lVar2.k(nVar);
                    }
                    this.f1957b1 = null;
                } else {
                    a0.j.p("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    return;
                }
            } else {
                a0.j.p("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
        }
        r3.c cVar = this.f1975k1;
        if (!isInTouchMode()) {
            i11 = 2;
        }
        cVar.f12616a.setValue(new r3.a(i11));
        n viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null) {
            rVar = viewTreeOwners2.f1902a.getLifecycle();
        }
        if (rVar != null) {
            rVar.a(this);
            rVar.a(this.f1997w0);
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (Build.VERSION.SDK_INT >= 31) {
                i0.f1857a.b(this);
            }
            c3.d dVar2 = this.H0;
            if (dVar2 != null) {
                ((g3.p) getFocusOwner()).f5533g.a(dVar2);
                getSemanticsOwner().f6779d.a(dVar2);
            }
            ((g3.p) getFocusOwner()).f5533g.a(this);
            return;
        }
        throw w.d.g("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        c2 c2Var;
        b3.s sVar = (b3.s) this.f1963e1.get();
        Object obj2 = null;
        if (sVar != null) {
            obj = sVar.f1779b;
        } else {
            obj = null;
        }
        t0 t0Var = (t0) obj;
        if (t0Var == null) {
            return this.f1959c1.f12213d;
        }
        b3.s sVar2 = (b3.s) t0Var.R.get();
        if (sVar2 != null) {
            obj2 = sVar2.f1779b;
        }
        if (((c2) obj2) != null && (!c2Var.f1802e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0101  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        i4.p pVar;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        d3.e eVar = this.f1997w0;
        eVar.getClass();
        for (long j2 : jArr) {
            i4.q qVar = (i4.q) eVar.c().b((int) j2);
            if (qVar != null && (pVar = qVar.f6774a) != null) {
                a6.c.t();
                autofillId = eVar.A.getAutofillId();
                ViewTranslationRequest.Builder p10 = a6.c.p(autofillId, pVar.f6773g);
                Object g10 = pVar.f6770d.A.g(i4.t.B);
                if (g10 == null) {
                    g10 = null;
                }
                List list = (List) g10;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new l4.h(z4.a.a(list, "\n", null, 62)));
                    p10.setValue("android:text", forText);
                    build = p10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.lifecycle.r rVar;
        b9.e eVar;
        super.onDetachedFromWindow();
        this.p0.onViewDetachedFromWindow(this);
        if (this.f1970i0) {
            View view = this.f1968h0;
            if (view != null) {
                removeView(view);
            } else {
                nc.k.f("frameRateCategoryView");
                throw null;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            a1.h0 h0Var = G1;
            synchronized (h0Var) {
                h0Var.j(this);
            }
        }
        z2.u uVar = getSnapshotObserver().f194a;
        ah.e eVar2 = uVar.f14952h;
        if (eVar2 != null) {
            eVar2.f();
        }
        uVar.a();
        e2 e2Var = this.f1978m0;
        if (e2Var.f1840b == null) {
            e2Var.f1839a = null;
        }
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            rVar = viewTreeOwners.f1902a.getLifecycle();
        } else {
            rVar = null;
        }
        if (rVar != null) {
            rVar.c(this.f1997w0);
            rVar.c(this);
            if (e() && (eVar = this.G0) != null) {
                c3.j jVar = c3.j.f2563a;
                jVar.getClass();
                ((AutofillManager) eVar.R).unregisterCallback(a0.e.c(jVar));
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            getViewTreeObserver().removeOnScrollChangedListener(this);
            getViewTreeObserver().removeOnTouchModeChangeListener(this);
            g2 g2Var = this.f1958c0;
            if (g2Var != null) {
                g2Var.f1850c = false;
            }
            this.f1958c0 = null;
            if (i2 >= 31) {
                i0.f1857a.a(this);
            }
            c3.d dVar = this.H0;
            if (dVar != null) {
                getSemanticsOwner().f6779d.j(dVar);
                ((g3.p) getFocusOwner()).f5533g.j(dVar);
            }
            j4.b rectManager = getRectManager();
            a5.k0 k0Var = rectManager.f7423g;
            if (k0Var != null) {
                b3.b.f1752a.removeCallbacks(k0Var);
                rectManager.f7423g = null;
            }
            ((g3.p) getFocusOwner()).f5533g.j(this);
            return;
        }
        throw w.d.g("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i2, Rect rect) {
        super.onFocusChanged(z10, i2, rect);
        if (!z10 && !hasFocus()) {
            g3.p pVar = (g3.p) getFocusOwner();
            g3.d.d(pVar.f5529c, true);
            if (pVar.f() != null) {
                g3.g0 f8 = pVar.f();
                pVar.i(null);
                if (f8 != null) {
                    f8.P0(g3.e0.Active, g3.e0.Inactive);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.W0 = 0L;
        H();
        int i2 = Build.VERSION.SDK_INT;
        if (32 <= i2 && i2 < 34) {
            G(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        this.W0 = 0L;
        this.Q0.j(this.f2000x1);
        this.O0 = null;
        H();
        if (this.N0 != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i11 - i2, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        a4.f1 f1Var = this.Q0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long g10 = g(i2);
            long g11 = g(i10);
            long m = p7.k.m((int) (g10 >>> 32), (int) (g10 & 4294967295L), (int) (g11 >>> 32), (int) (4294967295L & g11));
            x4.a aVar = this.O0;
            if (aVar == null) {
                this.O0 = new x4.a(m);
                this.P0 = false;
            } else if (!x4.a.b(aVar.f14337a, m)) {
                this.P0 = true;
            }
            f1Var.q(m);
            f1Var.l();
            setMeasuredDimension(getRoot().B0.f348p.A, getRoot().B0.f348p.B);
            if (this.N0 != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().B0.f348p.A, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().B0.f348p.B, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (e() && viewStructure != null) {
            c3.d dVar = this.H0;
            if (dVar != null) {
                a4.o0 o0Var = dVar.B.f6776a;
                AutofillId autofillId = dVar.Z;
                String str = dVar.X;
                j4.b bVar = dVar.R;
                aj.g.W(viewStructure, o0Var, autofillId, str, bVar);
                Object[] objArr = a1.s0.f100a;
                a1.h0 h0Var = new a1.h0(2);
                h0Var.a(o0Var);
                h0Var.a(viewStructure);
                while (h0Var.i()) {
                    Object k10 = h0Var.k(h0Var.f45b - 1);
                    k10.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k10;
                    Object k11 = h0Var.k(h0Var.f45b - 1);
                    k11.getClass();
                    a1.f0 f0Var = (a1.f0) ((a4.o0) k11).n();
                    int i10 = ((p2.b) f0Var.B).L;
                    for (int i11 = 0; i11 < i10; i11++) {
                        a4.o0 o0Var2 = (a4.o0) f0Var.get(i11);
                        if (!o0Var2.J0 && o0Var2.H() && o0Var2.I()) {
                            i4.m x9 = o0Var2.x();
                            if (x9 != null) {
                                a1.m0 m0Var = x9.A;
                                if (m0Var.b(i4.l.f6746g) || m0Var.b(i4.l.f6747h) || m0Var.b(i4.t.f6796q) || m0Var.b(i4.t.f6797r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    aj.g.W(newChild, o0Var2, dVar.Z, str, bVar);
                                    h0Var.a(o0Var2);
                                    h0Var.a(newChild);
                                }
                            }
                            h0Var.a(o0Var2);
                            h0Var.a(viewStructure2);
                        }
                    }
                }
            }
            b9.e eVar = this.G0;
            if (eVar != null) {
                c3.l lVar = (c3.l) eVar.L;
                LinkedHashMap linkedHashMap = lVar.f2564a;
                LinkedHashMap linkedHashMap2 = lVar.f2564a;
                if (!linkedHashMap.isEmpty()) {
                    int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() != null) {
                            m9.o.b();
                            return;
                        }
                        ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                        newChild2.setAutofillId((AutofillId) eVar.X, intValue);
                        newChild2.setId(intValue, ((x) eVar.B).getContext().getPackageName(), null, null);
                        newChild2.setAutofillType(1);
                        throw null;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        v3.q qVar;
        int toolType = motionEvent.getToolType(i2);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (qVar = ((t) getPointerIconService()).f1945a) != null)) {
            Context context = getContext();
            if (qVar instanceof v3.a) {
                return PointerIcon.getSystemIcon(context, ((v3.a) qVar).f13629b);
            }
            return PointerIcon.getSystemIcon(context, 1000);
        }
        return super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // androidx.lifecycle.f
    public final void onResume(androidx.lifecycle.x xVar) {
        n2.f fVar;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l0.k());
        }
        g2 g2Var = this.f1958c0;
        if (g2Var != null) {
            f2 f2Var = this.f1956b0;
            f2Var.getClass();
            a0.b bVar = g2Var.f1848a;
            w2.c cVar = (w2.c) bVar.B;
            if (cVar.A && !cVar.L) {
                try {
                    fVar = ((o3) f2Var).A.s(new a4.m0(4, g2Var));
                } catch (CancellationException unused) {
                    w2.c cVar2 = (w2.c) bVar.B;
                    if (!cVar2.B) {
                        if (cVar2.L) {
                            x2.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        cVar2.a();
                        cVar2.L = true;
                    }
                    fVar = null;
                }
                n2.f fVar2 = g2Var.f1851d;
                if (fVar2 != null) {
                    fVar2.cancel();
                }
                g2Var.f1851d = fVar;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        x4.m mVar;
        if (this.B) {
            int[] iArr = g3.h.f5512a;
            if (i2 != 0) {
                if (i2 != 1) {
                    mVar = null;
                } else {
                    mVar = x4.m.Rtl;
                }
            } else {
                mVar = x4.m.Ltr;
            }
            if (mVar == null) {
                mVar = x4.m.Ltr;
            }
            setLayoutDirection(mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [h4.g, nc.a] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        d2.t tVar;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (tVar = this.A1) != null) {
            i4.r semanticsOwner = getSemanticsOwner();
            cc.g coroutineContext = getCoroutineContext();
            p2.b bVar = new p2.b(new h4.h[16]);
            aj.g.x0(semanticsOwner.a(), 0, new nc.a(1, 8, p2.b.class, bVar, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(bVar.A, 0, bVar.L, new bc.a(0, new mc.l[]{h4.b.R, h4.b.X}));
            int i2 = bVar.L;
            if (i2 == 0) {
                obj = null;
            } else {
                obj = bVar.A[i2 - 1];
            }
            h4.h hVar = (h4.h) obj;
            if (hVar != null) {
                x4.k kVar = hVar.f6079c;
                h4.c cVar = new h4.c(hVar.f6077a, kVar, zc.x.a(coroutineContext), tVar, this);
                a4.r1 r1Var = hVar.f6080d;
                h3.c k10 = y3.c0.i(r1Var).k(r1Var, true);
                long b10 = kVar.b();
                ScrollCaptureTarget k11 = a6.c.k(this, i3.z.w(p7.o.o(k10)), new Point((int) (b10 >> 32), (int) (b10 & 4294967295L)), cVar);
                k11.setScrollBounds(i3.z.w(kVar));
                consumer.accept(k11);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        H();
    }

    @Override // androidx.lifecycle.f
    public final void onStop(androidx.lifecycle.x xVar) {
        g2 g2Var = this.f1958c0;
        if (g2Var != null) {
            w2.c cVar = (w2.c) g2Var.f1848a.B;
            if (cVar.A && !cVar.L) {
                n2.f fVar = g2Var.f1851d;
                if (fVar != null) {
                    fVar.cancel();
                }
                g2Var.f1851d = null;
            } else if (!cVar.B) {
                if (!cVar.L) {
                    x2.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!cVar.R.i()) {
                    x2.a.a("Attempted to start retaining exited values with pending exited values");
                }
                cVar.L = false;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z10) {
        int i2;
        if (z10) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f1975k1.f12616a.setValue(new r3.a(i2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        d3.e eVar = this.f1997w0;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (nc.k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            d0.d.Q(eVar, longSparseArray);
        } else {
            eVar.A.post(new ad.c(7, eVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean k10;
        this.f1978m0.f1841c.setValue(Boolean.valueOf(z10));
        this.f2004z1 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (k10 = l0.k())) {
            setShowLayoutBounds(k10);
            k(getRoot());
        }
    }

    public final void p(float[] fArr) {
        y();
        i3.e0.e(fArr, this.U0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.Y0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.Y0 & 4294967295L));
        float[] fArr2 = this.T0;
        i3.e0.d(fArr2);
        i3.e0.f(fArr2, intBitsToFloat, intBitsToFloat2);
        l0.p(fArr, fArr2);
    }

    public final long q(long j2) {
        y();
        long b10 = i3.e0.b(j2, this.U0);
        float intBitsToFloat = Float.intBitsToFloat((int) (b10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.Y0 & 4294967295L)) + Float.intBitsToFloat((int) (b10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.Y0 >> 32)) + intBitsToFloat) << 32);
    }

    public final void r(boolean z10) {
        s sVar;
        a4.f1 f1Var = this.Q0;
        if (!f1Var.f203b.y() && ((p2.b) f1Var.f206e.B).L == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                sVar = this.f2000x1;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            sVar = null;
        }
        if (f1Var.j(sVar)) {
            requestLayout();
        }
        f1Var.a(false);
        Trace.endSection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        int i10;
        h3.c cVar;
        if (!isFocused()) {
            g3.f b10 = g3.h.b(i2);
            if (b10 != null) {
                i10 = b10.f5505a;
            } else {
                i10 = 7;
            }
            g3.l focusOwner = getFocusOwner();
            if (rect != null) {
                cVar = i3.z.A(rect);
            } else {
                cVar = null;
            }
            Boolean e6 = ((g3.p) focusOwner).e(i10, cVar, new u(i10, 0));
            Boolean bool = Boolean.TRUE;
            if (!nc.k.a(e6, bool)) {
                if (!nc.k.a(((g3.p) getFocusOwner()).e(i10, null, new u(i10, 1)), bool)) {
                    if (hasFocus()) {
                        if (i10 == 1 || i10 == 2) {
                            return ((g3.p) getFocusOwner()).h(i10);
                        }
                        return false;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(a4.o0 o0Var, long j2) {
        a4.f1 f1Var = this.Q0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            f1Var.k(o0Var, j2);
            if (!f1Var.f203b.y()) {
                f1Var.a(false);
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.f1995v0.f1808b0 = j2;
    }

    public final void setConfiguration(Configuration configuration) {
        this.F0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(d3.e eVar) {
        this.f1997w0 = eVar;
    }

    public void setCoroutineContext(cc.g gVar) {
        this.f1974k0 = gVar;
        b3.o oVar = getRoot().A0.f268f;
        if (oVar instanceof v3.h0) {
            ((v3.h0) oVar).Q0();
        }
        if (!oVar.A.f1777h0) {
            x3.a.c("visitSubtreeIf called on an unattached node");
        }
        p2.b bVar = new p2.b(new b3.o[16]);
        b3.o oVar2 = oVar.A;
        b3.o oVar3 = oVar2.Y;
        if (oVar3 == null) {
            a4.l.b(bVar, oVar2);
        } else {
            bVar.b(oVar3);
        }
        while (true) {
            int i2 = bVar.L;
            if (i2 != 0) {
                b3.o oVar4 = (b3.o) bVar.k(i2 - 1);
                if ((oVar4.R & 16) != 0) {
                    for (b3.o oVar5 = oVar4; oVar5 != null && oVar5.f1777h0; oVar5 = oVar5.Y) {
                        if ((oVar5.L & 16) != 0) {
                            b3.o oVar6 = oVar5;
                            p2.b bVar2 = null;
                            while (oVar6 != null) {
                                if (oVar6 instanceof a4.h2) {
                                    a4.h2 h2Var = (a4.h2) oVar6;
                                    if (h2Var instanceof v3.h0) {
                                        ((v3.h0) h2Var).Q0();
                                    }
                                } else if ((oVar6.L & 16) != 0 && (oVar6 instanceof a4.k)) {
                                    int i10 = 0;
                                    for (b3.o oVar7 = ((a4.k) oVar6).f247j0; oVar7 != null; oVar7 = oVar7.Y) {
                                        if ((oVar7.L & 16) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar6 = oVar7;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar6 != null) {
                                                    bVar2.b(oVar6);
                                                    oVar6 = null;
                                                }
                                                bVar2.b(oVar7);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar6 = a4.l.e(bVar2);
                            }
                        }
                    }
                }
                a4.l.b(bVar, oVar4);
            } else {
                return;
            }
        }
    }

    public final void setFrameEndScheduler$ui(f2 f2Var) {
        this.f1956b0 = f2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j2) {
        this.W0 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(mc.l lVar) {
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.k(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f1957b1 = lVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui */
    public final void m6setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(s3.a aVar) {
        this.L = aVar;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.M0 = z10;
    }

    public void setUncaughtExceptionHandler(a4.i2 i2Var) {
        this.Q0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ae, code lost:
        r4.l(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r10 = this;
            boolean r0 = r10.I0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L48
            a4.e2 r0 = r10.getSnapshotObserver()
            z2.u r0 = r0.f194a
            java.lang.Object r3 = r0.f14951g
            monitor-enter(r3)
            p2.b r0 = r0.f14950f     // Catch: java.lang.Throwable -> L36
            int r4 = r0.L     // Catch: java.lang.Throwable -> L36
            r5 = r2
            r6 = r5
        L15:
            java.lang.Object[] r7 = r0.A
            if (r5 >= r4) goto L3b
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L36
            z2.t r7 = (z2.t) r7     // Catch: java.lang.Throwable -> L36
            r7.d()     // Catch: java.lang.Throwable -> L36
            a1.m0 r7 = r7.f14938f     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.j()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L2b
            int r6 = r6 + 1
            goto L38
        L2b:
            if (r6 <= 0) goto L38
            java.lang.Object[] r7 = r0.A     // Catch: java.lang.Throwable -> L36
            int r8 = r5 - r6
            r9 = r7[r5]     // Catch: java.lang.Throwable -> L36
            r7[r8] = r9     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r0 = move-exception
            goto L46
        L38:
            int r5 = r5 + 1
            goto L15
        L3b:
            int r5 = r4 - r6
            java.util.Arrays.fill(r7, r5, r4, r1)     // Catch: java.lang.Throwable -> L36
            r0.L = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            r10.I0 = r2
            goto L48
        L46:
            monitor-exit(r3)
            throw r0
        L48:
            b4.d1 r0 = r10.N0
            if (r0 == 0) goto L4f
            f(r0)
        L4f:
            boolean r0 = e()
            if (r0 == 0) goto L75
            c3.d r0 = r10.H0
            if (r0 == 0) goto L75
            a1.y r3 = r0.f2558b0
            int r4 = r3.f117d
            if (r4 != 0) goto L6e
            boolean r4 = r0.f2559c0
            if (r4 == 0) goto L6e
            a0.b r4 = r0.A
            java.lang.Object r4 = r4.B
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            c3.p.v(r4)
            r0.f2559c0 = r2
        L6e:
            int r3 = r3.f117d
            if (r3 == 0) goto L75
            r3 = 1
            r0.f2559c0 = r3
        L75:
            a1.h0 r0 = r10.f1986q1
            boolean r0 = r0.i()
            if (r0 == 0) goto Lb2
            a1.h0 r0 = r10.f1986q1
            java.lang.Object r0 = r0.f(r2)
            if (r0 == 0) goto Lb2
            a1.h0 r0 = r10.f1986q1
            int r0 = r0.f45b
            r3 = r2
        L8a:
            a1.h0 r4 = r10.f1986q1
            if (r3 >= r0) goto Lae
            java.lang.Object r4 = r4.f(r3)
            mc.a r4 = (mc.a) r4
            a1.h0 r5 = r10.f1986q1
            if (r3 < 0) goto Laa
            int r6 = r5.f45b
            if (r3 >= r6) goto Laa
            java.lang.Object[] r5 = r5.f44a
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La7
            r4.b()
        La7:
            int r3 = r3 + 1
            goto L8a
        Laa:
            r5.n(r3)
            throw r1
        Lae:
            r4.l(r2, r0)
            goto L75
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.x.t():void");
    }

    public final void u(a4.o0 o0Var) {
        d0 d0Var = this.f1995v0;
        d0Var.f1824s0 = true;
        if (d0Var.v()) {
            d0Var.w(o0Var);
        }
        d3.e eVar = this.f1997w0;
        eVar.Z = true;
        if (eVar.e()) {
            eVar.f3797b0.a(yb.y.f14813a);
        }
    }

    public final void v(a4.o0 o0Var, boolean z10, boolean z11, boolean z12) {
        a4.o0 u4;
        a4.o0 u10;
        a4.f1 f1Var = this.Q0;
        if (z10) {
            a4.n nVar = f1Var.f203b;
            a4.o0 o0Var2 = o0Var.f280d0;
            a4.t0 t0Var = o0Var.B0;
            if (o0Var2 == null) {
                x3.a.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int i2 = a4.e1.f193a[t0Var.f337d.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    if (i2 == 5) {
                        if (!t0Var.f338e || z11) {
                            t0Var.f338e = true;
                            t0Var.f348p.f234o0 = true;
                            if (!o0Var.J0) {
                                if ((!nc.k.a(o0Var.J(), Boolean.TRUE) && !a4.f1.h(o0Var)) || ((u4 = o0Var.u()) != null && u4.B0.f338e)) {
                                    if ((o0Var.I() || a4.f1.i(o0Var)) && ((u10 = o0Var.u()) == null || !u10.q())) {
                                        nVar.j(o0Var, a4.x.Measurement);
                                    }
                                } else {
                                    nVar.j(o0Var, a4.x.LookaheadMeasurement);
                                }
                                if (!f1Var.f205d && z12) {
                                    B(o0Var);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    m9.o.o();
                    return;
                }
                f1Var.f209h.b(new a4.d1(o0Var, true, z11));
            }
        } else if (f1Var.p(o0Var, z11) && z12) {
            B(o0Var);
        }
    }

    public final void w(a4.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        a4.t0 t0Var = o0Var.B0;
        a4.f1 f1Var = this.Q0;
        if (z10) {
            a4.n nVar = f1Var.f203b;
            int i2 = a4.e1.f193a[t0Var.f337d.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            m9.o.o();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((!t0Var.f338e && !t0Var.f339f) || z11) {
                    t0Var.f339f = true;
                    t0Var.f340g = true;
                    a4.i1 i1Var = t0Var.f348p;
                    i1Var.p0 = true;
                    i1Var.f235q0 = true;
                    if (!o0Var.J0) {
                        a4.o0 u4 = o0Var.u();
                        if (nc.k.a(o0Var.J(), Boolean.TRUE) && ((u4 == null || !u4.B0.f338e) && (u4 == null || !u4.B0.f339f))) {
                            nVar.j(o0Var, a4.x.LookaheadPlacement);
                        } else if (o0Var.I() && ((u4 == null || !u4.p()) && (u4 == null || !u4.q()))) {
                            nVar.j(o0Var, a4.x.Placement);
                        }
                        if (!f1Var.f205d) {
                            B(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        f1Var.getClass();
        int i10 = a4.e1.f193a[t0Var.f337d.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                a4.o0 u10 = o0Var.u();
                if (u10 != null && !u10.I()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z11) {
                    if (!o0Var.q()) {
                        if (o0Var.p() && o0Var.I() == z12 && o0Var.I() == t0Var.f348p.f233n0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                a4.i1 i1Var2 = t0Var.f348p;
                i1Var2.p0 = true;
                i1Var2.f235q0 = true;
                if (!o0Var.J0 && i1Var2.f233n0 && z12) {
                    if ((u10 == null || !u10.p()) && (u10 == null || !u10.q())) {
                        f1Var.f203b.j(o0Var, a4.x.Placement);
                    }
                    if (!f1Var.f205d) {
                        B(null);
                        return;
                    }
                    return;
                }
                return;
            }
            m9.o.o();
        }
    }

    public final void x() {
        d0 d0Var = this.f1995v0;
        d0Var.f1824s0 = true;
        if (d0Var.v() && !d0Var.D0) {
            d0Var.D0 = true;
            d0Var.f1810d0.post(d0Var.F0);
        }
        d3.e eVar = this.f1997w0;
        eVar.Z = true;
        if (eVar.e() && !eVar.f3803h0) {
            eVar.f3803h0 = true;
            eVar.f3798c0.post(eVar.f3804i0);
        }
    }

    public final void y() {
        if (!this.X0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.W0) {
                this.W0 = currentAnimationTimeMillis;
                i1 i1Var = this.f2002y1;
                float[] fArr = this.U0;
                i1Var.a(this, fArr);
                l0.m(fArr, this.V0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.S0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.Y0 = (Float.floatToRawIntBits(iArr[0] - iArr[0]) << 32) | (Float.floatToRawIntBits(iArr[1] - iArr[1]) & 4294967295L);
            }
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.W0 = AnimationUtils.currentAnimationTimeMillis();
        i1 i1Var = this.f2002y1;
        float[] fArr = this.U0;
        i1Var.a(this, fArr);
        l0.m(fArr, this.V0);
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long b10 = i3.e0.b((Float.floatToRawIntBits(x9) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L), fArr);
        this.Y0 = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (b10 >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (b10 & 4294967295L))) & 4294967295L);
    }

    public h getAccessibilityManager() {
        return this.f1999x0;
    }

    /* renamed from: getClipboard */
    public i m8getClipboard() {
        return this.K0;
    }

    /* renamed from: getClipboardManager */
    public j m9getClipboardManager() {
        return this.J0;
    }

    /* renamed from: getDragAndDropManager */
    public e3.b m10getDragAndDropManager() {
        return this.f1976l0;
    }

    public a1.x getLayoutNodes() {
        return this.f1987r0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i10) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i10;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @yb.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations */
    public static /* synthetic */ void m4getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @yb.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(a4.i2 i2Var) {
    }
}
