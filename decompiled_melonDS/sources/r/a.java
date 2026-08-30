package r;

import h7.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends p7.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f12555c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f12556d = new c(1);

    /* renamed from: b  reason: collision with root package name */
    public final b f12557b = new b();

    public static a D() {
        if (f12555c != null) {
            return f12555c;
        }
        synchronized (a.class) {
            try {
                if (f12555c == null) {
                    f12555c = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12555c;
    }
}
