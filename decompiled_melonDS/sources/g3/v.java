package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements nc.g {
    public final /* synthetic */ mc.l A;

    public v(mc.l lVar) {
        this.A = lVar;
    }

    @Override // nc.g
    public final yb.d b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return nc.k.a(this.A, ((nc.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
