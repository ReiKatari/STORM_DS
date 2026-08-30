package fj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class t extends k {
    @Override // fj.k
    public final List B(x xVar) {
        File file = xVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!file.exists()) {
                j.g(xVar, "no such file: ");
                return null;
            }
            j.n(xVar, "failed to list ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(xVar.d(str));
        }
        zb.o.H(arrayList);
        return arrayList;
    }

    @Override // fj.k
    public f5.e G(x xVar) {
        xVar.getClass();
        File file = xVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new f5.e(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // fj.k
    public final s H(x xVar) {
        return new s(new RandomAccessFile(xVar.toFile(), "r"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, fj.i0] */
    @Override // fj.k
    public final e0 I(x xVar) {
        xVar.getClass();
        return new w(new FileOutputStream(xVar.toFile(), false), new Object());
    }

    @Override // fj.k
    public final g0 J(x xVar) {
        xVar.getClass();
        return new r(new FileInputStream(xVar.toFile()), i0.f4986d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, fj.i0] */
    @Override // fj.k
    public final e0 d(x xVar) {
        xVar.getClass();
        return new w(new FileOutputStream(xVar.toFile(), true), new Object());
    }

    @Override // fj.k
    public void i(x xVar, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        if (xVar.toFile().renameTo(xVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + xVar + " to " + xVar2);
    }

    @Override // fj.k
    public final void t(x xVar) {
        xVar.getClass();
        if (!xVar.toFile().mkdir()) {
            f5.e G = G(xVar);
            if (G == null || !G.f4856c) {
                j.n(xVar, "failed to create directory: ");
            }
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // fj.k
    public final void v(x xVar) {
        xVar.getClass();
        if (!Thread.interrupted()) {
            File file = xVar.toFile();
            if (!file.delete() && file.exists()) {
                j.n(xVar, "failed to delete ");
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }
}
