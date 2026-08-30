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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.translation.ViewTranslationRequest;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ee  reason: default package */
/* loaded from: classes.dex */
public final class ee extends ViewGroup implements wg4, vq5, ua1, lf4, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, hc2 {
    public static Class H1;
    public static Method I1;
    public static Method J1;
    public static final w14 K1 = new w14();
    public static rd L1;
    public static Method M1;
    public final tj4 A;
    public final lh A0;
    public final vd A1;
    public long B;
    public final xx B0;
    public final s80 B1;
    public final w14 C0;
    public boolean C1;
    public w14 D0;
    public boolean D1;
    public boolean E0;
    public final dz4 E1;
    public final pz3 F0;
    public View F1;
    public final c80 G0;
    public final ae G1;
    public final tj4 H0;
    public final ee1 I0;
    public final q9 J0;
    public final yc K0;
    public final boolean L;
    public boolean L0;
    public final od M0;
    public final nd N0;
    public final yg4 O0;
    public boolean P0;
    public nm Q0;
    public ny2 R;
    public lz0 R0;
    public boolean S0;
    public final pv3 T0;
    public long U0;
    public final int[] V0;
    public final float[] W0;
    public final float[] X0;
    public final float[] Y0;
    public long Z0;
    public boolean a1;
    public long b1;
    public final xf3 c0;
    public final tj4 c1;
    public jn3 d0;
    public final ee1 d1;
    public kn3 e0;
    public mi2 e1;
    public sc5 f0;
    public cr6 f1;
    public final xt g0;
    public zq6 g1;
    public final pd h0;
    public final AtomicReference h1;
    public final tj4 i0;
    public zc1 i1;
    public final View j0;
    public final nd2 j1;
    public final nc2 k0;
    public final k24 k1;
    public e31 l0;
    public final tj4 l1;
    public final ag m0;
    public final sp2 m1;
    public final yk3 n0;
    public final u03 n1;
    public final tj4 o0;
    public final az3 o1;
    public final ee1 p0;
    public final zl p1;
    public final sh0 q0;
    public MotionEvent q1;
    public final lm r0;
    public long r1;
    public final c23 s0;
    public final wv6 s1;
    public final vf3 t0;
    public final w14 t1;
    public final j14 u0;
    public float u1;
    public final b65 v0;
    public float v1;
    public final lz5 w0;
    public final es4 w1;
    public final ke x0;
    public final pd x1;
    public af y0;
    public boolean y1;
    public final uc z0;
    public final l40 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, c80] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, az3] */
    /* JADX WARN: Type inference failed for: r1v39, types: [zl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [yy3, sp1] */
    public ee(Context context, qu0 qu0Var) {
        super(context);
        q9 q9Var;
        yc ycVar;
        sd3 sd3Var;
        int i;
        s80 u80Var;
        ee eeVar = this;
        eeVar.A = me2.G(qu0Var);
        eeVar.B = 9205357640488583168L;
        eeVar.L = true;
        eeVar.c0 = qu0Var.r;
        eeVar.f0 = y60.s0;
        eeVar.g0 = new xt();
        eeVar.h0 = new pd(eeVar, 0);
        eeVar.i0 = new tj4(ct3.z(context), sn1.q0);
        eeVar.k0 = new nc2(eeVar, eeVar);
        eeVar.l0 = qu0Var.b.j();
        eeVar.m0 = new ag();
        eeVar.n0 = new yk3();
        eeVar.o0 = me2.G(Boolean.FALSE);
        eeVar.p0 = me2.q(new vd(eeVar, 0));
        eeVar.q0 = qu0Var.t;
        eeVar.r0 = qu0Var.q;
        eeVar.s0 = new c23();
        vf3 vf3Var = new vf3(3);
        vf3Var.c0(wq5.c);
        vf3Var.Z(eeVar.getDensity());
        vf3Var.e0(eeVar.getViewConfiguration());
        vf3Var.d0(new ce(eeVar).f(((nc2) eeVar.getFocusOwner()).e).f(eeVar.m6getDragAndDropManager().c));
        eeVar.t0 = vf3Var;
        j14 j14Var = z23.a;
        eeVar.u0 = new j14();
        eeVar.m7getLayoutNodes();
        eeVar.v0 = new b65(eeVar);
        eeVar.w0 = new lz5(eeVar.getRoot(), new yy3(), eeVar.m7getLayoutNodes());
        ke keVar = new ke(eeVar);
        eeVar.x0 = keVar;
        eeVar.y0 = new af(eeVar, new i4(0, eeVar, se.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 1));
        eeVar.z0 = qu0Var.j;
        eeVar.A0 = new lh(eeVar);
        eeVar.B0 = new xx();
        eeVar.C0 = new w14();
        eeVar.F0 = new pz3();
        vf3 root = eeVar.getRoot();
        ?? obj = new Object();
        obj.b = root;
        obj.c = new vr2((vz2) root.A0.d);
        obj.d = new ka3(25, (byte) 0);
        obj.e = new yr2();
        eeVar.G0 = obj;
        eeVar.H0 = me2.G(new Configuration(context.getResources().getConfiguration()));
        eeVar.I0 = me2.q(new vd(eeVar, 1));
        if (e()) {
            q9Var = new q9(eeVar, eeVar.getAutofillTree());
        } else {
            q9Var = null;
        }
        eeVar.J0 = q9Var;
        if (e()) {
            AutofillManager i2 = i2.i(context.getSystemService(i2.l()));
            if (i2 != null) {
                eeVar = this;
                ycVar = new yc(new ka3(23, i2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                throw b31.e("Autofill service could not be located.");
            }
        } else {
            ycVar = null;
        }
        eeVar.K0 = ycVar;
        eeVar.M0 = qu0Var.l;
        eeVar.N0 = qu0Var.m;
        eeVar.O0 = new yg4(new zd(eeVar, 1));
        eeVar.T0 = new pv3(eeVar.getRoot());
        eeVar.U0 = 9223372034707292159L;
        eeVar.V0 = new int[]{0, 0};
        float[] a = kv3.a();
        eeVar.W0 = a;
        eeVar.X0 = kv3.a();
        eeVar.Y0 = kv3.a();
        eeVar.Z0 = -1L;
        eeVar.b1 = 9187343241974906880L;
        eeVar.c1 = me2.G(null);
        eeVar.d1 = me2.q(new vd(eeVar, 3));
        eeVar.h1 = new AtomicReference(null);
        eeVar.j1 = qu0Var.n;
        eeVar.k1 = qu0Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = fc2.a;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                sd3Var = null;
            } else {
                sd3Var = sd3.Rtl;
            }
        } else {
            sd3Var = sd3.Ltr;
        }
        eeVar.l1 = me2.G(sd3Var == null ? sd3.Ltr : sd3Var);
        eeVar.m1 = qu0Var.p;
        if (eeVar.isInTouchMode()) {
            i = 1;
        } else {
            i = 2;
        }
        eeVar.n1 = new u03(i);
        ?? obj2 = new Object();
        new o24(new i00[16]);
        new o24(new b11[16]);
        new o24(new vf3[16]);
        new o24(new b11[16]);
        eeVar.o1 = obj2;
        ?? obj3 = new Object();
        new jo1(25, new dj(1, obj3));
        hs6 hs6Var = hs6.Shown;
        eeVar.p1 = obj3;
        eeVar.s1 = new wv6(6);
        eeVar.t1 = new w14();
        eeVar.w1 = new es4(1, eeVar);
        eeVar.x1 = new pd(eeVar, 1);
        eeVar.z1 = new l40(context, new zd(eeVar, 0));
        eeVar.A1 = new vd(eeVar, 2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29) {
            u80Var = new t80(a);
        } else {
            u80Var = new u80();
        }
        eeVar.B1 = u80Var;
        eeVar.addOnAttachStateChangeListener(eeVar.y0);
        eeVar.setWillNotDraw(false);
        eeVar.setFocusable(true);
        if (i3 >= 26) {
            re.a.a(eeVar, 1, false);
        }
        eeVar.setFocusableInTouchMode(true);
        eeVar.setClipChildren(false);
        aa7.n(eeVar, keVar);
        eeVar.setOnDragListener(eeVar.m6getDragAndDropManager());
        eeVar.getRoot().d(eeVar);
        if (i3 >= 29) {
            ne.a.a(eeVar);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            eeVar.j0 = view;
            eeVar.addView(view, -1);
        }
        eeVar.E1 = i3 >= 31 ? new dz4(4) : null;
        eeVar.G1 = new ae(eeVar);
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ee) {
                ((ee) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                f81.o();
                return 0L;
            }
            return 2147483647L;
        }
        return size;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.p0.getValue()).booleanValue();
    }

    private final cr6 getLegacyTextInputServiceAndroid() {
        cr6 cr6Var = this.f1;
        if (cr6Var == null) {
            cr6 cr6Var2 = new cr6(getView(), this);
            this.f1 = cr6Var2;
            return cr6Var2;
        }
        return cr6Var;
    }

    private final qu0 get_composeViewContext() {
        return (qu0) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ud get_viewTreeOwners() {
        ej6.j(this.c1.getValue());
        return null;
    }

    public static View h(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (b53.x(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View h = h(viewGroup.getChildAt(i2), i);
                    if (h != null) {
                        return h;
                    }
                }
            }
        }
        return null;
    }

    public static void k(vf3 vf3Var) {
        vf3Var.C();
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            k((vf3) objArr[i2]);
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
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Preference.DEFAULT_ORDER) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Preference.DEFAULT_ORDER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Preference.DEFAULT_ORDER) < 2139095040 && (Build.VERSION.SDK_INT < 29 || qz3.a.a(motionEvent, i))) {
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
        this.o0.setValue(Boolean.valueOf(z));
    }

    private void setDensity(od1 od1Var) {
        this.i0.setValue(od1Var);
    }

    private void setFontFamilyResolver(od2 od2Var) {
        this.k1.setValue(od2Var);
    }

    private void setLayoutDirection(sd3 sd3Var) {
        this.l1.setValue(sd3Var);
    }

    private final void set_composeViewContext(qu0 qu0Var) {
        this.A.setValue(qu0Var);
    }

    private final void set_viewTreeOwners(ud udVar) {
        this.c1.setValue(udVar);
    }

    public final void A(MotionEvent motionEvent) {
        this.Z0 = AnimationUtils.currentAnimationTimeMillis();
        s80 s80Var = this.B1;
        float[] fArr = this.X0;
        s80Var.a(this, fArr);
        nl2.N(fArr, this.Y0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = kv3.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        this.b1 = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(vf3 vf3Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (vf3Var != null) {
                while (vf3Var != null && vf3Var.r() == tf3.InMeasureBlock) {
                    if (!this.S0) {
                        vf3 u = vf3Var.u();
                        if (u == null) {
                            break;
                        }
                        long j = ((vz2) u.A0.d).R;
                        if (lz0.f(j) && lz0.e(j)) {
                            break;
                        }
                    }
                    vf3Var = vf3Var.u();
                }
                if (vf3Var == getRoot()) {
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
        return kv3.b((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.b1 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.b1 >> 32))) << 32), this.Y0);
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        if (this.C1) {
            this.C1 = false;
            yk3 yk3Var = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            yk3Var.getClass();
            ne7.a.setValue(new wp4(metaState));
        }
        pz3 pz3Var = this.F0;
        ci3 c = pz3Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        c80 c80Var = this.G0;
        if (c != null) {
            List list = (List) c.B;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (((tp4) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            obj = null;
            tp4 tp4Var = (tp4) obj;
            if (tp4Var != null) {
                this.B = tp4Var.d;
            }
            int b = c80Var.b(c, this, o(motionEvent));
            c.L = null;
            if ((actionMasked != 0 && actionMasked != 5) || (b & 1) != 0) {
                return b;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            pz3Var.c.delete(pointerId);
            pz3Var.b.delete(pointerId);
            return b;
        }
        if (!c80Var.a) {
            ((cs3) ((ka3) c80Var.d).B).a();
            ((vr2) c80Var.c).c();
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
        ci3 c = this.F0.c(obtain, this);
        c.getClass();
        this.G0.b(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p31 G(defpackage.aj2 r11, defpackage.k11 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.de
            if (r0 == 0) goto L13
            r0 = r12
            de r0 = (defpackage.de) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            de r0 = new de
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L2a:
            defpackage.me2.a0(r12)
            goto L4a
        L2e:
            defpackage.me2.a0(r12)
            zd r5 = new zd
            r12 = 2
            r5.<init>(r10, r12)
            r0.Y = r4
            qk5 r4 = new qk5
            r8 = 0
            r9 = 3
            java.util.concurrent.atomic.AtomicReference r6 = r10.h1
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.iq2.k(r4, r0)
            if (r10 != r1) goto L4a
            return r1
        L4a:
            defpackage.f81.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.G(aj2, k11):p31");
    }

    public final void H(Configuration configuration) {
        tj4 tj4Var;
        Configuration configuration2 = getConfiguration();
        if (!b53.x(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(ct3.z(getContext()));
            }
            if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (tj4Var = this.n0.b) != null) {
                tj4Var.setValue(b53.C(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.I():void");
    }

    public final void J(float f) {
        if (m()) {
            if (f > RecyclerView.A1) {
                if (Float.isNaN(this.u1) || f > this.u1) {
                    this.u1 = f;
                }
            } else if (f < RecyclerView.A1) {
                if (Float.isNaN(this.v1) || f < this.v1) {
                    this.v1 = f;
                }
            }
        }
    }

    @Override // defpackage.hc2
    public final void a(ed2 ed2Var, ed2 ed2Var2) {
        boolean z;
        zc0 zc0Var;
        boolean z2;
        zc0 zc0Var2;
        boolean z3;
        if (ed2Var != null) {
            ed2 ed2Var3 = ed2Var;
            if (!ed2Var3.A.i0) {
                mz2.c("visitAncestors called on an unattached node");
            }
            yy3 yy3Var = ed2Var3.A;
            vf3 P = l.P(ed2Var);
            e24 e24Var = null;
            ArrayList arrayList = null;
            while (P != null) {
                if ((((yy3) P.A0.g).R & 2097152) != 0) {
                    while (yy3Var != null) {
                        if ((yy3Var.L & 2097152) != 0) {
                            yy3 yy3Var2 = yy3Var;
                            o24 o24Var = null;
                            while (yy3Var2 != null) {
                                if (yy3Var2 instanceof wy2) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(yy3Var2);
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3 && (yy3Var2.L & 2097152) != 0 && (yy3Var2 instanceof xc1)) {
                                    int i = 0;
                                    for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                        if ((yy3Var3.L & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                yy3Var2 = yy3Var3;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var2 != null) {
                                                    o24Var.b(yy3Var2);
                                                    yy3Var2 = null;
                                                }
                                                o24Var.b(yy3Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                yy3Var2 = l.p(o24Var);
                            }
                        }
                        yy3Var = yy3Var.X;
                    }
                }
                P = P.u();
                if (P != null && (zc0Var2 = P.A0) != null) {
                    yy3Var = (lm6) zc0Var2.f;
                } else {
                    yy3Var = null;
                }
            }
            if (arrayList != null) {
                if (ed2Var2 != null) {
                    if (!ed2Var2.A.i0) {
                        mz2.c("visitAncestors called on an unattached node");
                    }
                    yy3 yy3Var4 = ed2Var2.A;
                    vf3 P2 = l.P(ed2Var2);
                    e24 e24Var2 = null;
                    while (P2 != null) {
                        if ((((yy3) P2.A0.g).R & 2097152) != 0) {
                            while (yy3Var4 != null) {
                                if ((yy3Var4.L & 2097152) != 0) {
                                    yy3 yy3Var5 = yy3Var4;
                                    o24 o24Var2 = null;
                                    while (yy3Var5 != null) {
                                        if (yy3Var5 instanceof wy2) {
                                            if (e24Var2 == null) {
                                                e24 e24Var3 = xu5.a;
                                                e24Var2 = new e24();
                                            }
                                            e24Var2.a(yy3Var5);
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2 && (yy3Var5.L & 2097152) != 0 && (yy3Var5 instanceof xc1)) {
                                            int i2 = 0;
                                            for (yy3 yy3Var6 = ((xc1) yy3Var5).k0; yy3Var6 != null; yy3Var6 = yy3Var6.Y) {
                                                if ((yy3Var6.L & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        yy3Var5 = yy3Var6;
                                                    } else {
                                                        if (o24Var2 == null) {
                                                            o24Var2 = new o24(new yy3[16]);
                                                        }
                                                        if (yy3Var5 != null) {
                                                            o24Var2.b(yy3Var5);
                                                            yy3Var5 = null;
                                                        }
                                                        o24Var2.b(yy3Var6);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        yy3Var5 = l.p(o24Var2);
                                    }
                                }
                                yy3Var4 = yy3Var4.X;
                            }
                        }
                        P2 = P2.u();
                        if (P2 != null && (zc0Var = P2.A0) != null) {
                            yy3Var4 = (lm6) zc0Var.f;
                        } else {
                            yy3Var4 = null;
                        }
                    }
                    e24Var = e24Var2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    wy2 wy2Var = (wy2) arrayList.get(i3);
                    if (e24Var != null) {
                        z = e24Var.c(wy2Var);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        wy2Var.E();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ed2 ed2Var = ((nc2) getFocusOwner()).c;
        if (ed2Var.i0) {
            if (!ed2Var.A.i0) {
                mz2.c("visitSubtreeIf called on an unattached node");
            }
            o24 o24Var = new o24(new yy3[16]);
            yy3 yy3Var = ed2Var.A;
            yy3 yy3Var2 = yy3Var.Y;
            if (yy3Var2 == null) {
                l.l(o24Var, yy3Var);
            } else {
                o24Var.b(yy3Var2);
            }
            while (true) {
                int i3 = o24Var.L;
                if (i3 != 0) {
                    yy3 yy3Var3 = (yy3) o24Var.l(i3 - 1);
                    if ((yy3Var3.R & 1024) != 0) {
                        for (yy3 yy3Var4 = yy3Var3; yy3Var4 != null && yy3Var4.i0; yy3Var4 = yy3Var4.Y) {
                            if ((yy3Var4.L & 1024) != 0) {
                                yy3 yy3Var5 = yy3Var4;
                                o24 o24Var2 = null;
                                while (yy3Var5 != null) {
                                    int i4 = 0;
                                    if (yy3Var5 instanceof ed2) {
                                        ed2 ed2Var2 = (ed2) yy3Var5;
                                        if (ed2Var2.i0 && ed2Var2.T0().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            ed2 ed2Var3 = ((nc2) getFocusOwner()).c;
                                            if (ed2Var3.i0) {
                                                if (!ed2Var3.A.i0) {
                                                    mz2.c("visitSubtreeIf called on an unattached node");
                                                }
                                                o24 o24Var3 = new o24(new yy3[16]);
                                                yy3 yy3Var6 = ed2Var3.A;
                                                yy3 yy3Var7 = yy3Var6.Y;
                                                if (yy3Var7 == null) {
                                                    l.l(o24Var3, yy3Var6);
                                                } else {
                                                    o24Var3.b(yy3Var7);
                                                }
                                                while (true) {
                                                    int i5 = o24Var3.L;
                                                    if (i5 == 0) {
                                                        break;
                                                    }
                                                    yy3 yy3Var8 = (yy3) o24Var3.l(i5 - 1);
                                                    if ((yy3Var8.R & 1024) != 0) {
                                                        for (yy3 yy3Var9 = yy3Var8; yy3Var9 != null && yy3Var9.i0; yy3Var9 = yy3Var9.Y) {
                                                            if ((yy3Var9.L & 1024) != 0) {
                                                                yy3 yy3Var10 = yy3Var9;
                                                                o24 o24Var4 = null;
                                                                while (yy3Var10 != null) {
                                                                    if (yy3Var10 instanceof ed2) {
                                                                        ed2 ed2Var4 = (ed2) yy3Var10;
                                                                        if (ed2Var4.i0) {
                                                                            rc2 T0 = ed2Var4.T0();
                                                                            if (ed2Var4.i0 && T0.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((yy3Var10.L & 1024) != 0 && (yy3Var10 instanceof xc1)) {
                                                                        int i6 = 0;
                                                                        for (yy3 yy3Var11 = ((xc1) yy3Var10).k0; yy3Var11 != null; yy3Var11 = yy3Var11.Y) {
                                                                            if ((yy3Var11.L & 1024) != 0) {
                                                                                i6++;
                                                                                if (i6 == 1) {
                                                                                    yy3Var10 = yy3Var11;
                                                                                } else {
                                                                                    if (o24Var4 == null) {
                                                                                        o24Var4 = new o24(new yy3[16]);
                                                                                    }
                                                                                    if (yy3Var10 != null) {
                                                                                        o24Var4.b(yy3Var10);
                                                                                        yy3Var10 = null;
                                                                                    }
                                                                                    o24Var4.b(yy3Var11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i6 == 1) {
                                                                        }
                                                                    }
                                                                    yy3Var10 = l.p(o24Var4);
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    l.l(o24Var3, yy3Var8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((yy3Var5.L & 1024) != 0 && (yy3Var5 instanceof xc1)) {
                                        for (yy3 yy3Var12 = ((xc1) yy3Var5).k0; yy3Var12 != null; yy3Var12 = yy3Var12.Y) {
                                            if ((yy3Var12.L & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    yy3Var5 = yy3Var12;
                                                } else {
                                                    if (o24Var2 == null) {
                                                        o24Var2 = new o24(new yy3[16]);
                                                    }
                                                    if (yy3Var5 != null) {
                                                        o24Var2.b(yy3Var5);
                                                        yy3Var5 = null;
                                                    }
                                                    o24Var2.b(yy3Var12);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    yy3Var5 = l.p(o24Var2);
                                }
                                continue;
                            }
                        }
                    }
                    l.l(o24Var, yy3Var3);
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
        ez5 w;
        mi2 mi2Var;
        mi2 mi2Var2;
        CharSequence textValue2;
        if (e()) {
            yc ycVar = this.K0;
            if (ycVar != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue j = i2.j(sparseArray.get(keyAt));
                    vf3 vf3Var = (vf3) ycVar.B.c.b(keyAt);
                    if (vf3Var != null && (w = vf3Var.w()) != null) {
                        d24 d24Var = w.A;
                        Object g = d24Var.g(dz5.g);
                        w1 w1Var = null;
                        if (g == null) {
                            g = null;
                        }
                        w1 w1Var2 = (w1) g;
                        if (w1Var2 != null && (mi2Var2 = (mi2) w1Var2.b) != null) {
                            textValue2 = j.getTextValue();
                            Boolean bool = (Boolean) mi2Var2.n(new to(textValue2.toString()));
                        }
                        Object g2 = d24Var.g(dz5.h);
                        if (g2 != null) {
                            w1Var = g2;
                        }
                        w1 w1Var3 = w1Var;
                        if (w1Var3 != null && (mi2Var = (mi2) w1Var3.b) != null) {
                            Boolean bool2 = (Boolean) mi2Var.n(new ch(j));
                        }
                    }
                }
            }
            q9 q9Var = this.J0;
            if (q9Var != null) {
                xx xxVar = (xx) q9Var.L;
                if (!xxVar.a.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        int keyAt2 = sparseArray.keyAt(i2);
                        AutofillValue j2 = i2.j(sparseArray.get(keyAt2));
                        isText = j2.isText();
                        if (isText) {
                            textValue = j2.getTextValue();
                            textValue.toString();
                            if (xxVar.a.get(Integer.valueOf(keyAt2)) != null) {
                                c44.b();
                                return;
                            }
                        } else if (!rx.A(j2)) {
                            if (!rx.D(j2)) {
                                if (rx.C(j2)) {
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
        return this.x0.m(false, i, this.B);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.x0.m(true, i, this.B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w14 w14Var = this.C0;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        s(true);
        ma6.j().m();
        this.E0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            sh0 sh0Var = this.q0;
            id idVar = sh0Var.a;
            Canvas canvas2 = idVar.a;
            idVar.a = canvas;
            getRoot().i(idVar, null);
            sh0Var.a.a = canvas2;
            if (w14Var.i()) {
                int i = w14Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((tn2) ((vg4) w14Var.f(i2))).g();
                }
            }
            int i3 = na7.A;
            w14Var.d();
            this.E0 = false;
            Trace.endSection();
            w14 w14Var2 = this.D0;
            if (w14Var2 != null) {
                w14Var.b(w14Var2);
                w14Var2.d();
            }
            if (m()) {
                mp.a(this, this.u1);
                View view = this.j0;
                if (view != null) {
                    mp.a(view, this.v1);
                    if (!Float.isNaN(this.v1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.u1 = Float.NaN;
                this.v1 = Float.NaN;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
        if (p(r24) == false) goto L68;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            yk3 yk3Var = getComposeViewContext().s;
            int metaState = keyEvent.getMetaState();
            yk3Var.getClass();
            ne7.a.setValue(new wp4(metaState));
            if (!((nc2) getFocusOwner()).d(keyEvent, mv0.f0) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((nc2) getFocusOwner()).d(keyEvent, new wd(0, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        zc0 zc0Var;
        if (isFocused()) {
            nc2 nc2Var = (nc2) getFocusOwner();
            if (nc2Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ed2 b = ii7.b(nc2Var.c);
                if (b != null) {
                    if (!b.A.i0) {
                        mz2.c("visitAncestors called on an unattached node");
                    }
                    yy3 yy3Var = b.A;
                    vf3 P = l.P(b);
                    while (P != null) {
                        if ((((yy3) P.A0.g).R & 131072) != 0) {
                            while (yy3Var != null) {
                                if ((yy3Var.L & 131072) != 0) {
                                    yy3 yy3Var2 = yy3Var;
                                    o24 o24Var = null;
                                    while (yy3Var2 != null) {
                                        if ((yy3Var2.L & 131072) != 0 && (yy3Var2 instanceof xc1)) {
                                            int i = 0;
                                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                                if ((yy3Var3.L & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        yy3Var2 = yy3Var3;
                                                    } else {
                                                        if (o24Var == null) {
                                                            o24Var = new o24(new yy3[16]);
                                                        }
                                                        if (yy3Var2 != null) {
                                                            o24Var.b(yy3Var2);
                                                            yy3Var2 = null;
                                                        }
                                                        o24Var.b(yy3Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        yy3Var2 = l.p(o24Var);
                                    }
                                }
                                yy3Var = yy3Var.X;
                            }
                        }
                        P = P.u();
                        if (P != null && (zc0Var = P.A0) != null) {
                            yy3Var = (lm6) zc0Var.f;
                        } else {
                            yy3Var = null;
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
            me.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view;
        Object lwVar;
        ed2 f;
        if (this.y1) {
            pd pdVar = this.x1;
            removeCallbacks(pdVar);
            MotionEvent motionEvent2 = this.q1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.y1 = false;
            } else {
                pdVar.run();
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
                if (view == null || (lwVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    lwVar = new lw(1);
                }
                if (lwVar.equals(new lw(1)) && (f = ((nc2) getFocusOwner()).f()) != null) {
                    m74 O = l.O(f);
                    if (!me2.s(O).L(O, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((nc2) getFocusOwner()).b(8, false, true);
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
            return h(this, i);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, n75] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null && !this.T0.c) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
            y55 y55Var = null;
            if (findNextFocus != null && !findNextFocus.equals(this)) {
                for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
            }
            findNextFocus = null;
            if (view == this) {
                ed2 b = ii7.b(((nc2) getFocusOwner()).c);
                if (b != null) {
                    y55Var = ii7.c(b);
                }
                if (y55Var == null) {
                    y55Var = fc2.a(view, this);
                }
            } else {
                y55Var = fc2.a(view, this);
            }
            zb2 b2 = fc2.b(i);
            if (b2 != null) {
                i2 = b2.a;
            } else {
                i2 = 6;
            }
            ?? obj = new Object();
            if (((nc2) getFocusOwner()).e(i2, y55Var, new xd(0, obj)) == null) {
                return view;
            }
            Object obj2 = obj.A;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i);
                }
            } else if (findNextFocus == null || i2 == 1 || i2 == 2 || mj2.F(ii7.c((ed2) obj2), fc2.a(findNextFocus, this), y55Var, i2)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final nm getAndroidViewsHandler$ui() {
        if (this.Q0 == null) {
            nm nmVar = new nm(getContext());
            this.Q0 = nmVar;
            addView(nmVar, -1);
            requestLayout();
        }
        nm nmVar2 = this.Q0;
        nmVar2.getClass();
        return nmVar2;
    }

    public qx getAutofill() {
        return this.J0;
    }

    public wx getAutofillManager() {
        return this.K0;
    }

    public xx getAutofillTree() {
        return this.B0;
    }

    public final qu0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.D1;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.H0.getValue();
    }

    public final af getContentCaptureManager$ui() {
        return this.y0;
    }

    public e31 getCoroutineContext() {
        return this.l0;
    }

    public od1 getDensity() {
        return (od1) this.i0.getValue();
    }

    public y55 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ed2 b = ii7.b(((nc2) getFocusOwner()).c);
            if (b == null) {
                return null;
            }
            return ii7.c(b);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return fc2.a(findFocus, this);
    }

    public jc2 getFocusOwner() {
        return this.k0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        y55 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (!b53.x(((nc2) getFocusOwner()).e(6, null, yd.L), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public od2 getFontFamilyResolver() {
        return (od2) this.k1.getValue();
    }

    public nd2 getFontLoader() {
        return this.j1;
    }

    public final jn3 getFrameEndScheduler$ui() {
        return this.d0;
    }

    public on2 getGraphicsContext() {
        return this.A0;
    }

    public sp2 getHapticFeedBack() {
        return this.m1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!this.T0.b.I() && this.g0.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public t03 getInputModeManager() {
        return this.n1;
    }

    public final c23 getInsetsListener() {
        return this.s0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.Z0;
    }

    @Override // android.view.View, android.view.ViewParent
    public sd3 getLayoutDirection() {
        return (sd3) this.l1.getValue();
    }

    public fr3 getLocaleList() {
        return (fr3) this.I0.getValue();
    }

    public long getMeasureIteration() {
        pv3 pv3Var = this.T0;
        if (!pv3Var.c) {
            mz2.a("measureIteration should be only used during the measure/layout pass");
        }
        return pv3Var.g;
    }

    public az3 getModifierLocalManager() {
        return this.o1;
    }

    /* renamed from: getOutOfFrameExecutor */
    public ee m8getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public xn4 getPlacementScope() {
        int i = zn4.b;
        return new gs3(1, this);
    }

    public qp4 getPointerIconService() {
        return this.G1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui  reason: not valid java name */
    public final ny2 m1getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.R;
    }

    public b65 getRectManager() {
        return this.v0;
    }

    public sc5 getRetainedValuesStore() {
        return this.f0;
    }

    public vf3 getRoot() {
        return this.t0;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        dz4 dz4Var;
        if (Build.VERSION.SDK_INT >= 31 && (dz4Var = this.E1) != null) {
            return ((Boolean) ((tj4) dz4Var.A).getValue()).booleanValue();
        }
        return false;
    }

    public lz5 getSemanticsOwner() {
        return this.w0;
    }

    public xf3 getSharedDrawScope() {
        return this.c0;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return hp.a.a(this);
        }
        return this.P0;
    }

    public yg4 getSnapshotObserver() {
        return this.O0;
    }

    public ib6 getSoftwareKeyboardController() {
        zc1 zc1Var = this.i1;
        if (zc1Var == null) {
            zc1 zc1Var2 = new zc1(getTextInputService());
            this.i1 = zc1Var2;
            return zc1Var2;
        }
        return zc1Var;
    }

    public zq6 getTextInputService() {
        zq6 zq6Var = this.g1;
        if (zq6Var == null) {
            zq6 zq6Var2 = new zq6(getLegacyTextInputServiceAndroid());
            this.g1 = zq6Var2;
            return zq6Var2;
        }
        return zq6Var;
    }

    public fs6 getTextToolbar() {
        return this.p1;
    }

    public final uq5 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public fa7 getViewConfiguration() {
        return this.r0;
    }

    public final ud getViewTreeOwners() {
        ej6.j(this.d1.getValue());
        return null;
    }

    public me7 getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final yc get_autofillManager$ui() {
        return this.K0;
    }

    public final void i(vf3 vf3Var, boolean z) {
        this.T0.g(vf3Var, z);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.j(android.view.MotionEvent):int");
    }

    public final void l(vf3 vf3Var) {
        this.T0.r(vf3Var, false);
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            l((vf3) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (RecyclerView.A1 <= x && x <= getWidth() && RecyclerView.A1 <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, xa7] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        sc5 sc5Var;
        kn3 kn3Var;
        q9 q9Var;
        Method method;
        super.onAttachedToWindow();
        int i = 1;
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(n40.J());
        }
        this.s0.onViewAttachedToWindow(this);
        int i3 = 0;
        if (i2 > 28) {
            if (L1 == null) {
                rd rdVar = new rd(0);
                L1 = rdVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (H1 == null) {
                        H1 = Class.forName("android.os.SystemProperties");
                    }
                    if (J1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = H1;
                        if (cls != null) {
                            method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                        } else {
                            method = null;
                        }
                        J1 = method;
                    }
                    Method method2 = J1;
                    if (method2 != null) {
                        method2.invoke(null, rdVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            w14 w14Var = K1;
            synchronized (w14Var) {
                w14Var.a(this);
            }
        }
        if (!this.D1) {
            getComposeViewContext().c();
        }
        this.D1 = false;
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.e();
        if (e() && (q9Var = this.J0) != null) {
            tx txVar = tx.a;
            txVar.getClass();
            rx.B((AutofillManager) q9Var.R, rx.c(txVar));
        }
        fn3 fn3Var = getComposeViewContext().c;
        ab7 ab7Var = getComposeViewContext().e;
        jn3 jn3Var = this.d0;
        if (fn3Var != null && ab7Var != null && jn3Var != null) {
            za7 viewModelStore = ab7Var.getViewModelStore();
            ?? obj = new Object();
            x31 x31Var = x31.b;
            viewModelStore.getClass();
            x31Var.getClass();
            q9 q9Var2 = new q9(viewModelStore, (xa7) obj, x31Var);
            qo0 a = q75.a(ln3.class);
            String b = a.b();
            if (b != null) {
                ViewParent parent = getParent();
                parent.getClass();
                int id = ((View) parent).getId();
                j14 j14Var = ((ln3) q9Var2.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                Object b2 = j14Var.b(id);
                if (b2 == null) {
                    b2 = new w14(1);
                    j14Var.i(id, b2);
                }
                w14 w14Var2 = (w14) b2;
                Object[] objArr = w14Var2.a;
                int i4 = w14Var2.b;
                while (true) {
                    if (i3 < i4) {
                        kn3Var = objArr[i3];
                        if (!((kn3) kn3Var).c) {
                            break;
                        }
                        i3++;
                    } else {
                        kn3Var = null;
                        break;
                    }
                }
                kn3 kn3Var2 = kn3Var;
                if (kn3Var2 == null) {
                    kn3Var2 = new kn3();
                    w14Var2.a(kn3Var2);
                }
                kn3Var2.c = true;
                this.e0 = kn3Var2;
                sc5Var = kn3Var2.b;
            } else {
                i.i("Local and anonymous classes can not be ViewModels");
                return;
            }
        } else {
            sc5Var = null;
        }
        if (sc5Var == null) {
            sc5Var = y60.s0;
        }
        this.f0 = sc5Var;
        mi2 mi2Var = this.e1;
        if (mi2Var != null) {
            mi2Var.n(getComposeViewContext());
            this.e1 = null;
        }
        rm3 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.y0);
        u03 u03Var = this.n1;
        if (!isInTouchMode()) {
            i = 2;
        }
        u03Var.a.setValue(new s03(i));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            pe.a.b(this);
        }
        yc ycVar = this.K0;
        if (ycVar != null) {
            ((nc2) getFocusOwner()).g.a(ycVar);
            getSemanticsOwner().d.a(ycVar);
        }
        ((nc2) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        r03 r03Var;
        h16 h16Var = (h16) this.h1.get();
        Object obj2 = null;
        if (h16Var != null) {
            obj = h16Var.b;
        } else {
            obj = null;
        }
        fj fjVar = (fj) obj;
        if (fjVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        h16 h16Var2 = (h16) fjVar.R.get();
        if (h16Var2 != null) {
            obj2 = h16Var2.b;
        }
        if (((r03) obj2) != null && (!r03Var.e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        iz5 iz5Var;
        AutofillId autofillId;
        af afVar = this.y0;
        afVar.getClass();
        for (long j : jArr) {
            kz5 kz5Var = (kz5) afVar.c().b((int) j);
            if (kz5Var != null && (iz5Var = kz5Var.a) != null) {
                dd.t();
                autofillId = afVar.A.getAutofillId();
                ViewTranslationRequest.Builder m = dd.m(autofillId, iz5Var.f);
                Object g = iz5Var.d.A.g(mz5.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    dd.y(m, dd.k(new to(dq3.a(62, null, "\n", list))));
                    consumer.accept(dd.n(m));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q9 q9Var;
        super.onDetachedFromWindow();
        setAttached(false);
        this.s0.onViewDetachedFromWindow(this);
        View view = this.j0;
        if (m() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            w14 w14Var = K1;
            synchronized (w14Var) {
                w14Var.j(this);
            }
        }
        getComposeViewContext().b();
        bb6 bb6Var = getSnapshotObserver().a;
        a31 a31Var = bb6Var.h;
        if (a31Var != null) {
            a31Var.g();
        }
        bb6Var.a();
        rm3 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.c(this.y0);
        lifecycle.c(this);
        if (e() && (q9Var = this.J0) != null) {
            tx txVar = tx.a;
            txVar.getClass();
            rx.u((AutofillManager) q9Var.R, rx.c(txVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        kn3 kn3Var = this.e0;
        if (kn3Var != null) {
            kn3Var.c = false;
        }
        this.e0 = null;
        if (i >= 31) {
            pe.a.a(this);
        }
        yc ycVar = this.K0;
        if (ycVar != null) {
            getSemanticsOwner().d.j(ycVar);
            ((nc2) getFocusOwner()).g.j(ycVar);
        }
        b65 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        b65 rectManager2 = getRectManager();
        qd qdVar = rectManager2.h;
        if (qdVar != null) {
            rectManager2.a.removeCallbacks(qdVar);
            rectManager2.h = null;
        }
        ((nc2) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            nc2 nc2Var = (nc2) getFocusOwner();
            ei7.a(nc2Var.c, true);
            if (nc2Var.f() != null) {
                ed2 f = nc2Var.f();
                nc2Var.i(null);
                if (f != null) {
                    f.S0(bd2.Active, bd2.Inactive);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.Z0 = 0L;
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
            this.Z0 = 0L;
            this.T0.l(this.A1);
            this.R0 = null;
            I();
            if (this.Q0 != null) {
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
        pv3 pv3Var = this.T0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long g = g(i);
            long g2 = g(i2);
            long l = w81.l((int) (g >>> 32), (int) (g & 4294967295L), (int) (g2 >>> 32), (int) (4294967295L & g2));
            lz0 lz0Var = this.R0;
            if (lz0Var == null) {
                this.R0 = new lz0(l);
                this.S0 = false;
            } else if (!lz0.b(lz0Var.a, l)) {
                this.S0 = true;
            }
            pv3Var.s(l);
            pv3Var.n();
            setMeasuredDimension(getRoot().B0.p.A, getRoot().B0.p.B);
            if (this.Q0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().B0.p.A, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().B0.p.B, 1073741824));
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (e() && viewStructure != null) {
            yc ycVar = this.K0;
            if (ycVar != null) {
                vf3 vf3Var = ycVar.B.a;
                AutofillId autofillId = ycVar.Z;
                String str = ycVar.X;
                b65 b65Var = ycVar.R;
                hk2.L(viewStructure, vf3Var, autofillId, str, b65Var);
                Object[] objArr = b94.a;
                w14 w14Var = new w14(2);
                w14Var.a(vf3Var);
                w14Var.a(viewStructure);
                while (w14Var.i()) {
                    Object k = w14Var.k(w14Var.b - 1);
                    k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k;
                    Object k2 = w14Var.k(w14Var.b - 1);
                    k2.getClass();
                    u14 u14Var = (u14) ((vf3) k2).n();
                    int i2 = ((o24) u14Var.B).L;
                    for (int i3 = 0; i3 < i2; i3++) {
                        vf3 vf3Var2 = (vf3) u14Var.get(i3);
                        if (!vf3Var2.J0 && vf3Var2.H() && vf3Var2.I()) {
                            ez5 w = vf3Var2.w();
                            if (w != null) {
                                d24 d24Var = w.A;
                                if (d24Var.b(dz5.g) || d24Var.b(dz5.h) || d24Var.b(mz5.r) || d24Var.b(mz5.s)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    hk2.L(newChild, vf3Var2, ycVar.Z, str, b65Var);
                                    w14Var.a(vf3Var2);
                                    w14Var.a(newChild);
                                }
                            }
                            w14Var.a(vf3Var2);
                            w14Var.a(viewStructure2);
                        }
                    }
                }
            }
            q9 q9Var = this.J0;
            if (q9Var != null) {
                xx xxVar = (xx) q9Var.L;
                LinkedHashMap linkedHashMap = xxVar.a;
                LinkedHashMap linkedHashMap2 = xxVar.a;
                if (!linkedHashMap.isEmpty()) {
                    int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() != null) {
                            c44.b();
                            return;
                        }
                        ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                        rx.q(newChild2, (AutofillId) q9Var.X, intValue);
                        newChild2.setId(intValue, ((ee) q9Var.B).getContext().getPackageName(), null, null);
                        rx.p(newChild2, 1);
                        throw null;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        pp4 pp4Var;
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (pp4Var = ((ae) getPointerIconService()).a) != null)) {
            Context context = getContext();
            if (pp4Var instanceof gj) {
                return PointerIcon.getSystemIcon(context, ((gj) pp4Var).b);
            }
            return PointerIcon.getSystemIcon(context, 1000);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // defpackage.ua1
    public final void onResume(fn3 fn3Var) {
        kh0 kh0Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(n40.J());
        }
        kn3 kn3Var = this.e0;
        if (kn3Var != null) {
            jn3 jn3Var = this.d0;
            jn3Var.getClass();
            ka3 ka3Var = kn3Var.a;
            ht3 ht3Var = (ht3) ka3Var.B;
            if (ht3Var.A && !ht3Var.L) {
                try {
                    kh0Var = ((bj7) jn3Var).A.s(new dj(12, kn3Var));
                } catch (CancellationException unused) {
                    ht3 ht3Var2 = (ht3) ka3Var.B;
                    if (!ht3Var2.B) {
                        if (ht3Var2.L) {
                            pr4.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        ht3Var2.a();
                        ht3Var2.L = true;
                    }
                    kh0Var = null;
                }
                kh0 kh0Var2 = kn3Var.d;
                if (kh0Var2 != null) {
                    kh0Var2.cancel();
                }
                kn3Var.d = kh0Var;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        sd3 sd3Var;
        if (this.L) {
            int[] iArr = fc2.a;
            if (i != 0) {
                if (i != 1) {
                    sd3Var = null;
                } else {
                    sd3Var = sd3.Rtl;
                }
            } else {
                sd3Var = sd3.Ltr;
            }
            if (sd3Var == null) {
                sd3Var = sd3.Ltr;
            }
            setLayoutDirection(sd3Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [sv5, t9] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        dz4 dz4Var;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (dz4Var = this.E1) != null) {
            lz5 semanticsOwner = getSemanticsOwner();
            e31 coroutineContext = getCoroutineContext();
            o24 o24Var = new o24(new tv5[16]);
            ep2.J(semanticsOwner.a(), 0, new t9(1, 8, o24.class, o24Var, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(o24Var.A, 0, o24Var.L, new fs0(0, new mi2[]{qc2.o0, qc2.p0}));
            int i = o24Var.L;
            if (i == 0) {
                obj = null;
            } else {
                obj = o24Var.A[i - 1];
            }
            tv5 tv5Var = (tv5) obj;
            if (tv5Var != null) {
                e33 e33Var = tv5Var.c;
                hu0 hu0Var = new hu0(tv5Var.a, e33Var, iq2.c(coroutineContext), dz4Var, this);
                m74 m74Var = tv5Var.d;
                y55 L = me2.s(m74Var).L(m74Var, true);
                long b = e33Var.b();
                ScrollCaptureTarget h = dr5.h(this, ve2.T(gk2.e0(L)), new Point((int) (b >> 32), (int) (b & 4294967295L)), hu0Var);
                h.setScrollBounds(ve2.T(e33Var));
                consumer.accept(h);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        I();
    }

    @Override // defpackage.ua1
    public final void onStop(fn3 fn3Var) {
        kn3 kn3Var = this.e0;
        if (kn3Var != null) {
            ht3 ht3Var = (ht3) kn3Var.a.B;
            if (ht3Var.A && !ht3Var.L) {
                kh0 kh0Var = kn3Var.d;
                if (kh0Var != null) {
                    kh0Var.cancel();
                }
                kn3Var.d = null;
            } else if (!ht3Var.B) {
                if (!ht3Var.L) {
                    pr4.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!ht3Var.R.i()) {
                    pr4.a("Attempted to start retaining exited values with pending exited values");
                }
                ht3Var.L = false;
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
        this.n1.a.setValue(new s03(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        af afVar = this.y0;
        afVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (b53.x(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b53.G(afVar, longSparseArray);
        } else {
            afVar.A.post(new we(0, afVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean J;
        this.C1 = true;
        super.onWindowFocusChanged(z);
        if (z && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (J = n40.J())) {
            setShowLayoutBounds(J);
            k(getRoot());
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.q1) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final void q(float[] fArr) {
        z();
        kv3.e(fArr, this.X0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.b1 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.b1 & 4294967295L));
        float[] fArr2 = this.W0;
        kv3.d(fArr2);
        kv3.f(fArr2, intBitsToFloat, intBitsToFloat2);
        se.P(fArr, fArr2);
    }

    public final long r(long j) {
        z();
        long b = kv3.b(j, this.X0);
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.b1 >> 32)) + Float.intBitsToFloat((int) (b >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.b1 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L))) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        y55 y55Var;
        if (!isFocused()) {
            zb2 b = fc2.b(i);
            if (b != null) {
                i2 = b.a;
            } else {
                i2 = 7;
            }
            jc2 focusOwner = getFocusOwner();
            if (rect != null) {
                y55Var = new y55(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                y55Var = null;
            }
            Boolean e = ((nc2) focusOwner).e(i2, y55Var, new be(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!b53.x(e, bool)) {
                if (!b53.x(((nc2) getFocusOwner()).e(i2, null, new be(i2, 1)), bool)) {
                    if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                        return false;
                    }
                    return ((nc2) getFocusOwner()).h(i2);
                }
            }
        }
        return true;
    }

    public final void s(boolean z) {
        vd vdVar;
        pv3 pv3Var = this.T0;
        if (!pv3Var.b.I() && ((o24) pv3Var.e.B).L == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                vdVar = this.A1;
            } finally {
                Trace.endSection();
            }
        } else {
            vdVar = null;
        }
        if (pv3Var.l(vdVar)) {
            requestLayout();
        }
        pv3Var.b(false);
        getRectManager().a();
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.x0.c0 = j;
    }

    public final void setComposeViewContext(qu0 qu0Var) {
        mi2 mi2Var;
        if (getCoroutineContext() != qu0Var.b.j() && !((u14) getRoot().n()).isEmpty()) {
            mz2.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ga6 z = io2.z();
        if (z != null) {
            mi2Var = z.e();
        } else {
            mi2Var = null;
        }
        ga6 Y = io2.Y(z);
        try {
            qu0 qu0Var2 = get_composeViewContext();
            if (qu0Var != qu0Var2) {
                if (isAttachedToWindow()) {
                    qu0Var2.b();
                    qu0Var.c();
                }
                set_composeViewContext(qu0Var);
                setCoroutineContext(qu0Var.b.j());
            }
        } finally {
            io2.l0(z, Y, mi2Var);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.D1 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.H0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(af afVar) {
        this.y0 = afVar;
    }

    public void setCoroutineContext(e31 e31Var) {
        this.l0 = e31Var;
    }

    public final void setFrameEndScheduler$ui(jn3 jn3Var) {
        this.d0 = jn3Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.Z0 = j;
    }

    public final void setOnReadyForComposition(mi2 mi2Var) {
        getDerivedIsAttached();
        if (!isAttachedToWindow() && !this.D1) {
            this.e1 = mi2Var;
        } else {
            mi2Var.n(getComposeViewContext());
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui  reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ny2 ny2Var) {
        this.R = ny2Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.P0 = z;
    }

    public void setUncaughtExceptionHandler(uq5 uq5Var) {
        this.T0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(vf3 vf3Var, long j) {
        pv3 pv3Var = this.T0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            pv3Var.m(vf3Var, j);
            if (!pv3Var.b.I()) {
                pv3Var.b(false);
                getRectManager().a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void u() {
        w14 w14Var;
        yc ycVar;
        Object[] objArr;
        if (this.L0) {
            bb6 bb6Var = getSnapshotObserver().a;
            synchronized (bb6Var.g) {
                try {
                    o24 o24Var = bb6Var.f;
                    int i = o24Var.L;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = o24Var.A;
                        if (i2 >= i) {
                            break;
                        }
                        ab6 ab6Var = (ab6) objArr[i2];
                        ab6Var.d();
                        if (!ab6Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = o24Var.A;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    o24Var.L = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.L0 = false;
        }
        nm nmVar = this.Q0;
        if (nmVar != null) {
            f(nmVar);
        }
        if (e() && (ycVar = this.K0) != null) {
            k14 k14Var = ycVar.c0;
            if (k14Var.d == 0 && ycVar.d0) {
                ((AutofillManager) ycVar.A.B).commit();
                ycVar.d0 = false;
            }
            if (k14Var.d != 0) {
                ycVar.d0 = true;
            }
        }
        while (this.t1.i() && this.t1.f(0) != null) {
            int i5 = this.t1.b;
            int i6 = 0;
            while (true) {
                w14Var = this.t1;
                if (i6 < i5) {
                    ki2 ki2Var = (ki2) w14Var.f(i6);
                    this.t1.n(i6, null);
                    if (ki2Var != null) {
                        ki2Var.c();
                    }
                    i6++;
                }
            }
            w14Var.l(0, i5);
        }
    }

    public final void v(vf3 vf3Var) {
        ke keVar = this.x0;
        keVar.s0 = true;
        if (keVar.v()) {
            keVar.w(vf3Var);
        }
        af afVar = this.y0;
        afVar.Z = true;
        if (afVar.e()) {
            afVar.c0.c(o27.a);
        }
    }

    public final void w(vf3 vf3Var, boolean z, boolean z2, boolean z3) {
        vf3 u;
        vf3 u2;
        pv3 pv3Var = this.T0;
        if (z) {
            os osVar = pv3Var.b;
            vf3 vf3Var2 = vf3Var.d0;
            zf3 zf3Var = vf3Var.B0;
            if (vf3Var2 == null) {
                mz2.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int i = ov3.a[zf3Var.d.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        if (!zf3Var.e || z2) {
                            zf3Var.e = true;
                            zf3Var.p.p0 = true;
                            if (!vf3Var.J0) {
                                if ((!b53.x(vf3Var.J(), Boolean.TRUE) && !pv3.i(vf3Var)) || ((u = vf3Var.u()) != null && u.B0.e)) {
                                    if ((vf3Var.I() || pv3.j(vf3Var)) && ((u2 = vf3Var.u()) == null || !u2.q())) {
                                        osVar.k(vf3Var, j53.Measurement);
                                    }
                                } else {
                                    osVar.k(vf3Var, j53.LookaheadMeasurement);
                                }
                                if (!pv3Var.d && z3) {
                                    C(vf3Var);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i.c();
                    return;
                }
                pv3Var.h.b(new nv3(vf3Var, true, z2));
            }
        } else if (pv3Var.r(vf3Var, z2) && z3) {
            C(vf3Var);
        }
    }

    public final void x(vf3 vf3Var, boolean z, boolean z2) {
        boolean z3;
        zf3 zf3Var = vf3Var.B0;
        pv3 pv3Var = this.T0;
        if (z) {
            os osVar = pv3Var.b;
            int i = ov3.a[zf3Var.d.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            i.c();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((!zf3Var.e && !zf3Var.f) || z2) {
                    zf3Var.f = true;
                    zf3Var.g = true;
                    sv3 sv3Var = zf3Var.p;
                    sv3Var.q0 = true;
                    sv3Var.r0 = true;
                    if (!vf3Var.J0) {
                        vf3 u = vf3Var.u();
                        if (b53.x(vf3Var.J(), Boolean.TRUE) && ((u == null || !u.B0.e) && (u == null || !u.B0.f))) {
                            osVar.k(vf3Var, j53.LookaheadPlacement);
                        } else if (vf3Var.I() && ((u == null || !u.p()) && (u == null || !u.q()))) {
                            osVar.k(vf3Var, j53.Placement);
                        }
                        if (!pv3Var.d) {
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
        pv3Var.getClass();
        int i2 = ov3.a[zf3Var.d.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 == 5) {
                vf3 u2 = vf3Var.u();
                if (u2 != null && !u2.I()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2) {
                    if (!vf3Var.q()) {
                        if (vf3Var.p() && vf3Var.I() == z3 && vf3Var.I() == zf3Var.p.o0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                sv3 sv3Var2 = zf3Var.p;
                sv3Var2.q0 = true;
                sv3Var2.r0 = true;
                if (!vf3Var.J0 && sv3Var2.o0 && z3) {
                    if ((u2 == null || !u2.p()) && (u2 == null || !u2.q())) {
                        pv3Var.b.k(vf3Var, j53.Placement);
                    }
                    if (!pv3Var.d) {
                        C(null);
                        return;
                    }
                    return;
                }
                return;
            }
            i.c();
        }
    }

    public final void y() {
        ke keVar = this.x0;
        keVar.s0 = true;
        Handler handler = keVar.R.getHandler();
        if (keVar.v() && !keVar.D0 && handler != null) {
            keVar.D0 = true;
            handler.post(keVar.F0);
        }
        af afVar = this.y0;
        afVar.Z = true;
        Handler handler2 = afVar.A.getHandler();
        if (afVar.e() && !afVar.h0 && handler2 != null) {
            afVar.h0 = true;
            handler2.post(afVar.i0);
        }
    }

    public final void z() {
        if (!this.a1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.Z0) {
                this.Z0 = currentAnimationTimeMillis;
                s80 s80Var = this.B1;
                float[] fArr = this.X0;
                s80Var.a(this, fArr);
                nl2.N(fArr, this.Y0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.V0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.b1 = (Float.floatToRawIntBits(iArr[0] - iArr[0]) << 32) | (Float.floatToRawIntBits(iArr[1] - iArr[1]) & 4294967295L);
            }
        }
    }

    public uc getAccessibilityManager() {
        return this.z0;
    }

    public nd getClipboard() {
        return this.N0;
    }

    public od getClipboardManager() {
        return this.M0;
    }

    /* renamed from: getDragAndDropManager */
    public ag m6getDragAndDropManager() {
        return this.m0;
    }

    /* renamed from: getLayoutNodes */
    public j14 m7getLayoutNodes() {
        return this.u0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @zd1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations  reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @zd1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public vq5 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(uq5 uq5Var) {
    }
}
