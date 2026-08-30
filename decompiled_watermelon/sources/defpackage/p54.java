package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p54  reason: default package */
/* loaded from: classes.dex */
public final class p54 implements am5 {
    public final Context a;
    public final w37 b;

    public p54(Context context, w37 w37Var) {
        this.a = context;
        this.b = w37Var;
    }

    @Override // defpackage.am5
    public final Bitmap a(rg5 rg5Var) {
        rg5Var.getClass();
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(rg5Var.d);
            if (openInputStream == null) {
                return null;
            }
            Bitmap G = nk2.G(openInputStream);
            openInputStream.close();
            return G;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.am5
    public final wm5 b(rg5 rg5Var) {
        rg5Var.getClass();
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(rg5Var.d);
            if (openInputStream == null) {
                return null;
            }
            wm5 H = nk2.H(rg5Var, openInputStream);
            openInputStream.close();
            return H;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0006, B:6:0x0016, B:16:0x0026, B:23:0x0047, B:30:0x0057, B:32:0x005d, B:36:0x0065, B:38:0x0069, B:40:0x00b0, B:39:0x008d, B:5:0x0012), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:3:0x0006, B:6:0x0016, B:16:0x0026, B:23:0x0047, B:30:0x0057, B:32:0x005d, B:36:0x0065, B:38:0x0069, B:40:0x00b0, B:39:0x008d, B:5:0x0012), top: B:45:0x0006 }] */
    @Override // defpackage.am5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rg5 c(android.net.Uri r34, android.net.Uri r35) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p54.c(android.net.Uri, android.net.Uri):rg5");
    }

    @Override // defpackage.am5
    public final Object d(rg5 rg5Var, qg qgVar) {
        return rg5Var.d;
    }
}
