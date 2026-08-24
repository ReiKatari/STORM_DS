package me.magnum.melonds.common;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import me.magnum.melonds.MelonDSApplication;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class UriFileHandler {
    public static final List c = hf.c0("w", "a");
    public final MelonDSApplication a;
    public final uh7 b;

    public UriFileHandler(MelonDSApplication melonDSApplication, uh7 uh7Var) {
        uh7Var.getClass();
        this.a = melonDSApplication;
        this.b = uh7Var;
    }

    public final int open(String str, String str2) {
        str.getClass();
        str2.getClass();
        Uri parse = Uri.parse(str);
        List list = c;
        list.getClass();
        boolean z = false;
        if (qs6.n0(str2, list, 0) != null) {
            z = true;
        }
        Integer num = null;
        if (nb3.k(parse.getScheme(), "file")) {
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
            uh7 uh7Var = this.b;
            try {
                if (uh7Var.d(parse)) {
                    ParcelFileDescriptor openFileDescriptor = melonDSApplication.getContentResolver().openFileDescriptor(parse, str2);
                    if (openFileDescriptor != null) {
                        num = Integer.valueOf(openFileDescriptor.detachFd());
                    }
                } else {
                    zl1 c2 = uh7Var.c(parse);
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
