package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements g {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f12271a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12272b;

    public v(String str, int i2) {
        this.f12271a = new l4.h(str);
        this.f12272b = i2;
    }

    @Override // q4.g
    public final void a(com.google.android.material.datepicker.n nVar) {
        int length;
        int i2 = nVar.R;
        l4.h hVar = this.f12271a;
        int i10 = -1;
        if (i2 != -1) {
            int i11 = nVar.X;
            String str = hVar.B;
            String str2 = hVar.B;
            nVar.d(i2, i11, str);
            if (str2.length() > 0) {
                nVar.e(i2, str2.length() + i2);
            }
        } else {
            int i12 = nVar.B;
            int i13 = nVar.L;
            String str3 = hVar.B;
            String str4 = hVar.B;
            nVar.d(i12, i13, str3);
            if (str4.length() > 0) {
                nVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = nVar.B;
        int i15 = nVar.L;
        if (i14 == i15) {
            i10 = i15;
        }
        int i16 = this.f12272b;
        if (i16 > 0) {
            length = (i10 + i16) - 1;
        } else {
            length = (i10 + i16) - hVar.B.length();
        }
        int g10 = p7.j.g(length, 0, ((dk.a) nVar.Y).b());
        nVar.f(g10, g10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (nc.k.a(this.f12271a.B, vVar.f12271a.B) && this.f12272b == vVar.f12272b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12271a.B.hashCode() * 31) + this.f12272b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f12271a.B);
        sb2.append("', newCursorPosition=");
        return w.d.p(sb2, this.f12272b, ')');
    }
}
