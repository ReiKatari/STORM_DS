package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix1  reason: default package */
/* loaded from: classes.dex */
public final class ix1 implements java.util.Comparator {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ ix1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public ix1(java.util.Comparator r2) {
            r1 = this;
            r0 = 3
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.a
            java.lang.Object r7 = r7.b
            switch(r0) {
                case 0: goto L152;
                case 1: goto L127;
                case 2: goto L109;
                case 3: goto Lf1;
                case 4: goto Ld3;
                case 5: goto Lc1;
                case 6: goto La3;
                case 7: goto L85;
                default: goto L7;
            }
        L7:
            jr6 r7 = (defpackage.jr6) r7
            java.util.ArrayList r7 = r7.Z
            hr6 r8 = (defpackage.hr6) r8
            java.util.ArrayList r8 = r8.l
            java.util.Iterator r8 = r8.iterator()
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L81
            java.lang.Object r0 = r8.next()
            ki0 r0 = (defpackage.ki0) r0
            int r0 = r7.indexOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r8.next()
            ki0 r2 = (defpackage.ki0) r2
            int r2 = r7.indexOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r0.compareTo(r2)
            if (r3 <= 0) goto L28
            r0 = r2
            goto L28
        L44:
            hr6 r9 = (defpackage.hr6) r9
            java.util.ArrayList r8 = r9.l
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L81
            java.lang.Object r9 = r8.next()
            ki0 r9 = (defpackage.ki0) r9
            int r9 = r7.indexOf(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L60:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r8.next()
            ki0 r1 = (defpackage.ki0) r1
            int r1 = r7.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r9.compareTo(r1)
            if (r2 <= 0) goto L60
            r9 = r1
            goto L60
        L7c:
            int r1 = defpackage.g04.z(r0, r9)
            goto L84
        L81:
            defpackage.fa6.c()
        L84:
            return r1
        L85:
            ix1 r7 = (defpackage.ix1) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto L8e
            goto La2
        L8e:
            ek4 r8 = (defpackage.ek4) r8
            long r7 = r8.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            ek4 r9 = (defpackage.ek4) r9
            long r8 = r9.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
        La2:
            return r7
        La3:
            tp5 r7 = (defpackage.tp5) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto Lac
            goto Lc0
        Lac:
            ek4 r8 = (defpackage.ek4) r8
            long r7 = r8.j
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            ek4 r9 = (defpackage.ek4) r9
            long r8 = r9.j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
        Lc0:
            return r7
        Lc1:
            lv r7 = (defpackage.lv) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto Lca
            goto Ld2
        Lca:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            int r7 = defpackage.g04.z(r8, r9)
        Ld2:
            return r7
        Ld3:
            ix1 r7 = (defpackage.ix1) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto Ldc
            goto Lf0
        Ldc:
            xa6 r8 = (defpackage.xa6) r8
            int r7 = r8.f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            xa6 r9 = (defpackage.xa6) r9
            int r8 = r9.f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
        Lf0:
            return r7
        Lf1:
            java.util.Comparator r7 = (java.util.Comparator) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto Lfa
            goto L108
        Lfa:
            xa6 r8 = (defpackage.xa6) r8
            sm3 r7 = r8.c
            xa6 r9 = (defpackage.xa6) r9
            sm3 r8 = r9.c
            bk r9 = defpackage.sm3.N0
            int r7 = r9.compare(r7, r8)
        L108:
            return r7
        L109:
            ko5 r7 = (defpackage.ko5) r7
            int r7 = r7.compare(r8, r9)
            if (r7 == 0) goto L112
            goto L126
        L112:
            c6 r8 = (defpackage.c6) r8
            long r7 = r8.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            c6 r9 = (defpackage.c6) r9
            long r8 = r9.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
        L126:
            return r7
        L127:
            android.util.Rational r8 = (android.util.Rational) r8
            android.util.Rational r9 = (android.util.Rational) r9
            android.util.Rational r7 = (android.util.Rational) r7
            float r8 = r8.floatValue()
            float r0 = r7.floatValue()
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13b
            float r0 = r0 / r8
            goto L13d
        L13b:
            float r0 = r8 / r0
        L13d:
            float r8 = r9.floatValue()
            float r7 = r7.floatValue()
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 <= 0) goto L14b
            float r7 = r7 / r8
            goto L14d
        L14b:
            float r7 = r8 / r7
        L14d:
            int r7 = java.lang.Float.compare(r7, r0)
            return r7
        L152:
            o6 r9 = (defpackage.o6) r9
            nx1 r7 = (defpackage.nx1) r7
            java.util.List r0 = r7.p
            java.util.Iterator r0 = r0.iterator()
        L15c:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L177
            java.lang.Object r1 = r0.next()
            r3 = r1
            gx1 r3 = (defpackage.gx1) r3
            long r3 = r3.a
            o75 r5 = r9.a()
            long r5 = r5.a
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L15c
            goto L178
        L177:
            r1 = r2
        L178:
            gx1 r1 = (defpackage.gx1) r1
            if (r1 == 0) goto L17f
            s83 r9 = r1.b
            goto L180
        L17f:
            r9 = r2
        L180:
            o6 r8 = (defpackage.o6) r8
            java.util.List r7 = r7.p
            java.util.Iterator r7 = r7.iterator()
        L188:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L1a2
            java.lang.Object r0 = r7.next()
            r1 = r0
            gx1 r1 = (defpackage.gx1) r1
            long r3 = r1.a
            o75 r1 = r8.a()
            long r5 = r1.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L188
            goto L1a3
        L1a2:
            r0 = r2
        L1a3:
            gx1 r0 = (defpackage.gx1) r0
            if (r0 == 0) goto L1a9
            s83 r2 = r0.b
        L1a9:
            int r7 = defpackage.g04.z(r9, r2)
            return r7
    }
}
