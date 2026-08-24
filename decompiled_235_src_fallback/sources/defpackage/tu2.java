package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu2  reason: default package */
/* loaded from: classes.dex */
public final class tu2 {
    public static final defpackage.ck2 o = null;
    public static final defpackage.pa2 p = null;
    public static final defpackage.n67 q = null;
    public static final defpackage.n67 r = null;
    public static final defpackage.ci s = null;
    public static final defpackage.ld3 t = null;
    public static final defpackage.tu2 u = null;
    public static final java.util.List v = null;
    public final defpackage.z62 a;
    public final defpackage.ez3 b;
    public final defpackage.qa2 c;
    public final java.util.HashMap d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public final int g;
    public final int h;
    public final boolean i;
    public final defpackage.ck2 j;
    public final boolean k;
    public final defpackage.o67 l;
    public final defpackage.o67 m;
    public final java.util.ArrayDeque n;

    static {
            ck2 r0 = defpackage.ck2.d
            defpackage.tu2.o = r0
            pa2 r0 = defpackage.pa2.IDENTITY
            defpackage.tu2.p = r0
            n67 r0 = defpackage.n67.DOUBLE
            defpackage.tu2.q = r0
            n67 r0 = defpackage.n67.LAZILY_PARSED_NUMBER
            defpackage.tu2.r = r0
            ci r0 = new ci
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r2 = 1
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            r0.<init>(r3, r1, r2)
            defpackage.tu2.s = r0
            ld3 r1 = new ld3
            r1.<init>(r0)
            defpackage.tu2.t = r1
            tu2 r2 = new tu2
            r2.<init>()
            defpackage.tu2.u = r2
            java.util.List r0 = r2.a(r0, r1)
            defpackage.tu2.v = r0
            return
    }

    public tu2() {
            r2 = this;
            r2.<init>()
            z62 r0 = defpackage.z62.L
            r2.a = r0
            ez3 r0 = defpackage.ez3.DEFAULT
            r2.b = r0
            pa2 r0 = defpackage.tu2.p
            r2.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            r0 = 2
            r2.g = r0
            r2.h = r0
            r0 = 1
            r2.i = r0
            ck2 r1 = defpackage.tu2.o
            r2.j = r1
            r2.k = r0
            n67 r0 = defpackage.tu2.q
            r2.l = r0
            n67 r0 = defpackage.tu2.r
            r2.m = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.n = r0
            return
    }

