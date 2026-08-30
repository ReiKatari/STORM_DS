package sj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final vj.b f12951a = new v8.e();

    @Override // xj.a
    public final vj.a d() {
        return this.f12951a;
    }

    @Override // xj.a
    public final a g(g gVar) {
        char charAt;
        int i2 = gVar.f12975e;
        CharSequence charSequence = gVar.f12971a;
        if (gVar.f12977g < 4 && i2 < charSequence.length() && charSequence.charAt(i2) == '>') {
            int i10 = gVar.f12973c + gVar.f12977g;
            int i11 = i10 + 1;
            CharSequence charSequence2 = gVar.f12971a;
            int i12 = i2 + 1;
            if (i12 < charSequence2.length() && ((charAt = charSequence2.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new a(-1, false, i11);
        }
        return null;
    }
}
