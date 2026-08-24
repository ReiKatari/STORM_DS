package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu7  reason: default package */
/* loaded from: classes.dex */
public abstract class iu7 {
    public final defpackage.vu7 a;
    public defpackage.e83[] b;
    public final android.graphics.Rect[][] c;
    public final android.graphics.Rect[][] d;

    public iu7() {
            r1 = this;
            vu7 r0 = new vu7
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public iu7(defpackage.vu7 r3) {
            r2 = this;
            r2.<init>()
            r0 = 10
            android.graphics.Rect[][] r1 = new android.graphics.Rect[r0]
            r2.c = r1
            android.graphics.Rect[][] r0 = new android.graphics.Rect[r0]
            r2.d = r0
            r2.a = r3
            r2.c(r3)
            return
    }

    public final void a() {
            r5 = this;
            e83[] r0 = r5.b
            if (r0 == 0) goto L51
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            vu7 r3 = r5.a
            if (r0 != 0) goto L15
            r0 = 2
            ru7 r4 = r3.a
            e83 r0 = r4.h(r0)
        L15:
            if (r1 != 0) goto L1d
            ru7 r1 = r3.a
            e83 r1 = r1.h(r2)
        L1d:
            e83 r0 = defpackage.e83.a(r1, r0)
            r5.h(r0)
            e83[] r0 = r5.b
            r1 = 16
            int r1 = defpackage.su7.a(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L33
            r5.g(r0)
        L33:
            e83[] r0 = r5.b
            r1 = 32
            int r1 = defpackage.su7.a(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L42
            r5.e(r0)
        L42:
            e83[] r0 = r5.b
            r1 = 64
            int r1 = defpackage.su7.a(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L51
            r5.i(r0)
        L51:
            return
    }

    public abstract defpackage.vu7 b();

    public void c(defpackage.vu7 r5) {
            r4 = this;
            r0 = 1
        L1:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L3c
            ru7 r1 = r5.a
            java.util.List r1 = r1.e(r0)
            int r2 = defpackage.su7.a(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.c
            r3[r2] = r1
            r1 = 8
            if (r0 == r1) goto L39
            ru7 r1 = r5.a
            java.util.List r1 = r1.f(r0)
            int r3 = r1.size()
            android.graphics.Rect[] r3 = new android.graphics.Rect[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            android.graphics.Rect[] r1 = (android.graphics.Rect[]) r1
            android.graphics.Rect[][] r3 = r4.d
            r3[r2] = r1
        L39:
            int r0 = r0 << 1
            goto L1
        L3c:
            return
    }

    public void d(int r4, defpackage.e83 r5) {
            r3 = this;
            e83[] r0 = r3.b
            if (r0 != 0) goto La
            r0 = 10
            e83[] r0 = new defpackage.e83[r0]
            r3.b = r0
        La:
            r0 = 1
        Lb:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L1f
            r1 = r4 & r0
            if (r1 != 0) goto L14
            goto L1c
        L14:
            e83[] r1 = r3.b
            int r2 = defpackage.su7.a(r0)
            r1[r2] = r5
        L1c:
            int r0 = r0 << 1
            goto Lb
        L1f:
            return
    }

    public void e(defpackage.e83 r1) {
            r0 = this;
            return
    }

    public abstract void f(defpackage.e83 r1);

    public void g(defpackage.e83 r1) {
            r0 = this;
            return
    }

    public abstract void h(defpackage.e83 r1);

    public void i(defpackage.e83 r1) {
            r0 = this;
            return
    }
}
