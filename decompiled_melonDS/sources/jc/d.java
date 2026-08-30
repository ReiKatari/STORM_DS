package jc;

import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f7799b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f7800c;

    /* renamed from: d  reason: collision with root package name */
    public int f7801d;

    @Override // jc.g
    public final File a() {
        boolean z10 = this.f7799b;
        File file = this.f7803a;
        if (!z10) {
            this.f7799b = true;
            return file;
        }
        File[] fileArr = this.f7800c;
        if (fileArr != null && this.f7801d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f7800c = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f7800c;
        fileArr2.getClass();
        int i2 = this.f7801d;
        this.f7801d = i2 + 1;
        return fileArr2[i2];
    }
}
