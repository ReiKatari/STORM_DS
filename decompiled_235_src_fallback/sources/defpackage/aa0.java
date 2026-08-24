package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa0  reason: default package */
/* loaded from: classes.dex */
public final class aa0 extends defpackage.ca0 {
    public final int X;
    public final int Y;

    public aa0(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2)
            int r0 = r3 + r4
            int r2 = r2.length
            defpackage.ea0.b(r3, r0, r2)
            r1.X = r3
            r1.Y = r4
            return
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final byte a(int r4) {
            r3 = this;
            int r0 = r4 + 1
            int r1 = r3.Y
            int r0 = r1 - r0
            r0 = r0 | r4
            if (r0 >= 0) goto L25
            if (r4 >= 0) goto L17
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = "Index < 0: "
            java.lang.String r4 = defpackage.lb1.g(r4, r0)
            r3.<init>(r4)
            throw r3
        L17:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r0 = "Index > length: "
            java.lang.String r2 = ", "
            java.lang.String r4 = defpackage.lb1.j(r0, r4, r1, r2)
            r3.<init>(r4)
            throw r3
        L25:
            int r0 = r3.X
            int r0 = r0 + r4
            byte[] r3 = r3.R
            r3 = r3[r0]
            return r3
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final void d(byte[] r3, int r4) {
            r2 = this;
            byte[] r0 = r2.R
            int r2 = r2.X
            r1 = 0
            java.lang.System.arraycopy(r0, r2, r3, r1, r4)
            return
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final byte f(int r2) {
            r1 = this;
            int r0 = r1.X
            int r0 = r0 + r2
            byte[] r1 = r1.R
            r1 = r1[r0]
            return r1
    }

    @Override // defpackage.ca0
    public final int g() {
            r0 = this;
            int r0 = r0.X
            return r0
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final int size() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }
}
