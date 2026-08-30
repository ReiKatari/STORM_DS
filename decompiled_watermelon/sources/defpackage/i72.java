package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i72  reason: default package */
/* loaded from: classes.dex */
public final class i72 extends h72 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // defpackage.n72
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d < fileArr.length) {
            fileArr.getClass();
            int i = this.d;
            this.d = i + 1;
            return fileArr[i];
        } else if (!this.b) {
            this.b = true;
            return file;
        } else {
            return null;
        }
    }
}
