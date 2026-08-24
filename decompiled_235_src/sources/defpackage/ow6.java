package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow6  reason: default package */
/* loaded from: classes.dex */
public final class ow6 extends z64 implements zy4, qh1, yy4 {
    public Object k0;
    public Object l0;
    public Object[] m0;
    public PointerInputEventHandler n0;
    public ap6 o0;
    public oy4 p0 = jw6.a;
    public final ua4 q0;
    public final ua4 r0;
    public final ua4 s0;
    public oy4 t0;
    public long u0;

    public ow6(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.k0 = obj;
        this.l0 = obj2;
        this.m0 = objArr;
        this.n0 = pointerInputEventHandler;
        ua4 ua4Var = new ua4(new mw6[16]);
        this.q0 = ua4Var;
        this.r0 = ua4Var;
        this.s0 = new ua4(new mw6[16]);
        this.u0 = 0L;
    }

    @Override // defpackage.yy4
    public final void I() {
        oy4 oy4Var = this.t0;
        if (oy4Var != null) {
            List list = oy4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((vy4) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        vy4 vy4Var = (vy4) list.get(i2);
                        long j = vy4Var.a;
                        long j2 = vy4Var.c;
                        long j3 = vy4Var.b;
                        float f = vy4Var.e;
                        boolean z = vy4Var.d;
                        arrayList.add(new vy4(j, j3, j2, false, f, j3, j2, z, z, vy4Var.i, 0L, 1.0f, 0L));
                    }
                    oy4 oy4Var2 = new oy4(arrayList, null);
                    this.p0 = oy4Var2;
                    S0(oy4Var2, py4.Initial);
                    S0(oy4Var2, py4.Main);
                    S0(oy4Var2, py4.Final);
                    this.t0 = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.z64
    public final void K0() {
        T0();
    }

    public final Object R0(eo2 eo2Var, r41 r41Var) {
        rj0 rj0Var = new rj0(1, np2.V(r41Var));
        rj0Var.v();
        mw6 mw6Var = new mw6(this, rj0Var);
        synchronized (this.r0) {
            this.q0.b(mw6Var);
            new n36(np2.V(np2.F(eo2Var, mw6Var, mw6Var)), x61.COROUTINE_SUSPENDED).i(jg7.a);
        }
        rj0Var.z(new mc(mw6Var, 27));
        return rj0Var.s();
    }

    public final void S0(oy4 oy4Var, py4 py4Var) {
        rj0 rj0Var;
        rj0 rj0Var2;
        synchronized (this.r0) {
            ua4 ua4Var = this.s0;
            ua4Var.c(ua4Var.L, this.q0);
        }
        try {
            int i = nw6.a[py4Var.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    ua4 ua4Var2 = this.s0;
                    int i2 = ua4Var2.L - 1;
                    Object[] objArr = ua4Var2.A;
                    if (i2 < objArr.length) {
                        while (i2 >= 0) {
                            mw6 mw6Var = (mw6) objArr[i2];
                            if (py4Var == mw6Var.R && (rj0Var2 = mw6Var.L) != null) {
                                mw6Var.L = null;
                                rj0Var2.i(oy4Var);
                            }
                            i2--;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                ua4 ua4Var3 = this.s0;
                Object[] objArr2 = ua4Var3.A;
                int i3 = ua4Var3.L;
                for (int i4 = 0; i4 < i3; i4++) {
                    mw6 mw6Var2 = (mw6) objArr2[i4];
                    if (py4Var == mw6Var2.R && (rj0Var = mw6Var2.L) != null) {
                        mw6Var2.L = null;
                        rj0Var.i(oy4Var);
                    }
                }
            }
            this.s0.g();
        } catch (Throwable th) {
            this.s0.g();
            throw th;
        }
    }

    public final void T0() {
        ap6 ap6Var = this.o0;
        if (ap6Var != null) {
            ap6Var.z(new tx4("Pointer input was reset", 2));
            this.o0 = null;
        }
    }

    @Override // defpackage.qh1
    public final float Y() {
        return nc1.f0(this).u0.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return nc1.f0(this).u0.a();
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
        T0();
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        this.u0 = j;
        if (py4Var == py4.Initial) {
            this.p0 = oy4Var;
        }
        if (this.o0 == null) {
            this.o0 = hv.L(F0(), null, a71.UNDISPATCHED, new ns3(this, null, 12), 1);
        }
        S0(oy4Var, py4Var);
        List list = oy4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!ej2.p((vy4) list.get(i))) {
                    break;
                }
                i++;
            } else {
                oy4Var = null;
                break;
            }
        }
        this.t0 = oy4Var;
    }

    @Override // defpackage.yy4
    public final void x0() {
        T0();
    }
}
