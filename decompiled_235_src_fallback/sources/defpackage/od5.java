package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od5  reason: default package */
/* loaded from: classes.dex */
public final class od5 extends defpackage.ao4 {
    public final byte[] d;
    public int e;

    public od5(defpackage.mu r2) {
            r1 = this;
            r1.<init>()
            r0 = 65531(0xfffb, float:9.1828E-41)
            byte[] r2 = r2.a(r0)
            r1.d = r2
            int r2 = r2.length
            r1.e = r2
            return
    }

    @Override // defpackage.ao4
    public final void f() {
            r5 = this;
            int r0 = r5.b
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            if (r1 != 0) goto L25
            int r1 = r5.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            int r1 = r1 << 8
            byte[] r2 = r5.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            int r3 = r5.e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            int r4 = r3 + 1
            r5.e = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            r2 = r2[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            r5.c = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            int r0 = r0 << 8
            r5.b = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f
            return
        L1f:
            e71 r5 = new e71
            r5.<init>()
            throw r5
        L25:
            return
    }
}
