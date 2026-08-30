package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: e  reason: collision with root package name */
    public static final o0 f13371e = new o0(0, 0, 0, 127);

    /* renamed from: a  reason: collision with root package name */
    public final int f13372a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f13373b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13374c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13375d;

    public o0(int i2, int i10, int i11, int i12) {
        Boolean bool = Boolean.FALSE;
        i2 = (i12 & 1) != 0 ? -1 : i2;
        bool = (i12 & 2) != 0 ? null : bool;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? -1 : i11;
        this.f13372a = i2;
        this.f13373b = bool;
        this.f13374c = i10;
        this.f13375d = i11;
    }

    public final q4.j a(boolean z10) {
        int i2;
        boolean z11;
        int i10;
        int i11 = this.f13372a;
        q4.k kVar = new q4.k(i11);
        q4.i iVar = null;
        if (i11 == -1) {
            kVar = null;
        }
        if (kVar != null) {
            i2 = kVar.f12256a;
        } else {
            i2 = 0;
        }
        int i12 = i2;
        int i13 = 1;
        Boolean bool = this.f13373b;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            z11 = true;
        }
        int i14 = this.f13374c;
        q4.l lVar = new q4.l(i14);
        if (i14 == 0) {
            lVar = null;
        }
        if (lVar != null) {
            i10 = lVar.f12257a;
        } else {
            i10 = 1;
        }
        int i15 = this.f13375d;
        q4.i iVar2 = new q4.i(i15);
        if (i15 != -1) {
            iVar = iVar2;
        }
        if (iVar != null) {
            i13 = iVar.f12248a;
        }
        return new q4.j(z10, i12, z11, i10, i13, s4.b.L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (this.f13372a == o0Var.f13372a && nc.k.a(this.f13373b, o0Var.f13373b) && this.f13374c == o0Var.f13374c && this.f13375d == o0Var.f13375d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = Integer.hashCode(this.f13372a) * 31;
        Boolean bool = this.f13373b;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        return w.d.c(this.f13375d, w.d.c(this.f13374c, (hashCode + i2) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) q4.k.a(this.f13372a)) + ", autoCorrectEnabled=" + this.f13373b + ", keyboardType=" + ((Object) q4.l.a(this.f13374c)) + ", imeAction=" + ((Object) q4.i.a(this.f13375d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
