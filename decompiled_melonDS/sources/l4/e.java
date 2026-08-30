package l4;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Appendable {
    public final StringBuilder A;
    public final ArrayList B;
    public final ArrayList L;

    public e() {
        this.A = new StringBuilder(16);
        this.B = new ArrayList();
        this.L = new ArrayList();
        new ArrayList();
    }

    public final void a(char c4) {
        this.A.append(c4);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i10) {
        boolean z10 = charSequence instanceof h;
        StringBuilder sb2 = this.A;
        if (z10) {
            h hVar = (h) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) hVar.B, i2, i10);
            List a10 = j.a(hVar, i2, i10, null);
            if (a10 != null) {
                int size = a10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f fVar = (f) a10.get(i11);
                    this.L.add(new d(fVar.f8791b + length, fVar.f8792c + length, fVar.f8790a, fVar.f8793d));
                }
            }
            return this;
        }
        sb2.append(charSequence, i2, i10);
        return this;
    }

    public final void b(String str) {
        this.A.append(str);
    }

    public final void c(h hVar) {
        StringBuilder sb2 = this.A;
        int length = sb2.length();
        sb2.append(hVar.B);
        List list = hVar.A;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = (f) list.get(i2);
                this.L.add(new d(fVar.f8791b + length, fVar.f8792c + length, fVar.f8790a, fVar.f8793d));
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            r4.a.c("Nothing to pop.");
        }
        ((d) arrayList.remove(arrayList.size() - 1)).f8788c = this.A.length();
    }

    public final void e(int i2) {
        ArrayList arrayList = this.B;
        if (i2 >= arrayList.size()) {
            r4.a.c(i2 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i2) {
            d();
        }
    }

    public final int f(v vVar) {
        d dVar = new d(vVar, this.A.length(), 0, 12);
        ArrayList arrayList = this.B;
        arrayList.add(dVar);
        this.L.add(dVar);
        return arrayList.size() - 1;
    }

    public final int g(j0 j0Var) {
        d dVar = new d(j0Var, this.A.length(), 0, 12);
        ArrayList arrayList = this.B;
        arrayList.add(dVar);
        this.L.add(dVar);
        return arrayList.size() - 1;
    }

    public final h h() {
        StringBuilder sb2 = this.A;
        String sb3 = sb2.toString();
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((d) arrayList.get(i2)).a(sb2.length()));
        }
        return new h(sb3, arrayList2);
    }

    public e(h hVar) {
        this();
        c(hVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof h) {
            c((h) charSequence);
            return this;
        }
        this.A.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) {
        this.A.append(c4);
        return this;
    }
}
