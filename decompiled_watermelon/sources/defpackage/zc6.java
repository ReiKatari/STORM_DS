package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zc6  reason: default package */
/* loaded from: classes.dex */
public abstract class zc6 {
    public static final boolean a;
    public static final yc6 b;
    public static final yc6 c;
    public static final List d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new yc6(0, Date.class);
            c = new yc6(1, Timestamp.class);
            d = Collections.unmodifiableList(Arrays.asList(vc6.b, uc6.b, xc6.b));
            return;
        }
        b = null;
        c = null;
        d = Collections.EMPTY_LIST;
    }
}
