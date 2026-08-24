package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv4  reason: default package */
/* loaded from: classes.dex */
public final class xv4 extends yv4 implements hy0 {
    public static final xv4 R = new yv4(ac7.e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [wv4, aw4] */
    @Override // defpackage.yv4
    public final aw4 a() {
        ?? aw4Var = new aw4(this);
        aw4Var.Z = this;
        return aw4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wv4, aw4] */
    @Override // defpackage.yv4
    public final aw4 b() {
        ?? aw4Var = new aw4(this);
        aw4Var.Z = this;
        return aw4Var;
    }

    @Override // defpackage.yv4, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof l55)) {
            return false;
        }
        return super.containsKey((l55) obj);
    }

    @Override // defpackage.yv4, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof nk7)) {
            return false;
        }
        return super.containsValue((nk7) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [yv4, xv4] */
    public final xv4 d(l55 l55Var, nk7 nk7Var) {
        zb u = this.A.u(l55Var, l55Var.hashCode(), 0, nk7Var);
        if (u == null) {
            return this;
        }
        return new yv4((ac7) u.L, this.B + u.B);
    }

    @Override // defpackage.yv4, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof l55)) {
            return null;
        }
        return (nk7) super.get((l55) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof l55)) {
            return obj2;
        }
        return (nk7) super.getOrDefault((l55) obj, (nk7) obj2);
    }
}
