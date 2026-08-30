package kf;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8273a;

    /* renamed from: b  reason: collision with root package name */
    public final com.squareup.picasso.a0 f8274b;

    public v1(Context context, com.squareup.picasso.a0 a0Var) {
        this.f8273a = context;
        this.f8274b = a0Var;
    }

    public final File a(ze.a aVar, oe.j0 j0Var, boolean z10) {
        File file = new File(new File(this.f8273a.getFilesDir(), "ss_screenshots"), String.valueOf(aVar.f15056d.hashCode()));
        if (!file.isDirectory() && z10 && !file.mkdirs()) {
            return null;
        }
        int i2 = j0Var.f10942a;
        return new File(file, i2 + ".png");
    }

    public final Uri b(ze.a aVar, oe.j0 j0Var) {
        aVar.getClass();
        File a10 = a(aVar, j0Var, false);
        if (a10 != null && a10.isFile()) {
            return Uri.fromFile(a10);
        }
        return null;
    }

    public final void c(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile != null) {
            a0.b bVar = this.f8274b.f3185d;
            String uri = fromFile.toString();
            com.squareup.picasso.o oVar = (com.squareup.picasso.o) bVar.B;
            for (String str : oVar.snapshot().keySet()) {
                if (str.startsWith(uri) && str.length() > uri.length() && str.charAt(uri.length()) == '\n') {
                    oVar.remove(str);
                }
            }
        }
    }
}
