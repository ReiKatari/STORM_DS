package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rm4  reason: default package */
/* loaded from: classes.dex */
public final class rm4 extends vm4 {
    public sm4 Z;

    @Override // defpackage.vm4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof ew4)) {
            return false;
        }
        return super.containsKey((ew4) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof o67)) {
            return false;
        }
        return super.containsValue((o67) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hm1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [tm4] */
    @Override // defpackage.vm4
    /* renamed from: d */
    public final sm4 b() {
        fy6 fy6Var = this.L;
        sm4 sm4Var = this.Z;
        fy6 fy6Var2 = sm4Var.A;
        sm4 sm4Var2 = sm4Var;
        if (fy6Var != fy6Var2) {
            this.B = new Object();
            sm4Var2 = new tm4(this.L, this.Y);
        }
        this.Z = sm4Var2;
        return sm4Var2;
    }

    @Override // defpackage.vm4, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.vm4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof ew4)) {
            return null;
        }
        return (o67) super.remove((ew4) obj);
    }
}
