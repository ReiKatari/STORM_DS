package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh1  reason: default package */
/* loaded from: classes.dex */
public final class vh1 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(g30.class, yq2.class, o52.class, ys2.class, os6.class, ep3.class, ey2.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final jo1 j;
    public final List k;
    public final th1 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(g30.class, new h30(0));
        hashMap.put(yq2.class, new h30(2));
        hashMap.put(o52.class, new h30(1));
        hashMap.put(ys2.class, new h30(3));
        hashMap.put(os6.class, new h30(6));
        hashMap.put(ep3.class, new h30(5));
        hashMap.put(ey2.class, new h30(4));
        q = Collections.unmodifiableMap(hashMap);
    }

    public vh1(ArrayList arrayList, jo1 jo1Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = jo1Var;
        this.k = arrayList2;
        th1 th1Var = new th1(0);
        this.l = th1Var;
        arrayList3.add(th1Var);
        linkedHashSet.add(th1Var);
    }

    public final void a(t tVar) {
        while (!h().b(tVar.d())) {
            e(h());
        }
        h().d().b(tVar.d());
        this.n.add(tVar);
        this.o.add(tVar);
    }

    public final void b(aj4 aj4Var) {
        ro3 ro3Var = aj4Var.b;
        ro3Var.a();
        ArrayList arrayList = ro3Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oo3 oo3Var = (oo3) obj;
            vi4 vi4Var = aj4Var.a;
            oo3Var.j();
            vy0 vy0Var = (vy0) vi4Var.e;
            oo3Var.e = vy0Var;
            if (vy0Var != null) {
                vy0Var.f = oo3Var;
            }
            oo3Var.f = vi4Var;
            vi4Var.e = oo3Var;
            vy0 vy0Var2 = (vy0) vi4Var.b;
            oo3Var.b = vy0Var2;
            if (((vy0) oo3Var.e) == null) {
                vy0Var2.c = oo3Var;
            }
            String str = oo3Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, oo3Var);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(this.b + 1, charSequence.length());
            int i = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            subSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.a.charAt(this.b);
        int i = this.b;
        if (charAt == '\t') {
            this.b = i + 1;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
            return;
        }
        this.b = i + 1;
        this.c++;
    }

    public final void e(t tVar) {
        if (h() == tVar) {
            ArrayList arrayList = this.n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (tVar instanceof aj4) {
            b((aj4) tVar);
        }
        tVar.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((t) list.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.h = false;
                    break;
                } else {
                    i++;
                    i2++;
                }
            } else {
                i++;
                i2 += 4 - (i2 % 4);
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final t h() {
        ArrayList arrayList = this.n;
        return (t) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c9, code lost:
        if (r12 < 1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d1, code lost:
        if (r6 >= r11.length()) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
        r12 = r11.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d9, code lost:
        if (r12 == '\t') goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01dd, code lost:
        if (r12 == ' ') goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
        r12 = r11.subSequence(r5, r15).toString();
        r14 = new defpackage.vy0();
        r14.h = java.lang.Integer.parseInt(r12);
        r14.i = r4;
        r4 = new defpackage.fp3(r14, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0493, code lost:
        if (r5.length() == 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05f6, code lost:
        k(r23.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0184, code lost:
        if (r4.length() == 0) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0516  */
    /* JADX WARN: Type inference failed for: r14v17, types: [ff4, ep3, vy0] */
    /* JADX WARN: Type inference failed for: r6v41, types: [ep3, vy0, c70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh1.i(java.lang.String):void");
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            }
            d();
        }
        if (i2 > i) {
            this.b--;
            this.c = i;
            this.d = true;
            return;
        }
        this.d = false;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            }
            d();
        }
        this.d = false;
    }
}
