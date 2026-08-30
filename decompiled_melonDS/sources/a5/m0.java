package a5;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import me.magnum.melonds.R;
import n2.f1;
import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends b4.a {

    /* renamed from: f0  reason: collision with root package name */
    public mc.a f404f0;

    /* renamed from: g0  reason: collision with root package name */
    public r0 f405g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f406h0;

    /* renamed from: i0  reason: collision with root package name */
    public final View f407i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f408j0;

    /* renamed from: k0  reason: collision with root package name */
    public final p0 f409k0;

    /* renamed from: l0  reason: collision with root package name */
    public final WindowManager f410l0;

    /* renamed from: m0  reason: collision with root package name */
    public final WindowManager.LayoutParams f411m0;

    /* renamed from: n0  reason: collision with root package name */
    public q0 f412n0;

    /* renamed from: o0  reason: collision with root package name */
    public x4.m f413o0;
    public final f1 p0;

    /* renamed from: q0  reason: collision with root package name */
    public final f1 f414q0;

    /* renamed from: r0  reason: collision with root package name */
    public x4.k f415r0;

    /* renamed from: s0  reason: collision with root package name */
    public final n2.e0 f416s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Rect f417t0;

    /* renamed from: u0  reason: collision with root package name */
    public final z2.u f418u0;

    /* renamed from: v0  reason: collision with root package name */
    public y f419v0;

    /* renamed from: w0  reason: collision with root package name */
    public final f1 f420w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f421x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int[] f422y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a5.p0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public m0(mc.a aVar, r0 r0Var, String str, View view, x4.c cVar, q0 q0Var, UUID uuid, boolean z10) {
        super(view.getContext(), null);
        ?? r02;
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        this.f404f0 = aVar;
        this.f405g0 = r0Var;
        this.f406h0 = str;
        this.f407i0 = view;
        this.f408j0 = z10;
        this.f409k0 = r02;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f410l0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        r0 r0Var2 = this.f405g0;
        boolean b10 = u.b(view);
        boolean z11 = r0Var2.f428b;
        int i2 = r0Var2.f427a;
        if (z11 && b10) {
            i2 |= 8192;
        } else if (z11 && !b10) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f411m0 = layoutParams;
        this.f412n0 = q0Var;
        this.f413o0 = x4.m.Ltr;
        this.p0 = n2.s.w(null);
        this.f414q0 = n2.s.w(null);
        this.f416s0 = n2.s.q(new a4.m0(1, this));
        this.f417t0 = new Rect();
        this.f418u0 = new z2.u(new p(this, 2));
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, androidx.lifecycle.s0.d(view));
        setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.s0.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, p7.o.j(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.v((float) 8));
        setOutlineProvider(new g0(1));
        this.f420w0 = n2.s.w(c0.f382a);
        this.f422y0 = new int[2];
    }

    private final mc.p getContent() {
        return (mc.p) this.f420w0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y3.z getParentLayoutCoordinates() {
        return (y3.z) this.f414q0.getValue();
    }

    private final x4.k getVisibleDisplayBounds() {
        this.f409k0.getClass();
        View view = this.f407i0;
        Rect rect = this.f417t0;
        view.getWindowVisibleDisplayFrame(rect);
        return new x4.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(mc.p pVar) {
        this.f420w0.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(y3.z zVar) {
        this.f414q0.setValue(zVar);
    }

    @Override // b4.a
    public final void a(n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-857613600);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            getContent().j(rVar, 0);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f(i2, 2, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f405g0.f429c) {
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
                mc.a aVar = this.f404f0;
                if (aVar != null) {
                    aVar.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b4.a
    public final void e(boolean z10, int i2, int i10, int i11, int i12) {
        super.e(z10, i2, i10, i11, i12);
        this.f405g0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f411m0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f409k0.getClass();
        this.f410l0.updateViewLayout(this, layoutParams);
    }

    @Override // b4.a
    public final void f(int i2, int i10) {
        this.f405g0.getClass();
        x4.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f14344c - visibleDisplayBounds.f14342a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.a(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f416s0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f411m0;
    }

    public final x4.m getParentLayoutDirection() {
        return this.f413o0;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final x4.l m0getPopupContentSizebOM6tXw() {
        return (x4.l) this.p0.getValue();
    }

    public final q0 getPositionProvider() {
        return this.f412n0;
    }

    @Override // b4.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f421x0;
    }

    public final String getTestTag() {
        return this.f406h0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(n2.v vVar, mc.p pVar) {
        setParentCompositionContext(vVar);
        setContent(pVar);
        this.f421x0 = true;
    }

    public final void j(mc.a aVar, r0 r0Var, String str, x4.m mVar) {
        this.f404f0 = aVar;
        this.f406h0 = str;
        if (!nc.k.a(this.f405g0, r0Var)) {
            r0Var.getClass();
            this.f405g0 = r0Var;
            boolean b10 = u.b(this.f407i0);
            boolean z10 = r0Var.f428b;
            int i2 = r0Var.f427a;
            if (z10 && b10) {
                i2 |= 8192;
            } else if (z10 && !b10) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f411m0;
            layoutParams.flags = i2;
            this.f409k0.getClass();
            this.f410l0.updateViewLayout(this, layoutParams);
        }
        int i10 = j0.f403a[mVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                m9.o.o();
                return;
            }
        } else {
            i11 = 0;
        }
        super.setLayoutDirection(i11);
    }

    public final void k() {
        long l10;
        y3.z parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.U()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long Z = parentLayoutCoordinates.Z();
                if (this.f408j0) {
                    l10 = parentLayoutCoordinates.a(0L);
                } else {
                    l10 = parentLayoutCoordinates.l(0L);
                }
                long round = (Math.round(Float.intBitsToFloat((int) (l10 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (l10 & 4294967295L))) & 4294967295L);
                int i2 = (int) (round >> 32);
                int i10 = (int) (round & 4294967295L);
                x4.k kVar = new x4.k(i2, i10, ((int) (Z >> 32)) + i2, ((int) (Z & 4294967295L)) + i10);
                if (!kVar.equals(this.f415r0)) {
                    this.f415r0 = kVar;
                    m();
                }
            }
        }
    }

    public final void l(y3.z zVar) {
        setParentLayoutCoordinates(zVar);
        k();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [nc.s, java.lang.Object] */
    public final void m() {
        x4.l m0getPopupContentSizebOM6tXw;
        x4.k kVar = this.f415r0;
        if (kVar != null && (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) != null) {
            long j2 = m0getPopupContentSizebOM6tXw.f14346a;
            x4.k visibleDisplayBounds = getVisibleDisplayBounds();
            long a10 = (visibleDisplayBounds.a() & 4294967295L) | ((visibleDisplayBounds.f14344c - visibleDisplayBounds.f14342a) << 32);
            ?? obj = new Object();
            obj.A = 0L;
            this.f418u0.c(this, e.f383b0, new l0(obj, this, kVar, a10, j2));
            long j10 = obj.A;
            WindowManager.LayoutParams layoutParams = this.f411m0;
            layoutParams.x = (int) (j10 >> 32);
            layoutParams.y = (int) (j10 & 4294967295L);
            boolean z10 = this.f405g0.f431e;
            p0 p0Var = this.f409k0;
            if (z10) {
                p0Var.a(this, (int) (a10 >> 32), (int) (a10 & 4294967295L));
            }
            p0Var.getClass();
            this.f410l0.updateViewLayout(this, layoutParams);
        }
    }

    @Override // b4.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f418u0.d();
        if (this.f405g0.f429c && Build.VERSION.SDK_INT >= 33) {
            if (this.f419v0 == null) {
                this.f419v0 = new y(0, this.f404f0);
            }
            z.g(this, this.f419v0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2.u uVar = this.f418u0;
        ah.e eVar = uVar.f14952h;
        if (eVar != null) {
            eVar.f();
        }
        uVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            z.h(this, this.f419v0);
        }
        this.f419v0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f405g0.f430d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            mc.a aVar = this.f404f0;
            if (aVar != null) {
                aVar.b();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            mc.a aVar2 = this.f404f0;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setParentLayoutDirection(x4.m mVar) {
        this.f413o0 = mVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(x4.l lVar) {
        this.p0.setValue(lVar);
    }

    public final void setPositionProvider(q0 q0Var) {
        this.f412n0 = q0Var;
    }

    public final void setTestTag(String str) {
        this.f406h0 = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public b4.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }
}
