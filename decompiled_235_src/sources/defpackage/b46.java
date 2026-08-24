package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b46  reason: default package */
/* loaded from: classes.dex */
public final class b46 {
    public final Context a;
    public final sw4 b;

    public b46(Context context, sw4 sw4Var) {
        this.a = context;
        this.b = sw4Var;
    }

    public final File a(pq5 pq5Var, c46 c46Var, boolean z) {
        File file = new File(new File(this.a.getFilesDir(), "ss_screenshots"), String.valueOf(pq5Var.d.hashCode()));
        if (!file.isDirectory() && z && !file.mkdirs()) {
            return null;
        }
        int i = c46Var.a;
        return new File(file, i + ".png");
    }

    public final Uri b(pq5 pq5Var, c46 c46Var) {
        pq5Var.getClass();
        File a = a(pq5Var, c46Var, false);
        if (a != null && a.isFile()) {
            return Uri.fromFile(a);
        }
        return null;
    }

    public final void c(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile != null) {
            s63 s63Var = this.b.d;
            String uri = fromFile.toString();
            nr1 nr1Var = (nr1) s63Var.B;
            for (String str : nr1Var.snapshot().keySet()) {
                if (str.startsWith(uri) && str.length() > uri.length() && str.charAt(uri.length()) == '\n') {
                    nr1Var.remove(str);
                }
            }
        }
    }
}
