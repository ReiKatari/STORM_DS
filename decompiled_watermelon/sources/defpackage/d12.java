package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d12  reason: default package */
/* loaded from: classes.dex */
public final class d12 extends hp4 {
    public final m06 l;
    public final il6 m;

    public d12(String str, int i) {
        super(str, null, i);
        this.l = m06.h;
        this.m = new il6(new c12(i, str, this));
    }

    @Override // defpackage.hp4, defpackage.h06
    public final ep2 c() {
        return this.l;
    }

    @Override // defpackage.hp4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof h06)) {
                h06 h06Var = (h06) obj;
                if (h06Var.c() != m06.h || !this.a.equals(h06Var.b()) || !b53.x(mh7.o(this), mh7.o(h06Var))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.hp4
    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        v0 v0Var = new v0(this);
        int i2 = 1;
        while (v0Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) v0Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.hp4, defpackage.h06
    public final h06 j(int i) {
        return ((h06[]) this.m.getValue())[i];
    }

    @Override // defpackage.hp4
    public final String toString() {
        return tq0.S0(new lu(5, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
