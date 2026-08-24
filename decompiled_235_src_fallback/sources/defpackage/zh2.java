package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh2  reason: default package */
/* loaded from: classes.dex */
public final class zh2 implements java.util.Comparator {
    public static final defpackage.zh2 b = null;
    public static final defpackage.zh2 c = null;
    public static final defpackage.zh2 d = null;
    public static final defpackage.zh2 e = null;
    public static final defpackage.zh2 f = null;
    public final /* synthetic */ int a;

    static {
            zh2 r0 = new zh2
            r1 = 0
            r0.<init>(r1)
            defpackage.zh2.b = r0
            zh2 r0 = new zh2
            r1 = 1
            r0.<init>(r1)
            defpackage.zh2.c = r0
            zh2 r0 = new zh2
            r1 = 2
            r0.<init>(r1)
            defpackage.zh2.d = r0
            zh2 r0 = new zh2
            r1 = 3
            r0.<init>(r1)
            defpackage.zh2.e = r0
            zh2 r0 = new zh2
            r1 = 4
            r0.<init>(r1)
            defpackage.zh2.f = r0
            return
    }

    public /* synthetic */ zh2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r7 = r7.a
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = -1
            r2 = 0
            r3 = 1
            switch(r7) {
                case 0: goto L3d0;
                case 1: goto L39a;
                case 2: goto L37e;
                case 3: goto L348;
                case 4: goto L320;
                case 5: goto L307;
                case 6: goto L2ee;
                case 7: goto L2d9;
                case 8: goto L2c4;
                case 9: goto L286;
                case 10: goto L26b;
                case 11: goto L25a;
                case 12: goto L23e;
                case 13: goto L221;
                case 14: goto L20c;
                case 15: goto L1f7;
                case 16: goto L1de;
                case 17: goto L1a8;
                case 18: goto L19b;
                case 19: goto L184;
                case 20: goto L17b;
                case 21: goto L154;
                case 22: goto L13b;
                case 23: goto L12a;
                case 24: goto L111;
                case 25: goto L104;
                case 26: goto Lfa;
                case 27: goto Le9;
                case 28: goto L7d;
                default: goto Lb;
            }
        Lb:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r7 = r8.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r1 = r7.length()
            r3 = r2
        L1d:
            if (r3 >= r1) goto L2f
            char r4 = r7.charAt(r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L2c
            r8.append(r4)
        L2c:
            int r3 = r3 + 1
            goto L1d
        L2f:
            java.lang.String r7 = r8.toString()
            java.lang.Integer r7 = defpackage.xs6.h0(r7)
            if (r7 == 0) goto L3e
            int r7 = r7.intValue()
            goto L3f
        L3e:
            r7 = r0
        L3f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r8 = r9.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r1 = r8.length()
        L54:
            if (r2 >= r1) goto L66
            char r3 = r8.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L63
            r9.append(r3)
        L63:
            int r2 = r2 + 1
            goto L54
        L66:
            java.lang.String r8 = r9.toString()
            java.lang.Integer r8 = defpackage.xs6.h0(r8)
            if (r8 == 0) goto L74
            int r0 = r8.intValue()
        L74:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L7d:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r1 = r8.length()
            r3 = r2
        L8c:
            if (r3 >= r1) goto L9e
            char r4 = r8.charAt(r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L9b
            r7.append(r4)
        L9b:
            int r3 = r3 + 1
            goto L8c
        L9e:
            java.lang.String r7 = r7.toString()
            java.lang.Integer r7 = defpackage.xs6.h0(r7)
            if (r7 == 0) goto Lad
            int r7 = r7.intValue()
            goto Lae
        Lad:
            r7 = r0
        Lae:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r1 = r9.length()
        Lc0:
            if (r2 >= r1) goto Ld2
            char r3 = r9.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto Lcf
            r8.append(r3)
        Lcf:
            int r2 = r2 + 1
            goto Lc0
        Ld2:
            java.lang.String r8 = r8.toString()
            java.lang.Integer r8 = defpackage.xs6.h0(r8)
            if (r8 == 0) goto Le0
            int r0 = r8.intValue()
        Le0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        Le9:
            vr4 r9 = (defpackage.vr4) r9
            java.lang.Object r7 = r9.B
            java.lang.Integer r7 = (java.lang.Integer) r7
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r8 = r8.B
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        Lfa:
            en6 r8 = (defpackage.en6) r8
            en6 r9 = (defpackage.en6) r9
            int r7 = r8.B
            int r8 = r9.B
            int r7 = r7 - r8
            return r7
        L104:
            hm4 r9 = (defpackage.hm4) r9
            java.lang.String r7 = r9.d
            hm4 r8 = (defpackage.hm4) r8
            java.lang.String r8 = r8.d
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L111:
            java.io.File r8 = (java.io.File) r8
            long r7 = r8.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.io.File r9 = (java.io.File) r9
            long r8 = r9.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L12a:
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r7 = r8.B
            java.lang.Float r7 = (java.lang.Float) r7
            vr4 r9 = (defpackage.vr4) r9
            java.lang.Object r8 = r9.B
            java.lang.Float r8 = (java.lang.Float) r8
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L13b:
            y54 r8 = (defpackage.y54) r8
            int r7 = r8.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            y54 r9 = (defpackage.y54) r9
            int r8 = r9.a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L154:
            android.util.Size r8 = (android.util.Size) r8
            int r7 = r8.getWidth()
            long r0 = (long) r7
            int r7 = r8.getHeight()
            long r7 = (long) r7
            long r0 = r0 * r7
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            android.util.Size r9 = (android.util.Size) r9
            int r8 = r9.getWidth()
            long r0 = (long) r8
            int r8 = r9.getHeight()
            long r8 = (long) r8
            long r0 = r0 * r8
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L17b:
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r7 = r8.compareTo(r9)
            return r7
        L184:
            j05 r8 = (defpackage.j05) r8
            boolean r7 = r8.d
            r7 = r7 ^ r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            j05 r9 = (defpackage.j05) r9
            boolean r8 = r9.d
            r8 = r8 ^ r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L19b:
            rg3 r8 = (defpackage.rg3) r8
            rg3 r9 = (defpackage.rg3) r9
            int r7 = r8.a
            int r8 = r9.a
            int r7 = java.lang.Integer.compare(r7, r8)
            return r7
        L1a8:
            cr2 r8 = (defpackage.cr2) r8
            cr2 r9 = (defpackage.cr2) r9
            androidx.recyclerview.widget.RecyclerView r7 = r8.d
            if (r7 != 0) goto L1b2
            r0 = r3
            goto L1b3
        L1b2:
            r0 = r2
        L1b3:
            androidx.recyclerview.widget.RecyclerView r4 = r9.d
            if (r4 != 0) goto L1b9
            r4 = r3
            goto L1ba
        L1b9:
            r4 = r2
        L1ba:
            if (r0 == r4) goto L1bf
            if (r7 != 0) goto L1dd
            goto L1c8
        L1bf:
            boolean r7 = r8.a
            boolean r0 = r9.a
            if (r7 == r0) goto L1ca
            if (r7 == 0) goto L1c8
            goto L1dd
        L1c8:
            r1 = r3
            goto L1dd
        L1ca:
            int r7 = r9.b
            int r0 = r8.b
            int r1 = r7 - r0
            if (r1 == 0) goto L1d3
            goto L1dd
        L1d3:
            int r7 = r8.c
            int r8 = r9.c
            int r1 = r7 - r8
            if (r1 == 0) goto L1dc
            goto L1dd
        L1dc:
            r1 = r2
        L1dd:
            return r1
        L1de:
            ta7 r8 = (defpackage.ta7) r8
            android.graphics.RectF r7 = r8.c
            float r7 = r7.top
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            ta7 r9 = (defpackage.ta7) r9
            android.graphics.RectF r8 = r9.c
            float r8 = r8.top
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L1f7:
            kw5 r8 = (defpackage.kw5) r8
            android.net.Uri r7 = r8.a
            java.lang.String r7 = r7.toString()
            kw5 r9 = (defpackage.kw5) r9
            android.net.Uri r8 = r9.a
            java.lang.String r8 = r8.toString()
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L20c:
            lb2 r8 = (defpackage.lb2) r8
            android.net.Uri r7 = r8.a
            java.lang.String r7 = r7.toString()
            lb2 r9 = (defpackage.lb2) r9
            android.net.Uri r8 = r9.a
            java.lang.String r8 = r8.toString()
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L221:
            h3 r8 = (defpackage.h3) r8
            g3 r7 = r8.a
            int r7 = r7.getDisplayOrder()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            h3 r9 = (defpackage.h3) r9
            g3 r8 = r9.a
            int r8 = r8.getDisplayOrder()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L23e:
            sm3 r8 = (defpackage.sm3) r8
            sm3 r9 = (defpackage.sm3) r9
            int r7 = r8.l0
            int r0 = r9.l0
            int r7 = defpackage.nb3.p(r7, r0)
            if (r7 == 0) goto L24d
            goto L259
        L24d:
            int r7 = r8.hashCode()
            int r8 = r9.hashCode()
            int r7 = defpackage.nb3.p(r7, r8)
        L259:
            return r7
        L25a:
            vr4 r8 = (defpackage.vr4) r8
            java.lang.Object r7 = r8.A
            java.lang.String r7 = (java.lang.String) r7
            vr4 r9 = (defpackage.vr4) r9
            java.lang.Object r8 = r9.A
            java.lang.String r8 = (java.lang.String) r8
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L26b:
            android.view.View r8 = (android.view.View) r8
            android.view.View r9 = (android.view.View) r9
            java.util.WeakHashMap r7 = defpackage.ao7.a
            float r7 = r8.getZ()
            float r8 = r9.getZ()
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L27e
            goto L285
        L27e:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L284
            r1 = r3
            goto L285
        L284:
            r1 = r2
        L285:
            return r1
        L286:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r8.getClass()
            r9.getClass()
            int r7 = r8.length()
            int r0 = r9.length()
            int r7 = java.lang.Math.min(r7, r0)
            r0 = 4
        L29d:
            if (r0 >= r7) goto L2b3
            char r4 = r8.charAt(r0)
            char r5 = r9.charAt(r0)
            if (r4 == r5) goto L2b0
            int r7 = defpackage.nb3.p(r4, r5)
            if (r7 >= 0) goto L2c0
            goto L2c3
        L2b0:
            int r0 = r0 + 1
            goto L29d
        L2b3:
            int r7 = r8.length()
            int r8 = r9.length()
            if (r7 == r8) goto L2c2
            if (r7 >= r8) goto L2c0
            goto L2c3
        L2c0:
            r1 = r3
            goto L2c3
        L2c2:
            r1 = r2
        L2c3:
            return r1
        L2c4:
            ep r8 = (defpackage.ep) r8
            int r7 = r8.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ep r9 = (defpackage.ep) r9
            int r8 = r9.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L2d9:
            ep r8 = (defpackage.ep) r8
            int r7 = r8.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ep r9 = (defpackage.ep) r9
            int r8 = r9.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L2ee:
            g6 r8 = (defpackage.g6) r8
            int r7 = r8.getDisplayOrder()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            g6 r9 = (defpackage.g6) r9
            int r8 = r9.getDisplayOrder()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L307:
            l6 r8 = (defpackage.l6) r8
            int r7 = r8.getDisplayOrder()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            l6 r9 = (defpackage.l6) r9
            int r8 = r9.getDisplayOrder()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = defpackage.g04.z(r7, r8)
            return r7
        L320:
            vr4 r8 = (defpackage.vr4) r8
            vr4 r9 = (defpackage.vr4) r9
            java.lang.Object r7 = r8.A
            of5 r7 = (defpackage.of5) r7
            float r7 = r7.b
            java.lang.Object r0 = r9.A
            of5 r0 = (defpackage.of5) r0
            float r0 = r0.b
            int r7 = java.lang.Float.compare(r7, r0)
            if (r7 == 0) goto L337
            goto L347
        L337:
            java.lang.Object r7 = r8.A
            of5 r7 = (defpackage.of5) r7
            float r7 = r7.d
            java.lang.Object r8 = r9.A
            of5 r8 = (defpackage.of5) r8
            float r8 = r8.d
            int r7 = java.lang.Float.compare(r7, r8)
        L347:
            return r7
        L348:
            xa6 r8 = (defpackage.xa6) r8
            xa6 r9 = (defpackage.xa6) r9
            of5 r7 = r8.h()
            of5 r8 = r9.h()
            float r9 = r8.c
            float r0 = r7.c
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L35f
            goto L37d
        L35f:
            float r9 = r7.b
            float r0 = r8.b
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L36a
            goto L37d
        L36a:
            float r9 = r7.d
            float r0 = r8.d
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L375
            goto L37d
        L375:
            float r8 = r8.a
            float r7 = r7.a
            int r9 = java.lang.Float.compare(r8, r7)
        L37d:
            return r9
        L37e:
            sm3 r8 = (defpackage.sm3) r8
            sm3 r9 = (defpackage.sm3) r9
            int r7 = r9.l0
            int r0 = r8.l0
            int r7 = defpackage.nb3.p(r7, r0)
            if (r7 == 0) goto L38d
            goto L399
        L38d:
            int r7 = r8.hashCode()
            int r8 = r9.hashCode()
            int r7 = defpackage.nb3.p(r7, r8)
        L399:
            return r7
        L39a:
            xa6 r8 = (defpackage.xa6) r8
            xa6 r9 = (defpackage.xa6) r9
            of5 r7 = r8.h()
            of5 r8 = r9.h()
            float r9 = r7.a
            float r0 = r8.a
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L3b1
            goto L3cf
        L3b1:
            float r9 = r7.b
            float r0 = r8.b
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L3bc
            goto L3cf
        L3bc:
            float r9 = r7.d
            float r0 = r8.d
            int r9 = java.lang.Float.compare(r9, r0)
            if (r9 == 0) goto L3c7
            goto L3cf
        L3c7:
            float r7 = r7.c
            float r8 = r8.c
            int r9 = java.lang.Float.compare(r7, r8)
        L3cf:
            return r9
        L3d0:
            vh2 r8 = (defpackage.vh2) r8
            vh2 r9 = (defpackage.vh2) r9
            boolean r7 = defpackage.yh2.A(r8)
            if (r7 == 0) goto L47a
            boolean r7 = defpackage.yh2.A(r9)
            if (r7 != 0) goto L3e2
            goto L47a
        L3e2:
            sm3 r7 = defpackage.nc1.f0(r8)
            sm3 r8 = defpackage.nc1.f0(r9)
            boolean r9 = defpackage.nb3.k(r7, r8)
            if (r9 == 0) goto L3f2
            goto L478
        L3f2:
            r9 = 16
            sm3[] r0 = new defpackage.sm3[r9]
            r1 = r2
        L3f7:
            if (r7 == 0) goto L41d
            int r4 = r1 + 1
            int r5 = r0.length
            if (r5 >= r4) goto L40b
            int r5 = r0.length
            int r6 = r5 * 2
            int r4 = java.lang.Math.max(r4, r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            r0 = r4
        L40b:
            if (r1 == 0) goto L414
            r4 = 0
            int r4 = r4 + r3
            int r5 = r1 + 0
            java.lang.System.arraycopy(r0, r2, r0, r4, r5)
        L414:
            r0[r2] = r7
            int r1 = r1 + 1
            sm3 r7 = r7.v()
            goto L3f7
        L41d:
            sm3[] r7 = new defpackage.sm3[r9]
            r9 = r2
        L420:
            if (r8 == 0) goto L446
            int r4 = r9 + 1
            int r5 = r7.length
            if (r5 >= r4) goto L434
            int r5 = r7.length
            int r6 = r5 * 2
            int r4 = java.lang.Math.max(r4, r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r7, r2, r4, r2, r5)
            r7 = r4
        L434:
            if (r9 == 0) goto L43d
            r4 = 0
            int r4 = r4 + r3
            int r5 = r9 + 0
            java.lang.System.arraycopy(r7, r2, r7, r4, r5)
        L43d:
            r7[r2] = r8
            int r9 = r9 + 1
            sm3 r8 = r8.v()
            goto L420
        L446:
            int r1 = r1 - r3
            int r9 = r9 - r3
            int r8 = java.lang.Math.min(r1, r9)
            if (r8 < 0) goto L473
            r9 = r2
        L44f:
            r1 = r0[r9]
            r3 = r7[r9]
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L46e
            r8 = r0[r9]
            sm3 r8 = (defpackage.sm3) r8
            int r8 = r8.w()
            r7 = r7[r9]
            sm3 r7 = (defpackage.sm3) r7
            int r7 = r7.w()
            int r1 = defpackage.nb3.p(r8, r7)
            goto L488
        L46e:
            if (r9 == r8) goto L473
            int r9 = r9 + 1
            goto L44f
        L473:
            java.lang.String r7 = "Could not find a common ancestor between the two FocusModifiers."
            defpackage.i.m(r7)
        L478:
            r1 = r2
            goto L488
        L47a:
            boolean r7 = defpackage.yh2.A(r8)
            if (r7 == 0) goto L481
            goto L488
        L481:
            boolean r7 = defpackage.yh2.A(r9)
            if (r7 == 0) goto L478
            r1 = r3
        L488:
            return r1
    }
}
