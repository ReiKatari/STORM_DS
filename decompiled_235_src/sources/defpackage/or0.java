package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or0  reason: default package */
/* loaded from: classes.dex */
public class or0 extends h0 {
    public vy4 H0;
    public s43 I0;

    @Override // defpackage.h0, defpackage.yy4
    public final void I() {
        super.I();
        g1(false);
    }

    @Override // defpackage.h0
    public final boolean d1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.h0
    public final void e1(KeyEvent keyEvent) {
        this.s0.c();
    }

    @Override // defpackage.a53
    public final void f0() {
        g1(true);
    }

    public final void g1(boolean z) {
        if (z) {
            this.I0 = null;
        } else {
            this.H0 = null;
        }
        X0(z);
    }

    @Override // defpackage.a53
    public final void u(ei eiVar, py4 py4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) eiVar.L;
        b1();
        if (this.r0 && this.v0 == null) {
            vr2 vr2Var = new vr2(this);
            R0(vr2Var);
            this.v0 = vr2Var;
        }
        if (py4Var == py4.Main) {
            if (this.I0 == null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (jx2.k((s43) arrayList.get(i))) {
                        s43 s43Var = (s43) arrayList.get(0);
                        s43Var.i = true;
                        this.I0 = s43Var;
                        if (this.r0) {
                            Z0(s43Var);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                s43 s43Var2 = (s43) arrayList.get(i2);
                if (s43Var2.i || !s43Var2.h || s43Var2.d) {
                    float f = ((fo7) hf.K(this, ky0.t)).f();
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        s43 s43Var3 = (s43) arrayList.get(i3);
                        long j = s43Var3.c;
                        s43 s43Var4 = this.I0;
                        s43Var4.getClass();
                        if (Math.abs(jk4.d(jk4.e(j, s43Var4.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (s43Var3.i || z) {
                            g1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((s43) arrayList.get(0)).i = true;
            if (this.r0) {
                s43 s43Var5 = this.I0;
                s43Var5.getClass();
                Y0(s43Var5.c, true);
                this.s0.c();
            }
            this.I0 = null;
        } else if (py4Var == py4.Final && this.I0 != null) {
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                s43 s43Var6 = (s43) arrayList.get(i4);
                if (s43Var6.i && s43Var6 != this.I0) {
                    g1(true);
                    return;
                }
            }
        }
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        super.w(oy4Var, py4Var, j);
        if (py4Var == py4.Main) {
            if (this.H0 == null) {
                if (hz6.e(oy4Var, true)) {
                    vy4 vy4Var = (vy4) oy4Var.a.get(0);
                    vy4Var.a();
                    this.H0 = vy4Var;
                    if (this.r0) {
                        a1(vy4Var);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = oy4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!ej2.o((vy4) list.get(i))) {
                    long W0 = W0(j);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        vy4 vy4Var2 = (vy4) list.get(i2);
                        if (vy4Var2.c() || ej2.K(vy4Var2, j, W0)) {
                            g1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((vy4) list.get(0)).a();
            if (this.r0) {
                vy4 vy4Var3 = this.H0;
                vy4Var3.getClass();
                Y0(vy4Var3.c, false);
                this.s0.c();
            }
            this.H0 = null;
        } else if (py4Var == py4.Final && this.H0 != null) {
            List list2 = oy4Var.a;
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                vy4 vy4Var4 = (vy4) list2.get(i3);
                if (vy4Var4.c() && vy4Var4 != this.H0) {
                    g1(false);
                    return;
                }
            }
        }
    }
}
