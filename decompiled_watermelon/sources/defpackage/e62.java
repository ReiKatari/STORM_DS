package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e62  reason: default package */
/* loaded from: classes.dex */
public final class e62 implements hb3 {
    public final boolean a;

    public e62(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hb3
    public final String a(Object obj, df4 df4Var) {
        File file = (File) obj;
        if (this.a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
