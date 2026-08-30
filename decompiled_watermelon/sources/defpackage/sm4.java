package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm4  reason: default package */
/* loaded from: classes.dex */
public final class sm4 extends tm4 implements lv0 {
    public static final sm4 R = new tm4(fy6.e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [rm4, vm4] */
    @Override // defpackage.tm4
    public final vm4 a() {
        ?? vm4Var = new vm4(this);
        vm4Var.Z = this;
        return vm4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rm4, vm4] */
    @Override // defpackage.tm4
    public final vm4 b() {
        ?? vm4Var = new vm4(this);
        vm4Var.Z = this;
        return vm4Var;
    }

    @Override // defpackage.tm4, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof ew4)) {
            return false;
        }
        return super.containsKey((ew4) obj);
    }

    @Override // defpackage.tm4, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof o67)) {
            return false;
        }
        return super.containsValue((o67) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [tm4, sm4] */
    public final sm4 d(ew4 ew4Var, o67 o67Var) {
        sb u = this.A.u(ew4Var.hashCode(), 0, ew4Var, o67Var);
        if (u == null) {
            return this;
        }
        return new tm4((fy6) u.L, this.B + u.B);
    }

    @Override // defpackage.tm4, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof ew4)) {
            return null;
        }
        return (o67) super.get((ew4) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof ew4)) {
            return obj2;
        }
        return (o67) super.getOrDefault((ew4) obj, (o67) obj2);
    }
}
