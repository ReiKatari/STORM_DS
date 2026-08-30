package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f12206a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12207b;

    public a(String str, int i2) {
        this(new l4.h(str), i2);
    }

    @Override // q4.g
    public final void a(com.google.android.material.datepicker.n nVar) {
        int length;
        int i2 = nVar.R;
        l4.h hVar = this.f12206a;
        int i10 = -1;
        if (i2 != -1) {
            nVar.d(i2, nVar.X, hVar.B);
        } else {
            nVar.d(nVar.B, nVar.L, hVar.B);
        }
        int i11 = nVar.B;
        int i12 = nVar.L;
        if (i11 == i12) {
            i10 = i12;
        }
        int i13 = this.f12207b;
        if (i13 > 0) {
            length = (i10 + i13) - 1;
        } else {
            length = (i10 + i13) - hVar.B.length();
        }
        int g10 = p7.j.g(length, 0, ((dk.a) nVar.Y).b());
        nVar.f(g10, g10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (nc.k.a(this.f12206a.B, aVar.f12206a.B) && this.f12207b == aVar.f12207b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12206a.B.hashCode() * 31) + this.f12207b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f12206a.B);
        sb2.append("', newCursorPosition=");
        return w.d.p(sb2, this.f12207b, ')');
    }

    public a(l4.h hVar, int i2) {
        this.f12206a = hVar;
        this.f12207b = i2;
    }
}
