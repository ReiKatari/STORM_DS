package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g50  reason: default package */
/* loaded from: classes.dex */
public final class g50 extends defpackage.u {
    public final defpackage.e50 a;

    public g50() {
            r1 = this;
            r1.<init>()
            e50 r0 = new e50
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            e50 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r4) {
            r3 = this;
            int r3 = r4.e
            java.lang.CharSequence r0 = r4.a
            int r1 = r4.g
            r2 = 4
            if (r1 >= r2) goto L3f
            int r1 = r0.length()
            if (r3 >= r1) goto L3f
            char r0 = r0.charAt(r3)
            r1 = 62
            if (r0 != r1) goto L3f
            int r0 = r4.c
            int r1 = r4.g
            int r0 = r0 + r1
            int r1 = r0 + 1
            java.lang.CharSequence r4 = r4.a
            int r3 = r3 + 1
            int r2 = r4.length()
            if (r3 >= r2) goto L37
            char r3 = r4.charAt(r3)
            r4 = 9
            if (r3 == r4) goto L35
            r4 = 32
            if (r3 == r4) goto L35
            goto L37
        L35:
            int r1 = r0 + 2
        L37:
            b50 r3 = new b50
            r4 = -1
            r0 = 0
            r3.<init>(r4, r0, r1)
            return r3
        L3f:
            r3 = 0
            return r3
    }
}
