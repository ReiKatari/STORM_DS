package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl2  reason: default package */
/* loaded from: classes.dex */
public abstract class vl2 {
    public final defpackage.gl2 a;
    public final java.lang.ClassLoader b;
    public final java.util.ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public java.lang.String k;
    public int l;
    public java.lang.CharSequence m;
    public int n;
    public java.lang.CharSequence o;
    public java.util.ArrayList p;
    public java.util.ArrayList q;
    public boolean r;
    public java.util.ArrayList s;

    public vl2(defpackage.gl2 r2, java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 1
            r1.j = r0
            r0 = 0
            r1.r = r0
            r1.a = r2
            r1.b = r3
            return
    }

    public final void b(defpackage.ul2 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.c
            r0.add(r2)
            int r0 = r1.d
            r2.d = r0
            int r0 = r1.e
            r2.e = r0
            int r0 = r1.f
            r2.f = r0
            int r1 = r1.g
            r2.g = r1
            return
    }

    public final void c() {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto Lb
            r0 = 1
            r1.i = r0
            r0 = 0
            r1.k = r0
            return
        Lb:
            java.lang.String r1 = "This FragmentTransaction is not allowed to be added to the back stack."
            defpackage.i.m(r1)
            return
    }

    public abstract void d(int r1, androidx.fragment.app.o r2, java.lang.String r3, int r4);

    public final void e(int r2, androidx.fragment.app.o r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 2
            r1.d(r2, r3, r4, r0)
            return
        L7:
            java.lang.String r1 = "Must use non-zero containerViewId"
            defpackage.i.h(r1)
            return
    }
}
