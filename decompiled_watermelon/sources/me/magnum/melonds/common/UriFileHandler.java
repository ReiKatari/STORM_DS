package me.magnum.melonds.common;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import me.magnum.melonds.MelonDSApplication;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class UriFileHandler {
    public static final List c = l07.c0("w", "a");
    public final MelonDSApplication a;
    public final w37 b;

    public UriFileHandler(MelonDSApplication melonDSApplication, w37 w37Var) {
        w37Var.getClass();
        this.a = melonDSApplication;
        this.b = w37Var;
    }

    public final int open(String str, String str2) {
        str.getClass();
        str2.getClass();
        Uri parse = Uri.parse(str);
        List list = c;
        list.getClass();
        boolean z = false;
        if (zg6.u0(str2, list, 0) != null) {
            z = true;
        }
        Integer num = null;
        if (b53.x(parse.getScheme(), "file")) {
            String path = parse.getPath();
            if (path == null) {
                return -1;
            }
            File file = new File(path);
            if (z) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                } catch (Exception unused) {
                }
            }
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, ParcelFileDescriptor.parseMode(str2));
            if (open != null) {
                num = Integer.valueOf(open.detachFd());
            }
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
        MelonDSApplication melonDSApplication = this.a;
        if (z) {
            w37 w37Var = this.b;
            try {
                if (w37Var.d(parse)) {
                    ParcelFileDescriptor openFileDescriptor = melonDSApplication.getContentResolver().openFileDescriptor(parse, str2);
                    if (openFileDescriptor != null) {
                        num = Integer.valueOf(openFileDescriptor.detachFd());
                    }
                } else {
                    uh1 c2 = w37Var.c(parse);
                    if (c2 != null) {
                        ParcelFileDescriptor openFileDescriptor2 = melonDSApplication.getContentResolver().openFileDescriptor(c2.j(), str2);
                        if (openFileDescriptor2 != null) {
                            num = Integer.valueOf(openFileDescriptor2.detachFd());
                        }
                    }
                }
            } catch (FileNotFoundException | Exception unused2) {
            }
        } else {
            ParcelFileDescriptor openFileDescriptor3 = melonDSApplication.getContentResolver().openFileDescriptor(parse, str2);
            if (openFileDescriptor3 != null) {
                num = Integer.valueOf(openFileDescriptor3.detachFd());
            }
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
