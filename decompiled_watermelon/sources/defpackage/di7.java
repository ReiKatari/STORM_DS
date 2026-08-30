package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: di7  reason: default package */
/* loaded from: classes.dex */
public final class di7 {
    public final sq5 a;
    public final kk0 b = new kk0(18);

    public di7(sq5 sq5Var) {
        this.a = sq5Var;
    }

    public final void a(ls5 ls5Var, eu euVar) {
        bu buVar = (bu) euVar.keySet();
        eu euVar2 = buVar.A;
        if (euVar2.isEmpty()) {
            return;
        }
        if (euVar.L > 999) {
            hk2.M(euVar, new ai7(this, ls5Var, 0));
            return;
        }
        StringBuilder r = wh1.r("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        ve2.k(r, euVar2.L);
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        Iterator it = buVar.iterator();
        int i = 1;
        while (true) {
            au auVar = (au) it;
            if (auVar.hasNext()) {
                i0.M(i, (String) auVar.next());
                i++;
            } else {
                try {
                    break;
                } finally {
                    i0.close();
                }
            }
        }
        int q = hi2.q(i0, "work_spec_id");
        if (q == -1) {
            return;
        }
        while (i0.a0()) {
            List list = (List) euVar.get(i0.q(q));
            if (list != null) {
                byte[] blob = i0.getBlob(0);
                g81 g81Var = g81.b;
                list.add(a53.D(blob));
            }
        }
    }

    public final void b(ls5 ls5Var, eu euVar) {
        bu buVar = (bu) euVar.keySet();
        eu euVar2 = buVar.A;
        if (euVar2.isEmpty()) {
            return;
        }
        if (euVar.L > 999) {
            hk2.M(euVar, new ai7(this, ls5Var, 1));
            return;
        }
        StringBuilder r = wh1.r("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        ve2.k(r, euVar2.L);
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        Iterator it = buVar.iterator();
        int i = 1;
        while (true) {
            au auVar = (au) it;
            if (auVar.hasNext()) {
                i0.M(i, (String) auVar.next());
                i++;
            } else {
                try {
                    break;
                } finally {
                    i0.close();
                }
            }
        }
        int q = hi2.q(i0, "work_spec_id");
        if (q == -1) {
            return;
        }
        while (i0.a0()) {
            List list = (List) euVar.get(i0.q(q));
            if (list != null) {
                list.add(i0.q(0));
            }
        }
    }

    public final ih7 c(String str) {
        str.getClass();
        return (ih7) mh7.X(this.a, true, false, new ok0(str, 17));
    }

    public final xh7 d(String str) {
        str.getClass();
        return (xh7) mh7.X(this.a, true, false, new ok0(str, 16));
    }

    public final void e(long j, String str) {
        str.getClass();
        ((Number) mh7.X(this.a, false, true, new zh7(str, 0, j))).intValue();
    }

    public final void f(int i, String str) {
        str.getClass();
        mh7.X(this.a, false, true, new sl6(str, i, 1));
    }

    public final void g(long j, String str) {
        str.getClass();
        mh7.X(this.a, false, true, new zh7(str, 1, j));
    }

    public final void h(ih7 ih7Var, String str) {
        ih7Var.getClass();
        str.getClass();
        ((Number) mh7.X(this.a, false, true, new h57(5, ih7Var, str))).intValue();
    }

    public final void i(int i, String str) {
        str.getClass();
        mh7.X(this.a, false, true, new sl6(i, str));
    }
}
