package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final vc.f f11790d = new vc.f("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final vc.f f11791e = new vc.f(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f11792a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11793b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f11794c;

    public t(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f11792a = str;
        this.f11793b = str2;
        this.f11794c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset a(pi.t r6) {
        /*
            java.lang.String[] r6 = r6.f11794c
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = a.a.E(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L22
        Le:
            r3 = r6[r2]
            java.lang.String r4 = "charset"
            r5 = 1
            boolean r3 = vc.o.P(r3, r4, r5)
            if (r3 == 0) goto L1d
            int r2 = r2 + r5
            r6 = r6[r2]
            goto L23
        L1d:
            if (r2 == r0) goto L22
            int r2 = r2 + 2
            goto Le
        L22:
            r6 = r1
        L23:
            if (r6 != 0) goto L26
            return r1
        L26:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L2b
            return r6
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.t.a(pi.t):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t) && nc.k.a(((t) obj).f11792a, this.f11792a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11792a.hashCode();
    }

    public final String toString() {
        return this.f11792a;
    }
}
