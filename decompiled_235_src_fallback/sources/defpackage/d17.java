package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d17  reason: default package */
/* loaded from: classes.dex */
public final class d17 {
    public final defpackage.fp a;
    public final defpackage.s47 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final defpackage.qh1 g;
    public final defpackage.ki2 h;
    public final java.util.List i;
    public defpackage.s9 j;
    public defpackage.kk3 k;

    public d17(defpackage.fp r1, defpackage.s47 r2, boolean r3, defpackage.qh1 r4, defpackage.ki2 r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.c = r1
            r1 = 1
            r0.d = r1
            r0.e = r3
            r0.f = r1
            r0.g = r4
            r0.h = r5
            yt1 r1 = defpackage.yt1.A
            r0.i = r1
            return
    }

    public final void a(defpackage.kk3 r8) {
            r7 = this;
            s9 r0 = r7.j
            if (r0 == 0) goto Le
            kk3 r1 = r7.k
            if (r8 != r1) goto Le
            boolean r1 = r0.a()
            if (r1 == 0) goto L24
        Le:
            r7.k = r8
            s47 r0 = r7.b
            s47 r3 = defpackage.gi2.N(r0, r8)
            s9 r1 = new s9
            fp r2 = r7.a
            java.util.List r4 = r7.i
            qh1 r5 = r7.g
            ki2 r6 = r7.h
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r1
        L24:
            r7.j = r0
            return
    }
}
