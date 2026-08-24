package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s71  reason: default package */
/* loaded from: classes.dex */
public final class s71 implements x97 {
    public final int b;

    public s71(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        i.h("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.x97
    public final fa7 a(mw mwVar, a33 a33Var) {
        if (!(a33Var instanceof bu6)) {
            return new qg4(mwVar, a33Var);
        }
        if (((bu6) a33Var).c == zb1.MEMORY_CACHE) {
            return new qg4(mwVar, a33Var);
        }
        return new t71(mwVar, a33Var, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s71) {
            if (this.b == ((s71) obj).b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }
}
