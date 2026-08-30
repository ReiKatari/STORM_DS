package j4;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f7427a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7428b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7429c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7430d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7431e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f7432f;

    /* renamed from: g  reason: collision with root package name */
    public final p1.c f7433g;

    public c(long j2, long j10, long j11, long j12, long j13, float[] fArr, p1.c cVar) {
        this.f7427a = j2;
        this.f7428b = j10;
        this.f7429c = j11;
        this.f7430d = j12;
        this.f7431e = j13;
        this.f7432f = fArr;
        this.f7433g = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<j4.c> r2 = j4.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            j4.c r7 = (j4.c) r7
            long r2 = r6.f7427a
            long r4 = r7.f7427a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f7428b
            long r4 = r7.f7428b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f7431e
            long r4 = r7.f7431e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f7429c
            long r4 = r7.f7429c
            boolean r2 = x4.j.a(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f7430d
            long r4 = r7.f7430d
            boolean r2 = x4.j.a(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f7432f
            float[] r3 = r6.f7432f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            p1.c r2 = r6.f7433g
            p1.c r7 = r7.f7433g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2;
        int f8 = w.d.f(this.f7430d, w.d.f(this.f7429c, w.d.f(this.f7431e, w.d.f(this.f7428b, Long.hashCode(this.f7427a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f7432f;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        return this.f7433g.hashCode() + ((f8 + i2) * 31);
    }
}
