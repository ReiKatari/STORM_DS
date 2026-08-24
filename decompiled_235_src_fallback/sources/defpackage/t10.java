package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: t10  reason: default package */
/* loaded from: classes.dex */
public final class t10 extends defpackage.l {
    public static final defpackage.s10 Companion = null;
    public static final java.util.Map m = null;
    public final defpackage.g10 l;

    static {
            s10 r0 = new s10
            r0.<init>()
            defpackage.t10.Companion = r0
            lh5 r0 = defpackage.gh5.a
            java.lang.Class<g10> r1 = defpackage.g10.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r0.getClass()
            he7 r0 = new he7
            r0.<init>(r1)
            wf7 r1 = defpackage.l.b
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r1)
            r0.getClass()
            defpackage.t10.m = r0
            return
    }

    public t10(int r3, defpackage.g10 r4) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r1 != r0) goto Lb
            r2.<init>()
            r2.l = r4
            return
        Lb:
            r10 r2 = defpackage.r10.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public t10(defpackage.g10 r1) {
            r0 = this;
            r0.<init>()
            r0.l = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.t10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t10 r4 = (defpackage.t10) r4
            g10 r3 = r3.l
            g10 r4 = r4.l
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            g10 r0 = r0.l
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackgroundPreview(backgroundParcelable="
            r0.<init>(r1)
            g10 r2 = r2.l
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
