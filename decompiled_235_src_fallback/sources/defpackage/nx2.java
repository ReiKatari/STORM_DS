package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx2  reason: default package */
/* loaded from: classes.dex */
public final class nx2 {
    public static final android.util.Range f = null;
    public final defpackage.lg0 a;
    public final defpackage.ex6 b;
    public final defpackage.ex6 c;
    public final defpackage.ex6 d;
    public final defpackage.ex6 e;

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 120(0x78, float:1.68E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r1)
            defpackage.nx2.f = r0
            return
    }

    public nx2(defpackage.lg0 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.a = r2
            mx2 r2 = new mx2
            r0 = 0
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.b = r0
            mx2 r2 = new mx2
            r0 = 1
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.c = r0
            mx2 r2 = new mx2
            r0 = 2
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.d = r0
            mx2 r2 = new mx2
            r0 = 3
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.e = r0
            return
    }

    public static java.util.List a(java.util.List r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            yt1 r2 = defpackage.yt1.A
            return r2
        L9:
            java.lang.Object r0 = defpackage.gt0.H0(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = defpackage.gt0.m1(r0)
            r1 = 1
            java.util.List r2 = defpackage.gt0.D0(r2, r1)
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            r0.retainAll(r1)
            goto L1c
        L2c:
            return r0
    }

    public final android.util.Range[] b(java.util.List r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
            r2 = 1
            if (r2 > r0) goto L69
            r3 = 3
            if (r0 >= r3) goto L69
            java.util.Set r0 = defpackage.gt0.o1(r5)
            java.util.List r0 = defpackage.gt0.k1(r0)
            int r0 = r0.size()
            if (r0 == r2) goto L1a
            goto L69
        L1a:
            r0 = 0
            java.lang.Object r2 = r5.get(r0)
            android.util.Size r2 = (android.util.Size) r2
            java.util.List r4 = r4.c(r2)
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L2c
            goto L2d
        L2c:
            r4 = r1
        L2d:
            if (r4 != 0) goto L30
            goto L69
        L30:
            int r5 = r5.size()
            r1 = 2
            if (r5 != r1) goto L60
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r4.next()
            r2 = r1
            android.util.Range r2 = (android.util.Range) r2
            java.lang.Comparable r3 = r2.getLower()
            java.lang.Comparable r2 = r2.getUpper()
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L40
            r5.add(r1)
            goto L40
        L5f:
            r4 = r5
        L60:
            android.util.Range[] r5 = new android.util.Range[r0]
            java.lang.Object[] r4 = r4.toArray(r5)
            android.util.Range[] r4 = (android.util.Range[]) r4
            return r4
        L69:
            return r1
    }

    public final java.util.List c(android.util.Size r2) {
            r1 = this;
            r0 = 0
            ex6 r1 = r1.d     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L21
            dr6 r1 = (defpackage.dr6) r1     // Catch: java.lang.Throwable -> L21
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            s35 r1 = r1.c     // Catch: java.lang.Throwable -> L21
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.A     // Catch: java.lang.Throwable -> L21
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            android.util.Range[] r1 = r1.getHighSpeedVideoFpsRangesFor(r2)     // Catch: java.lang.Throwable -> L21
            goto L28
        L1f:
            r1 = r0
            goto L28
        L21:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L28:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 == 0) goto L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            android.util.Range[] r0 = (android.util.Range[]) r0
            if (r0 == 0) goto L3c
            java.util.ArrayList r1 = defpackage.fv.C0(r0)
            java.util.List r1 = defpackage.gt0.k1(r1)
            goto L3e
        L3c:
            yt1 r1 = defpackage.yt1.A
        L3e:
            return r1
    }
}
