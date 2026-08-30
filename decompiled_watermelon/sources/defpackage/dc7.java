package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc7  reason: default package */
/* loaded from: classes.dex */
public abstract class dc7 {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }
}
