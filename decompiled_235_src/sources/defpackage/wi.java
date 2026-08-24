package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi  reason: default package */
/* loaded from: classes.dex */
public final class wi {
    public final kh a;
    public final File b;

    public wi(kh khVar, Context context) {
        khVar.getClass();
        this.a = khVar;
        this.b = new File(context.getNoBackupFilesDir(), "ra_offline/prefetch");
    }

    public final File a(String str, String str2) {
        return new File(new File(this.b, yh2.L(xs6.X(str))), yh2.L(xs6.X(str2)).concat(".pb"));
    }
}
