package og;

import a5.f0;
import ai.s0;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.q1;
import l1.e0;
import l1.r1;
import n2.f1;
import n2.p1;
import n2.r;
import n2.s;
import v3.c0;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends b4.a {

    /* renamed from: f0  reason: collision with root package name */
    public final f0 f10991f0;

    /* renamed from: g0  reason: collision with root package name */
    public final WindowManager f10992g0;

    /* renamed from: h0  reason: collision with root package name */
    public final WindowManager.LayoutParams f10993h0;

    /* renamed from: i0  reason: collision with root package name */
    public mc.a f10994i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f10995j0;

    /* renamed from: k0  reason: collision with root package name */
    public final f1 f10996k0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.view.View r3, a5.f0 r4, java.util.UUID r5) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            r2.f10991f0 = r4
            android.content.Context r4 = r3.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r4 = r4.getSystemService(r0)
            r4.getClass()
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            r2.f10992g0 = r4
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r4.<init>()
            r0 = 258(0x102, float:3.62E-43)
            r4.flags = r0
            r0 = 1058642330(0x3f19999a, float:0.6)
            r4.dimAmount = r0
            r0 = 16973826(0x1030002, float:2.4060906E-38)
            r4.windowAnimations = r0
            r0 = 1003(0x3eb, float:1.406E-42)
            r4.type = r0
            android.os.IBinder r0 = r3.getApplicationWindowToken()
            r4.token = r0
            r0 = -1
            r4.width = r0
            r4.height = r0
            r0 = -3
            r4.format = r0
            r0 = 17
            r4.gravity = r0
            r2.f10993h0 = r4
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            androidx.lifecycle.x r4 = androidx.lifecycle.s0.d(r3)
            r0 = 2131362452(0x7f0a0294, float:1.8344685E38)
            r2.setTag(r0, r4)
            androidx.lifecycle.e1 r4 = androidx.lifecycle.s0.e(r3)
            r0 = 2131362456(0x7f0a0298, float:1.8344693E38)
            r2.setTag(r0, r4)
            q7.f r3 = p7.o.j(r3)
            r4 = 2131362455(0x7f0a0297, float:1.8344691E38)
            r2.setTag(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DetachedDialog:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131361954(0x7f0a00a2, float:1.8343675E38)
            r2.setTag(r4, r3)
            r3 = 0
            r2.setClipChildren(r3)
            v2.c r3 = og.a.f10986a
            n2.f1 r3 = n2.s.w(r3)
            r2.f10996k0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e.<init>(android.view.View, a5.f0, java.util.UUID):void");
    }

    @Override // b4.a
    public final void a(n2.m mVar, int i2) {
        int i10;
        boolean z10;
        b3.p n10;
        boolean z11;
        int i11;
        int i12;
        float dimension;
        e eVar = this;
        r rVar = (r) mVar;
        rVar.Z(-427305857);
        if (rVar.h(eVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i2 | i10;
        if ((i13 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            e0 e0Var = r1.f8615c;
            boolean h2 = rVar.h(eVar);
            Object L = rVar.L();
            n2.e eVar2 = n2.l.f9953a;
            if (h2 || L == eVar2) {
                L = new a2.h(6, eVar);
                rVar.h0(L);
            }
            y yVar = y.f14813a;
            b3.p a10 = c0.a(e0Var, yVar, (PointerInputEventHandler) L);
            v0 d4 = l1.p.d(b3.c.X, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(a10, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            s.C(d4, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            s.u(rVar, valueOf, fVar3);
            a4.e eVar3 = a4.g.f217g;
            s.y(rVar, eVar3);
            a4.f fVar4 = a4.g.f213c;
            s.C(c4, fVar4, rVar);
            boolean z12 = eVar.f10991f0.f394e;
            b3.m mVar2 = b3.m.f1770a;
            if (z12) {
                rVar.X(633022555);
                DisplayMetrics displayMetrics = eVar.getContext().getResources().getDisplayMetrics();
                if (eVar.getContext().getResources().getConfiguration().orientation == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TypedValue typedValue = new TypedValue();
                boolean z13 = z11;
                int i14 = (!eVar.getContext().getTheme().resolveAttribute(16843529, typedValue, true) || (i14 = typedValue.resourceId) == 0) ? 16974545 : 16974545;
                Resources.Theme newTheme = eVar.getContext().getResources().newTheme();
                newTheme.setTo(eVar.getContext().getTheme());
                newTheme.applyStyle(i14, true);
                if (z13) {
                    i11 = 16843607;
                } else {
                    i11 = 16843606;
                }
                if (newTheme.resolveAttribute(i11, typedValue, true)) {
                    int i15 = typedValue.type;
                    if (i15 != 5) {
                        if (i15 != 6) {
                            dimension = displayMetrics.widthPixels * 0.9f;
                        } else {
                            float f8 = displayMetrics.widthPixels;
                            dimension = typedValue.getFraction(f8, f8);
                        }
                    } else {
                        dimension = typedValue.getDimension(displayMetrics);
                    }
                    i12 = (int) dimension;
                } else {
                    i12 = (int) (280 * getContext().getResources().getDisplayMetrics().density);
                    int i16 = displayMetrics.widthPixels;
                    if (i12 > i16) {
                        i12 = i16;
                    }
                }
                n10 = r1.l(mVar2, ((x4.c) rVar.j(q1.f1919h)).t0(i12));
                rVar.p(false);
            } else {
                rVar.X(633248235);
                rVar.p(false);
                n10 = r1.n(mVar2, null, 3);
            }
            Object L2 = rVar.L();
            if (L2 == eVar2) {
                L2 = d.f10990a;
                rVar.h0(L2);
            }
            b3.p a11 = c0.a(n10, yVar, (PointerInputEventHandler) L2);
            v0 d10 = l1.p.d(b3.c.A, false);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            b3.p c10 = b3.a.c(a11, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(d10, fVar, rVar);
            s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar3);
            s.C(c10, fVar4, rVar);
            eVar = this;
            ((mc.p) eVar.f10996k0.getValue()).j(rVar, 0);
            rVar.p(true);
            boolean h10 = rVar.h(eVar);
            Object L3 = rVar.L();
            if (h10 || L3 == eVar2) {
                L3 = new b(eVar, 1);
                rVar.h0(L3);
            }
            s.d(null, (mc.l) L3, rVar);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 22, eVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f10991f0.f390a && (((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) && keyEvent.getAction() == 0)) {
            mc.a aVar = this.f10994i0;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b4.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f10995j0;
    }
}
