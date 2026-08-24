package com.github.junrar;

import com.github.junrar.exception.RarException;
import com.github.junrar.rarfile.FileHeader;
import com.github.junrar.volume.VolumeManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Junrar {
    private static final ry3 logger = sy3.d(Junrar.class);

    private static Archive createArchiveOrThrowException(VolumeManager volumeManager, String str) {
        try {
            return new Archive(volumeManager, (UnrarCallback) null, str);
        } catch (RarException | IOException e) {
            logger.v("Error while creating archive", e);
            throw e;
        }
    }

    public static List<File> extract(String str, String str2, String str3) {
        if (str != null && str2 != null) {
            return extract(new File(str), new File(str2), str3);
        }
        i.h("archive and destination must be set");
        return null;
    }

    private static List<File> extractArchiveTo(Archive archive, LocalFolderExtractor localFolderExtractor) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<FileHeader> it = archive.iterator();
            while (it.hasNext()) {
                try {
                    File tryToExtract = tryToExtract(localFolderExtractor, archive, it.next());
                    if (tryToExtract != null) {
                        arrayList.add(tryToExtract);
                    }
                } catch (RarException | IOException e) {
                    logger.v("error extracting the file", e);
                    throw e;
                }
            }
            return arrayList;
        } finally {
            archive.close();
        }
    }

    public static List<ContentDescription> getContentsDescription(File file) {
        validateRarPath(file);
        return getContentsDescriptionFromArchive(createArchiveOrThrowException(file, (String) null));
    }

    private static List<ContentDescription> getContentsDescriptionFromArchive(Archive archive) {
        ArrayList arrayList = new ArrayList();
        try {
            if (archive.isEncrypted()) {
                logger.q("archive is encrypted cannot extract");
                return new ArrayList();
            }
            Iterator<FileHeader> it = archive.iterator();
            while (it.hasNext()) {
                FileHeader next = it.next();
                arrayList.add(new ContentDescription(next.getFileName(), next.getUnpSize()));
            }
            return arrayList;
        } finally {
            archive.close();
        }
    }

    private static File tryToExtract(LocalFolderExtractor localFolderExtractor, Archive archive, FileHeader fileHeader) {
        logger.b(fileHeader.getFileName(), "extracting: {}");
        if (fileHeader.isDirectory()) {
            return localFolderExtractor.createDirectory(fileHeader);
        }
        return localFolderExtractor.extract(archive, fileHeader);
    }

    private static void validateDestinationPath(File file) {
        if (file != null) {
            if (file.exists() && file.isDirectory()) {
                return;
            }
            e41.w(file, "the destination must exist and point to a directory: ");
            return;
        }
        i.h("archive and destination must me set");
    }

    private static void validateRarPath(File file) {
        if (file != null) {
            if (file.exists()) {
                if (file.isFile()) {
                    return;
                }
                e41.A(file.getAbsolutePath(), "First argument should be a file but was ");
                return;
            }
            e41.w(file, "the archive does not exit: ");
            return;
        }
        i.h("archive and destination must me set");
    }

    public static List<ContentDescription> getContentsDescription(InputStream inputStream) {
        return getContentsDescriptionFromArchive(createArchiveOrThrowException(inputStream, (String) null));
    }

    private static Archive createArchiveOrThrowException(InputStream inputStream, String str) {
        try {
            return new Archive(inputStream, str);
        } catch (RarException | IOException e) {
            logger.v("Error while creating archive", e);
            throw e;
        }
    }

    private static Archive createArchiveOrThrowException(File file, String str) {
        try {
            return new Archive(file, str);
        } catch (RarException | IOException e) {
            logger.v("Error while creating archive", e);
            throw e;
        }
    }

    public static List<File> extract(String str, String str2) {
        return extract(str, str2, (String) null);
    }

    public static List<File> extract(File file, File file2) {
        return extract(file, file2, (String) null);
    }

    public static List<File> extract(File file, File file2, String str) {
        validateRarPath(file);
        validateDestinationPath(file2);
        return extractArchiveTo(createArchiveOrThrowException(file, str), new LocalFolderExtractor(file2));
    }

    public static List<File> extract(InputStream inputStream, File file) {
        return extract(inputStream, file, (String) null);
    }

    public static List<File> extract(InputStream inputStream, File file, String str) {
        validateDestinationPath(file);
        return extractArchiveTo(createArchiveOrThrowException(inputStream, str), new LocalFolderExtractor(file));
    }

    public static List<File> extract(VolumeManager volumeManager, File file) {
        validateDestinationPath(file);
        return extractArchiveTo(createArchiveOrThrowException(volumeManager, (String) null), new LocalFolderExtractor(file));
    }

    public static List<File> extract(VolumeManager volumeManager, File file, String str) {
        validateDestinationPath(file);
        return extractArchiveTo(createArchiveOrThrowException(volumeManager, str), new LocalFolderExtractor(file));
    }
}
