package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw7  reason: default package */
/* loaded from: classes.dex */
public abstract class bw7 {
    public static final qa4 a(r94 r94Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            P = np2.Y(Boolean.FALSE);
            xq2Var.l0(P);
        }
        qa4 qa4Var = (qa4) P;
        if ((((i & 14) ^ 6) > 4 && xq2Var.f(r94Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P2 = xq2Var.P();
        if (z || P2 == vs0Var) {
            P2 = new vg2(r94Var, qa4Var, null, 0);
            xq2Var.l0(P2);
        }
        mb3.i(xq2Var, (eo2) P2, r94Var);
        return qa4Var;
    }

    public static final void b(Context context) {
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            ga0.f().b(cw7.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = cw7.b;
            int k0 = c14.k0(strArr.length);
            if (k0 < 16) {
                k0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            for (Map.Entry entry : c14.p0(linkedHashMap, new vr4(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        ga0.f().j(cw7.a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    ga0.f().b(cw7.a, str);
                }
            }
        }
    }
}
