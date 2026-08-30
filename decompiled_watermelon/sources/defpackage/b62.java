package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b62  reason: default package */
/* loaded from: classes.dex */
public final class b62 implements s52 {
    public final File a;

    public b62(File file) {
        this.a = file;
    }

    @Override // defpackage.s52
    public final Object a(j11 j11Var) {
        String str = jk4.B;
        File file = this.a;
        return new wb6(new d62(hm1.p(file), j62.A, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(q72.I(file)), i81.DISK);
    }
}
