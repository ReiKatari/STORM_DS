package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12242a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12243b;

    public e(int i2, int i10) {
        boolean z10;
        this.f12242a = i2;
        this.f12243b = i10;
        if (i2 >= 0 && i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r4.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i10 + " respectively.");
        }
    }

    @Override // q4.g
    public final void a(com.google.android.material.datepicker.n nVar) {
        int i2 = nVar.L;
        dk.a aVar = (dk.a) nVar.Y;
        int i10 = this.f12243b;
        int i11 = i2 + i10;
        if (((i2 ^ i11) & (i10 ^ i11)) < 0) {
            i11 = aVar.b();
        }
        nVar.a(nVar.L, Math.min(i11, aVar.b()));
        int i12 = nVar.B;
        int i13 = this.f12242a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        nVar.a(Math.max(0, i14), nVar.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f12242a == eVar.f12242a && this.f12243b == eVar.f12243b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12242a * 31) + this.f12243b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f12242a);
        sb2.append(", lengthAfterCursor=");
        return w.d.p(sb2, this.f12243b, ')');
    }
}
