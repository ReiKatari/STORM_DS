package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x04  reason: default package */
/* loaded from: classes.dex */
public final class x04 extends java.util.LinkedHashMap {
    public static final defpackage.x04 B = null;
    public boolean A;

    static {
            x04 r0 = new x04
            r0.<init>()
            defpackage.x04.B = r0
            r1 = 0
            r0.A = r1
            return
    }

    public x04() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.A = r0
            return
    }

    public static int a(java.lang.Object r4) {
            boolean r0 = r4 instanceof byte[]
            r1 = 0
            if (r0 == 0) goto L1a
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            java.nio.charset.Charset r2 = defpackage.aa3.a
            r2 = r0
        Lb:
            if (r1 >= r0) goto L15
            int r2 = r2 * 31
            r3 = r4[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lb
        L15:
            if (r2 != 0) goto L19
            r4 = 1
            return r4
        L19:
            return r2
        L1a:
            boolean r0 = r4 instanceof defpackage.w93
            if (r0 != 0) goto L23
            int r4 = r4.hashCode()
            return r4
        L23:
            defpackage.e41.t()
            return r1
    }

    public final void b() {
            r0 = this;
            boolean r0 = r0.A
            if (r0 == 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    public final defpackage.x04 c() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            x04 r1 = new x04
            r1.<init>()
            return r1
        Lc:
            x04 r0 = new x04
            r0.<init>(r1)
            r1 = 1
            r0.A = r1
            return r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
            r0 = this;
            r0.b()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            return r1
        L9:
            java.util.Set r1 = super.entrySet()
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L59
            java.util.Map r4 = (java.util.Map) r4
            if (r3 != r4) goto L9
            goto L57
        L9:
            int r0 = r3.size()
            int r1 = r4.size()
            if (r0 == r1) goto L14
            goto L59
        L14:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            boolean r1 = r4.containsKey(r1)
            if (r1 != 0) goto L33
            goto L59
        L33:
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r4.get(r0)
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L50
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            byte[] r1 = (byte[]) r1
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L54
        L50:
            boolean r0 = r1.equals(r0)
        L54:
            if (r0 != 0) goto L1c
            goto L59
        L57:
            r3 = 1
            return r3
        L59:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r3 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            int r2 = a(r2)
            java.lang.Object r1 = r1.getValue()
            int r1 = a(r1)
            r1 = r1 ^ r2
            int r0 = r0 + r1
            goto L9
        L28:
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r1.b()
            java.nio.charset.Charset r0 = defpackage.aa3.a
            r2.getClass()
            r3.getClass()
            java.lang.Object r1 = super.put(r2, r3)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r4) {
            r3 = this;
            r3.b()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.nio.charset.Charset r2 = defpackage.aa3.a
            r1.getClass()
            java.lang.Object r1 = r4.get(r1)
            r1.getClass()
            goto Lb
        L22:
            super.putAll(r4)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            r0.b()
            java.lang.Object r0 = super.remove(r1)
            return r0
    }
}
