package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po6  reason: default package */
/* loaded from: classes.dex */
public abstract class po6 {
    public static final boolean a;
    public static final oo6 b;
    public static final oo6 c;
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
            b = new oo6(0, Date.class);
            c = new oo6(1, Timestamp.class);
            d = Collections.unmodifiableList(Arrays.asList(lo6.b, ko6.b, no6.b));
            return;
        }
        b = null;
        c = null;
        d = Collections.EMPTY_LIST;
    }
}
