package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip2  reason: default package */
/* loaded from: classes.dex */
public final class ip2 {
    public final m16 a;
    public final tm0 b = new tm0(5);

    public ip2(m16 m16Var) {
        this.a = m16Var;
    }

    public final void a(e36 e36Var, hz3 hz3Var) {
        Long valueOf;
        boolean z;
        if (hz3Var.d()) {
            return;
        }
        if (hz3Var.i() > 999) {
            ln2.U(hz3Var, new bi2(4, this, e36Var));
            return;
        }
        StringBuilder s = lb1.s("SELECT `id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled` FROM `cheat` WHERE `cheat_folder_id` IN (");
        gi2.k(s, hz3Var.i());
        s.append(")");
        j36 i0 = e36Var.i0(s.toString());
        int i = hz3Var.i();
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i0.c(i2, hz3Var.e(i3));
            i2++;
        }
        try {
            int A = ej2.A(i0, "cheat_folder_id");
            if (A == -1) {
                return;
            }
            while (i0.f0()) {
                List list = (List) hz3Var.b(i0.getLong(A));
                if (list != null) {
                    String str = null;
                    if (i0.isNull(0)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(i0.getLong(0));
                    }
                    long j = i0.getLong(1);
                    long j2 = i0.getLong(2);
                    String R = i0.R(3);
                    if (!i0.isNull(4)) {
                        str = i0.R(4);
                    }
                    String str2 = str;
                    String R2 = i0.R(5);
                    if (((int) i0.getLong(6)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(new zm0(valueOf, j, j2, R, str2, R2, z));
                }
            }
        } finally {
            i0.close();
        }
    }

    public final Object b(String str, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new c70(str, 7));
    }

    public final Object c(String str, s41 s41Var) {
        return hv.S(s41Var, this.a, true, false, new c70(str, 8));
    }
}
