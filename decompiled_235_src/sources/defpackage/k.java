package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public abstract class k {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final yw2 c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        a = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        b = config;
        c = new yw2((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !qs6.v0(str)) {
            String R0 = qs6.R0('#', str, str);
            String R02 = qs6.R0('?', R0, R0);
            return mimeTypeMap.getMimeTypeFromExtension(qs6.O0('.', qs6.O0('/', R02, R02), ""));
        }
        return null;
    }

    public static final boolean c(Uri uri) {
        if (nb3.k(uri.getScheme(), "file") && nb3.k((String) gt0.J0(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int d(ge7 ge7Var, y56 y56Var) {
        if (ge7Var instanceof pj1) {
            return ((pj1) ge7Var).m;
        }
        int i = j.a[y56Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Integer.MAX_VALUE;
            }
            i.d();
            return 0;
        }
        return Integer.MIN_VALUE;
    }
}
