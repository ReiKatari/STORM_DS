package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ep0  reason: default package */
/* loaded from: classes.dex */
public class ep0 extends g0 {
    public rp4 G0;
    public oy2 H0;

    @Override // defpackage.wy2
    public final void E() {
        g1(true);
    }

    @Override // defpackage.wy2
    public final void L(sh shVar, lp4 lp4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) shVar.c;
        b1();
        if (this.q0 && this.u0 == null) {
            ql2 ql2Var = new ql2(this);
            R0(ql2Var);
            this.u0 = ql2Var;
        }
        if (lp4Var == lp4.Main) {
            if (this.H0 == null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (nk2.r((oy2) arrayList.get(i))) {
                        oy2 oy2Var = (oy2) arrayList.get(0);
                        oy2Var.i = true;
                        this.H0 = oy2Var;
                        if (this.q0) {
                            Z0(oy2Var);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oy2 oy2Var2 = (oy2) arrayList.get(i2);
                if (oy2Var2.i || !oy2Var2.h || oy2Var2.d) {
                    float d = ((fa7) mh7.t(this, ov0.t)).d();
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        oy2 oy2Var3 = (oy2) arrayList.get(i3);
                        long j = oy2Var3.c;
                        oy2 oy2Var4 = this.H0;
                        oy2Var4.getClass();
                        if (Math.abs(mb4.c(mb4.d(j, oy2Var4.c))) > d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (oy2Var3.i || z) {
                            g1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((oy2) arrayList.get(0)).i = true;
            if (this.q0) {
                oy2 oy2Var5 = this.H0;
                oy2Var5.getClass();
                Y0(oy2Var5.c, true);
                this.r0.c();
            }
            this.H0 = null;
        } else if (lp4Var == lp4.Final && this.H0 != null) {
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                oy2 oy2Var6 = (oy2) arrayList.get(i4);
                if (oy2Var6.i && oy2Var6 != this.H0) {
                    g1(true);
                    return;
                }
            }
        }
    }

    @Override // defpackage.g0, defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        super.O(kp4Var, lp4Var, j);
        if (lp4Var == lp4.Main) {
            if (this.G0 == null) {
                if (xm6.e(kp4Var, true)) {
                    rp4 rp4Var = (rp4) kp4Var.a.get(0);
                    rp4Var.a();
                    this.G0 = rp4Var;
                    if (this.q0) {
                        a1(rp4Var);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = kp4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!ve2.p((rp4) list.get(i))) {
                    long W0 = W0(j);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        rp4 rp4Var2 = (rp4) list.get(i2);
                        if (rp4Var2.b() || ve2.H(rp4Var2, j, W0)) {
                            g1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((rp4) list.get(0)).a();
            if (this.q0) {
                rp4 rp4Var3 = this.G0;
                rp4Var3.getClass();
                Y0(rp4Var3.c, false);
                this.r0.c();
            }
            this.G0 = null;
        } else if (lp4Var == lp4.Final && this.G0 != null) {
            List list2 = kp4Var.a;
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                rp4 rp4Var4 = (rp4) list2.get(i3);
                if (rp4Var4.b() && rp4Var4 != this.G0) {
                    g1(false);
                    return;
                }
            }
        }
    }

    @Override // defpackage.g0
    public final boolean d1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.g0
    public final void e1(KeyEvent keyEvent) {
        this.r0.c();
    }

    public final void g1(boolean z) {
        if (z) {
            this.H0 = null;
        } else {
            this.G0 = null;
        }
        X0(z);
    }

    @Override // defpackage.g0, defpackage.up4
    public final void q0() {
        super.q0();
        g1(false);
    }
}
