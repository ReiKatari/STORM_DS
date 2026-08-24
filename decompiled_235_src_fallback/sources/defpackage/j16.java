package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j16  reason: default package */
/* loaded from: classes.dex */
public final class j16 {
    public final defpackage.ar0 a;
    public final android.content.Context b;
    public final java.lang.String c;
    public final java.util.ArrayList d;
    public final java.util.ArrayList e;
    public java.util.concurrent.Executor f;
    public java.util.concurrent.Executor g;
    public defpackage.h61 h;
    public boolean i;
    public final defpackage.l16 j;
    public final long k;
    public final defpackage.wb1 l;
    public final java.util.LinkedHashSet m;
    public final java.util.LinkedHashSet n;
    public final java.util.ArrayList o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;

    public j16(android.content.Context r4, java.lang.Class r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.e = r0
            l16 r0 = defpackage.l16.AUTOMATIC
            r3.j = r0
            r0 = -1
            r3.k = r0
            wb1 r0 = new wb1
            r1 = 7
            r2 = 0
            r0.<init>(r1, r2)
            r3.l = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.m = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.o = r0
            r0 = 1
            r3.p = r0
            r3.s = r0
            ar0 r5 = defpackage.gh5.a(r5)
            r3.a = r5
            r3.b = r4
            r3.c = r6
            return
    }

