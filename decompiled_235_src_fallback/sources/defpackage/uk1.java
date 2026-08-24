package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk1  reason: default package */
/* loaded from: classes.dex */
public final class uk1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public java.io.Serializable f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Cloneable i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public java.lang.Object l;
    public final java.lang.Object m;
    public final java.io.Serializable n;

    public uk1(android.content.Context r8, defpackage.vw4 r9, android.os.Handler r10, defpackage.ss2 r11, defpackage.s63 r12, defpackage.pq6 r13) {
            r7 = this;
            r0 = 0
            r7.a = r0
            r7.<init>()
            tk1 r1 = new tk1
            java.lang.String r2 = "Picasso-Dispatcher"
            r3 = 10
            r1.<init>(r2, r3)
            r1.start()
            android.os.Looper r2 = r1.getLooper()
            java.lang.StringBuilder r3 = defpackage.ck7.a
            ow4 r3 = new ow4
            r4 = 1
            r3.<init>(r2, r4)
            android.os.Message r2 = r3.obtainMessage()
            r5 = 1000(0x3e8, double:4.94E-321)
            r3.sendMessageDelayed(r2, r5)
            r7.c = r8
            r7.d = r9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r7.f = r9
            java.util.WeakHashMap r9 = new java.util.WeakHashMap
            r9.<init>()
            r7.g = r9
            java.util.WeakHashMap r9 = new java.util.WeakHashMap
            r9.<init>()
            r7.h = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r7.i = r9
            sk1 r9 = new sk1
            android.os.Looper r1 = r1.getLooper()
            r9.<init>(r1, r7, r0)
            r7.j = r9
            r7.e = r11
            r7.k = r10
            r7.l = r12
            r7.m = r13
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 4
            r9.<init>(r10)
            r7.n = r9
            android.content.ContentResolver r9 = r8.getContentResolver()
            java.lang.String r10 = "airplane_mode_on"
            android.provider.Settings.Global.getInt(r9, r10, r0)     // Catch: java.lang.Throwable -> L6b
        L6b:
            java.lang.String r9 = "android.permission.ACCESS_NETWORK_STATE"
            int r8 = r8.checkCallingOrSelfPermission(r9)
            if (r8 != 0) goto L74
            r0 = r4
        L74:
            r7.b = r0
            cr r8 = new cr
            r8.<init>(r7)
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r9 = "android.intent.action.AIRPLANE_MODE"
            r7.addAction(r9)
            java.lang.Object r9 = r8.b
            uk1 r9 = (defpackage.uk1) r9
            boolean r10 = r9.b
            if (r10 == 0) goto L92
            java.lang.String r10 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r10)
        L92:
            java.lang.Object r9 = r9.c
            android.content.Context r9 = (android.content.Context) r9
            r9.registerReceiver(r8, r7)
            return
    }

    public uk1(defpackage.sb4 r5) {
            r4 = this;
            r0 = 1
            r4.a = r0
            r4.<init>()
            r4.c = r5
            ic4 r1 = r5.B
            r4.d = r1
            android.os.Bundle r1 = r5.L
            r4.e = r1
            tt3 r1 = r5.R
            r4.f = r1
            ac4 r1 = r5.X
            r4.g = r1
            java.lang.String r1 = r5.Y
            r4.h = r1
            android.os.Bundle r1 = r5.Z
            r4.i = r1
            f56 r1 = new f56
            t46 r2 = new t46
            r3 = 2
            r2.<init>(r5, r3)
            r1.<init>(r5, r2)
            e56 r2 = new e56
            r2.<init>(r1)
            r4.j = r2
            pi3 r1 = new pi3
            r2 = 13
            r1.<init>(r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            ku3 r1 = new ku3
            r1.<init>(r5, r0)
            r4.k = r1
            tt3 r5 = defpackage.tt3.INITIALIZED
            r4.l = r5
            java.lang.Object r5 = r2.getValue()
            h56 r5 = (defpackage.h56) r5
            r4.m = r5
            pi3 r5 = new pi3
            r0 = 14
            r5.<init>(r0)
            ex6 r0 = new ex6
            r0.<init>(r5)
            r4.n = r0
            return
    }

    public void a(defpackage.v40 r4) {
            r3 = this;
            java.lang.Object r0 = r3.j
            sk1 r0 = (defpackage.sk1) r0
            java.util.concurrent.Future r1 = r4.i0
            if (r1 == 0) goto Lf
            boolean r1 = r1.isCancelled()
            if (r1 == 0) goto Lf
            return
        Lf:
            android.graphics.Bitmap r1 = r4.h0
            if (r1 == 0) goto L16
            r1.prepareToDraw()
        L16:
            java.io.Serializable r3 = r3.n
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            r3 = 7
            boolean r4 = r0.hasMessages(r3)
            if (r4 != 0) goto L29
            r1 = 200(0xc8, double:9.9E-322)
            r0.sendEmptyMessageDelayed(r3, r1)
        L29:
            return
    }

    public void b(defpackage.v40 r2) {
            r1 = this;
            java.lang.Object r1 = r1.j
            sk1 r1 = (defpackage.sk1) r1
            r0 = 4
            android.os.Message r2 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r2)
            return
    }

    public android.os.Bundle c() {
            r2 = this;
            java.lang.Object r2 = r2.e
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            vr4[] r1 = new defpackage.vr4[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            vr4[] r0 = (defpackage.vr4[]) r0
            android.os.Bundle r0 = defpackage.jw2.l(r0)
            r0.putAll(r2)
            return r0
    }

    public void d(defpackage.v40 r2, boolean r3) {
            r1 = this;
            sw4 r3 = r2.B
            r3.getClass()
            java.io.Serializable r3 = r1.f
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.String r0 = r2.Y
            r3.remove(r0)
            r1.a(r2)
            return
    }

    public void e(defpackage.i33 r14, boolean r15) {
            r13 = this;
            java.lang.Object r0 = r13.d
            vw4 r0 = (defpackage.vw4) r0
            java.io.Serializable r1 = r13.f
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Cloneable r2 = r13.i
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            i33 r3 = r14.e
            m44 r4 = r14.b
            java.lang.String r5 = r14.d
            sw4 r7 = r14.a
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L29
            java.lang.Object r13 = r13.h
            java.util.WeakHashMap r13 = (java.util.WeakHashMap) r13
            java.lang.Object r15 = r14.a()
            r13.put(r15, r14)
            r7.getClass()
            return
        L29:
            java.lang.Object r2 = r1.get(r5)
            v40 r2 = (defpackage.v40) r2
            if (r2 == 0) goto L61
            sw4 r13 = r2.B
            r13.getClass()
            i33 r13 = r2.f0
            if (r13 != 0) goto L3d
            r2.f0 = r14
            return
        L3d:
            java.util.ArrayList r13 = r2.g0
            if (r13 != 0) goto L49
            java.util.ArrayList r13 = new java.util.ArrayList
            r15 = 3
            r13.<init>(r15)
            r2.g0 = r13
        L49:
            java.util.ArrayList r13 = r2.g0
            r13.add(r14)
            java.lang.Object r13 = r4.R
            rw4 r13 = (defpackage.rw4) r13
            int r14 = r13.ordinal()
            rw4 r15 = r2.n0
            int r15 = r15.ordinal()
            if (r14 <= r15) goto L60
            r2.n0 = r13
        L60:
            return
        L61:
            boolean r2 = r0.isShutdown()
            if (r2 == 0) goto L6b
            r7.getClass()
            return
        L6b:
            java.lang.Object r2 = r13.l
            r9 = r2
            s63 r9 = (defpackage.s63) r9
            java.lang.Object r2 = r13.m
            r10 = r2
            pq6 r10 = (defpackage.pq6) r10
            java.lang.Object r2 = defpackage.v40.o0
            java.util.List r2 = r7.a
            int r3 = r2.size()
            r6 = 0
        L7e:
            if (r6 >= r3) goto L9a
            java.lang.Object r8 = r2.get(r6)
            r12 = r8
            xk5 r12 = (defpackage.xk5) r12
            boolean r8 = r12.a(r4)
            if (r8 == 0) goto L95
            v40 r6 = new v40
            r8 = r13
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto La3
        L95:
            r8 = r13
            r11 = r14
            int r6 = r6 + 1
            goto L7e
        L9a:
            r8 = r13
            r11 = r14
            v40 r6 = new v40
            u40 r12 = defpackage.v40.r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
        La3:
            java.util.concurrent.Future r13 = r0.submit(r6)
            r6.i0 = r13
            r1.put(r5, r6)
            if (r15 == 0) goto Lb9
            java.lang.Object r13 = r8.g
            java.util.WeakHashMap r13 = (java.util.WeakHashMap) r13
            java.lang.Object r14 = r11.a()
            r13.remove(r14)
        Lb9:
            r7.getClass()
            return
    }

    public void f() {
            r3 = this;
            java.lang.Object r0 = r3.j
            e56 r0 = (defpackage.e56) r0
            boolean r1 = r3.b
            if (r1 != 0) goto L22
            r0.a()
            r1 = 1
            r3.b = r1
            java.lang.Object r1 = r3.g
            ac4 r1 = (defpackage.ac4) r1
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r3.c
            sb4 r1 = (defpackage.sb4) r1
            defpackage.y46.b(r1)
        L1b:
            java.lang.Cloneable r1 = r3.i
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.b(r1)
        L22:
            java.io.Serializable r0 = r3.f
            tt3 r0 = (defpackage.tt3) r0
            int r0 = r0.ordinal()
            java.lang.Object r1 = r3.l
            tt3 r1 = (defpackage.tt3) r1
            int r1 = r1.ordinal()
            java.lang.Object r2 = r3.k
            ku3 r2 = (defpackage.ku3) r2
            if (r0 >= r1) goto L40
            java.io.Serializable r3 = r3.f
            tt3 r3 = (defpackage.tt3) r3
            r2.h(r3)
            return
        L40:
            java.lang.Object r3 = r3.l
            tt3 r3 = (defpackage.tt3) r3
            r2.h(r3)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<sb4> r1 = defpackage.sb4.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            java.lang.Object r2 = r3.h
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " destination="
            r0.append(r1)
            java.lang.Object r3 = r3.d
            ic4 r3 = (defpackage.ic4) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
