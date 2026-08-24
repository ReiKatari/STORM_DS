package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public final class dp implements Appendable {
    public final StringBuilder A;
    public final ArrayList B;
    public final ArrayList L;

    public dp() {
        this.A = new StringBuilder(16);
        this.B = new ArrayList();
        this.L = new ArrayList();
        new ArrayList();
    }

    public final void a(fp fpVar) {
        StringBuilder sb = this.A;
        int length = sb.length();
        sb.append(fpVar.B);
        List list = fpVar.A;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ep epVar = (ep) list.get(i);
                this.L.add(new cp(epVar.a, epVar.b + length, epVar.c + length, epVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof fp;
        StringBuilder sb = this.A;
        if (z) {
            fp fpVar = (fp) charSequence;
            int length = sb.length();
            sb.append((CharSequence) fpVar.B, i, i2);
            List a = gp.a(fpVar, i, i2, null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ep epVar = (ep) a.get(i3);
                    this.L.add(new cp(epVar.a, epVar.b + length, epVar.c + length, epVar.d));
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
            q53.c("Nothing to pop.");
        }
        ((cp) arrayList.remove(arrayList.size() - 1)).c = this.A.length();
    }

    public final void d(int i) {
        ArrayList arrayList = this.B;
        if (i >= arrayList.size()) {
            q53.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            c();
        }
    }

    public final int e(ds4 ds4Var) {
        cp cpVar = new cp(ds4Var, this.A.length(), 0, 12);
        ArrayList arrayList = this.B;
        arrayList.add(cpVar);
        this.L.add(cpVar);
        return arrayList.size() - 1;
    }

    public final fp f() {
        StringBuilder sb = this.A;
        String sb2 = sb.toString();
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((cp) arrayList.get(i)).a(sb.length()));
        }
        return new fp(sb2, arrayList2);
    }

    public dp(fp fpVar) {
        this();
        a(fpVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof fp) {
            a((fp) charSequence);
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
