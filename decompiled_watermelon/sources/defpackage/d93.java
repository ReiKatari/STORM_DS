package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d93  reason: default package */
/* loaded from: classes.dex */
public class d93 extends j62 {
    @Override // defpackage.j62
    public final List D(jk4 jk4Var) {
        jk4Var.getClass();
        File file = jk4Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!file.exists()) {
                f81.v(jk4Var, "no such file: ");
                return null;
            }
            vd6.d(jk4Var, "failed to list ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(jk4Var.d(str));
        }
        wq0.z0(arrayList);
        return arrayList;
    }

    @Override // defpackage.j62
    public wd1 I(jk4 jk4Var) {
        jk4Var.getClass();
        File file = jk4Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new wd1(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // defpackage.j62
    public final c93 J(jk4 jk4Var) {
        return new c93(new RandomAccessFile(jk4Var.toFile(), "r"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kt6] */
    @Override // defpackage.j62
    public final g76 K(jk4 jk4Var) {
        jk4Var.getClass();
        return new rg4(new FileOutputStream(jk4Var.toFile(), false), new Object());
    }

    @Override // defpackage.j62
    public final sb6 N(jk4 jk4Var) {
        jk4Var.getClass();
        return new t13(new FileInputStream(jk4Var.toFile()), kt6.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kt6] */
    @Override // defpackage.j62
    public final g76 d(jk4 jk4Var) {
        jk4Var.getClass();
        return new rg4(new FileOutputStream(jk4Var.toFile(), true), new Object());
    }

    @Override // defpackage.j62
    public void i(jk4 jk4Var, jk4 jk4Var2) {
        jk4Var.getClass();
        jk4Var2.getClass();
        if (jk4Var.toFile().renameTo(jk4Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + jk4Var + " to " + jk4Var2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.j62
    public final void w(jk4 jk4Var) {
        jk4Var.getClass();
        if (!jk4Var.toFile().mkdir()) {
            wd1 I = I(jk4Var);
            if (I == null || !I.c) {
                vd6.d(jk4Var, "failed to create directory: ");
            }
        }
    }

    @Override // defpackage.j62
    public final void x(jk4 jk4Var) {
        jk4Var.getClass();
        if (!Thread.interrupted()) {
            File file = jk4Var.toFile();
            if (!file.delete() && file.exists()) {
                vd6.d(jk4Var, "failed to delete ");
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }
}
