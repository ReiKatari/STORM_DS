package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc2  reason: default package */
/* loaded from: classes.dex */
public final class bc2 extends ac2 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ fc2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc2(fc2 fc2Var, File file) {
        super(file);
        file.getClass();
        this.f = fc2Var;
    }

    @Override // defpackage.gc2
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                eo2 eo2Var = this.f.R.c;
                if (eo2Var != null) {
                    eo2Var.o(file, new x1(file));
                }
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
