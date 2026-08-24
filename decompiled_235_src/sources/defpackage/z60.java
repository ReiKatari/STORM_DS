package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z60  reason: default package */
/* loaded from: classes.dex */
public final class z60 {
    public static final /* synthetic */ z60 a = new Object();
    public static final String b = a70.class.getSimpleName();

    public static a70 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return b70.A;
        }
        if (i >= 29) {
            return d90.o0;
        }
        if (i >= 28) {
            return xd5.L;
        }
        return cs1.L;
    }
}
