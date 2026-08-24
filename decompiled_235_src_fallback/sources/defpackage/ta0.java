package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta0  reason: default package */
/* loaded from: classes.dex */
public final class ta0 {
    public final defpackage.go3 a;
    public final defpackage.go3 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final defpackage.yw2 f;

    public ta0(defpackage.fe5 r10) {
            r9 = this;
            r9.<init>()
            xr3 r0 = defpackage.xr3.NONE
            sa0 r1 = new sa0
            r2 = 0
            r1.<init>(r9, r2)
            go3 r1 = defpackage.kj2.M(r0, r1)
            r9.a = r1
            sa0 r1 = new sa0
            r3 = 1
            r1.<init>(r9, r3)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r9.b = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r4 = r10.y(r0)
            long r4 = java.lang.Long.parseLong(r4)
            r9.c = r4
            java.lang.String r4 = r10.y(r0)
            long r4 = java.lang.Long.parseLong(r4)
            r9.d = r4
            java.lang.String r4 = r10.y(r0)
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 <= 0) goto L41
            goto L42
        L41:
            r3 = r2
        L42:
            r9.e = r3
            java.lang.String r3 = r10.y(r0)
            int r3 = java.lang.Integer.parseInt(r3)
            ww2 r4 = new ww2
            r4.<init>(r2, r2)
            r5 = r2
        L52:
            if (r5 >= r3) goto L87
            java.lang.String r6 = r10.y(r0)
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a
            r7 = 58
            r8 = 6
            int r7 = defpackage.qs6.s0(r7, r2, r8, r6)
            r8 = -1
            if (r7 == r8) goto L7c
            java.lang.String r8 = r6.substring(r2, r7)
            java.lang.CharSequence r8 = defpackage.qs6.T0(r8)
            java.lang.String r8 = r8.toString()
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)
            r4.e(r8, r6)
            int r5 = r5 + 1
            goto L52
        L7c:
            java.lang.String r9 = "Unexpected header: "
            java.lang.String r9 = r9.concat(r6)
            defpackage.i.f(r9)
            r9 = 0
            throw r9
        L87:
            yw2 r10 = r4.f()
            r9.f = r10
            return
    }

    public ta0(defpackage.wl5 r5) {
            r4 = this;
            r4.<init>()
            xr3 r0 = defpackage.xr3.NONE
            sa0 r1 = new sa0
            r2 = 0
            r1.<init>(r4, r2)
            go3 r1 = defpackage.kj2.M(r0, r1)
            r4.a = r1
            sa0 r1 = new sa0
            r3 = 1
            r1.<init>(r4, r3)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r4.b = r0
            long r0 = r5.h0
            r4.c = r0
            long r0 = r5.i0
            r4.d = r0
            pv2 r0 = r5.X
            if (r0 == 0) goto L2a
            r2 = r3
        L2a:
            r4.e = r2
            yw2 r5 = r5.Y
            r4.f = r5
            return
    }

    public final void a(defpackage.ee5 r5) {
            r4 = this;
            long r0 = r4.c
            r5.h0(r0)
            r0 = 10
            r5.writeByte(r0)
            long r1 = r4.d
            r5.h0(r1)
            r5.writeByte(r0)
            boolean r1 = r4.e
            if (r1 == 0) goto L19
            r1 = 1
            goto L1b
        L19:
            r1 = 0
        L1b:
            r5.h0(r1)
            r5.writeByte(r0)
            yw2 r4 = r4.f
            int r1 = r4.size()
            long r1 = (long) r1
            r5.h0(r1)
            r5.writeByte(r0)
            int r1 = r4.size()
            r2 = 0
        L33:
            if (r2 >= r1) goto L4e
            java.lang.String r3 = r4.b(r2)
            r5.H(r3)
            java.lang.String r3 = ": "
            r5.H(r3)
            java.lang.String r3 = r4.d(r2)
            r5.H(r3)
            r5.writeByte(r0)
            int r2 = r2 + 1
            goto L33
        L4e:
            return
    }
}
