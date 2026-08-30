package zd;

import ij.i;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import oe.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends d {
    @Override // zd.d
    public final i g(InputStream inputStream) {
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
                String lowerCase = vc.h.x0('.', name, name).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (d.f15046d.contains(lowerCase)) {
                    break;
                }
            }
        }
        if (nextEntry == null) {
            return null;
        }
        return new i(new BufferedInputStream(zipInputStream, 8192), new o0(nextEntry.getSize()), 1);
    }
}
