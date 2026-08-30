package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ji  reason: default package */
/* loaded from: classes.dex */
public final class ji {
    public final yg a;
    public final File b;

    public ji(yg ygVar, Context context) {
        ygVar.getClass();
        this.a = ygVar;
        this.b = new File(context.getNoBackupFilesDir(), "ra_offline/ledger");
    }

    public final File a(String str, String str2) {
        return new File(new File(this.b, nl2.V(gh6.e0(str))), nl2.V(gh6.e0(str2)).concat(".pb"));
    }
}
