package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl0  reason: default package */
/* loaded from: classes.dex */
public abstract class wl0 implements ro2 {
    public final l61 A;
    public final int B;
    public final m80 L;

    public wl0(l61 l61Var, int i, m80 m80Var) {
        this.A = l61Var;
        this.B = i;
        this.L = m80Var;
    }

    @Override // defpackage.le2
    public Object b(ne2 ne2Var, r41 r41Var) {
        Object C = g04.C(new b0(ne2Var, this, null, 12), r41Var);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return jg7.a;
    }

    @Override // defpackage.ro2
    public final le2 c(l61 l61Var, int i, m80 m80Var) {
        l61 l61Var2 = this.A;
        l61 N = l61Var.N(l61Var2);
        m80 m80Var2 = m80.SUSPEND;
        m80 m80Var3 = this.L;
        int i2 = this.B;
        if (m80Var == m80Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            m80Var = m80Var3;
        }
        if (nb3.k(N, l61Var2) && i == i2 && m80Var == m80Var3) {
            return this;
        }
        return f(N, i, m80Var);
    }

    public String d() {
        return null;
    }

    public abstract Object e(r35 r35Var, r41 r41Var);

    public abstract wl0 f(l61 l61Var, int i, m80 m80Var);

    public le2 g() {
        return null;
    }

    public ul0 i(w61 w61Var) {
        int i = this.B;
        if (i == -3) {
            i = -2;
        }
        a71 a71Var = a71.ATOMIC;
        z zVar = new z(this, (r41) null, 13);
        r35 r35Var = new r35(mb3.M(w61Var, this.A), nb3.c(i, this.L, null, 4));
        a71Var.invoke(zVar, r35Var, r35Var);
        return r35Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        vt1 vt1Var = vt1.A;
        l61 l61Var = this.A;
        if (l61Var != vt1Var) {
            arrayList.add("context=" + l61Var);
        }
        int i = this.B;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        m80 m80Var = m80.SUSPEND;
        m80 m80Var2 = this.L;
        if (m80Var2 != m80Var) {
            arrayList.add("onBufferOverflow=" + m80Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return lb1.q(sb, gt0.P0(arrayList, ", ", null, null, null, 62), ']');
    }
}
