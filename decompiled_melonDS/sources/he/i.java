package he;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final k7.t f6470a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6471b = new c(4);

    public i(k7.t tVar) {
        this.f6470a = tVar;
    }

    public final void a(t7.a aVar, a1.q qVar) {
        Long valueOf;
        boolean z10;
        if (qVar.e()) {
            return;
        }
        if (qVar.j() > 999) {
            p7.k.x(qVar, new g(2, this, aVar));
            return;
        }
        StringBuilder t5 = w.d.t("SELECT `id`,`cheat_folder_id`,`cheat_database_id`,`name`,`description`,`code`,`enabled` FROM `cheat` WHERE `cheat_folder_id` IN (");
        p7.o.b(t5, qVar.j());
        t5.append(")");
        t7.c T = aVar.T(t5.toString());
        int j2 = qVar.j();
        int i2 = 1;
        for (int i10 = 0; i10 < j2; i10++) {
            T.g(i2, qVar.f(i10));
            i2++;
        }
        try {
            int s10 = p7.m.s(T, "cheat_folder_id");
            if (s10 == -1) {
                return;
            }
            while (T.N()) {
                List list = (List) qVar.b(T.getLong(s10));
                if (list != null) {
                    String str = null;
                    if (T.isNull(0)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(T.getLong(0));
                    }
                    long j10 = T.getLong(1);
                    long j11 = T.getLong(2);
                    String n10 = T.n(3);
                    if (!T.isNull(4)) {
                        str = T.n(4);
                    }
                    String str2 = str;
                    String n11 = T.n(5);
                    if (((int) T.getLong(6)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    list.add(new ie.b(valueOf, j10, j11, n10, str2, n11, z10));
                }
            }
        } finally {
            T.close();
        }
    }
}
