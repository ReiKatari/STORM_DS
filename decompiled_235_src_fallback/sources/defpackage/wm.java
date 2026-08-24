package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm  reason: default package */
/* loaded from: classes.dex */
public final class wm {
    public final org.xmlpull.v1.XmlPullParser a;
    public int b;
    public final defpackage.t9 c;

    public wm(android.content.res.XmlResourceParser r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r2 = 0
            r1.b = r2
            t9 r2 = new t9
            r2.<init>()
            r0 = 64
            float[] r0 = new float[r0]
            r2.b = r0
            r1.c = r2
            return
    }

    public final float a(android.content.res.TypedArray r2, java.lang.String r3, int r4, float r5) {
            r1 = this;
            org.xmlpull.v1.XmlPullParser r0 = r1.a
            boolean r3 = defpackage.xk2.v(r0, r3)
            if (r3 != 0) goto L9
            goto Ld
        L9:
            float r5 = r2.getFloat(r4, r5)
        Ld:
            int r2 = r2.getChangingConfigurations()
            r1.b(r2)
            return r5
    }

    public final void b(int r2) {
            r1 = this;
            int r0 = r1.b
            r2 = r2 | r0
            r1.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.wm
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wm r5 = (defpackage.wm) r5
            org.xmlpull.v1.XmlPullParser r1 = r4.a
            org.xmlpull.v1.XmlPullParser r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            org.xmlpull.v1.XmlPullParser r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AndroidVectorParser(xmlParser="
            r0.<init>(r1)
            org.xmlpull.v1.XmlPullParser r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", config="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
