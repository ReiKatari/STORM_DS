package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
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
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te  reason: default package */
/* loaded from: classes.dex */
public final class te extends ViewGroup implements zp4, p16, qe1, no4, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, yg2 {
    public static Class I1;
    public static Method J1;
    public static Method K1;
    public static final ca4 L1 = new ca4();
    public static ge M1;
    public static Method N1;
    public final vs4 A;
    public final id A0;
    public final k60 A1;
    public long B;
    public final xh B0;
    public final ke B1;
    public final mz C0;
    public final ab0 C1;
    public final ca4 D0;
    public boolean D1;
    public ca4 E0;
    public boolean E1;
    public boolean F0;
    public final s35 F1;
    public final q74 G0;
    public View G1;
    public final ka0 H0;
    public final pe H1;
    public final vs4 I0;
    public final ii1 J0;
    public final eb K0;
    public final boolean L;
    public final nd L0;
    public boolean M0;
    public final de N0;
    public final ce O0;
    public final bq4 P0;
    public boolean Q0;
    public r43 R;
    public zm R0;
    public q21 S0;
    public boolean T0;
    public final a34 U0;
    public long V0;
    public final int[] W0;
    public final float[] X0;
    public final float[] Y0;
    public final float[] Z0;
    public long a1;
    public boolean b1;
    public long c1;
    public final um3 d0;
    public final vs4 d1;
    public lu3 e0;
    public final ii1 e1;
    public mu3 f0;
    public qn2 f1;
    public mm5 g0;
    public r37 g1;
    public final pu h0;
    public o37 h1;
    public final ee i0;
    public final AtomicReference i1;
    public final vs4 j0;
    public bh1 j1;
    public final View k0;
    public final ji2 k1;
    public final eh2 l0;
    public final qa4 l1;
    public l61 m0;
    public final vs4 m1;
    public final og n0;
    public final tv2 n1;
    public final zr3 o0;
    public final y63 o1;
    public final vs4 p0;
    public final b74 p1;
    public final ii1 q0;
    public final lm q1;
    public final ak0 r0;
    public MotionEvent r1;
    public final xm s0;
    public long s1;
    public final j83 t0;
    public final rr6 t1;
    public final sm3 u0;
    public final ca4 u1;
    public final p94 v0;
    public float v1;
    public final rf5 w0;
    public float w1;
    public final ab6 x0;
    public final g15 x1;
    public final ze y0;
    public final ee y1;
    public qf z0;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, ka0] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, b74] */
    /* JADX WARN: Type inference failed for: r1v39, types: [lm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [z64, bu1] */
    public te(Context context, mx0 mx0Var) {
        super(context);
        eb ebVar;
        nd ndVar;
        kk3 kk3Var;
        int i;
        ab0 cb0Var;
        te teVar = this;
        teVar.A = np2.Y(mx0Var);
        teVar.B = 9205357640488583168L;
        teVar.L = true;
        teVar.d0 = mx0Var.r;
        teVar.g0 = cs1.d0;
        teVar.h0 = new pu();
        teVar.i0 = new ee(teVar, 0);
        teVar.j0 = new vs4(ak7.s(context), vs0.s0);
        teVar.l0 = new eh2(teVar, teVar);
        teVar.m0 = mx0Var.b.j();
        teVar.n0 = new og();
        teVar.o0 = new zr3();
        teVar.p0 = np2.Y(Boolean.FALSE);
        teVar.q0 = np2.I(new ke(teVar, 0));
        teVar.r0 = mx0Var.t;
        teVar.s0 = mx0Var.q;
        teVar.t0 = new j83();
        sm3 sm3Var = new sm3(3);
        sm3Var.c0(q16.c);
        sm3Var.Z(teVar.getDensity());
        sm3Var.e0(teVar.getViewConfiguration());
        sm3Var.d0(new re(teVar).d(((eh2) teVar.getFocusOwner()).e).d(teVar.m16getDragAndDropManager().c));
        teVar.u0 = sm3Var;
        p94 p94Var = h93.a;
        teVar.v0 = new p94();
        teVar.getLayoutNodes();
        teVar.w0 = new rf5(teVar);
        teVar.x0 = new ab6(teVar.getRoot(), new z64(), teVar.getLayoutNodes());
        ze zeVar = new ze(teVar);
        teVar.y0 = zeVar;
        teVar.z0 = new qf(teVar, new i4(0, teVar, hf.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 1));
        teVar.A0 = mx0Var.j;
        teVar.B0 = new xh(teVar);
        teVar.C0 = new mz();
        teVar.D0 = new ca4();
        teVar.G0 = new q74();
        sm3 root = teVar.getRoot();
        ?? obj = new Object();
        obj.b = root;
        obj.c = new wx2((y53) root.B0.d);
        obj.d = new s63(28, (byte) 0);
        obj.e = new zx2();
        teVar.H0 = obj;
        teVar.I0 = np2.Y(new Configuration(context.getResources().getConfiguration()));
        teVar.J0 = np2.I(new ke(teVar, 1));
        if (d()) {
            ebVar = new eb(teVar, teVar.getAutofillTree());
        } else {
            ebVar = null;
        }
        teVar.K0 = ebVar;
        if (d()) {
            AutofillManager i2 = k2.i(context.getSystemService(k2.l()));
            if (i2 != null) {
                teVar = this;
                ndVar = new nd(new s63(i2, 26), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                throw i61.e("Autofill service could not be located.");
            }
        } else {
            ndVar = null;
        }
        teVar.L0 = ndVar;
        teVar.N0 = mx0Var.l;
        teVar.O0 = mx0Var.m;
        teVar.P0 = new bq4(new oe(teVar, 1));
        teVar.U0 = new a34(teVar.getRoot());
        teVar.V0 = 9223372034707292159L;
        teVar.W0 = new int[]{0, 0};
        float[] a = v24.a();
        teVar.X0 = a;
        teVar.Y0 = v24.a();
        teVar.Z0 = v24.a();
        teVar.a1 = -1L;
        teVar.c1 = 9187343241974906880L;
        teVar.d1 = np2.Y(null);
        teVar.e1 = np2.I(new ke(teVar, 3));
        teVar.i1 = new AtomicReference(null);
        teVar.k1 = mx0Var.n;
        teVar.l1 = mx0Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = wg2.a;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                kk3Var = null;
            } else {
                kk3Var = kk3.Rtl;
            }
        } else {
            kk3Var = kk3.Ltr;
        }
        teVar.m1 = np2.Y(kk3Var == null ? kk3.Ltr : kk3Var);
        teVar.n1 = mx0Var.p;
        if (teVar.isInTouchMode()) {
            i = 1;
        } else {
            i = 2;
        }
        teVar.o1 = new y63(i);
        ?? obj2 = new Object();
        new ua4(new z10[16]);
        new ua4(new j41[16]);
        new ua4(new sm3[16]);
        new ua4(new j41[16]);
        teVar.p1 = obj2;
        ?? obj3 = new Object();
        new w31(new pj(obj3, 1));
        w47 w47Var = w47.Shown;
        teVar.q1 = obj3;
        teVar.t1 = new rr6(13);
        teVar.u1 = new ca4();
        teVar.x1 = new g15(teVar, 1);
        teVar.y1 = new ee(teVar, 1);
        teVar.A1 = new k60(context, new oe(teVar, 0));
        teVar.B1 = new ke(teVar, 2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29) {
            cb0Var = new bb0(a);
        } else {
            cb0Var = new cb0();
        }
        teVar.C1 = cb0Var;
        teVar.addOnAttachStateChangeListener(teVar.z0);
        teVar.setWillNotDraw(false);
        teVar.setFocusable(true);
        if (i3 >= 26) {
            gf.a.a(teVar, 1, false);
        }
        teVar.setFocusableInTouchMode(true);
        teVar.setClipChildren(false);
        ao7.n(teVar, zeVar);
        teVar.setOnDragListener(teVar.m16getDragAndDropManager());
        teVar.getRoot().d(teVar);
        if (i3 >= 29) {
            cf.a.a(teVar);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            teVar.k0 = view;
            teVar.addView(view, -1);
        }
        teVar.F1 = i3 >= 31 ? new s35(7) : null;
        teVar.H1 = new pe(teVar);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof te) {
                ((te) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public static long f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                e41.m();
                return 0L;
            }
            return 2147483647L;
        }
        return size;
    }

    public static View g(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (nb3.k(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View g = g(viewGroup.getChildAt(i2), i);
                    if (g != null) {
                        return g;
                    }
                }
            }
        }
        return null;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    private final r37 getLegacyTextInputServiceAndroid() {
        r37 r37Var = this.g1;
        if (r37Var == null) {
            r37 r37Var2 = new r37(getView(), this);
            this.g1 = r37Var2;
            return r37Var2;
        }
        return r37Var;
    }

    private final mx0 get_composeViewContext() {
        return (mx0) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final je get_viewTreeOwners() {
        xg6.A(this.d1.getValue());
        return null;
    }

    public static void k(sm3 sm3Var) {
        sm3Var.D();
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            k((sm3) objArr[i2]);
        }
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        return false;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) < 2139095040 && (Build.VERSION.SDK_INT < 29 || s74.a.a(motionEvent, i))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.p0.setValue(Boolean.valueOf(z));
    }

    private void setDensity(qh1 qh1Var) {
        this.j0.setValue(qh1Var);
    }

    private void setFontFamilyResolver(ki2 ki2Var) {
        this.l1.setValue(ki2Var);
    }

    private void setLayoutDirection(kk3 kk3Var) {
        this.m1.setValue(kk3Var);
    }

    private final void set_composeViewContext(mx0 mx0Var) {
        this.A.setValue(mx0Var);
    }

    private final void set_viewTreeOwners(je jeVar) {
        this.d1.setValue(jeVar);
    }

    public final void A(MotionEvent motionEvent) {
        this.a1 = AnimationUtils.currentAnimationTimeMillis();
        ab0 ab0Var = this.C1;
        float[] fArr = this.Y0;
        ab0Var.a(this, fArr);
        jx2.w(fArr, this.Z0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = v24.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        this.c1 = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(sm3 sm3Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (sm3Var != null) {
                while (sm3Var != null && sm3Var.s() == qm3.InMeasureBlock) {
                    if (!this.T0) {
                        sm3 v = sm3Var.v();
                        if (v == null) {
                            break;
                        }
                        long j = ((y53) v.B0.d).R;
                        if (q21.f(j) && q21.e(j)) {
                            break;
                        }
                    }
                    sm3Var = sm3Var.v();
                }
                if (sm3Var == getRoot()) {
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

    public final long D(long j) {
        z();
        return v24.b((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.c1 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.c1 >> 32))) << 32), this.Z0);
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        if (this.D1) {
            this.D1 = false;
            zr3 zr3Var = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            zr3Var.getClass();
            pt7.a.setValue(new az4(metaState));
        }
        q74 q74Var = this.G0;
        ap3 c = q74Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ka0 ka0Var = this.H0;
        if (c != null) {
            List list = (List) c.B;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (((xy4) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            obj = null;
            xy4 xy4Var = (xy4) obj;
            if (xy4Var != null) {
                this.B = xy4Var.d;
            }
            int b = ka0Var.b(c, this, o(motionEvent));
            c.L = null;
            if ((actionMasked != 0 && actionMasked != 5) || (b & 1) != 0) {
                return b;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            q74Var.c.delete(pointerId);
            q74Var.b.delete(pointerId);
            return b;
        }
        if (!ka0Var.a) {
            ((hz3) ((s63) ka0Var.d).B).a();
            ((wx2) ka0Var.c).c();
        }
        return 0;
    }

    public final void F(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i8 >= i4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f = pointerCoords.x;
            float f2 = pointerCoords.y;
            long r = r((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (r >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (r & 4294967295L));
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        ap3 c = this.G0.c(obtain, this);
        c.getClass();
        this.H0.b(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x61 G(eo2 eo2Var, s41 s41Var) {
        se seVar;
        int i;
        if (s41Var instanceof se) {
            seVar = (se) s41Var;
            int i2 = seVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                seVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = seVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = seVar.Y;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    oe oeVar = new oe(this, 2);
                    seVar.Y = 1;
                    if (g04.C(new kp5(oeVar, this.i1, eo2Var, null, 5), seVar) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        seVar = new se(this, s41Var);
        Object obj2 = seVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = seVar.Y;
        if (i == 0) {
        }
        e41.c();
        return null;
    }

    public final void H(Configuration configuration) {
        vs4 vs4Var;
        Configuration configuration2 = getConfiguration();
        if (!nb3.k(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(ak7.s(getContext()));
            }
            if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (vs4Var = this.o0.b) != null) {
                vs4Var.setValue(n16.p(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int i2;
        int i3;
        int[] iArr = this.W0;
        getLocationOnScreen(iArr);
        long j = this.V0;
        int i4 = (int) (j >> 32);
        int i5 = (int) (j & 4294967295L);
        boolean z2 = false;
        int i6 = iArr[0];
        if (i4 != i6 || i5 != iArr[1] || this.a1 < 0) {
            this.V0 = (4294967295L & iArr[1]) | (i6 << 32);
            if (i4 != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
                ua4 z3 = getRoot().z();
                Object[] objArr = z3.A;
                int i7 = z3.L;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((sm3) objArr[i8]).C0.p.F0();
                }
                z = true;
                z();
                view = this.G1;
                if (view == null) {
                    view = getRootView();
                    this.G1 = view;
                }
                rf5 rectManager = getRectManager();
                long j2 = this.V0;
                long a0 = kn2.a0(this.c1);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.Y0;
                if (fArr.length >= 16) {
                    i3 = 0;
                } else {
                    if (fArr[0] == 1.0f && fArr[1] == RecyclerView.B1 && fArr[2] == RecyclerView.B1 && fArr[4] == RecyclerView.B1 && fArr[5] == 1.0f && fArr[6] == RecyclerView.B1 && fArr[8] == RecyclerView.B1 && fArr[9] == RecyclerView.B1 && fArr[10] == 1.0f) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (fArr[12] == RecyclerView.B1 && fArr[13] == RecyclerView.B1 && fArr[14] == RecyclerView.B1 && fArr[15] == 1.0f) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    i3 = (i << 1) | i2;
                }
                v57 v57Var = rectManager.c;
                if ((i3 & 2) != 0) {
                    fArr = null;
                }
                rectManager.f = (!v57Var.b(j2, a0, fArr, width, height) || rectManager.f) ? true : true;
                this.U0.b(z);
                getRectManager().a();
            }
        }
        z = false;
        z();
        view = this.G1;
        if (view == null) {
        }
        rf5 rectManager2 = getRectManager();
        long j22 = this.V0;
        long a02 = kn2.a0(this.c1);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.Y0;
        if (fArr.length >= 16) {
        }
        v57 v57Var2 = rectManager2.c;
        if ((i3 & 2) != 0) {
        }
        if (v57Var2.b(j22, a02, fArr, width2, height2)) {
        }
        rectManager2.f = (!v57Var2.b(j22, a02, fArr, width2, height2) || rectManager2.f) ? true : true;
        this.U0.b(z);
        getRectManager().a();
    }

    public final void J(float f) {
        if (m()) {
            if (f > RecyclerView.B1) {
                if (Float.isNaN(this.v1) || f > this.v1) {
                    this.v1 = f;
                }
            } else if (f < RecyclerView.B1) {
                if (Float.isNaN(this.w1) || f < this.w1) {
                    this.w1 = f;
                }
            }
        }
    }

    @Override // defpackage.yg2
    public final void a(vh2 vh2Var, vh2 vh2Var2) {
        boolean z;
        if0 if0Var;
        boolean z2;
        if0 if0Var2;
        boolean z3;
        if (vh2Var != null) {
            vh2 vh2Var3 = vh2Var;
            if (!vh2Var3.A.j0) {
                p53.c("visitAncestors called on an unattached node");
            }
            z64 z64Var = vh2Var3.A;
            sm3 f0 = nc1.f0(vh2Var);
            ka4 ka4Var = null;
            ArrayList arrayList = null;
            while (f0 != null) {
                if ((((z64) f0.B0.g).R & 2097152) != 0) {
                    while (z64Var != null) {
                        if ((z64Var.L & 2097152) != 0) {
                            z64 z64Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (z64Var2 != null) {
                                if (z64Var2 instanceof a53) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(z64Var2);
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3 && (z64Var2.L & 2097152) != 0 && (z64Var2 instanceof zg1)) {
                                    int i = 0;
                                    for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                        if ((z64Var3.L & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                z64Var2 = z64Var3;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var2 != null) {
                                                    ua4Var.b(z64Var2);
                                                    z64Var2 = null;
                                                }
                                                ua4Var.b(z64Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                z64Var2 = nc1.A(ua4Var);
                            }
                        }
                        z64Var = z64Var.X;
                    }
                }
                f0 = f0.v();
                if (f0 != null && (if0Var2 = f0.B0) != null) {
                    z64Var = (vy6) if0Var2.f;
                } else {
                    z64Var = null;
                }
            }
            if (arrayList != null) {
                if (vh2Var2 != null) {
                    if (!vh2Var2.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var4 = vh2Var2.A;
                    sm3 f02 = nc1.f0(vh2Var2);
                    ka4 ka4Var2 = null;
                    while (f02 != null) {
                        if ((((z64) f02.B0.g).R & 2097152) != 0) {
                            while (z64Var4 != null) {
                                if ((z64Var4.L & 2097152) != 0) {
                                    z64 z64Var5 = z64Var4;
                                    ua4 ua4Var2 = null;
                                    while (z64Var5 != null) {
                                        if (z64Var5 instanceof a53) {
                                            if (ka4Var2 == null) {
                                                ka4 ka4Var3 = c66.a;
                                                ka4Var2 = new ka4();
                                            }
                                            ka4Var2.a(z64Var5);
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2 && (z64Var5.L & 2097152) != 0 && (z64Var5 instanceof zg1)) {
                                            int i2 = 0;
                                            for (z64 z64Var6 = ((zg1) z64Var5).l0; z64Var6 != null; z64Var6 = z64Var6.Y) {
                                                if ((z64Var6.L & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        z64Var5 = z64Var6;
                                                    } else {
                                                        if (ua4Var2 == null) {
                                                            ua4Var2 = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var5 != null) {
                                                            ua4Var2.b(z64Var5);
                                                            z64Var5 = null;
                                                        }
                                                        ua4Var2.b(z64Var6);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        z64Var5 = nc1.A(ua4Var2);
                                    }
                                }
                                z64Var4 = z64Var4.X;
                            }
                        }
                        f02 = f02.v();
                        if (f02 != null && (if0Var = f02.B0) != null) {
                            z64Var4 = (vy6) if0Var.f;
                        } else {
                            z64Var4 = null;
                        }
                    }
                    ka4Var = ka4Var2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a53 a53Var = (a53) arrayList.get(i3);
                    if (ka4Var != null) {
                        z = ka4Var.c(a53Var);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        a53Var.f0();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        vh2 vh2Var = ((eh2) getFocusOwner()).c;
        if (vh2Var.j0) {
            if (!vh2Var.A.j0) {
                p53.c("visitSubtreeIf called on an unattached node");
            }
            ua4 ua4Var = new ua4(new z64[16]);
            z64 z64Var = vh2Var.A;
            z64 z64Var2 = z64Var.Y;
            if (z64Var2 == null) {
                nc1.z(ua4Var, z64Var);
            } else {
                ua4Var.b(z64Var2);
            }
            while (true) {
                int i3 = ua4Var.L;
                if (i3 != 0) {
                    z64 z64Var3 = (z64) ua4Var.l(i3 - 1);
                    if ((z64Var3.R & 1024) != 0) {
                        for (z64 z64Var4 = z64Var3; z64Var4 != null && z64Var4.j0; z64Var4 = z64Var4.Y) {
                            if ((z64Var4.L & 1024) != 0) {
                                z64 z64Var5 = z64Var4;
                                ua4 ua4Var2 = null;
                                while (z64Var5 != null) {
                                    int i4 = 0;
                                    if (z64Var5 instanceof vh2) {
                                        vh2 vh2Var2 = (vh2) z64Var5;
                                        if (vh2Var2.j0 && vh2Var2.T0().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            vh2 vh2Var3 = ((eh2) getFocusOwner()).c;
                                            if (vh2Var3.j0) {
                                                if (!vh2Var3.A.j0) {
                                                    p53.c("visitSubtreeIf called on an unattached node");
                                                }
                                                ua4 ua4Var3 = new ua4(new z64[16]);
                                                z64 z64Var6 = vh2Var3.A;
                                                z64 z64Var7 = z64Var6.Y;
                                                if (z64Var7 == null) {
                                                    nc1.z(ua4Var3, z64Var6);
                                                } else {
                                                    ua4Var3.b(z64Var7);
                                                }
                                                while (true) {
                                                    int i5 = ua4Var3.L;
                                                    if (i5 == 0) {
                                                        break;
                                                    }
                                                    z64 z64Var8 = (z64) ua4Var3.l(i5 - 1);
                                                    if ((z64Var8.R & 1024) != 0) {
                                                        for (z64 z64Var9 = z64Var8; z64Var9 != null && z64Var9.j0; z64Var9 = z64Var9.Y) {
                                                            if ((z64Var9.L & 1024) != 0) {
                                                                z64 z64Var10 = z64Var9;
                                                                ua4 ua4Var4 = null;
                                                                while (z64Var10 != null) {
                                                                    if (z64Var10 instanceof vh2) {
                                                                        vh2 vh2Var4 = (vh2) z64Var10;
                                                                        if (vh2Var4.j0) {
                                                                            ih2 T0 = vh2Var4.T0();
                                                                            if (vh2Var4.j0 && T0.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((z64Var10.L & 1024) != 0 && (z64Var10 instanceof zg1)) {
                                                                        int i6 = 0;
                                                                        for (z64 z64Var11 = ((zg1) z64Var10).l0; z64Var11 != null; z64Var11 = z64Var11.Y) {
                                                                            if ((z64Var11.L & 1024) != 0) {
                                                                                i6++;
                                                                                if (i6 == 1) {
                                                                                    z64Var10 = z64Var11;
                                                                                } else {
                                                                                    if (ua4Var4 == null) {
                                                                                        ua4Var4 = new ua4(new z64[16]);
                                                                                    }
                                                                                    if (z64Var10 != null) {
                                                                                        ua4Var4.b(z64Var10);
                                                                                        z64Var10 = null;
                                                                                    }
                                                                                    ua4Var4.b(z64Var11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i6 == 1) {
                                                                        }
                                                                    }
                                                                    z64Var10 = nc1.A(ua4Var4);
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    nc1.z(ua4Var3, z64Var8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((z64Var5.L & 1024) != 0 && (z64Var5 instanceof zg1)) {
                                        for (z64 z64Var12 = ((zg1) z64Var5).l0; z64Var12 != null; z64Var12 = z64Var12.Y) {
                                            if ((z64Var12.L & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    z64Var5 = z64Var12;
                                                } else {
                                                    if (ua4Var2 == null) {
                                                        ua4Var2 = new ua4(new z64[16]);
                                                    }
                                                    if (z64Var5 != null) {
                                                        ua4Var2.b(z64Var5);
                                                        z64Var5 = null;
                                                    }
                                                    ua4Var2.b(z64Var12);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    z64Var5 = nc1.A(ua4Var2);
                                }
                                continue;
                            }
                        }
                    }
                    nc1.z(ua4Var, z64Var3);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        CharSequence textValue;
        ta6 x;
        qn2 qn2Var;
        qn2 qn2Var2;
        CharSequence textValue2;
        if (d()) {
            nd ndVar = this.L0;
            if (ndVar != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue j = k2.j(sparseArray.get(keyAt));
                    sm3 sm3Var = (sm3) ndVar.B.c.b(keyAt);
                    if (sm3Var != null && (x = sm3Var.x()) != null) {
                        ja4 ja4Var = x.A;
                        Object g = ja4Var.g(sa6.g);
                        y1 y1Var = null;
                        if (g == null) {
                            g = null;
                        }
                        y1 y1Var2 = (y1) g;
                        if (y1Var2 != null && (qn2Var2 = (qn2) y1Var2.b) != null) {
                            textValue2 = j.getTextValue();
                            Boolean bool = (Boolean) qn2Var2.g(new fp(textValue2.toString()));
                        }
                        Object g2 = ja4Var.g(sa6.h);
                        if (g2 != null) {
                            y1Var = g2;
                        }
                        y1 y1Var3 = y1Var;
                        if (y1Var3 != null && (qn2Var = (qn2) y1Var3.b) != null) {
                            Boolean bool2 = (Boolean) qn2Var.g(new oh(j));
                        }
                    }
                }
            }
            eb ebVar = this.K0;
            if (ebVar != null) {
                mz mzVar = (mz) ebVar.L;
                if (!mzVar.a.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        int keyAt2 = sparseArray.keyAt(i2);
                        AutofillValue j2 = k2.j(sparseArray.get(keyAt2));
                        isText = j2.isText();
                        if (isText) {
                            textValue = j2.getTextValue();
                            textValue.toString();
                            if (mzVar.a.get(Integer.valueOf(keyAt2)) != null) {
                                u34.a();
                                return;
                            }
                        } else if (!au.A(j2)) {
                            if (!au.D(j2)) {
                                if (au.C(j2)) {
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

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.y0.m(i, this.B, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.y0.m(i, this.B, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ca4 ca4Var = this.D0;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        s(true);
        bm6.j().m();
        this.F0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            ak0 ak0Var = this.r0;
            wd wdVar = ak0Var.a;
            Canvas canvas2 = wdVar.a;
            wdVar.a = canvas;
            getRoot().i(wdVar, null);
            ak0Var.a.a = canvas2;
            if (ca4Var.i()) {
                int i = ca4Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((xt2) ((yp4) ca4Var.f(i2))).g();
                }
            }
            int i3 = no7.A;
            ca4Var.d();
            this.F0 = false;
            Trace.endSection();
            ca4 ca4Var2 = this.E0;
            if (ca4Var2 != null) {
                ca4Var.b(ca4Var2);
                ca4Var2.d();
            }
            if (m()) {
                yp.a(this, this.v1);
                View view = this.k0;
                if (view != null) {
                    yp.a(view, this.w1);
                    if (!Float.isNaN(this.w1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.v1 = Float.NaN;
                this.w1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0448, code lost:
        if ((r2 / r3) >= 5.0f) goto L640;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        String str;
        int i2;
        ei eiVar;
        String str2;
        long j;
        r43 r43Var;
        boolean z2;
        long j2;
        long j3;
        int i3;
        char c;
        long eventTime;
        int i4;
        long j4;
        boolean z3;
        int i5;
        a53 a53Var;
        if0 if0Var;
        boolean z4;
        z64 z64Var;
        if0 if0Var2;
        a53 a53Var2;
        boolean z5;
        int i6;
        int i7;
        if0 if0Var3;
        boolean z6;
        z64 z64Var2;
        if0 if0Var4;
        boolean z7;
        ie ieVar;
        int i8;
        if0 if0Var5;
        boolean z8;
        z64 z64Var3;
        if0 if0Var6;
        if (this.z1) {
            ee eeVar = this.y1;
            removeCallbacks(eeVar);
            if (motionEvent.getActionMasked() == 8) {
                this.z1 = false;
            } else {
                eeVar.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow()) {
            String str3 = "visitAncestors called on an unattached node";
            int i9 = -1;
            int i10 = 1;
            if (motionEvent.getActionMasked() == 8) {
                if (motionEvent.isFromSource(Compress.MAXWINSIZE)) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    motionEvent.getAxisValue(26);
                    Context context = getContext();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 26) {
                        Method method = go7.a;
                        pt0.k(viewConfiguration);
                    } else {
                        go7.a(viewConfiguration, context);
                    }
                    Context context2 = getContext();
                    if (i11 >= 26) {
                        pt0.j(viewConfiguration);
                    } else {
                        go7.a(viewConfiguration, context2);
                    }
                    motionEvent.getEventTime();
                    motionEvent.getDeviceId();
                    eh2 eh2Var = (eh2) getFocusOwner();
                    if (eh2Var.d.e) {
                        System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                        return false;
                    }
                    vh2 q = yh2.q(eh2Var.c);
                    if (q != null) {
                        if (!q.A.j0) {
                            p53.c("visitAncestors called on an unattached node");
                        }
                        z64 z64Var4 = q.A;
                        sm3 f0 = nc1.f0(q);
                        loop0: while (true) {
                            if (f0 != null) {
                                if ((((z64) f0.B0.g).R & 16384) != 0) {
                                    while (z64Var4 != null) {
                                        if ((z64Var4.L & 16384) != 0) {
                                            z64Var3 = z64Var4;
                                            ua4 ua4Var = null;
                                            while (z64Var3 != null) {
                                                if (z64Var3 instanceof ie) {
                                                    break loop0;
                                                }
                                                if ((z64Var3.L & 16384) != 0 && (z64Var3 instanceof zg1)) {
                                                    int i12 = 0;
                                                    for (z64 z64Var5 = ((zg1) z64Var3).l0; z64Var5 != null; z64Var5 = z64Var5.Y) {
                                                        if ((z64Var5.L & 16384) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                z64Var3 = z64Var5;
                                                            } else {
                                                                if (ua4Var == null) {
                                                                    ua4Var = new ua4(new z64[16]);
                                                                }
                                                                if (z64Var3 != null) {
                                                                    ua4Var.b(z64Var3);
                                                                    z64Var3 = null;
                                                                }
                                                                ua4Var.b(z64Var5);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                z64Var3 = nc1.A(ua4Var);
                                            }
                                            continue;
                                        }
                                        z64Var4 = z64Var4.X;
                                    }
                                }
                                f0 = f0.v();
                                if (f0 != null && (if0Var6 = f0.B0) != null) {
                                    z64Var4 = (vy6) if0Var6.f;
                                } else {
                                    z64Var4 = null;
                                }
                            } else {
                                z64Var3 = null;
                                break;
                            }
                        }
                        ieVar = (ie) z64Var3;
                    } else {
                        ieVar = null;
                    }
                    if (ieVar != null) {
                        if (!ieVar.A.j0) {
                            p53.c("visitAncestors called on an unattached node");
                        }
                        z64 z64Var6 = ieVar.A.X;
                        sm3 f02 = nc1.f0(ieVar);
                        ArrayList arrayList = null;
                        while (f02 != null) {
                            if ((((z64) f02.B0.g).R & 16384) != 0) {
                                while (z64Var6 != null) {
                                    if ((z64Var6.L & 16384) != 0) {
                                        z64 z64Var7 = z64Var6;
                                        ua4 ua4Var2 = null;
                                        while (z64Var7 != null) {
                                            if (z64Var7 instanceof ie) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(z64Var7);
                                                z8 = false;
                                            } else {
                                                z8 = true;
                                            }
                                            if (z8 && (z64Var7.L & 16384) != 0 && (z64Var7 instanceof zg1)) {
                                                int i13 = 0;
                                                for (z64 z64Var8 = ((zg1) z64Var7).l0; z64Var8 != null; z64Var8 = z64Var8.Y) {
                                                    if ((z64Var8.L & 16384) != 0) {
                                                        i13++;
                                                        if (i13 == 1) {
                                                            z64Var7 = z64Var8;
                                                        } else {
                                                            if (ua4Var2 == null) {
                                                                ua4Var2 = new ua4(new z64[16]);
                                                            }
                                                            if (z64Var7 != null) {
                                                                ua4Var2.b(z64Var7);
                                                                z64Var7 = null;
                                                            }
                                                            ua4Var2.b(z64Var8);
                                                        }
                                                    }
                                                }
                                                if (i13 == 1) {
                                                }
                                            }
                                            z64Var7 = nc1.A(ua4Var2);
                                        }
                                    }
                                    z64Var6 = z64Var6.X;
                                }
                            }
                            f02 = f02.v();
                            if (f02 != null && (if0Var5 = f02.B0) != null) {
                                z64Var6 = (vy6) if0Var5.f;
                            } else {
                                z64Var6 = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i14 = i8 - 1;
                                ((ie) arrayList.get(i8)).getClass();
                                if (i14 < 0) {
                                    break;
                                }
                                i8 = i14;
                            }
                        }
                        z64 z64Var9 = ieVar.A;
                        ua4 ua4Var3 = null;
                        while (z64Var9 != null) {
                            if (!(z64Var9 instanceof ie) && (z64Var9.L & 16384) != 0 && (z64Var9 instanceof zg1)) {
                                int i15 = 0;
                                for (z64 z64Var10 = ((zg1) z64Var9).l0; z64Var10 != null; z64Var10 = z64Var10.Y) {
                                    if ((z64Var10.L & 16384) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            z64Var9 = z64Var10;
                                        } else {
                                            if (ua4Var3 == null) {
                                                ua4Var3 = new ua4(new z64[16]);
                                            }
                                            if (z64Var9 != null) {
                                                ua4Var3.b(z64Var9);
                                                z64Var9 = null;
                                            }
                                            ua4Var3.b(z64Var10);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            z64Var9 = nc1.A(ua4Var3);
                        }
                        if (!super.dispatchGenericMotionEvent(motionEvent)) {
                            z64 z64Var11 = ieVar.A;
                            ua4 ua4Var4 = null;
                            while (z64Var11 != null) {
                                if (!(z64Var11 instanceof ie) && (z64Var11.L & 16384) != 0 && (z64Var11 instanceof zg1)) {
                                    int i16 = 0;
                                    for (z64 z64Var12 = ((zg1) z64Var11).l0; z64Var12 != null; z64Var12 = z64Var12.Y) {
                                        if ((z64Var12.L & 16384) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                z64Var11 = z64Var12;
                                            } else {
                                                if (ua4Var4 == null) {
                                                    ua4Var4 = new ua4(new z64[16]);
                                                }
                                                if (z64Var11 != null) {
                                                    ua4Var4.b(z64Var11);
                                                    z64Var11 = null;
                                                }
                                                ua4Var4.b(z64Var12);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                z64Var11 = nc1.A(ua4Var4);
                            }
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    ((ie) arrayList.get(i17)).getClass();
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                } else if ((j(motionEvent) & 4) == 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (motionEvent.isFromSource(2097152)) {
                r43 r43Var2 = this.R;
                q74 q74Var = this.G0;
                hz3 hz3Var = q74Var.e;
                SparseLongArray sparseLongArray = q74Var.b;
                int actionMasked = motionEvent.getActionMasked();
                q74Var.b(motionEvent);
                if (actionMasked == 3) {
                    sparseLongArray.clear();
                    q74Var.c.clear();
                    str = "visitAncestors called on an unattached node";
                    i = 16;
                    eiVar = null;
                } else {
                    q74Var.a(motionEvent);
                    if (actionMasked != 1) {
                        if (actionMasked == 6) {
                            i9 = motionEvent.getActionIndex();
                        }
                    } else {
                        i9 = 0;
                    }
                    if (actionMasked != 0 && actionMasked != 2 && actionMasked != 5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    i = 16;
                    int pointerCount = motionEvent.getPointerCount();
                    ArrayList arrayList2 = new ArrayList(pointerCount);
                    int i18 = 0;
                    while (i18 < pointerCount) {
                        int pointerId = motionEvent.getPointerId(i18);
                        int i19 = i10;
                        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                        if (indexOfKey >= 0) {
                            str2 = str3;
                            j = sparseLongArray.valueAt(indexOfKey);
                            r43Var = r43Var2;
                        } else {
                            str2 = str3;
                            j = q74Var.a;
                            r43Var = r43Var2;
                            q74Var.a = j + 1;
                            sparseLongArray.put(pointerId, j);
                        }
                        q74 q74Var2 = q74Var;
                        long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i18)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i18)) & 4294967295L);
                        if (i18 != i9) {
                            z2 = i19;
                        } else {
                            z2 = 0;
                        }
                        p74 p74Var = (p74) hz3Var.b(j);
                        if (i18 == i9) {
                            hz3Var.g(j);
                            j2 = j;
                            j3 = 2147483647L;
                            c = ' ';
                            i3 = 65535;
                        } else {
                            if (z) {
                                j3 = 2147483647L;
                                i3 = 65535;
                                j2 = j;
                                hz3Var.f(j2, new p74(1 | ((motionEvent.getEventTime() & 2147483647L) << i19) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16)) << 32)));
                            } else {
                                j2 = j;
                                j3 = 2147483647L;
                                i3 = 65535;
                            }
                            c = ' ';
                        }
                        long eventTime2 = motionEvent.getEventTime();
                        long j5 = j3;
                        float pressure = motionEvent.getPressure(i18);
                        int i20 = i3;
                        int i21 = i9;
                        if (p74Var != null) {
                            eventTime = (p74Var.a >> i19) & j5;
                        } else {
                            eventTime = motionEvent.getEventTime();
                        }
                        long j6 = eventTime;
                        if (p74Var != null) {
                            int i22 = (int) (p74Var.a >>> c);
                            i4 = i21;
                            j4 = (Float.floatToRawIntBits((short) (i22 & i20)) & 4294967295L) | (Float.floatToRawIntBits((short) (i22 >>> 16)) << c);
                        } else {
                            i4 = i21;
                            j4 = floatToRawIntBits;
                        }
                        if (p74Var != null) {
                            if ((p74Var.a & 1) != 0) {
                                i5 = i19;
                            } else {
                                i5 = 0;
                            }
                            z3 = i5;
                        } else {
                            z3 = 0;
                        }
                        arrayList2.add(new s43(j2, eventTime2, floatToRawIntBits, z2, pressure, j6, j4, z3));
                        i18++;
                        q74Var = q74Var2;
                        i10 = i19;
                        str3 = str2;
                        r43Var2 = r43Var;
                        i9 = i4;
                    }
                    r43 r43Var3 = r43Var2;
                    str = str3;
                    int i23 = i10;
                    q74Var.e(motionEvent);
                    if (r43Var3 != null) {
                        i2 = r43Var3.a;
                    } else if (motionEvent.isFromSource(2097152)) {
                        InputDevice device = motionEvent.getDevice();
                        if (device != null) {
                            InputDevice.MotionRange motionRange = device.getMotionRange(0);
                            InputDevice.MotionRange motionRange2 = device.getMotionRange(i23);
                            if (motionRange == null || motionRange2 != null) {
                                if (motionRange2 == null || motionRange != null) {
                                    if (motionRange != null && motionRange2 != null) {
                                        float range = motionRange.getRange();
                                        float range2 = motionRange2.getRange();
                                        if (range <= range2 || (range2 != RecyclerView.B1 && range / range2 < 5.0f)) {
                                            if (range2 > range) {
                                                if (range != RecyclerView.B1) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = 2;
                            }
                            i2 = 1;
                        }
                        i2 = 0;
                    } else {
                        i.h("MotionEvent must be a touch navigation source");
                        return false;
                    }
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
                    }
                    eiVar = new ei(arrayList2, i2, motionEvent);
                }
                k60 k60Var = this.A1;
                if (eiVar != null) {
                    eh2 eh2Var2 = (eh2) getFocusOwner();
                    if (eh2Var2.d.e) {
                        System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
                    } else {
                        vh2 f = eh2Var2.f();
                        if (f != null) {
                            if (!f.A.j0) {
                                p53.c(str);
                            }
                            z64 z64Var13 = f.A;
                            sm3 f03 = nc1.f0(f);
                            loop14: while (true) {
                                if (f03 != null) {
                                    int i24 = 2097152;
                                    if ((((z64) f03.B0.g).R & 2097152) != 0) {
                                        while (z64Var13 != null) {
                                            if ((z64Var13.L & i24) != 0) {
                                                z64Var2 = z64Var13;
                                                ua4 ua4Var5 = null;
                                                while (z64Var2 != null) {
                                                    if (z64Var2 instanceof a53) {
                                                        break loop14;
                                                    }
                                                    if ((z64Var2.L & i24) != 0 && (z64Var2 instanceof zg1)) {
                                                        z64 z64Var14 = ((zg1) z64Var2).l0;
                                                        int i25 = 0;
                                                        while (z64Var14 != null) {
                                                            if ((z64Var14.L & i24) != 0) {
                                                                i25++;
                                                                if (i25 == 1) {
                                                                    z64Var2 = z64Var14;
                                                                } else {
                                                                    if (ua4Var5 == null) {
                                                                        ua4Var5 = new ua4(new z64[i]);
                                                                    }
                                                                    if (z64Var2 != null) {
                                                                        ua4Var5.b(z64Var2);
                                                                        z64Var2 = null;
                                                                    }
                                                                    ua4Var5.b(z64Var14);
                                                                }
                                                            }
                                                            z64Var14 = z64Var14.Y;
                                                            i = 16;
                                                            i24 = 2097152;
                                                        }
                                                        if (i25 == 1) {
                                                            i = 16;
                                                            i24 = 2097152;
                                                        }
                                                    }
                                                    z64Var2 = nc1.A(ua4Var5);
                                                    i = 16;
                                                    i24 = 2097152;
                                                }
                                                continue;
                                            }
                                            z64Var13 = z64Var13.X;
                                            i = 16;
                                            i24 = 2097152;
                                        }
                                    }
                                    f03 = f03.v();
                                    if (f03 != null && (if0Var4 = f03.B0) != null) {
                                        z64Var13 = (vy6) if0Var4.f;
                                    } else {
                                        z64Var13 = null;
                                    }
                                    i = 16;
                                } else {
                                    z64Var2 = null;
                                    break;
                                }
                            }
                            a53Var2 = (a53) z64Var2;
                        } else {
                            a53Var2 = null;
                        }
                        if (a53Var2 != null) {
                            z64 z64Var15 = (z64) a53Var2;
                            if (!z64Var15.A.j0) {
                                p53.c(str);
                            }
                            z64 z64Var16 = z64Var15.A.X;
                            sm3 f04 = nc1.f0(a53Var2);
                            ArrayList arrayList3 = null;
                            while (f04 != null) {
                                int i26 = 2097152;
                                if ((((z64) f04.B0.g).R & 2097152) != 0) {
                                    while (z64Var16 != null) {
                                        if ((z64Var16.L & i26) != 0) {
                                            z64 z64Var17 = z64Var16;
                                            ua4 ua4Var6 = null;
                                            while (z64Var17 != null) {
                                                if (z64Var17 instanceof a53) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(z64Var17);
                                                    z6 = false;
                                                } else {
                                                    z6 = true;
                                                }
                                                if (z6) {
                                                    int i27 = 2097152;
                                                    if ((z64Var17.L & 2097152) != 0 && (z64Var17 instanceof zg1)) {
                                                        z64 z64Var18 = ((zg1) z64Var17).l0;
                                                        int i28 = 0;
                                                        while (z64Var18 != null) {
                                                            if ((z64Var18.L & i27) != 0) {
                                                                i28++;
                                                                if (i28 == 1) {
                                                                    z64Var17 = z64Var18;
                                                                } else {
                                                                    if (ua4Var6 == null) {
                                                                        ua4Var6 = new ua4(new z64[16]);
                                                                    }
                                                                    if (z64Var17 != null) {
                                                                        ua4Var6.b(z64Var17);
                                                                        z64Var17 = null;
                                                                    }
                                                                    ua4Var6.b(z64Var18);
                                                                }
                                                            }
                                                            z64Var18 = z64Var18.Y;
                                                            i27 = 2097152;
                                                        }
                                                        if (i28 == 1) {
                                                        }
                                                    }
                                                }
                                                z64Var17 = nc1.A(ua4Var6);
                                            }
                                        }
                                        z64Var16 = z64Var16.X;
                                        i26 = 2097152;
                                    }
                                }
                                f04 = f04.v();
                                if (f04 != null && (if0Var3 = f04.B0) != null) {
                                    z64Var16 = (vy6) if0Var3.f;
                                } else {
                                    z64Var16 = null;
                                }
                            }
                            if (arrayList3 != null && arrayList3.size() - 1 >= 0) {
                                while (true) {
                                    int i29 = i7 - 1;
                                    ((a53) arrayList3.get(i7)).u(eiVar, py4.Initial);
                                    if (i29 < 0) {
                                        break;
                                    }
                                    i7 = i29;
                                }
                            }
                            a53Var2.u(eiVar, py4.Initial);
                            a53Var2.u(eiVar, py4.Main);
                            if (arrayList3 != null) {
                                int size2 = arrayList3.size();
                                for (int i30 = 0; i30 < size2; i30++) {
                                    ((a53) arrayList3.get(i30)).u(eiVar, py4.Main);
                                }
                            }
                            if (arrayList3 != null && arrayList3.size() - 1 >= 0) {
                                while (true) {
                                    int i31 = i6 - 1;
                                    ((a53) arrayList3.get(i6)).u(eiVar, py4.Final);
                                    if (i31 < 0) {
                                        break;
                                    }
                                    i6 = i31;
                                }
                            }
                            a53Var2.u(eiVar, py4.Final);
                        }
                        ArrayList arrayList4 = (ArrayList) eiVar.L;
                        int size3 = arrayList4.size();
                        for (int i32 = 0; i32 < size3; i32++) {
                            if (((s43) arrayList4.get(i32)).i) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    k60Var.getClass();
                    MotionEvent motionEvent2 = (MotionEvent) eiVar.R;
                    int action = motionEvent2.getAction();
                    if (action != 0) {
                        z7 = true;
                        if ((action == 1 || action == 2) && z5) {
                            k60Var.b = 0;
                            k60Var.c = true;
                        }
                    } else {
                        z7 = true;
                        k60Var.b = eiVar.B;
                        k60Var.c = false;
                    }
                    ((GestureDetector) k60Var.e).onTouchEvent(motionEvent2);
                    return z7;
                }
                vh2 f2 = ((eh2) getFocusOwner()).f();
                if (f2 != null) {
                    if (!f2.A.j0) {
                        p53.c(str);
                    }
                    z64 z64Var19 = f2.A;
                    sm3 f05 = nc1.f0(f2);
                    loop26: while (true) {
                        if (f05 != null) {
                            int i33 = 2097152;
                            if ((((z64) f05.B0.g).R & 2097152) != 0) {
                                while (z64Var19 != null) {
                                    if ((z64Var19.L & i33) != 0) {
                                        z64Var = z64Var19;
                                        ua4 ua4Var7 = null;
                                        while (z64Var != null) {
                                            if (z64Var instanceof a53) {
                                                break loop26;
                                            }
                                            if ((z64Var.L & i33) != 0 && (z64Var instanceof zg1)) {
                                                z64 z64Var20 = ((zg1) z64Var).l0;
                                                int i34 = 0;
                                                while (z64Var20 != null) {
                                                    if ((z64Var20.L & i33) != 0) {
                                                        i34++;
                                                        if (i34 == 1) {
                                                            z64Var = z64Var20;
                                                        } else {
                                                            if (ua4Var7 == null) {
                                                                ua4Var7 = new ua4(new z64[16]);
                                                            }
                                                            if (z64Var != null) {
                                                                ua4Var7.b(z64Var);
                                                                z64Var = null;
                                                            }
                                                            ua4Var7.b(z64Var20);
                                                        }
                                                    }
                                                    z64Var20 = z64Var20.Y;
                                                    i33 = 2097152;
                                                }
                                                if (i34 == 1) {
                                                    i33 = 2097152;
                                                }
                                            }
                                            z64Var = nc1.A(ua4Var7);
                                            i33 = 2097152;
                                        }
                                        continue;
                                    }
                                    z64Var19 = z64Var19.X;
                                    i33 = 2097152;
                                }
                            }
                            f05 = f05.v();
                            if (f05 != null && (if0Var2 = f05.B0) != null) {
                                z64Var19 = (vy6) if0Var2.f;
                            } else {
                                z64Var19 = null;
                            }
                        } else {
                            z64Var = null;
                            break;
                        }
                    }
                    a53Var = (a53) z64Var;
                } else {
                    a53Var = null;
                }
                if (a53Var != null) {
                    z64 z64Var21 = (z64) a53Var;
                    if (!z64Var21.A.j0) {
                        p53.c(str);
                    }
                    z64 z64Var22 = z64Var21.A.X;
                    sm3 f06 = nc1.f0(a53Var);
                    ArrayList arrayList5 = null;
                    while (f06 != null) {
                        int i35 = 2097152;
                        if ((((z64) f06.B0.g).R & 2097152) != 0) {
                            while (z64Var22 != null) {
                                if ((z64Var22.L & i35) != 0) {
                                    z64 z64Var23 = z64Var22;
                                    ua4 ua4Var8 = null;
                                    while (z64Var23 != null) {
                                        if (z64Var23 instanceof a53) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(z64Var23);
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            if ((z64Var23.L & 2097152) != 0 && (z64Var23 instanceof zg1)) {
                                                int i36 = 0;
                                                for (z64 z64Var24 = ((zg1) z64Var23).l0; z64Var24 != null; z64Var24 = z64Var24.Y) {
                                                    if ((z64Var24.L & 2097152) != 0) {
                                                        i36++;
                                                        if (i36 == 1) {
                                                            z64Var23 = z64Var24;
                                                        } else {
                                                            if (ua4Var8 == null) {
                                                                ua4Var8 = new ua4(new z64[16]);
                                                            }
                                                            if (z64Var23 != null) {
                                                                ua4Var8.b(z64Var23);
                                                                z64Var23 = null;
                                                            }
                                                            ua4Var8.b(z64Var24);
                                                        }
                                                    }
                                                }
                                                if (i36 == 1) {
                                                }
                                            }
                                        }
                                        z64Var23 = nc1.A(ua4Var8);
                                    }
                                }
                                i35 = 2097152;
                                z64Var22 = z64Var22.X;
                            }
                        }
                        f06 = f06.v();
                        if (f06 != null && (if0Var = f06.B0) != null) {
                            z64Var22 = (vy6) if0Var.f;
                        } else {
                            z64Var22 = null;
                        }
                    }
                    a53Var.f0();
                    if (arrayList5 != null) {
                        int size4 = arrayList5.size();
                        for (int i37 = 0; i37 < size4; i37++) {
                            ((a53) arrayList5.get(i37)).f0();
                        }
                    }
                }
                k60Var.b = 0;
                k60Var.c = true;
                return true;
            } else {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
        if (p(r24) == false) goto L68;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.z1;
        ee eeVar = this.y1;
        if (z) {
            removeCallbacks(eeVar);
            eeVar.run();
        }
        if (!n(motionEvent) && isAttachedToWindow()) {
            ze zeVar = this.y0;
            te teVar = zeVar.R;
            AccessibilityManager accessibilityManager = zeVar.Z;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action == 10) {
                        int i2 = zeVar.X;
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != Integer.MIN_VALUE) {
                                zeVar.X = Integer.MIN_VALUE;
                                ze.E(zeVar, Integer.MIN_VALUE, 128, null, 12);
                                ze.E(zeVar, i2, 256, null, 12);
                            }
                        } else {
                            teVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    teVar.s(true);
                    zx2 zx2Var = new zx2();
                    sm3 root = teVar.getRoot();
                    long floatToRawIntBits = Float.floatToRawIntBits(x);
                    if0 if0Var = root.B0;
                    eg4 eg4Var = (eg4) if0Var.e;
                    op5 op5Var = eg4.K0;
                    ((eg4) if0Var.e).d1(eg4.O0, eg4Var.V0((floatToRawIntBits << 32) | (Float.floatToRawIntBits(y) & 4294967295L), true), zx2Var, 1, true);
                    ca4 ca4Var = zx2Var.A;
                    int i3 = ca4Var.b - 1;
                    while (true) {
                        if (-1 < i3) {
                            Object f = ca4Var.f(i3);
                            f.getClass();
                            sm3 f0 = nc1.f0((z64) f);
                            if (teVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(f0) == null) {
                                if (f0.B0.g(8)) {
                                    int A = zeVar.A(f0.B);
                                    xa6 h = kn2.h(f0, false);
                                    if (u24.w(h)) {
                                        if (!h.k().A.c(bb6.B)) {
                                            i = A;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i3--;
                            } else {
                                u34.a();
                                return false;
                            }
                        } else {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                    }
                    teVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i4 = zeVar.X;
                    if (i4 != i) {
                        zeVar.X = i;
                        ze.E(zeVar, i, 128, null, 12);
                        ze.E(zeVar, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && o(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.r1;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.r1 = MotionEvent.obtainNoHistory(motionEvent);
                        this.z1 = true;
                        postDelayed(eeVar, 8L);
                        return false;
                    }
                }
                if ((j(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            zr3 zr3Var = getComposeViewContext().s;
            int metaState = keyEvent.getMetaState();
            zr3Var.getClass();
            pt7.a.setValue(new az4(metaState));
            if (!((eh2) getFocusOwner()).d(keyEvent, iy0.g0) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((eh2) getFocusOwner()).d(keyEvent, new le(0, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if0 if0Var;
        if (isFocused()) {
            eh2 eh2Var = (eh2) getFocusOwner();
            if (eh2Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                vh2 q = yh2.q(eh2Var.c);
                if (q != null) {
                    if (!q.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var = q.A;
                    sm3 f0 = nc1.f0(q);
                    while (f0 != null) {
                        if ((((z64) f0.B0.g).R & 131072) != 0) {
                            while (z64Var != null) {
                                if ((z64Var.L & 131072) != 0) {
                                    z64 z64Var2 = z64Var;
                                    ua4 ua4Var = null;
                                    while (z64Var2 != null) {
                                        if ((z64Var2.L & 131072) != 0 && (z64Var2 instanceof zg1)) {
                                            int i = 0;
                                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                                if ((z64Var3.L & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        z64Var2 = z64Var3;
                                                    } else {
                                                        if (ua4Var == null) {
                                                            ua4Var = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var2 != null) {
                                                            ua4Var.b(z64Var2);
                                                            z64Var2 = null;
                                                        }
                                                        ua4Var.b(z64Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        z64Var2 = nc1.A(ua4Var);
                                    }
                                }
                                z64Var = z64Var.X;
                            }
                        }
                        f0 = f0.v();
                        if (f0 != null && (if0Var = f0.B0) != null) {
                            z64Var = (vy6) if0Var.f;
                        } else {
                            z64Var = null;
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
            bf.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view;
        Object jxVar;
        vh2 f;
        if (this.z1) {
            ee eeVar = this.y1;
            removeCallbacks(eeVar);
            MotionEvent motionEvent2 = this.r1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.z1 = false;
            } else {
                eeVar.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int j = j(motionEvent);
            if ((j & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                ViewParent parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null || (jxVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    jxVar = new jx(1);
                }
                if (jxVar.equals(new jx(1)) && (f = ((eh2) getFocusOwner()).f()) != null) {
                    eg4 e0 = nc1.e0(f);
                    if (!ej2.w(e0).O(e0, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((eh2) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return g(this, i);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [dh5, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null && !this.U0.c) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
            of5 of5Var = null;
            if (findNextFocus != null && !findNextFocus.equals(this)) {
                for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
            }
            findNextFocus = null;
            if (view == this) {
                vh2 q = yh2.q(((eh2) getFocusOwner()).c);
                if (q != null) {
                    of5Var = yh2.r(q);
                }
                if (of5Var == null) {
                    of5Var = wg2.a(view, this);
                }
            } else {
                of5Var = wg2.a(view, this);
            }
            qg2 b = wg2.b(i);
            if (b != null) {
                i2 = b.a;
            } else {
                i2 = 6;
            }
            ?? obj = new Object();
            if (((eh2) getFocusOwner()).e(i2, of5Var, new me(0, obj)) == null) {
                return view;
            }
            Object obj2 = obj.A;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i);
                }
            } else if (findNextFocus == null || i2 == 1 || i2 == 2 || uj2.S(yh2.r((vh2) obj2), wg2.a(findNextFocus, this), of5Var, i2)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final zm getAndroidViewsHandler$ui() {
        if (this.R0 == null) {
            zm zmVar = new zm(getContext());
            this.R0 = zmVar;
            addView(zmVar, -1);
            requestLayout();
        }
        zm zmVar2 = this.R0;
        zmVar2.getClass();
        return zmVar2;
    }

    public gz getAutofill() {
        return this.K0;
    }

    public lz getAutofillManager() {
        return this.L0;
    }

    public mz getAutofillTree() {
        return this.C0;
    }

    public final mx0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.E1;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.I0.getValue();
    }

    public final qf getContentCaptureManager$ui() {
        return this.z0;
    }

    public l61 getCoroutineContext() {
        return this.m0;
    }

    public qh1 getDensity() {
        return (qh1) this.j0.getValue();
    }

    public of5 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            vh2 q = yh2.q(((eh2) getFocusOwner()).c);
            if (q == null) {
                return null;
            }
            return yh2.r(q);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return wg2.a(findFocus, this);
    }

    public ah2 getFocusOwner() {
        return this.l0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        of5 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (!nb3.k(((eh2) getFocusOwner()).e(6, null, ne.L), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public ki2 getFontFamilyResolver() {
        return (ki2) this.l1.getValue();
    }

    public ji2 getFontLoader() {
        return this.k1;
    }

    public final lu3 getFrameEndScheduler$ui() {
        return this.e0;
    }

    public tt2 getGraphicsContext() {
        return this.B0;
    }

    public tv2 getHapticFeedBack() {
        return this.n1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!this.U0.b.O() && this.h0.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public x63 getInputModeManager() {
        return this.o1;
    }

    public final j83 getInsetsListener() {
        return this.t0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.a1;
    }

    @Override // android.view.View, android.view.ViewParent
    public kk3 getLayoutDirection() {
        return (kk3) this.m1.getValue();
    }

    public gy3 getLocaleList() {
        return (gy3) this.J0.getValue();
    }

    public long getMeasureIteration() {
        a34 a34Var = this.U0;
        if (!a34Var.c) {
            p53.a("measureIteration should be only used during the measure/layout pass");
        }
        return a34Var.g;
    }

    public b74 getModifierLocalManager() {
        return this.p1;
    }

    public te getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public cx4 getPlacementScope() {
        int i = ex4.b;
        return new lz3(this, 1);
    }

    public uy4 getPointerIconService() {
        return this.H1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui  reason: not valid java name */
    public final r43 m11getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.R;
    }

    public rf5 getRectManager() {
        return this.w0;
    }

    public mm5 getRetainedValuesStore() {
        return this.g0;
    }

    public sm3 getRoot() {
        return this.u0;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        s35 s35Var;
        if (Build.VERSION.SDK_INT >= 31 && (s35Var = this.F1) != null) {
            return ((Boolean) ((vs4) s35Var.A).getValue()).booleanValue();
        }
        return false;
    }

    public ab6 getSemanticsOwner() {
        return this.x0;
    }

    public um3 getSharedDrawScope() {
        return this.d0;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return tp.a.a(this);
        }
        return this.Q0;
    }

    public bq4 getSnapshotObserver() {
        return this.P0;
    }

    public xm6 getSoftwareKeyboardController() {
        bh1 bh1Var = this.j1;
        if (bh1Var == null) {
            bh1 bh1Var2 = new bh1(getTextInputService());
            this.j1 = bh1Var2;
            return bh1Var2;
        }
        return bh1Var;
    }

    public o37 getTextInputService() {
        o37 o37Var = this.h1;
        if (o37Var == null) {
            o37 o37Var2 = new o37(getLegacyTextInputServiceAndroid());
            this.h1 = o37Var2;
            return o37Var2;
        }
        return o37Var;
    }

    public u47 getTextToolbar() {
        return this.q1;
    }

    public final o16 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public fo7 getViewConfiguration() {
        return this.s0;
    }

    public final je getViewTreeOwners() {
        xg6.A(this.e1.getValue());
        return null;
    }

    public ot7 getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final nd get_autofillManager$ui() {
        return this.L0;
    }

    public final void i(sm3 sm3Var, boolean z) {
        this.U0.g(sm3Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:116:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:57:0x00be, B:58:0x00c1, B:60:0x00c5, B:62:0x00cb, B:64:0x00cf, B:66:0x00d5, B:69:0x00dd, B:72:0x00e5, B:73:0x00f1, B:75:0x00f7, B:77:0x00fd, B:79:0x0103, B:81:0x0109, B:83:0x010d, B:84:0x0111, B:90:0x0124, B:92:0x0128, B:94:0x012f, B:101:0x0140, B:102:0x014a, B:104:0x0152, B:105:0x0155, B:106:0x015c), top: B:118:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z3;
        te teVar;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        int i;
        int action;
        MotionEvent motionEvent5;
        float f;
        MotionEvent motionEvent6;
        float x;
        boolean z4;
        MotionEvent motionEvent7;
        long j;
        boolean z5;
        wx2 wx2Var;
        removeCallbacks(this.x1);
        try {
            A(motionEvent);
            this.b1 = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent8 = this.r1;
                if (motionEvent8 != null && motionEvent8.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                ka0 ka0Var = this.H0;
                if (motionEvent8 != null) {
                    try {
                        if (motionEvent8.getSource() == motionEvent.getSource() && motionEvent8.getToolType(0) == motionEvent.getToolType(0)) {
                            z2 = false;
                            if (z2) {
                                if (motionEvent8.getButtonState() != 0 || (actionMasked = motionEvent8.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent8;
                                    if (!ka0Var.a) {
                                        ((hz3) ((s63) ka0Var.d).B).a();
                                        ((wx2) ka0Var.c).c();
                                    }
                                } else if (motionEvent8.getActionMasked() != 10 && z) {
                                    F(motionEvent8, 10, motionEvent8.getEventTime(), true);
                                    motionEvent2 = motionEvent8;
                                }
                                if (motionEvent.getToolType(0) != 3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z && z3 && actionMasked2 != 3 && actionMasked2 != 9 && o(motionEvent)) {
                                    teVar = this;
                                    teVar.F(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    teVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = teVar.r1;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    motionEvent4 = teVar.r1;
                                    if (motionEvent4 == null) {
                                        i = motionEvent4.getPointerId(0);
                                    } else {
                                        i = -1;
                                    }
                                    action = motionEvent.getAction();
                                    q74 q74Var = teVar.G0;
                                    if (action != 9 && motionEvent.getHistorySize() == 0) {
                                        if (i >= 0) {
                                            q74Var.c.delete(i);
                                            q74Var.b.delete(i);
                                        }
                                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                        motionEvent5 = teVar.r1;
                                        float f2 = Float.NaN;
                                        if (motionEvent5 == null) {
                                            f = motionEvent5.getX();
                                        } else {
                                            f = Float.NaN;
                                        }
                                        motionEvent6 = teVar.r1;
                                        if (motionEvent6 != null) {
                                            f2 = motionEvent6.getY();
                                        }
                                        x = motionEvent.getX();
                                        float y = motionEvent.getY();
                                        if (f != x && f2 == y) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        motionEvent7 = teVar.r1;
                                        if (motionEvent7 == null) {
                                            j = motionEvent7.getEventTime();
                                        } else {
                                            j = -1;
                                        }
                                        if (j == motionEvent.getEventTime()) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (!z4 || z5) {
                                            if (i >= 0) {
                                                q74Var.c.delete(i);
                                                q74Var.b.delete(i);
                                            }
                                            wx2Var = (wx2) ka0Var.c;
                                            if (!wx2Var.d) {
                                                wx2Var.d = true;
                                            } else {
                                                wx2Var.g.a.g();
                                            }
                                        }
                                    }
                                }
                                teVar.r1 = MotionEvent.obtainNoHistory(motionEvent);
                                int E = E(motionEvent);
                                Trace.endSection();
                                teVar.b1 = false;
                                return E;
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent8;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z) {
                }
                teVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = teVar.r1;
                if (motionEvent3 != null) {
                    motionEvent4 = teVar.r1;
                    if (motionEvent4 == null) {
                    }
                    action = motionEvent.getAction();
                    q74 q74Var2 = teVar.G0;
                    if (action != 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        motionEvent5 = teVar.r1;
                        float f22 = Float.NaN;
                        if (motionEvent5 == null) {
                        }
                        motionEvent6 = teVar.r1;
                        if (motionEvent6 != null) {
                        }
                        x = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (f != x) {
                        }
                        z4 = true;
                        motionEvent7 = teVar.r1;
                        if (motionEvent7 == null) {
                        }
                        if (j == motionEvent.getEventTime()) {
                        }
                        if (!z4) {
                        }
                        if (i >= 0) {
                        }
                        wx2Var = (wx2) ka0Var.c;
                        if (!wx2Var.d) {
                        }
                    }
                }
                teVar.r1 = MotionEvent.obtainNoHistory(motionEvent);
                int E2 = E(motionEvent);
                Trace.endSection();
                teVar.b1 = false;
                return E2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.b1 = false;
            throw th3;
        }
    }

    public final void l(sm3 sm3Var) {
        this.U0.r(sm3Var, false);
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            l((sm3) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (RecyclerView.B1 <= x && x <= getWidth() && RecyclerView.B1 <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [yo7, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        mm5 mm5Var;
        mu3 mu3Var;
        eb ebVar;
        Method method;
        super.onAttachedToWindow();
        int i = 1;
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(g04.F());
        }
        this.t0.onViewAttachedToWindow(this);
        int i3 = 0;
        if (i2 > 28) {
            if (M1 == null) {
                ge geVar = new ge(0);
                M1 = geVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (I1 == null) {
                        I1 = Class.forName("android.os.SystemProperties");
                    }
                    if (K1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = I1;
                        if (cls != null) {
                            method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                        } else {
                            method = null;
                        }
                        K1 = method;
                    }
                    Method method2 = K1;
                    if (method2 != null) {
                        method2.invoke(null, geVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            ca4 ca4Var = L1;
            synchronized (ca4Var) {
                ca4Var.a(this);
            }
        }
        if (!this.E1) {
            getComposeViewContext().c();
        }
        this.E1 = false;
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.e();
        if (d() && (ebVar = this.K0) != null) {
            iz izVar = iz.a;
            izVar.getClass();
            au.B((AutofillManager) ebVar.R, au.c(izVar));
        }
        hu3 hu3Var = getComposeViewContext().c;
        bp7 bp7Var = getComposeViewContext().e;
        lu3 lu3Var = this.e0;
        if (hu3Var != null && bp7Var != null && lu3Var != null) {
            ap7 viewModelStore = bp7Var.getViewModelStore();
            ?? obj = new Object();
            h71 h71Var = h71.b;
            viewModelStore.getClass();
            h71Var.getClass();
            eb ebVar2 = new eb(viewModelStore, (yo7) obj, h71Var);
            ar0 a = gh5.a(nu3.class);
            String b = a.b();
            if (b != null) {
                ViewParent parent = getParent();
                parent.getClass();
                int id = ((View) parent).getId();
                p94 p94Var = ((nu3) ebVar2.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                Object b2 = p94Var.b(id);
                if (b2 == null) {
                    b2 = new ca4(1);
                    p94Var.i(id, b2);
                }
                ca4 ca4Var2 = (ca4) b2;
                Object[] objArr = ca4Var2.a;
                int i4 = ca4Var2.b;
                while (true) {
                    if (i3 < i4) {
                        mu3Var = objArr[i3];
                        if (!((mu3) mu3Var).c) {
                            break;
                        }
                        i3++;
                    } else {
                        mu3Var = null;
                        break;
                    }
                }
                mu3 mu3Var2 = mu3Var;
                if (mu3Var2 == null) {
                    mu3Var2 = new mu3();
                    ca4Var2.a(mu3Var2);
                }
                mu3Var2.c = true;
                this.f0 = mu3Var2;
                mm5Var = mu3Var2.b;
            } else {
                i.h("Local and anonymous classes can not be ViewModels");
                return;
            }
        } else {
            mm5Var = null;
        }
        if (mm5Var == null) {
            mm5Var = cs1.d0;
        }
        this.g0 = mm5Var;
        qn2 qn2Var = this.f1;
        if (qn2Var != null) {
            qn2Var.g(getComposeViewContext());
            this.f1 = null;
        }
        ut3 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.z0);
        y63 y63Var = this.o1;
        if (!isInTouchMode()) {
            i = 2;
        }
        y63Var.a.setValue(new w63(i));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ef.a.b(this);
        }
        nd ndVar = this.L0;
        if (ndVar != null) {
            ((eh2) getFocusOwner()).g.a(ndVar);
            getSemanticsOwner().d.a(ndVar);
        }
        ((eh2) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        v63 v63Var;
        vc6 vc6Var = (vc6) this.i1.get();
        Object obj2 = null;
        if (vc6Var != null) {
            obj = vc6Var.b;
        } else {
            obj = null;
        }
        rj rjVar = (rj) obj;
        if (rjVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        vc6 vc6Var2 = (vc6) rjVar.R.get();
        if (vc6Var2 != null) {
            obj2 = vc6Var2.b;
        }
        if (((v63) obj2) != null && (!v63Var.e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object obj;
        Object obj2;
        gh4 gh4Var;
        int i;
        int i2;
        int i3;
        vc6 vc6Var = (vc6) this.i1.get();
        if (vc6Var != null) {
            obj = vc6Var.b;
        } else {
            obj = null;
        }
        rj rjVar = (rj) obj;
        if (rjVar == null) {
            r37 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (!legacyTextInputServiceAndroid.d) {
                return null;
            }
            l33 l33Var = legacyTextInputServiceAndroid.h;
            c37 c37Var = legacyTextInputServiceAndroid.g;
            int i4 = l33Var.e;
            boolean z = l33Var.a;
            if (i4 == 1) {
                if (!z) {
                    i = 0;
                    editorInfo.imeOptions = i;
                    i2 = l33Var.d;
                    if (i2 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i2 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i;
                    } else if (i2 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i2 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i2 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i2 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i2 == 7) {
                        editorInfo.inputType = 129;
                    } else if (i2 == 8) {
                        editorInfo.inputType = 18;
                    } else if (i2 == 9) {
                        editorInfo.inputType = 8194;
                    } else {
                        i.m("Invalid Keyboard Type");
                        return null;
                    }
                    if (!z) {
                        int i5 = editorInfo.inputType;
                        if ((i5 & 1) == 1) {
                            editorInfo.inputType = i5 | 131072;
                            if (i4 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i6 = l33Var.b;
                        if (i6 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i6 == 2) {
                            editorInfo.inputType = i3 | 8192;
                        } else if (i6 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (l33Var.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j = c37Var.b;
                    int i7 = k47.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    jw2.C(editorInfo, c37Var.a.B);
                    editorInfo.imeOptions |= 33554432;
                    if (ws1.d()) {
                        ws1.a().i(editorInfo);
                    }
                    kf5 kf5Var = new kf5(legacyTextInputServiceAndroid.g, new s35(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                    legacyTextInputServiceAndroid.i.add(new WeakReference(kf5Var));
                    return kf5Var;
                }
                i = 6;
                editorInfo.imeOptions = i;
                i2 = l33Var.d;
                if (i2 == 1) {
                }
                if (!z) {
                }
                i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                }
                long j2 = c37Var.b;
                int i72 = k47.c;
                editorInfo.initialSelStart = (int) (j2 >> 32);
                editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                jw2.C(editorInfo, c37Var.a.B);
                editorInfo.imeOptions |= 33554432;
                if (ws1.d()) {
                }
                kf5 kf5Var2 = new kf5(legacyTextInputServiceAndroid.g, new s35(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(kf5Var2));
                return kf5Var2;
            }
            if (i4 == 0) {
                i = 1;
            } else if (i4 == 2) {
                i = 2;
            } else if (i4 == 6) {
                i = 5;
            } else if (i4 == 5) {
                i = 7;
            } else if (i4 == 3) {
                i = 3;
            } else if (i4 == 4) {
                i = 4;
            } else {
                if (i4 != 7) {
                    i.m("invalid ImeAction");
                    return null;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            i2 = l33Var.d;
            if (i2 == 1) {
            }
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            long j22 = c37Var.b;
            int i722 = k47.c;
            editorInfo.initialSelStart = (int) (j22 >> 32);
            editorInfo.initialSelEnd = (int) (j22 & 4294967295L);
            jw2.C(editorInfo, c37Var.a.B);
            editorInfo.imeOptions |= 33554432;
            if (ws1.d()) {
            }
            kf5 kf5Var22 = new kf5(legacyTextInputServiceAndroid.g, new s35(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(kf5Var22));
            return kf5Var22;
        }
        vc6 vc6Var2 = (vc6) rjVar.R.get();
        if (vc6Var2 != null) {
            obj2 = vc6Var2.b;
        } else {
            obj2 = null;
        }
        v63 v63Var = (v63) obj2;
        if (v63Var == null) {
            return null;
        }
        synchronized (v63Var.c) {
            if (v63Var.e) {
                return null;
            }
            lf5 a = v63Var.a.a(editorInfo);
            mc mcVar = new mc(v63Var, 18);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                gh4Var = new gh4(a, mcVar);
            } else if (i8 >= 25) {
                gh4Var = new gh4(a, mcVar);
            } else {
                gh4Var = new gh4(a, mcVar);
            }
            v63Var.d.b(new WeakReference(gh4Var));
            return gh4Var;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        xa6 xa6Var;
        AutofillId autofillId;
        qf qfVar = this.z0;
        qfVar.getClass();
        for (long j : jArr) {
            za6 za6Var = (za6) qfVar.c().b((int) j);
            if (za6Var != null && (xa6Var = za6Var.a) != null) {
                ma.t();
                autofillId = qfVar.A.getAutofillId();
                ViewTranslationRequest.Builder l = ma.l(autofillId, xa6Var.f);
                Object g = xa6Var.d.A.g(bb6.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    ma.y(l, ma.j(new fp(ex3.a(62, null, "\n", list))));
                    consumer.accept(ma.m(l));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        eb ebVar;
        super.onDetachedFromWindow();
        setAttached(false);
        this.t0.onViewDetachedFromWindow(this);
        View view = this.k0;
        if (m() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            ca4 ca4Var = L1;
            synchronized (ca4Var) {
                ca4Var.j(this);
            }
        }
        getComposeViewContext().b();
        qm6 qm6Var = getSnapshotObserver().a;
        h61 h61Var = qm6Var.h;
        if (h61Var != null) {
            h61Var.d();
        }
        qm6Var.a();
        ut3 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.c(this.z0);
        lifecycle.c(this);
        if (d() && (ebVar = this.K0) != null) {
            iz izVar = iz.a;
            izVar.getClass();
            au.u((AutofillManager) ebVar.R, au.c(izVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        mu3 mu3Var = this.f0;
        if (mu3Var != null) {
            mu3Var.c = false;
        }
        this.f0 = null;
        if (i >= 31) {
            ef.a.a(this);
        }
        nd ndVar = this.L0;
        if (ndVar != null) {
            getSemanticsOwner().d.j(ndVar);
            ((eh2) getFocusOwner()).g.j(ndVar);
        }
        rf5 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        rf5 rectManager2 = getRectManager();
        fe feVar = rectManager2.h;
        if (feVar != null) {
            rectManager2.a.removeCallbacks(feVar);
            rectManager2.h = null;
        }
        ((eh2) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            eh2 eh2Var = (eh2) getFocusOwner();
            jx2.l(eh2Var.c, true);
            if (eh2Var.f() != null) {
                vh2 f = eh2Var.f();
                eh2Var.i(null);
                if (f != null) {
                    f.S0(sh2.Active, sh2.Inactive);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a1 = 0L;
        I();
        int i = Build.VERSION.SDK_INT;
        if (32 <= i && i < 34) {
            H(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.a1 = 0L;
            this.U0.l(this.B1);
            this.S0 = null;
            I();
            if (this.R0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a34 a34Var = this.U0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long f = f(i);
            long f2 = f(i2);
            long s = nb3.s((int) (f >>> 32), (int) (f & 4294967295L), (int) (f2 >>> 32), (int) (4294967295L & f2));
            q21 q21Var = this.S0;
            if (q21Var == null) {
                this.S0 = new q21(s);
                this.T0 = false;
            } else if (!q21.b(q21Var.a, s)) {
                this.T0 = true;
            }
            a34Var.s(s);
            a34Var.n();
            setMeasuredDimension(getRoot().C0.p.A, getRoot().C0.p.B);
            if (this.R0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().C0.p.A, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().C0.p.B, 1073741824));
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (d() && viewStructure != null) {
            nd ndVar = this.L0;
            if (ndVar != null) {
                sm3 sm3Var = ndVar.B.a;
                AutofillId autofillId = ndVar.Z;
                String str = ndVar.X;
                rf5 rf5Var = ndVar.R;
                kn2.V(viewStructure, sm3Var, autofillId, str, rf5Var);
                Object[] objArr = uh4.a;
                ca4 ca4Var = new ca4(2);
                ca4Var.a(sm3Var);
                ca4Var.a(viewStructure);
                while (ca4Var.i()) {
                    Object k = ca4Var.k(ca4Var.b - 1);
                    k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k;
                    Object k2 = ca4Var.k(ca4Var.b - 1);
                    k2.getClass();
                    aa4 aa4Var = (aa4) ((sm3) k2).n();
                    int i2 = ((ua4) aa4Var.B).L;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sm3 sm3Var2 = (sm3) aa4Var.get(i3);
                        if (!sm3Var2.K0 && sm3Var2.H() && sm3Var2.I()) {
                            ta6 x = sm3Var2.x();
                            if (x != null) {
                                ja4 ja4Var = x.A;
                                if (ja4Var.b(sa6.g) || ja4Var.b(sa6.h) || ja4Var.b(bb6.r) || ja4Var.b(bb6.s)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    kn2.V(newChild, sm3Var2, ndVar.Z, str, rf5Var);
                                    ca4Var.a(sm3Var2);
                                    ca4Var.a(newChild);
                                }
                            }
                            ca4Var.a(sm3Var2);
                            ca4Var.a(viewStructure2);
                        }
                    }
                }
            }
            eb ebVar = this.K0;
            if (ebVar != null) {
                mz mzVar = (mz) ebVar.L;
                LinkedHashMap linkedHashMap = mzVar.a;
                LinkedHashMap linkedHashMap2 = mzVar.a;
                if (!linkedHashMap.isEmpty()) {
                    int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() != null) {
                            u34.a();
                            return;
                        }
                        ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                        au.q(newChild2, (AutofillId) ebVar.X, intValue);
                        newChild2.setId(intValue, ((te) ebVar.B).getContext().getPackageName(), null, null);
                        au.p(newChild2, 1);
                        throw null;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        ty4 ty4Var;
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (ty4Var = ((pe) getPointerIconService()).a) != null)) {
            Context context = getContext();
            if (ty4Var instanceof sj) {
                return PointerIcon.getSystemIcon(context, ((sj) ty4Var).b);
            }
            return PointerIcon.getSystemIcon(context, 1000);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // defpackage.qe1
    public final void onResume(hu3 hu3Var) {
        tj0 tj0Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(g04.F());
        }
        mu3 mu3Var = this.f0;
        if (mu3Var != null) {
            lu3 lu3Var = this.e0;
            lu3Var.getClass();
            s63 s63Var = mu3Var.a;
            k04 k04Var = (k04) s63Var.B;
            if (k04Var.A && !k04Var.L) {
                try {
                    tj0Var = ((yx7) lu3Var).A.s(new pj(mu3Var, 12));
                } catch (CancellationException unused) {
                    k04 k04Var2 = (k04) s63Var.B;
                    if (!k04Var2.B) {
                        if (k04Var2.L) {
                            s05.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        k04Var2.a();
                        k04Var2.L = true;
                    }
                    tj0Var = null;
                }
                tj0 tj0Var2 = mu3Var.d;
                if (tj0Var2 != null) {
                    tj0Var2.cancel();
                }
                mu3Var.d = tj0Var;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        kk3 kk3Var;
        if (this.L) {
            int[] iArr = wg2.a;
            if (i != 0) {
                if (i != 1) {
                    kk3Var = null;
                } else {
                    kk3Var = kk3.Rtl;
                }
            } else {
                kk3Var = kk3.Ltr;
            }
            if (kk3Var == null) {
                kk3Var = kk3.Ltr;
            }
            setLayoutDirection(kk3Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [u9, f76] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        s35 s35Var;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (s35Var = this.F1) != null) {
            ab6 semanticsOwner = getSemanticsOwner();
            l61 coroutineContext = getCoroutineContext();
            ua4 ua4Var = new ua4(new g76[16]);
            jx2.S(semanticsOwner.a(), 0, new u9(1, 8, ua4.class, ua4Var, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(ua4Var.A, 0, ua4Var.L, new su0(new qn2[]{hh2.q0, hh2.r0}, 0));
            int i = ua4Var.L;
            if (i == 0) {
                obj = null;
            } else {
                obj = ua4Var.A[i - 1];
            }
            g76 g76Var = (g76) obj;
            if (g76Var != null) {
                m93 m93Var = g76Var.c;
                dx0 dx0Var = new dx0(g76Var.a, m93Var, g04.i(coroutineContext), s35Var, this);
                eg4 eg4Var = g76Var.d;
                of5 O = ej2.w(eg4Var).O(eg4Var, true);
                long b = m93Var.b();
                ScrollCaptureTarget j = ij5.j(this, ej2.Z(ln2.W(O)), new Point((int) (b >> 32), (int) (b & 4294967295L)), dx0Var);
                j.setScrollBounds(ej2.Z(m93Var));
                consumer.accept(j);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        I();
    }

    @Override // defpackage.qe1
    public final void onStop(hu3 hu3Var) {
        mu3 mu3Var = this.f0;
        if (mu3Var != null) {
            k04 k04Var = (k04) mu3Var.a.B;
            if (k04Var.A && !k04Var.L) {
                tj0 tj0Var = mu3Var.d;
                if (tj0Var != null) {
                    tj0Var.cancel();
                }
                mu3Var.d = null;
            } else if (!k04Var.B) {
                if (!k04Var.L) {
                    s05.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!k04Var.R.i()) {
                    s05.a("Attempted to start retaining exited values with pending exited values");
                }
                k04Var.L = false;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.o1.a.setValue(new w63(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        qf qfVar = this.z0;
        qfVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (nb3.k(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            ge7.x(qfVar, longSparseArray);
        } else {
            qfVar.A.post(new mf(0, qfVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean F;
        this.D1 = true;
        super.onWindowFocusChanged(z);
        if (z && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (F = g04.F())) {
            setShowLayoutBounds(F);
            k(getRoot());
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.r1) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final void q(float[] fArr) {
        z();
        v24.e(fArr, this.Y0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.c1 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.c1 & 4294967295L));
        float[] fArr2 = this.X0;
        v24.d(fArr2);
        v24.f(fArr2, intBitsToFloat, intBitsToFloat2);
        hf.g0(fArr, fArr2);
    }

    public final long r(long j) {
        z();
        long b = v24.b(j, this.Y0);
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.c1 >> 32)) + Float.intBitsToFloat((int) (b >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.c1 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        of5 of5Var;
        if (!isFocused()) {
            qg2 b = wg2.b(i);
            if (b != null) {
                i2 = b.a;
            } else {
                i2 = 7;
            }
            ah2 focusOwner = getFocusOwner();
            if (rect != null) {
                of5Var = new of5(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                of5Var = null;
            }
            Boolean e = ((eh2) focusOwner).e(i2, of5Var, new qe(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!nb3.k(e, bool)) {
                if (!nb3.k(((eh2) getFocusOwner()).e(i2, null, new qe(i2, 1)), bool)) {
                    if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                        return false;
                    }
                    return ((eh2) getFocusOwner()).h(i2);
                }
            }
        }
        return true;
    }

    public final void s(boolean z) {
        ke keVar;
        a34 a34Var = this.U0;
        if (!a34Var.b.O() && ((ua4) a34Var.e.B).L == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                keVar = this.B1;
            } finally {
                Trace.endSection();
            }
        } else {
            keVar = null;
        }
        if (a34Var.l(keVar)) {
            requestLayout();
        }
        a34Var.b(false);
        getRectManager().a();
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.y0.d0 = j;
    }

    public final void setComposeViewContext(mx0 mx0Var) {
        qn2 qn2Var;
        if (getCoroutineContext() != mx0Var.b.j() && !((aa4) getRoot().n()).isEmpty()) {
            p53.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            mx0 mx0Var2 = get_composeViewContext();
            if (mx0Var != mx0Var2) {
                if (isAttachedToWindow()) {
                    mx0Var2.b();
                    mx0Var.c();
                }
                set_composeViewContext(mx0Var);
                setCoroutineContext(mx0Var.b.j());
            }
        } finally {
            ln2.V(t, N, qn2Var);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.E1 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.I0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(qf qfVar) {
        this.z0 = qfVar;
    }

    public void setCoroutineContext(l61 l61Var) {
        this.m0 = l61Var;
    }

    public final void setFrameEndScheduler$ui(lu3 lu3Var) {
        this.e0 = lu3Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.a1 = j;
    }

    public final void setOnReadyForComposition(qn2 qn2Var) {
        getDerivedIsAttached();
        if (!isAttachedToWindow() && !this.E1) {
            this.f1 = qn2Var;
        } else {
            qn2Var.g(getComposeViewContext());
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui  reason: not valid java name */
    public final void m12setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(r43 r43Var) {
        this.R = r43Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.Q0 = z;
    }

    public void setUncaughtExceptionHandler(o16 o16Var) {
        this.U0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(sm3 sm3Var, long j) {
        a34 a34Var = this.U0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            a34Var.m(sm3Var, j);
            if (!a34Var.b.O()) {
                a34Var.b(false);
                getRectManager().a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void u() {
        ca4 ca4Var;
        nd ndVar;
        Object[] objArr;
        if (this.M0) {
            qm6 qm6Var = getSnapshotObserver().a;
            synchronized (qm6Var.g) {
                try {
                    ua4 ua4Var = qm6Var.f;
                    int i = ua4Var.L;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = ua4Var.A;
                        if (i2 >= i) {
                            break;
                        }
                        pm6 pm6Var = (pm6) objArr[i2];
                        pm6Var.d();
                        if (!pm6Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = ua4Var.A;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    ua4Var.L = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.M0 = false;
        }
        zm zmVar = this.R0;
        if (zmVar != null) {
            e(zmVar);
        }
        if (d() && (ndVar = this.L0) != null) {
            q94 q94Var = ndVar.d0;
            if (q94Var.d == 0 && ndVar.e0) {
                ((AutofillManager) ndVar.A.B).commit();
                ndVar.e0 = false;
            }
            if (q94Var.d != 0) {
                ndVar.e0 = true;
            }
        }
        while (this.u1.i() && this.u1.f(0) != null) {
            int i5 = this.u1.b;
            int i6 = 0;
            while (true) {
                ca4Var = this.u1;
                if (i6 < i5) {
                    on2 on2Var = (on2) ca4Var.f(i6);
                    this.u1.n(i6, null);
                    if (on2Var != null) {
                        on2Var.c();
                    }
                    i6++;
                }
            }
            ca4Var.l(0, i5);
        }
    }

    public final void v(sm3 sm3Var) {
        ze zeVar = this.y0;
        zeVar.t0 = true;
        if (zeVar.v()) {
            zeVar.w(sm3Var);
        }
        qf qfVar = this.z0;
        qfVar.Z = true;
        if (qfVar.d()) {
            qfVar.d0.c(jg7.a);
        }
    }

    public final void w(sm3 sm3Var, boolean z, boolean z2, boolean z3) {
        sm3 v;
        sm3 v2;
        a34 a34Var = this.U0;
        if (z) {
            bt btVar = a34Var.b;
            sm3 sm3Var2 = sm3Var.e0;
            wm3 wm3Var = sm3Var.C0;
            if (sm3Var2 == null) {
                p53.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int i = z24.a[wm3Var.d.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        if (!wm3Var.e || z2) {
                            wm3Var.e = true;
                            wm3Var.p.q0 = true;
                            if (!sm3Var.K0) {
                                if ((!nb3.k(sm3Var.J(), Boolean.TRUE) && !a34.i(sm3Var)) || ((v = sm3Var.v()) != null && v.C0.e)) {
                                    if ((sm3Var.I() || a34.j(sm3Var)) && ((v2 = sm3Var.v()) == null || !v2.q())) {
                                        btVar.y(sm3Var, wb3.Measurement);
                                    }
                                } else {
                                    btVar.y(sm3Var, wb3.LookaheadMeasurement);
                                }
                                if (!a34Var.d && z3) {
                                    C(sm3Var);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i.d();
                    return;
                }
                a34Var.h.b(new y24(sm3Var, true, z2));
            }
        } else if (a34Var.r(sm3Var, z2) && z3) {
            C(sm3Var);
        }
    }

    public final void x(sm3 sm3Var, boolean z, boolean z2) {
        boolean z3;
        wm3 wm3Var = sm3Var.C0;
        a34 a34Var = this.U0;
        if (z) {
            bt btVar = a34Var.b;
            int i = z24.a[wm3Var.d.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            i.d();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((!wm3Var.e && !wm3Var.f) || z2) {
                    wm3Var.f = true;
                    wm3Var.g = true;
                    d34 d34Var = wm3Var.p;
                    d34Var.r0 = true;
                    d34Var.s0 = true;
                    if (!sm3Var.K0) {
                        sm3 v = sm3Var.v();
                        if (nb3.k(sm3Var.J(), Boolean.TRUE) && ((v == null || !v.C0.e) && (v == null || !v.C0.f))) {
                            btVar.y(sm3Var, wb3.LookaheadPlacement);
                        } else if (sm3Var.I() && ((v == null || !v.p()) && (v == null || !v.q()))) {
                            btVar.y(sm3Var, wb3.Placement);
                        }
                        if (!a34Var.d) {
                            C(null);
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
        a34Var.getClass();
        int i2 = z24.a[wm3Var.d.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 == 5) {
                sm3 v2 = sm3Var.v();
                if (v2 != null && !v2.I()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2) {
                    if (!sm3Var.q()) {
                        if (sm3Var.p() && sm3Var.I() == z3 && sm3Var.I() == wm3Var.p.p0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                d34 d34Var2 = wm3Var.p;
                d34Var2.r0 = true;
                d34Var2.s0 = true;
                if (!sm3Var.K0 && d34Var2.p0 && z3) {
                    if ((v2 == null || !v2.p()) && (v2 == null || !v2.q())) {
                        a34Var.b.y(sm3Var, wb3.Placement);
                    }
                    if (!a34Var.d) {
                        C(null);
                        return;
                    }
                    return;
                }
                return;
            }
            i.d();
        }
    }

    public final void y() {
        ze zeVar = this.y0;
        zeVar.t0 = true;
        Handler handler = zeVar.R.getHandler();
        if (zeVar.v() && !zeVar.E0 && handler != null) {
            zeVar.E0 = true;
            handler.post(zeVar.G0);
        }
        qf qfVar = this.z0;
        qfVar.Z = true;
        Handler handler2 = qfVar.A.getHandler();
        if (qfVar.d() && !qfVar.i0 && handler2 != null) {
            qfVar.i0 = true;
            handler2.post(qfVar.j0);
        }
    }

    public final void z() {
        if (!this.b1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.a1) {
                this.a1 = currentAnimationTimeMillis;
                ab0 ab0Var = this.C1;
                float[] fArr = this.Y0;
                ab0Var.a(this, fArr);
                jx2.w(fArr, this.Z0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.W0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.c1 = (Float.floatToRawIntBits(iArr[0] - iArr[0]) << 32) | (Float.floatToRawIntBits(iArr[1] - iArr[1]) & 4294967295L);
            }
        }
    }

    public id getAccessibilityManager() {
        return this.A0;
    }

    /* renamed from: getClipboard */
    public ce m14getClipboard() {
        return this.O0;
    }

    /* renamed from: getClipboardManager */
    public de m15getClipboardManager() {
        return this.N0;
    }

    /* renamed from: getDragAndDropManager */
    public og m16getDragAndDropManager() {
        return this.n0;
    }

    public p94 getLayoutNodes() {
        return this.v0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @di1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations  reason: not valid java name */
    public static /* synthetic */ void m10getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @di1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    public p16 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(o16 o16Var) {
    }
}
