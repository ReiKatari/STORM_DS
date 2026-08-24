package com.github.junrar;

import com.github.junrar.rarfile.FileHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class LocalFolderExtractor {
    private static final ry3 logger = sy3.d(LocalFolderExtractor.class);
    private final File folderDestination;

    public LocalFolderExtractor(File file) {
        this.folderDestination = file;
    }

    private File createFile(FileHeader fileHeader, File file) {
        String fileName = fileHeader.getFileName();
        File file2 = new File(file, fileName);
        String canonicalPath = file2.getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            if (!file2.exists()) {
                try {
                    return makeFile(file, fileName);
                } catch (IOException e) {
                    logger.d(file2.getName(), e);
                }
            }
            return file2;
        }
        i.m(lb1.A("Rar contains file with invalid path: '", canonicalPath, "'"));
        return null;
    }

    private File makeFile(File file, String str) {
        String[] split = str.split("\\\\");
        int length = split.length;
        if (length == 1) {
            return new File(file, str);
        }
        if (length > 1) {
            String str2 = "";
            for (int i = 0; i < split.length - 1; i++) {
                StringBuilder s = lb1.s(str2);
                s.append(File.separator);
                s.append(split[i]);
                str2 = s.toString();
                new File(file, str2).mkdir();
            }
            StringBuilder s2 = lb1.s(str2);
            s2.append(File.separator);
            s2.append(split[split.length - 1]);
            File file2 = new File(file, s2.toString());
            file2.createNewFile();
            return file2;
        }
        return null;
    }

    public File createDirectory(FileHeader fileHeader) {
        String str;
        if (fileHeader.isDirectory()) {
            str = fileHeader.getFileName();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        File file = new File(this.folderDestination, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            if (canonicalPath.startsWith(this.folderDestination.getCanonicalPath())) {
                return file;
            }
            throw new IllegalStateException("Rar contains invalid path: '" + canonicalPath + "'");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public File extract(Archive archive, FileHeader fileHeader) {
        File createFile = createFile(fileHeader, this.folderDestination);
        FileOutputStream fileOutputStream = new FileOutputStream(createFile);
        try {
            archive.extractFile(fileHeader, fileOutputStream);
            fileOutputStream.close();
            return createFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
