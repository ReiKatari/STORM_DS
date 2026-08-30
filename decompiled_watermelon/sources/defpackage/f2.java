package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f2  reason: default package */
/* loaded from: classes.dex */
public final class f2 extends b2 {
    public static f2 c;

    @Override // defpackage.b2
    public final int[] f(int i) {
        int length = j().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !s(i2)) {
                i2++;
            }
            return i(i, i2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        return null;
     */
    @Override // defpackage.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] q(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.j()
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
            java.lang.String r1 = r4.j()
            int r2 = r5 + (-1)
            char r1 = r1.charAt(r2)
            if (r1 != r0) goto L2a
            boolean r1 = r4.s(r5)
            if (r1 != 0) goto L2a
            int r5 = r5 + (-1)
            goto L11
        L2a:
            if (r5 > 0) goto L2e
        L2c:
            r4 = 0
            return r4
        L2e:
            int r1 = r5 + (-1)
        L30:
            if (r1 <= 0) goto L4e
            java.lang.String r2 = r4.j()
            char r2 = r2.charAt(r1)
            if (r2 == r0) goto L4b
            if (r1 == 0) goto L4e
            java.lang.String r2 = r4.j()
            int r3 = r1 + (-1)
            char r2 = r2.charAt(r3)
            if (r2 != r0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + (-1)
            goto L30
        L4e:
            int[] r4 = r4.i(r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2.q(int):int[]");
    }

    public final boolean s(int i) {
        if (i > 0 && j().charAt(i - 1) != '\n') {
            if (i == j().length() || j().charAt(i) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
