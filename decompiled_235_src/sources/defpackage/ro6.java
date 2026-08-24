package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro6  reason: default package */
/* loaded from: classes.dex */
public final class ro6 {
    public final Context a;
    public final kd6 b;
    public final uh7 c;

    public ro6(Context context, kd6 kd6Var, uh7 uh7Var) {
        this.a = context;
        this.b = kd6Var;
        this.c = uh7Var;
    }

    public final Uri a(pq5 pq5Var) {
        String i;
        String str;
        Uri j;
        Context context = this.a;
        pq5Var.getClass();
        ng6 ng6Var = (ng6) this.b;
        Uri u = ng6Var.u(pq5Var);
        uh7 uh7Var = this.c;
        zl1 b = uh7Var.b(u);
        if (b != null) {
            zl1 a = uh7Var.a(pq5Var.d);
            Uri uri = null;
            if (a != null && (i = a.i()) != null) {
                if (ng6Var.b.getBoolean("save_file_use_srm_extension", false)) {
                    str = "srm";
                } else {
                    str = "sav";
                }
                String F0 = qs6.F0(i, str, i + "." + str);
                Log.i("SramProvider", lb1.n("resolved save file '", F0, "' for rom='", pq5Var.a, "'"));
                zl1 f = b.f(F0);
                if (f != null) {
                    try {
                        if (f.n() > 0) {
                            String concat = F0.concat(".bak");
                            zl1 f2 = b.f(concat);
                            if (f2 == null) {
                                f2 = b.c("application/*", concat);
                            }
                            if (f2 != null) {
                                InputStream openInputStream = context.getContentResolver().openInputStream(f.j());
                                if (openInputStream != null) {
                                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(f2.j());
                                    if (openOutputStream != null) {
                                        f04.w(openInputStream, openOutputStream);
                                        openOutputStream.close();
                                    }
                                    openInputStream.close();
                                }
                                Log.i("SramProvider", "Created shadow backup '" + concat + "'");
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    Uri j2 = f.j();
                    j2.getClass();
                    return j2;
                }
                zl1 c = b.c("application/*", F0);
                if (c != null) {
                    uri = c.j();
                }
                if (uri == null) {
                    zl1 f3 = b.f(F0);
                    if (f3 != null && (j = f3.j()) != null) {
                        return j;
                    }
                    throw new Exception(xg6.n(b.j(), "Could not create temporary SRAM file at "));
                }
                return uri;
            }
            if (a != null) {
                uri = a.j();
            }
            throw new Exception(xg6.n(uri, "Cannot determine SRAM file name: "));
        }
        throw new Exception(xg6.n(u, "Cannot create root document: "));
    }
}
