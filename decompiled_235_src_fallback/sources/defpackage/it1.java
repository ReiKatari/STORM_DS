package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it1  reason: default package */
/* loaded from: classes.dex */
public final class it1 {
    public int a;
    public final defpackage.r54 b;
    public defpackage.r54 c;
    public defpackage.r54 d;
    public int e;
    public int f;

    public it1(defpackage.r54 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            r1.b = r2
            r1.c = r2
            return
    }

    public final void a() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r54 r0 = r1.b
            r1.c = r0
            r0 = 0
            r1.f = r0
            return
    }

    public final boolean b() {
            r4 = this;
            r54 r0 = r4.c
            re7 r0 = r0.b
            p54 r0 = r0.b()
            r1 = 6
            int r1 = r0.a(r1)
            r2 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.R
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.A
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            int r4 = r4.e
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r4 != r0) goto L26
            return r2
        L26:
            r4 = 0
            return r4
    }
}
