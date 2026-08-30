package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    public static f f1843c;

    @Override // b4.b
    public final int[] e(int i2) {
        int length = i().length();
        if (length > 0 && i2 < length) {
            if (i2 < 0) {
                i2 = 0;
            }
            while (i2 < length && i().charAt(i2) == '\n' && (i().charAt(i2) == '\n' || (i2 != 0 && i().charAt(i2 - 1) != '\n'))) {
                i2++;
            }
            if (i2 >= length) {
                return null;
            }
            int i10 = i2 + 1;
            while (i10 < length && !r(i10)) {
                i10++;
            }
            return h(i2, i10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        return null;
     */
    @Override // b4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] p(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.i()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L2c
        Lb:
            if (r5 > 0) goto Le
            goto L2c
        Le:
            if (r5 <= r0) goto L11
            r5 = r0
        L11:
            r0 = 10
            if (r5 <= 0) goto L2a
            java.lang.String r1 = r4.i()
            int r2 = r5 + (-1)
            char r1 = r1.charAt(r2)
            if (r1 != r0) goto L2a
            boolean r1 = r4.r(r5)
            if (r1 != 0) goto L2a
            int r5 = r5 + (-1)
            goto L11
        L2a:
            if (r5 > 0) goto L2e
        L2c:
            r5 = 0
            return r5
        L2e:
            int r1 = r5 + (-1)
        L30:
            if (r1 <= 0) goto L4e
            java.lang.String r2 = r4.i()
            char r2 = r2.charAt(r1)
            if (r2 == r0) goto L4b
            if (r1 == 0) goto L4e
            java.lang.String r2 = r4.i()
            int r3 = r1 + (-1)
            char r2 = r2.charAt(r3)
            if (r2 != r0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + (-1)
            goto L30
        L4e:
            int[] r5 = r4.h(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.f.p(int):int[]");
    }

    public final boolean r(int i2) {
        if (i2 > 0 && i().charAt(i2 - 1) != '\n') {
            if (i2 == i().length() || i().charAt(i2) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
