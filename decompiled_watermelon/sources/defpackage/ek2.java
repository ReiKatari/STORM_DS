package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ek2  reason: default package */
/* loaded from: classes.dex */
public final class ek2 {
    public final sq5 a;
    public final kk0 b = new kk0(5);

    public ek2(sq5 sq5Var) {
        this.a = sq5Var;
    }

    public final void a(ls5 ls5Var, cs3 cs3Var) {
        Long valueOf;
        boolean z;
        if (cs3Var.e()) {
            return;
        }
        if (cs3Var.j() > 999) {
            hk2.N(cs3Var, new gi2(2, this, ls5Var));
            return;
        }
        StringBuilder r = wh1.r("SELECT `id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled` FROM `cheat` WHERE `cheat_folder_id` IN (");
        ve2.k(r, cs3Var.j());
        r.append(")");
        ns5 i0 = ls5Var.i0(r.toString());
        int j = cs3Var.j();
        int i = 1;
        for (int i2 = 0; i2 < j; i2++) {
            i0.g(i, cs3Var.f(i2));
            i++;
        }
        try {
            int q = hi2.q(i0, "cheat_folder_id");
            if (q == -1) {
                return;
            }
            while (i0.a0()) {
                List list = (List) cs3Var.b(i0.getLong(q));
                if (list != null) {
                    String str = null;
                    if (i0.isNull(0)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(i0.getLong(0));
                    }
                    long j2 = i0.getLong(1);
                    long j3 = i0.getLong(2);
                    String q2 = i0.q(3);
                    if (!i0.isNull(4)) {
                        str = i0.q(4);
                    }
                    String str2 = str;
                    String q3 = i0.q(5);
                    if (((int) i0.getLong(6)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(new rk0(valueOf, j2, j3, q2, str2, q3, z));
                }
            }
        } finally {
            i0.close();
        }
    }
}
