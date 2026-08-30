package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12246a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12247b;

    public f(int i2, int i10) {
        boolean z10;
        this.f12246a = i2;
        this.f12247b = i10;
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
        int i2 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < this.f12246a) {
                int i12 = i11 + 1;
                int i13 = nVar.B;
                if (i13 > i12) {
                    char b10 = nVar.b((i13 - i12) - 1);
                    char b11 = nVar.b(nVar.B - i12);
                    if (Character.isHighSurrogate(b10) && Character.isLowSurrogate(b11)) {
                        i11 += 2;
                    } else {
                        i11 = i12;
                    }
                    i10++;
                } else {
                    i11 = i13;
                    break;
                }
            } else {
                break;
            }
        }
        int i14 = 0;
        while (true) {
            if (i2 >= this.f12247b) {
                break;
            }
            int i15 = i14 + 1;
            int i16 = nVar.L;
            dk.a aVar = (dk.a) nVar.Y;
            if (i16 + i15 < aVar.b()) {
                char b12 = nVar.b((nVar.L + i15) - 1);
                char b13 = nVar.b(nVar.L + i15);
                if (Character.isHighSurrogate(b12) && Character.isLowSurrogate(b13)) {
                    i14 += 2;
                } else {
                    i14 = i15;
                }
                i2++;
            } else {
                i14 = aVar.b() - nVar.L;
                break;
            }
        }
        int i17 = nVar.L;
        nVar.a(i17, i14 + i17);
        int i18 = nVar.B;
        nVar.a(i18 - i11, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12246a == fVar.f12246a && this.f12247b == fVar.f12247b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12246a * 31) + this.f12247b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f12246a);
        sb2.append(", lengthAfterCursor=");
        return w.d.p(sb2, this.f12247b, ')');
    }
}
