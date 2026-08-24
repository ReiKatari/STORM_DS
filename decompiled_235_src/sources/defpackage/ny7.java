package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny7  reason: default package */
/* loaded from: classes.dex */
public final class ny7 extends ny0 {
    @Override // defpackage.ny0
    public final ss0 g(InputStream inputStream) {
        ZipEntry nextEntry;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                nextEntry = null;
                break;
            } else if (!nextEntry.isDirectory()) {
                String name = nextEntry.getName();
                name.getClass();
                if (ny0.i(name)) {
                    break;
                }
            }
        }
        if (nextEntry == null) {
            return null;
        }
        return new ss0(new BufferedInputStream(zipInputStream, 8192), new lj6(nextEntry.getSize()), 1);
    }
}
