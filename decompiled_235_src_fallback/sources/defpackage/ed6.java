package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed6  reason: default package */
/* loaded from: classes.dex */
public final class ed6 extends defpackage.gk2 {
    public final java.lang.Object R;
    public final defpackage.i23 X;
    public final int Y;
    public final int Z;

    public ed6(defpackage.s23 r1, android.util.Size r2, defpackage.i23 r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.R = r1
            if (r2 != 0) goto L1d
            s23 r1 = r0.B
            int r1 = r1.getWidth()
            r0.Y = r1
            s23 r1 = r0.B
            int r1 = r1.getHeight()
            r0.Z = r1
            goto L29
        L1d:
            int r1 = r2.getWidth()
            r0.Y = r1
            int r1 = r2.getHeight()
            r0.Z = r1
        L29:
            r0.X = r3
            return
    }

    @Override // defpackage.gk2, defpackage.s23
    public final defpackage.i23 S() {
            r0 = this;
            i23 r0 = r0.X
            return r0
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getHeight() {
            r0 = this;
            int r0 = r0.Z
            return r0
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getWidth() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }
}
