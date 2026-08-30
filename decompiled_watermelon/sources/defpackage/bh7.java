package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bh7  reason: default package */
/* loaded from: classes.dex */
public abstract class bh7 {
    public static final k24 a(l14 l14Var, tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            L = me2.G(Boolean.FALSE);
            sk2Var.h0(L);
        }
        k24 k24Var = (k24) L;
        if ((((i & 14) ^ 6) > 4 && sk2Var.f(l14Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object L2 = sk2Var.L();
        if (z || L2 == sn1Var) {
            L2 = new ec2(l14Var, k24Var, null, 0);
            sk2Var.h0(L2);
        }
        l.g(sk2Var, (aj2) L2, l14Var);
        return k24Var;
    }

    public static final void b(Context context) {
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            y70.f().b(ch7.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = ch7.b;
            int j0 = zt3.j0(strArr.length);
            if (j0 < 16) {
                j0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            for (Map.Entry entry : zt3.o0(linkedHashMap, new ti4(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        y70.f().j(ch7.a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    y70.f().b(ch7.a, str);
                }
            }
        }
    }
}
