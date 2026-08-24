package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya2  reason: default package */
/* loaded from: classes.dex */
public final class ya2 implements zh3 {
    public final boolean a;

    public ya2(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zh3
    public final String a(Object obj, fo4 fo4Var) {
        File file = (File) obj;
        if (this.a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
