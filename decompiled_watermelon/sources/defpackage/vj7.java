package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj7  reason: default package */
/* loaded from: classes.dex */
public final class vj7 extends rv0 {
    @Override // defpackage.rv0
    public final fq0 g(InputStream inputStream) {
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
                String lowerCase = zg6.U0('.', name, name).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (rv0.d.contains(lowerCase)) {
                    break;
                }
            }
        }
        if (nextEntry == null) {
            return null;
        }
        return new fq0(new BufferedInputStream(zipInputStream, 8192), new w76(nextEntry.getSize()), 1);
    }
}
