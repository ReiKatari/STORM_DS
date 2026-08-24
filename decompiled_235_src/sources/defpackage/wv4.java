package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv4  reason: default package */
/* loaded from: classes.dex */
public final class wv4 extends aw4 {
    public xv4 Z;

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof l55)) {
            return false;
        }
        return super.containsKey((l55) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof nk7)) {
            return false;
        }
        return super.containsValue((nk7) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [yv4] */
    @Override // defpackage.aw4
    /* renamed from: d */
    public final xv4 b() {
        ac7 ac7Var = this.L;
        xv4 xv4Var = this.Z;
        ac7 ac7Var2 = xv4Var.A;
        xv4 xv4Var2 = xv4Var;
        if (ac7Var != ac7Var2) {
            this.B = new jd1(15);
            xv4Var2 = new yv4(this.L, this.Y);
        }
        this.Z = xv4Var2;
        return xv4Var2;
    }

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof l55)) {
            return null;
        }
        return (nk7) super.remove((l55) obj);
    }
}
