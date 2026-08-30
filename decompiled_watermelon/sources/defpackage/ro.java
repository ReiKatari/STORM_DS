package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro  reason: default package */
/* loaded from: classes.dex */
public final class ro implements Appendable {
    public final StringBuilder A;
    public final ArrayList B;
    public final ArrayList L;

    public ro() {
        this.A = new StringBuilder(16);
        this.B = new ArrayList();
        this.L = new ArrayList();
        new ArrayList();
    }

    public final void a(to toVar) {
        StringBuilder sb = this.A;
        int length = sb.length();
        sb.append(toVar.B);
        List list = toVar.A;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                so soVar = (so) list.get(i);
                this.L.add(new qo(soVar.b + length, soVar.c + length, soVar.a, soVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof to;
        StringBuilder sb = this.A;
        if (z) {
            to toVar = (to) charSequence;
            int length = sb.length();
            sb.append((CharSequence) toVar.B, i, i2);
            List a = uo.a(toVar, i, i2, null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    so soVar = (so) a.get(i3);
                    this.L.add(new qo(soVar.b + length, soVar.c + length, soVar.a, soVar.d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    public final void b(String str) {
        this.A.append(str);
    }

    public final void c() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            nz2.c("Nothing to pop.");
        }
        ((qo) arrayList.remove(arrayList.size() - 1)).c = this.A.length();
    }

    public final void d(int i) {
        ArrayList arrayList = this.B;
        if (i >= arrayList.size()) {
            nz2.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            c();
        }
    }

    public final int e(bj4 bj4Var) {
        qo qoVar = new qo(bj4Var, this.A.length(), 0, 12);
        ArrayList arrayList = this.B;
        arrayList.add(qoVar);
        this.L.add(qoVar);
        return arrayList.size() - 1;
    }

    public final to f() {
        StringBuilder sb = this.A;
        String sb2 = sb.toString();
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((qo) arrayList.get(i)).a(sb.length()));
        }
        return new to(sb2, arrayList2);
    }

    public ro(to toVar) {
        this();
        a(toVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof to) {
            a((to) charSequence);
            return this;
        }
        this.A.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.A.append(c);
        return this;
    }
}
