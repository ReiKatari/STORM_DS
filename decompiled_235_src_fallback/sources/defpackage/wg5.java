package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg5  reason: default package */
/* loaded from: classes.dex */
public abstract class wg5 {
    public static final java.util.List t = null;
    public final android.view.View a;
    public java.lang.ref.WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public defpackage.wg5 h;
    public defpackage.wg5 i;
    public int j;
    public java.util.ArrayList k;
    public java.util.List l;
    public int m;
    public defpackage.mg5 n;
    public boolean o;
    public int p;
    public int q;
    public androidx.recyclerview.widget.RecyclerView r;
    public defpackage.wf5 s;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            defpackage.wg5.t = r0
            return
    }

    public wg5(android.view.View r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.c = r0
            r3.d = r0
            r1 = -1
            r3.e = r1
            r3.f = r0
            r3.g = r0
            r1 = 0
            r3.h = r1
            r3.i = r1
            r3.k = r1
            r3.l = r1
            r2 = 0
            r3.m = r2
            r3.n = r1
            r3.o = r2
            r3.p = r2
            r3.q = r0
            if (r4 == 0) goto L29
            r3.a = r4
            return
        L29:
            java.lang.String r3 = "itemView may not be null"
            defpackage.i.h(r3)
            throw r1
    }

    public final void a(int r2) {
            r1 = this;
            int r0 = r1.j
            r2 = r2 | r0
            r1.j = r2
            return
    }

    public final int b() {
            r2 = this;
            int r0 = r2.g
            r1 = -1
            if (r0 != r1) goto L8
            int r2 = r2.c
            return r2
        L8:
            return r0
    }

    public final java.util.List c() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = r1.k
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 != 0) goto L11
            goto L14
        L11:
            java.util.List r1 = r1.l
            return r1
        L14:
            java.util.List r1 = defpackage.wg5.t
            return r1
    }

    public final boolean d() {
            r2 = this;
            android.view.View r0 = r2.a
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L12
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r2 = r2.r
            if (r0 == r2) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final boolean e() {
            r1 = this;
            int r1 = r1.j
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public final boolean f() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean g() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 16
            if (r0 != 0) goto L12
            java.util.WeakHashMap r0 = defpackage.ao7.a
            android.view.View r1 = r1.a
            boolean r1 = r1.hasTransientState()
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final boolean h() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean i() {
            r0 = this;
            mg5 r0 = r0.n
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean j() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean k() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void l(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.d
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r2.c
            r2.d = r0
        L9:
            int r0 = r2.g
            if (r0 != r1) goto L11
            int r0 = r2.c
            r2.g = r0
        L11:
            if (r4 == 0) goto L18
            int r4 = r2.g
            int r4 = r4 + r3
            r2.g = r4
        L18:
            int r4 = r2.c
            int r4 = r4 + r3
            r2.c = r4
            android.view.View r2 = r2.a
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            r3 = 1
            r2.c = r3
        L2e:
            return
    }

    public final void m() {
            r4 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            if (r0 == 0) goto L13
            boolean r0 = r4.j()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.String r0 = "Attempting to reset temp-detached ViewHolder: "
            java.lang.String r1 = ". ViewHolders should be fully detached before resetting."
            defpackage.e41.o(r4, r1, r0)
            return
        L13:
            r0 = 0
            r4.j = r0
            r1 = -1
            r4.c = r1
            r4.d = r1
            r2 = -1
            r4.e = r2
            r4.g = r1
            r4.m = r0
            r2 = 0
            r4.h = r2
            r4.i = r2
            java.util.ArrayList r2 = r4.k
            if (r2 == 0) goto L2f
            r2.clear()
        L2f:
            int r2 = r4.j
            r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
            r4.j = r2
            r4.p = r0
            r4.q = r1
            androidx.recyclerview.widget.RecyclerView.l(r4)
            return
    }

    public final void n(boolean r3) {
            r2 = this;
            int r0 = r2.m
            r1 = 1
            if (r3 == 0) goto L7
            int r0 = r0 - r1
            goto L8
        L7:
            int r0 = r0 + r1
        L8:
            r2.m = r0
            if (r0 >= 0) goto L2b
            r0 = 0
            r2.m = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            java.lang.String r1 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
            if (r0 != 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "View"
            android.util.Log.e(r1, r0)
            goto L40
        L27:
            defpackage.e41.p(r2, r1)
            return
        L2b:
            if (r3 != 0) goto L36
            if (r0 != r1) goto L36
            int r0 = r2.j
            r0 = r0 | 16
            r2.j = r0
            goto L40
        L36:
            if (r3 == 0) goto L40
            if (r0 != 0) goto L40
            int r0 = r2.j
            r0 = r0 & (-17)
            r2.j = r0
        L40:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.z1
            if (r0 == 0) goto L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setIsRecyclable val:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L5f:
            return
    }

    public final boolean o() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean p() {
            r0 = this;
            int r0 = r0.j
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isAnonymousClass()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "ViewHolder"
            goto L15
        Ld:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r2)
            int r2 = r4.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " position="
            r0.append(r2)
            int r2 = r4.c
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            long r2 = r4.e
            r0.append(r2)
            java.lang.String r2 = ", oldPos="
            r0.append(r2)
            int r2 = r4.d
            r0.append(r2)
            java.lang.String r2 = ", pLpos:"
            r0.append(r2)
            int r2 = r4.g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            boolean r0 = r4.i()
            if (r0 == 0) goto L6e
            java.lang.String r0 = " scrap "
            r1.append(r0)
            boolean r0 = r4.o
            if (r0 == 0) goto L69
            java.lang.String r0 = "[changeScrap]"
            goto L6b
        L69:
            java.lang.String r0 = "[attachedScrap]"
        L6b:
            r1.append(r0)
        L6e:
            boolean r0 = r4.f()
            if (r0 == 0) goto L79
            java.lang.String r0 = " invalid"
            r1.append(r0)
        L79:
            boolean r0 = r4.e()
            if (r0 != 0) goto L84
            java.lang.String r0 = " unbound"
            r1.append(r0)
        L84:
            int r0 = r4.j
            r0 = r0 & 2
            if (r0 == 0) goto L8f
            java.lang.String r0 = " update"
            r1.append(r0)
        L8f:
            boolean r0 = r4.h()
            if (r0 == 0) goto L9a
            java.lang.String r0 = " removed"
            r1.append(r0)
        L9a:
            boolean r0 = r4.o()
            if (r0 == 0) goto La5
            java.lang.String r0 = " ignored"
            r1.append(r0)
        La5:
            boolean r0 = r4.j()
            if (r0 == 0) goto Lb0
            java.lang.String r0 = " tmpDetached"
            r1.append(r0)
        Lb0:
            boolean r0 = r4.g()
            if (r0 != 0) goto Lce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " not recyclable("
            r0.<init>(r2)
            int r2 = r4.m
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
        Lce:
            int r0 = r4.j
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto Lda
            boolean r0 = r4.f()
            if (r0 == 0) goto Ldf
        Lda:
            java.lang.String r0 = " undefined adapter position"
            r1.append(r0)
        Ldf:
            android.view.View r4 = r4.a
            android.view.ViewParent r4 = r4.getParent()
            if (r4 != 0) goto Lec
            java.lang.String r4 = " no parent"
            r1.append(r4)
        Lec:
            java.lang.String r4 = "}"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }
}
