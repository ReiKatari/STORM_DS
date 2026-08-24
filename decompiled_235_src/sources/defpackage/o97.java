package defpackage;

import android.view.ViewConfiguration;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o97  reason: default package */
/* loaded from: classes.dex */
public final class o97 extends zg1 implements yy4, fy0 {
    public ag1 m0;
    public h37 n0;
    public boolean o0 = true;
    public final ro5 p0 = new ro5(this, 23);
    public final v80 q0 = nb3.c(Integer.MAX_VALUE, null, null, 6);
    public os0 r0;
    public final ow6 s0;
    public yy4 t0;

    public o97(ag1 ag1Var, h37 h37Var) {
        this.m0 = ag1Var;
        this.n0 = h37Var;
        rg rgVar = new rg(this, 8);
        oy4 oy4Var = jw6.a;
        ow6 ow6Var = new ow6(null, null, null, rgVar);
        R0(ow6Var);
        this.s0 = ow6Var;
    }

    @Override // defpackage.yy4
    public final void I() {
        this.s0.I();
        yy4 yy4Var = this.t0;
        if (yy4Var != null) {
            yy4Var.I();
        }
    }

    @Override // defpackage.z64
    public final void J0() {
        this.r0 = new os0(ViewConfiguration.get(jw2.z(this).getContext()), 8);
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        os0 os0Var = this.r0;
        if (this.o0) {
            List list = oy4Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((vy4) list.get(i)).i == 2) {
                    if (os0Var != null && this.t0 == null) {
                        a61 a61Var = new a61(1, this, os0Var);
                        oy4 oy4Var2 = jw6.a;
                        ow6 ow6Var = new ow6(null, null, null, a61Var);
                        R0(ow6Var);
                        this.t0 = ow6Var;
                    }
                } else {
                    i++;
                }
            }
        }
        this.s0.w(oy4Var, py4Var, j);
        yy4 yy4Var = this.t0;
        if (yy4Var != null) {
            yy4Var.w(oy4Var, py4Var, j);
        }
    }
}
