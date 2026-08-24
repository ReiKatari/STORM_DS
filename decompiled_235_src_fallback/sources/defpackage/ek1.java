package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek1  reason: default package */
/* loaded from: classes.dex */
public final class ek1 {
    public final java.lang.String a;
    public final long[] b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public boolean e;
    public boolean f;
    public defpackage.bk1 g;
    public int h;
    public final /* synthetic */ defpackage.lk1 i;

    public ek1(defpackage.lk1 r6, java.lang.String r7) {
            r5 = this;
            r5.<init>()
            r5.i = r6
            r5.a = r7
            r6 = 2
            long[] r0 = new long[r6]
            r5.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            r5.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            r5.d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r7 = 46
            r0.append(r7)
            int r7 = r0.length()
            r1 = 0
        L29:
            if (r1 >= r6) goto L5b
            r0.append(r1)
            java.util.ArrayList r2 = r5.c
            lk1 r3 = r5.i
            lt4 r3 = r3.A
            java.lang.String r4 = r0.toString()
            lt4 r3 = r3.d(r4)
            r2.add(r3)
            java.lang.String r2 = ".tmp"
            r0.append(r2)
            java.util.ArrayList r2 = r5.d
            lk1 r3 = r5.i
            lt4 r3 = r3.A
            java.lang.String r4 = r0.toString()
            lt4 r3 = r3.d(r4)
            r2.add(r3)
            r0.setLength(r7)
            int r1 = r1 + 1
            goto L29
        L5b:
            return
    }

    public final defpackage.gk1 a() {
            r7 = this;
            boolean r0 = r7.e
            r1 = 0
            if (r0 != 0) goto L6
            goto L3b
        L6:
            bk1 r0 = r7.g
            if (r0 != 0) goto L3b
            boolean r0 = r7.f
            if (r0 == 0) goto Lf
            goto L3b
        Lf:
            java.util.ArrayList r0 = r7.c
            int r2 = r0.size()
            r3 = 0
        L16:
            lk1 r4 = r7.i
            if (r3 >= r2) goto L2f
            java.lang.Object r5 = r0.get(r3)
            lt4 r5 = (defpackage.lt4) r5
            jk1 r6 = r4.l0
            boolean r5 = r6.v(r5)
            if (r5 != 0) goto L2c
            r4.A(r7)     // Catch: java.io.IOException -> L2b
        L2b:
            return r1
        L2c:
            int r3 = r3 + 1
            goto L16
        L2f:
            int r0 = r7.h
            int r0 = r0 + 1
            r7.h = r0
            gk1 r0 = new gk1
            r0.<init>(r4, r7)
            return r0
        L3b:
            return r1
    }
}
