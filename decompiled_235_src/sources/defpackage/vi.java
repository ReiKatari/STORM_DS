package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi  reason: default package */
/* loaded from: classes.dex */
public final class vi {
    public final kh a;
    public final File b;

    public vi(kh khVar, Context context) {
        khVar.getClass();
        this.a = khVar;
        this.b = new File(context.getNoBackupFilesDir(), "ra_offline/ledger");
    }

    public final File a(String str, String str2) {
        return new File(new File(this.b, yh2.L(xs6.X(str))), yh2.L(xs6.X(str2)).concat(".pb"));
    }
}
