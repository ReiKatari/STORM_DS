package defpackage;

import android.view.KeyEvent;
import android.view.WindowManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ii2  reason: default package */
/* loaded from: classes.dex */
public final class ii2 extends o0 {
    public final WindowManager h0;
    public final WindowManager.LayoutParams i0;
    public ki2 j0;
    public boolean k0;
    public final tj4 l0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ii2(android.view.View r3, boolean r4, java.util.UUID r5) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r2.h0 = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r1 = 512(0x200, float:7.17E-43)
            r0.flags = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.type = r1
            if (r4 == 0) goto L32
            r4 = 2132017464(0x7f140138, float:1.9673207E38)
            goto L35
        L32:
            r4 = 2132017463(0x7f140137, float:1.9673205E38)
        L35:
            r0.windowAnimations = r4
            android.os.IBinder r4 = r3.getApplicationWindowToken()
            r0.token = r4
            r4 = -1
            r0.width = r4
            r0.height = r4
            r4 = -3
            r0.format = r4
            r2.i0 = r0
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
            java.lang.String r4 = "CustomLayout:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131427498(0x7f0b00aa, float:1.8476614E38)
            r2.setTag(r4, r3)
            et0 r3 = defpackage.b53.b
            tj4 r3 = defpackage.me2.G(r3)
            r2.l0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.<init>(android.view.View, boolean, java.util.UUID):void");
    }

    @Override // defpackage.o0
    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-266009091);
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
            ((aj2) this.l0.getValue()).j(sk2Var, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 11, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) {
            ki2 ki2Var = this.j0;
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
        return this.k0;
    }
}
