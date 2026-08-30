package sj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final vj.f f12985a;

    /* renamed from: b  reason: collision with root package name */
    public String f12986b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f12987c;

    /* JADX WARN: Type inference failed for: r0v0, types: [vj.f, v8.e] */
    public h(char c4, int i2, int i10) {
        ?? eVar = new v8.e();
        this.f12985a = eVar;
        this.f12987c = new StringBuilder();
        eVar.f13845g = c4;
        eVar.f13846h = i2;
        eVar.f13847i = i10;
    }

    @Override // xj.a
    public final void a(CharSequence charSequence) {
        if (this.f12986b == null) {
            this.f12986b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f12987c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // xj.a
    public final void c() {
        String a10 = uj.a.a(this.f12986b.trim());
        vj.f fVar = this.f12985a;
        fVar.f13848j = a10;
        fVar.f13849k = this.f12987c.toString();
    }

    @Override // xj.a
    public final vj.a d() {
        return this.f12985a;
    }

    @Override // xj.a
    public final a g(g gVar) {
        int i2 = gVar.f12975e;
        int i10 = gVar.f12972b;
        CharSequence charSequence = gVar.f12971a;
        int i11 = gVar.f12977g;
        vj.f fVar = this.f12985a;
        if (i11 < 4) {
            char c4 = fVar.f13845g;
            int i12 = fVar.f13846h;
            int F = p7.j.F(c4, i2, charSequence.length(), charSequence) - i2;
            if (F >= i12 && p7.j.G(charSequence, i2 + F, charSequence.length()) == charSequence.length()) {
                return new a(-1, true, -1);
            }
        }
        int length = charSequence.length();
        for (int i13 = fVar.f13847i; i13 > 0 && i10 < length && charSequence.charAt(i10) == ' '; i13--) {
            i10++;
        }
        return a.a(i10);
    }
}
