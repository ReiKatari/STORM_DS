package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n14  reason: default package */
/* loaded from: classes.dex */
public final class n14 {
    public final java.util.regex.Matcher a;
    public final java.lang.CharSequence b;
    public final defpackage.m14 c;
    public defpackage.l14 d;

    public n14(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            m14 r1 = new m14
            r2 = 0
            r1.<init>(r0, r2)
            r0.c = r1
            return
    }

    public final java.util.List a() {
            r1 = this;
            l14 r0 = r1.d
            if (r0 != 0) goto Lb
            l14 r0 = new l14
            r0.<init>(r1)
            r1.d = r0
        Lb:
            l14 r1 = r1.d
            r1.getClass()
            return r1
    }

    public final defpackage.l93 b() {
            r1 = this;
            java.util.regex.Matcher r1 = r1.a
            int r0 = r1.start()
            int r1 = r1.end()
            l93 r1 = defpackage.gi2.R(r0, r1)
            return r1
    }

    public final defpackage.n14 c() {
            r4 = this;
            java.util.regex.Matcher r0 = r4.a
            int r1 = r0.end()
            int r2 = r0.end()
            int r3 = r0.start()
            if (r2 != r3) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            int r1 = r1 + r2
            java.lang.CharSequence r4 = r4.b
            int r2 = r4.length()
            if (r1 > r2) goto L2c
            java.util.regex.Pattern r0 = r0.pattern()
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            n14 r4 = defpackage.kn2.k(r0, r1, r4)
            return r4
        L2c:
            r4 = 0
            return r4
    }
}
