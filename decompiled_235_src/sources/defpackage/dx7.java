package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx7  reason: default package */
/* loaded from: classes.dex */
public final class dx7 {
    public final m16 a;
    public final tm0 b = new tm0(18);

    public dx7(m16 m16Var) {
        this.a = m16Var;
    }

    public final void a(e36 e36Var, wu wuVar) {
        tu tuVar = (tu) wuVar.keySet();
        wu wuVar2 = tuVar.A;
        if (wuVar2.isEmpty()) {
            return;
        }
        if (wuVar.L > 999) {
            ln2.T(wuVar, new bx7(this, e36Var, 0));
            return;
        }
        StringBuilder s = lb1.s("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        gi2.k(s, wuVar2.L);
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        Iterator it = tuVar.iterator();
        int i = 1;
        while (true) {
            su suVar = (su) it;
            if (suVar.hasNext()) {
                i0.w(i, (String) suVar.next());
                i++;
            } else {
                try {
                    break;
                } finally {
                    i0.close();
                }
            }
        }
        int A = ej2.A(i0, "work_spec_id");
        if (A == -1) {
            return;
        }
        while (i0.f0()) {
            List list = (List) wuVar.get(i0.R(A));
            if (list != null) {
                byte[] blob = i0.getBlob(0);
                xb1 xb1Var = xb1.b;
                list.add(u24.k(blob));
            }
        }
    }

    public final void b(e36 e36Var, wu wuVar) {
        tu tuVar = (tu) wuVar.keySet();
        wu wuVar2 = tuVar.A;
        if (wuVar2.isEmpty()) {
            return;
        }
        if (wuVar.L > 999) {
            ln2.T(wuVar, new bx7(this, e36Var, 1));
            return;
        }
        StringBuilder s = lb1.s("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        gi2.k(s, wuVar2.L);
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        Iterator it = tuVar.iterator();
        int i = 1;
        while (true) {
            su suVar = (su) it;
            if (suVar.hasNext()) {
                i0.w(i, (String) suVar.next());
                i++;
            } else {
                try {
                    break;
                } finally {
                    i0.close();
                }
            }
        }
        int A = ej2.A(i0, "work_spec_id");
        if (A == -1) {
            return;
        }
        while (i0.f0()) {
            List list = (List) wuVar.get(i0.R(A));
            if (list != null) {
                list.add(i0.R(0));
            }
        }
    }

    public final iw7 c(String str) {
        str.getClass();
        return (iw7) hv.Q(this.a, true, false, new c70(str, 22));
    }

    public final yw7 d(String str) {
        str.getClass();
        return (yw7) hv.Q(this.a, true, false, new c70(str, 21));
    }

    public final void e(long j, String str) {
        str.getClass();
        ((Number) hv.Q(this.a, false, true, new ax7(str, 0, j))).intValue();
    }

    public final void f(int i, String str) {
        str.getClass();
        hv.Q(this.a, false, true, new ox6(str, i, 1));
    }

    public final void g(long j, String str) {
        str.getClass();
        hv.Q(this.a, false, true, new ax7(str, 1, j));
    }

    public final void h(iw7 iw7Var, String str) {
        iw7Var.getClass();
        str.getClass();
        ((Number) hv.Q(this.a, false, true, new ja7(12, iw7Var, str))).intValue();
    }

    public final void i(int i, String str) {
        str.getClass();
        hv.Q(this.a, false, true, new ox6(i, str));
    }
}
