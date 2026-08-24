package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk1  reason: default package */
/* loaded from: classes.dex */
public final class dk1 {
    public final java.lang.String a;
    public final long[] b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public boolean e;
    public boolean f;
    public defpackage.bk1 g;
    public int h;
    public long i;
    public final /* synthetic */ defpackage.kk1 j;

    public dk1(defpackage.kk1 r6, java.lang.String r7) {
            r5 = this;
            r5.<init>()
            r7.getClass()
            r5.j = r6
            r5.a = r7
            r6.getClass()
            r6 = 2
            long[] r0 = new long[r6]
            r5.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r7 = 46
            r0.append(r7)
            int r7 = r0.length()
            r1 = 0
        L2f:
            if (r1 >= r6) goto L61
            r0.append(r1)
            java.util.ArrayList r2 = r5.c
            kk1 r3 = r5.j
            lt4 r3 = r3.A
            java.lang.String r4 = r0.toString()
            lt4 r3 = r3.d(r4)
            r2.add(r3)
            java.lang.String r2 = ".tmp"
            r0.append(r2)
            java.util.ArrayList r2 = r5.d
            kk1 r3 = r5.j
            lt4 r3 = r3.A
            java.lang.String r4 = r0.toString()
            lt4 r3 = r3.d(r4)
            r2.add(r3)
            r0.setLength(r7)
            int r1 = r1 + 1
            goto L2f
        L61:
            return
    }

    public final defpackage.fk1 a() {
            r9 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            boolean r0 = r9.e
            if (r0 != 0) goto L7
            goto L6f
        L7:
            kk1 r0 = r9.j
            boolean r1 = r0.h0
            if (r1 != 0) goto L16
            bk1 r1 = r9.g
            if (r1 != 0) goto L6f
            boolean r1 = r9.f
            if (r1 == 0) goto L16
            goto L6f
        L16:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            long[] r1 = r9.b
            java.lang.Object r1 = r1.clone()
            r8 = r1
            long[] r8 = (long[]) r8
            r1 = 0
            r2 = r1
        L26:
            r3 = 2
            if (r2 >= r3) goto L4e
            ik1 r3 = r0.B     // Catch: java.io.FileNotFoundException -> L5a
            java.util.ArrayList r4 = r9.c     // Catch: java.io.FileNotFoundException -> L5a
            java.lang.Object r4 = r4.get(r2)     // Catch: java.io.FileNotFoundException -> L5a
            lt4 r4 = (defpackage.lt4) r4     // Catch: java.io.FileNotFoundException -> L5a
            in6 r3 = r3.N(r4)     // Catch: java.io.FileNotFoundException -> L5a
            boolean r4 = r0.h0     // Catch: java.io.FileNotFoundException -> L5a
            if (r4 == 0) goto L3c
            goto L48
        L3c:
            int r4 = r9.h     // Catch: java.io.FileNotFoundException -> L5a
            int r4 = r4 + 1
            r9.h = r4     // Catch: java.io.FileNotFoundException -> L5a
            ck1 r4 = new ck1     // Catch: java.io.FileNotFoundException -> L5a
            r4.<init>(r3, r0, r9)     // Catch: java.io.FileNotFoundException -> L5a
            r3 = r4
        L48:
            r7.add(r3)     // Catch: java.io.FileNotFoundException -> L5a
            int r2 = r2 + 1
            goto L26
        L4e:
            fk1 r2 = new fk1     // Catch: java.io.FileNotFoundException -> L5a
            kk1 r3 = r9.j     // Catch: java.io.FileNotFoundException -> L5a
            java.lang.String r4 = r9.a     // Catch: java.io.FileNotFoundException -> L5a
            long r5 = r9.i     // Catch: java.io.FileNotFoundException -> L5a
            r2.<init>(r3, r4, r5, r7, r8)     // Catch: java.io.FileNotFoundException -> L5a
            return r2
        L5a:
            int r2 = r7.size()
        L5e:
            if (r1 >= r2) goto L6c
            java.lang.Object r3 = r7.get(r1)
            int r1 = r1 + 1
            in6 r3 = (defpackage.in6) r3
            defpackage.yy7.b(r3)
            goto L5e
        L6c:
            r0.F(r9)     // Catch: java.io.IOException -> L6f
        L6f:
            r9 = 0
            return r9
    }
}
