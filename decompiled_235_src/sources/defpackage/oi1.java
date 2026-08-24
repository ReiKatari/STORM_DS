package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.stormds.emulator.R;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi1  reason: default package */
/* loaded from: classes.dex */
public final class oi1 extends p0 {
    public final jj1 i0;
    public final WindowManager j0;
    public final WindowManager.LayoutParams k0;
    public on2 l0;
    public boolean m0;
    public final vs4 n0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oi1(View view, jj1 jj1Var, UUID uuid) {
        super(r0, null);
        view.getClass();
        jj1Var.getClass();
        Context context = view.getContext();
        context.getClass();
        this.i0 = jj1Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.j0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 258;
        layoutParams.dimAmount = 0.6f;
        layoutParams.windowAnimations = 16973826;
        layoutParams.type = 1003;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 17;
        this.k0 = layoutParams;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, bl2.B(view));
        setTag(R.id.view_tree_view_model_store_owner, ln2.r(view));
        setTag(R.id.view_tree_saved_state_registry_owner, kn2.C(view));
        setTag(R.id.compose_view_saveable_id_tag, "DetachedDialog:" + uuid);
        setClipChildren(false);
        this.n0 = np2.Y(jw2.g);
    }

    @Override // defpackage.p0
    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        a74 n;
        boolean z2;
        int i3;
        int i4;
        float dimension;
        oi1 oi1Var = this;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-427305857);
        if (xq2Var.h(oi1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if ((i5 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            lc2 lc2Var = dj6.c;
            boolean h = xq2Var.h(oi1Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (h || P == vs0Var) {
                P = new rg(oi1Var, 1);
                xq2Var.l0(P);
            }
            jg7 jg7Var = jg7.a;
            a74 a = jw6.a(lc2Var, jg7Var, (PointerInputEventHandler) P);
            e34 d = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            boolean z3 = oi1Var.i0.e;
            x64 x64Var = x64.a;
            if (z3) {
                xq2Var.b0(633022555);
                DisplayMetrics displayMetrics = oi1Var.getContext().getResources().getDisplayMetrics();
                if (oi1Var.getContext().getResources().getConfiguration().orientation == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TypedValue typedValue = new TypedValue();
                boolean z4 = z2;
                int i6 = (!oi1Var.getContext().getTheme().resolveAttribute(16843529, typedValue, true) || (i6 = typedValue.resourceId) == 0) ? 16974545 : 16974545;
                Resources.Theme newTheme = oi1Var.getContext().getResources().newTheme();
                newTheme.setTo(oi1Var.getContext().getTheme());
                newTheme.applyStyle(i6, true);
                if (z4) {
                    i3 = 16843607;
                } else {
                    i3 = 16843606;
                }
                if (newTheme.resolveAttribute(i3, typedValue, true)) {
                    int i7 = typedValue.type;
                    if (i7 != 5) {
                        if (i7 != 6) {
                            dimension = displayMetrics.widthPixels * 0.9f;
                        } else {
                            float f = displayMetrics.widthPixels;
                            dimension = typedValue.getFraction(f, f);
                        }
                    } else {
                        dimension = typedValue.getDimension(displayMetrics);
                    }
                    i4 = (int) dimension;
                } else {
                    i4 = (int) (280.0f * getContext().getResources().getDisplayMetrics().density);
                    int i8 = displayMetrics.widthPixels;
                    if (i4 > i8) {
                        i4 = i8;
                    }
                }
                n = dj6.l(x64Var, ((qh1) xq2Var.j(ky0.h)).Q(i4));
                xq2Var.p(false);
            } else {
                xq2Var.b0(633248235);
                xq2Var.p(false);
                n = dj6.n(x64Var, null, 3);
            }
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = ni1.b;
                xq2Var.l0(P2);
            }
            a74 a2 = jw6.a(n, jg7Var, (PointerInputEventHandler) P2);
            e34 d2 = h70.d(d90.L, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, a2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            oi1Var = this;
            ((eo2) oi1Var.n0.getValue()).o(xq2Var, 0);
            xq2Var.p(true);
            boolean h2 = xq2Var.h(oi1Var);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new li1(oi1Var, 1);
                xq2Var.l0(P3);
            }
            mb3.d(null, (qn2) P3, xq2Var);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(oi1Var, i, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.i0.a && (((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) && keyEvent.getAction() == 0)) {
            on2 on2Var = this.l0;
            if (on2Var != null) {
                on2Var.c();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m0;
    }
}
