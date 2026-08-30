package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et5  reason: default package */
/* loaded from: classes.dex */
public final class et5 {
    public final Context a;
    public final nn4 b;

    public et5(Context context, nn4 nn4Var) {
        this.a = context;
        this.b = nn4Var;
    }

    public final File a(rg5 rg5Var, ft5 ft5Var, boolean z) {
        File file = new File(new File(this.a.getFilesDir(), "ss_screenshots"), String.valueOf(rg5Var.d.hashCode()));
        if (!file.isDirectory() && z && !file.mkdirs()) {
            return null;
        }
        int i = ft5Var.a;
        return new File(file, i + ".png");
    }

    public final Uri b(rg5 rg5Var, ft5 ft5Var) {
        rg5Var.getClass();
        File a = a(rg5Var, ft5Var, false);
        if (a != null && a.isFile()) {
            return Uri.fromFile(a);
        }
        return null;
    }

    public final void c(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile != null) {
            ka3 ka3Var = this.b.d;
            String uri = fromFile.toString();
            ss3 ss3Var = (ss3) ka3Var.B;
            for (String str : ss3Var.snapshot().keySet()) {
                if (str.startsWith(uri) && str.length() > uri.length() && str.charAt(uri.length()) == '\n') {
                    ss3Var.remove(str);
                }
            }
        }
    }
}
