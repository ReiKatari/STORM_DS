package defpackage;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae6  reason: default package */
/* loaded from: classes.dex */
public final class ae6 {
    public final File a;
    public final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public ae6(Context context) {
        this.a = new File(context.getFilesDir(), "shader-compatibility.log");
    }
}
