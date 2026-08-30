package ab;

import ab.a;
import ab.b;
import java.sql.Date;
import java.sql.Timestamp;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f694a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0000a f695b;

    /* renamed from: c  reason: collision with root package name */
    public static final b.a f696c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f697d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f694a = z10;
        if (z10) {
            new e(0, Date.class);
            new e(1, Timestamp.class);
            f695b = a.f687b;
            f696c = b.f689b;
            f697d = d.f691b;
            return;
        }
        f695b = null;
        f696c = null;
        f697d = null;
    }
}
