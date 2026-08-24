package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj7  reason: default package */
/* loaded from: classes.dex */
public final class kj7 {
    public final defpackage.o41 a;
    public final java.util.concurrent.Executor b;
    public final defpackage.vb6 c;
    public final java.lang.ThreadLocal d;
    public final defpackage.s37 e;
    public final defpackage.o41 f;

    public kj7(defpackage.o41 r2, java.util.concurrent.Executor r3, defpackage.n61 r4) {
            r1 = this;
            r3.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            vb6 r4 = new vb6
            r4.<init>(r3)
            r1.c = r4
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r1.d = r3
            s37 r3 = new s37
            r4 = 1
            r3.<init>(r1, r4)
            r1.e = r3
            n61 r3 = defpackage.f04.F(r3)
            l61 r2 = r2.B
            gu6 r4 = defpackage.oi2.c()
            l61 r2 = r2.N(r4)
            l61 r2 = r2.N(r3)
            o41 r2 = defpackage.g04.i(r2)
            r1.f = r2
            return
    }
}
