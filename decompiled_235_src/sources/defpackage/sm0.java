package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sm0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String L;

    public /* synthetic */ sm0(String str, int i, String str2) {
        this.A = i;
        this.B = str;
        this.L = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [lp2] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        Long valueOf;
        String R;
        boolean z;
        int i = this.A;
        Long l = null;
        String str = this.L;
        String str2 = this.B;
        switch (i) {
            case 0:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("SELECT cheat.* FROM game LEFT JOIN cheat_folder ON game.id = cheat_folder.game_id LEFT JOIN cheat ON cheat_folder.id = cheat.cheat_folder_id WHERE game.game_code = ? AND (? IS NULL OR game.game_checksum IS NULL OR game.game_checksum = ?) AND cheat.enabled = 1");
                try {
                    i0.w(1, str2);
                    i0.w(2, str);
                    i0.w(3, str);
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "cheat_folder_id");
                    int B3 = ej2.B(i0, "cheat_database_id");
                    int B4 = ej2.B(i0, "name");
                    int B5 = ej2.B(i0, "description");
                    int B6 = ej2.B(i0, "code");
                    int B7 = ej2.B(i0, "enabled");
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(B));
                        }
                        long j = i0.getLong(B2);
                        long j2 = i0.getLong(B3);
                        String R2 = i0.R(B4);
                        if (i0.isNull(B5)) {
                            R = null;
                        } else {
                            R = i0.R(B5);
                        }
                        String R3 = i0.R(B6);
                        if (((int) i0.getLong(B7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new zm0(valueOf, j, j2, R2, R, R3, z));
                    }
                    return arrayList;
                } finally {
                }
            default:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT * FROM game WHERE game_code = ? AND game_checksum = ?");
                try {
                    i0.w(1, str2);
                    i0.w(2, str);
                    int B8 = ej2.B(i0, "id");
                    int B9 = ej2.B(i0, "name");
                    int B10 = ej2.B(i0, "game_code");
                    int B11 = ej2.B(i0, "game_checksum");
                    if (i0.f0()) {
                        if (!i0.isNull(B8)) {
                            l = Long.valueOf(i0.getLong(B8));
                        }
                        l = new lp2(l, i0.R(B9), i0.R(B10), i0.R(B11));
                    }
                    return l;
                } finally {
                }
        }
    }
}
