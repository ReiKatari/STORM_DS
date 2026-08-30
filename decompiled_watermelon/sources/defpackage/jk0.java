package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jk0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String L;

    public /* synthetic */ jk0(String str, int i, String str2) {
        this.A = i;
        this.B = str;
        this.L = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [fk2] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        Long valueOf;
        String q;
        boolean z;
        int i = this.A;
        Long l = null;
        String str = this.L;
        String str2 = this.B;
        switch (i) {
            case 0:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("SELECT cheat.* FROM game LEFT JOIN cheat_folder ON game.id = cheat_folder.game_id LEFT JOIN cheat ON cheat_folder.id = cheat.cheat_folder_id WHERE game.game_code = ? AND (game.game_checksum IS NULL OR game.game_checksum = ?) AND cheat.enabled = 1");
                try {
                    i0.M(1, str2);
                    i0.M(2, str);
                    int r = hi2.r(i0, "id");
                    int r2 = hi2.r(i0, "cheat_folder_id");
                    int r3 = hi2.r(i0, "cheat_database_id");
                    int r4 = hi2.r(i0, "name");
                    int r5 = hi2.r(i0, "description");
                    int r6 = hi2.r(i0, "code");
                    int r7 = hi2.r(i0, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        if (i0.isNull(r)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(r));
                        }
                        long j = i0.getLong(r2);
                        long j2 = i0.getLong(r3);
                        String q2 = i0.q(r4);
                        if (i0.isNull(r5)) {
                            q = null;
                        } else {
                            q = i0.q(r5);
                        }
                        String q3 = i0.q(r6);
                        if (((int) i0.getLong(r7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new rk0(valueOf, j, j2, q2, q, q3, z));
                    }
                    return arrayList;
                } finally {
                }
            default:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT * FROM game WHERE game_code = ? AND game_checksum = ?");
                try {
                    i0.M(1, str2);
                    i0.M(2, str);
                    int r8 = hi2.r(i0, "id");
                    int r9 = hi2.r(i0, "name");
                    int r10 = hi2.r(i0, "game_code");
                    int r11 = hi2.r(i0, "game_checksum");
                    if (i0.a0()) {
                        if (!i0.isNull(r8)) {
                            l = Long.valueOf(i0.getLong(r8));
                        }
                        l = new fk2(l, i0.q(r9), i0.q(r10), i0.q(r11));
                    }
                    return l;
                } finally {
                }
        }
    }
}
