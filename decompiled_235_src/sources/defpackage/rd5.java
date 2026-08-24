package defpackage;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd5  reason: default package */
/* loaded from: classes.dex */
public final class rd5 extends ny0 {
    @Override // defpackage.ny0
    public final ss0 g(InputStream inputStream) {
        FileHeader fileHeader;
        BufferedInputStream bufferedInputStream;
        Object obj;
        try {
            Archive archive = new Archive(inputStream);
            List<FileHeader> fileHeaders = archive.getFileHeaders();
            if (fileHeaders != null) {
                Iterator<T> it = fileHeaders.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        FileHeader fileHeader2 = (FileHeader) obj;
                        if (!fileHeader2.isDirectory()) {
                            String fileName = fileHeader2.getFileName();
                            if (fileName == null) {
                                fileName = "";
                            }
                            if (ny0.i(fileName)) {
                                break;
                            }
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                fileHeader = (FileHeader) obj;
            } else {
                fileHeader = null;
            }
            if (fileHeader == null) {
                archive.close();
                return null;
            }
            InputStream inputStream2 = archive.getInputStream(fileHeader);
            inputStream2.getClass();
            if (inputStream2 instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) inputStream2;
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream2, 8192);
            }
            return new ss0(new ss0(bufferedInputStream, archive, 2), new lj6(fileHeader.getFullUnpackSize()), 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
