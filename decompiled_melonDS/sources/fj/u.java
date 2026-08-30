package fj;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends t {
    public static Long K(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // fj.t, fj.k
    public final f5.e G(x xVar) {
        Path path;
        Path path2;
        x xVar2;
        Long l10;
        Long l11;
        xVar.getClass();
        path = Paths.get(xVar.A.r(), new String[0]);
        path.getClass();
        Long l12 = null;
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
                String str = x.B;
                xVar2 = x8.e.l(path2.toString());
            } else {
                xVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = K(creationTime);
            } else {
                l10 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = K(lastModifiedTime);
            } else {
                l11 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = K(lastAccessTime);
            }
            return new f5.e(isRegularFile, isDirectory, xVar2, valueOf, l10, l11, l12);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // fj.t, fj.k
    public final void i(x xVar, x xVar2) {
        Path path;
        Path path2;
        xVar.getClass();
        xVar2.getClass();
        try {
            path = Paths.get(xVar.A.r(), new String[0]);
            path.getClass();
            path2 = Paths.get(xVar2.A.r(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            j.h("atomic move not supported");
        } catch (NoSuchFileException e6) {
            throw new FileNotFoundException(e6.getMessage());
        }
    }

    @Override // fj.t
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
