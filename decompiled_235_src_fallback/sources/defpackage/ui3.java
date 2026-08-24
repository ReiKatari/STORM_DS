package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui3  reason: default package */
/* loaded from: classes.dex */
public final class ui3 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public ui3(int r2, defpackage.mu r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            r1.h = r0
            r1.b = r2
            byte[] r2 = r3.a(r2)
            r1.a = r2
            return
    }

    public final void a(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L4f
            int r0 = r3.e
            if (r4 >= r0) goto L4f
            int r0 = r3.f
            int r1 = r3.d
            int r0 = r0 - r1
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r5 - r0
            r3.g = r5
            r3.h = r4
            int r5 = r3.d
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            byte[] r4 = r3.a
            if (r5 >= 0) goto L34
            int r1 = r3.b
            int r5 = r5 + r1
            int r1 = r1 - r5
            int r1 = java.lang.Math.min(r1, r0)
            int r2 = r3.d
            java.lang.System.arraycopy(r4, r5, r4, r2, r1)
            int r5 = r3.d
            int r5 = r5 + r1
            r3.d = r5
            int r0 = r0 - r1
            if (r0 != 0) goto L33
            goto L4e
        L33:
            r5 = 0
        L34:
            int r1 = r3.d
            int r1 = r1 - r5
            int r1 = java.lang.Math.min(r0, r1)
            int r2 = r3.d
            java.lang.System.arraycopy(r4, r5, r4, r2, r1)
            int r2 = r3.d
            int r2 = r2 + r1
            r3.d = r2
            int r0 = r0 - r1
            if (r0 > 0) goto L34
            int r4 = r3.e
            if (r4 >= r2) goto L4e
            r3.e = r2
        L4e:
            return
        L4f:
            e71 r3 = new e71
            r3.<init>()
            throw r3
    }
}
