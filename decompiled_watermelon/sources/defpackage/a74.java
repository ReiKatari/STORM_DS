package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a74  reason: default package */
/* loaded from: classes.dex */
public final class a74 extends d93 {
    public static Long Q(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.d93, defpackage.j62
    public final wd1 I(jk4 jk4Var) {
        Path path;
        Path path2;
        jk4 jk4Var2;
        Long l;
        Long l2;
        jk4Var.getClass();
        path = Paths.get(jk4Var.A.r(), new String[0]);
        path.getClass();
        Long l3 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = jk4.B;
                jk4Var2 = hm1.o(path2.toString());
            } else {
                jk4Var2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = Q(creationTime);
            } else {
                l = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = Q(lastModifiedTime);
            } else {
                l2 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = Q(lastAccessTime);
            }
            return new wd1(isRegularFile, isDirectory, jk4Var2, valueOf, l, l2, l3);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.d93, defpackage.j62
    public final void i(jk4 jk4Var, jk4 jk4Var2) {
        Path path;
        Path path2;
        jk4Var.getClass();
        jk4Var2.getClass();
        try {
            path = Paths.get(jk4Var.A.r(), new String[0]);
            path.getClass();
            path2 = Paths.get(jk4Var2.A.r(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            f81.j("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.d93
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
