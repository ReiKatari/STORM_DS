package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx4  reason: default package */
/* loaded from: classes.dex */
public final class zx4 {
    public final defpackage.l61 a;
    public final android.content.Context b;
    public final defpackage.ca6 c;
    public final defpackage.gy3 d;
    public final defpackage.hb4 e;
    public android.view.textclassifier.TextClassifier f;
    public final defpackage.vs4 g;
    public final java.lang.Object h;

    public zx4(defpackage.l61 r1, android.content.Context r2, defpackage.ca6 r3, defpackage.gy3 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            hb4 r1 = new hb4
            r1.<init>()
            r0.e = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.g = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.h = r1
            return
    }

    public static final java.lang.Object a(defpackage.zx4 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.s41 r21) {
            r0 = r16
            r1 = r21
            hb4 r2 = r0.e
            vs4 r3 = r0.g
            boolean r4 = r1 instanceof defpackage.xx4
            if (r4 == 0) goto L1b
            r4 = r1
            xx4 r4 = (defpackage.xx4) r4
            int r5 = r4.f0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f0 = r5
            goto L20
        L1b:
            xx4 r4 = new xx4
            r4.<init>(r0, r1)
        L20:
            java.lang.Object r1 = r4.d0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.f0
            jg7 r7 = defpackage.jg7.a
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L58
            if (r6 == r9) goto L48
            if (r6 != r8) goto L42
            long r5 = r4.Z
            hb4 r2 = r4.Y
            java.lang.Object r0 = r4.X
            android.view.textclassifier.TextClassification r0 = defpackage.oc3.c(r0)
            java.lang.CharSequence r4 = r4.R
            defpackage.oi2.Y(r1)
            goto Ld2
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L48:
            long r11 = r4.Z
            hb4 r6 = r4.Y
            java.lang.Object r13 = r4.X
            android.view.textclassifier.TextClassifier r13 = defpackage.oc3.d(r13)
            java.lang.CharSequence r14 = r4.R
            defpackage.oi2.Y(r1)
            goto L75
        L58:
            defpackage.oi2.Y(r1)
            r1 = r17
            r4.R = r1
            r6 = r20
            r4.X = r6
            r4.Y = r2
            r11 = r18
            r4.Z = r11
            r4.f0 = r9
            java.lang.Object r13 = r2.e(r4)
            if (r13 != r5) goto L72
            goto Lcf
        L72:
            r14 = r1
            r13 = r6
            r6 = r2
        L75:
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> L92
            h07 r1 = (defpackage.h07) r1     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L9c
            nq6 r15 = defpackage.by4.a     // Catch: java.lang.Throwable -> L92
            long r8 = r1.b     // Catch: java.lang.Throwable -> L92
            boolean r8 = defpackage.k47.b(r11, r8)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L94
            java.lang.CharSequence r1 = r1.a     // Catch: java.lang.Throwable -> L92
            boolean r1 = defpackage.nb3.k(r14, r1)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L94
            r1 = 1
        L90:
            r15 = 1
            goto L96
        L92:
            r0 = move-exception
            goto Le3
        L94:
            r1 = 0
            goto L90
        L96:
            if (r1 != r15) goto L9c
            r6.h(r10)
            return r7
        L9c:
            r6.h(r10)
            defpackage.yr1.t()
            int r1 = defpackage.k47.f(r11)
            int r6 = defpackage.k47.e(r11)
            android.view.textclassifier.TextClassification$Request$Builder r1 = defpackage.yr1.m(r14, r1, r6)
            android.os.LocaleList r0 = r0.b()
            android.view.textclassifier.TextClassification$Request$Builder r0 = defpackage.yr1.l(r1, r0)
            android.view.textclassifier.TextClassification$Request r0 = defpackage.yr1.n(r0)
            android.view.textclassifier.TextClassification r0 = defpackage.yr1.o(r13, r0)
            r4.R = r14
            r4.X = r0
            r4.Y = r2
            r4.Z = r11
            r1 = 2
            r4.f0 = r1
            java.lang.Object r1 = r2.e(r4)
            if (r1 != r5) goto Ld0
        Lcf:
            return r5
        Ld0:
            r5 = r11
            r4 = r14
        Ld2:
            h07 r1 = new h07     // Catch: java.lang.Throwable -> Lde
            r1.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> Lde
            r3.setValue(r1)     // Catch: java.lang.Throwable -> Lde
            r2.h(r10)
            return r7
        Lde:
            r0 = move-exception
            r2.h(r10)
            throw r0
        Le3:
            r6.h(r10)
            throw r0
    }

    public final android.os.LocaleList b() {
            r3 = this;
            r0 = 0
            gy3 r3 = r3.d
            if (r3 == 0) goto L3d
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r3, r2)
            r1.<init>(r2)
            java.util.List r3 = r3.A
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r3.next()
            fy3 r2 = (defpackage.fy3) r2
            java.util.Locale r2 = r2.a
            r1.add(r2)
            goto L16
        L28:
            java.util.Locale[] r3 = new java.util.Locale[r0]
            java.lang.Object[] r3 = r1.toArray(r3)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r3)
            return r0
        L3d:
            android.os.LocaleList r3 = new android.os.LocaleList
            bt r1 = defpackage.nx4.a
            gy3 r1 = r1.H()
            java.util.List r1 = r1.A
            java.lang.Object r0 = r1.get(r0)
            fy3 r0 = (defpackage.fy3) r0
            java.util.Locale r0 = r0.a
            java.util.Locale[] r0 = new java.util.Locale[]{r0}
            r3.<init>(r0)
            return r3
    }
}
