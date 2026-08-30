package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uk6  reason: default package */
/* loaded from: classes.dex */
public final class uk6 extends yy3 implements vp4, od1, up4 {
    public Object j0;
    public Object k0;
    public Object[] l0;
    public PointerInputEventHandler m0;
    public kd6 n0;
    public kp4 o0 = pk6.a;
    public final o24 p0;
    public final o24 q0;
    public final o24 r0;
    public kp4 s0;
    public long t0;

    public uk6(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.j0 = obj;
        this.k0 = obj2;
        this.l0 = objArr;
        this.m0 = pointerInputEventHandler;
        o24 o24Var = new o24(new sk6[16]);
        this.p0 = o24Var;
        this.q0 = o24Var;
        this.r0 = new o24(new sk6[16]);
        this.t0 = 0L;
    }

    @Override // defpackage.yy3
    public final void K0() {
        T0();
    }

    @Override // defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        this.t0 = j;
        if (lp4Var == lp4.Initial) {
            this.o0 = kp4Var;
        }
        if (this.n0 == null) {
            this.n0 = tq5.w(F0(), null, s31.UNDISPATCHED, new ys3(this, null, 11), 1);
        }
        S0(kp4Var, lp4Var);
        List list = kp4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!ve2.q((rp4) list.get(i))) {
                    break;
                }
                i++;
            } else {
                kp4Var = null;
                break;
            }
        }
        this.s0 = kp4Var;
    }

    public final Object R0(aj2 aj2Var, j11 j11Var) {
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        sk6 sk6Var = new sk6(this, ih0Var);
        synchronized (this.q0) {
            this.p0.b(sk6Var);
            new rs5(nk2.J(nk2.v(aj2Var, sk6Var, sk6Var)), p31.COROUTINE_SUSPENDED).k(o27.a);
        }
        ih0Var.z(new yb(28, sk6Var));
        return ih0Var.v();
    }

    public final void S0(kp4 kp4Var, lp4 lp4Var) {
        ih0 ih0Var;
        ih0 ih0Var2;
        synchronized (this.q0) {
            o24 o24Var = this.r0;
            o24Var.c(o24Var.L, this.p0);
        }
        try {
            int i = tk6.a[lp4Var.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    o24 o24Var2 = this.r0;
                    int i2 = o24Var2.L - 1;
                    Object[] objArr = o24Var2.A;
                    if (i2 < objArr.length) {
                        while (i2 >= 0) {
                            sk6 sk6Var = (sk6) objArr[i2];
                            if (lp4Var == sk6Var.R && (ih0Var2 = sk6Var.L) != null) {
                                sk6Var.L = null;
                                ih0Var2.k(kp4Var);
                            }
                            i2--;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                o24 o24Var3 = this.r0;
                Object[] objArr2 = o24Var3.A;
                int i3 = o24Var3.L;
                for (int i4 = 0; i4 < i3; i4++) {
                    sk6 sk6Var2 = (sk6) objArr2[i4];
                    if (lp4Var == sk6Var2.R && (ih0Var = sk6Var2.L) != null) {
                        sk6Var2.L = null;
                        ih0Var.k(kp4Var);
                    }
                }
            }
            this.r0.h();
        } catch (Throwable th) {
            this.r0.h();
            throw th;
        }
    }

    public final void T0() {
        kd6 kd6Var = this.n0;
        if (kd6Var != null) {
            kd6Var.u(new po4("Pointer input was reset", 2));
            this.n0 = null;
        }
    }

    @Override // defpackage.vc1
    public final void a() {
        T0();
    }

    @Override // defpackage.od1
    public final float b() {
        return l.P(this).t0.b();
    }

    @Override // defpackage.up4
    public final void k0() {
        T0();
    }

    @Override // defpackage.od1
    public final float o() {
        return l.P(this).t0.o();
    }

    @Override // defpackage.up4
    public final void q0() {
        kp4 kp4Var = this.s0;
        if (kp4Var != null) {
            List list = kp4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((rp4) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        rp4 rp4Var = (rp4) list.get(i2);
                        long j = rp4Var.a;
                        long j2 = rp4Var.c;
                        long j3 = rp4Var.b;
                        float f = rp4Var.e;
                        boolean z = rp4Var.d;
                        arrayList.add(new rp4(j, j3, j2, false, f, j3, j2, z, z, rp4Var.i, 0L, 1.0f, 0L));
                    }
                    kp4 kp4Var2 = new kp4(arrayList, null);
                    this.o0 = kp4Var2;
                    S0(kp4Var2, lp4.Initial);
                    S0(kp4Var2, lp4.Main);
                    S0(kp4Var2, lp4.Final);
                    this.s0 = null;
                    return;
                }
            }
        }
    }
}
