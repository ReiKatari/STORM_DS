package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.github.junrar.unpack.ppm.RangeCoder;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx5  reason: default package */
/* loaded from: classes.dex */
public final class kx5 {
    public final Context a;
    public final mp b;
    public final nr1 c = new nr1(RangeCoder.TOP, 2);
    public final Map d = Collections.synchronizedMap(new LinkedHashMap());

    public kx5(Context context, mp mpVar) {
        this.a = context;
        this.b = mpVar;
    }

    public static final Bitmap a(kx5 kx5Var, String str, pq5 pq5Var) {
        File file;
        Bitmap c;
        Context context = kx5Var.a;
        nr1 nr1Var = kx5Var.c;
        Bitmap bitmap = (Bitmap) nr1Var.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        mp mpVar = kx5Var.b;
        byte[] bArr = pq5Var.m;
        Uri uri = pq5Var.d;
        if (bArr != null) {
            c = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            c.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        } else {
            File externalCacheDir = context.getExternalCacheDir();
            File file2 = null;
            if (externalCacheDir != null) {
                file = new File(externalCacheDir, "rom_icons");
            } else {
                file = null;
            }
            if (file != null && file.isDirectory()) {
                File file3 = new File(file, str);
                if (file3.isFile()) {
                    c = BitmapFactory.decodeFile(file3.getAbsolutePath());
                }
            }
            pw5 c2 = mpVar.c(pq5Var.c);
            if (c2 == null && (c2 = mpVar.a(zl1.g(context, uri))) == null && (c2 = mpVar.b(uri)) == null) {
                c = null;
            } else {
                c = c2.c(pq5Var);
                if (c != null && file != null) {
                    File externalCacheDir2 = context.getExternalCacheDir();
                    if (externalCacheDir2 != null) {
                        file2 = new File(externalCacheDir2, "rom_icons");
                    }
                    if (file2 != null && (file2.isDirectory() || file2.mkdirs())) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, str));
                            c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (c != null) {
            nr1Var.put(str, c);
        }
        return c;
    }
}
