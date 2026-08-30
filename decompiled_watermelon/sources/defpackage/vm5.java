package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vm5  reason: default package */
/* loaded from: classes.dex */
public final class vm5 {
    public final Context a;
    public final ap b;
    public final ss3 c = new ss3(16777216, 1);
    public final Map d = Collections.synchronizedMap(new LinkedHashMap());

    public vm5(Context context, ap apVar) {
        this.a = context;
        this.b = apVar;
    }

    public static final Bitmap a(vm5 vm5Var, String str, rg5 rg5Var) {
        File file;
        Bitmap a;
        Context context = vm5Var.a;
        ss3 ss3Var = vm5Var.c;
        Bitmap bitmap = (Bitmap) ss3Var.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        byte[] bArr = rg5Var.m;
        if (bArr != null) {
            a = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            a.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
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
                    a = BitmapFactory.decodeFile(file3.getAbsolutePath());
                }
            }
            am5 a2 = vm5Var.b.a(uh1.g(context, rg5Var.d));
            if (a2 == null) {
                a = null;
            } else {
                a = a2.a(rg5Var);
                if (a != null && file != null) {
                    File externalCacheDir2 = context.getExternalCacheDir();
                    if (externalCacheDir2 != null) {
                        file2 = new File(externalCacheDir2, "rom_icons");
                    }
                    if (file2 != null && (file2.isDirectory() || file2.mkdirs())) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, str));
                            a.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (a != null) {
            ss3Var.put(str, a);
        }
        return a;
    }
}
