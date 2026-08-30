package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i41  reason: default package */
/* loaded from: classes.dex */
public final class i41 implements bx6 {
    public final int b;

    public i41(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        i.i("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.bx6
    public final jx6 a(uv uvVar, ww2 ww2Var) {
        if (!(ww2Var instanceof hi6)) {
            return new z74(uvVar, ww2Var);
        }
        if (((hi6) ww2Var).c == i81.MEMORY_CACHE) {
            return new z74(uvVar, ww2Var);
        }
        return new j41(uvVar, ww2Var, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i41) {
            if (this.b == ((i41) obj).b) {
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
