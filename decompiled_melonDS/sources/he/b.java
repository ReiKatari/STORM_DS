package he;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String L;

    public /* synthetic */ b(String str, int i2, String str2) {
        this.A = i2;
        this.B = str;
        this.L = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [ie.f] */
    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        Long valueOf;
        boolean z10;
        switch (this.A) {
            case 0:
                String str = this.B;
                String str2 = this.L;
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("SELECT cheat.* FROM game LEFT JOIN cheat_folder ON game.id = cheat_folder.game_id LEFT JOIN cheat ON cheat_folder.id = cheat.cheat_folder_id WHERE game.game_code = ? AND (game.game_checksum IS NULL OR game.game_checksum = ?) AND cheat.enabled = 1");
                try {
                    T.C(1, str);
                    T.C(2, str2);
                    int t5 = p7.m.t(T, "id");
                    int t10 = p7.m.t(T, "cheat_folder_id");
                    int t11 = p7.m.t(T, "cheat_database_id");
                    int t12 = p7.m.t(T, "name");
                    int t13 = p7.m.t(T, "description");
                    int t14 = p7.m.t(T, "code");
                    int t15 = p7.m.t(T, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        String str3 = null;
                        if (T.isNull(t5)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(T.getLong(t5));
                        }
                        long j2 = T.getLong(t10);
                        long j10 = T.getLong(t11);
                        String n10 = T.n(t12);
                        if (!T.isNull(t13)) {
                            str3 = T.n(t13);
                        }
                        String str4 = str3;
                        String n11 = T.n(t14);
                        if (((int) T.getLong(t15)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new ie.b(valueOf, j2, j10, n10, str4, n11, z10));
                    }
                    return arrayList;
                } finally {
                }
            default:
                String str5 = this.B;
                String str6 = this.L;
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("SELECT * FROM game WHERE game_code = ? AND game_checksum = ?");
                try {
                    T.C(1, str5);
                    T.C(2, str6);
                    int t16 = p7.m.t(T, "id");
                    int t17 = p7.m.t(T, "name");
                    int t18 = p7.m.t(T, "game_code");
                    int t19 = p7.m.t(T, "game_checksum");
                    Long l10 = null;
                    if (T.N()) {
                        if (!T.isNull(t16)) {
                            l10 = Long.valueOf(T.getLong(t16));
                        }
                        l10 = new ie.f(l10, T.n(t17), T.n(t18), T.n(t19));
                    }
                    return l10;
                } finally {
                }
        }
    }
}
