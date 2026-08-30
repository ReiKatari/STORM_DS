package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yq4  reason: default package */
/* loaded from: classes.dex */
public final class yq4 extends o0 {
    public final int[] A0;
    public ki2 h0;
    public dr4 i0;
    public String j0;
    public final View k0;
    public final boolean l0;
    public final jo1 m0;
    public final WindowManager n0;
    public final WindowManager.LayoutParams o0;
    public cr4 p0;
    public sd3 q0;
    public final tj4 r0;
    public final tj4 s0;
    public e33 t0;
    public final ee1 u0;
    public final Rect v0;
    public final bb6 w0;
    public jp x0;
    public final tj4 y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq4(ki2 ki2Var, dr4 dr4Var, String str, View view, od1 od1Var, cr4 cr4Var, UUID uuid, boolean z) {
        super(view.getContext(), null);
        jo1 jo1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            jo1Var = new jo1(17);
        } else if (i >= 29) {
            jo1Var = new jo1(17);
        } else {
            jo1Var = new jo1(17);
        }
        this.h0 = ki2Var;
        this.i0 = dr4Var;
        this.j0 = str;
        this.k0 = view;
        this.l0 = z;
        this.m0 = jo1Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.n0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        dr4 dr4Var2 = this.i0;
        boolean b = oj.b(view);
        boolean z2 = dr4Var2.b;
        int i2 = dr4Var2.a;
        if (z2 && b) {
            i2 |= 8192;
        } else if (z2 && !b) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.i0.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.o0 = layoutParams;
        this.p0 = cr4Var;
        this.q0 = sd3.Ltr;
        this.r0 = me2.G(null);
        this.s0 = me2.G(null);
        this.u0 = me2.q(new dj(15, this));
        this.v0 = new Rect();
        this.w0 = new bb6(new kj(this, 2));
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, jk2.u(view));
        setTag(R.id.view_tree_view_model_store_owner, nl2.L(view));
        setTag(R.id.view_tree_saved_state_registry_owner, nk2.y(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(od1Var.C(8.0f));
        setOutlineProvider(new gf1(1));
        this.y0 = me2.G(gt0.a);
        this.A0 = new int[2];
    }

    private final aj2 getContent() {
        return (aj2) this.y0.getValue();
    }

    private final e33 getDisplayBounds() {
        int i = this.i0.a & 512;
        View view = this.k0;
        Rect rect = this.v0;
        jo1 jo1Var = this.m0;
        if (i == 0) {
            jo1Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            jo1Var.t(view, rect);
        }
        return new e33(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rd3 getParentLayoutCoordinates() {
        return (rd3) this.s0.getValue();
    }

    private final void setContent(aj2 aj2Var) {
        this.y0.setValue(aj2Var);
    }

    private final void setParentLayoutCoordinates(rd3 rd3Var) {
        this.s0.setValue(rd3Var);
    }

    @Override // defpackage.o0
    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-857613600);
        if (sk2Var.h(this)) {
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
        if (sk2Var.O(i3 & 1, z)) {
            getContent().j(sk2Var, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new n0(this, i, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.i0.c) {
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
                ki2 ki2Var = this.h0;
                if (ki2Var != null) {
                    ki2Var.c();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.o0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.i0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.o0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.m0.getClass();
        this.n0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.u0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.o0;
    }

    public final sd3 getParentLayoutDirection() {
        return this.q0;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final i33 m16getPopupContentSizebOM6tXw() {
        return (i33) this.r0.getValue();
    }

    public final cr4 getPositionProvider() {
        return this.p0;
    }

    @Override // defpackage.o0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z0;
    }

    public final String getTestTag() {
        return this.j0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.o0
    public final void h(int i, int i2) {
        this.i0.getClass();
        e33 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.a(), Integer.MIN_VALUE));
    }

    public final void m(dv0 dv0Var, aj2 aj2Var) {
        setParentCompositionContext(dv0Var);
        setContent(aj2Var);
        this.z0 = true;
    }

    public final void n(ki2 ki2Var, dr4 dr4Var, String str, sd3 sd3Var) {
        this.h0 = ki2Var;
        this.j0 = str;
        if (!b53.x(this.i0, dr4Var)) {
            dr4Var.getClass();
            this.i0 = dr4Var;
            boolean b = oj.b(this.k0);
            boolean z = dr4Var.b;
            int i = dr4Var.a;
            if (z && b) {
                i |= 8192;
            } else if (z && !b) {
                i &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.o0;
            layoutParams.flags = i;
            this.m0.getClass();
            this.n0.updateViewLayout(this, layoutParams);
        }
        int i2 = wq4.a[sd3Var.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i.c();
                return;
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    public final void o() {
        long k;
        rd3 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.c0()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long O = parentLayoutCoordinates.O();
                if (this.l0) {
                    k = parentLayoutCoordinates.a(0L);
                } else {
                    k = parentLayoutCoordinates.k(0L);
                }
                long round = (Math.round(Float.intBitsToFloat((int) (k >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (k & 4294967295L))) & 4294967295L);
                int i = (int) (round >> 32);
                int i2 = (int) (round & 4294967295L);
                e33 e33Var = new e33(i, i2, ((int) (O >> 32)) + i, ((int) (O & 4294967295L)) + i2);
                if (!e33Var.equals(this.t0)) {
                    this.t0 = e33Var;
                    q();
                }
            }
        }
    }

    @Override // defpackage.o0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w0.e();
        if (this.i0.c && Build.VERSION.SDK_INT >= 33) {
            if (this.x0 == null) {
                this.x0 = new jp(0, this.h0);
            }
            p2.i(this, this.x0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bb6 bb6Var = this.w0;
        a31 a31Var = bb6Var.h;
        if (a31Var != null) {
            a31Var.g();
        }
        bb6Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            p2.j(this, this.x0);
        }
        this.x0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.i0.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < RecyclerView.A1 || motionEvent.getX() >= getWidth() || motionEvent.getY() < RecyclerView.A1 || motionEvent.getY() >= getHeight())) {
            ki2 ki2Var = this.h0;
            if (ki2Var != null) {
                ki2Var.c();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            ki2 ki2Var2 = this.h0;
            if (ki2Var2 != null) {
                ki2Var2.c();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p(rd3 rd3Var) {
        setParentLayoutCoordinates(rd3Var);
        o();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, m75] */
    public final void q() {
        i33 m16getPopupContentSizebOM6tXw;
        e33 e33Var = this.t0;
        if (e33Var != null && (m16getPopupContentSizebOM6tXw = m16getPopupContentSizebOM6tXw()) != null) {
            long j = m16getPopupContentSizebOM6tXw.a;
            e33 displayBounds = getDisplayBounds();
            long a = (displayBounds.a() & 4294967295L) | ((displayBounds.c - displayBounds.a) << 32);
            ?? obj = new Object();
            obj.A = 0L;
            this.w0.d(this, qc2.m0, new xq4(obj, this, e33Var, a, j));
            long j2 = obj.A;
            WindowManager.LayoutParams layoutParams = this.o0;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.i0.e;
            jo1 jo1Var = this.m0;
            if (z) {
                jo1Var.v(this, (int) (a >> 32), (int) (a & 4294967295L));
            }
            jo1Var.getClass();
            this.n0.updateViewLayout(this, layoutParams);
        }
    }

    public final void setParentLayoutDirection(sd3 sd3Var) {
        this.q0 = sd3Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m17setPopupContentSizefhxjrPA(i33 i33Var) {
        this.r0.setValue(i33Var);
    }

    public final void setPositionProvider(cr4 cr4Var) {
        this.p0 = cr4Var;
    }

    public final void setTestTag(String str) {
        this.j0 = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public o0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
