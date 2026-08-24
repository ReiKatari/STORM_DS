package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru0  reason: default package */
/* loaded from: classes.dex */
public final class ru0 implements java.util.Comparator {
    public final boolean a;

    public ru0(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            android.util.Size r5 = (android.util.Size) r5
            android.util.Size r6 = (android.util.Size) r6
            int r0 = r5.getWidth()
            long r0 = (long) r0
            int r5 = r5.getHeight()
            long r2 = (long) r5
            long r0 = r0 * r2
            int r5 = r6.getWidth()
            long r2 = (long) r5
            int r5 = r6.getHeight()
            long r5 = (long) r5
            long r2 = r2 * r5
            long r0 = r0 - r2
            int r5 = java.lang.Long.signum(r0)
            boolean r4 = r4.a
            if (r4 == 0) goto L25
            int r5 = r5 * (-1)
        L25:
            return r5
    }
}
