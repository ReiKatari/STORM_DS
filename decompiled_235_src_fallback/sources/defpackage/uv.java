package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv  reason: default package */
/* loaded from: classes.dex */
public final class uv implements defpackage.nh1 {
    public final char a;

    public uv(char r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.nh1
    public final void a(defpackage.vz6 r2, defpackage.vz6 r3, int r4) {
            r1 = this;
            char r1 = r1.a
            java.lang.String.valueOf(r1)
            r1 = 1
            if (r4 != r1) goto Le
            pt1 r1 = new pt1
            r1.<init>()
            goto L13
        Le:
            zs6 r1 = new zs6
            r1.<init>()
        L13:
            java.lang.Object r4 = r2.f
            a21 r4 = (defpackage.a21) r4
        L17:
            if (r4 == 0) goto L24
            if (r4 == r3) goto L24
            java.lang.Object r0 = r4.f
            a21 r0 = (defpackage.a21) r0
            r1.b(r4)
            r4 = r0
            goto L17
        L24:
            r1.j()
            java.lang.Object r3 = r2.f
            a21 r3 = (defpackage.a21) r3
            r1.f = r3
            if (r3 == 0) goto L31
            r3.e = r1
        L31:
            r1.e = r2
            r2.f = r1
            java.lang.Object r2 = r2.b
            a21 r2 = (defpackage.a21) r2
            r1.b = r2
            java.lang.Object r3 = r1.f
            a21 r3 = (defpackage.a21) r3
            if (r3 != 0) goto L43
            r2.d = r1
        L43:
            return
    }

    @Override // defpackage.nh1
    public final char b() {
            r0 = this;
            char r0 = r0.a
            return r0
    }

    @Override // defpackage.nh1
    public final int c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.nh1
    public final int d(defpackage.mh1 r2, defpackage.mh1 r3) {
            r1 = this;
            boolean r1 = r2.d
            if (r1 != 0) goto L8
            boolean r1 = r3.c
            if (r1 == 0) goto L17
        L8:
            int r1 = r3.h
            int r0 = r1 % 3
            if (r0 == 0) goto L17
            int r0 = r2.h
            int r0 = r0 + r1
            int r0 = r0 % 3
            if (r0 != 0) goto L17
            r1 = 0
            return r1
        L17:
            int r1 = r2.g
            r2 = 2
            if (r1 < r2) goto L21
            int r1 = r3.g
            if (r1 < r2) goto L21
            return r2
        L21:
            r1 = 1
            return r1
    }

    @Override // defpackage.nh1
    public final char e() {
            r0 = this;
            char r0 = r0.a
            return r0
    }
}
