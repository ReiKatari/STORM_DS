package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia2  reason: default package */
/* loaded from: classes.dex */
public final class ia2 extends defpackage.u {
    public final defpackage.ha2 a;
    public java.lang.String b;
    public final java.lang.StringBuilder c;

    public ia2(char r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            ha2 r0 = new ha2
            r0.<init>()
            r2.a = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2.c = r1
            r0.g = r3
            r0.h = r4
            r0.i = r5
            return
    }

    @Override // defpackage.u
    public final void a(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = r1.b
            if (r0 != 0) goto Lb
            java.lang.String r2 = r2.toString()
            r1.b = r2
            return
        Lb:
            java.lang.StringBuilder r1 = r1.c
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return
    }

    @Override // defpackage.u
    public final void c() {
            r2 = this;
            java.lang.String r0 = r2.b
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = defpackage.c62.a(r0)
            ha2 r1 = r2.a
            r1.j = r0
            java.lang.StringBuilder r2 = r2.c
            java.lang.String r2 = r2.toString()
            r1.k = r2
            return
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            ha2 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r6) {
            r5 = this;
            int r0 = r6.e
            int r1 = r6.b
            java.lang.CharSequence r2 = r6.a
            int r6 = r6.g
            r3 = 4
            ha2 r5 = r5.a
            if (r6 >= r3) goto L34
            char r6 = r5.g
            int r3 = r5.h
            int r4 = r2.length()
            int r6 = defpackage.bl2.S(r6, r0, r4, r2)
            int r6 = r6 - r0
            if (r6 >= r3) goto L1d
            goto L34
        L1d:
            int r0 = r0 + r6
            int r6 = r2.length()
            int r6 = defpackage.bl2.T(r2, r0, r6)
            int r0 = r2.length()
            if (r6 != r0) goto L34
            b50 r5 = new b50
            r6 = -1
            r0 = 1
            r5.<init>(r6, r0, r6)
            return r5
        L34:
            int r5 = r5.i
            int r6 = r2.length()
        L3a:
            if (r5 <= 0) goto L4b
            if (r1 >= r6) goto L4b
            char r0 = r2.charAt(r1)
            r3 = 32
            if (r0 != r3) goto L4b
            int r1 = r1 + 1
            int r5 = r5 + (-1)
            goto L3a
        L4b:
            b50 r5 = defpackage.b50.a(r1)
            return r5
    }
}
