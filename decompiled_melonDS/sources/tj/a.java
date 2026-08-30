package tj;

import sj.e;
import vj.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements yj.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f13267a;

    public a(char c4) {
        this.f13267a = c4;
    }

    @Override // yj.a
    public final char a() {
        return this.f13267a;
    }

    @Override // yj.a
    public final int b(e eVar, e eVar2) {
        if (eVar.f12962d || eVar2.f12961c) {
            int i2 = eVar2.f12966h;
            if (i2 % 3 != 0 && (eVar.f12966h + i2) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f12965g >= 2 && eVar2.f12965g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // yj.a
    public final int c() {
        return 1;
    }

    @Override // yj.a
    public final void d(u uVar, u uVar2, int i2) {
        v8.e eVar;
        String.valueOf(this.f13267a);
        if (i2 == 1) {
            eVar = new v8.e();
        } else {
            eVar = new v8.e();
        }
        for (v8.e eVar2 = (v8.e) uVar.f13767f; eVar2 != null && eVar2 != uVar2; eVar2 = (v8.e) eVar2.f13767f) {
            eVar.b(eVar2);
        }
        eVar.j();
        v8.e eVar3 = (v8.e) uVar.f13767f;
        eVar.f13767f = eVar3;
        if (eVar3 != null) {
            eVar3.f13766e = eVar;
        }
        eVar.f13766e = uVar;
        uVar.f13767f = eVar;
        v8.e eVar4 = (v8.e) uVar.f13763b;
        eVar.f13763b = eVar4;
        if (((v8.e) eVar.f13767f) == null) {
            eVar4.f13765d = eVar;
        }
    }

    @Override // yj.a
    public final char e() {
        return this.f13267a;
    }
}
