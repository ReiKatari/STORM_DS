package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv0  reason: default package */
/* loaded from: classes.dex */
public final class bv0 {
    public final java.util.Set a;
    public final java.util.Set b;
    public final int c;
    public final defpackage.sv0 d;
    public final java.util.Set e;

    public bv0(java.util.HashSet r1, java.util.HashSet r2, int r3, defpackage.sv0 r4, java.util.HashSet r5) {
            r0 = this;
            r0.<init>()
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.a = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.b = r1
            r0.c = r3
            r0.d = r4
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r5)
            r0.e = r1
            return
    }

    public static defpackage.dk0 a(java.lang.Class r2) {
            dk0 r0 = new dk0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r0.<init>(r2, r1)
            return r0
    }

    public static defpackage.bv0 b(java.lang.Object r8, java.lang.Class r9, java.lang.Class... r10) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r0.add(r9)
            int r9 = r10.length
            r5 = 0
            r2 = r5
        L15:
            if (r2 >= r9) goto L21
            r3 = r10[r2]
            java.lang.String r4 = "Null interface"
            defpackage.ln2.k(r3, r4)
            int r2 = r2 + 1
            goto L15
        L21:
            java.util.Collections.addAll(r0, r10)
            u2 r6 = new u2
            r9 = 2
            r6.<init>(r8, r9)
            bv0 r2 = new bv0
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r1)
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Component<"
            r0.<init>(r1)
            java.util.Set r1 = r2.a
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ">{0, type="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", deps="
            r0.append(r1)
            java.util.Set r2 = r2.b
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
