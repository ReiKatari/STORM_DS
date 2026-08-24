package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc4  reason: default package */
/* loaded from: classes.dex */
public final class hc4 implements java.lang.Comparable {
    public final defpackage.ic4 A;
    public final android.os.Bundle B;
    public final boolean L;
    public final int R;
    public final boolean X;

    public hc4(defpackage.ic4 r1, android.os.Bundle r2, boolean r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    public final int a(defpackage.hc4 r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r5.X
            boolean r1 = r5.L
            android.os.Bundle r2 = r5.B
            boolean r3 = r4.L
            if (r3 == 0) goto L10
            if (r1 != 0) goto L10
            goto L46
        L10:
            if (r3 != 0) goto L15
            if (r1 == 0) goto L15
            goto L4c
        L15:
            int r1 = r4.R
            int r5 = r5.R
            int r1 = r1 - r5
            if (r1 <= 0) goto L1d
            goto L46
        L1d:
            if (r1 >= 0) goto L20
            goto L4c
        L20:
            android.os.Bundle r5 = r4.B
            if (r5 == 0) goto L27
            if (r2 != 0) goto L27
            goto L46
        L27:
            if (r5 != 0) goto L2c
            if (r2 == 0) goto L2c
            goto L4c
        L2c:
            if (r5 == 0) goto L40
            int r5 = r5.size()
            r2.getClass()
            int r1 = r2.size()
            int r5 = r5 - r1
            if (r5 <= 0) goto L3d
            goto L46
        L3d:
            if (r5 >= 0) goto L40
            goto L4c
        L40:
            boolean r4 = r4.X
            if (r4 == 0) goto L48
            if (r0 != 0) goto L48
        L46:
            r4 = 1
            return r4
        L48:
            if (r4 != 0) goto L4e
            if (r0 == 0) goto L4e
        L4c:
            r4 = -1
            return r4
        L4e:
            r4 = 0
            return r4
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            hc4 r1 = (defpackage.hc4) r1
            int r0 = r0.a(r1)
            return r0
    }
}
