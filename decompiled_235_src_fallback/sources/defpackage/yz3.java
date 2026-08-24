package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz3  reason: default package */
/* loaded from: classes.dex */
public class yz3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public yz3(int r3) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r2.<init>()
            r2.b = r3
            if (r3 <= 0) goto L1b
            wb1 r3 = new wb1
            r0 = 4
            r1 = 0
            r3.<init>(r0, r1)
            r2.f = r3
            q61 r3 = new q61
            r3.<init>()
            r2.g = r3
            return
        L1b:
            java.lang.String r2 = "maxSize <= 0"
            defpackage.i.h(r2)
            r2 = 0
            throw r2
    }

    public yz3(androidx.recyclerview.widget.StaggeredGridLayoutManager r2, int r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r2
            r1.c = r2
            r2 = 0
            r1.d = r2
            r1.e = r3
            return
    }

    public void a() {
            r3 = this;
            java.lang.Object r0 = r3.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            wo6 r1 = (defpackage.wo6) r1
            java.lang.Object r2 = r3.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            ts1 r2 = r2.r
            int r0 = r2.d(r0)
            r3.c = r0
            r1.getClass()
            return
    }

    public void b() {
            r1 = this;
            java.lang.Object r0 = r1.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r0
            r1.c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public java.lang.Object c(java.lang.Object r1) {
            r0 = this;
            r1.getClass()
            r0 = 0
            return r0
    }

    public void d(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public int e() {
            r2 = this;
            java.lang.Object r0 = r2.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            boolean r0 = r0.w
            java.lang.Object r1 = r2.f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r0 == 0) goto L18
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r2 = r2.g(r0, r1)
            return r2
        L18:
            r0 = 0
            int r1 = r1.size()
            int r2 = r2.g(r0, r1)
            return r2
    }

    public int f() {
            r2 = this;
            java.lang.Object r0 = r2.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            boolean r0 = r0.w
            java.lang.Object r1 = r2.f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r0 == 0) goto L16
            r0 = 0
            int r1 = r1.size()
            int r2 = r2.g(r0, r1)
            return r2
        L16:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r2 = r2.g(r0, r1)
            return r2
    }

    public int g(int r12, int r13) {
            r11 = this;
            java.lang.Object r0 = r11.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            ts1 r1 = r0.r
            int r1 = r1.m()
            ts1 r2 = r0.r
            int r2 = r2.i()
            r3 = -1
            r4 = 1
            if (r13 <= r12) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r3
        L17:
            if (r12 == r13) goto L47
            java.lang.Object r6 = r11.f
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r12)
            android.view.View r6 = (android.view.View) r6
            ts1 r7 = r0.r
            int r7 = r7.g(r6)
            ts1 r8 = r0.r
            int r8 = r8.d(r6)
            r9 = 0
            if (r7 > r2) goto L34
            r10 = r4
            goto L35
        L34:
            r10 = r9
        L35:
            if (r8 < r1) goto L38
            r9 = r4
        L38:
            if (r10 == 0) goto L45
            if (r9 == 0) goto L45
            if (r7 < r1) goto L40
            if (r8 <= r2) goto L45
        L40:
            int r11 = defpackage.gg5.G(r6)
            return r11
        L45:
            int r12 = r12 + r5
            goto L17
        L47:
            return r3
    }

    public java.lang.Object h(java.lang.Object r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.g
            q61 r0 = (defpackage.q61) r0
            monitor-enter(r0)
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1f
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            int r6 = r5.d     // Catch: java.lang.Throwable -> L1f
            int r6 = r6 + 1
            r5.d = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return r1
        L1f:
            r5 = move-exception
            goto L6a
        L21:
            int r1 = r5.e     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + 1
            r5.e = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            java.lang.Object r0 = r5.c(r6)
            if (r0 != 0) goto L30
            r5 = 0
            return r5
        L30:
            java.lang.Object r1 = r5.g
            q61 r1 = (defpackage.q61) r1
            monitor-enter(r1)
            java.lang.Object r2 = r5.f     // Catch: java.lang.Throwable -> L67
            wb1 r2 = (defpackage.wb1) r2     // Catch: java.lang.Throwable -> L67
            r2.getClass()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashMap r2 = r2.b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.put(r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L51
            java.lang.Object r3 = r5.f     // Catch: java.lang.Throwable -> L67
            wb1 r3 = (defpackage.wb1) r3     // Catch: java.lang.Throwable -> L67
            r3.getClass()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashMap r3 = r3.b     // Catch: java.lang.Throwable -> L67
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L67
            goto L5a
        L51:
            int r3 = r5.c     // Catch: java.lang.Throwable -> L67
            int r4 = r5.n(r6, r0)     // Catch: java.lang.Throwable -> L67
            int r3 = r3 + r4
            r5.c = r3     // Catch: java.lang.Throwable -> L67
        L5a:
            monitor-exit(r1)
            if (r2 == 0) goto L61
            r5.d(r6, r0, r2)
            return r2
        L61:
            int r6 = r5.b
            r5.p(r6)
            return r0
        L67:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L6a:
            monitor-exit(r0)
            throw r5
    }

    public int i(int r3) {
            r2 = this;
            int r0 = r2.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r2.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L12
            return r3
        L12:
            r2.a()
            int r2 = r2.c
            return r2
    }

    public android.view.View j(int r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            java.lang.Object r5 = r5.f
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r1 = 0
            r2 = -1
            if (r7 != r2) goto L39
            int r7 = r5.size()
            r2 = 0
        L11:
            if (r2 >= r7) goto L38
            java.lang.Object r3 = r5.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r0.w
            if (r4 == 0) goto L23
            int r4 = defpackage.gg5.G(r3)
            if (r4 <= r6) goto L38
        L23:
            boolean r4 = r0.w
            if (r4 != 0) goto L2e
            int r4 = defpackage.gg5.G(r3)
            if (r4 < r6) goto L2e
            goto L38
        L2e:
            boolean r4 = r3.hasFocusable()
            if (r4 == 0) goto L38
            int r2 = r2 + 1
            r1 = r3
            goto L11
        L38:
            return r1
        L39:
            int r7 = r5.size()
            int r7 = r7 + (-1)
        L3f:
            if (r7 < 0) goto L66
            java.lang.Object r2 = r5.get(r7)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r0.w
            if (r3 == 0) goto L51
            int r3 = defpackage.gg5.G(r2)
            if (r3 >= r6) goto L66
        L51:
            boolean r3 = r0.w
            if (r3 != 0) goto L5c
            int r3 = defpackage.gg5.G(r2)
            if (r3 > r6) goto L5c
            goto L66
        L5c:
            boolean r3 = r2.hasFocusable()
            if (r3 == 0) goto L66
            int r7 = r7 + (-1)
            r1 = r2
            goto L3f
        L66:
            return r1
    }

    public int k(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r3.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto Lb
            return r1
        Lb:
            int r1 = r0.size()
            if (r1 != 0) goto L12
            return r4
        L12:
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            wo6 r0 = (defpackage.wo6) r0
            java.lang.Object r1 = r3.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            ts1 r1 = r1.r
            int r4 = r1.g(r4)
            r3.b = r4
            r0.getClass()
            int r3 = r3.b
            return r3
    }

    public java.lang.Object l(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.g
            q61 r0 = (defpackage.q61) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = r4.n(r5, r6)     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + r2
            r4.c = r1     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L2a
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            int r2 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r3 = r4.n(r5, r1)     // Catch: java.lang.Throwable -> L2a
            int r2 = r2 - r3
            r4.c = r2     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L38
        L2c:
            monitor-exit(r0)
            if (r1 == 0) goto L32
            r4.d(r5, r1, r6)
        L32:
            int r5 = r4.b
            r4.p(r5)
            return r1
        L38:
            monitor-exit(r0)
            throw r4
    }

    public java.lang.Object m(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.g
            q61 r0 = (defpackage.q61) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1e
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L1e
            r1.getClass()     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            int r2 = r4.c     // Catch: java.lang.Throwable -> L1e
            int r3 = r4.n(r5, r1)     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 - r3
            r4.c = r2     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r4 = move-exception
            goto L28
        L20:
            monitor-exit(r0)
            if (r1 == 0) goto L27
            r0 = 0
            r4.d(r5, r1, r0)
        L27:
            return r1
        L28:
            monitor-exit(r0)
            throw r4
    }

    public int n(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r1 = r1.o(r2, r3)
            if (r1 < 0) goto L7
            return r1
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Negative size: "
            r1.<init>(r0)
            r1.append(r2)
            r2 = 61
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public int o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0 = 1
            return r0
    }

    public void p(int r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5.g
            q61 r0 = (defpackage.q61) r0
            monitor-enter(r0)
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L6e
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L6e
            goto L1c
        L1a:
            r5 = move-exception
            goto L76
        L1c:
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r6) goto L6c
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2d
            goto L6c
        L2d:
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            wb1 r1 = (defpackage.wb1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = defpackage.gt0.I0(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L46
            monitor-exit(r0)
            return
        L46:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r5.f     // Catch: java.lang.Throwable -> L1a
            wb1 r3 = (defpackage.wb1) r3     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r3 = r3.b     // Catch: java.lang.Throwable -> L1a
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r3 = r5.c     // Catch: java.lang.Throwable -> L1a
            int r4 = r5.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 - r4
            r5.c = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r0 = 0
            r5.d(r2, r1, r0)
            goto L0
        L6c:
            monitor-exit(r0)
            return
        L6e:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            throw r6     // Catch: java.lang.Throwable -> L1a
        L76:
            monitor-exit(r0)
            throw r5
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = super.toString()
            return r4
        La:
            java.lang.String r0 = "LruCache[maxSize="
            java.lang.Object r1 = r4.g
            q61 r1 = (defpackage.q61) r1
            monitor-enter(r1)
            int r2 = r4.d     // Catch: java.lang.Throwable -> L1c
            int r3 = r4.e     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + r2
            if (r3 == 0) goto L1e
            int r2 = r2 * 100
            int r2 = r2 / r3
            goto L1f
        L1c:
            r4 = move-exception
            goto L50
        L1e:
            r2 = 0
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.b     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",hits="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.d     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",misses="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r4 = r4.e     // Catch: java.lang.Throwable -> L1c
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = ",hitRate="
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            r3.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "%]"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            return r4
        L50:
            monitor-exit(r1)
            throw r4
    }
}
