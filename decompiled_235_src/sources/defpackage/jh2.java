package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jh2 implements no2 {
    public final /* synthetic */ qn2 A;

    public jh2(qn2 qn2Var) {
        this.A = qn2Var;
    }

    @Override // defpackage.no2
    public final ao2 b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jh2) {
            return nb3.k(this.A, ((no2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
