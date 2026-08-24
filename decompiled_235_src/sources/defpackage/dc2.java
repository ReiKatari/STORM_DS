package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc2  reason: default package */
/* loaded from: classes.dex */
public final class dc2 extends ac2 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ fc2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc2(fc2 fc2Var, File file) {
        super(file);
        file.getClass();
        this.e = fc2Var;
    }

    @Override // defpackage.gc2
    public final File a() {
        eo2 eo2Var;
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null && (eo2Var = this.e.R.c) != null) {
                eo2Var.o(file, new x1(file));
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.c;
        fileArr3.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }
}
