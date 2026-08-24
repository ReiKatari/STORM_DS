package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr1  reason: default package */
/* loaded from: classes.dex */
public final class mr1 {
    public final android.content.Context a;
    public final int b;
    public long c;
    public android.widget.EdgeEffect d;
    public android.widget.EdgeEffect e;
    public android.widget.EdgeEffect f;
    public android.widget.EdgeEffect g;
    public android.widget.EdgeEffect h;
    public android.widget.EdgeEffect i;
    public android.widget.EdgeEffect j;
    public android.widget.EdgeEffect k;

    public mr1(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
    }

    public static boolean f(android.widget.EdgeEffect r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            return r0
    }

    public static boolean g(android.widget.EdgeEffect r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 0
            if (r1 < r2) goto L10
            float r4 = defpackage.up.e(r4)
            goto L11
        L10:
            r4 = r3
        L11:
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r1 = 1
            if (r4 != 0) goto L17
            r0 = r1
        L17:
            r4 = r0 ^ 1
            return r4
    }

    public final android.widget.EdgeEffect a(defpackage.lo4 r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            android.content.Context r2 = r6.a
            if (r0 < r1) goto Ld
            android.widget.EdgeEffect r0 = defpackage.up.a(r2)
            goto L12
        Ld:
            qs2 r0 = new qs2
            r0.<init>(r2)
        L12:
            int r1 = r6.b
            r0.setColor(r1)
            long r1 = r6.c
            r3 = 0
            boolean r1 = defpackage.q93.b(r1, r3)
            if (r1 != 0) goto L40
            lo4 r1 = defpackage.lo4.Vertical
            long r2 = r6.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 32
            if (r7 != r1) goto L38
            long r6 = r2 >> r6
            int r6 = (int) r6
            long r1 = r2 & r4
            int r7 = (int) r1
            r0.setSize(r6, r7)
            return r0
        L38:
            long r4 = r4 & r2
            int r7 = (int) r4
            long r1 = r2 >> r6
            int r6 = (int) r1
            r0.setSize(r7, r6)
        L40:
            return r0
    }

    public final android.widget.EdgeEffect b() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.e
            if (r0 != 0) goto Lc
            lo4 r0 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.e = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect c() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f
            if (r0 != 0) goto Lc
            lo4 r0 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.f = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect d() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.g
            if (r0 != 0) goto Lc
            lo4 r0 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.g = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect e() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.d
            if (r0 != 0) goto Lc
            lo4 r0 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.d = r0
        Lc:
            return r0
    }
}
