package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya  reason: default package */
/* loaded from: classes.dex */
public final class ya {
    public final /* synthetic */ int a;

    public final Object a(c1 c1Var) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.a) {
            case 0:
                ua uaVar = (ua) c1Var;
                ea0 p = uaVar.p();
                int size = p.size();
                if (size == 0) {
                    bArr = aa3.b;
                } else {
                    byte[] bArr3 = new byte[size];
                    p.d(bArr3, size);
                    bArr = bArr3;
                }
                return new ra(bArr, kn2.d0(uaVar.q().p()), uaVar.q().o(), kn2.d0(uaVar.q().q().n()), uaVar.q().q().o(), uaVar.q().m());
            default:
                jb jbVar = (jb) c1Var;
                ea0 p2 = jbVar.p();
                int size2 = p2.size();
                if (size2 == 0) {
                    bArr2 = aa3.b;
                } else {
                    byte[] bArr4 = new byte[size2];
                    p2.d(bArr4, size2);
                    bArr2 = bArr4;
                }
                return new gb(kn2.d0(jbVar.q().s()), bArr2, jbVar.q().r(), jbVar.q().p());
        }
    }
}
