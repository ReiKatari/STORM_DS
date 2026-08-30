package defpackage;

import android.net.Uri;
import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd6  reason: default package */
/* loaded from: classes.dex */
public final class bd6 {
    public final w16 a;
    public final w37 b;

    public bd6(w16 w16Var, w37 w37Var) {
        this.a = w16Var;
        this.b = w37Var;
    }

    public final Uri a(rg5 rg5Var) {
        String i;
        String str;
        Uri j;
        rg5Var.getClass();
        b56 b56Var = (b56) this.a;
        Uri u = b56Var.u(rg5Var);
        w37 w37Var = this.b;
        uh1 b = w37Var.b(u);
        if (b != null) {
            uh1 a = w37Var.a(rg5Var.d);
            Uri uri = null;
            if (a != null && (i = a.i()) != null) {
                if (b56Var.b.getBoolean("save_file_use_srm_extension", false)) {
                    str = "srm";
                } else {
                    str = "sav";
                }
                String L0 = zg6.L0(i, str, i + "." + str);
                String str2 = rg5Var.a;
                Log.i("SramProvider", "resolved save file '" + L0 + "' for rom='" + str2 + "'");
                uh1 f = b.f(L0);
                if (f != null) {
                    Uri j2 = f.j();
                    j2.getClass();
                    return j2;
                }
                uh1 c = b.c("application/*", L0);
                if (c != null) {
                    uri = c.j();
                }
                if (uri == null) {
                    uh1 f2 = b.f(L0);
                    if (f2 != null && (j = f2.j()) != null) {
                        return j;
                    }
                    throw new Exception(wh1.i(b.j(), "Could not create temporary SRAM file at "));
                }
                return uri;
            }
            if (a != null) {
                uri = a.j();
            }
            throw new Exception(wh1.i(uri, "Cannot determine SRAM file name: "));
        }
        throw new Exception(wh1.i(u, "Cannot create root document: "));
    }
}
