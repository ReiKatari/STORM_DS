package defpackage;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o26  reason: default package */
/* loaded from: classes.dex */
public final class o26 {
    public final File a;
    public final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public o26(Context context) {
        this.a = new File(context.getFilesDir(), "shader-compatibility.log");
    }
}