    public static java.util.List b(java.util.AbstractCollection r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
        L9:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L29
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L1c
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L24
        L1c:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L24:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L29:
            java.lang.Object[] r2 = r2.toArray()
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    public final java.util.List a(defpackage.ci r12, defpackage.ld3 r13) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ud7 r1 = defpackage.fe7.C
            r0.add(r1)
            kh4 r1 = defpackage.yh4.c
            n67 r1 = defpackage.n67.DOUBLE
            r2 = 1
            o67 r3 = r11.l
            if (r3 != r1) goto L16
            kh4 r1 = defpackage.yh4.c
            goto L1b
        L16:
            kh4 r1 = new kh4
            r1.<init>(r3, r2)
        L1b:
            r0.add(r1)
            z62 r1 = r11.a
            r0.add(r1)
            java.util.ArrayList r1 = r11.e
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L36
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L36:
            java.util.ArrayList r1 = r11.f
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L49
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Collections.reverse(r3)
            r0.addAll(r3)
        L49:
            boolean r1 = defpackage.po6.a
            r3 = 0
            r4 = 0
            r5 = 2
            int r6 = r11.g
            int r7 = r11.h
            if (r6 != r5) goto L56
            if (r7 == r5) goto L96
        L56:
            nd1 r5 = new nd1
            ld1 r8 = defpackage.md1.b
            r5.<init>(r8, r6, r7)
            ud7 r8 = new ud7
            java.lang.Class<java.util.Date> r9 = java.util.Date.class
            r8.<init>(r3, r5, r9)
            if (r1 == 0) goto L89
            oo6 r5 = defpackage.po6.c
            r5.getClass()
            nd1 r9 = new nd1
            r9.<init>(r5, r6, r7)
            java.lang.Class r5 = r5.a
            ud7 r10 = new ud7
            r10.<init>(r3, r9, r5)
            oo6 r5 = defpackage.po6.b
            r5.getClass()
            nd1 r9 = new nd1
            r9.<init>(r5, r6, r7)
            java.lang.Class r5 = r5.a
            ud7 r6 = new ud7
            r6.<init>(r3, r9, r5)
            goto L8b
        L89:
            r6 = r4
            r10 = r6
        L8b:
            r0.add(r8)
            if (r1 == 0) goto L96
            r0.add(r10)
            r0.add(r6)
        L96:
            ud7 r1 = defpackage.fe7.s
            r0.add(r1)
            vd7 r1 = defpackage.fe7.g
            r0.add(r1)
            vd7 r1 = defpackage.fe7.d
            r0.add(r1)
            vd7 r1 = defpackage.fe7.e
            r0.add(r1)
            vd7 r1 = defpackage.fe7.f
            r0.add(r1)
            ez3 r1 = r11.b
            yc7 r1 = r1.typeAdapter()
            vd7 r5 = new vd7
            java.lang.Class r6 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            r5.<init>(r6, r7, r1)
            r0.add(r5)
            de7 r5 = defpackage.fe7.n
            vd7 r6 = new vd7
            java.lang.Class r7 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            r6.<init>(r7, r8, r5)
            r0.add(r6)
            de7 r5 = defpackage.fe7.m
            vd7 r6 = new vd7
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r8 = java.lang.Float.class
            r6.<init>(r7, r8, r5)
            r0.add(r6)
            kh4 r5 = defpackage.mh4.b
            n67 r5 = defpackage.n67.LAZILY_PARSED_NUMBER
            o67 r6 = r11.m
            if (r6 != r5) goto Le8
            kh4 r5 = defpackage.mh4.b
            goto Lf3
        Le8:
            mh4 r5 = new mh4
            r5.<init>(r6)
            kh4 r6 = new kh4
            r6.<init>(r5, r3)
            r5 = r6
        Lf3:
            r0.add(r5)
            ud7 r5 = defpackage.fe7.h
            r0.add(r5)
            ud7 r5 = defpackage.fe7.i
            r0.add(r5)
            java.util.Objects.requireNonNull(r1)
            cd7 r5 = new cd7
            r5.<init>(r1, r2)
            xc7 r5 = r5.a()
            ud7 r6 = new ud7
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r7 = java.util.concurrent.atomic.AtomicLong.class
            r6.<init>(r3, r5, r7)
            r0.add(r6)
            cd7 r5 = new cd7
            r5.<init>(r1, r3)
            xc7 r1 = r5.a()
            ud7 r5 = new ud7
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r6 = java.util.concurrent.atomic.AtomicLongArray.class
            r5.<init>(r3, r1, r6)
            r0.add(r5)
            ud7 r1 = defpackage.fe7.j
            r0.add(r1)
            vd7 r1 = defpackage.fe7.o
            r0.add(r1)
            ud7 r1 = defpackage.fe7.t
            r0.add(r1)
            ud7 r1 = defpackage.fe7.u
            r0.add(r1)
            ud7 r1 = defpackage.fe7.p
            r0.add(r1)
            ud7 r1 = defpackage.fe7.q
            r0.add(r1)
            ud7 r1 = defpackage.fe7.r
            r0.add(r1)
            ud7 r1 = defpackage.fe7.v
            r0.add(r1)
            ud7 r1 = defpackage.fe7.w
            r0.add(r1)
            ud7 r1 = defpackage.fe7.y
            r0.add(r1)
            ud7 r1 = defpackage.fe7.z
            r0.add(r1)
            ud7 r1 = defpackage.fe7.B
            r0.add(r1)
            ud7 r1 = defpackage.fe7.x
            r0.add(r1)
            ud7 r1 = defpackage.fe7.b
            r0.add(r1)
            kd1 r1 = defpackage.nd1.c
            r0.add(r1)
            kh4 r1 = defpackage.fe7.A
            r0.add(r1)
            java.lang.Class<kc3> r1 = defpackage.kc3.class
            ic3 r5 = defpackage.kc3.a     // Catch: java.lang.Throwable -> L18e
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L18e
            java.lang.Object r1 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> L18e
            ee7 r1 = (defpackage.ee7) r1     // Catch: java.lang.Throwable -> L18e
            kc3 r1 = (defpackage.kc3) r1     // Catch: java.lang.Throwable -> L18e
            r1.getClass()     // Catch: java.lang.Throwable -> L18e
            kc3$b r4 = defpackage.kc3.j     // Catch: java.lang.Throwable -> L18e
        L18e:
            if (r4 == 0) goto L193
            r0.add(r4)
        L193:
            java.util.List r1 = defpackage.po6.d
            r0.addAll(r1)
            av r1 = defpackage.bv.c
            r0.add(r1)
            ud7 r1 = defpackage.fe7.a
            r0.add(r1)
            ft0 r1 = new ft0
            r1.<init>(r12, r3)
            r0.add(r1)
            ft0 r1 = new ft0
            r1.<init>(r12, r2)
            r0.add(r1)
            r0.add(r13)
            w52 r1 = defpackage.fe7.D
            r0.add(r1)
            vh5 r2 = new vh5
            java.util.ArrayDeque r1 = r11.n
            java.util.List r7 = b(r1)
            qa2 r4 = r11.c
            z62 r5 = r11.a
            r3 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0.trimToSize()
            java.util.List r11 = java.util.Collections.unmodifiableList(r0)
            return r11
    }

    public final void c(java.lang.Class r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L34
            ie7 r0 = new ie7
            r0.<init>(r5)
            java.lang.reflect.Type r1 = r0.b
            java.lang.Class r2 = r0.a
            if (r1 != r2) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            xb7 r2 = new xb7
            r3 = 0
            r2.<init>(r6, r0, r1, r3)
            java.util.ArrayList r4 = r4.e
            r4.add(r2)
            boolean r0 = r6 instanceof defpackage.yc7
            if (r0 == 0) goto L33
            ie7 r0 = new ie7
            r0.<init>(r5)
            yc7 r6 = (defpackage.yc7) r6
            ud7 r5 = defpackage.fe7.a
            ud7 r5 = new ud7
            r1 = 2
            r5.<init>(r1, r6, r0)
            r4.add(r5)
        L33:
            return
        L34:
            java.lang.String r4 = "Cannot override built-in adapter for "
            defpackage.e41.w(r5, r4)
            return
    }
}
