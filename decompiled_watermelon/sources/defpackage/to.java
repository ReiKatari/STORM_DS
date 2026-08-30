package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: to  reason: default package */
/* loaded from: classes.dex */
public final class to implements CharSequence {
    public final List A;
    public final String B;
    public final ArrayList L;
    public final ArrayList R;

    static {
        ci3 ci3Var = ku5.a;
    }

    public to(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.A = list;
        this.B = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                so soVar = (so) list.get(i);
                Object obj = soVar.a;
                if (obj instanceof xb6) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(soVar);
                } else if (obj instanceof bj4) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(soVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.L = arrayList;
        this.R = arrayList2;
        List g1 = arrayList2 != null ? tq0.g1(arrayList2, new hd2(7)) : null;
        if (g1 != null && !g1.isEmpty()) {
            int i2 = ((so) tq0.K0(g1)).c;
            i14 i14Var = x23.a;
            i14 i14Var2 = new i14(1);
            i14Var2.a(i2);
            int size2 = g1.size();
            for (int i3 = 1; i3 < size2; i3++) {
                so soVar2 = (so) g1.get(i3);
                while (true) {
                    if (i14Var2.b != 0) {
                        int d = i14Var2.d();
                        int i4 = soVar2.b;
                        int i5 = soVar2.c;
                        if (i4 >= d) {
                            i14Var2.e(i14Var2.b - 1);
                        } else if (i5 > d) {
                            nz2.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + d);
                        }
                    }
                }
                i14Var2.a(soVar2.c);
            }
        }
    }

    public final List a(int i) {
        List list = this.A;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                so soVar = (so) obj;
                if ((soVar.a instanceof no3) && uo.b(0, i, soVar.b, soVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return pp1.A;
    }

    public final to b(mi2 mi2Var) {
        ro roVar = new ro(this);
        ArrayList arrayList = roVar.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            so soVar = (so) mi2Var.n(((qo) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new qo(soVar.b, soVar.c, soVar.a, soVar.d));
        }
        return roVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r2.isEmpty() != false) goto L31;
     */
    @Override // java.lang.CharSequence
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.to subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
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
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.nz2.a(r1)
        L26:
            java.lang.String r1 = r9.B
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            to r4 = defpackage.uo.a
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.nz2.a(r2)
        L54:
            java.util.List r9 = r9.A
            if (r9 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L66:
            if (r0 >= r3) goto L93
            java.lang.Object r4 = r9.get(r0)
            so r4 = (defpackage.so) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.uo.b(r10, r11, r5, r6)
            if (r5 == 0) goto L90
            so r5 = new so
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r8, r6, r7, r4)
            r2.add(r5)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9a
        L99:
            r2 = 0
        L9a:
            to r9 = new to
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to.subSequence(int, int):to");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.B.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        if (b53.x(this.B, toVar.B) && b53.x(this.A, toVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.B.hashCode() * 31;
        List list = this.A;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.B;
    }

    public /* synthetic */ to(String str) {
        this(str, pp1.A);
    }

    public to(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
