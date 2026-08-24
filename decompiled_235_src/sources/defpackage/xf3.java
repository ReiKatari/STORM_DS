package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf3  reason: default package */
/* loaded from: classes.dex */
public class xf3 extends db2 {
    @Override // defpackage.db2
    public ai1 D(lt4 lt4Var) {
        lt4Var.getClass();
        File file = lt4Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new ai1(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // defpackage.db2
    public final wf3 F(lt4 lt4Var) {
        return new wf3(new RandomAccessFile(lt4Var.toFile(), "r"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b67, java.lang.Object] */
    @Override // defpackage.db2
    public final ui6 J(lt4 lt4Var) {
        lt4Var.getClass();
        return new up4(new FileOutputStream(lt4Var.toFile(), false), new Object());
    }

    @Override // defpackage.db2
    public final in6 N(lt4 lt4Var) {
        lt4Var.getClass();
        return new a83(new FileInputStream(lt4Var.toFile()), b67.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b67, java.lang.Object] */
    @Override // defpackage.db2
    public final ui6 e(lt4 lt4Var) {
        lt4Var.getClass();
        return new up4(new FileOutputStream(lt4Var.toFile(), true), new Object());
    }

    @Override // defpackage.db2
    public void h(lt4 lt4Var, lt4 lt4Var2) {
        lt4Var.getClass();
        lt4Var2.getClass();
        if (lt4Var.toFile().renameTo(lt4Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + lt4Var + " to " + lt4Var2);
    }

    @Override // defpackage.db2
    public final void n(lt4 lt4Var) {
        lt4Var.getClass();
        if (!lt4Var.toFile().mkdir()) {
            ai1 D = D(lt4Var);
            if (D == null || !D.c) {
                fa6.d(lt4Var, "failed to create directory: ");
            }
        }
    }

    @Override // defpackage.db2
    public final void r(lt4 lt4Var) {
        lt4Var.getClass();
        if (!Thread.interrupted()) {
            File file = lt4Var.toFile();
            if (!file.delete() && file.exists()) {
                fa6.d(lt4Var, "failed to delete ");
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.db2
    public final List x(lt4 lt4Var) {
        lt4Var.getClass();
        File file = lt4Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!file.exists()) {
                e41.u(lt4Var, "no such file: ");
                return null;
            }
            fa6.d(lt4Var, "failed to list ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(lt4Var.d(str));
        }
        jt0.w0(arrayList);
        return arrayList;
    }
}
