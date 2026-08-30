package jc;

import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f7794b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f7795c;

    /* renamed from: d  reason: collision with root package name */
    public int f7796d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7797e;

    @Override // jc.g
    public final File a() {
        boolean z10 = this.f7797e;
        File file = this.f7803a;
        if (!z10 && this.f7795c == null) {
            File[] listFiles = file.listFiles();
            this.f7795c = listFiles;
            if (listFiles == null) {
                this.f7797e = true;
            }
        }
        File[] fileArr = this.f7795c;
        if (fileArr != null && this.f7796d < fileArr.length) {
            fileArr.getClass();
            int i2 = this.f7796d;
            this.f7796d = i2 + 1;
            return fileArr[i2];
        } else if (!this.f7794b) {
            this.f7794b = true;
            return file;
        } else {
            return null;
        }
    }
}
