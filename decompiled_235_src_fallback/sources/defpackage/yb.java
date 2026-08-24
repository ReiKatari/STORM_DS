package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb  reason: default package */
/* loaded from: classes.dex */
public final class yb {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final defpackage.sk1 G;
    public final defpackage.r7 H;
    public final android.content.Context a;
    public final defpackage.ac b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public androidx.appcompat.app.AlertController$RecycleListView f;
    public android.view.View g;
    public int h;
    public boolean i;
    public android.widget.Button j;
    public java.lang.CharSequence k;
    public android.os.Message l;
    public android.widget.Button m;
    public java.lang.CharSequence n;
    public android.os.Message o;
    public android.widget.Button p;
    public java.lang.CharSequence q;
    public android.os.Message r;
    public androidx.core.widget.NestedScrollView s;
    public android.graphics.drawable.Drawable t;
    public android.widget.ImageView u;
    public android.widget.TextView v;
    public android.widget.TextView w;
    public android.view.View x;
    public android.widget.ListAdapter y;
    public int z;

    public yb(android.content.Context r5, defpackage.ac r6, android.view.Window r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.i = r0
            r1 = -1
            r4.z = r1
            r7 r1 = new r7
            r2 = 1
            r1.<init>(r4, r2)
            r4.H = r1
            r4.a = r5
            r4.b = r6
            r4.c = r7
            sk1 r7 = new sk1
            r7.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            r7.b = r1
            r4.G = r7
            int[] r7 = defpackage.m75.e
            r1 = 2130968623(0x7f04002f, float:1.7545905E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r3, r7, r1, r0)
            int r7 = r5.getResourceId(r0, r0)
            r4.A = r7
            r7 = 2
            r5.getResourceId(r7, r0)
            r7 = 4
            int r7 = r5.getResourceId(r7, r0)
            r4.B = r7
            r7 = 5
            int r7 = r5.getResourceId(r7, r0)
            r4.C = r7
            r7 = 7
            int r7 = r5.getResourceId(r7, r0)
            r4.D = r7
            r7 = 3
            int r7 = r5.getResourceId(r7, r0)
            r4.E = r7
            r7 = 6
            boolean r7 = r5.getBoolean(r7, r2)
            r4.F = r7
            r5.getDimensionPixelSize(r2, r0)
            r5.recycle()
            tq r4 = r6.f()
            r4.i(r2)
            return
    }

    public static boolean a(android.view.View r4) {
            boolean r0 = r4.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L14:
            if (r0 <= 0) goto L23
            int r0 = r0 + (-1)
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = a(r3)
            if (r3 == 0) goto L14
            return r1
        L23:
            return r2
    }

    public static android.view.ViewGroup b(android.view.View r2, android.view.View r3) {
            if (r2 != 0) goto Lf
            boolean r2 = r3 instanceof android.view.ViewStub
            if (r2 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L1e:
            boolean r3 = r2 instanceof android.view.ViewStub
            if (r3 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }

    public final void c(int r2, java.lang.CharSequence r3, android.content.DialogInterface.OnClickListener r4) {
            r1 = this;
            if (r4 == 0) goto L9
            sk1 r0 = r1.G
            android.os.Message r4 = r0.obtainMessage(r2, r4)
            goto La
        L9:
            r4 = 0
        La:
            r0 = -3
            if (r2 == r0) goto L23
            r0 = -2
            if (r2 == r0) goto L1e
            r0 = -1
            if (r2 != r0) goto L18
            r1.k = r3
            r1.l = r4
            return
        L18:
            java.lang.String r1 = "Button does not exist"
            defpackage.i.h(r1)
            return
        L1e:
            r1.n = r3
            r1.o = r4
            return
        L23:
            r1.q = r3
            r1.r = r4
            return
    }
}
