package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f63  reason: default package */
/* loaded from: classes.dex */
public abstract class f63 extends jr3 implements eh1, ay2 {
    public p63 Z;

    @Override // defpackage.ay2
    public final boolean d() {
        return true;
    }

    @Override // defpackage.eh1
    public final void dispose() {
        p().m0(this);
    }

    @Override // defpackage.ay2
    public final o74 e() {
        return null;
    }

    public c63 getParent() {
        return p();
    }

    public final p63 p() {
        p63 p63Var = this.Z;
        if (p63Var != null) {
            return p63Var;
        }
        b53.g0("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.jr3
    public final String toString() {
        return getClass().getSimpleName() + '@' + w81.s(this) + "[job@" + w81.s(p()) + ']';
    }
}
