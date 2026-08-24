package defpackage;

import android.os.Build;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d25  reason: default package */
/* loaded from: classes.dex */
public abstract class d25 {
    public static final c25 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        c25 c25Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                c25Var = new Object();
                a = c25Var;
            }
        }
        c25Var = null;
        a = c25Var;
    }
}
