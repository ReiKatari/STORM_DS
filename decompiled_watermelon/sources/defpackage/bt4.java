package defpackage;

import android.os.Build;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt4  reason: default package */
/* loaded from: classes.dex */
public abstract class bt4 {
    public static final at4 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        at4 at4Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                at4Var = new Object();
                a = at4Var;
            }
        }
        at4Var = null;
        a = at4Var;
    }
}
