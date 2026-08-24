package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq0  reason: default package */
/* loaded from: classes.dex */
public final class dq0 extends defpackage.w1 {
    public java.util.zip.CRC32 w;
    public long x;
    public long y;

    public final defpackage.eq0 l0() {
            r7 = this;
            eq0 r0 = new eq0
            f1 r1 = r7.t
            if (r1 == 0) goto L14
            java.lang.Object r1 = r1.t
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.util.zip.CRC32 r2 = r7.w
            long r3 = r7.y
            long r5 = r7.x
            r0.<init>(r1, r2, r3, r5)
            return r0
        L14:
            java.lang.String r7 = "origin == null"
            defpackage.i.m(r7)
            r7 = 0
            return r7
    }
}
