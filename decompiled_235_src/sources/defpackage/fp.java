package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements CharSequence {
    public final List A;
    public final String B;
    public final ArrayList L;
    public final ArrayList R;

    static {
        ap3 ap3Var = p56.a;
    }

    public fp(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.A = list;
        this.B = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ep epVar = (ep) list.get(i);
                Object obj = epVar.a;
                if (obj instanceof nn6) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(epVar);
                } else if (obj instanceof ds4) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(epVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.L = arrayList;
        this.R = arrayList2;
        List d1 = arrayList2 != null ? gt0.d1(arrayList2, new zh2(7)) : null;
        if (d1 != null && !d1.isEmpty()) {
            int i2 = ((ep) gt0.H0(d1)).c;
            o94 o94Var = f93.a;
            o94 o94Var2 = new o94(1);
            o94Var2.a(i2);
            int size2 = d1.size();
            for (int i3 = 1; i3 < size2; i3++) {
                ep epVar2 = (ep) d1.get(i3);
                while (true) {
                    if (o94Var2.b != 0) {
                        int d = o94Var2.d();
                        int i4 = epVar2.b;
                        int i5 = epVar2.c;
                        if (i4 >= d) {
                            o94Var2.e(o94Var2.b - 1);
                        } else if (i5 > d) {
                            q53.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + d);
                        }
                    }
                }
                o94Var2.a(epVar2.c);
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
                ep epVar = (ep) obj;
                if ((epVar.a instanceof pv3) && gp.b(0, i, epVar.b, epVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return yt1.A;
    }

    public final fp b(qn2 qn2Var) {
        dp dpVar = new dp(this);
        ArrayList arrayList = dpVar.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ep epVar = (ep) qn2Var.g(((cp) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new cp(epVar.a, epVar.b, epVar.c, epVar.d));
        }
        return dpVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r2.isEmpty() != false) goto L31;
     */
    @Override // java.lang.CharSequence
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fp subSequence(int i, int i2) {
        boolean z;
        ArrayList arrayList;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q53.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.B;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        fp fpVar = gp.a;
        if (i > i2) {
            q53.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.A;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ep epVar = (ep) list.get(i3);
                int i4 = epVar.b;
                int i5 = epVar.c;
                if (gp.b(i, i2, i4, i5)) {
                    arrayList.add(new ep(epVar.a, Math.max(i, epVar.b) - i, Math.min(i2, i5) - i, epVar.d));
                }
            }
        }
        arrayList = null;
        return new fp(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.B.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        if (nb3.k(this.B, fpVar.B) && nb3.k(this.A, fpVar.A)) {
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

    public /* synthetic */ fp(String str) {
        this(str, yt1.A);
    }

    public fp(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
