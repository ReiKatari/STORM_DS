package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c05  reason: default package */
/* loaded from: classes.dex */
public final class c05 extends p0 {
    public boolean A0;
    public final int[] B0;
    public on2 i0;
    public g05 j0;
    public String k0;
    public final View l0;
    public final boolean m0;
    public final q61 n0;
    public final WindowManager o0;
    public final WindowManager.LayoutParams p0;
    public f05 q0;
    public kk3 r0;
    public final vs4 s0;
    public final vs4 t0;
    public m93 u0;
    public final ii1 v0;
    public final Rect w0;
    public final qm6 x0;
    public vp y0;
    public final vs4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [q61] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public c05(on2 on2Var, g05 g05Var, String str, View view, qh1 qh1Var, f05 f05Var, UUID uuid, boolean z) {
        super(view.getContext(), null);
        ?? r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new Object();
        } else if (i >= 29) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        this.i0 = on2Var;
        this.j0 = g05Var;
        this.k0 = str;
        this.l0 = view;
        this.m0 = z;
        this.n0 = r0;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.o0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        g05 g05Var2 = this.j0;
        boolean b = ak.b(view);
        boolean z2 = g05Var2.b;
        int i2 = g05Var2.a;
        if (z2 && b) {
            i2 |= 8192;
        } else if (z2 && !b) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.j0.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.p0 = layoutParams;
        this.q0 = f05Var;
        this.r0 = kk3.Ltr;
        this.s0 = np2.Y(null);
        this.t0 = np2.Y(null);
        this.v0 = np2.I(new pj(this, 15));
        this.w0 = new Rect();
        this.x0 = new qm6(new wj(this, 2));
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, bl2.B(view));
        setTag(R.id.view_tree_view_model_store_owner, ln2.r(view));
        setTag(R.id.view_tree_saved_state_registry_owner, kn2.C(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(qh1Var.e0(8.0f));
        setOutlineProvider(new kj1(1));
        this.z0 = np2.Y(bw0.a);
        this.B0 = new int[2];
    }

    private final eo2 getContent() {
        return (eo2) this.z0.getValue();
    }

    private final m93 getDisplayBounds() {
        int i = this.j0.a & 512;
        View view = this.l0;
        Rect rect = this.w0;
        q61 q61Var = this.n0;
        if (i == 0) {
            q61Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            q61Var.m(view, rect);
        }
        return new m93(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jk3 getParentLayoutCoordinates() {
        return (jk3) this.t0.getValue();
    }

    private final void setContent(eo2 eo2Var) {
        this.z0.setValue(eo2Var);
    }

    private final void setParentLayoutCoordinates(jk3 jk3Var) {
        this.t0.setValue(jk3Var);
    }

    @Override // defpackage.p0
    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-857613600);
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            getContent().o(xq2Var, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new o0(this, i, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.j0.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                on2 on2Var = this.i0;
                if (on2Var != null) {
                    on2Var.c();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.p0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.j0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.p0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.n0.getClass();
        this.o0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.v0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.p0;
    }

    public final kk3 getParentLayoutDirection() {
        return this.r0;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final q93 m0getPopupContentSizebOM6tXw() {
        return (q93) this.s0.getValue();
    }

    public final f05 getPositionProvider() {
        return this.q0;
    }

    @Override // defpackage.p0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A0;
    }

    public final String getTestTag() {
        return this.k0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.p0
    public final void h(int i, int i2) {
        this.j0.getClass();
        m93 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.a(), Integer.MIN_VALUE));
    }

    public final void m(zx0 zx0Var, eo2 eo2Var) {
        setParentCompositionContext(zx0Var);
        setContent(eo2Var);
        this.A0 = true;
    }

    public final void n(on2 on2Var, g05 g05Var, String str, kk3 kk3Var) {
        this.i0 = on2Var;
        this.k0 = str;
        if (!nb3.k(this.j0, g05Var)) {
            g05Var.getClass();
            this.j0 = g05Var;
            boolean b = ak.b(this.l0);
            boolean z = g05Var.b;
            int i = g05Var.a;
            if (z && b) {
                i |= 8192;
            } else if (z && !b) {
                i &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.p0;
            layoutParams.flags = i;
            this.n0.getClass();
            this.o0.updateViewLayout(this, layoutParams);
        }
        int i2 = a05.a[kk3Var.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i.d();
                return;
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    public final void o() {
        long d;
        jk3 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.t()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long m = parentLayoutCoordinates.m();
                if (this.m0) {
                    d = parentLayoutCoordinates.w(0L);
                } else {
                    d = parentLayoutCoordinates.d(0L);
                }
                long round = (Math.round(Float.intBitsToFloat((int) (d >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (d & 4294967295L))) & 4294967295L);
                int i = (int) (round >> 32);
                int i2 = (int) (round & 4294967295L);
                m93 m93Var = new m93(i, i2, ((int) (m >> 32)) + i, ((int) (m & 4294967295L)) + i2);
                if (!m93Var.equals(this.u0)) {
                    this.u0 = m93Var;
                    q();
                }
            }
        }
    }

    @Override // defpackage.p0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.e();
        if (this.j0.c && Build.VERSION.SDK_INT >= 33) {
            if (this.y0 == null) {
                this.y0 = new vp(this.i0, 0);
            }
            r2.i(this, this.y0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qm6 qm6Var = this.x0;
        h61 h61Var = qm6Var.h;
        if (h61Var != null) {
            h61Var.d();
        }
        qm6Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            r2.j(this, this.y0);
        }
        this.y0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j0.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < RecyclerView.B1 || motionEvent.getX() >= getWidth() || motionEvent.getY() < RecyclerView.B1 || motionEvent.getY() >= getHeight())) {
            on2 on2Var = this.i0;
            if (on2Var != null) {
                on2Var.c();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            on2 on2Var2 = this.i0;
            if (on2Var2 != null) {
                on2Var2.c();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p(jk3 jk3Var) {
        setParentLayoutCoordinates(jk3Var);
        o();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ch5, java.lang.Object] */
    public final void q() {
        q93 m0getPopupContentSizebOM6tXw;
        m93 m93Var = this.u0;
        if (m93Var != null && (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) != null) {
            long j = m0getPopupContentSizebOM6tXw.a;
            m93 displayBounds = getDisplayBounds();
            long a = (displayBounds.a() & 4294967295L) | ((displayBounds.c - displayBounds.a) << 32);
            ?? obj = new Object();
            obj.A = 0L;
            this.x0.d(this, hh2.o0, new b05(obj, this, m93Var, a, j));
            long j2 = obj.A;
            WindowManager.LayoutParams layoutParams = this.p0;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.j0.e;
            q61 q61Var = this.n0;
            if (z) {
                q61Var.p(this, (int) (a >> 32), (int) (a & 4294967295L));
            }
            q61Var.getClass();
            this.o0.updateViewLayout(this, layoutParams);
        }
    }

    public final void setParentLayoutDirection(kk3 kk3Var) {
        this.r0 = kk3Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(q93 q93Var) {
        this.s0.setValue(q93Var);
    }

    public final void setPositionProvider(f05 f05Var) {
        this.q0 = f05Var;
    }

    public final void setTestTag(String str) {
        this.k0 = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public p0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
