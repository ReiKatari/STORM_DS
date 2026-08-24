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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf4  reason: default package */
/* loaded from: classes.dex */
public final class pf4 extends xf3 {
    public static Long U(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.xf3, defpackage.db2
    public final ai1 D(lt4 lt4Var) {
        Path path;
        Path path2;
        lt4 lt4Var2;
        Long l;
        Long l2;
        lt4Var.getClass();
        path = Paths.get(lt4Var.A.s(), new String[0]);
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
                String str = lt4.B;
                lt4Var2 = w31.p(path2.toString());
            } else {
                lt4Var2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = U(creationTime);
            } else {
                l = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = U(lastModifiedTime);
            } else {
                l2 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = U(lastAccessTime);
            }
            return new ai1(isRegularFile, isDirectory, lt4Var2, valueOf, l, l2, l3);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.xf3, defpackage.db2
    public final void h(lt4 lt4Var, lt4 lt4Var2) {
        Path path;
        Path path2;
        lt4Var.getClass();
        lt4Var2.getClass();
        try {
            path = Paths.get(lt4Var.A.s(), new String[0]);
            path.getClass();
            path2 = Paths.get(lt4Var2.A.s(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            e41.i("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.xf3
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