    public final void a(defpackage.i64... r7) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1e
            r3 = r7[r2]
            int r4 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.LinkedHashSet r5 = r6.n
            r5.add(r4)
            int r3 = r3.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L3
        L1e:
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            i64[] r7 = (defpackage.i64[]) r7
            wb1 r6 = r6.l
            r6.getClass()
            int r0 = r7.length
        L2b:
            if (r1 >= r0) goto L35
            r2 = r7[r1]
            r6.c(r2)
            int r1 = r1 + 1
            goto L2b
        L35:
            return
    }

    public final defpackage.m16 b() {
            r26 = this;
            r0 = r26
            java.util.concurrent.Executor r1 = r0.f
            if (r1 != 0) goto L11
            java.util.concurrent.Executor r2 = r0.g
            if (r2 != 0) goto L11
            yt r1 = defpackage.zt.g
            r0.g = r1
            r0.f = r1
            goto L20
        L11:
            if (r1 == 0) goto L1a
            java.util.concurrent.Executor r2 = r0.g
            if (r2 != 0) goto L1a
            r0.g = r1
            goto L20
        L1a:
            if (r1 != 0) goto L20
            java.util.concurrent.Executor r1 = r0.g
            r0.f = r1
        L20:
            java.util.LinkedHashSet r1 = r0.n
            r1.getClass()
            java.util.LinkedHashSet r15 = r0.m
            r15.getClass()
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L5a
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r15.contains(r4)
            if (r4 != 0) goto L50
            goto L35
        L50:
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "
            java.lang.String r0 = defpackage.lb1.g(r2, r0)
            defpackage.i.f(r0)
            return r3
        L5a:
            h61 r1 = r0.h
            if (r1 != 0) goto L64
            w31 r1 = new w31
            r2 = 7
            r1.<init>(r2)
        L64:
            r5 = r1
            long r1 = r0.k
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r24 = 0
            r2 = 1
            if (r1 <= 0) goto L72
            r1 = r2
            goto L74
        L72:
            r1 = r24
        L74:
            java.lang.String r4 = "Required value was null."
            if (r1 == 0) goto L86
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L80
            defpackage.i.h(r4)
            return r3
        L80:
            java.lang.String r0 = "Cannot create auto-closing database for an in-memory database."
            defpackage.i.h(r0)
            return r3
        L86:
            r1 = r2
            bc1 r2 = new bc1
            boolean r8 = r0.i
            l16 r6 = r0.j
            r7 = r3
            android.content.Context r3 = r0.b
            l16 r9 = r6.resolve$room_runtime(r3)
            java.util.concurrent.Executor r10 = r0.f
            if (r10 == 0) goto L3f2
            java.util.concurrent.Executor r11 = r0.g
            if (r11 == 0) goto L3ec
            boolean r13 = r0.p
            boolean r14 = r0.q
            boolean r4 = r0.r
            r22 = 0
            r23 = 0
            r21 = r4
            java.lang.String r4 = r0.c
            wb1 r6 = r0.l
            r12 = r7
            java.util.ArrayList r7 = r0.d
            r16 = r12
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            java.util.ArrayList r1 = r0.e
            java.util.ArrayList r12 = r0.o
            r19 = r1
            r20 = r12
            r1 = 1
            r12 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = r0.s
            r2.q = r3
            ar0 r0 = r0.a
            r0.getClass()
            java.lang.Class r3 = r0.a()
            r3.getClass()
            java.lang.Package r0 = r3.getPackage()
            if (r0 == 0) goto Le6
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto Le8
        Le6:
            java.lang.String r0 = ""
        Le8:
            java.lang.String r4 = r3.getCanonicalName()
            r4.getClass()
            int r5 = r0.length()
            if (r5 != 0) goto Lf6
            goto Lff
        Lf6:
            int r5 = r0.length()
            int r5 = r5 + r1
            java.lang.String r4 = r4.substring(r5)
        Lff:
            r5 = 95
            r6 = 46
            java.lang.String r4 = r4.replace(r6, r5)
            r4.getClass()
            java.lang.String r5 = "_Impl"
            java.lang.String r4 = r4.concat(r5)
            int r5 = r0.length()     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            if (r5 != 0) goto L118
            r0 = r4
            goto L12a
        L118:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r5.<init>()     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r5.append(r0)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r5.append(r6)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r5.append(r4)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            java.lang.String r0 = r5.toString()     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
        L12a:
            java.lang.ClassLoader r5 = r3.getClassLoader()     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r0.getClass()     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r7 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r7)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            java.lang.Object r0 = r0.newInstance(r7)     // Catch: java.lang.InstantiationException -> L391 java.lang.IllegalAccessException -> L393 java.lang.ClassNotFoundException -> L395
            r10 = r0
            m16 r10 = (defpackage.m16) r10
            r10.getClass()
            boolean r0 = r2.q
            r10.k = r0
            ts1 r3 = r10.e()     // Catch: defpackage.tg4 -> L150
            r3.getClass()     // Catch: defpackage.tg4 -> L150
            goto L151
        L150:
            r3 = 0
        L151:
            if (r3 == 0) goto L374
            ai1 r0 = new ai1
            h4 r8 = new h4
            r15 = 0
            r16 = 9
            r9 = 2
            java.lang.Class<n16> r11 = defpackage.n16.class
            java.lang.String r12 = "compatTransactionCoroutineExecute"
            java.lang.String r13 = "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r14 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.<init>(r2, r3, r8)
            r10.e = r0
            zb3 r0 = r10.d()
            r10.f = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r10.i()
            java.util.List r4 = r2.n
            int r5 = r4.size()
            boolean[] r6 = new boolean[r5]
            java.util.Iterator r3 = r3.iterator()
        L185:
            boolean r7 = r3.hasNext()
            r8 = -1
            if (r7 == 0) goto L1c6
            java.lang.Object r7 = r3.next()
            ar0 r7 = (defpackage.ar0) r7
            int r9 = r4.size()
            int r9 = r9 + r8
            if (r9 < 0) goto L1ae
        L199:
            int r11 = r9 + (-1)
            java.lang.Object r12 = r4.get(r9)
            boolean r12 = r7.d(r12)
            if (r12 == 0) goto L1a9
            r6[r9] = r1
            r8 = r9
            goto L1ae
        L1a9:
            if (r11 >= 0) goto L1ac
            goto L1ae
        L1ac:
            r9 = r11
            goto L199
        L1ae:
            if (r8 < 0) goto L1b8
            java.lang.Object r8 = r4.get(r8)
            r0.put(r7, r8)
            goto L185
        L1b8:
            java.lang.String r0 = r7.b()
            java.lang.String r1 = ") is missing in the database configuration."
            java.lang.String r2 = "A required auto migration spec ("
            defpackage.u34.A(r0, r1, r2)
            r25 = 0
            return r25
        L1c6:
            int r3 = r4.size()
            int r3 = r3 + r8
            if (r3 < 0) goto L1e2
        L1cd:
            int r4 = r3 + (-1)
            if (r3 >= r5) goto L1da
            boolean r3 = r6[r3]
            if (r3 == 0) goto L1da
            if (r4 >= 0) goto L1d8
            goto L1e2
        L1d8:
            r3 = r4
            goto L1cd
        L1da:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            defpackage.i.h(r0)
            r25 = 0
            return r25
        L1e2:
            java.util.List r0 = r10.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L1ea:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L227
            java.lang.Object r3 = r0.next()
            i64 r3 = (defpackage.i64) r3
            int r4 = r3.a
            int r5 = r3.b
            wb1 r6 = r2.d
            java.util.LinkedHashMap r7 = r6.b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r9 = r7.containsKey(r9)
            if (r9 == 0) goto L21f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r7.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L216
            zt1 r4 = defpackage.zt1.A
        L216:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.containsKey(r5)
            goto L221
        L21f:
            r4 = r24
        L221:
            if (r4 != 0) goto L1ea
            r6.c(r3)
            goto L1ea
        L227:
            java.util.LinkedHashMap r0 = r10.j()
            java.util.List r3 = r2.m
            int r4 = r3.size()
            boolean[] r4 = new boolean[r4]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L23b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L2be
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            ar0 r6 = (defpackage.ar0) r6
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L257:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L23b
            java.lang.Object r7 = r5.next()
            ar0 r7 = (defpackage.ar0) r7
            int r9 = r3.size()
            int r9 = r9 + r8
            if (r9 < 0) goto L27e
        L26a:
            int r11 = r9 + (-1)
            java.lang.Object r12 = r3.get(r9)
            boolean r12 = r7.d(r12)
            if (r12 == 0) goto L279
            r4[r9] = r1
            goto L27f
        L279:
            if (r11 >= 0) goto L27c
            goto L27e
        L27c:
            r9 = r11
            goto L26a
        L27e:
            r9 = r8
        L27f:
            if (r9 < 0) goto L291
            java.lang.Object r9 = r3.get(r9)
            r7.getClass()
            r9.getClass()
            java.util.LinkedHashMap r11 = r10.j
            r11.put(r7, r9)
            goto L257
        L291:
            java.lang.String r0 = r7.b()
            java.lang.String r1 = r6.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "A required type converter ("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ") for "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " is missing in the database configuration."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2be:
            int r0 = r3.size()
            int r0 = r0 + r8
            if (r0 < 0) goto L2de
        L2c5:
            int r5 = r0 + (-1)
            boolean r6 = r4[r0]
            if (r6 == 0) goto L2d0
            if (r5 >= 0) goto L2ce
            goto L2de
        L2ce:
            r0 = r5
            goto L2c5
        L2d0:
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "Unexpected type converter "
            java.lang.String r2 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            defpackage.u34.C(r0, r2, r1)
            r25 = 0
            return r25
        L2de:
            java.util.concurrent.Executor r0 = r2.h
            r10.c = r0
            zb6 r0 = new zb6
            java.util.concurrent.Executor r3 = r2.i
            r0.<init>(r3, r1)
            r10.d = r0
            java.util.concurrent.Executor r0 = r10.c
            if (r0 == 0) goto L36c
            n61 r0 = defpackage.f04.F(r0)
            gu6 r1 = defpackage.oi2.c()
            l61 r0 = defpackage.jw2.y(r0, r1)
            o41 r0 = defpackage.g04.i(r0)
            r10.a = r0
            l61 r0 = r0.B
            zb6 r1 = r10.d
            if (r1 == 0) goto L364
            n61 r1 = defpackage.f04.F(r1)
            l61 r0 = r0.N(r1)
            r10.b = r0
            boolean r0 = r2.f
            r10.h = r0
            ai1 r0 = r10.e
            java.lang.String r1 = "connectionManager"
            if (r0 == 0) goto L35e
            java.lang.Object r0 = r0.h
            pu6 r0 = (defpackage.pu6) r0
            if (r0 != 0) goto L323
        L321:
            r3 = 0
            goto L335
        L323:
            r3 = r0
        L324:
            boolean r0 = r3 instanceof defpackage.m05
            if (r0 == 0) goto L32a
            goto L335
        L32a:
            boolean r0 = r3 instanceof defpackage.ah1
            if (r0 == 0) goto L321
            ah1 r3 = (defpackage.ah1) r3
            pu6 r3 = r3.e()
            goto L324
        L335:
            m05 r3 = (defpackage.m05) r3
            ai1 r0 = r10.e
            if (r0 == 0) goto L358
            java.lang.Object r0 = r0.h
            pu6 r0 = (defpackage.pu6) r0
            if (r0 != 0) goto L343
        L341:
            r3 = 0
            goto L355
        L343:
            r3 = r0
        L344:
            boolean r0 = r3 instanceof defpackage.kx
            if (r0 == 0) goto L34a
            goto L355
        L34a:
            boolean r0 = r3 instanceof defpackage.ah1
            if (r0 == 0) goto L341
            ah1 r3 = (defpackage.ah1) r3
            pu6 r3 = r3.e()
            goto L344
        L355:
            kx r3 = (defpackage.kx) r3
            return r10
        L358:
            defpackage.nb3.a0(r1)
            r25 = 0
            throw r25
        L35e:
            r25 = 0
            defpackage.nb3.a0(r1)
            throw r25
        L364:
            r25 = 0
            java.lang.String r0 = "internalTransactionExecutor"
            defpackage.nb3.a0(r0)
            throw r25
        L36c:
            r25 = 0
            java.lang.String r0 = "internalQueryExecutor"
            defpackage.nb3.a0(r0)
            throw r25
        L374:
            ai1 r0 = new ai1
            gn5 r1 = new gn5
            r1.<init>(r10)
            h4 r8 = new h4
            r15 = 0
            r16 = 8
            r9 = 2
            java.lang.Class<n16> r11 = defpackage.n16.class
            java.lang.String r12 = "compatTransactionCoroutineExecute"
            java.lang.String r13 = "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r14 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.<init>(r2, r1, r8)
            r25 = 0
            throw r25
        L391:
            r0 = move-exception
            goto L397
        L393:
            r0 = move-exception
            goto L3af
        L395:
            r0 = move-exception
            goto L3c7
        L397:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = r3.getCanonicalName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create an instance of "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L3af:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = r3.getCanonicalName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot access the constructor "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L3c7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = r3.getCanonicalName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot find implementation for "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = ". "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = " does not exist. Is Room annotation processor correctly configured?"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L3ec:
            defpackage.i.h(r4)
            r25 = 0
            return r25
        L3f2:
            r25 = r7
            defpackage.i.h(r4)
            return r25
    }
}
