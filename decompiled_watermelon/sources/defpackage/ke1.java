package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ke1  reason: default package */
/* loaded from: classes.dex */
public final class ke1 extends o0 {
    public final ff1 h0;
    public final WindowManager i0;
    public final WindowManager.LayoutParams j0;
    public ki2 k0;
    public boolean l0;
    public final tj4 m0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ke1(android.view.View r3, defpackage.ff1 r4, java.util.UUID r5) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            r2.h0 = r4
            android.content.Context r4 = r3.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r4 = r4.getSystemService(r0)
            r4.getClass()
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            r2.i0 = r4
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
            r2.j0 = r4
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            fn3 r4 = defpackage.jk2.u(r3)
            r0 = 2131428041(0x7f0b02c9, float:1.8477715E38)
            r2.setTag(r0, r4)
            ab7 r4 = defpackage.nl2.L(r3)
            r0 = 2131428045(0x7f0b02cd, float:1.8477723E38)
            r2.setTag(r0, r4)
            au5 r3 = defpackage.nk2.y(r3)
            r4 = 2131428044(0x7f0b02cc, float:1.8477721E38)
            r2.setTag(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DetachedDialog:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131427498(0x7f0b00aa, float:1.8476614E38)
            r2.setTag(r4, r3)
            r3 = 0
            r2.setClipChildren(r3)
            et0 r3 = defpackage.iq2.e
            tj4 r3 = defpackage.me2.G(r3)
            r2.m0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke1.<init>(android.view.View, ff1, java.util.UUID):void");
    }

    @Override // defpackage.o0
    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        zy3 m;
        boolean z2;
        int i3;
        int i4;
        float dimension;
        ke1 ke1Var = this;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-427305857);
        if (sk2Var.h(ke1Var)) {
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
        if (sk2Var.O(i5 & 1, z)) {
            s72 s72Var = o76.c;
            boolean h = sk2Var.h(ke1Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (h || L == sn1Var) {
                L = new dg(1, ke1Var);
                sk2Var.h0(L);
            }
            o27 o27Var = o27.a;
            zy3 a = pk6.a(s72Var, o27Var, (PointerInputEventHandler) L);
            tv3 d = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, a);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            boolean z3 = ke1Var.h0.e;
            wy3 wy3Var = wy3.a;
            if (z3) {
                sk2Var.X(633022555);
                DisplayMetrics displayMetrics = ke1Var.getContext().getResources().getDisplayMetrics();
                if (ke1Var.getContext().getResources().getConfiguration().orientation == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TypedValue typedValue = new TypedValue();
                boolean z4 = z2;
                int i6 = (!ke1Var.getContext().getTheme().resolveAttribute(16843529, typedValue, true) || (i6 = typedValue.resourceId) == 0) ? 16974545 : 16974545;
                Resources.Theme newTheme = ke1Var.getContext().getResources().newTheme();
                newTheme.setTo(ke1Var.getContext().getTheme());
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
                m = o76.k(wy3Var, ((od1) sk2Var.j(ov0.h)).A0(i4));
                sk2Var.p(false);
            } else {
                sk2Var.X(633248235);
                sk2Var.p(false);
                m = o76.m(wy3Var, 3);
            }
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = je1.b;
                sk2Var.h0(L2);
            }
            zy3 a2 = pk6.a(m, o27Var, (PointerInputEventHandler) L2);
            tv3 d2 = d50.d(y60.L, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ke1Var = this;
            ((aj2) ke1Var.m0.getValue()).j(sk2Var, 0);
            sk2Var.p(true);
            boolean h2 = sk2Var.h(ke1Var);
            Object L3 = sk2Var.L();
            if (h2 || L3 == sn1Var) {
                L3 = new he1(ke1Var, 1);
                sk2Var.h0(L3);
            }
            l.d(null, (mi2) L3, sk2Var);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 8, ke1Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.h0.a && (((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) && keyEvent.getAction() == 0)) {
            ki2 ki2Var = this.k0;
            if (ki2Var != null) {
                ki2Var.c();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.o0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l0;
    }
}
