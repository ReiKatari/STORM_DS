package l4;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements CharSequence {
    public final List A;
    public final String B;
    public final ArrayList L;
    public final ArrayList R;

    static {
        p1.a0 a0Var = h0.f8796a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r1.a(r3.f8792c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.A = r9
            r8.B = r10
            r10 = 0
            r0 = 0
            if (r9 == 0) goto L3c
            int r1 = r9.size()
            r2 = r10
            r3 = r0
            r4 = r3
        L12:
            if (r2 >= r1) goto L3e
            java.lang.Object r5 = r9.get(r2)
            l4.f r5 = (l4.f) r5
            java.lang.Object r6 = r5.f8790a
            boolean r7 = r6 instanceof l4.j0
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof l4.v
            if (r6 == 0) goto L39
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L36:
            r4.add(r5)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            r3 = r0
            r4 = r3
        L3e:
            r8.L = r3
            r8.R = r4
            if (r4 == 0) goto L4e
            l4.g r9 = new l4.g
            r9.<init>(r10)
            java.util.List r9 = zb.l.l0(r4, r9)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = zb.l.R(r9)
            l4.f r10 = (l4.f) r10
            int r10 = r10.f8792c
            a1.w r1 = a1.k.f60a
            a1.w r1 = new a1.w
            r2 = 1
            r1.<init>(r2)
            r1.a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            l4.f r3 = (l4.f) r3
        L77:
            int r4 = r1.f112b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f111a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f8791b
            int r7 = r3.f8792c
            if (r6 < r5) goto L8f
            int r4 = r4 + (-1)
            r1.d(r4)
            goto L77
        L8f:
            if (r7 > r5) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = " should be less than or equal to "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r4.a.a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            m9.o.x(r9)
            throw r0
        Lb2:
            int r3 = r3.f8792c
            r1.a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.<init>(java.util.List, java.lang.String):void");
    }

    public final List a(int i2) {
        List list = this.A;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                f fVar = (f) obj;
                if ((fVar.f8790a instanceof p) && j.b(0, i2, fVar.f8791b, fVar.f8792c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return zb.q.A;
    }

    public final h b(mc.l lVar) {
        e eVar = new e(this);
        ArrayList arrayList = eVar.L;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = (f) lVar.k(((d) arrayList.get(i2)).a(Integer.MIN_VALUE));
            arrayList.set(i2, new d(fVar.f8791b, fVar.f8792c, fVar.f8790a, fVar.f8793d));
        }
        return eVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r3.isEmpty() != false) goto L31;
     */
    @Override // java.lang.CharSequence
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.h subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.a.a(r1)
        L26:
            java.lang.String r1 = r10.B
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            l4.h r4 = l4.j.f8826a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4.a.a(r2)
        L54:
            java.util.List r2 = r10.A
            if (r2 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L66:
            if (r0 >= r4) goto L93
            java.lang.Object r5 = r2.get(r0)
            l4.f r5 = (l4.f) r5
            int r6 = r5.f8791b
            int r7 = r5.f8792c
            boolean r6 = l4.j.b(r11, r12, r6, r7)
            if (r6 == 0) goto L90
            l4.f r6 = new l4.f
            java.lang.Object r8 = r5.f8790a
            int r9 = r5.f8791b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f8793d
            r6.<init>(r9, r7, r8, r5)
            r3.add(r6)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9a
        L99:
            r3 = 0
        L9a:
            l4.h r11 = new l4.h
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.subSequence(int, int):l4.h");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.B.charAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (nc.k.a(this.B, hVar.B) && nc.k.a(this.A, hVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.B.hashCode() * 31;
        List list = this.A;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.B;
    }

    public /* synthetic */ h(String str) {
        this(str, zb.q.A);
    }

    public h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
